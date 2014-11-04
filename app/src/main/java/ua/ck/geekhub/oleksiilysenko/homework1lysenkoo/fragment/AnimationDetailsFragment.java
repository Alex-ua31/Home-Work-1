package ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.fragment;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.R;


public class AnimationDetailsFragment extends Fragment {


    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animation_details, container, false);
        return view;
    }

    public void setDescription(int buttonIndex) {
        TextView btn = (TextView) getActivity().findViewById(R.id.textAnimation);
        Animation anim;
        switch (buttonIndex) {
            case 1:
                anim = AnimationUtils.loadAnimation(getActivity(), R.anim.blink);
                btn.startAnimation(anim);
                break;
            case 2:
                anim = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);
                btn.startAnimation(anim);
                break;
            case 3:
                anim = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_out);
                btn.startAnimation(anim);
                break;

            case 4:
                anim = AnimationUtils.loadAnimation(getActivity(), R.anim.rotate);
                btn.startAnimation(anim);
                break;
        }
    }

}
