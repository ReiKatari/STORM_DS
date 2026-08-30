package ti;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r implements t {

    /* renamed from: a  reason: collision with root package name */
    public final o f13263a;

    public r(o oVar) {
        oVar.getClass();
        this.f13263a = oVar;
    }

    @Override // ti.t
    public final t a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // ti.t
    public final s b() {
        throw new IllegalStateException("already connected");
    }

    @Override // ti.t
    public final o c() {
        return this.f13263a;
    }

    @Override // ti.t, ui.d
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // ti.t
    public final boolean d() {
        return true;
    }

    @Override // ti.t
    public final s f() {
        throw new IllegalStateException("already connected");
    }
}
