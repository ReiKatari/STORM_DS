package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sh  reason: default package */
/* loaded from: classes.dex */
public final class sh implements wx4 {
    public final int A;

    public sh(int i) {
        this.A = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof sh) && this.A == ((sh) obj).A) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A);
    }

    public final String toString() {
        return xg6.q(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.A, ')');
    }
}
