/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.datasal.Exception;

/**
 *
 * @author cobalt
 */
public class ListEmptyException extends RuntimeException{
    public ListEmptyException(String s){ 
        super(s);
    }//end constructor
} //end ListException