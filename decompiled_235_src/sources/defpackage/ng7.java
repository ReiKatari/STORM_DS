package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ng7  reason: default package */
/* loaded from: classes.dex */
public final class ng7 {
    public static boolean a(Object obj, ls0 ls0Var) {
        int h = ls0Var.h();
        int i = h >>> 3;
        int i2 = h & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return false;
                        }
                        if (i2 == 5) {
                            ((mg7) obj).c((i << 3) | 5, Integer.valueOf(ls0Var.q()));
                            return true;
                        }
                        throw ub3.b();
                    }
                    mg7 b = mg7.b();
                    int i3 = i << 3;
                    int i4 = i3 | 4;
                    while (ls0Var.e() != Integer.MAX_VALUE && a(b, ls0Var)) {
                    }
                    if (i4 == ls0Var.h()) {
                        b.e = false;
                        ((mg7) obj).c(i3 | 3, b);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((mg7) obj).c((i << 3) | 2, ls0Var.k());
                return true;
            }
            ((mg7) obj).c((i << 3) | 1, Long.valueOf(ls0Var.s()));
            return true;
        }
        ((mg7) obj).c(i << 3, Long.valueOf(ls0Var.B()));
        return true;
    }
}
