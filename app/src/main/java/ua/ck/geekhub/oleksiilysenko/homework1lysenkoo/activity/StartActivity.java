package ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.activity;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.R;
import ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.activity.MainActivity;


public class StartActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        Button btnDrawer = (Button) findViewById(R.id.buttonDrawer);
        Button btnMultiPane = (Button) findViewById(R.id.buttonMultiPane);
        btnDrawer.setOnClickListener(this);
        btnMultiPane.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonDrawer:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.buttonMultiPane:
                startActivity(new Intent(this, MultiPane.class));
                break;
        }
    }
    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_start, container, false);


            return rootView;
        }
    }
}
