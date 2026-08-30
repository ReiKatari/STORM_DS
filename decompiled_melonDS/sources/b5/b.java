package b5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends Throwable {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i2) {
        super(str);
        this.A = i2;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        int i2 = this.A;
        synchronized (this) {
            switch (i2) {
                case 0:
                    return this;
                default:
                    return this;
            }
        }
    }
}
