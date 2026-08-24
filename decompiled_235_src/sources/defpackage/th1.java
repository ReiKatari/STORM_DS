package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: th1  reason: default package */
/* loaded from: classes.dex */
public final class th1 implements qh1 {
    public final float A;
    public final float B;

    public th1(float f, float f2) {
        this.A = f;
        this.B = f2;
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.B;
    }

    @Override // defpackage.qh1
    public final float a() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th1)) {
            return false;
        }
        th1 th1Var = (th1) obj;
        if (Float.compare(this.A, th1Var.A) == 0 && Float.compare(this.B, th1Var.B) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.B) + (Float.hashCode(this.A) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.A);
        sb.append(", fontScale=");
        return xg6.p(sb, this.B, ')');
    }
}
