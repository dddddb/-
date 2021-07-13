package 文件操作;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * 读取excel
 */
public class readExcel {


    static int row = 0;
    static int column = 0;

    public static ArrayList readData(String path) throws Exception// 读取字符串数据

    {

        XSSFWorkbook workbook;//  Excel的文档对象
        XSSFSheet sheet;//Excel的表单
        XSSFCell cell; //Excel的格子单元
        ArrayList<ArrayList<String>> xlist = new ArrayList();
        ArrayList list = new ArrayList<>();

        InputStream iStream = new FileInputStream(path);

        workbook = new XSSFWorkbook(iStream);

        sheet = workbook.getSheetAt(0);

        row = sheet.getLastRowNum() + 1;// 获取行数

        column = sheet.getRow(0).getPhysicalNumberOfCells();// 获取列数

        for (int i = 0; i < row; i++) {// 行

            for (int j = 0; j < column; j++) {// 列

                XSSFRow row1 = sheet.getRow(i);

                XSSFCell cell1 = row1.getCell(j); // 获取对应元素

                CellType str0 = cell1.getCellType();

                switch (str0) {

                    case STRING: // 字符串类型

                        String str = cell1.getStringCellValue();

                        list.add(str);

                        break;

                    case BOOLEAN: // 布尔类型

                        boolean str1 = cell1.getBooleanCellValue();

                        list.add(str1);

                        break;

                    case NUMERIC: // 数值类型

                        double str2 = cell1.getNumericCellValue();

                        list.add(str2);

                        break;

                }

            }
            xlist.add(list);
            list = new ArrayList<>();

        }

        return xlist;

    }

}
