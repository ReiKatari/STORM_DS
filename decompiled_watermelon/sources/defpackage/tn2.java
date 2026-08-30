package defpackage;

import android.os.Build;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tn2  reason: default package */
/* loaded from: classes.dex */
public final class tn2 implements vg4 {
    public pn2 A;
    public final on2 B;
    public final ee L;
    public aj2 R;
    public ki2 X;
    public boolean Z;
    public float[] d0;
    public boolean e0;
    public int i0;
    public jk2 k0;
    public boolean l0;
    public boolean m0;
    public boolean o0;
    public long Y = 9223372034707292159L;
    public final float[] c0 = kv3.a();
    public od1 f0 = w81.d();
    public sd3 g0 = sd3.Ltr;
    public final rh0 h0 = new rh0();
    public long j0 = sw6.b;
    public boolean n0 = true;
    public final yb p0 = new yb(17, this);

    public tn2(pn2 pn2Var, on2 on2Var, ee eeVar, aj2 aj2Var, ki2 ki2Var) {
        this.A = pn2Var;
        this.B = on2Var;
        this.L = eeVar;
        this.R = aj2Var;
        this.X = ki2Var;
    }

    public final float[] a() {
        float[] fArr = this.d0;
        if (fArr == null) {
            fArr = kv3.a();
            this.d0 = fArr;
        }
        if (!this.m0) {
            if (Float.isNaN(fArr[0])) {
                return null;
            }
        } else {
            this.m0 = false;
            float[] b = b();
            if (this.n0) {
                return b;
            }
            if (!nl2.N(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        }
        return fArr;
    }

    public final float[] b() {
        boolean z = this.l0;
        float[] fArr = this.c0;
        if (z) {
            pn2 pn2Var = this.A;
            long j = pn2Var.v;
            rn2 rn2Var = pn2Var.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = mj2.y(hk2.U(this.Y));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float t = rn2Var.t();
            float f = rn2Var.f();
            float z2 = rn2Var.z();
            float G = rn2Var.G();
            float L = rn2Var.L();
            float d = rn2Var.d();
            float K = rn2Var.K();
            double d2 = z2 * 0.017453292519943295d;
            float sin = (float) Math.sin(d2);
            float cos = (float) Math.cos(d2);
            float f2 = -sin;
            float f3 = (f * cos) - (RecyclerView.A1 * sin);
            float f4 = (RecyclerView.A1 * cos) + (f * sin);
            double d3 = G * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d3);
            float cos2 = (float) Math.cos(d3);
            float f5 = -sin2;
            float f6 = sin * sin2;
            float f7 = sin * cos2;
            float f8 = cos * sin2;
            float f9 = cos * cos2;
            float f10 = (f4 * sin2) + (t * cos2);
            float f11 = (f4 * cos2) + ((-t) * sin2);
            double d4 = L * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d4);
            float cos3 = (float) Math.cos(d4);
            float f12 = -sin3;
            float f13 = sin3 * cos;
            float f14 = ((f6 * sin3) + (cos2 * cos3)) * d;
            float f15 = f13 * d;
            float f16 = ((sin3 * f7) + (cos3 * f5)) * d;
            float f17 = ((cos3 * f6) + (f12 * cos2)) * K;
            float f18 = cos * cos3 * K;
            float f19 = ((cos3 * f7) + (f12 * f5)) * K;
            float f20 = f8 * 1.0f;
            float f21 = f2 * 1.0f;
            float f22 = f9 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f14;
                fArr[1] = f15;
                fArr[2] = f16;
                fArr[3] = 0.0f;
                fArr[4] = f17;
                fArr[5] = f18;
                fArr[6] = f19;
                fArr[7] = 0.0f;
                fArr[8] = f20;
                fArr[9] = f21;
                fArr[10] = f22;
                fArr[11] = 0.0f;
                float f23 = -intBitsToFloat;
                fArr[12] = ((f14 * f23) - (intBitsToFloat2 * f17)) + f10 + intBitsToFloat;
                fArr[13] = ((f15 * f23) - (intBitsToFloat2 * f18)) + f3 + intBitsToFloat2;
                fArr[14] = ((f23 * f16) - (intBitsToFloat2 * f19)) + f11;
                fArr[15] = 1.0f;
            }
            this.l0 = false;
            this.n0 = yf2.B(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (!this.e0 && !this.Z) {
            this.L.invalidate();
            f(true);
        }
    }

    public final void d(long j) {
        boolean m = ee.m();
        ee eeVar = this.L;
        if (m) {
            eeVar.J(-4.0f);
        }
        pn2 pn2Var = this.A;
        if (!a33.a(pn2Var.t, j)) {
            pn2Var.t = j;
            pn2Var.a.s(pn2Var.u, (int) (j >> 32), (int) (j & 4294967295L));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = eeVar.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(eeVar, eeVar);
                return;
            }
            return;
        }
        eeVar.invalidate();
    }

    public final void e(long j) {
        if (!i33.b(j, this.Y)) {
            if (ee.m()) {
                this.L.J(-4.0f);
            }
            this.Y = j;
            c();
        }
    }

    public final void f(boolean z) {
        if (z != this.e0) {
            this.e0 = z;
            ee eeVar = this.L;
            w14 w14Var = eeVar.C0;
            boolean z2 = eeVar.E0;
            if (!z) {
                if (!z2) {
                    w14Var.j(this);
                    w14 w14Var2 = eeVar.D0;
                    if (w14Var2 != null) {
                        w14Var2.j(this);
                    }
                }
            } else if (!z2) {
                w14Var.a(this);
            } else {
                w14 w14Var3 = eeVar.D0;
                if (w14Var3 == null) {
                    w14Var3 = new w14();
                    eeVar.D0 = w14Var3;
                }
                w14Var3.a(this);
            }
        }
    }

    public final void g() {
        ee.m();
        if (this.e0) {
            if (!sw6.a(this.j0, sw6.b) && !i33.b(this.A.u, this.Y)) {
                pn2 pn2Var = this.A;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.j0 >> 32)) * ((int) (this.Y >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.j0 & 4294967295L)) * ((int) (this.Y & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                if (!mb4.b(pn2Var.v, floatToRawIntBits)) {
                    pn2Var.v = floatToRawIntBits;
                    pn2Var.a.N(floatToRawIntBits);
                }
            }
            this.A.e(this.f0, this.g0, this.Y, this.p0);
            f(false);
        }
    }
}
