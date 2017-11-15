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
public class PipeIV extends PipeIII{
    protected boolean innerInsulation;
    
    public PipeIV(int plasticGr,int len,int outerDi ,boolean chemRes, String col1, String col2, boolean innerIns){
        super(plasticGr,len,outerDi,chemRes,col1,col2);
        innerInsulation = innerIns;
        
    }
    
}
