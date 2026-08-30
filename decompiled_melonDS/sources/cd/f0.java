package cd;
/* loaded from: classes.dex */
public final class f0 extends ec.c {
    public /* synthetic */ Object R;
    public int X;
    public final /* synthetic */ a9.i Y;
    public Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(a9.i iVar, cc.c cVar) {
        super(cVar);
        this.Y = iVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.R = obj;
        this.X |= Integer.MIN_VALUE;
        return this.Y.c(null, this);
    }
}
