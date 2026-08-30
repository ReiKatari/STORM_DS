package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yt2  reason: default package */
/* loaded from: classes.dex */
public abstract class yt2 {
    static {
        w70 w70Var = w70.R;
        iq0.p("\"\\");
        iq0.p("\t ,=");
    }

    public static final boolean a(ec5 ec5Var) {
        if (!b53.x((String) ec5Var.A.L, "HEAD")) {
            int i = ec5Var.R;
            if (((i >= 100 && i < 200) || i == 204 || i == 304) && ik7.d(ec5Var) == -1) {
                String b = ec5Var.Y.b("Transfer-Encoding");
                if (b == null) {
                    b = null;
                }
                if (!"chunked".equalsIgnoreCase(b)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01cf, code lost:
        if (defpackage.ek7.a.d(r0) == false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.y60 r35, defpackage.hu2 r36, defpackage.xq2 r37) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt2.b(y60, hu2, xq2):void");
    }
}
