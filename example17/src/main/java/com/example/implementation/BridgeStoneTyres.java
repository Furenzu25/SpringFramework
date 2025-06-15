package com.example.implementation;

import com.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {

    @Override
    public String rotate(){
        return "Using BridgeStone Tyres for this Vehicle";
    }

    @Override
    public String stop(){
        return "Stopped the vehicle through BridgeStoneTyres";
    }
}
