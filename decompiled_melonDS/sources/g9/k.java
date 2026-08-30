package g9;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends ec.c {
    public l R;
    public e9.g X;
    public Object Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ l f5618b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f5619c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, ec.c cVar) {
        super(cVar);
        this.f5618b0 = lVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Z = obj;
        this.f5619c0 |= Integer.MIN_VALUE;
        return this.f5618b0.a(this);
    }
}
