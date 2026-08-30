package pi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f11668b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11669c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ byte[] f11670d;

    public a0(t tVar, int i2, byte[] bArr) {
        this.f11668b = tVar;
        this.f11669c = i2;
        this.f11670d = bArr;
    }

    @Override // pi.b0
    public final long a() {
        return this.f11669c;
    }

    @Override // pi.b0
    public final t b() {
        return this.f11668b;
    }

    @Override // pi.b0
    public final void d(fj.f fVar) {
        fVar.M(this.f11669c, this.f11670d);
    }
}
