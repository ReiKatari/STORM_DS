package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j85  reason: default package */
/* loaded from: classes.dex */
public final class j85 extends s41 {
    public long R;
    public int X;
    public String Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ l85 d0;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j85(l85 l85Var, s41 s41Var) {
        super(s41Var);
        this.d0 = l85Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.Z = obj;
        this.e0 |= Integer.MIN_VALUE;
        Object u = this.d0.u(0L, 0, null, this);
        if (u == x61.COROUTINE_SUSPENDED) {
            return u;
        }
        return new hm5(u);
    }
}
