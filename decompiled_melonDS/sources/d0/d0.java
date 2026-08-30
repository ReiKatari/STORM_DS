package d0;

import java.util.HashSet;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d0 implements y0 {
    public final y0 B;
    public final Object A = new Object();
    public final HashSet L = new HashSet();

    public d0(y0 y0Var) {
        this.B = y0Var;
    }

    @Override // d0.y0
    public int a() {
        return this.B.a();
    }

    @Override // d0.y0
    public int c() {
        return this.B.c();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        HashSet hashSet;
        this.B.close();
        synchronized (this.A) {
            hashSet = new HashSet(this.L);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((c0) it.next()).d(this);
        }
    }

    public final void d(c0 c0Var) {
        synchronized (this.A) {
            this.L.add(c0Var);
        }
    }

    @Override // d0.y0
    public final int getFormat() {
        return this.B.getFormat();
    }

    @Override // d0.y0
    public x0[] l() {
        return this.B.l();
    }

    @Override // d0.y0
    public t0 q() {
        return this.B.q();
    }
}
