package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pf3  reason: default package */
/* loaded from: classes.dex */
public final class pf3 extends dm5 implements fo2 {
    public int L;
    public /* synthetic */ ad1 R;
    public final /* synthetic */ zb X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf3(zb zbVar, r41 r41Var) {
        super(3, r41Var);
        this.X = zbVar;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        jg7 jg7Var = (jg7) obj2;
        pf3 pf3Var = new pf3(this.X, (r41) obj3);
        pf3Var.R = (ad1) obj;
        return pf3Var.s(jg7.a);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        zb zbVar = this.X;
        u0 u0Var = (u0) zbVar.L;
        ad1 ad1Var = this.R;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.L;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            byte v = u0Var.v();
            if (v == 1) {
                return zbVar.s(true);
            }
            if (v == 0) {
                return zbVar.s(false);
            }
            if (v == 6) {
                this.R = null;
                this.L = 1;
                obj = zb.h(zbVar, ad1Var, this);
                if (obj == x61Var) {
                    return x61Var;
                }
            } else if (v == 8) {
                return zbVar.r();
            } else {
                u0.q(u0Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
        }
        return (de3) obj;
    }
}
