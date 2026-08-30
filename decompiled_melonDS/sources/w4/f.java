package w4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final float f14132b;

    /* renamed from: c  reason: collision with root package name */
    public static final float f14133c;

    /* renamed from: d  reason: collision with root package name */
    public static final float f14134d;

    /* renamed from: a  reason: collision with root package name */
    public final float f14135a;

    static {
        a(0.0f);
        a(0.5f);
        f14132b = 0.5f;
        a(-1.0f);
        f14133c = -1.0f;
        a(1.0f);
        f14134d = 1.0f;
    }

    public static void a(float f8) {
        if ((0.0f <= f8 && f8 <= 1.0f) || f8 == -1.0f) {
            return;
        }
        r4.a.c("topRatio should be in [0..1] range or -1");
    }

    public static String b(float f8) {
        if (f8 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f8 == f14132b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f8 == f14133c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f8 == f14134d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f8 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (Float.compare(this.f14135a, ((f) obj).f14135a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f14135a);
    }

    public final String toString() {
        return b(this.f14135a);
    }
}
