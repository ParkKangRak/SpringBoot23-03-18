package com.knight.hellosping.codingtest;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam01 {

  public static ArrayList<ArrayList<Integer>> soulution(int num) {

    return null;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);



    Exam01 value = new Exam01();

    ArrayList<ArrayList<Integer>> pas = new ArrayList<>();
    ArrayList<Integer> pasValue1 = new ArrayList<>();
    ArrayList<Integer> pasValue2 = new ArrayList<>();
    ArrayList<Integer> pasValue3 = new ArrayList<>();
    ArrayList<Integer> pasValue4 = new ArrayList<>();
    ArrayList<Integer> pasValue5 = new ArrayList<>();


    pasValue1.add(1);
    pasValue2.add(1); pasValue2.add(1);
    pasValue3.add(1); pasValue3.add(2); pasValue3.add(1);
    pasValue4.add(1); pasValue4.add(3); pasValue4.add(3); pasValue4.add(1);
    pasValue5.add(1); pasValue5.add(4); pasValue5.add(6); pasValue5.add(4); pasValue5.add(1);

    pas.add(pasValue1); pas.add(pasValue2); pas.add(pasValue3); pas.add(pasValue4); pas.add(pasValue5);

    System.out.println(pas);





  }

}
