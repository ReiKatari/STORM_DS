package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c40  reason: default package */
/* loaded from: classes.dex */
public final class c40 {
    public final float a;

    public c40(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, kk3 kk3Var) {
        float f = (i2 - i) / 2.0f;
        kk3 kk3Var2 = kk3.Ltr;
        float f2 = this.a;
        if (kk3Var != kk3Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c40) && Float.compare(this.a, ((c40) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return xg6.p(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
