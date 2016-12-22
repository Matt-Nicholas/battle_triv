package com.studios.dafunk.battletriv;

import java.util.ArrayList;

/**
 * Created by Guest on 12/22/16.
 */
public class Question {
    private String mCategory;
    private String question;
    private String corrrectAns;
    private ArrayList<String> incorrectAns = new ArrayList<>();

    public Question(int i){
        if(i == 0){
            mCategory = "Animals";
            question = "What color is a polar bears skin?";
            corrrectAns = "BLACK";
            incorrectAns.add("PINK");
            incorrectAns.add("WHITE");
            incorrectAns.add("BLUE");
        }
        if(i == 1){
            mCategory = "Art";
            question = "Who painted the Mona Lisa?";
            corrrectAns = "Leonardo da Vinci";
            incorrectAns.add("Pablo Picasso");
            incorrectAns.add("Vincent van Gogh");
            incorrectAns.add("Andy Warhol");
        }
    }

    public String getCategory() {
        return mCategory;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrrectAns() {
        return corrrectAns;
    }

    public ArrayList<String> getIncorrectAns() {
        return incorrectAns;
    }
}
