package i1;

import mc.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends ec.c {
    public l R;
    public /* synthetic */ Object X;
    public final /* synthetic */ f Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, ec.c cVar) {
        super(cVar);
        this.Y = fVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.c(null, 0.0f, null, this);
    }
}
