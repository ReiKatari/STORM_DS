package v3;

import zc.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends ec.c {
    public l1 R;
    public /* synthetic */ Object X;
    public final /* synthetic */ f0 Y;
    public int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f0 f0Var, ec.c cVar) {
        super(cVar);
        this.Y = f0Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.X = obj;
        this.Z |= Integer.MIN_VALUE;
        return this.Y.l(0L, null, this);
    }
}
