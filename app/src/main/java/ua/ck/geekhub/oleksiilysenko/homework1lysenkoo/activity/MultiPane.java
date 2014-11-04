package ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.activity;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.OnSwipeTouchListener;
import ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.R;
import ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.fragment.AnimationDetailsFragment;
import ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.fragment.ListAnimationFragment;

public class MultiPane extends Activity implements ListAnimationFragment.OnSelectedButtonListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multipane);
        int screenOrientation = getResources().getConfiguration().orientation;
        if (screenOrientation == Configuration.ORIENTATION_PORTRAIT) {

        }
    }

    @Override
    public void onButtonSelected(int buttonIndex) {
        // TODO Auto-generated method stub
        // подключаем FragmentManager
        FragmentManager fragmentManager = getFragmentManager();
        AnimationDetailsFragment fragment2 = (AnimationDetailsFragment) fragmentManager
                .findFragmentById(R.id.detailsAnimation);

        // Выводим нужную информацию
        if (fragment2 != null && fragment2.isVisible())
            fragment2.setDescription(buttonIndex);
        else
        {
            Intent intent = new Intent(this, AnimationDetailsActivity.class);
            intent.putExtra("buttonIndex", buttonIndex);
            startActivity(intent);
        }



    }

}
