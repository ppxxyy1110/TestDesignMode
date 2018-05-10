package org.testdesignpattern.factorymethod.pdfImpl;

import org.testdesignpattern.factorymethod.ExportFile;

public class ExportStandardPdfFile implements ExportFile{
    @Override
    public boolean export(String data) {
        /**
         * 业务逻辑
         */
        System.out.println("导出标准PDF文件");
        return true;
    }
}
