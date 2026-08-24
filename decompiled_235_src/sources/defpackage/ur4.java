package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ur4  reason: default package */
/* loaded from: classes.dex */
public final class ur4 extends z64 implements jm3, mo1 {
    public sr4 k0;
    public boolean l0;
    public ic m0;
    public z31 n0;
    public float o0;
    public z40 p0;

    public static boolean S0(long j) {
        if (!xi6.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    public static boolean T0(long j) {
        if (!xi6.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    @Override // defpackage.z64
    public final boolean G0() {
        return false;
    }

    public final boolean R0() {
        if (this.l0 && this.k0.h() != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    public final long U0(long j) {
        boolean z;
        int j2;
        int i;
        float intBitsToFloat;
        float intBitsToFloat2;
        boolean z2 = false;
        if (q21.d(j) && q21.c(j)) {
            z = true;
        } else {
            z = false;
        }
        if (q21.f(j) && q21.e(j)) {
            z2 = true;
        }
        if ((!R0() && z) || z2) {
            return q21.a(j, q21.h(j), 0, q21.g(j), 0, 10);
        }
        long h = this.k0.h();
        if (T0(h)) {
            j2 = Math.round(Float.intBitsToFloat((int) (h >> 32)));
        } else {
            j2 = q21.j(j);
        }
        if (S0(h)) {
            i = Math.round(Float.intBitsToFloat((int) (h & 4294967295L)));
        } else {
            i = q21.i(j);
        }
        int g = s21.g(j2, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(s21.f(i, j)) & 4294967295L) | (Float.floatToRawIntBits(g) << 32);
        if (R0()) {
            if (!T0(this.k0.h())) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (this.k0.h() >> 32));
            }
            if (!S0(this.k0.h())) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            } else {
                intBitsToFloat2 = Float.intBitsToFloat((int) (this.k0.h() & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
            if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == RecyclerView.B1 || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == RecyclerView.B1) {
                floatToRawIntBits = 0;
            } else {
                floatToRawIntBits = kn2.c0(floatToRawIntBits2, this.n0.c(floatToRawIntBits2, floatToRawIntBits));
            }
        }
        return q21.a(j, s21.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, s21.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.jm3
    public final int Z(kz3 kz3Var, x24 x24Var, int i) {
        if (R0()) {
            long U0 = U0(s21.b(0, i, 0, 0, 13));
            return Math.max(q21.i(U0), x24Var.c(i));
        }
        return x24Var.c(i);
    }

    @Override // defpackage.jm3
    public final f34 c(g34 g34Var, x24 x24Var, long j) {
        dx4 y = x24Var.y(U0(j));
        return g34Var.K(y.A, y.B, zt1.A, new he(y, 5));
    }

    @Override // defpackage.jm3
    public final int f(kz3 kz3Var, x24 x24Var, int i) {
        if (R0()) {
            long U0 = U0(s21.b(0, 0, 0, i, 7));
            return Math.max(q21.j(U0), x24Var.u(i));
        }
        return x24Var.u(i);
    }

    @Override // defpackage.jm3
    public final int h0(kz3 kz3Var, x24 x24Var, int i) {
        if (R0()) {
            long U0 = U0(s21.b(0, i, 0, 0, 13));
            return Math.max(q21.i(U0), x24Var.V(i));
        }
        return x24Var.V(i);
    }

    @Override // defpackage.mo1
    public final void m0(um3 um3Var) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j;
        zj0 zj0Var = um3Var.A;
        long h = this.k0.h();
        if (T0(h)) {
            intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (zj0Var.e() >> 32));
        }
        if (S0(h)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (h & 4294967295L));
        } else {
            intBitsToFloat2 = Float.intBitsToFloat((int) (zj0Var.e() & 4294967295L));
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        if (Float.intBitsToFloat((int) (zj0Var.e() >> 32)) == RecyclerView.B1 || Float.intBitsToFloat((int) (zj0Var.e() & 4294967295L)) == RecyclerView.B1) {
            j = 0;
        } else {
            j = kn2.c0(floatToRawIntBits, this.n0.c(floatToRawIntBits, zj0Var.e()));
        }
        long a = this.m0.a((Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (zj0Var.e() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (zj0Var.e() & 4294967295L))) & 4294967295L), um3Var.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((os0) zj0Var.B.B).g0(f, f2);
        try {
            this.k0.g(um3Var, j, this.o0, this.p0);
            ((os0) zj0Var.B.B).g0(-f, -f2);
            um3Var.b();
        } catch (Throwable th) {
            ((os0) zj0Var.B.B).g0(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.jm3
    public final int s0(kz3 kz3Var, x24 x24Var, int i) {
        if (R0()) {
            long U0 = U0(s21.b(0, 0, 0, i, 7));
            return Math.max(q21.j(U0), x24Var.n(i));
        }
        return x24Var.n(i);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.k0 + ", sizeToIntrinsics=" + this.l0 + ", alignment=" + this.m0 + ", alpha=" + this.o0 + ", colorFilter=" + this.p0 + ')';
    }
}
