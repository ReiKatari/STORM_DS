package yi;

import fj.h;
import na.f;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final h f14846a;

    static {
        h hVar = h.R;
        f14846a = f.h("xn--");
    }

    public static int a(int i2, boolean z10, int i10) {
        int i11;
        if (z10) {
            i11 = i2 / 700;
        } else {
            i11 = i2 / 2;
        }
        int i12 = (i11 / i10) + i11;
        int i13 = 0;
        while (i12 > 455) {
            i12 /= 35;
            i13 += 36;
        }
        return ((i12 * 36) / (i12 + 38)) + i13;
    }

    public static int b(int i2) {
        if (i2 < 26) {
            return i2 + 97;
        }
        if (i2 < 36) {
            return i2 + 22;
        }
        wa.b.c(i2, "unexpected digit: ");
        return 0;
    }
}
