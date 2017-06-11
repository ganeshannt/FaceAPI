package ganeshannt.faceapi.helper;

import android.app.Application;

import com.microsoft.projectoxford.face.FaceServiceClient;
import com.microsoft.projectoxford.face.FaceServiceRestClient;
import ganeshannt.faceapi.R;

public class SampleApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        sFaceServiceClient = new FaceServiceRestClient(getString(R.string.endpoint), getString(R.string.subscription_key));
    }

    public static FaceServiceClient getFaceServiceClient() {
        return sFaceServiceClient;
    }

    private static FaceServiceClient sFaceServiceClient;
}
