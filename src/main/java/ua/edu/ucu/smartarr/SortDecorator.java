package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;
import ua.edu.ucu.functions.MyPredicate;

import java.lang.reflect.Array;
import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{
    private BaseArray baseArray;

    public SortDecorator(SmartArray baseArray,  MyComparator myComparator) {
        super(baseArray);
        this.baseArray = (BaseArray) baseArray;
        Integer[] elements = baseArray.getIntElements();
        Arrays.sort(elements, myComparator);
        this.setIntElements(elements);
    }

}
