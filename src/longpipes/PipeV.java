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
public class PipeV extends PipeIV{
    protected boolean outerReinfocement;
    
    public PipeV(int plasticGr,int len,int outerDi ,boolean chemRes, String col1, String col2, boolean innerIns, boolean outerRein){
        super(plasticGr,len,outerDi,chemRes,col1,col2,innerIns);
        outerReinfocement = outerRein;
        

    }
        
    
}
