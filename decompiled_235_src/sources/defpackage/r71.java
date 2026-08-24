package defpackage;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r71  reason: default package */
/* loaded from: classes.dex */
public final class r71 extends sr4 {
    public sr4 X;
    public final sr4 Y;
    public final z31 Z;
    public final int d0;
    public final boolean e0;
    public boolean h0;
    public final ss4 f0 = new ss4(0);
    public long g0 = -1;
    public final rs4 i0 = new rs4(1.0f);
    public final vs4 j0 = np2.Y(null);

    public r71(sr4 sr4Var, sr4 sr4Var2, z31 z31Var, int i, boolean z) {
        this.X = sr4Var;
        this.Y = sr4Var2;
        this.Z = z31Var;
        this.d0 = i;
        this.e0 = z;
    }

    @Override // defpackage.sr4
    public final void d(float f) {
        this.i0.i(f);
    }

    @Override // defpackage.sr4
    public final void e(z40 z40Var) {
        this.j0.setValue(z40Var);
    }

    @Override // defpackage.sr4
    public final long h() {
        long j;
        boolean z;
        sr4 sr4Var = this.X;
        long j2 = 0;
        if (sr4Var != null) {
            j = sr4Var.h();
        } else {
            j = 0;
        }
        sr4 sr4Var2 = this.Y;
        if (sr4Var2 != null) {
            j2 = sr4Var2.h();
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
        return ii2.n(Math.max(xi6.e(j), xi6.e(j2)), Math.max(xi6.c(j), xi6.c(j2)));
    }

    @Override // defpackage.sr4
    public final void i(um3 um3Var) {
        float h;
        boolean z;
        boolean z2 = this.h0;
        sr4 sr4Var = this.Y;
        rs4 rs4Var = this.i0;
        if (z2) {
            j(um3Var, sr4Var, rs4Var.h());
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.g0 == -1) {
            this.g0 = uptimeMillis;
        }
        float f = ((float) (uptimeMillis - this.g0)) / this.d0;
        float h2 = rs4Var.h() * gi2.p(f, RecyclerView.B1, 1.0f);
        if (this.e0) {
            h = rs4Var.h() - h2;
        } else {
            h = rs4Var.h();
        }
        if (f >= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.h0 = z;
        j(um3Var, this.X, h);
        j(um3Var, sr4Var, h2);
        if (this.h0) {
            this.X = null;
            return;
        }
        ss4 ss4Var = this.f0;
        ss4Var.i(ss4Var.h() + 1);
    }

    public final void j(um3 um3Var, sr4 sr4Var, float f) {
        long c0;
        zj0 zj0Var = um3Var.A;
        if (sr4Var != null && f > RecyclerView.B1) {
            long e = zj0Var.e();
            long h = sr4Var.h();
            if (h == 9205357640488583168L || xi6.f(h) || e == 9205357640488583168L || xi6.f(e)) {
                c0 = e;
            } else {
                c0 = kn2.c0(h, this.Z.c(h, e));
            }
            int i = (e > 9205357640488583168L ? 1 : (e == 9205357640488583168L ? 0 : -1));
            vs4 vs4Var = this.j0;
            if (i == 0 || xi6.f(e)) {
                sr4Var.g(um3Var, c0, f, (z40) vs4Var.getValue());
                return;
            }
            float e2 = (xi6.e(e) - xi6.e(c0)) / 2.0f;
            float c = (xi6.c(e) - xi6.c(c0)) / 2.0f;
            ((os0) zj0Var.B.B).c0(e2, c, e2, c);
            sr4Var.g(um3Var, c0, f, (z40) vs4Var.getValue());
            float f2 = -e2;
            float f3 = -c;
            ((os0) zj0Var.B.B).c0(f2, f3, f2, f3);
        }
    }
}
