package p1;
public class Box
{
int l,b;
public Box()
{
l=10;
b=10;
}
public Box(int l,int b)
{
this.l=l;
this.b=b;
}
public void show()
{
System.out.println("From Box");
System.out.println("L="+l+" , B="+b);
}
}
