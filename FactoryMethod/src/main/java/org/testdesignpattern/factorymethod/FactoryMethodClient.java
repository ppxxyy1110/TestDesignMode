package org.testdesignpattern.factorymethod;

import org.testdesignpattern.factorymethod.htmlImpl.ExportHtmlFactory;

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
