package com.bean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Validation {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Login login = new Login();
        login.setUsername("admin");
        login.setPassword("admin");

        if(login.getUsername()=="admin"&&login.getPassword()=="admin"){
            System.out.println("enter the choice");
            System.out.println("1: select all reviews");
            System.out.println("2: see highest review");
            System.out.println("3: see overall top 10 restaurants");
            int choice = Integer.parseInt(br.readLine());

            switch(choice){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;



            }

        }else {
            int choice1 = Integer.parseInt(br.readLine());

            switch (choice1) {
                case 1:
                    System.out.println("create a review");
                    break;
                case 2:
                    System.out.println("select your review");
                    break;
                case 3:
                    System.out.println("update your review");
                    break;
                case 4:
                    System.out.println("delete your review");
                    break;
            }
        }
    }
}
