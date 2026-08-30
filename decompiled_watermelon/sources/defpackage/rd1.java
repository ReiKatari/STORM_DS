package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rd1  reason: default package */
/* loaded from: classes.dex */
public final class rd1 implements od1 {
    public final float A;
    public final float B;

    public rd1(float f, float f2) {
        this.A = f;
        this.B = f2;
    }

    @Override // defpackage.od1
    public final float b() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd1)) {
            return false;
        }
        rd1 rd1Var = (rd1) obj;
        if (Float.compare(this.A, rd1Var.A) == 0 && Float.compare(this.B, rd1Var.B) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.B) + (Float.hashCode(this.A) * 31);
    }

    @Override // defpackage.od1
    public final float o() {
        return this.B;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DensityImpl(density=");
        sb.append(this.A);
        sb.append(", fontScale=");
        return ej6.f(sb, this.B, ')');
    }
}
