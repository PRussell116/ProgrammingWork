
package longpipes;


public class SuperPipe {

    
    protected int plasticGrade,length,outerDiameter;
    protected float innerDiameter, basicCost;
    protected boolean chemRes;
    
    /**
     **@param plasticGr an integer between 1 and 3 representing the quality of plastic 
     * @param len an integer representing the length of the pipe in mm
     * @param outerDi an integer representing the outer diameter of the pipe in mm
     * @param chemRes a boolean value representing if the pipe has chemical resistance 
     */    
    public SuperPipe(int plasticGr,int len,int outerDi ,boolean chemRes ){
        plasticGrade = plasticGr;
        length = len;
        outerDiameter = outerDi;
        innerDiameter = (float) (outerDi * 0.9);                   //calculates inner diameter of pipe  
    };
    
    /** Gets the length of the pipe
     * @return A integer representing the length of the pipe in mm
     */
    public int getLength(){
        return length;
    } 
    
    /** Gets the outer diameter of the pipe
     * @return an integer representing the outer diameter of the pipe in mm
     */
    public int getOuterDiameter(){
        return outerDiameter;
    }
    
    /** Set the pipes length
     * @param newLeng An integer representing the pipes new length in mm
     */
    public void setLength(int newLeng){
        length = newLeng;
    }
    
    /**Set the pipes outer diameter
     * @param newDia An integer representing the pipes new diameter in mm
     */
    public void setOuterDiameter(int newDia){
        outerDiameter = newDia;
    }
   
}
