package dd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends ec.c {
    public j R;
    public Object X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ j Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f4041b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, cc.c cVar) {
        super(cVar);
        this.Z = jVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.Y = obj;
        this.f4041b0 |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
