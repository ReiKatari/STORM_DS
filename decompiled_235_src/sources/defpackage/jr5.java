package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jr5  reason: default package */
/* loaded from: classes.dex */
public final class jr5 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ nh2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr5(nh2 nh2Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = nh2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                ((jr5) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
            default:
                ((jr5) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                jr5 jr5Var = new jr5(this.Z, r41Var, 0);
                jr5Var.Y = obj;
                return jr5Var;
            default:
                jr5 jr5Var2 = new jr5(this.Z, r41Var, 1);
                jr5Var2.Y = obj;
                return jr5Var2;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        nh2 nh2Var = this.Z;
        w61 w61Var = (w61) this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                try {
                    nh2.a(nh2Var);
                } catch (Throwable unused) {
                }
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                try {
                    nh2.a(nh2Var);
                } catch (Throwable unused2) {
                }
                return jg7Var;
        }
    }
}
