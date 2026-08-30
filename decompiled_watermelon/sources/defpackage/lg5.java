package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lg5  reason: default package */
/* loaded from: classes.dex */
public abstract class lg5 {
    public static final tv0 a = new tv0(new vq3(23));
    public static final mg5 b;
    public static final mg5 c;
    public static final gg5 d;
    public static final gg5 e;
    public static final gg5 f;

    static {
        long j = xq0.h;
        b = new mg5(Float.NaN, j, true);
        c = new mg5(Float.NaN, j, false);
        d = new gg5(0.16f, 0.24f, 0.08f, 0.24f);
        e = new gg5(0.08f, 0.12f, 0.04f, 0.12f);
        f = new gg5(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static mg5 a(int i, boolean z) {
        float f2;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = 24.0f;
        }
        long j = xq0.h;
        if (ji1.b(f2, Float.NaN) && xq0.c(j, j)) {
            if (z) {
                return b;
            }
            return c;
        }
        return new mg5(f2, j, z);
    }
}
