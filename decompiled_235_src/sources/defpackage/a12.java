package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a12  reason: default package */
/* loaded from: classes.dex */
public final class a12 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public final /* synthetic */ nv4 Z;
    public final /* synthetic */ sz1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a12(sz1 sz1Var, nv4 nv4Var, r41 r41Var) {
        super(2, r41Var);
        this.d0 = sz1Var;
        this.Z = nv4Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((a12) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((a12) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        sz1 sz1Var = this.d0;
        nv4 nv4Var = this.Z;
        switch (i) {
            case 0:
                return new a12(sz1Var, nv4Var, r41Var);
            default:
                return new a12(nv4Var, sz1Var, r41Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r0 == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
        if (r9 == r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
        if (r0 != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f1, code lost:
        return r4;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        switch (this.X) {
            case 0:
                jg7 jg7Var = jg7.a;
                sz1 sz1Var = this.d0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i = this.Y;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                oi2.Y(obj);
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (booleanValue) {
                            nv4 nv4Var = sz1Var.b0;
                            nv4 nv4Var2 = this.Z;
                            if (nv4Var == nv4Var2 && ((bv4) nv4Var2.i.A.getValue()).c.a == 0) {
                                sz1.l(sz1Var, sz1Var.w.f(false, ((ng6) sz1Var.c).b.getBoolean("ra_hardcore_enabled", false)));
                                this.Y = 3;
                                sz1Var.U0();
                                break;
                            }
                        }
                        q33 q33Var = sz1Var.g0;
                        synchronized (q33Var) {
                            q33Var.A = true;
                        }
                        if (!booleanValue) {
                            sz1Var.J0.k(g77.a);
                        }
                        this.Y = 3;
                        sz1Var.U0();
                    } else {
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    jh jhVar = sz1Var.v;
                    this.Y = 1;
                    jhVar.getClass();
                    jh.i();
                    break;
                }
                this.Y = 2;
                obj = sz1Var.P0(this);
                break;
            default:
                sz1 sz1Var2 = this.d0;
                nv4 nv4Var3 = this.Z;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.Y = 1;
                    obj = nv4Var3.d(this);
                    if (obj == x61Var2) {
                        return x61Var2;
                    }
                }
                int intValue = ((Number) obj).intValue();
                xv2 xv2Var = sz1Var2.m;
                gd5 gd5Var = nv4Var3.a;
                xv2Var.b(gd5Var.a, gd5Var.c);
                sz1Var2.G0("ra_pending_session_cleared", new vr4("reason", "runtime_job_failed"), new vr4("discarded", new Integer(intValue)), new vr4("accepted", Boolean.FALSE));
                return jg7.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a12(nv4 nv4Var, sz1 sz1Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = nv4Var;
        this.d0 = sz1Var;
    }
}
