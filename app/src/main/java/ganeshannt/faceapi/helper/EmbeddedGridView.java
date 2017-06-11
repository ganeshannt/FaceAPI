package ganeshannt.faceapi.helper;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;

public class EmbeddedGridView extends GridView {
    public EmbeddedGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int newHeightMeasureSpec =
                MeasureSpec.makeMeasureSpec(MEASURED_SIZE_MASK, MeasureSpec.AT_MOST);

        super.onMeasure(widthMeasureSpec, newHeightMeasureSpec);
        getLayoutParams().height = getMeasuredHeight();
    }
}
