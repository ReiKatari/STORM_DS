package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k2 extends z2.a0 {

    /* renamed from: c  reason: collision with root package name */
    public long f9952c;

    public k2(long j2, long j10) {
        super(j2);
        this.f9952c = j10;
    }

    @Override // z2.a0
    public final void a(z2.a0 a0Var) {
        a0Var.getClass();
        this.f9952c = ((k2) a0Var).f9952c;
    }

    @Override // z2.a0
    public final z2.a0 b(long j2) {
        return new k2(j2, this.f9952c);
    }
}
