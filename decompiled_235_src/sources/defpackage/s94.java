package defpackage;

import android.os.Looper;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s94  reason: default package */
/* loaded from: classes.dex */
public class s94 extends qx3 {
    @Override // defpackage.qx3
    public final void f(Object obj) {
        qx3.a("setValue");
        this.g++;
        this.e = obj;
        b(null);
    }

    public final void g(Object obj) {
        boolean z;
        synchronized (this.a) {
            if (this.f == qx3.k) {
                z = true;
            } else {
                z = false;
            }
            this.f = obj;
        }
        if (!z) {
            return;
        }
        zt l0 = zt.l0();
        g15 g15Var = this.j;
        sf1 sf1Var = l0.e;
        if (sf1Var.g == null) {
            synchronized (sf1Var.e) {
                try {
                    if (sf1Var.g == null) {
                        sf1Var.g = sf1.l0(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        sf1Var.g.post(g15Var);
    }
}
