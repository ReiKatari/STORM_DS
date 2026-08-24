package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n97  reason: default package */
/* loaded from: classes.dex */
public final class n97 extends hw6 implements eo2 {
    public final /* synthetic */ int X = 0;
    public dh5 Y;
    public dh5 Z;
    public int d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ o97 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n97(dh5 dh5Var, o97 o97Var, r41 r41Var) {
        super(2, r41Var);
        this.Z = dh5Var;
        this.f0 = o97Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((n97) q((r41) obj2, (zf1) obj)).s(jg7Var);
            default:
                return ((n97) q((r41) obj2, (w61) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        o97 o97Var = this.f0;
        switch (i) {
            case 0:
                n97 n97Var = new n97(this.Z, o97Var, r41Var);
                n97Var.e0 = obj;
                return n97Var;
            default:
                n97 n97Var2 = new n97(o97Var, r41Var);
                n97Var2.e0 = obj;
                return n97Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r15 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v11, types: [dh5, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x008e -> B:14:0x003a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00f6 -> B:48:0x00f7). Please submit an issue!!! */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        zf1 zf1Var;
        Object obj2;
        f97 f97Var;
        w61 w61Var;
        w61 w61Var2;
        dh5 dh5Var;
        dh5 dh5Var2;
        int i = this.X;
        o97 o97Var = this.f0;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                dh5 dh5Var3 = this.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.d0;
                if (i2 != 0) {
                    if (i2 == 1) {
                        dh5 dh5Var4 = this.Y;
                        zf1Var = (zf1) this.e0;
                        oi2.Y(obj);
                        dh5Var4.A = obj;
                        obj2 = dh5Var3.A;
                        if (!(obj2 instanceof h97)) {
                            if (obj2 instanceof f97) {
                                f97Var = (f97) obj2;
                            } else {
                                f97Var = null;
                            }
                            if (f97Var != null) {
                                zf1Var.a.a.l(new jk4(f97Var.f), Float.valueOf(f97Var.g), new jk4(f97Var.h), Float.valueOf(f97Var.i));
                            }
                            v80 v80Var = o97Var.q0;
                            this.e0 = zf1Var;
                            this.Y = dh5Var3;
                            this.d0 = 1;
                            v80Var.getClass();
                            obj = v80.L(v80Var, this);
                            if (obj == x61Var) {
                                return x61Var;
                            }
                            dh5Var4 = dh5Var3;
                            dh5Var4.A = obj;
                            obj2 = dh5Var3.A;
                            if (!(obj2 instanceof h97)) {
                            }
                        } else {
                            return jg7Var;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    zf1Var = (zf1) this.e0;
                    obj2 = dh5Var3.A;
                    if (!(obj2 instanceof h97)) {
                    }
                }
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.d0;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            w61 w61Var3 = (w61) this.e0;
                            try {
                                oi2.Y(obj);
                            } catch (CancellationException unused) {
                            }
                            w61Var = w61Var3;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        dh5 dh5Var5 = this.Z;
                        dh5Var = this.Y;
                        w61Var2 = (w61) this.e0;
                        oi2.Y(obj);
                        dh5Var2 = dh5Var5;
                        dh5Var2.A = obj;
                        if (dh5Var.A instanceof g97) {
                            ag1 ag1Var = o97Var.m0;
                            xa4 xa4Var = xa4.UserInput;
                            n97 n97Var = new n97(dh5Var, o97Var, null);
                            this.e0 = w61Var2;
                            this.Y = null;
                            this.Z = null;
                            this.d0 = 2;
                            ag1Var.getClass();
                            Object C = g04.C(new b0(ag1Var, xa4Var, n97Var, (r41) null, 21), this);
                            if (C != x61.COROUTINE_SUSPENDED) {
                                C = jg7Var;
                                break;
                            }
                        }
                        w61Var = w61Var2;
                    }
                } else {
                    oi2.Y(obj);
                    w61Var = (w61) this.e0;
                }
                if (!g04.H(w61Var)) {
                    ?? obj3 = new Object();
                    v80 v80Var2 = o97Var.q0;
                    this.e0 = w61Var;
                    this.Y = obj3;
                    this.Z = obj3;
                    this.d0 = 1;
                    v80Var2.getClass();
                    Object L = v80.L(v80Var2, this);
                    if (L != x61Var2) {
                        w61Var2 = w61Var;
                        obj = L;
                        dh5Var = obj3;
                        dh5Var2 = obj3;
                        dh5Var2.A = obj;
                        if (dh5Var.A instanceof g97) {
                        }
                        w61Var = w61Var2;
                        if (!g04.H(w61Var)) {
                            return jg7Var;
                        }
                    }
                    return x61Var2;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n97(o97 o97Var, r41 r41Var) {
        super(2, r41Var);
        this.f0 = o97Var;
    }
}
