package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jv7  reason: default package */
/* loaded from: classes.dex */
public abstract class jv7 {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if (r4 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final aj a(le2 le2Var, int i) {
        ul0.h.getClass();
        int i2 = tl0.b;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = i2 - i;
        if (le2Var instanceof wl0) {
            wl0 wl0Var = (wl0) le2Var;
            m80 m80Var = wl0Var.L;
            le2 g = wl0Var.g();
            if (g != null) {
                int i4 = wl0Var.B;
                if (i4 != -3 && i4 != -2 && i4 != 0) {
                    i3 = i4;
                } else if (m80Var != m80.SUSPEND) {
                    if (i == 0) {
                        i3 = 1;
                    }
                    i3 = 0;
                }
                return new aj(i3, m80Var, wl0Var.A, g);
            }
        }
        return new aj(i3, m80.SUSPEND, vt1.A, le2Var);
    }

    public static final p83 b(e83 e83Var) {
        return new p83(e83Var.a, e83Var.b, e83Var.c, e83Var.d);
    }
}
