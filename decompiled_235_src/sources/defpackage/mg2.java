package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mg2  reason: default package */
/* loaded from: classes.dex */
public final class mg2 implements ne2 {
    public final /* synthetic */ ne2 A;
    public final /* synthetic */ m16 B;
    public final /* synthetic */ boolean L;
    public final /* synthetic */ qn2 R;

    public mg2(ne2 ne2Var, m16 m16Var, boolean z, qn2 qn2Var) {
        this.A = ne2Var;
        this.B = m16Var;
        this.L = z;
        this.R = qn2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r6.a(r8, r0) != r1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // defpackage.ne2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, r41 r41Var) {
        lg2 lg2Var;
        int i;
        ne2 ne2Var;
        if (r41Var instanceof lg2) {
            lg2Var = (lg2) r41Var;
            int i2 = lg2Var.X;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lg2Var.X = i2 - Integer.MIN_VALUE;
                Object obj2 = lg2Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = lg2Var.X;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj2);
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ne2Var = lg2Var.Y;
                    oi2.Y(obj2);
                } else {
                    oi2.Y(obj2);
                    Set set = (Set) obj;
                    ne2 ne2Var2 = this.A;
                    lg2Var.Y = ne2Var2;
                    lg2Var.X = 1;
                    obj2 = hv.S(lg2Var, this.B, true, this.L, this.R);
                    if (obj2 != x61Var) {
                        ne2Var = ne2Var2;
                    }
                    return x61Var;
                }
                lg2Var.Y = null;
                lg2Var.X = 2;
            }
        }
        lg2Var = new lg2(this, r41Var);
        Object obj22 = lg2Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = lg2Var.X;
        if (i == 0) {
        }
        lg2Var.Y = null;
        lg2Var.X = 2;
    }
}
