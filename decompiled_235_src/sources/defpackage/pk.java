package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pk  reason: default package */
/* loaded from: classes.dex */
public final class pk extends s41 {
    public long R;
    public kk X;
    public da5 Y;
    public Throwable Z;
    public boolean d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public /* synthetic */ Object i0;
    public final /* synthetic */ pl j0;
    public int k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk(pl plVar, s41 s41Var) {
        super(s41Var);
        this.j0 = plVar;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.i0 = obj;
        this.k0 |= Integer.MIN_VALUE;
        Object f = this.j0.f(0L, null, null, false, this);
        if (f == x61.COROUTINE_SUSPENDED) {
            return f;
        }
        return new hm5(f);
    }
}
