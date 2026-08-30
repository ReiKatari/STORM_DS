package a4;

import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a  reason: collision with root package name */
    public int f256a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f257b;

    /* renamed from: c  reason: collision with root package name */
    public Object f258c;

    /* renamed from: d  reason: collision with root package name */
    public Object f259d;

    /* renamed from: e  reason: collision with root package name */
    public Object f260e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f261f;

    public l1(Object obj) {
        this.f258c = new Object();
        this.f256a = 0;
        this.f257b = false;
        this.f260e = new HashMap();
        this.f261f = new CopyOnWriteArraySet();
        this.f259d = new AtomicReference(obj);
    }

    public void a(Executor executor, d2.t tVar) {
        j0.y1 y1Var;
        synchronized (this.f258c) {
            j0.y1 y1Var2 = (j0.y1) ((HashMap) this.f260e).remove(tVar);
            if (y1Var2 != null) {
                y1Var2.L.set(false);
                ((CopyOnWriteArraySet) this.f261f).remove(y1Var2);
            }
            y1Var = new j0.y1((AtomicReference) this.f259d, executor, tVar);
            ((HashMap) this.f260e).put(tVar, y1Var);
            ((CopyOnWriteArraySet) this.f261f).add(y1Var);
        }
        y1Var.a(0);
    }

    public boolean b(int i2, int i10) {
        int i11 = this.f256a;
        b3.n nVar = (b3.n) ((p2.b) this.f259d).A[i2 + i11];
        b3.n nVar2 = (b3.n) ((p2.b) this.f260e).A[i11 + i10];
        if (nc.k.a(nVar, nVar2) || nVar.getClass() == nVar2.getClass()) {
            return true;
        }
        return false;
    }

    public l1(n1 n1Var, b3.o oVar, int i2, p2.b bVar, p2.b bVar2, boolean z10) {
        this.f261f = n1Var;
        this.f258c = oVar;
        this.f256a = i2;
        this.f259d = bVar;
        this.f260e = bVar2;
        this.f257b = z10;
    }
}
