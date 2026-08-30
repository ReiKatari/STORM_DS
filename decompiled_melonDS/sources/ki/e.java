package ki;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends ec.c {
    public String R;
    public /* synthetic */ Object X;
    public final /* synthetic */ m Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, ec.c cVar) {
        super(cVar);
        this.Y = mVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        Object e6 = this.Y.e(null, this);
        if (e6 == dc.a.COROUTINE_SUSPENDED) {
            return e6;
        }
        return new yb.l(e6);
    }
}
