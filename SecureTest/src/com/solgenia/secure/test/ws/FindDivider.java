package com.solgenia.secure.test.ws;

public class FindDivider {

   static int numberDivider(double y){
      double givenNumber=y;
      int dividerMax=(int) Math.sqrt(givenNumber);
      int divider=1;
      for(int i=1; i<=dividerMax; i++){
         if(givenNumber%i==0){
            divider++;
         }
      }
      return divider;

   }

}
