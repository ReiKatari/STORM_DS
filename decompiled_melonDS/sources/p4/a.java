package p4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements n {
    public final int A;

    public a(int i2) {
        this.A = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.A == ((a) obj).A) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A);
    }

    public final String toString() {
        return w.d.p(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.A, ')');
    }
}
