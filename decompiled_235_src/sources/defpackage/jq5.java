package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jq5  reason: default package */
/* loaded from: classes.dex */
public abstract class jq5 {
    public static final py0 a = new py0(new pi3(29));
    public static final kq5 b;
    public static final kq5 c;
    public static final eq5 d;
    public static final eq5 e;
    public static final eq5 f;

    static {
        long j = kt0.h;
        b = new kq5(Float.NaN, j, true);
        c = new kq5(Float.NaN, j, false);
        d = new eq5(0.16f, 0.24f, 0.08f, 0.24f);
        e = new eq5(0.08f, 0.12f, 0.04f, 0.12f);
        f = new eq5(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static kq5 a(int i, long j, boolean z) {
        float f2;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        } else {
            f2 = 24.0f;
        }
        if ((i & 4) != 0) {
            j = kt0.h;
        }
        if (om1.b(f2, Float.NaN) && kt0.d(j, kt0.h)) {
            if (z) {
                return b;
            }
            return c;
        }
        return new kq5(f2, j, z);
    }
}
