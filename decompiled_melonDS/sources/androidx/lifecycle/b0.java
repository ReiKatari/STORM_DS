package androidx.lifecycle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 implements Runnable {
    public final /* synthetic */ d0 A;

    public b0(d0 d0Var) {
        this.A = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.A.f1460a) {
            obj = this.A.f1465f;
            this.A.f1465f = d0.f1459k;
        }
        this.A.h(obj);
    }
}
