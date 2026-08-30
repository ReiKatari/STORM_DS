package x4;

import androidx.preference.Preference;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface c {
    default int G(long j2) {
        return Math.round(c0(j2));
    }

    default float I(long j2) {
        float c4;
        float j10;
        if (!p.a(o.b(j2), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        float[] fArr = y4.b.f14771a;
        if (j() >= 1.03f) {
            y4.a a10 = y4.b.a(j());
            c4 = o.c(j2);
            if (a10 == null) {
                j10 = j();
            } else {
                return a10.b(c4);
            }
        } else {
            c4 = o.c(j2);
            j10 = j();
        }
        return j10 * c4;
    }

    default int O(float f8) {
        float v10 = v(f8);
        if (Float.isInfinite(v10)) {
            return Preference.DEFAULT_ORDER;
        }
        return Math.round(v10);
    }

    default long W(long j2) {
        if (j2 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float v10 = v(h.b(j2));
        return (Float.floatToRawIntBits(v(h.a(j2))) & 4294967295L) | (Float.floatToRawIntBits(v10) << 32);
    }

    float b();

    default float c0(long j2) {
        if (!p.a(o.b(j2), 4294967296L)) {
            i.b("Only Sp can convert to Px");
        }
        return v(I(j2));
    }

    float j();

    default long m0(float f8) {
        return r(x0(f8));
    }

    default long r(float f8) {
        float j2;
        float[] fArr = y4.b.f14771a;
        if (j() >= 1.03f) {
            y4.a a10 = y4.b.a(j());
            if (a10 != null) {
                j2 = a10.a(f8);
            } else {
                j2 = f8 / j();
            }
            return t.C(4294967296L, j2);
        }
        return t.C(4294967296L, f8 / j());
    }

    default long t(long j2) {
        if (j2 == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return p7.m.a(x0(Float.intBitsToFloat((int) (j2 >> 32))), x0(Float.intBitsToFloat((int) (j2 & 4294967295L))));
    }

    default float t0(int i2) {
        return i2 / b();
    }

    default float v(float f8) {
        return b() * f8;
    }

    default float x0(float f8) {
        return f8 / b();
    }
}
