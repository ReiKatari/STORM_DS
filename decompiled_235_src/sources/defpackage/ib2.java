package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ib2  reason: default package */
/* loaded from: classes.dex */
public final class ib2 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ xb2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib2(xb2 xb2Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = xb2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((ib2) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((ib2) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((ib2) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((ib2) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        xb2 xb2Var = this.Z;
        switch (i) {
            case 0:
                return new ib2(xb2Var, r41Var, 0);
            case 1:
                return new ib2(xb2Var, r41Var, 1);
            case 2:
                return new ib2(xb2Var, r41Var, 2);
            default:
                return new ib2(xb2Var, r41Var, 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r1 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r2.b(r10, r9) == r0) goto L16;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        xb2 xb2Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    of6 of6Var = xb2Var.k;
                    hb2 hb2Var = new hb2(xb2Var, 0);
                    this.Y = 1;
                    of6Var.getClass();
                    if (of6.m(of6Var, hb2Var, this) == x61Var) {
                        return x61Var;
                    }
                }
                e41.c();
                return null;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ng6 ng6Var = (ng6) xb2Var.c;
                wp0 p = ng6Var.p("rom_search_dirs", new vf6(ng6Var, 11));
                m5 m5Var = new m5(xb2Var, null, 14);
                this.Y = 1;
                if (f04.v(p, m5Var, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                if (xb2.b(xb2Var, this) == x61Var3) {
                    return x61Var3;
                }
                return jg7Var;
            default:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                oi2.Y(obj);
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        tp6 tp6Var = xb2Var.l;
                        m06 m06Var = m06.NOT_SCANNING;
                        this.Y = 3;
                        tp6Var.a(m06Var, this);
                        if (jg7Var != x61Var4) {
                            return jg7Var;
                        }
                        return x61Var4;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    tp6 tp6Var2 = xb2Var.l;
                    m06 m06Var2 = m06.SCANNING;
                    this.Y = 1;
                    tp6Var2.a(m06Var2, this);
                    break;
                }
                xb2Var.getClass();
                g21 g21Var = new g21(new wb2(xb2Var, null, null), 7);
                hb2 hb2Var2 = new hb2(xb2Var, 2);
                this.Y = 2;
                break;
        }
    }
}
