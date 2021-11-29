package org.generation.italy.utils;

public class CalcoliHelper {
	private CalcoliHelper() {
		//costruttore privato
	}
	public static int sommaInteri(int a,int b) {
		return a+b;
	}
	public static double sommaDouble(double a,double b) {
		return a+b;
	}
	public static int differenzaInteri(int a,int b) {
		return a-b;
	}
	public static double differenzaDouble(double a,double b) {
		return a-b;
	}
	public static int prodottoInteri(int a,int b) {
		return a*b;
	}
	public static double prodottoDouble(double a,double b) {
		return a*b;
	}
	public static int moduloIntero(int a) {
		if(a>=0) {
			return a;
		}else {
			return -a;
		}
		
	}
	public static double moduloDouble(double a) {
		if(a>=0) {
			return a;
		}else {
			return -a;
		}
	}
	public static int minimoInteri(int a,int b) {
		if (a>=b){
			return b;
		}else {
			return a;
		}
	}
	public static double minimoDouble(double a,double b) {
		if (a>=b){
			return b;
		}else {
			return a;
		}
	}
	public static int massimoInteri(int a,int b) {
		if (a>=b){
			return a;
		}else {
			return b;
		}
	}
	public static double massimoDouble(double a,double b) {
		if (a>=b){
			return a;
		}else {
			return b;
		}
	}
}

