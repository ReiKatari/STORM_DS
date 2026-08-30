package bh;

import q.q3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends ec.c {
    public a R;
    public ac.b X;
    public ac.b Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ q3 f2266b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f2267c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(q3 q3Var, ec.c cVar) {
        super(cVar);
        this.f2266b0 = q3Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Z = obj;
        this.f2267c0 |= Integer.MIN_VALUE;
        return q3.a(this.f2266b0, null, this);
    }
}
