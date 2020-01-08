package com.packages;

public class Planet extends HeavenlyBody {
    public HeavenlyBody(String name, double orbitalPeriod){
        name=super.getName();
        orbitalPeriod=super.getOrbitalPeriod();
    }
}
