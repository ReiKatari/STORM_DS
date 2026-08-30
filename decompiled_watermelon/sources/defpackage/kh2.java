package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kh2  reason: default package */
/* loaded from: classes.dex */
public final class kh2 implements AutoCloseable {
    public final Object A = new Object();
    public final xt B = new xt();
    public boolean L;

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.A) {
            if (this.L) {
                return;
            }
            this.L = true;
            Iterator<E> it = this.B.iterator();
            if (!it.hasNext()) {
                this.B.clear();
                return;
            }
            throw b31.m(it);
        }
    }

    public final void d(sa5 sa5Var) {
        sa5Var.getClass();
        synchronized (this.A) {
            try {
                if (this.L) {
                    return;
                }
                Iterator it = this.B.iterator();
                if (!it.hasNext()) {
                    return;
                }
                if (it.next() == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
