package service.impl;

import service.Observer;

public class Ramal implements Observer {
    @Override
    public void update(String message) {
        System.out.println ("Im ramal..."+message);
    }
}
