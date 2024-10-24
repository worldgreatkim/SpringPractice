package kr.co.softcampus.main;


import kr.co.softcampus.benas.HelloWorld;
import kr.co.softcampus.benas.HelloWorldEn;
import kr.co.softcampus.benas.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		HelloWorld hello1 = new HelloWorldEn();
		
		callMethod(hello1);
		
		HelloWorld hello2 = new HelloWorldEn();
		callMethod(hello2);
//		
//		HelloWorld hello1 = new HelloWorldKo();
//		callMethod(hello1);
//		HelloWorld hello2 = new HelloWorldKo();
//		callMethod(hello2);

	}
	
	public static void callMethod(HelloWorld beans) {
		beans.sayHello();
	}

}
