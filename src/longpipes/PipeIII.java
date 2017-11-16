/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * 
 */
public class PipeIII extends PipeII{
    protected String colour2;
    
    /**
     **@param plasticGr an integer between 2 and 5 representing the quality of plastic 
     * @param len an integer representing the length of the pipe in mm
     * @param outerDi an integer representing the outer diameter of the pipe in mm
     * @param chemRes a boolean value representing if the pipe has chemical resistance 
     * @param col1 a String containing the first colour of the pipe
     * @param col2 a String containing the second colour of the pipe
     */  
    public PipeIII(int plasticGr,int len,int outerDi ,boolean chemRes, String col1, String col2){
        super(plasticGr,len,outerDi,chemRes,col1);
        colour2 = col2;
        
    }
    
    /** gets the second colour of the pipe
     * @return A String containing the second colour of the pipe
     */
    public String getColour2(){
        return colour2;
    }
    
    /**Set the second colour of the pipe
     * @param newColour2 A String representing the pipes second colour
     */
    public void setColour2(String newColour2){
        colour2 = newColour2;
    }
}
