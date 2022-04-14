package com.HeadFirstclass;
class MovieTest
{
public static void main(String[] args)
{
Movie one=new Movie();
one.title="My Name is Khan";
one.genre="Lovestroty";
one.rating=5;
System.out.println(one.title);
System.out.println(one.genre);
System.out.println(one.rating);
Movie two= new Movie();
two.title="Godgilla";
two.genre="action";
two.rating=-2;
System.out.println(two.title);
System.out.println(two.genre);
System.out.println(two.rating);
Movie three=new Movie();
three.title="Man in action";
three.genre="Rocking";
three.rating=3;
System.out.println(three.title);
System.out.println(three.genre);
System.out.println(three.rating);
}
}