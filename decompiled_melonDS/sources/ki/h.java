package ki;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends ec.c {
    public String R;
    public Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ m Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f8307b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, ec.c cVar) {
        super(cVar);
        this.Z = mVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f8307b0 |= Integer.MIN_VALUE;
        Object h2 = this.Z.h(null, null, this);
        if (h2 == dc.a.COROUTINE_SUSPENDED) {
            return h2;
        }
        return new yb.l(h2);
    }
}
