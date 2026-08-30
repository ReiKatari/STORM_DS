package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h20  reason: default package */
/* loaded from: classes.dex */
public final class h20 {
    public final float a;

    public h20(float f) {
        this.a = f;
    }

    public final int a(int i, int i2, sd3 sd3Var) {
        float f = (i2 - i) / 2.0f;
        sd3 sd3Var2 = sd3.Ltr;
        float f2 = this.a;
        if (sd3Var != sd3Var2) {
            f2 *= -1.0f;
        }
        return Math.round((1.0f + f2) * f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h20) && Float.compare(this.a, ((h20) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ej6.f(new StringBuilder("Horizontal(bias="), this.a, ')');
    }
}
