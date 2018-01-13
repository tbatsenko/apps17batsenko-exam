package ua.edu.ucu.smartarr;
import ua.edu.ucu.functions.MyFunction;


// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{
    private BaseArray baseArray;

    public MapDecorator(SmartArray baseArray,  MyFunction myFunction) {
        super(baseArray);
        this.baseArray = (BaseArray) baseArray;
        Integer[] elements = baseArray.getIntElements();
        int cnt = 0;
        for (Integer el: elements) {
           elements[cnt] = (Integer) myFunction.apply(el);
           cnt++;
       }

        this.setIntElements(elements);
        }

    }

