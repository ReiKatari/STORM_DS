package ti;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements t {

    /* renamed from: a  reason: collision with root package name */
    public final s f13213a;

    public h(Throwable th2) {
        this.f13213a = new s(this, th2, 2);
    }

    @Override // ti.t
    public final t a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // ti.t
    public final s b() {
        return this.f13213a;
    }

    @Override // ti.t
    public final o c() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // ti.t, ui.d
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // ti.t
    public final boolean d() {
        return false;
    }

    @Override // ti.t
    public final s f() {
        return this.f13213a;
    }
}
