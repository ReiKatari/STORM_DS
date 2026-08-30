package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l2 extends z2.a0 {

    /* renamed from: c  reason: collision with root package name */
    public Object f9954c;

    public l2(long j2, Object obj) {
        super(j2);
        this.f9954c = obj;
    }

    @Override // z2.a0
    public final void a(z2.a0 a0Var) {
        a0Var.getClass();
        this.f9954c = ((l2) a0Var).f9954c;
    }

    @Override // z2.a0
    public final z2.a0 b(long j2) {
        return new l2(z2.l.j().g(), this.f9954c);
    }
}
