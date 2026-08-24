package defpackage;

import android.os.Build;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xt2  reason: default package */
/* loaded from: classes.dex */
public final class xt2 implements yp4 {
    public ut2 A;
    public final tt2 B;
    public final te L;
    public eo2 R;
    public on2 X;
    public boolean Z;
    public float[] e0;
    public boolean f0;
    public int j0;
    public mp2 l0;
    public boolean m0;
    public boolean n0;
    public boolean p0;
    public long Y = 9223372034707292159L;
    public final float[] d0 = v24.a();
    public qh1 g0 = f04.h();
    public kk3 h0 = kk3.Ltr;
    public final zj0 i0 = new zj0();
    public long k0 = i97.b;
    public boolean o0 = true;
    public final mc q0 = new mc(this, 16);

    public xt2(ut2 ut2Var, tt2 tt2Var, te teVar, eo2 eo2Var, on2 on2Var) {
        this.A = ut2Var;
        this.B = tt2Var;
        this.L = teVar;
        this.R = eo2Var;
        this.X = on2Var;
    }

    public final float[] a() {
        float[] fArr = this.e0;
        if (fArr == null) {
            fArr = v24.a();
            this.e0 = fArr;
        }
        if (!this.n0) {
            if (Float.isNaN(fArr[0])) {
                return null;
            }
        } else {
            this.n0 = false;
            float[] b = b();
            if (this.o0) {
                return b;
            }
            if (!jx2.w(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        }
        return fArr;
    }

    public final float[] b() {
        boolean z = this.m0;
        float[] fArr = this.d0;
        if (z) {
            ut2 ut2Var = this.A;
            long j = ut2Var.v;
            wt2 wt2Var = ut2Var.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = ii2.v(qo2.S(this.Y));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float C = wt2Var.C();
            float u = wt2Var.u();
            float F = wt2Var.F();
            float n = wt2Var.n();
            float p = wt2Var.p();
            float b = wt2Var.b();
            float N = wt2Var.N();
            double d = F * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = -sin;
            float f2 = (u * cos) - (RecyclerView.B1 * sin);
            float f3 = (RecyclerView.B1 * cos) + (u * sin);
            double d2 = n * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d2);
            float cos2 = (float) Math.cos(d2);
            float f4 = -sin2;
            float f5 = sin * sin2;
            float f6 = sin * cos2;
            float f7 = cos * sin2;
            float f8 = cos * cos2;
            float f9 = (f3 * sin2) + (C * cos2);
            float f10 = (f3 * cos2) + ((-C) * sin2);
            double d3 = p * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d3);
            float cos3 = (float) Math.cos(d3);
            float f11 = -sin3;
            float f12 = sin3 * cos;
            float f13 = ((f5 * sin3) + (cos2 * cos3)) * b;
            float f14 = f12 * b;
            float f15 = ((sin3 * f6) + (cos3 * f4)) * b;
            float f16 = ((cos3 * f5) + (f11 * cos2)) * N;
            float f17 = cos * cos3 * N;
            float f18 = ((cos3 * f6) + (f11 * f4)) * N;
            float f19 = f7 * 1.0f;
            float f20 = f * 1.0f;
            float f21 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f13;
                fArr[1] = f14;
                fArr[2] = f15;
                fArr[3] = 0.0f;
                fArr[4] = f16;
                fArr[5] = f17;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = f19;
                fArr[9] = f20;
                fArr[10] = f21;
                fArr[11] = 0.0f;
                float f22 = -intBitsToFloat;
                fArr[12] = ((f13 * f22) - (intBitsToFloat2 * f16)) + f9 + intBitsToFloat;
                fArr[13] = ((f14 * f22) - (intBitsToFloat2 * f17)) + f2 + intBitsToFloat2;
                fArr[14] = ((f22 * f15) - (intBitsToFloat2 * f18)) + f10;
                fArr[15] = 1.0f;
            }
            this.m0 = false;
            this.o0 = nj2.w(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (!this.f0 && !this.Z) {
            this.L.invalidate();
            f(true);
        }
    }

    public final void d(long j) {
        boolean m = te.m();
        te teVar = this.L;
        if (m) {
            teVar.J(-4.0f);
        }
        ut2 ut2Var = this.A;
        if (!i93.a(ut2Var.t, j)) {
            ut2Var.t = j;
            ut2Var.a.B(ut2Var.u, (int) (j >> 32), (int) (j & 4294967295L));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = teVar.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(teVar, teVar);
                return;
            }
            return;
        }
        teVar.invalidate();
    }

    public final void e(long j) {
        if (!q93.b(j, this.Y)) {
            if (te.m()) {
                this.L.J(-4.0f);
            }
            this.Y = j;
            c();
        }
    }

    public final void f(boolean z) {
        if (z != this.f0) {
            this.f0 = z;
            te teVar = this.L;
            ca4 ca4Var = teVar.D0;
            boolean z2 = teVar.F0;
            if (!z) {
                if (!z2) {
                    ca4Var.j(this);
                    ca4 ca4Var2 = teVar.E0;
                    if (ca4Var2 != null) {
                        ca4Var2.j(this);
                    }
                }
            } else if (!z2) {
                ca4Var.a(this);
            } else {
                ca4 ca4Var3 = teVar.E0;
                if (ca4Var3 == null) {
                    ca4Var3 = new ca4();
                    teVar.E0 = ca4Var3;
                }
                ca4Var3.a(this);
            }
        }
    }

    public final void g() {
        te.m();
        if (this.f0) {
            if (!i97.a(this.k0, i97.b) && !q93.b(this.A.u, this.Y)) {
                ut2 ut2Var = this.A;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.k0 >> 32)) * ((int) (this.Y >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.k0 & 4294967295L)) * ((int) (this.Y & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                if (!jk4.c(ut2Var.v, floatToRawIntBits)) {
                    ut2Var.v = floatToRawIntBits;
                    ut2Var.a.q(floatToRawIntBits);
                }
            }
            this.A.e(this.g0, this.h0, this.Y, this.q0);
            f(false);
        }
    }
}
