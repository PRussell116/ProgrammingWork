/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author Oliver
 */
public abstract class Pipe {

    /**
     *
     */
    protected int plasticGrade;
    protected double innerRadius, basicCost, length, outerRadius, costPerInc;
    protected boolean chemResistance;

    /**
     *
     * @param plasticGr an int representing the grade of the plastic
     * @param len a double representing the length of the pipe
     * @param outerDi a double representing the outer radius of the pipe
     * @param chemRes a boolean representing if the pipe has additional chemical
     * resistance
     */
    public Pipe(int plasticGr, double len, double outerDi, Boolean chemRes) {
        plasticGrade = plasticGr;
        length = len;
        outerRadius = outerDi;
        innerRadius = (float) (outerDi * 0.9); //calculates inner radius of pipe
        chemResistance = chemRes;
        // determine costPerInc based on plastic grade
        switch (plasticGrade) {
            case 1:
                costPerInc = 0.4;   // 1 inch = 0.4
                break;
            case 2:
                costPerInc = 0.6;   // 1 inch = 0.6
                break;
            case 3:
                costPerInc = 0.75;   // 1 inch = 0.75
                break;
            case 4:
                costPerInc = 0.8;   // 1 inch = 0.8
                break;
            default:
                costPerInc = 0.95;   // 1 inch = 0.95
                break;
        }
    }

    /**
     * set the boolean value of chemical resistance
     *
     * @param newChemRes New boolean value
     */
    public void setChemRes(boolean newChemRes) {
        chemResistance = newChemRes;
    }

    /**
     * returns chemResistance
     *
     * @return a Boolean value representing if a pipe has chemical resistance
     */
    public boolean getChemRes() {
        return chemResistance;
    }

    /**
     * Gets the length of the pipe
     *
     * @return A integer representing the length of the pipe in meters
     */
    public double getLength() {
        return length;
    }

    /**
     * Gets the outer radius of the pipe
     *
     * @return an integer representing the outer radius of the pipe in inches
     */
    public double getOuterRadius() {
        return outerRadius;
    }

    /**
     * Set the pipes outer radius
     *
     * @param newRad An integer representing the pipes new radius in inches
     */
    public void setOuterRadius(int newRad) {
        outerRadius = newRad;
    }

    /**
     *
     * @return a double representing the cost of the pipe
     */
    public abstract double calculateCost();

}
