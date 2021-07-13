package 文件操作;

import java.util.ArrayList;

public class excelTest {
    public static void main(String[] args) throws Exception {
        ArrayList list=new ArrayList();
        String path0="C:\\Users\\Administrator\\Desktop\\LDB/李冬博.xlsx";
        list=excel.readdata(path0);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
