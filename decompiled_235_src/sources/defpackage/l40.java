package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l40  reason: default package */
/* loaded from: classes.dex */
public final class l40 extends s41 {
    public /* synthetic */ Object R;
    public final /* synthetic */ m40 X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l40(m40 m40Var, s41 s41Var) {
        super(s41Var);
        this.X = m40Var;
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
