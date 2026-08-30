package c9;

import a4.r0;
import android.os.SystemClock;
import n2.b1;
import n2.c1;
import n2.f1;
import y3.c0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends n3.b {
    public n3.b X;
    public final n3.b Y;
    public final y3.o Z;

    /* renamed from: b0  reason: collision with root package name */
    public final int f2758b0;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f2759c0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f2762f0;

    /* renamed from: d0  reason: collision with root package name */
    public final c1 f2760d0 = new c1(0);

    /* renamed from: e0  reason: collision with root package name */
    public long f2761e0 = -1;

    /* renamed from: g0  reason: collision with root package name */
    public final b1 f2763g0 = new b1(1.0f);

    /* renamed from: h0  reason: collision with root package name */
    public final f1 f2764h0 = n2.s.w(null);

    public t(n3.b bVar, n3.b bVar2, y3.o oVar, int i2, boolean z10) {
        this.X = bVar;
        this.Y = bVar2;
        this.Z = oVar;
        this.f2758b0 = i2;
        this.f2759c0 = z10;
    }

    @Override // n3.b
    public final void d(float f8) {
        this.f2763g0.h(f8);
    }

    @Override // n3.b
    public final void e(i3.l lVar) {
        this.f2764h0.setValue(lVar);
    }

    @Override // n3.b
    public final long h() {
        long j2;
        boolean z10;
        n3.b bVar = this.X;
        long j10 = 0;
        if (bVar != null) {
            j2 = bVar.h();
        } else {
            j2 = 0;
        }
        n3.b bVar2 = this.Y;
        if (bVar2 != null) {
            j10 = bVar2.h();
        }
        boolean z11 = false;
        if (j2 != 9205357640488583168L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 != 9205357640488583168L) {
            z11 = true;
        }
        if (!z10 || !z11) {
            return 9205357640488583168L;
        }
        return a.a.f(Math.max(h3.e.e(j2), h3.e.e(j10)), Math.max(h3.e.c(j2), h3.e.c(j10)));
    }

    @Override // n3.b
    public final void i(r0 r0Var) {
        float g10;
        boolean z10;
        boolean z11 = this.f2762f0;
        n3.b bVar = this.Y;
        b1 b1Var = this.f2763g0;
        if (z11) {
            j(r0Var, bVar, b1Var.g());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f2761e0 == -1) {
            this.f2761e0 = uptimeMillis;
        }
        float f8 = ((float) (uptimeMillis - this.f2761e0)) / this.f2758b0;
        float g11 = b1Var.g() * p7.j.f(f8, 0.0f, 1.0f);
        if (this.f2759c0) {
            g10 = b1Var.g() - g11;
        } else {
            g10 = b1Var.g();
        }
        if (f8 >= 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2762f0 = z10;
        j(r0Var, this.X, g10);
        j(r0Var, bVar, g11);
        if (this.f2762f0) {
            this.X = null;
            return;
        }
        c1 c1Var = this.f2760d0;
        c1Var.h(c1Var.g() + 1);
    }

    public final void j(r0 r0Var, n3.b bVar, float f8) {
        long p10;
        k3.b bVar2 = r0Var.A;
        if (bVar != null && f8 > 0.0f) {
            long c4 = bVar2.c();
            long h2 = bVar.h();
            if (h2 == 9205357640488583168L || h3.e.f(h2) || c4 == 9205357640488583168L || h3.e.f(c4)) {
                p10 = c4;
            } else {
                p10 = c0.p(h2, this.Z.a(h2, c4));
            }
            int i2 = (c4 > 9205357640488583168L ? 1 : (c4 == 9205357640488583168L ? 0 : -1));
            f1 f1Var = this.f2764h0;
            if (i2 == 0 || h3.e.f(c4)) {
                bVar.g(r0Var, p10, f8, (i3.l) f1Var.getValue());
                return;
            }
            long j2 = p10;
            float f10 = 2;
            float e6 = (h3.e.e(c4) - h3.e.e(j2)) / f10;
            float c10 = (h3.e.c(c4) - h3.e.c(j2)) / f10;
            ((d2.t) bVar2.B.B).z(e6, c10, e6, c10);
            bVar.g(r0Var, j2, f8, (i3.l) f1Var.getValue());
            float f11 = -e6;
            float f12 = -c10;
            ((d2.t) bVar2.B.B).z(f11, f12, f11, f12);
        }
    }
}
