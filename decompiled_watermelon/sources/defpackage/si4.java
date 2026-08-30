package defpackage;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: si4  reason: default package */
/* loaded from: classes.dex */
public final class si4 extends yy3 implements mf3, gk1 {
    public qi4 j0;
    public boolean k0;
    public ub l0;
    public s01 m0;
    public float n0;
    public b30 o0;

    public static boolean S0(long j) {
        if (!i76.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Preference.DEFAULT_ORDER) < 2139095040) {
            return true;
        }
        return false;
    }

    public static boolean T0(long j) {
        if (!i76.b(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Preference.DEFAULT_ORDER) < 2139095040) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.mf3
    public final int H(fs3 fs3Var, mv3 mv3Var, int i) {
        if (R0()) {
            long U0 = U0(nz0.b(0, i, 0, 0, 13));
            return Math.max(lz0.i(U0), mv3Var.g0(i));
        }
        return mv3Var.g0(i);
    }

    public final boolean R0() {
        if (this.k0 && this.j0.h() != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gk1
    public final void T(xf3 xf3Var) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j;
        rh0 rh0Var = xf3Var.A;
        long h = this.j0.h();
        if (T0(h)) {
            intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (rh0Var.d() >> 32));
        }
        if (S0(h)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (h & 4294967295L));
        } else {
            intBitsToFloat2 = Float.intBitsToFloat((int) (rh0Var.d() & 4294967295L));
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        if (Float.intBitsToFloat((int) (rh0Var.d() >> 32)) == RecyclerView.A1 || Float.intBitsToFloat((int) (rh0Var.d() & 4294967295L)) == RecyclerView.A1) {
            j = 0;
        } else {
            j = ln2.U(floatToRawIntBits, this.m0.d(floatToRawIntBits, rh0Var.d()));
        }
        long a = this.l0.a((Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (rh0Var.d() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (rh0Var.d() & 4294967295L))) & 4294967295L), xf3Var.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((bq0) rh0Var.B.B).e0(f, f2);
        try {
            this.j0.g(xf3Var, j, this.n0, this.o0);
            ((bq0) rh0Var.B.B).e0(-f, -f2);
            xf3Var.a();
        } catch (Throwable th) {
            ((bq0) rh0Var.B.B).e0(-f, -f2);
            throw th;
        }
    }

    public final long U0(long j) {
        boolean z;
        int j2;
        int i;
        float intBitsToFloat;
        float intBitsToFloat2;
        boolean z2 = false;
        if (lz0.d(j) && lz0.c(j)) {
            z = true;
        } else {
            z = false;
        }
        if (lz0.f(j) && lz0.e(j)) {
            z2 = true;
        }
        if ((!R0() && z) || z2) {
            return lz0.a(j, lz0.h(j), 0, lz0.g(j), 0, 10);
        }
        long h = this.j0.h();
        if (T0(h)) {
            j2 = Math.round(Float.intBitsToFloat((int) (h >> 32)));
        } else {
            j2 = lz0.j(j);
        }
        if (S0(h)) {
            i = Math.round(Float.intBitsToFloat((int) (h & 4294967295L)));
        } else {
            i = lz0.i(j);
        }
        int g = nz0.g(j2, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(nz0.f(i, j)) & 4294967295L) | (Float.floatToRawIntBits(g) << 32);
        if (R0()) {
            if (!T0(this.j0.h())) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (this.j0.h() >> 32));
            }
            if (!S0(this.j0.h())) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            } else {
                intBitsToFloat2 = Float.intBitsToFloat((int) (this.j0.h() & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
            if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == RecyclerView.A1 || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == RecyclerView.A1) {
                floatToRawIntBits = 0;
            } else {
                floatToRawIntBits = ln2.U(floatToRawIntBits2, this.m0.d(floatToRawIntBits2, floatToRawIntBits));
            }
        }
        return lz0.a(j, nz0.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, nz0.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.mf3
    public final int Z(fs3 fs3Var, mv3 mv3Var, int i) {
        if (R0()) {
            long U0 = U0(nz0.b(0, 0, 0, i, 7));
            return Math.max(lz0.j(U0), mv3Var.T(i));
        }
        return mv3Var.T(i);
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        yn4 c = mv3Var.c(U0(j));
        return vv3Var.s0(c.A, c.B, qp1.A, new sd(c, 5));
    }

    @Override // defpackage.mf3
    public final int h(fs3 fs3Var, mv3 mv3Var, int i) {
        if (R0()) {
            long U0 = U0(nz0.b(0, 0, 0, i, 7));
            return Math.max(lz0.j(U0), mv3Var.e0(i));
        }
        return mv3Var.e0(i);
    }

    @Override // defpackage.mf3
    public final int r(fs3 fs3Var, mv3 mv3Var, int i) {
        if (R0()) {
            long U0 = U0(nz0.b(0, i, 0, 0, 13));
            return Math.max(lz0.i(U0), mv3Var.f(i));
        }
        return mv3Var.f(i);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.j0 + ", sizeToIntrinsics=" + this.k0 + ", alignment=" + this.l0 + ", alpha=" + this.n0 + ", colorFilter=" + this.o0 + ')';
    }
}
