package defpackage;

import android.os.Looper;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m14  reason: default package */
/* loaded from: classes.dex */
public class m14 extends pq3 {
    @Override // defpackage.pq3
    public final void f(Object obj) {
        pq3.a("setValue");
        this.g++;
        this.e = obj;
        b(null);
    }

    public final void g(Object obj) {
        boolean z;
        synchronized (this.a) {
            if (this.f == pq3.k) {
                z = true;
            } else {
                z = false;
            }
            this.f = obj;
        }
        if (!z) {
            return;
        }
        kt L = kt.L();
        es4 es4Var = this.j;
        ub1 ub1Var = L.h;
        if (ub1Var.j == null) {
            synchronized (ub1Var.h) {
                try {
                    if (ub1Var.j == null) {
                        ub1Var.j = ub1.L(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        ub1Var.j.post(es4Var);
    }
}
