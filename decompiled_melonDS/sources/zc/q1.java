package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q1 extends ed.q implements Runnable {
    public final long X;

    public q1(long j2, ec.c cVar) {
        super(cVar, cVar.g());
        this.X = j2;
    }

    @Override // zc.f1
    public final String X() {
        return super.X() + "(timeMillis=" + this.X + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        x.m(this.L);
        u(new p1("Timed out waiting for " + this.X + " ms", this));
    }
}
