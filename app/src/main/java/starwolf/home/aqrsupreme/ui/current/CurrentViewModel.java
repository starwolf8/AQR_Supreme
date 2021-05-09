package starwolf.home.aqrsupreme.ui.current;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CurrentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CurrentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Current Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}