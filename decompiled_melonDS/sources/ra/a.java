package ra;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import k0.d;
import me.magnum.melonds.R;
import q.z0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends z0 {
    public static int g(Context context, TypedArray typedArray, int... iArr) {
        int i2 = -1;
        for (int i10 = 0; i10 < iArr.length && i2 < 0; i10++) {
            int i11 = iArr[i10];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i11, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i2 = dimensionPixelSize;
            } else {
                i2 = typedArray.getDimensionPixelSize(i11, -1);
            }
        }
        return i2;
    }

    @Override // q.z0, android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (d.J(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i2, t9.a.f13168t);
            int g10 = g(getContext(), obtainStyledAttributes, 2, 4);
            obtainStyledAttributes.recycle();
            if (g10 >= 0) {
                setLineHeight(g10);
            }
        }
    }
}
