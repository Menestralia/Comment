package com.company;

public class NegativeTextAnalyzer extends KeywordAnalyzer{
    private final String[] keywords = {":(","=(",":|"};
    @Override
    public String[] getKeywords() {
        return this.keywords;
    }

    @Override
    public Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
