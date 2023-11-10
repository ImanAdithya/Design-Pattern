package service.impl;

import service.Observer;

public class Dasun implements Observer {
    @Override
    public void update(String message) {
        System.out.println ("Im Dasun.."+message);
    }
}
