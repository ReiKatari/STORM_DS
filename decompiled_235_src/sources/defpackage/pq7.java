package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pq7  reason: default package */
/* loaded from: classes.dex */
public final class pq7 {
    public final String a;
    public final gt2 b;
    public final w61 c;
    public final int d;
    public final Object e;
    public boolean f;
    public kq7 g;
    public final of6 h;
    public final le2 i;
    public oh0 j;
    public ap6 k;
    public jb4 l;

    public pq7(String str, gt2 gt2Var, w61 w61Var) {
        str.getClass();
        w61Var.getClass();
        this.a = str;
        this.b = gt2Var;
        this.c = w61Var;
        uw uwVar = oq7.a;
        uwVar.getClass();
        this.d = uw.b.incrementAndGet(uwVar);
        this.e = new Object();
        of6 b = pf6.b(1, 3, null, 4);
        this.h = b;
        this.i = f04.z(b);
        di0 di0Var = di0.a;
        this.j = di0Var;
        if (b.k(di0Var)) {
            return;
        }
        i.m("Check failed.");
        throw null;
    }

    public final void a(df0 df0Var) {
        oh0 oh0Var;
        synchronized (this.e) {
            try {
                if (this.f) {
                    return;
                }
                this.f = true;
                Log.i("CXCP", "Disconnecting " + this);
                kq7 kq7Var = this.g;
                if (kq7Var != null) {
                    synchronized (kq7Var.B) {
                        kq7Var.L = true;
                    }
                }
                ap6 ap6Var = this.k;
                if (ap6Var != null) {
                    ap6Var.h(null);
                }
                jb4 jb4Var = this.l;
                if (jb4Var != null) {
                    jb4Var.b();
                }
                synchronized (this.e) {
                    oh0Var = this.j;
                }
                if (!(oh0Var instanceof th0)) {
                    if (!(oh0Var instanceof uh0)) {
                        b(new uh0(null));
                    }
                    b(new th0(this.a, ds0.APP_DISCONNECTED, null, null, null, null, null, null, df0Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(oh0 oh0Var) {
        this.j = oh0Var;
        if (this.h.k(oh0Var)) {
            return;
        }
        u34.l("Failed to emit ", oh0Var, " in ", this);
    }

    public final String toString() {
        return "VirtualCamera-" + this.d;
    }
}
