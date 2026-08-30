package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cp1  reason: default package */
/* loaded from: classes.dex */
public final class cp1 extends l {
    public final bp1 u;

    public cp1(TextView textView) {
        this.u = new bp1(textView);
    }

    @Override // defpackage.l
    public final InputFilter[] E(InputFilter[] inputFilterArr) {
        if (!mo1.d()) {
            return inputFilterArr;
        }
        return this.u.E(inputFilterArr);
    }

    @Override // defpackage.l
    public final boolean G() {
        return this.u.w;
    }

    @Override // defpackage.l
    public final void R(boolean z) {
        if (!mo1.d()) {
            return;
        }
        this.u.R(z);
    }

    @Override // defpackage.l
    public final void S(boolean z) {
        boolean d = mo1.d();
        bp1 bp1Var = this.u;
        if (!d) {
            bp1Var.w = z;
        } else {
            bp1Var.S(z);
        }
    }

    @Override // defpackage.l
    public final TransformationMethod W(TransformationMethod transformationMethod) {
        if (!mo1.d()) {
            return transformationMethod;
        }
        return this.u.W(transformationMethod);
    }
}
