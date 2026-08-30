package v7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends RuntimeException {
    public final e A;
    public final Throwable B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Throwable th2) {
        super(th2);
        eVar.getClass();
        this.A = eVar;
        this.B = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.B;
    }
}
