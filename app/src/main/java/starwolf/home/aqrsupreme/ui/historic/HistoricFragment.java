package starwolf.home.aqrsupreme.ui.historic;

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
import starwolf.home.aqrsupreme.ui.historic.HistoricViewModel;

public class HistoricFragment extends Fragment {

    private HistoricViewModel historicViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        historicViewModel =
                new ViewModelProvider(this).get(HistoricViewModel.class);
        View root = inflater.inflate(R.layout.fragment_historic, container, false);
        final TextView textView = root.findViewById(R.id.text_historic);
        historicViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}