package r1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends ec.c {
    public h3.c R;
    public Object[] X;
    public int Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f12602b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ c f12603c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f12604d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ec.c cVar2) {
        super(cVar2);
        this.f12603c0 = cVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.f12602b0 = obj;
        this.f12604d0 |= Integer.MIN_VALUE;
        return this.f12603c0.a(null, this);
    }
}
