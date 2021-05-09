package starwolf.home.aqrsupreme.ui.signoff;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SignOffViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SignOffViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Sign Off Fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}