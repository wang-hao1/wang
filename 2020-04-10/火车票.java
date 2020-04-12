package com.diy.demo;

import java.beans.FeatureDescriptor;

/**
 * 
 * @author WH
 * @date   2020年4月10日
 */
public class Demo5 {

	public static void main(String[] args) {
	String username="王浩";//username:姓名
    String id="413026199503264567";//id:身份证号
    double admission=127.5;//admission:票价
    String roundtrip="G663";//roundtrip:车次
    String time="2016年1月27日10:31";//time:时间
    String ticket="A19";//ticket:检票口
    String departureStation="南昌西";//departureStation:出发站
    String terminus="萍乡北";//terminus:终点站
    
    System.out.println("姓名："+username);
    System.out.println("身份证号:"+id);
    System.out.println("票价:"+admission);    
    System.out.println("车次:"+roundtrip);
    System.out.println("时间:"+time);
    System.out.println("检票口:"+ticket);
    System.out.println("出发站:"+departureStation);
    System.out.println("终点站:"+terminus);
	}

}
