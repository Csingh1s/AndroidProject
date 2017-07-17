package com.csing1s.wonders.model;

/**
 * Created by Csing1s on 6/24/2016.
 */
public class Page {
    private String mText;
    private int mImage;
    private Choice mChoice1;
    private Choice mChoice2;
    private  boolean mBoolean= false;
    public Page(int I,String T,Choice mC2,Choice mC1)
    {
        mImage=I;
        mText=T;
        mChoice1=mC1;
        mChoice2=mC2;
    }

    public Page(int image,String text)
    {
        mText=text;
        mImage=image;
        mChoice1=null;
        mChoice2=null;
        mBoolean=true;
    }
    public boolean isFinal()
    {
        return mBoolean;
    }


    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getImage() {
        return mImage;
    }

    public void setImage(int image) {
        mImage = image;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

}
