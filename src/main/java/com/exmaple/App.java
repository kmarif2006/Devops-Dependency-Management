package com.exmaple;
import org.apache.commons.lang3.StringUtils;
public class App 
{
    public String getName(){
        return StringUtils.capitalize("arif");
    }
    public static void main( String[] args )
    {
        System.out.println(new App().getName());
    }
}
