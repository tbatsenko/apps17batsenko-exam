package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.lang.reflect.Array;


// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator {
    private BaseArray baseArray;

    public FilterDecorator(SmartArray baseArray,  MyPredicate myPredicate) {
        super(baseArray);
        this.baseArray = (BaseArray) baseArray;
        Integer[] elements = baseArray.getIntElements();
        int cnt = 0;
        for (int el : elements) {
            if (el > 0){
                cnt += 1;
            }
        }
        Integer[] newElements = new  Integer[cnt];
        int j = 0;
        for ( Integer el : elements){
            if (el > 0){
                newElements[j] = el;
                j++;
            }
        }

        this.setIntElements(newElements);
        int justChecker = 0;
    }

}
