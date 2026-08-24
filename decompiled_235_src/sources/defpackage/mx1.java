package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mx1  reason: default package */
/* loaded from: classes.dex */
public final class mx1 extends s41 {
    public /* synthetic */ Object R;
    public final /* synthetic */ nx1 X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx1(nx1 nx1Var, s41 s41Var) {
        super(s41Var);
        this.X = nx1Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object k = this.X.k(null, false, this);
        if (k == x61.COROUTINE_SUSPENDED) {
            return k;
        }
        return new hm5(k);
    }
}
