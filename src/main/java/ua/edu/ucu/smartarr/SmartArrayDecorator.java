package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator extends BaseArray {

    protected SmartArray smartArray;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

}
