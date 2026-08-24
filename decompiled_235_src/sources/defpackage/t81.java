package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t81  reason: default package */
/* loaded from: classes.dex */
public final class t81 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t81(r41 r41Var, m16 m16Var, boolean z, boolean z2, qn2 qn2Var) {
        super(2, r41Var);
        this.Z = m16Var;
        this.d0 = z;
        this.e0 = z2;
        this.f0 = qn2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((t81) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((t81) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((t81) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.f0;
        Object obj3 = this.Z;
        switch (i) {
            case 0:
                return new t81((m16) obj3, this.d0, this.e0, (qn2) obj2, r41Var);
            case 1:
                return new t81(r41Var, (m16) obj3, this.d0, this.e0, (qn2) obj2);
            default:
                return new t81(r41Var, (wz3) obj3, (tu0) obj2, this.d0, this.e0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        boolean z;
        boolean z2;
        Integer num = null;
        switch (this.X) {
            case 0:
                m16 m16Var = (m16) this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i = this.Y;
                if (i != 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                if ((!m16Var.k() || !m16Var.l()) && this.d0) {
                    z = true;
                } else {
                    z = false;
                }
                m16 m16Var2 = (m16) this.Z;
                boolean z3 = this.e0;
                s81 s81Var = new s81(z, z3, m16Var2, null, (qn2) this.f0, 0);
                this.Y = 1;
                Object q = m16Var2.q(z3, s81Var, this);
                if (q == x61Var) {
                    return x61Var;
                }
                return q;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
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
                m16 m16Var3 = (m16) this.Z;
                boolean z4 = this.d0;
                s81 s81Var2 = new s81(this.e0, z4, m16Var3, null, (qn2) this.f0, 1);
                this.Y = 1;
                Object q2 = m16Var3.q(z4, s81Var2, this);
                if (q2 == x61Var2) {
                    return x61Var2;
                }
                return q2;
            default:
                boolean z5 = this.d0;
                tu0 tu0Var = (tu0) this.f0;
                wz3 wz3Var = (wz3) this.Z;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    jg1 jg1Var = wz3Var.i;
                    if (jg1Var != null) {
                        this.Y = 1;
                        obj = jg1Var.X(this);
                        if (obj == x61Var3) {
                            return x61Var3;
                        }
                    } else {
                        z2 = false;
                        if (!z2) {
                            wz3Var.c(wz3Var.f, -1);
                            tu0Var.v0(new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
                        } else {
                            wz3Var.e = z5;
                            if (!z5) {
                                wz3Var.c(wz3Var.f, -1);
                            }
                            if (wz3Var.c != null) {
                                if (z5) {
                                    wz3Var.c(wz3Var.f, 0);
                                }
                                boolean z6 = this.e0;
                                tu0 tu0Var2 = wz3Var.h;
                                if (z6) {
                                    if (tu0Var2 != null) {
                                        i61.A("There is a new enableLowLightBoost being set", tu0Var2);
                                    }
                                    wz3Var.h = null;
                                } else if (tu0Var2 != null) {
                                    nc1.a0(tu0Var, tu0Var2);
                                }
                                wz3Var.h = tu0Var;
                                op6 op6Var = wz3Var.a;
                                if (z5) {
                                    num = new Integer(6);
                                }
                                synchronized (op6Var.d) {
                                    op6Var.k = num;
                                }
                                nc1.a0(op6Var.f(), tu0Var);
                                tu0Var.a0(new r5(16, tu0Var, wz3Var));
                            } else {
                                i61.A("Camera is not active.", tu0Var);
                            }
                        }
                        return jg7.a;
                    }
                }
                z2 = ((Boolean) obj).booleanValue();
                if (!z2) {
                }
                return jg7.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t81(r41 r41Var, wz3 wz3Var, tu0 tu0Var, boolean z, boolean z2) {
        super(2, r41Var);
        this.Z = wz3Var;
        this.f0 = tu0Var;
        this.d0 = z;
        this.e0 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t81(m16 m16Var, boolean z, boolean z2, qn2 qn2Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = m16Var;
        this.d0 = z;
        this.e0 = z2;
        this.f0 = qn2Var;
    }
}
