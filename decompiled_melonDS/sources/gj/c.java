package gj;

import fj.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final fj.h f5684a;

    /* renamed from: b  reason: collision with root package name */
    public static final fj.h f5685b;

    /* renamed from: c  reason: collision with root package name */
    public static final fj.h f5686c;

    /* renamed from: d  reason: collision with root package name */
    public static final fj.h f5687d;

    /* renamed from: e  reason: collision with root package name */
    public static final fj.h f5688e;

    static {
        fj.h hVar = fj.h.R;
        f5684a = na.f.h("/");
        f5685b = na.f.h("\\");
        f5686c = na.f.h("/\\");
        f5687d = na.f.h(".");
        f5688e = na.f.h("..");
    }

    public static final int a(x xVar) {
        fj.h hVar = xVar.A;
        if (hVar.d() != 0) {
            if (hVar.i(0) != 47) {
                if (hVar.i(0) == 92) {
                    if (hVar.d() > 2 && hVar.i(1) == 92) {
                        fj.h hVar2 = f5685b;
                        hVar2.getClass();
                        int f8 = hVar.f(2, hVar2.h());
                        if (f8 == -1) {
                            return hVar.d();
                        }
                        return f8;
                    }
                } else if (hVar.d() > 2 && hVar.i(1) == 58 && hVar.i(2) == 92) {
                    char i2 = (char) hVar.i(0);
                    if ('a' > i2 || i2 >= '{') {
                        if ('A' <= i2 && i2 < '[') {
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

    /* JADX WARN: Type inference failed for: r1v1, types: [fj.e, java.lang.Object] */
    public static final x b(x xVar, x xVar2, boolean z10) {
        xVar2.getClass();
        if (a(xVar2) != -1 || xVar2.e() != null) {
            return xVar2;
        }
        fj.h c4 = c(xVar);
        if (c4 == null && (c4 = c(xVar2)) == null) {
            c4 = f(x.B);
        }
        ?? obj = new Object();
        obj.c0(xVar.A);
        if (obj.B > 0) {
            obj.c0(c4);
        }
        obj.c0(xVar2.A);
        return d(obj, z10);
    }

    public static final fj.h c(x xVar) {
        fj.h hVar = xVar.A;
        fj.h hVar2 = f5684a;
        if (fj.h.g(hVar, hVar2) != -1) {
            return hVar2;
        }
        fj.h hVar3 = xVar.A;
        fj.h hVar4 = f5685b;
        if (fj.h.g(hVar3, hVar4) != -1) {
            return hVar4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e A[EDGE_INSN: B:101:0x011e->B:81:0x011e ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013c  */
    /* JADX WARN: Type inference failed for: r1v0, types: [fj.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final fj.x d(fj.e r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.c.d(fj.e, boolean):fj.x");
    }

    public static final fj.h e(byte b10) {
        if (b10 != 47) {
            if (b10 == 92) {
                return f5685b;
            }
            a0.j.h(w.d.l(b10, "not a directory separator: "));
            return null;
        }
        return f5684a;
    }

    public static final fj.h f(String str) {
        if (nc.k.a(str, "/")) {
            return f5684a;
        }
        if (nc.k.a(str, "\\")) {
            return f5685b;
        }
        fj.j.r(str, "not a directory separator: ");
        return null;
    }
}
