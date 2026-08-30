package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ni4  reason: default package */
/* loaded from: classes.dex */
public abstract class ni4 {
    public static final mi4 a;
    public static final zh4 b;

    static {
        mi4 mi4Var = new mi4(0);
        a = mi4Var;
        b = new zh4(0, 0, 0, jf4.Horizontal, 0, 0, 0, sn1.s0, new li3(2), iq2.c(mp1.A), mi4Var, nz0.b(0, 0, 0, 0, 15));
    }

    public static final long a(zh4 zh4Var, int i) {
        long g;
        int i2 = zh4Var.c;
        long j = (((i * (zh4Var.b + i2)) + (-zh4Var.f)) + zh4Var.d) - i2;
        if (zh4Var.e == jf4.Horizontal) {
            g = zh4Var.g() >> 32;
        } else {
            g = zh4Var.g() & 4294967295L;
        }
        int i3 = (int) g;
        zh4Var.n.getClass();
        long m = j - (i3 - io2.m(0, 0, i3));
        if (m < 0) {
            return 0L;
        }
        return m;
    }
}
