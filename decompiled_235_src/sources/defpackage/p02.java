package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p02  reason: default package */
/* loaded from: classes.dex */
public final class p02 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ sz1 Z;
    public dy1 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p02(sz1 sz1Var, dy1 dy1Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = sz1Var;
        this.d0 = dy1Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((p02) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((p02) q(r41Var, w61Var)).s(jg7Var);
            case 2:
                return ((p02) q(r41Var, w61Var)).s(jg7Var);
            case 3:
                return ((p02) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((p02) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        sz1 sz1Var = this.Z;
        switch (i) {
            case 0:
                return new p02(sz1Var, this.d0, r41Var, 0);
            case 1:
                return new p02(sz1Var, this.d0, r41Var, 1);
            case 2:
                return new p02(sz1Var, r41Var);
            case 3:
                return new p02(sz1Var, this.d0, r41Var, 3);
            default:
                return new p02(sz1Var, this.d0, r41Var, 4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d9, code lost:
        if (r6 == r11) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e2, code lost:
        if (r7 == r11) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ed, code lost:
        if (r1 == r11) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0202, code lost:
        if (r1.a(defpackage.h77.a, r17) == r11) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
        if (r2 == r1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:?, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r2 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00eb, code lost:
        if (r3 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0107, code lost:
        if (r0 == r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0166, code lost:
        if (r6 == r11) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r7 == r11) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017a, code lost:
        if (r1 == r11) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018f, code lost:
        if (r1.a(defpackage.i77.a, r17) == r11) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object t0;
        Object A0;
        Object t02;
        Object X0;
        dy1 dy1Var;
        Object b;
        Object d0;
        Object d02;
        Object d03;
        int i = this.X;
        sz1 sz1Var = this.Z;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                pq5 pq5Var = this.d0.a;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        oi2.Y(obj);
                                        return jg7Var;
                                    }
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                oi2.Y(obj);
                                this.Y = 5;
                                sz1Var.U0();
                                if (jg7Var != x61Var) {
                                    return jg7Var;
                                }
                                return x61Var;
                            }
                            oi2.Y(obj);
                            A0 = obj;
                            if (((Boolean) A0).booleanValue()) {
                                of6 of6Var = sz1Var.J0;
                                this.Y = 4;
                                break;
                            }
                            this.Y = 5;
                            sz1Var.U0();
                            if (jg7Var != x61Var) {
                            }
                            return x61Var;
                        }
                        oi2.Y(obj);
                        t0 = obj;
                        this.Y = 3;
                        A0 = sz1Var.A0(pq5Var, (c46) t0, this);
                        break;
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
                t0 = sz1Var.t0(pq5Var, this);
                break;
            case 1:
                pq5 pq5Var2 = this.d0.a;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    if (i3 == 5) {
                                        oi2.Y(obj);
                                        return jg7Var;
                                    }
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                oi2.Y(obj);
                                this.Y = 5;
                                sz1Var.U0();
                                if (jg7Var != x61Var2) {
                                    return jg7Var;
                                }
                                return x61Var2;
                            }
                            oi2.Y(obj);
                            X0 = obj;
                            if (((Boolean) X0).booleanValue()) {
                                of6 of6Var2 = sz1Var.J0;
                                this.Y = 4;
                                break;
                            }
                            this.Y = 5;
                            sz1Var.U0();
                            if (jg7Var != x61Var2) {
                            }
                            return x61Var2;
                        }
                        oi2.Y(obj);
                        t02 = obj;
                        this.Y = 3;
                        X0 = sz1Var.X0(pq5Var2, (c46) t02, this);
                        break;
                    } else {
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    jh jhVar2 = sz1Var.v;
                    this.Y = 1;
                    jhVar2.getClass();
                    jh.i();
                    break;
                }
                this.Y = 2;
                t02 = sz1Var.t0(pq5Var2, this);
                break;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                sz1 sz1Var2 = this.Z;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            oi2.Y(obj);
                            d0 = obj;
                            pj4 pj4Var = (pj4) d0;
                            if (pj4Var.a == ui4.OK && pj4Var.a() > 0) {
                                sz1Var2.J0.k(new w67(pj4Var.a()));
                                return jg7Var;
                            }
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dy1Var = this.d0;
                    oi2.Y(obj);
                    b = obj;
                } else {
                    oi2.Y(obj);
                    Object value = sz1Var2.p0.getValue();
                    if (value instanceof dy1) {
                        dy1Var = (dy1) value;
                    } else {
                        dy1Var = null;
                    }
                    if (dy1Var != null) {
                        pn5 pn5Var = sz1Var2.g;
                        this.d0 = dy1Var;
                        this.Y = 1;
                        b = ((pl) pn5Var).c.b(this);
                        break;
                    } else {
                        return jg7Var;
                    }
                }
                dy1 dy1Var2 = dy1Var;
                jb5 jb5Var = (jb5) b;
                if (jb5Var != null) {
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    u12 u12Var = new u12(sz1Var2, (Object) jb5Var, (Object) dy1Var2, (r41) null, 3);
                    this.d0 = null;
                    this.Y = 2;
                    d0 = hv.d0(de1Var, u12Var, this);
                    break;
                } else {
                    return jg7Var;
                }
                break;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    d02 = obj;
                } else {
                    oi2.Y(obj);
                    pq5 pq5Var3 = this.d0.a;
                    this.Y = 1;
                    sz1Var.getClass();
                    xe1 xe1Var2 = xk1.a;
                    d02 = hv.d0(de1.L, new g12(sz1Var, pq5Var3, null, 1), this);
                    break;
                }
                of6 of6Var3 = sz1Var.T0;
                yy1 yy1Var = new yy1((List) d02, xy1.SAVING);
                this.Y = 2;
                if (of6Var3.a(yy1Var, this) != x61Var4) {
                    return jg7Var;
                }
                return x61Var4;
            default:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 == 2) {
                            oi2.Y(obj);
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    d03 = obj;
                } else {
                    oi2.Y(obj);
                    pq5 pq5Var4 = this.d0.a;
                    this.Y = 1;
                    sz1Var.getClass();
                    xe1 xe1Var3 = xk1.a;
                    d03 = hv.d0(de1.L, new g12(sz1Var, pq5Var4, null, 1), this);
                    break;
                }
                of6 of6Var4 = sz1Var.T0;
                yy1 yy1Var2 = new yy1((List) d03, xy1.LOADING);
                this.Y = 2;
                if (of6Var4.a(yy1Var2, this) != x61Var5) {
                    return jg7Var;
                }
                return x61Var5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p02(sz1 sz1Var, r41 r41Var) {
        super(2, r41Var);
        this.X = 2;
        this.Z = sz1Var;
    }
}
