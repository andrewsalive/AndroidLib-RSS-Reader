package org.geekhub.angelys.androidLibRSSReader.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import org.geekhub.angelys.R;
import org.geekhub.angelys.androidLibRSSReader.fragments.DetailsFragment;
import org.geekhub.angelys.androidLibRSSReader.objects.Article;

/**
 * Created with IntelliJ IDEA.
 * User: angelys
 * Date: 2/2/13
 * Time: 8:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class DetailsActivity extends SherlockFragmentActivity {

    private Article article;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        if(getResources().getBoolean(R.bool.is_tablet) && getResources().getBoolean(R.bool.in_landscape))
        {
            finish();
        }

        if(getIntent() != null)
        {
            article = (Article)getIntent().getSerializableExtra("article");
        }

        setContentView(R.layout.details_activity);
    }

    public void onResume()
    {
        super.onResume();
        if(DetailsFragment.Instance != null)
        {
            DetailsFragment.Instance.setData(article);
        }
    }

}
