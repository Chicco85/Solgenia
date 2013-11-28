package com.solgenia.secure.test.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface PrimeNumberInterface {

   @WebMethod
   public boolean isPrime(int x);

}
