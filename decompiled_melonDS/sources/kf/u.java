package kf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends ec.c {
    public String R;
    public String X;
    public boolean Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ z f8268b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f8269c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, ec.c cVar) {
        super(cVar);
        this.f8268b0 = zVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Z = obj;
        this.f8269c0 |= Integer.MIN_VALUE;
        return this.f8268b0.n(null, false, null, this);
    }
}
