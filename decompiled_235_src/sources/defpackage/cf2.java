package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cf2  reason: default package */
/* loaded from: classes.dex */
public final class cf2 implements le2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ le2 B;
    public final /* synthetic */ eo2 L;

    public cf2(eo2 eo2Var, le2 le2Var) {
        this.A = 0;
        this.L = eo2Var;
        this.B = le2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.le2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ne2 ne2Var, r41 r41Var) {
        bf2 bf2Var;
        x61 x61Var;
        int i;
        k36 k36Var;
        cf2 cf2Var;
        le2 le2Var;
        int i2 = this.A;
        le2 le2Var2 = this.B;
        jg7 jg7Var = jg7.a;
        eo2 eo2Var = this.L;
        switch (i2) {
            case 0:
                if (r41Var instanceof bf2) {
                    bf2Var = (bf2) r41Var;
                    int i3 = bf2Var.X;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        bf2Var.X = i3 - Integer.MIN_VALUE;
                        Object obj = bf2Var.R;
                        x61Var = x61.COROUTINE_SUSPENDED;
                        i = bf2Var.X;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    oi2.Y(obj);
                                    return jg7Var;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            k36Var = bf2Var.e0;
                            ne2Var = bf2Var.d0;
                            cf2Var = bf2Var.Z;
                            try {
                                oi2.Y(obj);
                            } catch (Throwable th) {
                                th = th;
                                k36Var.u();
                                throw th;
                            }
                        } else {
                            oi2.Y(obj);
                            l61 l61Var = bf2Var.B;
                            l61Var.getClass();
                            k36 k36Var2 = new k36(ne2Var, l61Var);
                            try {
                                bf2Var.Z = this;
                                bf2Var.d0 = ne2Var;
                                bf2Var.e0 = k36Var2;
                                bf2Var.X = 1;
                                if (eo2Var.o(k36Var2, bf2Var) != x61Var) {
                                    cf2Var = this;
                                    k36Var = k36Var2;
                                }
                                return x61Var;
                            } catch (Throwable th2) {
                                th = th2;
                                k36Var = k36Var2;
                                k36Var.u();
                                throw th;
                            }
                        }
                        k36Var.u();
                        le2Var = cf2Var.B;
                        bf2Var.Z = null;
                        bf2Var.d0 = null;
                        bf2Var.e0 = null;
                        bf2Var.X = 2;
                        if (le2Var.b(ne2Var, bf2Var) != x61Var) {
                            return jg7Var;
                        }
                        return x61Var;
                    }
                }
                bf2Var = new bf2(this, r41Var);
                Object obj2 = bf2Var.R;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = bf2Var.X;
                if (i == 0) {
                }
                k36Var.u();
                le2Var = cf2Var.B;
                bf2Var.Z = null;
                bf2Var.d0 = null;
                bf2Var.e0 = null;
                bf2Var.X = 2;
                if (le2Var.b(ne2Var, bf2Var) != x61Var) {
                }
                return x61Var;
            case 1:
                Object b = le2Var2.b(new vc(new Object(), ne2Var, eo2Var, 4), r41Var);
                if (b == x61.COROUTINE_SUSPENDED) {
                    return b;
                }
                return jg7Var;
            default:
                Object b2 = le2Var2.b(new zb0(10, ne2Var, eo2Var), r41Var);
                if (b2 == x61.COROUTINE_SUSPENDED) {
                    return b2;
                }
                return jg7Var;
        }
    }

    public /* synthetic */ cf2(le2 le2Var, eo2 eo2Var, int i) {
        this.A = i;
        this.B = le2Var;
        this.L = eo2Var;
    }
}
