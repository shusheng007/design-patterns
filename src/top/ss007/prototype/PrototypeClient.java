package top.ss007.prototype;

import java.util.List;

public class PrototypeClient {
    public void getReport(){
        //创建原型
        Report reportPrototype = new Report();
        //耗费资源的操作
        reportPrototype.loadData();

        //使用原型对象构建新的对象
        Report reportWithTitle = (Report) reportPrototype.copy();
        List<String> reportContent= reportWithTitle.getContents();
        reportContent.add(0,"《江城子·密州出猎》");
        reportContent.add(1,"----------------------------------------------------------");

        for (String s : reportContent) {
            System.out.println(s);
        }

    }
}
