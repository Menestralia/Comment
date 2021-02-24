package com.company;

public class TooLongTextAnalyzer implements TextAnalyzer{
    private int maxLength;
    @Override
    public Label processText(String text) {
        return text.length() > this.maxLength ? Label.TOO_LONG:Label.OK;
    }
    public TooLongTextAnalyzer(int maxLength){
        this.maxLength = maxLength;
    }
}
