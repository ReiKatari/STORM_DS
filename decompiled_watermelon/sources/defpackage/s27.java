package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s27  reason: default package */
/* loaded from: classes.dex */
public final class s27 {
    public static boolean a(Object obj, yp0 yp0Var) {
        int h = yp0Var.h();
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
                            ((r27) obj).c((i << 3) | 5, Integer.valueOf(yp0Var.q()));
                            return true;
                        }
                        throw i53.b();
                    }
                    r27 b = r27.b();
                    int i3 = i << 3;
                    int i4 = i3 | 4;
                    while (yp0Var.e() != Integer.MAX_VALUE && a(b, yp0Var)) {
                    }
                    if (i4 == yp0Var.h()) {
                        b.e = false;
                        ((r27) obj).c(i3 | 3, b);
                        return true;
                    }
                    throw new IOException("Protocol message end-group tag did not match expected tag.");
                }
                ((r27) obj).c((i << 3) | 2, yp0Var.k());
                return true;
            }
            ((r27) obj).c((i << 3) | 1, Long.valueOf(yp0Var.s()));
            return true;
        }
        ((r27) obj).c(i << 3, Long.valueOf(yp0Var.B()));
        return true;
    }
}
