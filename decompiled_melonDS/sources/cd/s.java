package cd;
/* loaded from: classes.dex */
public final class s extends ec.c {
    public /* synthetic */ Object R;
    public int X;
    public final /* synthetic */ t Y;
    public Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public i f2860b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, cc.c cVar) {
        super(cVar);
        this.Y = tVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.R = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.c(null, this);
    }
}
