package 文件操作;

import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * 合并单元格
 */
public class Excel {
    public static void mergeRegion(String path, int firstRow, int lastRow, int firstCol, int lastCol) throws IOException {
        XSSFWorkbook workbook;//  Excel的文档对象
        XSSFSheet sheet;//Excel的表单
        XSSFCell cell; //Excel的格子单元
        ArrayList<ArrayList<String>> xlist = new ArrayList();
        ArrayList list = new ArrayList<>();

        InputStream iStream = new FileInputStream(path);

        workbook = new XSSFWorkbook(iStream);

        sheet = workbook.getSheetAt(0);

        sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstCol, lastCol));

        FileOutputStream out = new FileOutputStream(path);
        workbook.write(out);
    }
}
