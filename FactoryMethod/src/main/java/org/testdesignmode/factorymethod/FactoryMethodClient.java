package org.testdesignmode.factorymethod;

import org.testdesignmode.factorymethod.htmlImpl.ExportHtmlFactory;

/**
 * 客户端角色类源代码
 * @author pxy
 *
 */
public class FactoryMethodClient {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String data = "";
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile ef = exportFactory.factory("financial");
        ef.export(data);
    }
}
