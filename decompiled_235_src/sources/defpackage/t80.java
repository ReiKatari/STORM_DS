package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t80  reason: default package */
/* loaded from: classes.dex */
public final class t80 extends s41 {
    public /* synthetic */ Object R;
    public final /* synthetic */ v80 X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t80(v80 v80Var, s41 s41Var) {
        super(s41Var);
        this.X = v80Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object M = v80.M(this.X, this);
        if (M == x61.COROUTINE_SUSPENDED) {
            return M;
        }
        return new gm0(M);
    }
}
