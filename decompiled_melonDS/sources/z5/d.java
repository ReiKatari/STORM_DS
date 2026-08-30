package z5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends c5.d {

    /* renamed from: c  reason: collision with root package name */
    public final Object f14964c;

    public d() {
        super(12);
        this.f14964c = new Object();
    }

    @Override // c5.d
    public final Object a() {
        Object a10;
        synchronized (this.f14964c) {
            a10 = super.a();
        }
        return a10;
    }

    @Override // c5.d
    public final boolean c(Object obj) {
        boolean c4;
        synchronized (this.f14964c) {
            c4 = super.c(obj);
        }
        return c4;
    }
}
