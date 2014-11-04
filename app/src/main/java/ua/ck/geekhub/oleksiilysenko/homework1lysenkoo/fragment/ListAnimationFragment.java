package ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.fragment;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import ua.ck.geekhub.oleksiilysenko.homework1lysenkoo.R;


public class ListAnimationFragment extends Fragment implements View.OnClickListener {
    @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_list_animation, container, false);
        Button buttonAnim1 = (Button) view.findViewById(R.id.buttonAnim1);
        Button buttonAnim2 = (Button) view.findViewById(R.id.buttonAnim2);
        Button buttonAnim3 = (Button) view.findViewById(R.id.buttonAnim3);
        Button buttonAnim4 = (Button) view.findViewById(R.id.buttonAnim4);

        buttonAnim1.setOnClickListener(this);
        buttonAnim2.setOnClickListener(this);
        buttonAnim3.setOnClickListener(this);
        buttonAnim4.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
// TODO Auto-generated method stub
        int buttonIndex = translateIdToIndex(view.getId());

        // Закоментируйте перед проверкой
        OnSelectedButtonListener listener = (OnSelectedButtonListener) getActivity();
        listener.onButtonSelected(buttonIndex);

        // Вспомогательный метод для получения индекса нажатой кнопки
        //Toast.makeText(getActivity(), String.valueOf(buttonIndex),
                //Toast.LENGTH_SHORT).show();
    }

    public interface OnSelectedButtonListener {
        void onButtonSelected(int buttonIndex);
    }

    int translateIdToIndex(int id) {
        int index = -1;
        switch (id) {
            case R.id.buttonAnim1:
                index = 1;
                break;
            case R.id.buttonAnim2:
                index = 2;
                break;
            case R.id.buttonAnim3:
                index = 3;
                break;
            case R.id.buttonAnim4:
                index = 4;
                break;
        }
        return index;
    }
}
