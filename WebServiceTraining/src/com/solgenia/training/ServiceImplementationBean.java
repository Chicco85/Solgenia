package com.solgenia.training;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface="com.solgenia.training.ServiceEndpointInterface")
public class ServiceImplementationBean implements ServiceEndpointInterface{
   @Override
   public String getTimeAsString(){ return new Date().toString();}
   @Override
   public long getTimeAsElapsed(){return new Date().getTime();}

}
