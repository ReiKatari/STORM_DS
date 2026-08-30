package ec;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements cc.c {
    public static final b A = new Object();

    @Override // cc.c
    public final cc.g g() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // cc.c
    public final void h(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
