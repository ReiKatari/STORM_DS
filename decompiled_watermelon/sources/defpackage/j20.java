package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j20  reason: default package */
/* loaded from: classes.dex */
public final class j20 implements ub {
    public final float a;
    public final float b;

    public j20(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ub
    public final long a(long j, long j2, sd3 sd3Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        sd3 sd3Var2 = sd3.Ltr;
        float f3 = this.a;
        if (sd3Var != sd3Var2) {
            f3 *= -1.0f;
        }
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round((1.0f + this.b) * f2) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j20)) {
            return false;
        }
        j20 j20Var = (j20) obj;
        if (Float.compare(this.a, j20Var.a) == 0 && Float.compare(this.b, j20Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiasAlignment(horizontalBias=");
        sb.append(this.a);
        sb.append(", verticalBias=");
        return ej6.f(sb, this.b, ')');
    }
}
