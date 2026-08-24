package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qh1  reason: default package */
/* loaded from: classes.dex */
public interface qh1 {
    default long M(float f) {
        return p(T(f));
    }

    default float Q(int i) {
        return i / a();
    }

    default float T(float f) {
        return f / a();
    }

    float Y();

    float a();

    default float e0(float f) {
        return a() * f;
    }

    default int k0(long j) {
        return Math.round(y0(j));
    }

    default long p(float f) {
        float Y;
        float[] fArr = gj2.a;
        if (Y() >= 1.03f) {
            fj2 a = gj2.a(Y());
            if (a != null) {
                Y = a.a(f);
            } else {
                Y = f / Y();
            }
            return hi2.J(Y, 4294967296L);
        }
        return hi2.J(f / Y(), 4294967296L);
    }

    default long q(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return nc1.f(T(Float.intBitsToFloat((int) (j >> 32))), T(Float.intBitsToFloat((int) (j & 4294967295L))));
    }

    default int r0(float f) {
        float e0 = e0(f);
        if (Float.isInfinite(e0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(e0);
    }

    default long v0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        return (Float.floatToRawIntBits(e0(sm1.b(j))) << 32) | (Float.floatToRawIntBits(e0(sm1.a(j))) & 4294967295L);
    }

    default float x(long j) {
        if (!y47.a(x47.b(j), 4294967296L)) {
            r53.b("Only Sp can convert to Px");
        }
        float[] fArr = gj2.a;
        if (Y() >= 1.03f) {
            fj2 a = gj2.a(Y());
            if (a == null) {
                return Y() * x47.c(j);
            }
            return a.b(x47.c(j));
        }
        return Y() * x47.c(j);
    }

    default float y0(long j) {
        if (!y47.a(x47.b(j), 4294967296L)) {
            r53.b("Only Sp can convert to Px");
        }
        return e0(x(j));
    }
}
