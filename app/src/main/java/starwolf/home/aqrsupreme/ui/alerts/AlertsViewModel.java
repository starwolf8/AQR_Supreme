package starwolf.home.aqrsupreme.ui.alerts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AlertsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AlertsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Alerts Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}