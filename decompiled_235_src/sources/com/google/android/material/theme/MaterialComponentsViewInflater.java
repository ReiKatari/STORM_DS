package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends ys {
    @Override // defpackage.ys
    public final kq a(Context context, AttributeSet attributeSet) {
        return new p14(context, attributeSet);
    }

    @Override // defpackage.ys
    public final lq b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.ys
    public final nq c(Context context, AttributeSet attributeSet) {
        return new i24(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [qr, android.widget.CompoundButton, android.view.View, l24] */
    @Override // defpackage.ys
    public final qr d(Context context, AttributeSet attributeSet) {
        ?? qrVar = new qr(q60.e0(context, attributeSet, R.attr.radioButtonStyle, 2132018385), attributeSet);
        Context context2 = qrVar.getContext();
        TypedArray K = f04.K(context2, attributeSet, a75.q, R.attr.radioButtonStyle, 2132018385, new int[0]);
        if (K.hasValue(0)) {
            qrVar.setButtonTintList(np2.S(context2, K, 0));
        }
        qrVar.e0 = K.getBoolean(1, false);
        K.recycle();
        return qrVar;
    }

    @Override // defpackage.ys
    public final qs e(Context context, AttributeSet attributeSet) {
        qs qsVar = new qs(q60.e0(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = qsVar.getContext();
        if (qo2.N(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = a75.u;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int g = t24.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, a75.t);
                    int g2 = t24.g(qsVar.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (g2 >= 0) {
                        qsVar.setLineHeight(g2);
                    }
                }
            }
        }
        return qsVar;
    }
}
