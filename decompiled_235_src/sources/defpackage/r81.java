package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r81  reason: default package */
/* loaded from: classes.dex */
public final class r81 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ qn2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r81(int i, r41 r41Var, qn2 qn2Var) {
        super(2, r41Var);
        this.X = i;
        this.Z = qn2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        bt4 bt4Var = (bt4) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((r81) q(r41Var, bt4Var)).s(jg7Var);
            default:
                return ((r81) q(r41Var, bt4Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        qn2 qn2Var = this.Z;
        switch (i) {
            case 0:
                r81 r81Var = new r81(0, r41Var, qn2Var);
                r81Var.Y = obj;
                return r81Var;
            default:
                r81 r81Var2 = new r81(1, r41Var, qn2Var);
                r81Var2.Y = obj;
                return r81Var2;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        qn2 qn2Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                bt4 bt4Var = (bt4) this.Y;
                bt4Var.getClass();
                return qn2Var.g(bt4Var.d());
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                bt4 bt4Var2 = (bt4) this.Y;
                bt4Var2.getClass();
                return qn2Var.g(bt4Var2.d());
        }
    }
}
