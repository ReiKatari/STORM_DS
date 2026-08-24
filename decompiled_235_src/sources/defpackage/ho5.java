package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ho5  reason: default package */
/* loaded from: classes.dex */
public final class ho5 extends s41 {
    public /* synthetic */ Object R;
    public final /* synthetic */ no5 X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho5(no5 no5Var, r41 r41Var) {
        super(r41Var);
        this.X = no5Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object f = this.X.f(null, this);
        if (f == x61.COROUTINE_SUSPENDED) {
            return f;
        }
        return new hm5(f);
    }
}
