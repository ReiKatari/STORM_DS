package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i2 extends z2.a0 {

    /* renamed from: c  reason: collision with root package name */
    public float f9941c;

    public i2(long j2, float f8) {
        super(j2);
        this.f9941c = f8;
    }

    @Override // z2.a0
    public final void a(z2.a0 a0Var) {
        a0Var.getClass();
        this.f9941c = ((i2) a0Var).f9941c;
    }

    @Override // z2.a0
    public final z2.a0 b(long j2) {
        return new i2(j2, this.f9941c);
    }
}
