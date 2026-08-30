package cd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends ec.c {
    public b7.y R;
    public Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ b7.y Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f2820b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b7.y yVar, cc.c cVar) {
        super(cVar);
        this.Z = yVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f2820b0 |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
