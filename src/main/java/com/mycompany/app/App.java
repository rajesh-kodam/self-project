package com.mycompany.app;

import java.util.Scanner;
class App {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int amount = 15000 ;
int a = 1216 ;
String b = "Savings";
String c = "Current";
String d = "Balance_enquiry";
int balance;
String n = "Yes" ;

System.out.println("Wellcome to Bank of Warangal");
System.out.println("Insert your card");

try {Thread.sleep(3000);} catch (Exception o) {}

System.out.println("Mr Kodam.Rajesh");
System.out.println("Enter password");
int e = sc.nextInt();
if (a == e) {
System.out.println("Savings");
System.out.println("Current");
}
else {
System.out.println("Incorrect password");
}
String f = sc.next();

if (f.equals(b)) {
System.out.println("Deposit");
System.out.println("Withdraw");
System.out.println("Balance_enquiry");
}
if (f.equals(c)) {
System.out.println("This is not a Current account");
}

String i = sc.next();

switch (i) {
case "Deposit" :
System.out.println("Enter amount");
int j = sc.nextInt();
if (j > 0) {
balance = amount + j ;

System.out.println("Would you like to print a receipt");
System.out.println("Yes                       No");

String k = sc.next();
if (k.equals(n)) {

System.out.println("Printing your receipt  . . . . . . . . . . . . .");

try {Thread.sleep(2600);} catch (Exception o) {}

System.out.println("Please take your receipt");
}
else { System.out.println("Thank you Mr.Rajesh you have Deposited :  " + j);
System.out.println("________________________________________________");

System.out.println("Your Total Available Balance is : " + balance);
}
}
break ;

case "Withdraw" :

System.out.println("Enter amount");
int g = sc.nextInt();

if (amount < g) {
System.out.println("No available balance");
}
else {
try {Thread.sleep(2600);} catch (Exception o) {}

System.out.println("Please collect cash");

System.out.println("Would you like to print a receipt");
System.out.println("yes                       No");

String l = sc.next();

if (l.equals(n)) {
System.out.println("Printing your receipt  . . . . . . . . . . . . .");

try {Thread.sleep(2600);} catch (Exception o) {}

System.out.println("Please take your receipt");
}
else {
System.out.println("Thank you Mr.Rajesh you have Withdrawn :  " + g);
System.out.println("                   &                     ");
System.out.println("Your Remaining Avaialable Balance is  " + (amount - g));
}
}

break;
case "Balance_enquiry" :
System.out.println("Would you like to print a receipt");
System.out.println("yes                       No");

String m = sc.next();

if (m.equals(n)) {
System.out.println("Printing your receipt  . . . . . . . . . . . . .");

try {Thread.sleep(2600);} catch (Exception o) {}

System.out.println("Please take your receipt");
}
else {

System.out.println("Thank you Mr.Rajesh your Total Available Balance is :  " + amount);
}
break ;
}
}
}
