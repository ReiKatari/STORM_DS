package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uh1  reason: default package */
/* loaded from: classes.dex */
public final class uh1 implements qh1 {
    public final float A;
    public final float B;
    public final fj2 L;

    public uh1(float f, float f2, fj2 fj2Var) {
        this.A = f;
        this.B = f2;
        this.L = fj2Var;
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
        if (this != obj) {
            if (obj instanceof uh1) {
                uh1 uh1Var = (uh1) obj;
                if (Float.compare(this.A, uh1Var.A) != 0 || Float.compare(this.B, uh1Var.B) != 0 || !this.L.equals(uh1Var.L)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.L.hashCode() + xg6.a(this.B, Float.hashCode(this.A) * 31, 31);
    }

    @Override // defpackage.qh1
    public final long p(float f) {
        return hi2.J(this.L.a(f), 4294967296L);
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.A + ", fontScale=" + this.B + ", converter=" + this.L + ')';
    }

    @Override // defpackage.qh1
    public final float x(long j) {
        if (y47.a(x47.b(j), 4294967296L)) {
            return this.L.b(x47.c(j));
        }
        i.m("Only Sp can convert to Px");
        return RecyclerView.B1;
    }
}
