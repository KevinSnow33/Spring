package com.kevinsnow.factorymethod;

import java.util.HashMap;
import java.util.Map;

public class InstanceCarFactory {
    private Map<Long,Car> carMap;

    public InstanceCarFactory(){
        carMap = new HashMap<>();
        carMap.put(1L,new Car(1,"奔驰"));
        carMap.put(2L,new Car(2,"宝马"));
    }

    public Car getCar(long id){
        return carMap.get(id);
    }
}
