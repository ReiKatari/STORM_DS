package y3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a  reason: collision with root package name */
    public final s1 f14729a;

    /* renamed from: b  reason: collision with root package name */
    public p0 f14730b;

    /* renamed from: c  reason: collision with root package name */
    public final p1 f14731c = new p1(this, 2);

    /* renamed from: d  reason: collision with root package name */
    public final p1 f14732d = new p1(this, 0);

    /* renamed from: e  reason: collision with root package name */
    public final p1 f14733e = new p1(this, 1);

    public q1(s1 s1Var) {
        this.f14729a = s1Var;
    }

    public final p0 a() {
        p0 p0Var = this.f14730b;
        if (p0Var != null) {
            return p0Var;
        }
        a0.j.h("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
