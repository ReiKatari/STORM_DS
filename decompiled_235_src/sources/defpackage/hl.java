package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hl  reason: default package */
/* loaded from: classes.dex */
public final class hl extends s41 {
    public /* synthetic */ Object R;
    public final /* synthetic */ pl X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(pl plVar, s41 s41Var) {
        super(s41Var);
        this.X = plVar;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object x = this.X.x(null, false, this);
        if (x == x61.COROUTINE_SUSPENDED) {
            return x;
        }
        return new hm5(x);
    }
}
