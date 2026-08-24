package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s81  reason: default package */
/* loaded from: classes.dex */
public final class s81 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public c97 Y;
    public int Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ boolean e0;
    public final /* synthetic */ boolean f0;
    public final /* synthetic */ m16 g0;
    public final /* synthetic */ qn2 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s81(boolean z, boolean z2, m16 m16Var, r41 r41Var, qn2 qn2Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.e0 = z;
        this.f0 = z2;
        this.g0 = m16Var;
        this.h0 = qn2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        d97 d97Var = (d97) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((s81) q(r41Var, d97Var)).s(jg7Var);
            default:
                return ((s81) q(r41Var, d97Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                s81 s81Var = new s81(this.e0, this.f0, this.g0, r41Var, this.h0, 0);
                s81Var.d0 = obj;
                return s81Var;
            default:
                s81 s81Var2 = new s81(this.e0, this.f0, this.g0, r41Var, this.h0, 1);
                s81Var2.d0 = obj;
                return s81Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r14.a(r13) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (r14 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0145, code lost:
        if (r14.a(r13) == r0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015e, code lost:
        if (r14 == r0) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        c97 c97Var;
        d97 d97Var;
        c97 c97Var2;
        d97 d97Var2;
        Object obj2;
        c97 c97Var3;
        d97 d97Var3;
        c97 c97Var4;
        d97 d97Var4;
        Object obj3;
        int i = this.X;
        boolean z = this.e0;
        boolean z2 = this.f0;
        m16 m16Var = this.g0;
        qn2 qn2Var = this.h0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Z;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    Object obj4 = this.d0;
                                    oi2.Y(obj);
                                    obj2 = obj4;
                                    if (((Boolean) obj).booleanValue()) {
                                        zb3 g = m16Var.g();
                                        g.b.e(g.e, g.f);
                                        return obj2;
                                    }
                                    return obj2;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            d97Var = (d97) this.d0;
                            oi2.Y(obj);
                            if (!z2) {
                                this.d0 = obj;
                                this.Z = 4;
                                Boolean c = d97Var.c(this);
                                if (c != x61Var) {
                                    obj2 = obj;
                                    obj = c;
                                    if (((Boolean) obj).booleanValue()) {
                                    }
                                }
                                return x61Var;
                            }
                            return obj;
                        }
                        c97Var = this.Y;
                        d97Var2 = (d97) this.d0;
                        oi2.Y(obj);
                        c97Var2 = c97Var;
                        d97Var = d97Var2;
                        r81 r81Var = new r81(0, null, qn2Var);
                        this.d0 = d97Var;
                        this.Y = null;
                        this.Z = 3;
                        obj = d97Var.a(c97Var2, r81Var, this);
                        break;
                    } else {
                        c97Var = this.Y;
                        d97Var2 = (d97) this.d0;
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    d97 d97Var5 = (d97) this.d0;
                    if (z) {
                        if (z2) {
                            c97Var = c97.DEFERRED;
                        } else {
                            c97Var = c97.IMMEDIATE;
                        }
                        if (!z2) {
                            this.d0 = d97Var5;
                            this.Y = c97Var;
                            this.Z = 1;
                            Boolean c2 = d97Var5.c(this);
                            if (c2 != x61Var) {
                                d97Var2 = d97Var5;
                                obj = c2;
                            }
                            return x61Var;
                        }
                        c97 c97Var5 = c97Var;
                        d97Var = d97Var5;
                        c97Var2 = c97Var5;
                        r81 r81Var2 = new r81(0, null, qn2Var);
                        this.d0 = d97Var;
                        this.Y = null;
                        this.Z = 3;
                        obj = d97Var.a(c97Var2, r81Var2, this);
                    } else {
                        d97Var5.getClass();
                        return qn2Var.g(((ud5) d97Var5).d());
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    zb3 g2 = m16Var.g();
                    this.d0 = d97Var2;
                    this.Y = c97Var;
                    this.Z = 2;
                    break;
                }
                c97Var2 = c97Var;
                d97Var = d97Var2;
                r81 r81Var22 = new r81(0, null, qn2Var);
                this.d0 = d97Var;
                this.Y = null;
                this.Z = 3;
                obj = d97Var.a(c97Var2, r81Var22, this);
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Z;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 4) {
                                    Object obj5 = this.d0;
                                    oi2.Y(obj);
                                    obj3 = obj5;
                                    if (((Boolean) obj).booleanValue()) {
                                        zb3 g3 = m16Var.g();
                                        g3.b.e(g3.e, g3.f);
                                        return obj3;
                                    }
                                    return obj3;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            d97Var3 = (d97) this.d0;
                            oi2.Y(obj);
                            if (!z2) {
                                this.d0 = obj;
                                this.Z = 4;
                                Boolean c3 = d97Var3.c(this);
                                if (c3 != x61Var2) {
                                    obj3 = obj;
                                    obj = c3;
                                    if (((Boolean) obj).booleanValue()) {
                                    }
                                }
                                return x61Var2;
                            }
                            return obj;
                        }
                        c97Var3 = this.Y;
                        d97Var4 = (d97) this.d0;
                        oi2.Y(obj);
                        c97Var4 = c97Var3;
                        d97Var3 = d97Var4;
                        r81 r81Var3 = new r81(1, null, qn2Var);
                        this.d0 = d97Var3;
                        this.Y = null;
                        this.Z = 3;
                        obj = d97Var3.a(c97Var4, r81Var3, this);
                        break;
                    } else {
                        c97Var3 = this.Y;
                        d97Var4 = (d97) this.d0;
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    d97 d97Var6 = (d97) this.d0;
                    if (z) {
                        if (z2) {
                            c97Var3 = c97.DEFERRED;
                        } else {
                            c97Var3 = c97.IMMEDIATE;
                        }
                        if (!z2) {
                            this.d0 = d97Var6;
                            this.Y = c97Var3;
                            this.Z = 1;
                            Boolean c4 = d97Var6.c(this);
                            if (c4 != x61Var2) {
                                d97Var4 = d97Var6;
                                obj = c4;
                            }
                            return x61Var2;
                        }
                        c97 c97Var6 = c97Var3;
                        d97Var3 = d97Var6;
                        c97Var4 = c97Var6;
                        r81 r81Var32 = new r81(1, null, qn2Var);
                        this.d0 = d97Var3;
                        this.Y = null;
                        this.Z = 3;
                        obj = d97Var3.a(c97Var4, r81Var32, this);
                    } else {
                        d97Var6.getClass();
                        return qn2Var.g(((ud5) d97Var6).d());
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    zb3 g4 = m16Var.g();
                    this.d0 = d97Var4;
                    this.Y = c97Var3;
                    this.Z = 2;
                    break;
                }
                c97Var4 = c97Var3;
                d97Var3 = d97Var4;
                r81 r81Var322 = new r81(1, null, qn2Var);
                this.d0 = d97Var3;
                this.Y = null;
                this.Z = 3;
                obj = d97Var3.a(c97Var4, r81Var322, this);
        }
    }
}
