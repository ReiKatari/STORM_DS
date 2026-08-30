package defpackage;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fp1  reason: default package */
/* loaded from: classes.dex */
public final class fp1 implements TransformationMethod {
    public final TransformationMethod A;

    public fp1(TransformationMethod transformationMethod) {
        this.A = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.A;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && mo1.a().c() == 1) {
            mo1 a = mo1.a();
            a.getClass();
            return a.g(0, charSequence.length(), 0, charSequence);
        }
        return charSequence;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.A;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
