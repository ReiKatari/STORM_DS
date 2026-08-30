package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 extends ec.c {
    public a1.y R;
    public bd.c X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ d0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f1784b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, ec.c cVar) {
        super(cVar);
        this.Z = d0Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f1784b0 |= Integer.MIN_VALUE;
        return this.Z.l(this);
    }
}
