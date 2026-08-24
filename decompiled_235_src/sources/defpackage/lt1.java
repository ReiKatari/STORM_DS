package defpackage;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lt1  reason: default package */
/* loaded from: classes.dex */
public final class lt1 extends jw2 {
    public final kt1 F;

    public lt1(TextView textView) {
        this.F = new kt1(textView);
    }

    @Override // defpackage.jw2
    public final void A(boolean z) {
        if (!ws1.d()) {
            return;
        }
        this.F.A(z);
    }

    @Override // defpackage.jw2
    public final void B(boolean z) {
        boolean d = ws1.d();
        kt1 kt1Var = this.F;
        if (!d) {
            kt1Var.H = z;
        } else {
            kt1Var.B(z);
        }
    }

    @Override // defpackage.jw2
    public final TransformationMethod I(TransformationMethod transformationMethod) {
        if (!ws1.d()) {
            return transformationMethod;
        }
        return this.F.I(transformationMethod);
    }

    @Override // defpackage.jw2
    public final InputFilter[] s(InputFilter[] inputFilterArr) {
        if (!ws1.d()) {
            return inputFilterArr;
        }
        return this.F.s(inputFilterArr);
    }

    @Override // defpackage.jw2
    public final boolean u() {
        return this.F.H;
    }
}
