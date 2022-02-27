package com.epam.exercise.jartest;


import com.epam.exercise.informationhandling.LexemeBuffer;
import com.epam.exercise.informationhandling.LexemeLogic;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LexemeLogic lexemeLogic = new LexemeLogic();
        String expressionText = "2 + 2 * 2";
        List<com.epam.exercise.informationhandling.Lexeme> lexemes = lexemeLogic.lexAnalyze(expressionText);
        LexemeBuffer lexemeBuffer = new LexemeBuffer(lexemes);
        System.out.println(lexemeLogic.expr(lexemeBuffer));
    }
}
