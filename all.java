//Author  : Deepansh Dubey.
//Date      : 30/07/2020.
//Purpose: To check different types of numbers in java.


import java.io.*;
class all
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
long a,b,c,d,n,m,o,y,x,f,j,s,z,i,a2,b2,c2,i2;
int ch;
System.out.println("\n\tOPTION MENU \n");
System.out.println("1)  Check Palindrome");
System.out.println("2)  Perfect Number");
System.out.println("3)  Neon Number");
System.out.println("4)  Armstrong Number");
System.out.println("5)  Prime Number");
System.out.println("6)  Even and Odd");
System.out.println("7)  Roots of Quadratic Equation");
System.out.println("8)  Factor");
System.out.println("\nInput your choice from the menu");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println("Enter a number");
n=Long.parseLong(br.readLine());
d=n;
s=0;
while(d!=0)
{
y=d%10;
d=d/10;
s=s*10+y;
}
System.out.println("\nOUTPUT:");
if(s==n)
System.out.println(n+" is a palindrome number");
else
System.out.println(n+" is not a palindrome number");
break;
case 2:
System.out.println("Enter a number");
z=Long.parseLong(br.readLine());
f=0;
for(i=1;i<z;i++)
{
if(z%i==0)
{
f=f+i;
}
}
System.out.println("\nOUTPUT:");
if(f==z)
{
System.out.println(z+" is a perfect number");
}
else
{
System.out.println(z+" is not a perfect number");
}
break;
case 3:
System.out.println("Enter a number");
a=Long.parseLong(br.readLine());
b=a*a;
s=0;
while(b>0)
{
c=b%10;
b=b/10;
s=s+c;
}
System.out.println("\nOUTPUT:");
if(s==a)
System.out.println(a+" is a neon number");
else
System.out.println(a+" is not a neon number");
break;
case 4:
System.out.println("Enter a number");
a=Long.parseLong(br.readLine());
b=a;
s=0;
while(b>0)
{
c=b%10;
b=b/10;
s=s+(c*c*c);
}
System.out.println("\nOUTPUT:");
if(s==a)
System.out.println(a+" is an armstrong number");
else
System.out.println(a+" is not an armstrong number");
break;
case 5:
System.out.println("Enter a number");
y=Long.parseLong(br.readLine());
f=0;
for(j=1;j<=y;j++)
{
if(y%j==0)
{
f++;
}
}
System.out.println("\nOUTPUT:");
if(f==2)
{
System.out.println(y+" is a prime number");
}
else
{
System.out.println(y+" is not a prime number");
}
break;
case 6:
System.out.println("Enter a number");
x=Long.parseLong(br.readLine());
if(x%2==0)
{
System.out.println(x+" is an even number");
}
else
{
System.out.println(x+" is an odd number");
}
break;
case 7:
double res,x1,x2,a1,b1,c1;
System.out.println("Enter the value of a");
a1=Double.parseDouble(br.readLine());
System.out.println("Enter the value of b");
b1=Double.parseDouble(br.readLine());
System.out.println("Enter the value of c");
c1=Double.parseDouble(br.readLine());
System.out.println();
System.out.println();
res=Math.sqrt((b1*b1)-(4*a1*c1));
x1=(-b1+res)/2*a1;
x2=(-b1-res)/2*a1;
System.out.println("\nOUTPUT:");
System.out.println("a="+a1+"   b="+b1+"    c="+c1);
System.out.println("The roots are "+x1+" and "+x2);
break;
case 8:
System.out.println("Input a number");
a2=Long.parseLong(br.readLine());
System.out.println("\nOUTPUT:");
for(i2=2;i2<=a2;i2++)
{
for(a2=a2;a2%i2==0;a2=a2/i2)
{
System.out.println(i2);
}
}
break;
    
case 9:
c=0;
System.out.println("Input three no.");
n=Long.parseLong(br.readLine());
m=Long.parseLong(br.readLine());
o=Long.parseLong(br.readLine());
System.out.println("\nOUTPUT:");
for(i=2;i<=(n>o?n:o);i++)
{
if(n%i==0&&m%i==0&&o%i==0)
{
c++;
}
}
if(c==0)
{
System.out.println("Triprime Numbers!!");
}
else
{
System.out.println("Not Triprime Numbers");
}
break;
default:
System.out.println("Entered a wrong choice");
}
}
}
