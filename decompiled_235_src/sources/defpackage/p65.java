package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p65  reason: default package */
/* loaded from: classes.dex */
public abstract class p65 {
    public static final da0 a;

    static {
        da0 da0Var = da0.R;
        a = xd5.o("xn--");
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
        u34.e(i, "unexpected digit: ");
        return 0;
    }
}
