package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nc7  reason: default package */
/* loaded from: classes.dex */
public final class nc7 {
    public final String a;
    public final an2 b;
    public final o31 c;
    public final int d;
    public final Object e;
    public boolean f;
    public ic7 g;
    public final c46 h;
    public final u92 i;
    public ff0 j;
    public kd6 k;
    public d34 l;

    public nc7(String str, an2 an2Var, o31 o31Var) {
        str.getClass();
        o31Var.getClass();
        this.a = str;
        this.b = an2Var;
        this.c = o31Var;
        cw cwVar = mc7.a;
        cwVar.getClass();
        this.d = cw.b.incrementAndGet(cwVar);
        this.e = new Object();
        c46 b = d46.b(1, 3, null, 4);
        this.h = b;
        this.i = se.q(b);
        uf0 uf0Var = uf0.a;
        this.j = uf0Var;
        if (b.p(uf0Var)) {
            return;
        }
        i.n("Check failed.");
        throw null;
    }

    public final void a(uc0 uc0Var) {
        ff0 ff0Var;
        synchronized (this.e) {
            try {
                if (this.f) {
                    return;
                }
                this.f = true;
                Log.i("CXCP", "Disconnecting " + this);
                ic7 ic7Var = this.g;
                if (ic7Var != null) {
                    synchronized (ic7Var.B) {
                        ic7Var.L = true;
                    }
                }
                kd6 kd6Var = this.k;
                if (kd6Var != null) {
                    kd6Var.i(null);
                }
                d34 d34Var = this.l;
                if (d34Var != null) {
                    d34Var.b();
                }
                synchronized (this.e) {
                    ff0Var = this.j;
                }
                if (!(ff0Var instanceof kf0)) {
                    if (!(ff0Var instanceof lf0)) {
                        b(new lf0(null));
                    }
                    b(new kf0(this.a, qp0.APP_DISCONNECTED, null, null, null, null, null, null, uc0Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ff0 ff0Var) {
        this.j = ff0Var;
        if (this.h.p(ff0Var)) {
            return;
        }
        c44.k("Failed to emit ", ff0Var, " in ", this);
    }

    public final String toString() {
        return "VirtualCamera-" + this.d;
    }
}
