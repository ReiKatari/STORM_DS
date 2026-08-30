package b4;

import android.os.Build;
import android.view.ViewParent;
import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y1 implements a4.b2 {
    public l3.b A;
    public final i3.x B;
    public final x L;
    public mc.p R;
    public mc.a X;
    public long Y;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public final float[] f2014b0;

    /* renamed from: c0  reason: collision with root package name */
    public float[] f2015c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f2016d0;

    /* renamed from: e0  reason: collision with root package name */
    public x4.c f2017e0;

    /* renamed from: f0  reason: collision with root package name */
    public x4.m f2018f0;

    /* renamed from: g0  reason: collision with root package name */
    public final k3.b f2019g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f2020h0;

    /* renamed from: i0  reason: collision with root package name */
    public long f2021i0;

    /* renamed from: j0  reason: collision with root package name */
    public i3.z f2022j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f2023k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f2024l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f2025m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f2026n0;

    /* renamed from: o0  reason: collision with root package name */
    public final a4.a f2027o0;

    public y1(l3.b bVar, i3.x xVar, x xVar2, mc.p pVar, mc.a aVar) {
        this.A = bVar;
        this.B = xVar;
        this.L = xVar2;
        this.R = pVar;
        this.X = aVar;
        long j2 = (long) Preference.DEFAULT_ORDER;
        this.Y = (j2 & 4294967295L) | (j2 << 32);
        this.f2014b0 = i3.e0.a();
        this.f2017e0 = p7.l.c();
        this.f2018f0 = x4.m.Ltr;
        this.f2019g0 = new k3.b();
        this.f2021i0 = i3.q0.f6677b;
        this.f2025m0 = true;
        this.f2027o0 = new a4.a(8, this);
    }

    public final float[] a() {
        float[] fArr = this.f2015c0;
        if (fArr == null) {
            fArr = i3.e0.a();
            this.f2015c0 = fArr;
        }
        if (!this.f2024l0) {
            if (Float.isNaN(fArr[0])) {
                return null;
            }
        } else {
            this.f2024l0 = false;
            float[] b10 = b();
            if (this.f2025m0) {
                return b10;
            }
            if (!l0.m(b10, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        }
        return fArr;
    }

    public final float[] b() {
        boolean z10 = this.f2023k0;
        float[] fArr = this.f2014b0;
        if (z10) {
            l3.b bVar = this.A;
            long j2 = bVar.f8702v;
            l3.d dVar = bVar.f8682a;
            if ((9223372034707292159L & j2) == 9205357640488583168L) {
                j2 = a.a.v(zb.k.T(this.Y));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            float s10 = dVar.s();
            float f8 = dVar.f();
            float w10 = dVar.w();
            float D = dVar.D();
            float I = dVar.I();
            float d4 = dVar.d();
            float H = dVar.H();
            double d10 = w10 * 0.017453292519943295d;
            float sin = (float) Math.sin(d10);
            float cos = (float) Math.cos(d10);
            float f10 = -sin;
            float f11 = (f8 * cos) - (0.0f * sin);
            float f12 = (0.0f * cos) + (f8 * sin);
            double d11 = D * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d11);
            float cos2 = (float) Math.cos(d11);
            float f13 = -sin2;
            float f14 = sin * sin2;
            float f15 = sin * cos2;
            float f16 = cos * sin2;
            float f17 = cos * cos2;
            float f18 = (f12 * sin2) + (s10 * cos2);
            float f19 = (f12 * cos2) + ((-s10) * sin2);
            double d12 = I * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d12);
            float cos3 = (float) Math.cos(d12);
            float f20 = -sin3;
            float f21 = sin3 * cos;
            float f22 = ((f14 * sin3) + (cos2 * cos3)) * d4;
            float f23 = f21 * d4;
            float f24 = ((sin3 * f15) + (cos3 * f13)) * d4;
            float f25 = ((cos3 * f14) + (f20 * cos2)) * H;
            float f26 = cos * cos3 * H;
            float f27 = ((cos3 * f15) + (f20 * f13)) * H;
            float f28 = f16 * 1.0f;
            float f29 = f10 * 1.0f;
            float f30 = f17 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f22;
                fArr[1] = f23;
                fArr[2] = f24;
                fArr[3] = 0.0f;
                fArr[4] = f25;
                fArr[5] = f26;
                fArr[6] = f27;
                fArr[7] = 0.0f;
                fArr[8] = f28;
                fArr[9] = f29;
                fArr[10] = f30;
                fArr[11] = 0.0f;
                float f31 = -intBitsToFloat;
                fArr[12] = ((f22 * f31) - (intBitsToFloat2 * f25)) + f18 + intBitsToFloat;
                fArr[13] = ((f23 * f31) - (intBitsToFloat2 * f26)) + f11 + intBitsToFloat2;
                fArr[14] = ((f31 * f24) - (intBitsToFloat2 * f27)) + f19;
                fArr[15] = 1.0f;
            }
            this.f2023k0 = false;
            this.f2025m0 = i3.z.p(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (!this.f2016d0 && !this.Z) {
            this.L.invalidate();
            f(true);
        }
    }

    public final void d(long j2) {
        x xVar = this.L;
        if (xVar.f1970i0) {
            xVar.I(-4.0f);
        }
        l3.b bVar = this.A;
        if (!x4.j.a(bVar.f8700t, j2)) {
            bVar.f8700t = j2;
            bVar.f8682a.r(bVar.f8701u, (int) (j2 >> 32), (int) (j2 & 4294967295L));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ViewParent parent = xVar.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(xVar, xVar);
                return;
            }
            return;
        }
        xVar.invalidate();
    }

    public final void e(long j2) {
        if (!x4.l.b(j2, this.Y)) {
            x xVar = this.L;
            if (xVar.f1970i0) {
                xVar.I(-4.0f);
            }
            this.Y = j2;
            c();
        }
    }

    public final void f(boolean z10) {
        if (z10 != this.f2016d0) {
            this.f2016d0 = z10;
            x xVar = this.L;
            a1.h0 h0Var = xVar.A0;
            boolean z11 = xVar.C0;
            if (!z10) {
                if (!z11) {
                    h0Var.j(this);
                    a1.h0 h0Var2 = xVar.B0;
                    if (h0Var2 != null) {
                        h0Var2.j(this);
                    }
                }
            } else if (!z11) {
                h0Var.a(this);
            } else {
                a1.h0 h0Var3 = xVar.B0;
                if (h0Var3 == null) {
                    h0Var3 = new a1.h0();
                    xVar.B0 = h0Var3;
                }
                h0Var3.a(this);
            }
        }
    }

    public final void g() {
        if (this.f2016d0) {
            if (!i3.q0.a(this.f2021i0, i3.q0.f6677b) && !x4.l.b(this.A.f8701u, this.Y)) {
                l3.b bVar = this.A;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.f2021i0 >> 32)) * ((int) (this.Y >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f2021i0 & 4294967295L)) * ((int) (this.Y & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                if (!h3.b.b(bVar.f8702v, floatToRawIntBits)) {
                    bVar.f8702v = floatToRawIntBits;
                    bVar.f8682a.K(floatToRawIntBits);
                }
            }
            this.A.e(this.f2017e0, this.f2018f0, this.Y, this.f2027o0);
            f(false);
        }
    }
}
