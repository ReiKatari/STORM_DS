package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: od1  reason: default package */
/* loaded from: classes.dex */
public interface od1 {
    default float A0(int i) {
        return i / b();
    }

    default long B(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return dk7.c(D0(Float.intBitsToFloat((int) (j >> 32))), D0(Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    default float C(float f) {
        return b() * f;
    }

    default float D0(float f) {
        return f / b();
    }

    default float P(long j) {
        if (!js6.a(is6.b(j), 4294967296L)) {
            oz2.b("Only Sp can convert to Px");
        }
        float[] fArr = ie2.a;
        if (o() >= 1.03f) {
            he2 a = ie2.a(o());
            if (a == null) {
                return o() * is6.c(j);
            }
            return a.b(is6.c(j));
        }
        return o() * is6.c(j);
    }

    default int Y(float f) {
        float C = C(f);
        if (Float.isInfinite(C)) {
            return Preference.DEFAULT_ORDER;
        }
        return Math.round(C);
    }

    float b();

    default long i0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return (Float.floatToRawIntBits(C(ni1.b(j))) << 32) | (Float.floatToRawIntBits(C(ni1.a(j))) & 4294967295L);
    }

    default float n0(long j) {
        if (!js6.a(is6.b(j), 4294967296L)) {
            oz2.b("Only Sp can convert to Px");
        }
        return C(P(j));
    }

    float o();

    default long v0(float f) {
        return z(D0(f));
    }

    default long z(float f) {
        float o;
        float[] fArr = ie2.a;
        if (o() >= 1.03f) {
            he2 a = ie2.a(o());
            if (a != null) {
                o = a.a(f);
            } else {
                o = f / o();
            }
            return hi2.L(o, 4294967296L);
        }
        return hi2.L(f / o(), 4294967296L);
    }
}
