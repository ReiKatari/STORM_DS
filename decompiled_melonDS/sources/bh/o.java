package bh;

import q.q3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends ec.c {
    public b R;
    public oi.i X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ q3 Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f2278b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q3 q3Var, ec.c cVar) {
        super(cVar);
        this.Z = q3Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f2278b0 |= Integer.MIN_VALUE;
        return q3.b(this.Z, null, this);
    }
}
