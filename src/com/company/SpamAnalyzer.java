package com.company;

import java.util.Arrays;

public class SpamAnalyzer extends KeywordAnalyzer{
    private String[] keywords;
    public SpamAnalyzer(String[] kwds){
        this.keywords = Arrays.copyOf(kwds,kwds.length);
    }

    @Override
    public String[] getKeywords() {
        return this.keywords;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }
}
