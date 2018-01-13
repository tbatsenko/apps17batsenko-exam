package ua.edu.ucu.smartarr;

import java.util.ArrayList;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Integer[] intElements;
    public BaseArray(Integer[] ints){
        this.intElements = ints;
    }

    public BaseArray() {
    }

    @Override
    public Object[] toArray() { //return array with SmartArray elements
        return this.getIntElements();
    }

    @Override
    public String operationDescription() { // return current operation name applied to SmartArray
        return "some name";
    }

    @Override
    public int size() { // return SmartArray size
        return intElements.length;
    }

    public Integer[] getIntElements() {
        return intElements;
    }

    public void setIntElements(Integer[] newIntElements) {
        this.intElements = newIntElements;
    }
}
