package ki;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends ec.c {
    public long R;
    public String X;
    public boolean Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ m f8311b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f8312c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, ec.c cVar) {
        super(cVar);
        this.f8311b0 = mVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Z = obj;
        this.f8312c0 |= Integer.MIN_VALUE;
        Object j2 = this.f8311b0.j(0L, null, false, this);
        if (j2 == dc.a.COROUTINE_SUSPENDED) {
            return j2;
        }
        return new yb.l(j2);
    }
}
