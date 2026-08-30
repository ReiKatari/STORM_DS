package cd;
/* loaded from: classes.dex */
public final class l0 extends ec.c {
    public a0 R;
    public /* synthetic */ Object X;
    public int Y;
    public final /* synthetic */ a0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public Object f2838b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(a0 a0Var, cc.c cVar) {
        super(cVar);
        this.Z = a0Var;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.X = obj;
        this.Y |= Integer.MIN_VALUE;
        return this.Z.a(null, this);
    }
}
