package org.testdesignpattern.factorymethod.htmlImpl;

import org.testdesignpattern.factorymethod.ExportFile;

public class ExportFinancialHtmlFile implements ExportFile{
    @Override
    public boolean export(String data) {
        /**
         * 业务逻辑
         */
        System.out.println("导出财务版HTML文件");
        return true;
    }
}
