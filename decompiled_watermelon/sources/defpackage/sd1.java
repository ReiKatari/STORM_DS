package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sd1  reason: default package */
/* loaded from: classes.dex */
public final class sd1 implements od1 {
    public final float A;
    public final float B;
    public final he2 L;

    public sd1(float f, float f2, he2 he2Var) {
        this.A = f;
        this.B = f2;
        this.L = he2Var;
    }

    @Override // defpackage.od1
    public final float P(long j) {
        if (js6.a(is6.b(j), 4294967296L)) {
            return this.L.b(is6.c(j));
        }
        i.n("Only Sp can convert to Px");
        return RecyclerView.A1;
    }

    @Override // defpackage.od1
    public final float b() {
        return this.A;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sd1) {
                sd1 sd1Var = (sd1) obj;
                if (Float.compare(this.A, sd1Var.A) != 0 || Float.compare(this.B, sd1Var.B) != 0 || !this.L.equals(sd1Var.L)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.L.hashCode() + ej6.a(this.B, Float.hashCode(this.A) * 31, 31);
    }

    @Override // defpackage.od1
    public final float o() {
        return this.B;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.A + ", fontScale=" + this.B + ", converter=" + this.L + ')';
    }

    @Override // defpackage.od1
    public final long z(float f) {
        return hi2.L(this.L.a(f), 4294967296L);
    }
}
