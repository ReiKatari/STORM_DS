package kf;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends ec.c {
    public /* synthetic */ Object R;
    public final /* synthetic */ z X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, ec.c cVar) {
        super(cVar);
        this.X = zVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object l10 = this.X.l(null, null, this);
        if (l10 == dc.a.COROUTINE_SUSPENDED) {
            return l10;
        }
        return new yb.l(l10);
    }
}
