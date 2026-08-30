package z2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public r2.c f14955c;

    /* renamed from: d  reason: collision with root package name */
    public int f14956d;

    /* renamed from: e  reason: collision with root package name */
    public int f14957e;

    public v(long j2, r2.c cVar) {
        super(j2);
        this.f14955c = cVar;
    }

    @Override // z2.a0
    public final void a(a0 a0Var) {
        synchronized (q.f14929a) {
            a0Var.getClass();
            this.f14955c = ((v) a0Var).f14955c;
            this.f14956d = ((v) a0Var).f14956d;
            this.f14957e = ((v) a0Var).f14957e;
        }
    }

    @Override // z2.a0
    public final a0 b(long j2) {
        return new v(j2, this.f14955c);
    }
}
