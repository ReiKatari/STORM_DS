package ui;

import nc.k;
import pi.d0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f {
    static {
        fj.h hVar = fj.h.R;
        na.f.h("\"\\");
        na.f.h("\t ,=");
    }

    public static final boolean a(d0 d0Var) {
        if (!k.a((String) d0Var.A.f14090c, "HEAD")) {
            int i2 = d0Var.R;
            if (((i2 >= 100 && i2 < 200) || i2 == 204 || i2 == 304) && qi.g.d(d0Var) == -1) {
                String a10 = d0Var.Y.a("Transfer-Encoding");
                if (a10 == null) {
                    a10 = null;
                }
                if (!"chunked".equalsIgnoreCase(a10)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d0, code lost:
        if (qi.d.f12547a.c(r0) == false) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(pi.b r35, pi.r r36, pi.q r37) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ui.f.b(pi.b, pi.r, pi.q):void");
    }
}
