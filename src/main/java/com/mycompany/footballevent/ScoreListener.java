/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.footballevent;

import java.util.EventListener;

/**
 *
 * @author LENOVO
 */
public interface ScoreListener extends EventListener{
    public void scoreChange(ScoreEvent evt);
    
}
