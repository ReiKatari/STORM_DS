package androidx.preference.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.preference.Preference;
import androidx.preference.j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes.dex */
public class PreferenceImageView extends ImageView {
    public int A;
    public int B;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A = Preference.DEFAULT_ORDER;
        this.B = Preference.DEFAULT_ORDER;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.f1580j, 0, 0);
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(3, Preference.DEFAULT_ORDER));
        setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(2, Preference.DEFAULT_ORDER));
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.B;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.A;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i2, int i10) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i2);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i2 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i10);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i10 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i2, i10);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i2) {
        this.B = i2;
        super.setMaxHeight(i2);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i2) {
        this.A = i2;
        super.setMaxWidth(i2);
    }
}
