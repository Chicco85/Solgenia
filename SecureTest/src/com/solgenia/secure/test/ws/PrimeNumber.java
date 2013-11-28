package com.solgenia.secure.test.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="com.solgenia.secure.test.ws.PrimeNumberInterface")
public class PrimeNumber implements PrimeNumberInterface{

   @Override
   @WebMethod
   public boolean isPrime(int x) {
      int number = x;
      int dividerNumber = FindDivider.numberDivider(number);
      boolean result = true;
      if (dividerNumber > 2) {
         result = false;
      }
      return result;
   }

}
