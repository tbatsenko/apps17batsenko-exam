package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{
    private MyPredicate myPredicate;

    public DistinctDecorator(SmartArray smartArray, MyPredicate myPredicate) {
        super(smartArray);
        this.myPredicate = myPredicate;

    }



}
