package starwolf.home.aqrsupreme.ui.historic;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HistoricViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HistoricViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Historic Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}