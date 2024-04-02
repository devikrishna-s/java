import java.util.*;
class Employee
{
int empid;
String name;
double salary;
String address;
Employee(int eid,String n,double sal,String add){
empid=eid;
name=n;
salary=sal;
address=add;
}
}
class Teacher extends Employee
{
String dep;
String sub;
Teacher(int eid,String n,double slry,String add,String d,String sub)
{
super(eid,n,slry,add);
dep=d;
this.sub=sub;
}
void display()
{
System.out.println("-----------employee details---------------");
System.out.println("employee id:"+empid);
System.out.println("employee name:"+name);
System.out.println("employee salary:"+salary);
System.out.println("employee dep:"+dep);
System.out.println("employee subject:"+sub);
System.out.println("employee address:"+address);
}
}
class EmpMain
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Devikrishna S \n Roll no:26 \n 02-april-2024");
System.out.println("enter employee name:");
String empname=s.nextLine();
System.out.println("enter employee id:");
int empid=s.nextInt();
System.out.println("enter employee salary:");
double empsal=s.nextDouble();
s.nextLine();
System.out.println("enter employee address:");
String empadd=s.nextLine();
System.out.println("enter  department:");
String empdep=s.nextLine();
System.out.println("enter  subject:");
String empsub=s.nextLine();
Teacher t=new Teacher(empid,empname,empsal,empadd,empdep,empsub);
t.display();
}
}

