package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gj4  reason: default package */
/* loaded from: classes.dex */
public final class gj4 extends s41 {
    public /* synthetic */ Object R;
    public final /* synthetic */ oj4 X;
    public int Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj4(oj4 oj4Var, s41 s41Var) {
        super(s41Var);
        this.X = oj4Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        this.R = obj;
        this.Y |= Integer.MIN_VALUE;
        Object a = this.X.a(null, null, 0L, 0L, false, 0L, null, null, this);
        if (a == x61.COROUTINE_SUSPENDED) {
            return a;
        }
        return new hm5(a);
    }
}
