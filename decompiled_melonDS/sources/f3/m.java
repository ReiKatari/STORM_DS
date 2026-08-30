package f3;

import a4.a0;
import a4.p;
import a4.r0;
import a4.x0;
import a5.t;
import androidx.preference.Preference;
import b3.o;
import y3.c0;
import y3.i1;
import y3.u0;
import y3.w0;
import zb.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends o implements a0, p {

    /* renamed from: i0  reason: collision with root package name */
    public n3.b f4831i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f4832j0;

    /* renamed from: k0  reason: collision with root package name */
    public b3.d f4833k0;

    /* renamed from: l0  reason: collision with root package name */
    public y3.o f4834l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f4835m0;

    /* renamed from: n0  reason: collision with root package name */
    public i3.l f4836n0;

    public static boolean P0(long j2) {
        if (!h3.e.b(j2, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L))) & Preference.DEFAULT_ORDER) < 2139095040) {
            return true;
        }
        return false;
    }

    public static boolean Q0(long j2) {
        if (!h3.e.b(j2, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32))) & Preference.DEFAULT_ORDER) < 2139095040) {
            return true;
        }
        return false;
    }

    @Override // a4.a0
    public final int B0(x0 x0Var, u0 u0Var, int i2) {
        if (O0()) {
            long R0 = R0(x4.b.b(i2, 0, 13));
            return Math.max(x4.a.i(R0), u0Var.h0(i2));
        }
        return u0Var.h0(i2);
    }

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    @Override // a4.a0
    public final int K(x0 x0Var, u0 u0Var, int i2) {
        if (O0()) {
            long R0 = R0(x4.b.b(i2, 0, 13));
            return Math.max(x4.a.i(R0), u0Var.g(i2));
        }
        return u0Var.g(i2);
    }

    public final boolean O0() {
        if (this.f4832j0 && this.f4831i0.h() != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    public final long R0(long j2) {
        boolean z10;
        int j10;
        int i2;
        float intBitsToFloat;
        float intBitsToFloat2;
        boolean z11 = false;
        if (x4.a.d(j2) && x4.a.c(j2)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (x4.a.f(j2) && x4.a.e(j2)) {
            z11 = true;
        }
        if ((!O0() && z10) || z11) {
            return x4.a.a(j2, x4.a.h(j2), 0, x4.a.g(j2), 0, 10);
        }
        long h2 = this.f4831i0.h();
        if (Q0(h2)) {
            j10 = Math.round(Float.intBitsToFloat((int) (h2 >> 32)));
        } else {
            j10 = x4.a.j(j2);
        }
        if (P0(h2)) {
            i2 = Math.round(Float.intBitsToFloat((int) (h2 & 4294967295L)));
        } else {
            i2 = x4.a.i(j2);
        }
        int g10 = x4.b.g(j10, j2);
        long floatToRawIntBits = (Float.floatToRawIntBits(x4.b.f(i2, j2)) & 4294967295L) | (Float.floatToRawIntBits(g10) << 32);
        if (O0()) {
            if (!Q0(this.f4831i0.h())) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (this.f4831i0.h() >> 32));
            }
            if (!P0(this.f4831i0.h())) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            } else {
                intBitsToFloat2 = Float.intBitsToFloat((int) (this.f4831i0.h() & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
            if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == 0.0f || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == 0.0f) {
                floatToRawIntBits = 0;
            } else {
                floatToRawIntBits = c0.p(floatToRawIntBits2, this.f4834l0.a(floatToRawIntBits2, floatToRawIntBits));
            }
        }
        return x4.a.a(j2, x4.b.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j2), 0, x4.b.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j2), 0, 10);
    }

    @Override // a4.a0
    public final w0 d(y3.x0 x0Var, u0 u0Var, long j2) {
        i1 e6 = u0Var.e(R0(j2));
        return x0Var.u0(e6.A, e6.B, r.A, new t(e6, 2));
    }

    @Override // a4.a0
    public final int p0(x0 x0Var, u0 u0Var, int i2) {
        if (O0()) {
            long R0 = R0(x4.b.b(0, i2, 7));
            return Math.max(x4.a.j(R0), u0Var.g0(i2));
        }
        return u0Var.g0(i2);
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.f4831i0 + ", sizeToIntrinsics=" + this.f4832j0 + ", alignment=" + this.f4833k0 + ", alpha=" + this.f4835m0 + ", colorFilter=" + this.f4836n0 + ')';
    }

    @Override // a4.a0
    public final int y0(x0 x0Var, u0 u0Var, int i2) {
        if (O0()) {
            long R0 = R0(x4.b.b(0, i2, 7));
            return Math.max(x4.a.j(R0), u0Var.b0(i2));
        }
        return u0Var.b0(i2);
    }

    @Override // a4.p
    public final void z(r0 r0Var) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j2;
        k3.b bVar = r0Var.A;
        long h2 = this.f4831i0.h();
        if (Q0(h2)) {
            intBitsToFloat = Float.intBitsToFloat((int) (h2 >> 32));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (bVar.c() >> 32));
        }
        if (P0(h2)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (h2 & 4294967295L));
        } else {
            intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.c() & 4294967295L));
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        if (Float.intBitsToFloat((int) (bVar.c() >> 32)) == 0.0f || Float.intBitsToFloat((int) (bVar.c() & 4294967295L)) == 0.0f) {
            j2 = 0;
        } else {
            j2 = c0.p(floatToRawIntBits, this.f4834l0.a(floatToRawIntBits, bVar.c()));
        }
        long a10 = this.f4833k0.a((Math.round(Float.intBitsToFloat((int) (j2 >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (bVar.c() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (bVar.c() & 4294967295L))) & 4294967295L), r0Var.getLayoutDirection());
        float f8 = (int) (a10 >> 32);
        float f10 = (int) (a10 & 4294967295L);
        ((d2.t) bVar.B.B).F(f8, f10);
        try {
            this.f4831i0.g(r0Var, j2, this.f4835m0, this.f4836n0);
            ((d2.t) bVar.B.B).F(-f8, -f10);
            r0Var.a();
        } catch (Throwable th2) {
            ((d2.t) bVar.B.B).F(-f8, -f10);
            throw th2;
        }
    }
}
