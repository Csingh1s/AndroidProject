package com.csing1s.wonders.model;

/**
 * Created by Csing1s on 6/24/2016.
 */
public class Choice {
  private int mNewPage;
   private String mText;
  public Choice(String t, int page)
  {
    mNewPage= page;
    mText=t;
  }

  public int getNewPage() {
    return mNewPage;
  }

  public void setNewPage(int newPage) {
    mNewPage = newPage;
  }

  public String getText() {
    return mText;
  }

  public void setText(String text) {
    mText = text;
  }
}
