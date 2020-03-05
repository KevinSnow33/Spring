package com.kevinsnow.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
    private static Map<Long,Car> carMap;

    static {
        carMap = new HashMap<>();
        carMap.put(1L,new Car(1,"奔驰"));
        carMap.put(2L,new Car(2,"宝马"));
    }

    public static Car getCar(long id){
        return carMap.get(id);
    }

}
