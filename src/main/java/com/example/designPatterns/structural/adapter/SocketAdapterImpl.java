package com.example.designPatterns.structural.adapter;

public class SocketAdapterImpl extends Socket implements SocketAdapter{
    @Override
    public int get12Volt() {
        return getVolt()/10;
    }

    @Override
    public int get3Volt() {
        return getVolt()/40;
    }

    @Override
    public int get120Volt() {
        return getVolt();
    }
}
