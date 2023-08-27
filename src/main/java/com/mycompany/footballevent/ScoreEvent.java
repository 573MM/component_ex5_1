/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.footballevent;

import java.util.EventObject;

/**
 *
 * @author LENOVO
 */
public class ScoreEvent extends EventObject{
    private String score;
    public String getScore(){
        return score;
    }
    public ScoreEvent(Object o, String value){
        super(o);
        score = value;
    }
}
