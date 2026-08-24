package defpackage;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ra4  reason: default package */
/* loaded from: classes.dex */
public final class ra4 {
    public int a;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public void a(Executor executor, bi4 bi4Var) {
        gq6 gq6Var;
        synchronized (this.c) {
            gq6 gq6Var2 = (gq6) ((HashMap) this.e).remove(bi4Var);
            if (gq6Var2 != null) {
                gq6Var2.L.set(false);
                ((CopyOnWriteArraySet) this.f).remove(gq6Var2);
            }
            gq6Var = new gq6((AtomicReference) this.d, executor, bi4Var);
            ((HashMap) this.e).put(bi4Var, gq6Var);
            ((CopyOnWriteArraySet) this.f).add(gq6Var);
        }
        gq6Var.a(0);
    }

    public boolean b(int i, int i2) {
        int i3 = this.a;
        y64 y64Var = (y64) ((ua4) this.d).A[i + i3];
        y64 y64Var2 = (y64) ((ua4) this.e).A[i3 + i2];
        if (nb3.k(y64Var, y64Var2) || y64Var.getClass() == y64Var2.getClass()) {
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
                ap6 ap6Var = (ap6) this.f;
                if (ap6Var != null) {
                    ap6Var.h(null);
                }
                this.f = null;
                hv.L((w61) this.d, null, null, new y3(this, (r41) null, 19), 3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
