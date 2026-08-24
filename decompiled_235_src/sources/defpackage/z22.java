package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z22  reason: default package */
/* loaded from: classes.dex */
public final class z22 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 1;
    public int Y;
    public Object Z;
    public int d0;
    public Object e0;
    public final /* synthetic */ Object f0;
    public Object g0;
    public final /* synthetic */ Object h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z22(ss5 ss5Var, ss4 ss4Var, int i, ip3 ip3Var, pr3 pr3Var, r41 r41Var) {
        super(2, r41Var);
        this.e0 = ss5Var;
        this.f0 = ss4Var;
        this.d0 = i;
        this.g0 = ip3Var;
        this.h0 = pr3Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((z22) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((z22) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Object obj2 = this.h0;
        Object obj3 = this.f0;
        switch (i) {
            case 0:
                return new z22((sz1) obj3, (c46) obj2, r41Var);
            default:
                z22 z22Var = new z22((ss5) this.e0, (ss4) obj3, this.d0, (ip3) this.g0, (pr3) obj2, r41Var);
                z22Var.Z = obj;
                return z22Var;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:24|(1:25)|(1:(1:(1:(1:(1:(2:32|33)(2:34|35))(2:36|37))(6:38|39|40|(1:44)|42|43))(8:45|46|47|(1:49)|40|(0)|42|43))(1:51))(3:63|(1:65)(1:71)|(4:67|(1:69)|42|43)(1:70))|52|53|(5:55|47|(0)|40|(0))|42|43) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0130, code lost:
        if (r13.a(r3, r12) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0141, code lost:
        r13 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0142, code lost:
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0143, code lost:
        r12.e0 = null;
        r12.Z = r13;
        r12.g0 = null;
        r12.Y = r1;
        r12.d0 = 5;
        r2.U0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0150, code lost:
        if (r4 != r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0155, code lost:
        throw r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0120 A[Catch: all -> 0x00b1, TRY_LEAVE, TryCatch #1 {all -> 0x00b1, blocks: (B:31:0x00ac, B:36:0x00be, B:52:0x0118, B:54:0x0120), top: B:70:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [sz1] */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        dy1 dy1Var;
        c46 c46Var;
        sz1 sz1Var;
        int i;
        int i2;
        int i3 = this.X;
        ?? r1 = this.h0;
        ?? r2 = "call to 'resume' before 'invoke' with coroutine";
        Object obj2 = this.f0;
        jg7 jg7Var = jg7.a;
        switch (i3) {
            case 0:
                sz1 sz1Var2 = (sz1) obj2;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i4 = this.d0;
                try {
                } catch (Throwable th) {
                    th = th;
                    break;
                }
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    if (i4 != 5) {
                                        i.m("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    Throwable th2 = (Throwable) this.Z;
                                    dy1 dy1Var2 = (dy1) ((sz1) this.e0);
                                    oi2.Y(obj);
                                    throw th2;
                                }
                                dy1 dy1Var3 = (dy1) ((sz1) this.e0);
                                oi2.Y(obj);
                                return jg7Var;
                            }
                            int i5 = this.Y;
                            dy1 dy1Var4 = (dy1) this.Z;
                            sz1Var = (sz1) this.e0;
                            oi2.Y(obj);
                            i2 = i5;
                            this.e0 = null;
                            this.Z = null;
                            this.Y = i2;
                            this.d0 = 4;
                            sz1Var.U0();
                            if (jg7Var != x61Var) {
                                return jg7Var;
                            }
                            return x61Var;
                        }
                        int i6 = this.Y;
                        dy1 dy1Var5 = (dy1) this.Z;
                        sz1Var = (sz1) this.e0;
                        oi2.Y(obj);
                        i = i6;
                        i2 = i;
                        if (!((Boolean) obj).booleanValue()) {
                            of6 of6Var = sz1Var.J0;
                            v77 v77Var = v77.a;
                            this.e0 = sz1Var;
                            this.Z = null;
                            this.Y = i;
                            this.d0 = 3;
                            i2 = i;
                            break;
                        }
                        this.e0 = null;
                        this.Z = null;
                        this.Y = i2;
                        this.d0 = 4;
                        sz1Var.U0();
                        if (jg7Var != x61Var) {
                        }
                        return x61Var;
                    }
                    int i7 = this.Y;
                    dy1Var = (dy1) this.g0;
                    oi2.Y(obj);
                    c46Var = (c46) this.Z;
                    sz1Var2 = (sz1) this.e0;
                    r1 = i7;
                } else {
                    oi2.Y(obj);
                    Object value = sz1Var2.p0.getValue();
                    if (value instanceof dy1) {
                        dy1Var = (dy1) value;
                    } else {
                        dy1Var = null;
                    }
                    if (dy1Var != null) {
                        c46Var = (c46) r1;
                        jh jhVar = sz1Var2.v;
                        this.e0 = sz1Var2;
                        this.Z = c46Var;
                        this.g0 = dy1Var;
                        this.Y = 0;
                        this.d0 = 1;
                        jhVar.getClass();
                        jh.i();
                        if (jg7Var != x61Var) {
                            r1 = 0;
                        }
                        return x61Var;
                    }
                    return jg7Var;
                }
                pq5 pq5Var = dy1Var.a;
                this.e0 = sz1Var2;
                this.Z = null;
                this.g0 = null;
                this.Y = r1;
                this.d0 = 2;
                obj = sz1Var2.X0(pq5Var, c46Var, this);
                if (obj != x61Var) {
                    sz1Var = sz1Var2;
                    i = r1;
                    i2 = i;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    this.e0 = null;
                    this.Z = null;
                    this.Y = i2;
                    this.d0 = 4;
                    sz1Var.U0();
                    if (jg7Var != x61Var) {
                    }
                }
                return x61Var;
            default:
                ss4 ss4Var = (ss4) obj2;
                ss5 ss5Var = (ss5) this.e0;
                w61 w61Var = (w61) this.Z;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i8 = this.Y;
                if (i8 != 0) {
                    if (i8 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                if (!ss5Var.a.isEmpty() && ss4Var.h() >= 0) {
                    le2 z = f04.z(np2.f0(new sr5(ss5Var, this.d0, ss4Var, 1)));
                    vc vcVar = new vc(w61Var, ss5Var, (ip3) this.g0, (pr3) r1);
                    this.Z = null;
                    this.Y = 1;
                    Object b = z.b(new a7(vcVar, 24), this);
                    if (b != x61Var2) {
                        b = jg7Var;
                    }
                    if (b == x61Var2) {
                        return x61Var2;
                    }
                    return jg7Var;
                }
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z22(sz1 sz1Var, c46 c46Var, r41 r41Var) {
        super(2, r41Var);
        this.f0 = sz1Var;
        this.h0 = c46Var;
    }
}
