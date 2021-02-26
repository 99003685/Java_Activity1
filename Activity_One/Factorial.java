import java.util.Scanner; 
class Factorial{ 
public static void main(String args[]){ 
Scanner scan=new Scanner(System.in);

System.out.println("Enter a number"); 
int num=scan.nextInt();

if (num>32767)
{System.out.println("Number too large");}
else if(num<0)
{System.out.println("Number too small");}
else{
int m,a;
m=num;
int count=0;
while(num>0)
{
    num=num/10;
    count++;
    
}
while(m>0)
{
    a=m%10;
   digit_factorial(a);
    m=m/10;
    count--;
}
}
}
static void digit_factorial(int num)
{
int i,factorial=1;
for(i=1; i<=num; i++){
factorial=factorial*i;
}
System.out.println(factorial); 

}
}