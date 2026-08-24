package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: km2  reason: default package */
/* loaded from: classes.dex */
public final class km2 implements AutoCloseable {
    public final Object A = new Object();
    public final pu B = new pu();
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
            throw i61.j(it);
        }
    }

    public final void e(kk5 kk5Var) {
        kk5Var.getClass();
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
