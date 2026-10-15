package com.hillel.cw_04.animal;
  public class Animal {

    private boolean dog;
    private Boolean cat;

    protected void voice(){
        System.out.println("Animal voice");
    }

    private void eat(){
        System.out.println("Animal eat");
    }

    public Boolean getCat() {
        return cat;
    } // true, <null>, false

    public boolean isDog() {
        return dog;
    } // true, false


}
