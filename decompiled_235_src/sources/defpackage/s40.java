package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s40  reason: default package */
/* loaded from: classes.dex */
public final class s40 {
    public final b33 a;
    public final fo4 b;
    public final lb6 c;
    public final u72 d;

    public s40(b33 b33Var, fo4 fo4Var, lb6 lb6Var, u72 u72Var) {
        this.a = b33Var;
        this.b = fo4Var;
        this.c = lb6Var;
        this.d = u72Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (r8.a(r0) == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(s41 s41Var) {
        r40 r40Var;
        x61 x61Var;
        int i;
        lb6 lb6Var;
        Throwable th;
        lb6 lb6Var2;
        Object d0;
        try {
            if (s41Var instanceof r40) {
                r40Var = (r40) s41Var;
                int i2 = r40Var.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    r40Var.d0 = i2 - Integer.MIN_VALUE;
                    Object obj = r40Var.Y;
                    x61Var = x61.COROUTINE_SUSPENDED;
                    i = r40Var.d0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                lb6Var2 = (lb6) r40Var.R;
                                try {
                                    oi2.Y(obj);
                                    qc1 qc1Var = (qc1) obj;
                                    lb6Var2.c();
                                    return qc1Var;
                                } catch (Throwable th2) {
                                    th = th2;
                                    lb6Var2.c();
                                    throw th;
                                }
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        lb6 lb6Var3 = r40Var.X;
                        oi2.Y(obj);
                        lb6Var = lb6Var3;
                        this = (s40) r40Var.R;
                    } else {
                        oi2.Y(obj);
                        r40Var.R = this;
                        lb6Var = this.c;
                        r40Var.X = lb6Var;
                        r40Var.d0 = 1;
                    }
                    a5 a5Var = new a5(this, 8);
                    r40Var.R = lb6Var;
                    r40Var.X = null;
                    r40Var.d0 = 2;
                    d0 = hv.d0(vt1.A, new m5(a5Var, null, 17), r40Var);
                    if (d0 != x61Var) {
                        lb6 lb6Var4 = lb6Var;
                        obj = d0;
                        lb6Var2 = lb6Var4;
                        qc1 qc1Var2 = (qc1) obj;
                        lb6Var2.c();
                        return qc1Var2;
                    }
                    return x61Var;
                }
            }
            a5 a5Var2 = new a5(this, 8);
            r40Var.R = lb6Var;
            r40Var.X = null;
            r40Var.d0 = 2;
            d0 = hv.d0(vt1.A, new m5(a5Var2, null, 17), r40Var);
            if (d0 != x61Var) {
            }
            return x61Var;
        } catch (Throwable th3) {
            lb6 lb6Var5 = lb6Var;
            th = th3;
            lb6Var2 = lb6Var5;
            lb6Var2.c();
            throw th;
        }
        r40Var = new r40(this, s41Var);
        Object obj2 = r40Var.Y;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = r40Var.d0;
        if (i == 0) {
        }
    }
}
