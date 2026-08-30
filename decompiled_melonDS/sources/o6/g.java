package o6;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends aj.g {

    /* renamed from: l  reason: collision with root package name */
    public final f f10858l;

    public g(TextView textView) {
        this.f10858l = new f(textView);
    }

    @Override // aj.g
    public final TransformationMethod B0(TransformationMethod transformationMethod) {
        if (!m6.i.d()) {
            return transformationMethod;
        }
        return this.f10858l.B0(transformationMethod);
    }

    @Override // aj.g
    public final InputFilter[] C(InputFilter[] inputFilterArr) {
        if (!m6.i.d()) {
            return inputFilterArr;
        }
        return this.f10858l.C(inputFilterArr);
    }

    @Override // aj.g
    public final boolean M() {
        return this.f10858l.f10857n;
    }

    @Override // aj.g
    public final void c0(boolean z10) {
        if (!m6.i.d()) {
            return;
        }
        this.f10858l.c0(z10);
    }

    @Override // aj.g
    public final void i0(boolean z10) {
        boolean d4 = m6.i.d();
        f fVar = this.f10858l;
        if (!d4) {
            fVar.f10857n = z10;
        } else {
            fVar.i0(z10);
        }
    }
}
