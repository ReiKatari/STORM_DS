package kf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends ec.c {
    public String R;
    public Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ z Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f8254b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(z zVar, ec.c cVar) {
        super(cVar);
        this.Z = zVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f8254b0 |= Integer.MIN_VALUE;
        Object f8 = this.Z.f(null, this);
        if (f8 == dc.a.COROUTINE_SUSPENDED) {
            return f8;
        }
        return new yb.l(f8);
    }
}
