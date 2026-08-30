package z2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public s2.b f14931c;

    /* renamed from: d  reason: collision with root package name */
    public int f14932d;

    public r(long j2, s2.b bVar) {
        super(j2);
        this.f14931c = bVar;
    }

    @Override // z2.a0
    public final void a(a0 a0Var) {
        a0Var.getClass();
        r rVar = (r) a0Var;
        synchronized (q.f14930b) {
            this.f14931c = rVar.f14931c;
            this.f14932d = rVar.f14932d;
        }
    }

    @Override // z2.a0
    public final a0 b(long j2) {
        return new r(j2, this.f14931c);
    }
}
