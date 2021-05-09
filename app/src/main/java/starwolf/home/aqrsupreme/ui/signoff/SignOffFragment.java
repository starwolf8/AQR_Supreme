package starwolf.home.aqrsupreme.ui.signoff;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import starwolf.home.aqrsupreme.R;

public class SignOffFragment extends Fragment {

    private SignOffViewModel signOffViewModelViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        signOffViewModelViewModel =
                new ViewModelProvider(this).get(SignOffViewModel.class);
        View root = inflater.inflate(R.layout.fragment_sign_off, container, false);
        final TextView textView = root.findViewById(R.id.text_signoff);
        signOffViewModelViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}