package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import ba.c;
import com.google.android.material.button.MaterialButton;
import ha.i;
import k0.d;
import k7.w;
import l.a0;
import me.magnum.melonds.R;
import q.n;
import q.o;
import q.p;
import q.z0;
import qa.s;
import sa.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends a0 {
    @Override // l.a0
    public final n a(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    @Override // l.a0
    public final o b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // l.a0
    public final p c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.CompoundButton, q.a0, android.view.View, ja.a] */
    @Override // l.a0
    public final q.a0 d(Context context, AttributeSet attributeSet) {
        ?? a0Var = new q.a0(a.a(context, attributeSet, R.attr.radioButtonStyle, 2131952822), attributeSet);
        Context context2 = a0Var.getContext();
        TypedArray e6 = i.e(context2, attributeSet, t9.a.f13165q, R.attr.radioButtonStyle, 2131952822, new int[0]);
        if (e6.hasValue(0)) {
            a0Var.setButtonTintList(w.m(context2, e6, 0));
        }
        a0Var.f7786c0 = e6.getBoolean(1, false);
        e6.recycle();
        return a0Var;
    }

    @Override // l.a0
    public final z0 e(Context context, AttributeSet attributeSet) {
        z0 z0Var = new z0(a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = z0Var.getContext();
        if (d.J(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = t9.a.f13169u;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int g10 = ra.a.g(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (g10 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, t9.a.f13168t);
                    int g11 = ra.a.g(z0Var.getContext(), obtainStyledAttributes3, 2, 4);
                    obtainStyledAttributes3.recycle();
                    if (g11 >= 0) {
                        z0Var.setLineHeight(g11);
                    }
                }
            }
        }
        return z0Var;
    }
}
