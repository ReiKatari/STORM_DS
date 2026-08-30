package f2;

import android.view.textclassifier.TextClassification;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f4765a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4766b;

    /* renamed from: c  reason: collision with root package name */
    public final TextClassification f4767c;

    public o0(CharSequence charSequence, long j2, TextClassification textClassification) {
        this.f4765a = charSequence;
        this.f4766b = j2;
        this.f4767c = textClassification;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        if (nc.k.a(this.f4765a, o0Var.f4765a) && l4.q0.b(this.f4766b, o0Var.f4766b) && nc.k.a(this.f4767c, o0Var.f4767c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i2 = l4.q0.f8884c;
        int f8 = w.d.f(this.f4766b, this.f4765a.hashCode() * 31, 31);
        hashCode = this.f4767c.hashCode();
        return hashCode + f8;
    }

    public final String toString() {
        return "TextClassificationResult(text=" + ((Object) this.f4765a) + ", selection=" + ((Object) l4.q0.h(this.f4766b)) + ", textClassification=" + this.f4767c + ')';
    }
}
