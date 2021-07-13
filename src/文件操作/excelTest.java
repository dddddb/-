package 文件操作;


import java.util.ArrayList;

public class excelTest {
    public static void main(String[] args) throws Exception {
        ArrayList list=new ArrayList();
        String path0="C:\\Users\\Administrator\\Desktop\\1.xlsx";
        Excel.mergeRegion(path0,1,2,0,0);
        list = readExcel.readData(path0);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }


}
