package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g21  reason: default package */
/* loaded from: classes.dex */
public final class g21 implements le2 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ g21(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d4  */
    @Override // defpackage.le2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ne2 ne2Var, r41 r41Var) {
        kf2 kf2Var;
        int i;
        Object obj;
        o e;
        s0 s0Var;
        int i2;
        k36 k36Var;
        Throwable th;
        int i3 = this.A;
        Object obj2 = this.B;
        jg7 jg7Var = jg7.a;
        switch (i3) {
            case 0:
                Object b = ((cf2) obj2).b(new a7(ne2Var, 8), r41Var);
                if (b == x61.COROUTINE_SUSPENDED) {
                    return b;
                }
                return jg7Var;
            case 1:
                Object b2 = ((g21) obj2).b(new a7(ne2Var, 10), r41Var);
                if (b2 == x61.COROUTINE_SUSPENDED) {
                    return b2;
                }
                return jg7Var;
            case 2:
                Object b3 = ((g21) obj2).b(new a7(ne2Var, 15), r41Var);
                if (b3 == x61.COROUTINE_SUSPENDED) {
                    return b3;
                }
                return jg7Var;
            case 3:
                u12 u12Var = new u12((fo2) obj2, ne2Var, (r41) null, 7);
                o66 o66Var = new o66(r41Var, r41Var.b());
                Object Z = mp2.Z(o66Var, true, o66Var, u12Var);
                if (Z == x61.COROUTINE_SUSPENDED) {
                    return Z;
                }
                return jg7Var;
            case 4:
                Object a = ne2Var.a(obj2, r41Var);
                if (a == x61.COROUTINE_SUSPENDED) {
                    return a;
                }
                return jg7Var;
            case 5:
                if (r41Var instanceof kf2) {
                    kf2Var = (kf2) r41Var;
                    int i4 = kf2Var.X;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        kf2Var.X = i4 - Integer.MIN_VALUE;
                        Object obj3 = kf2Var.R;
                        x61 x61Var = x61.COROUTINE_SUSPENDED;
                        i = kf2Var.X;
                        if (i == 0) {
                            if (i == 1) {
                                obj = kf2Var.Z;
                                try {
                                    oi2.Y(obj3);
                                } catch (o e2) {
                                    e = e2;
                                    if (e.A != obj) {
                                        throw e;
                                    }
                                    return jg7Var;
                                }
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj3);
                            Object obj4 = new Object();
                            try {
                                vc vcVar = new vc(new Object(), ne2Var, obj4, 5);
                                kf2Var.Z = obj4;
                                kf2Var.X = 1;
                                if (((b7) obj2).b(vcVar, kf2Var) == x61Var) {
                                    return x61Var;
                                }
                            } catch (o e3) {
                                obj = obj4;
                                e = e3;
                                if (e.A != obj) {
                                }
                                return jg7Var;
                            }
                        }
                        return jg7Var;
                    }
                }
                kf2Var = new kf2(this, r41Var);
                Object obj32 = kf2Var.R;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                i = kf2Var.X;
                if (i == 0) {
                }
                return jg7Var;
            case 6:
                Object b4 = ((pa3) obj2).b(new a7(ne2Var, 18), r41Var);
                if (b4 == x61.COROUTINE_SUSPENDED) {
                    return b4;
                }
                return jg7Var;
            default:
                if (r41Var instanceof s0) {
                    s0Var = (s0) r41Var;
                    int i5 = s0Var.Z;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        s0Var.Z = i5 - Integer.MIN_VALUE;
                        Object obj5 = s0Var.X;
                        x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                        i2 = s0Var.Z;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                k36Var = s0Var.R;
                                try {
                                    oi2.Y(obj5);
                                } catch (Throwable th2) {
                                    th = th2;
                                    k36Var.u();
                                    throw th;
                                }
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj5);
                            l61 l61Var = s0Var.B;
                            l61Var.getClass();
                            k36 k36Var2 = new k36(ne2Var, l61Var);
                            try {
                                s0Var.R = k36Var2;
                                s0Var.Z = 1;
                                Object o = ((eo2) obj2).o(k36Var2, s0Var);
                                if (o != x61Var3) {
                                    o = jg7Var;
                                }
                                if (o == x61Var3) {
                                    return x61Var3;
                                }
                                k36Var = k36Var2;
                            } catch (Throwable th3) {
                                k36Var = k36Var2;
                                th = th3;
                                k36Var.u();
                                throw th;
                            }
                        }
                        k36Var.u();
                        return jg7Var;
                    }
                }
                s0Var = new s0(this, r41Var);
                Object obj52 = s0Var.X;
                x61 x61Var32 = x61.COROUTINE_SUSPENDED;
                i2 = s0Var.Z;
                if (i2 == 0) {
                }
                k36Var.u();
                return jg7Var;
        }
    }
}
