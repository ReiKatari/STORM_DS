package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f85  reason: default package */
/* loaded from: classes.dex */
public final class f85 extends s41 {
    public /* synthetic */ Object R;
    public final /* synthetic */ l85 X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f85(l85 l85Var, s41 s41Var) {
        super(s41Var);
        this.X = l85Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object c = l85.c(this.X, null, null, null, this);
        if (c == x61.COROUTINE_SUSPENDED) {
            return c;
        }
        return new hm5(c);
    }
}
