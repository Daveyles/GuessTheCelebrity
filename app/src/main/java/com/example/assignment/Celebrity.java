package com.example.assignment;

public class Celebrity {
    //array for images
    public int celebrities[] = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c
    };

    //array for options on buttons
    public String options[][] = {
            {"Ntate Stunna","Chris Brown","Justin Bieber"},
            {"Nadia Nakai","Faith Nketsi","Bontle Modiselle"},
            {"Ronaldo","Nathan Ake","Kevin De Bruyne"}
    };

    //array for correct choices
    public String correctAnswer[] = {
            "Chris Brown",
            "Bontle Modiselle",
            "Ronaldo"
    };

    public int getCelebrity(int x){
        int celebrity = celebrities[x];
        return celebrity;
    }
    public String getoption1(int x){
        String option = options[x][0];
        return option;
    }

    public String getoption2(int x){
        String option = options[x][1];
        return option;
    }

    public String getoption3(int x){
        String option = options[x][2];
        return option;
    }
    public String getCorrectAnswer(int x) {
        String answer = correctAnswer[x];
        return answer;
    }

}
