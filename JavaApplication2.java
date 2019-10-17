
package javaapplication1;

interface xyz
{
    void show();
}

public class JavaApplication1 
{
    public static void main(String[] args) 
    {
        xyz obj = () ->System.out.println("keep Learning");  
        obj.show();
    }
    
}
