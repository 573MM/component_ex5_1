/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.footballevent;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ScoreSoure {
    ArrayList<ScoreListener> scoreListener;
    public ScoreSoure(){
        scoreListener = new ArrayList<>();
    }
    public void addSubscriner(ScoreListener obj){ //register
        scoreListener.add(obj);
    }
    public void setScore(String value){ //return evett and call notify
        fireScoreEvent(new ScoreEvent(this, value));
    }
    public void fireScoreEvent(ScoreEvent evt){
        for (ScoreListener scoreListeners : scoreListener){
            scoreListeners.scoreChange(evt);
        }
    }
}
