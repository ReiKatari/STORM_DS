package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends ls {
    @Override // defpackage.ls
    public final yp a(Context context, AttributeSet attributeSet) {
        return new mu3(context, attributeSet);
    }

    @Override // defpackage.ls
    public final zp b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.ls
    public final bq c(Context context, AttributeSet attributeSet) {
        return new zu3(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [cv3, android.widget.CompoundButton, android.view.View, dr] */
    @Override // defpackage.ls
    public final dr d(Context context, AttributeSet attributeSet) {
        ?? drVar = new dr(mh7.n0(context, attributeSet, R.attr.radioButtonStyle, 2132018377), attributeSet);
        Context context2 = drVar.getContext();
        TypedArray Y = n40.Y(context2, attributeSet, ay4.q, R.attr.radioButtonStyle, 2132018377, new int[0]);
        if (Y.hasValue(0)) {
            drVar.setButtonTintList(nk2.C(context2, Y, 0));
        }
        drVar.d0 = Y.getBoolean(1, false);
        Y.recycle();
        return drVar;
    }

    @Override // defpackage.ls
    public final ds e(Context context, AttributeSet attributeSet) {
        ds dsVar = new ds(mh7.n0(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = dsVar.getContext();
        if (hk2.P(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = ay4.u;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int g = iv3.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, ay4.t);
                    int g2 = iv3.g(dsVar.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (g2 >= 0) {
                        dsVar.setLineHeight(g2);
                    }
                }
            }
        }
        return dsVar;
    }
}
