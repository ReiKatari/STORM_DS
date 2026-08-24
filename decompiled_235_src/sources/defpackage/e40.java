package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e40  reason: default package */
/* loaded from: classes.dex */
public final class e40 implements ic {
    public final float a;
    public final float b;

    public e40(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ic
    public final long a(long j, long j2, kk3 kk3Var) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        kk3 kk3Var2 = kk3.Ltr;
        float f3 = this.a;
        if (kk3Var != kk3Var2) {
            f3 *= -1.0f;
        }
        int round = Math.round((f3 + 1.0f) * f);
        return (Math.round((1.0f + this.b) * f2) & 4294967295L) | (round << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e40)) {
            return false;
        }
        e40 e40Var = (e40) obj;
        if (Float.compare(this.a, e40Var.a) == 0 && Float.compare(this.b, e40Var.b) == 0) {
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
        return xg6.p(sb, this.b, ')');
    }
}
