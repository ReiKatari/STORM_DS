package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f  reason: default package */
/* loaded from: classes.dex */
public abstract class f {
    public static final w70 a;
    public static final w70 b;
    public static final w70 c;
    public static final w70 d;
    public static final w70 e;

    static {
        w70 w70Var = w70.R;
        a = iq0.p("/");
        b = iq0.p("\\");
        c = iq0.p("/\\");
        d = iq0.p(".");
        e = iq0.p("..");
    }

    public static final int a(jk4 jk4Var) {
        w70 w70Var = jk4Var.A;
        if (w70Var.d() != 0) {
            if (w70Var.i(0) != 47) {
                if (w70Var.i(0) == 92) {
                    if (w70Var.d() > 2 && w70Var.i(1) == 92) {
                        w70 w70Var2 = b;
                        w70Var2.getClass();
                        int f = w70Var.f(2, w70Var2.h());
                        if (f == -1) {
                            return w70Var.d();
                        }
                        return f;
                    }
                } else if (w70Var.d() > 2 && w70Var.i(1) == 58 && w70Var.i(2) == 92) {
                    char i = (char) w70Var.i(0);
                    if ('a' > i || i >= '{') {
                        if ('A' <= i && i < '[') {
                            return 3;
                        }
                    } else {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [f60, java.lang.Object] */
    public static final jk4 b(jk4 jk4Var, jk4 jk4Var2, boolean z) {
        jk4Var2.getClass();
        if (a(jk4Var2) != -1 || jk4Var2.e() != null) {
            return jk4Var2;
        }
        w70 c2 = c(jk4Var);
        if (c2 == null && (c2 = c(jk4Var2)) == null) {
            c2 = f(jk4.B);
        }
        ?? obj = new Object();
        obj.k0(jk4Var.A);
        if (obj.B > 0) {
            obj.k0(c2);
        }
        obj.k0(jk4Var2.A);
        return d(obj, z);
    }

    public static final w70 c(jk4 jk4Var) {
        w70 w70Var = jk4Var.A;
        w70 w70Var2 = a;
        if (w70.g(w70Var, w70Var2) != -1) {
            return w70Var2;
        }
        w70 w70Var3 = jk4Var.A;
        w70 w70Var4 = b;
        if (w70.g(w70Var3, w70Var4) != -1) {
            return w70Var4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e A[EDGE_INSN: B:101:0x011e->B:81:0x011e ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013c  */
    /* JADX WARN: Type inference failed for: r1v0, types: [f60, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.jk4 d(defpackage.f60 r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f.d(f60, boolean):jk4");
    }

    public static final w70 e(byte b2) {
        if (b2 != 47) {
            if (b2 == 92) {
                return b;
            }
            i.i(wh1.g(b2, "not a directory separator: "));
            return null;
        }
        return a;
    }

    public static final w70 f(String str) {
        if (b53.x(str, "/")) {
            return a;
        }
        if (b53.x(str, "\\")) {
            return b;
        }
        i.i(b31.p("not a directory separator: ", str));
        return null;
    }
}
