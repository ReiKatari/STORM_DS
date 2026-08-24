package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w81  reason: default package */
/* loaded from: classes.dex */
public final class w81 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ qn2 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w81(qn2 qn2Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 2;
        this.d0 = qn2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((w81) q((r41) obj2, (bt4) obj)).s(jg7Var);
            case 1:
                return ((w81) q((r41) obj2, (bt4) obj)).s(jg7Var);
            default:
                return ((w81) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                w81 w81Var = new w81(0, r41Var, this.d0);
                w81Var.Z = obj;
                return w81Var;
            case 1:
                w81 w81Var2 = new w81(1, r41Var, this.d0);
                w81Var2.Z = obj;
                return w81Var2;
            default:
                w81 w81Var3 = new w81(this.d0, r41Var);
                w81Var3.Z = obj;
                return w81Var3;
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        qn2 qn2Var = this.d0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                bt4 bt4Var = (bt4) this.Z;
                this.Y = 1;
                Object g = qn2Var.g(this);
                if (g == x61Var) {
                    return x61Var;
                }
                return g;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                bt4 bt4Var2 = (bt4) this.Z;
                this.Y = 1;
                Object g2 = qn2Var.g(this);
                if (g2 == x61Var2) {
                    return x61Var2;
                }
                return g2;
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    oi2.Y(obj);
                    if (((w61) this.Z).A().Z(b97.B) != null) {
                        this.Y = 1;
                        Object g3 = qn2Var.g(this);
                        if (g3 == x61Var3) {
                            return x61Var3;
                        }
                        return g3;
                    }
                    i.m("Expected a TransactionElement in the CoroutineContext but none was found.");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w81(int i, r41 r41Var, qn2 qn2Var) {
        super(2, r41Var);
        this.X = i;
        this.d0 = qn2Var;
    }
}
