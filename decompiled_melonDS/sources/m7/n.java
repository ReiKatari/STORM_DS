package m7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends ec.c {
    public String R;
    public mc.l X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ p Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f9326b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, ec.c cVar) {
        super(cVar);
        this.Z = pVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f9326b0 |= Integer.MIN_VALUE;
        return this.Z.a(null, null, this);
    }
}
