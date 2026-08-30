package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j2 extends z2.a0 {

    /* renamed from: c  reason: collision with root package name */
    public int f9942c;

    public j2(int i2, long j2) {
        super(j2);
        this.f9942c = i2;
    }

    @Override // z2.a0
    public final void a(z2.a0 a0Var) {
        a0Var.getClass();
        this.f9942c = ((j2) a0Var).f9942c;
    }

    @Override // z2.a0
    public final z2.a0 b(long j2) {
        return new j2(this.f9942c, j2);
    }
}
