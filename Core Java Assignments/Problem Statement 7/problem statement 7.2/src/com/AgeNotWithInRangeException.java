package com;

public class AgeNotWithInRangeException extends Exception
{
    public String validname()
    {
    	return ("Age is not between 15 and 21. please ReEnter the Age");
    }
}