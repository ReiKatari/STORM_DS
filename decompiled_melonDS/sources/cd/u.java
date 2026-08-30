package cd;
/* loaded from: classes.dex */
public final class u extends ec.c {
    public /* synthetic */ Object R;
    public int X;
    public final /* synthetic */ v Y;
    public v Z;

    /* renamed from: b0  reason: collision with root package name */
    public i f2865b0;

    /* renamed from: c0  reason: collision with root package name */
    public dd.v f2866c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, cc.c cVar) {
        super(cVar);
        this.Y = vVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.R = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.c(null, this);
    }
}
