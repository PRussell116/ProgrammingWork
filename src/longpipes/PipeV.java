
package longpipes;

/**
 *
 * @author Oliver
 */
public class PipeV extends PipeIV{
    protected boolean outerReinfocement;
    
    /**
     **@param plasticGr an integer between 3 and 5 representing the quality of plastic 
     * @param len an integer representing the length of the pipe in mm
     * @param outerDi an integer representing the outer diameter of the pipe in mm
     * @param chemRes a boolean value representing if the pipe has chemical resistance 
     * @param col1 a String containing the first colour of the pipe
     * @param col2 a String containing the second colour of the pipe
     * @param innerIns a boolean value representing if the has inner insulation
     */ 
    public PipeV(int plasticGr,int len,int outerDi ,boolean chemRes, String col1, String col2, boolean innerIns, boolean outerRein){
        super(plasticGr,len,outerDi,chemRes,col1,col2,innerIns);
        outerReinfocement = outerRein;
        

    }
        
    
}
