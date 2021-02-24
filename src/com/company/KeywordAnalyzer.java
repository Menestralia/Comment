package com.company;

public abstract class KeywordAnalyzer implements TextAnalyzer{
    String[] keywords;
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();
    @Override
    public Label processText(String text) {
        keywords = getKeywords();
        for (String keyword: keywords){
            if(text.contains(keyword)) return getLabel();
        }
        return Label.OK;
    }


}
