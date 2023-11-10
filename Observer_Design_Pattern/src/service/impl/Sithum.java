package service.impl;

import service.Observer;

public class Sithum  implements Observer {
    @Override
    public void update(String message) {
        System.out.println ("Im sithum "+message);
    }
}
