package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x81  reason: default package */
/* loaded from: classes.dex */
public final class x81 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public c97 Y;
    public int Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ m16 e0;
    public final /* synthetic */ qn2 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x81(m16 m16Var, r41 r41Var, qn2 qn2Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.e0 = m16Var;
        this.f0 = qn2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        d97 d97Var = (d97) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((x81) q(r41Var, d97Var)).s(jg7Var);
            default:
                return ((x81) q(r41Var, d97Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        switch (this.X) {
            case 0:
                x81 x81Var = new x81(this.e0, r41Var, this.f0, 0);
                x81Var.d0 = obj;
                return x81Var;
            default:
                x81 x81Var2 = new x81(this.e0, r41Var, this.f0, 1);
                x81Var2.d0 = obj;
                return x81Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
        if (r13 == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0147, code lost:
        if (r13 == r0) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0161  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        c97 c97Var;
        d97 d97Var;
        c97 c97Var2;
        d97 d97Var2;
        d97 d97Var3;
        Object obj2;
        c97 c97Var3;
        d97 d97Var4;
        c97 c97Var4;
        d97 d97Var5;
        d97 d97Var6;
        Object obj3;
        int i = this.X;
        m16 m16Var = this.e0;
        qn2 qn2Var = this.f0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Z;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        oi2.Y(obj);
                                        return obj;
                                    }
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj2 = this.d0;
                                oi2.Y(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    zb3 g = m16Var.g();
                                    g.b.e(g.e, g.f);
                                }
                                return obj2;
                            }
                            d97Var2 = (d97) this.d0;
                            oi2.Y(obj);
                            this.d0 = obj;
                            this.Z = 4;
                            Boolean c = d97Var2.c(this);
                            if (c != x61Var) {
                                Object obj4 = obj;
                                obj = c;
                                obj2 = obj4;
                                if (!((Boolean) obj).booleanValue()) {
                                }
                                return obj2;
                            }
                            return x61Var;
                        }
                        c97Var = this.Y;
                        d97Var3 = (d97) this.d0;
                        oi2.Y(obj);
                        c97Var2 = c97Var;
                        d97Var2 = d97Var3;
                        w81 w81Var = new w81(0, null, qn2Var);
                        this.d0 = d97Var2;
                        this.Y = null;
                        this.Z = 3;
                        obj = d97Var2.a(c97Var2, w81Var, this);
                        break;
                    } else {
                        c97Var = this.Y;
                        d97Var = (d97) this.d0;
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    d97 d97Var7 = (d97) this.d0;
                    c97Var = c97.IMMEDIATE;
                    this.d0 = d97Var7;
                    this.Y = c97Var;
                    this.Z = 1;
                    Boolean c2 = d97Var7.c(this);
                    if (c2 != x61Var) {
                        d97Var = d97Var7;
                        obj = c2;
                    }
                    return x61Var;
                }
                if (!((Boolean) obj).booleanValue()) {
                    zb3 g2 = m16Var.g();
                    this.d0 = d97Var;
                    this.Y = c97Var;
                    this.Z = 2;
                    if (g2.a(this) != x61Var) {
                        d97Var3 = d97Var;
                        c97Var2 = c97Var;
                        d97Var2 = d97Var3;
                        w81 w81Var2 = new w81(0, null, qn2Var);
                        this.d0 = d97Var2;
                        this.Y = null;
                        this.Z = 3;
                        obj = d97Var2.a(c97Var2, w81Var2, this);
                    }
                    return x61Var;
                }
                c97Var2 = c97Var;
                d97Var2 = d97Var;
                w81 w81Var22 = new w81(0, null, qn2Var);
                this.d0 = d97Var2;
                this.Y = null;
                this.Z = 3;
                obj = d97Var2.a(c97Var2, w81Var22, this);
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Z;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 == 5) {
                                        oi2.Y(obj);
                                        return obj;
                                    }
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj3 = this.d0;
                                oi2.Y(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    zb3 g3 = m16Var.g();
                                    g3.b.e(g3.e, g3.f);
                                }
                                return obj3;
                            }
                            d97Var5 = (d97) this.d0;
                            oi2.Y(obj);
                            this.d0 = obj;
                            this.Z = 4;
                            Boolean c3 = d97Var5.c(this);
                            if (c3 != x61Var2) {
                                Object obj5 = obj;
                                obj = c3;
                                obj3 = obj5;
                                if (!((Boolean) obj).booleanValue()) {
                                }
                                return obj3;
                            }
                            return x61Var2;
                        }
                        c97Var3 = this.Y;
                        d97Var6 = (d97) this.d0;
                        oi2.Y(obj);
                        c97Var4 = c97Var3;
                        d97Var5 = d97Var6;
                        w81 w81Var3 = new w81(1, null, qn2Var);
                        this.d0 = d97Var5;
                        this.Y = null;
                        this.Z = 3;
                        obj = d97Var5.a(c97Var4, w81Var3, this);
                        break;
                    } else {
                        c97Var3 = this.Y;
                        d97Var4 = (d97) this.d0;
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    d97 d97Var8 = (d97) this.d0;
                    c97Var3 = c97.IMMEDIATE;
                    this.d0 = d97Var8;
                    this.Y = c97Var3;
                    this.Z = 1;
                    Boolean c4 = d97Var8.c(this);
                    if (c4 != x61Var2) {
                        d97Var4 = d97Var8;
                        obj = c4;
                    }
                    return x61Var2;
                }
                if (!((Boolean) obj).booleanValue()) {
                    zb3 g4 = m16Var.g();
                    this.d0 = d97Var4;
                    this.Y = c97Var3;
                    this.Z = 2;
                    if (g4.a(this) != x61Var2) {
                        d97Var6 = d97Var4;
                        c97Var4 = c97Var3;
                        d97Var5 = d97Var6;
                        w81 w81Var32 = new w81(1, null, qn2Var);
                        this.d0 = d97Var5;
                        this.Y = null;
                        this.Z = 3;
                        obj = d97Var5.a(c97Var4, w81Var32, this);
                    }
                    return x61Var2;
                }
                c97Var4 = c97Var3;
                d97Var5 = d97Var4;
                w81 w81Var322 = new w81(1, null, qn2Var);
                this.d0 = d97Var5;
                this.Y = null;
                this.Z = 3;
                obj = d97Var5.a(c97Var4, w81Var322, this);
        }
    }
}
