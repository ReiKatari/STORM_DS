package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 extends o0 {
    public final Runnable L;

    public n0(Runnable runnable, long j2) {
        super(j2);
        this.L = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.L.run();
    }

    @Override // zc.o0
    public final String toString() {
        return super.toString() + this.L;
    }
}
