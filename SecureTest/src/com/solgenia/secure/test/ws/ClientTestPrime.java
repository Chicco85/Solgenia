package com.solgenia.secure.test.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

public class ClientTestPrime {

   static {
      //for localhost testing only
      javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
      new javax.net.ssl.HostnameVerifier(){

          @Override
         public boolean verify(String hostname,
                  javax.net.ssl.SSLSession sslSession) {
              if (hostname.equals("localhost")) {
                  return true;
              }
              return false;
          }
      });
  }

   public static void main(String[] args) throws MalformedURLException {
      URL url=new URL("https://localhost:8443/SecureTest/PrimeNumber?wsdl");
      QName qName=new QName("http://ws.test.secure.solgenia.com", "PrimeNumber");
      int number;
      Service service=Service.create(url, qName);
      PrimeNumberInterface eif=service.getPort(PrimeNumberInterface.class);
      ((BindingProvider) eif).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "Walter");
      ((BindingProvider) eif).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "Mariani");
      for(int i=4; i<100; i++){
         if(eif.isPrime(i)){
            number=i;
            System.out.println("Il numero "+number+" è un numero primo");
         }else{
            number=i;
            System.out.println("Il numero "+number+" non è un numero primo");
         }
      }
   }

}
