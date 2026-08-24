package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ka  reason: default package */
/* loaded from: classes.dex */
public final class ka extends s41 {
    public /* synthetic */ Object R;
    public final /* synthetic */ u63 X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(u63 u63Var, s41 s41Var) {
        super(s41Var);
        this.X = u63Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object h = this.X.h(null, null, this);
        if (h == x61.COROUTINE_SUSPENDED) {
            return h;
        }
        return new hm5(h);
    }
}
