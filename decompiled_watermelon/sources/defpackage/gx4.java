package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gx4  reason: default package */
/* loaded from: classes.dex */
public abstract class gx4 {
    public static final w70 a;

    static {
        w70 w70Var = w70.R;
        a = iq0.p("xn--");
    }

    public static int a(int i, boolean z, int i2) {
        int i3;
        if (z) {
            i3 = i / 700;
        } else {
            i3 = i / 2;
        }
        int i4 = (i3 / i2) + i3;
        int i5 = 0;
        while (i4 > 455) {
            i4 /= 35;
            i5 += 36;
        }
        return ((i4 * 36) / (i4 + 38)) + i5;
    }

    public static int b(int i) {
        if (i < 26) {
            return i + 97;
        }
        if (i < 36) {
            return i + 22;
        }
        c44.d(i, "unexpected digit: ");
        return 0;
    }
}
