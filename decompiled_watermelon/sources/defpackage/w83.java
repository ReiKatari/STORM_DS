package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w83  reason: default package */
/* loaded from: classes.dex */
public final class w83 extends jc5 implements bj2 {
    public int L;
    public /* synthetic */ e91 R;
    public final /* synthetic */ sb X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w83(sb sbVar, j11 j11Var) {
        super(3, j11Var);
        this.X = sbVar;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        o27 o27Var = (o27) obj2;
        w83 w83Var = new w83(this.X, (j11) obj3);
        w83Var.R = (e91) obj;
        return w83Var.v(o27.a);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        sb sbVar = this.X;
        t0 t0Var = (t0) sbVar.L;
        e91 e91Var = this.R;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.L;
        if (i != 0) {
            if (i == 1) {
                me2.a0(obj);
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            byte v = t0Var.v();
            if (v == 1) {
                return sbVar.s(true);
            }
            if (v == 0) {
                return sbVar.s(false);
            }
            if (v == 6) {
                this.R = null;
                this.L = 1;
                obj = sb.g(sbVar, e91Var, this);
                if (obj == p31Var) {
                    return p31Var;
                }
            } else if (v == 8) {
                return sbVar.r();
            } else {
                t0.q(t0Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return (k73) obj;
    }
}
