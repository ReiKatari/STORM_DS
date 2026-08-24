package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k27  reason: default package */
/* loaded from: classes.dex */
public final class k27 extends hw6 implements qn2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ p27 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k27(p27 p27Var, r41 r41Var, int i) {
        super(1, r41Var);
        this.X = i;
        this.Y = p27Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        p27 p27Var = this.Y;
        r41 r41Var = (r41) obj;
        switch (i) {
            case 0:
                new k27(p27Var, r41Var, 0).s(jg7Var);
                return jg7Var;
            case 1:
                new k27(p27Var, r41Var, 1).s(jg7Var);
                return jg7Var;
            case 2:
                new k27(p27Var, r41Var, 2).s(jg7Var);
                return jg7Var;
            default:
                new k27(p27Var, r41Var, 3).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        p27 p27Var = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                p27Var.B = false;
                return jg7Var;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                p27Var.f();
                return jg7Var;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                p27Var.d(p27Var.B);
                return jg7Var;
            default:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                p27Var.p();
                return jg7Var;
        }
    }
}
