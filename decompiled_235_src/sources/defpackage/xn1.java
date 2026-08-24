package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xn1  reason: default package */
/* loaded from: classes.dex */
public final class xn1 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 0;
    public dh5 Y;
    public dh5 Z;
    public int d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ yn1 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn1(dh5 dh5Var, yn1 yn1Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = dh5Var;
        this.f0 = yn1Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((xn1) q((r41) obj2, (qn2) obj)).s(jg7Var);
            default:
                return ((xn1) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        yn1 yn1Var = this.f0;
        switch (i) {
            case 0:
                xn1 xn1Var = new xn1(this.Z, yn1Var, r41Var);
                xn1Var.e0 = obj;
                return xn1Var;
            default:
                xn1 xn1Var2 = new xn1(yn1Var, r41Var);
                xn1Var2.e0 = obj;
                return xn1Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00af, code lost:
        if (r4.Y0(r9, r8) != r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
        if (defpackage.yn1.U0(r4, r8) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e7, code lost:
        if (defpackage.yn1.U0(r4, r8) != r0) goto L9;
     */
    /* JADX WARN: Path cross not found for [B:45:0x00ca, B:41:0x00b8], limit reached: 87 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v29, types: [dh5, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0089 -> B:20:0x005e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c5 -> B:20:0x005e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00cc -> B:20:0x005e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d9 -> B:20:0x005e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e7 -> B:12:0x002f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x0135 -> B:76:0x0136). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0139 -> B:78:0x013b). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        qn2 qn2Var;
        Object obj2;
        fn1 fn1Var;
        w61 w61Var;
        dh5 dh5Var;
        dh5 dh5Var2;
        w61 w61Var2;
        w61 w61Var3;
        in1 in1Var;
        dh5 dh5Var3;
        Object obj3;
        dh5 dh5Var4;
        int i = this.X;
        jg7 jg7Var = jg7.a;
        yn1 yn1Var = this.f0;
        switch (i) {
            case 0:
                dh5 dh5Var5 = this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.d0;
                if (i2 != 0) {
                    if (i2 == 1) {
                        dh5 dh5Var6 = this.Y;
                        qn2Var = (qn2) this.e0;
                        oi2.Y(obj);
                        in1 in1Var2 = (in1) obj;
                        dh5Var6.A = in1Var2;
                        obj2 = dh5Var5.A;
                        if ((obj2 instanceof hn1) && !(obj2 instanceof en1)) {
                            if (obj2 instanceof fn1) {
                                fn1Var = (fn1) obj2;
                            } else {
                                fn1Var = null;
                            }
                            if (fn1Var != null) {
                                qn2Var.g(fn1Var);
                            }
                            v80 v80Var = yn1Var.r0;
                            if (v80Var != null) {
                                this.e0 = qn2Var;
                                this.Y = dh5Var5;
                                this.d0 = 1;
                                obj = v80.L(v80Var, this);
                                if (obj == x61Var) {
                                    return x61Var;
                                }
                                dh5Var6 = dh5Var5;
                                in1 in1Var22 = (in1) obj;
                                dh5Var6.A = in1Var22;
                                obj2 = dh5Var5.A;
                                return obj2 instanceof hn1 ? jg7Var : jg7Var;
                            }
                            dh5Var6 = dh5Var5;
                            in1Var22 = null;
                            dh5Var6.A = in1Var22;
                            obj2 = dh5Var5.A;
                            if (obj2 instanceof hn1) {
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    qn2Var = (qn2) this.e0;
                    obj2 = dh5Var5.A;
                    if (obj2 instanceof hn1) {
                    }
                }
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                switch (this.d0) {
                    case 0:
                        oi2.Y(obj);
                        w61Var = (w61) this.e0;
                        break;
                    case 1:
                        dh5 dh5Var7 = this.Z;
                        dh5Var = this.Y;
                        w61Var = (w61) this.e0;
                        oi2.Y(obj);
                        dh5Var4 = dh5Var7;
                        in1Var = (in1) obj;
                        dh5Var3 = dh5Var4;
                        dh5Var3.A = in1Var;
                        obj3 = dh5Var.A;
                        if (obj3 instanceof gn1) {
                            this.e0 = w61Var;
                            this.Y = dh5Var;
                            this.Z = null;
                            this.d0 = 2;
                            if (yn1.V0(yn1Var, (gn1) obj3, this) != x61Var2) {
                                dh5Var2 = dh5Var;
                                w61Var2 = w61Var;
                                xn1 xn1Var = new xn1(dh5Var2, yn1Var, null);
                                this.e0 = w61Var2;
                                this.Y = dh5Var2;
                                this.d0 = 3;
                                break;
                            }
                            return x61Var2;
                        }
                        break;
                    case 2:
                        dh5Var2 = this.Y;
                        w61Var2 = (w61) this.e0;
                        oi2.Y(obj);
                        xn1 xn1Var2 = new xn1(dh5Var2, yn1Var, null);
                        this.e0 = w61Var2;
                        this.Y = dh5Var2;
                        this.d0 = 3;
                        break;
                    case 3:
                        dh5Var2 = this.Y;
                        w61Var2 = (w61) this.e0;
                        try {
                            oi2.Y(obj);
                        } catch (CancellationException unused) {
                            w61Var3 = w61Var2;
                            this.e0 = w61Var3;
                            this.Y = null;
                            this.d0 = 6;
                            break;
                        }
                        w61Var = w61Var2;
                        try {
                        } catch (CancellationException unused2) {
                            w61Var3 = w61Var;
                            this.e0 = w61Var3;
                            this.Y = null;
                            this.d0 = 6;
                        }
                        Object obj4 = dh5Var2.A;
                        if (obj4 instanceof hn1) {
                            this.e0 = w61Var;
                            this.Y = null;
                            this.d0 = 4;
                            if (yn1.W0(yn1Var, (hn1) obj4, this) == x61Var2) {
                                return x61Var2;
                            }
                        } else if (obj4 instanceof en1) {
                            this.e0 = w61Var;
                            this.Y = null;
                            this.d0 = 5;
                            break;
                        }
                        break;
                    case 4:
                        w61Var3 = (w61) this.e0;
                        try {
                            oi2.Y(obj);
                        } catch (CancellationException unused3) {
                            this.e0 = w61Var3;
                            this.Y = null;
                            this.d0 = 6;
                            break;
                        }
                        w61Var = w61Var3;
                        break;
                    case 5:
                        w61Var3 = (w61) this.e0;
                        oi2.Y(obj);
                        w61Var = w61Var3;
                        break;
                    case 6:
                        w61Var3 = (w61) this.e0;
                        oi2.Y(obj);
                        w61Var = w61Var3;
                        break;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
                if (g04.H(w61Var)) {
                    ?? obj5 = new Object();
                    v80 v80Var2 = yn1Var.r0;
                    if (v80Var2 != null) {
                        this.e0 = w61Var;
                        this.Y = obj5;
                        this.Z = obj5;
                        this.d0 = 1;
                        obj = v80.L(v80Var2, this);
                        if (obj != x61Var2) {
                            dh5Var = obj5;
                            dh5Var4 = obj5;
                            in1Var = (in1) obj;
                            dh5Var3 = dh5Var4;
                            dh5Var3.A = in1Var;
                            obj3 = dh5Var.A;
                            if (obj3 instanceof gn1) {
                            }
                            if (g04.H(w61Var)) {
                                return jg7Var;
                            }
                        }
                        return x61Var2;
                    }
                    dh5Var = obj5;
                    in1Var = null;
                    dh5Var3 = obj5;
                    dh5Var3.A = in1Var;
                    obj3 = dh5Var.A;
                    if (obj3 instanceof gn1) {
                    }
                    if (g04.H(w61Var)) {
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn1(yn1 yn1Var, r41 r41Var) {
        super(2, r41Var);
        this.f0 = yn1Var;
    }
}
