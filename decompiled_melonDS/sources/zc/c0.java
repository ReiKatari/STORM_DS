package zc;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 extends Exception {
    public final Throwable A;

    public c0(Throwable th2, q qVar, cc.g gVar) {
        super("Coroutine dispatcher " + qVar + " threw an exception, context = " + gVar, th2);
        this.A = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.A;
    }
}
