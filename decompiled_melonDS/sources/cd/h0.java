package cd;
/* loaded from: classes.dex */
public final class h0 extends ec.c {
    public /* synthetic */ Object R;
    public int X;
    public final /* synthetic */ x Y;
    public a0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(x xVar, cc.c cVar) {
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
