package com.mikewencel;

public class Items {
    private String doors;
    private int lights;
    private int plug;
    private int lightSwitch;

    public Items(String doors, int lights, int plug, int lightSwitch) {
        this.doors = doors;
        this.lights = lights;
        this.plug = plug;
        this.lightSwitch = lightSwitch;
    }

    public int getNumberOfItems(int lights,int plug,int lightSwitch){
        return lights + plug + lightSwitch;
    }

    public void lightsOnNow(){
        System.out.println("There are " + getPlug() + " plugs to connect battery");
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public int getLights() {
        return lights;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    public int getPlug() {
        return plug;
    }

    public void setPlug(int plug) {
        this.plug = plug;
    }

    public int getLightSwitch() {
        return lightSwitch;
    }

    public void setLightSwitch(int lightSwitch) {
        this.lightSwitch = lightSwitch;
    }
}
