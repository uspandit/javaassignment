import java.util.*;

class arithmetic{
public static void main(String[]args){
Scanner ob=new Scanner(System.in);
System.out.println("enter numbers you want to apply all main arithmetic operations");
int a=ob.nextInt();
int b=ob.nextInt();
int z=a+b;
int y=a-b;
float x=(float)a/(float)b;
int w=a*b;
System.out.println("addition is"+ z+ " \nsubtraction is" +y+ "\nmultiplication is" + w+ "\ndivide is" +x);

}

}