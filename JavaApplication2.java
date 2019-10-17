
package javaapplication2;

interface abc
{
    void show();
}

public class JavaApplication2 
{
    public static void main(String[] args) 
    {
        abc obj = () ->System.out.println("keep Learning");  
        obj.show();
    }
    
}
