package u3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends ec.c {
    public long R;
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ h Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f13481b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, ec.c cVar) {
        super(cVar);
        this.Z = hVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f13481b0 |= Integer.MIN_VALUE;
        return this.Z.V(0L, 0L, this);
    }
}
