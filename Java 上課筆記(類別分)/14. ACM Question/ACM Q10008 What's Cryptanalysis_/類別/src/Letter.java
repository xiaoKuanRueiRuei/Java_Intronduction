/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Letter {

    private char a;
    private int count;

    public Letter(char a, int count) {
        this.a = a;
        this.count = count;
    }

    @Override
    public String toString() {
        return this.getA() + " " + this.getCount();
    }

    /**
     * @return the a
     */
    public char getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(char a) {
        this.a = a;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

}
