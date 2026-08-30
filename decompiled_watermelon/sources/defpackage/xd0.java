package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xd0  reason: default package */
/* loaded from: classes.dex */
public final class xd0 implements vd0 {
    public final j57 A;
    public final td0 B;
    public final mc0 L;
    public final n57 R;
    public final jf0 X;
    public final String Y;
    public fc0 Z;
    public final int c0;
    public final aw d0;

    public xd0(an1 an1Var, j57 j57Var, td0 td0Var, mc0 mc0Var, n57 n57Var, jf0 jf0Var) {
        an1Var.getClass();
        j57Var.getClass();
        td0Var.getClass();
        mc0Var.getClass();
        n57Var.getClass();
        jf0Var.getClass();
        this.A = j57Var;
        this.B = td0Var;
        this.L = mc0Var;
        this.R = n57Var;
        this.X = jf0Var;
        String str = an1Var.B;
        this.Y = str;
        hc0 hc0Var = ic0.a;
        hc0Var.getClass();
        this.Z = hc0Var;
        cw cwVar = yd0.a;
        cwVar.getClass();
        this.c0 = cw.b.incrementAndGet(cwVar);
        this.d0 = w81.e(false);
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "Created " + this + " for " + ((Object) od0.b(str)));
        }
    }

    @Override // defpackage.vd0
    public final fq3 a() {
        return ct3.k0(new a31(0, tq5.w(this.R.a, null, null, new wd0(this, null, 1), 3)));
    }

    @Override // defpackage.vd0
    public final void c(boolean z) {
        j57 j57Var = this.A;
        synchronized (j57Var.k) {
            j57Var.n = z;
            k47 h = j57Var.h();
            if (h != null) {
                tq5.w(h.b.f, null, null, new dm0((j11) null, h, z), 3);
            }
        }
    }

    @Override // defpackage.e47
    public final void d(f47 f47Var) {
        j57 j57Var = this.A;
        j57Var.getClass();
        synchronized (j57Var.k) {
            if (j57Var.l.contains(f47Var)) {
                j57Var.k(j57Var.l);
            }
        }
    }

    @Override // defpackage.vd0
    public final boolean e() {
        return this.d0.b();
    }

    @Override // defpackage.vd0
    public final void f(Collection collection) {
        collection.getClass();
        this.A.d(tq0.n1(collection));
    }

    @Override // defpackage.vd0
    public final void h(ArrayList arrayList) {
        this.A.g(tq0.n1(arrayList));
    }

    @Override // defpackage.vd0
    public final void i() {
        if (ve2.D("CXCP")) {
            Log.d("CXCP", this + " received removed signal. Cleaning up.");
        }
        if (this.d0.a()) {
            tq5.w(this.R.a, null, null, new wd0(this, null, 0), 3);
        }
    }

    @Override // defpackage.vd0
    public final void k(boolean z) {
        j57 j57Var = this.A;
        synchronized (j57Var.k) {
            j57Var.p = z;
        }
    }

    @Override // defpackage.vd0
    public final td0 l() {
        return this.B;
    }

    @Override // defpackage.e47
    public final void m(f47 f47Var) {
        this.A.a(f47Var);
    }

    @Override // defpackage.vd0
    public final mc0 n() {
        return this.L;
    }

    @Override // defpackage.e47
    public final void o(f47 f47Var) {
        j57 j57Var = this.A;
        j57Var.getClass();
        synchronized (j57Var.k) {
            if (j57Var.m.remove(f47Var)) {
                j57Var.l();
            }
        }
    }

    @Override // defpackage.vd0
    public final fc0 p() {
        return this.Z;
    }

    @Override // defpackage.e47
    public final void q(f47 f47Var) {
        j57 j57Var = this.A;
        j57Var.getClass();
        synchronized (j57Var.k) {
            if (j57Var.l.contains(f47Var)) {
                j57Var.l();
            }
        }
    }

    @Override // defpackage.vd0
    public final void r(fc0 fc0Var) {
        fc0 fc0Var2;
        if (fc0Var == null) {
            fc0Var2 = ic0.a;
            fc0Var2.getClass();
        } else {
            fc0Var2 = fc0Var;
        }
        this.Z = fc0Var2;
        if (fc0Var != null) {
            fc0Var.p();
        }
        synchronized (this.A.k) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInternalAdapter<");
        sb.append((Object) od0.b(this.Y));
        sb.append('(');
        return wh1.m(sb, this.c0, ")>");
    }
}
