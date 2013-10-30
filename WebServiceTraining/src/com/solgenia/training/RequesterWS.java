package com.solgenia.training;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class RequesterWS {

   public static void main(String[] args) throws Exception {
      URL url=new URL("http://localhost:9876/ts?wsdl");
      QName qName=new QName("http://training.solgenia.com/", "ServiceImplementationBeanService");
      Service service=Service.create(url, qName);
      ServiceEndpointInterface endpointInterface=service.getPort(ServiceEndpointInterface.class);
      System.out.println(endpointInterface.getTimeAsString());
      System.out.println(endpointInterface.getTimeAsElapsed());
   }

}
