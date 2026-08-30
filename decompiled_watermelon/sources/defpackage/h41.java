package defpackage;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h41  reason: default package */
/* loaded from: classes.dex */
public final class h41 extends qi4 {
    public qi4 X;
    public final qi4 Y;
    public final s01 Z;
    public final int c0;
    public final boolean d0;
    public boolean g0;
    public final qj4 e0 = new qj4(0);
    public long f0 = -1;
    public final pj4 h0 = new pj4(1.0f);
    public final tj4 i0 = me2.G(null);

    public h41(qi4 qi4Var, qi4 qi4Var2, s01 s01Var, int i, boolean z) {
        this.X = qi4Var;
        this.Y = qi4Var2;
        this.Z = s01Var;
        this.c0 = i;
        this.d0 = z;
    }

    @Override // defpackage.qi4
    public final void d(float f) {
        this.h0.i(f);
    }

    @Override // defpackage.qi4
    public final void e(b30 b30Var) {
        this.i0.setValue(b30Var);
    }

    @Override // defpackage.qi4
    public final long h() {
        long j;
        boolean z;
        qi4 qi4Var = this.X;
        long j2 = 0;
        if (qi4Var != null) {
            j = qi4Var.h();
        } else {
            j = 0;
        }
        qi4 qi4Var2 = this.Y;
        if (qi4Var2 != null) {
            j2 = qi4Var2.h();
        }
        boolean z2 = false;
        if (j != 9205357640488583168L) {
            z = true;
        } else {
            z = false;
        }
        if (j2 != 9205357640488583168L) {
            z2 = true;
        }
        if (!z || !z2) {
            return 9205357640488583168L;
        }
        return mj2.d(Math.max(i76.e(j), i76.e(j2)), Math.max(i76.c(j), i76.c(j2)));
    }

    @Override // defpackage.qi4
    public final void i(xf3 xf3Var) {
        float h;
        boolean z;
        boolean z2 = this.g0;
        qi4 qi4Var = this.Y;
        pj4 pj4Var = this.h0;
        if (z2) {
            j(xf3Var, qi4Var, pj4Var.h());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f0 == -1) {
            this.f0 = uptimeMillis;
        }
        float f = ((float) (uptimeMillis - this.f0)) / this.c0;
        float h2 = pj4Var.h() * io2.l(f, RecyclerView.A1, 1.0f);
        if (this.d0) {
            h = pj4Var.h() - h2;
        } else {
            h = pj4Var.h();
        }
        if (f >= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.g0 = z;
        j(xf3Var, this.X, h);
        j(xf3Var, qi4Var, h2);
        if (this.g0) {
            this.X = null;
            return;
        }
        qj4 qj4Var = this.e0;
        qj4Var.i(qj4Var.h() + 1);
    }

    public final void j(xf3 xf3Var, qi4 qi4Var, float f) {
        long U;
        rh0 rh0Var = xf3Var.A;
        if (qi4Var != null && f > RecyclerView.A1) {
            long d = rh0Var.d();
            long h = qi4Var.h();
            if (h == 9205357640488583168L || i76.f(h) || d == 9205357640488583168L || i76.f(d)) {
                U = d;
            } else {
                U = ln2.U(h, this.Z.d(h, d));
            }
            int i = (d > 9205357640488583168L ? 1 : (d == 9205357640488583168L ? 0 : -1));
            tj4 tj4Var = this.i0;
            if (i == 0 || i76.f(d)) {
                qi4Var.g(xf3Var, U, f, (b30) tj4Var.getValue());
                return;
            }
            float e = (i76.e(d) - i76.e(U)) / 2.0f;
            float c = (i76.c(d) - i76.c(U)) / 2.0f;
            ((bq0) rh0Var.B.B).a0(e, c, e, c);
            qi4Var.g(xf3Var, U, f, (b30) tj4Var.getValue());
            float f2 = -e;
            float f3 = -c;
            ((bq0) rh0Var.B.B).a0(f2, f3, f2, f3);
        }
    }
}
