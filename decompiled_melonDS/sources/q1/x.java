package q1;

import d1.a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x extends ec.c {
    public int R;
    public a1 X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ a0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f12200b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a0 a0Var, ec.c cVar) {
        super(cVar);
        this.Z = a0Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f12200b0 |= Integer.MIN_VALUE;
        return this.Z.f(0, null, this);
    }
}
