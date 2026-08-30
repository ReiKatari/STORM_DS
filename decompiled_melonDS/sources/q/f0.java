package q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 extends u1 {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ l0 f11902d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ p0 f11903e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p0 p0Var, p0 p0Var2, l0 l0Var) {
        super(p0Var2);
        this.f11903e0 = p0Var;
        this.f11902d0 = l0Var;
    }

    @Override // q.u1
    public final p.b0 b() {
        return this.f11902d0;
    }

    @Override // q.u1
    public final boolean c() {
        p0 p0Var = this.f11903e0;
        if (!p0Var.getInternalPopup().b()) {
            p0Var.f11984c0.k(p0Var.getTextDirection(), p0Var.getTextAlignment());
            return true;
        }
        return true;
    }
}
