package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ut6  reason: default package */
/* loaded from: classes.dex */
public final class ut6 implements ne2 {
    public final ne2 A;
    public final bf4 B;

    public ut6(ne2 ne2Var, bf4 bf4Var) {
        this.A = ne2Var;
        this.B = bf4Var;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        return this.A.a(obj, r41Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(s41 s41Var) {
        tt6 tt6Var;
        int i;
        Throwable th;
        k36 k36Var;
        ut6 ut6Var;
        ne2 ne2Var;
        if (s41Var instanceof tt6) {
            tt6Var = (tt6) s41Var;
            int i2 = tt6Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tt6Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = tt6Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = tt6Var.d0;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k36Var = tt6Var.X;
                    ut6Var = tt6Var.R;
                    try {
                        oi2.Y(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        k36Var.u();
                        throw th;
                    }
                } else {
                    oi2.Y(obj);
                    l61 l61Var = tt6Var.B;
                    l61Var.getClass();
                    k36 k36Var2 = new k36(this.A, l61Var);
                    try {
                        bf4 bf4Var = this.B;
                        tt6Var.R = this;
                        tt6Var.X = k36Var2;
                        tt6Var.d0 = 1;
                        if (bf4Var.o(k36Var2, tt6Var) != x61Var) {
                            ut6Var = this;
                            k36Var = k36Var2;
                        }
                        return x61Var;
                    } catch (Throwable th3) {
                        th = th3;
                        k36Var = k36Var2;
                        k36Var.u();
                        throw th;
                    }
                }
                k36Var.u();
                ne2Var = ut6Var.A;
                if (ne2Var instanceof ut6) {
                    tt6Var.R = null;
                    tt6Var.X = null;
                    tt6Var.d0 = 2;
                    if (((ut6) ne2Var).b(tt6Var) == x61Var) {
                        return x61Var;
                    }
                }
                return jg7Var;
            }
        }
        tt6Var = new tt6(this, s41Var);
        Object obj2 = tt6Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = tt6Var.d0;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
        k36Var.u();
        ne2Var = ut6Var.A;
        if (ne2Var instanceof ut6) {
        }
        return jg7Var2;
    }
}
