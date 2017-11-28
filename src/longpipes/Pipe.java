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
    protected int plasticGrade,length,outerDiameter;
    protected double innerDiameter, basicCost;
    protected double costPerInc;
    protected boolean chemResistance;
    
    public Pipe(int plasticGr,int len,int outerDi,Boolean chemRes){
        plasticGrade = plasticGr;
        length = len; // need to convert from inch to mm
        outerDiameter = outerDi;
        innerDiameter = (float) (outerDi * 0.9); //calculates inner diameter of pipe
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
     * Calculate the base cost of the pipe based on attributes and set attribute
     * basicCost to the result
     *
     * @return a double representing the basic cost of the pipe
     */
    /**
     * Gets the length of the pipe
     *
     * @return A integer representing the length of the pipe in mm
     */
    public int getLength() {
        return length;
    }

    /**
     * Gets the outer diameter of the pipe
     *
     * @return an integer representing the outer diameter of the pipe in mm
     */
    public int getOuterDiameter() {
        return outerDiameter;
    }

    /**
     * Set the pipes outer diameter
     *
     * @param newDia An integer representing the pipes new diameter in mm
     */
    public void setOuterDiameter(int newDia) {
        outerDiameter = newDia;
    }

}
