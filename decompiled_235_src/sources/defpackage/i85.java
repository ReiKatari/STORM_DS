package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i85  reason: default package */
/* loaded from: classes.dex */
public final class i85 extends s41 {
    public long R;
    public String X;
    public boolean Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ l85 d0;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i85(l85 l85Var, s41 s41Var) {
        super(s41Var);
        this.d0 = l85Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.Z = obj;
        this.e0 |= Integer.MIN_VALUE;
        Object t = this.d0.t(0L, this, null, false);
        if (t == x61.COROUTINE_SUSPENDED) {
            return t;
        }
        return new hm5(t);
    }
}
