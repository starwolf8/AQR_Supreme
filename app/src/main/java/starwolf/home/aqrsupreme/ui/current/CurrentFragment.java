package starwolf.home.aqrsupreme.ui.current;

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
import starwolf.home.aqrsupreme.ui.current.CurrentViewModel;

public class CurrentFragment extends Fragment {

    private CurrentViewModel currentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        currentViewModel =
                new ViewModelProvider(this).get(CurrentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_current, container, false);
        final TextView textView = root.findViewById(R.id.text_current);
        currentViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}