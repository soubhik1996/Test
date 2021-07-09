/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.test;

/**
 *
 * @author SOUBHIK
 */
import java.util.*;
class parent{
	void hair(){
		System.out.println("color is black ......");
	}
}
public class Inheritence extends parent {

	void eye_color(){
		System.out.println("color is Brown ......");

	}
	public static void main(String[] args) {
		Inheritence astha1 = new Inheritence();
		System.out.println("for Parent class ");
		astha1.hair();
		System.out.println("for Inheritace class ");
		astha1.eye_color();
	

	}

}

