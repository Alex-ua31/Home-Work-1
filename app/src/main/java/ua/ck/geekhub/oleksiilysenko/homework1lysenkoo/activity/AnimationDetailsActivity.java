package ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.R;
import ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.fragment.AnimationDetailsFragment;

public class AnimationDetailsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation_details);

        Intent intent = getIntent();
        int buttonIndex = intent.getIntExtra("buttonIndex", -1);
        if (buttonIndex != -1) {
            FragmentManager fm = getFragmentManager();
            AnimationDetailsFragment fragment2 = (AnimationDetailsFragment) fm
                    .findFragmentById(R.id.detailsAnimation);
            fragment2.setDescription(buttonIndex);
        }
    }

}
