package cd;
/* loaded from: classes.dex */
public final class b0 extends ec.c {
    public /* synthetic */ Object R;
    public int X;
    public final /* synthetic */ x Y;
    public x Z;

    /* renamed from: b0  reason: collision with root package name */
    public i f2816b0;

    /* renamed from: c0  reason: collision with root package name */
    public Throwable f2817c0;

    /* renamed from: d0  reason: collision with root package name */
    public long f2818d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(x xVar, cc.c cVar) {
        super(cVar);
        this.Y = xVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.R = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.c(null, this);
    }
}
