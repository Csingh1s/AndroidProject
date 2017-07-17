package com.csing1s.wonders.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.csing1s.wonders.R;
import com.csing1s.wonders.model.Page;
import com.csing1s.wonders.model.Story;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {
   String mName;
    @BindView(R.id.ExploreBotton) Button mExploreBotton;
    @BindView(R.id.NextwonderButton) Button mNextwonderButton;
    @BindView(R.id.PageTwoImage) ImageView mPageTwoImage;
    @BindView(R.id.FirstWonderText) TextView mTextView;
  //  @BindView(R.id.PageTwoImage) ImageView mImageView;

    Story mStory = new Story();
    Page mPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intend = getIntent();
         ButterKnife.bind(this);
       /*
        mName = intent.getStringExtra("name");
        if(mName.equals(null))
        {
            mName.equals("freind");
        }
        */
        loadPage(0);
    }

    private void loadPage(int pageNumber) {
        mPage= mStory.getPages(pageNumber);
        Drawable drawable = getResources().getDrawable(mPage.getImage());
         mPageTwoImage.setImageDrawable(drawable);
        String text = mPage.getText();
        mTextView.setText(text);
        if(mPage.isFinal())
        {
            mNextwonderButton.setVisibility(View.INVISIBLE);
            mExploreBotton.setText("ReStart Journey");
            mExploreBotton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
        else {

            mExploreBotton.setText(mPage.getChoice1().getText());
            mNextwonderButton.setText(mPage.getChoice2().getText());
        }



    }
    @OnClick(R.id.ExploreBotton)
    public void  onClick(View v)
    {
        int Pages = mPage.getChoice1().getNewPage();
        loadPage(Pages);
    }
   @OnClick(R.id.NextwonderButton)
    public  void onclick(View v)
   {
       int p= mPage.getChoice2().getNewPage();
       loadPage(p);
   }



   
}
