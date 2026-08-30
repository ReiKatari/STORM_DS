package q1;

import f1.f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z extends ec.c {
    public a0 R;
    public f1 X;
    public ec.j Y;
    public /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ a0 f12204b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f12205c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, cc.c cVar) {
        super(cVar);
        this.f12204b0 = a0Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Z = obj;
        this.f12205c0 |= Integer.MIN_VALUE;
        return a0.t(this.f12204b0, null, null, this);
    }
}
