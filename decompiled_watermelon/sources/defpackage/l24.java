package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l24  reason: default package */
/* loaded from: classes.dex */
public final class l24 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public void a(Executor executor, h94 h94Var) {
        re6 re6Var;
        synchronized (this.c) {
            re6 re6Var2 = (re6) ((HashMap) this.e).remove(h94Var);
            if (re6Var2 != null) {
                re6Var2.L.set(false);
                ((CopyOnWriteArraySet) this.f).remove(re6Var2);
            }
            re6Var = new re6((AtomicReference) this.d, executor, h94Var);
            ((HashMap) this.e).put(h94Var, re6Var);
            ((CopyOnWriteArraySet) this.f).add(re6Var);
        }
        re6Var.a(0);
    }

    public boolean b(int i, int i2) {
        int i3 = this.a;
        xy3 xy3Var = (xy3) ((o24) this.d).A[i + i3];
        xy3 xy3Var2 = (xy3) ((o24) this.e).A[i3 + i2];
        if (b53.x(xy3Var, xy3Var2) || xy3Var.getClass() == xy3Var2.getClass()) {
            return true;
        }
        return false;
    }

    public void c() {
        synchronized (this.c) {
            try {
                if (this.b) {
                    return;
                }
                this.b = true;
                kd6 kd6Var = (kd6) this.f;
                if (kd6Var != null) {
                    kd6Var.i(null);
                }
                this.f = null;
                tq5.w((o31) this.d, null, null, new x3(this, (j11) null, 18), 3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
