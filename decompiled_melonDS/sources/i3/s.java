package i3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: b  reason: collision with root package name */
    public static final long f6681b = z.d(4278190080L);

    /* renamed from: c  reason: collision with root package name */
    public static final long f6682c;

    /* renamed from: d  reason: collision with root package name */
    public static final long f6683d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f6684e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f6685f;

    /* renamed from: g  reason: collision with root package name */
    public static final long f6686g;

    /* renamed from: h  reason: collision with root package name */
    public static final long f6687h;

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f6688i = 0;

    /* renamed from: a  reason: collision with root package name */
    public final long f6689a;

    static {
        z.d(4282664004L);
        f6682c = z.d(4287137928L);
        z.d(4291611852L);
        f6683d = z.d(4294967295L);
        f6684e = z.d(4294901760L);
        z.d(4278255360L);
        f6685f = z.d(4278190335L);
        z.d(4294967040L);
        z.d(4278255615L);
        z.d(4294902015L);
        f6686g = z.c(0);
        f6687h = z.b(0.0f, 0.0f, 0.0f, 0.0f, j3.d.f7368u);
    }

    public /* synthetic */ s(long j2) {
        this.f6689a = j2;
    }

    public static final long a(long j2, j3.c cVar) {
        j3.g gVar;
        j3.c f8 = f(j2);
        int i2 = f8.f7348c;
        int i10 = cVar.f7348c;
        if ((i2 | i10) < 0) {
            gVar = j3.j.e(f8, cVar);
        } else {
            a1.x xVar = j3.h.f7380a;
            int i11 = i2 | (i10 << 6);
            Object b10 = xVar.b(i11);
            if (b10 == null) {
                b10 = j3.j.e(f8, cVar);
                xVar.i(i11, b10);
            }
            gVar = (j3.g) b10;
        }
        return gVar.a(j2);
    }

    public static long b(long j2, float f8) {
        return z.b(h(j2), g(j2), e(j2), f8, f(j2));
    }

    public static final boolean c(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static final float d(long j2) {
        float z10;
        float f8;
        if ((63 & j2) == 0) {
            z10 = (float) p7.k.z((j2 >>> 56) & 255);
            f8 = 255.0f;
        } else {
            z10 = (float) p7.k.z((j2 >>> 6) & 1023);
            f8 = 1023.0f;
        }
        return z10 / f8;
    }

    public static final float e(long j2) {
        int i2;
        int i10;
        int i11;
        if ((63 & j2) == 0) {
            return ((float) p7.k.z((j2 >>> 32) & 255)) / 255.0f;
        }
        short s10 = (short) ((j2 >>> 16) & 65535);
        int i12 = 32768 & s10;
        int i13 = ((65535 & s10) >>> 10) & 31;
        int i14 = s10 & 1023;
        if (i13 == 0) {
            if (i14 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - w.f6692a;
                if (i12 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        } else {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i2 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i2 = i13 + 112;
            }
            int i16 = i2;
            i10 = i15;
            i11 = i16;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static final j3.c f(long j2) {
        float[] fArr = j3.d.f7349a;
        return j3.d.f7372y[(int) (j2 & 63)];
    }

    public static final float g(long j2) {
        int i2;
        int i10;
        int i11;
        if ((63 & j2) == 0) {
            return ((float) p7.k.z((j2 >>> 40) & 255)) / 255.0f;
        }
        short s10 = (short) ((j2 >>> 32) & 65535);
        int i12 = 32768 & s10;
        int i13 = ((65535 & s10) >>> 10) & 31;
        int i14 = s10 & 1023;
        if (i13 == 0) {
            if (i14 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - w.f6692a;
                if (i12 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        } else {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i2 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i2 = i13 + 112;
            }
            int i16 = i2;
            i10 = i15;
            i11 = i16;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static final float h(long j2) {
        int i2;
        int i10;
        int i11;
        if ((63 & j2) == 0) {
            return ((float) p7.k.z((j2 >>> 48) & 255)) / 255.0f;
        }
        short s10 = (short) ((j2 >>> 48) & 65535);
        int i12 = 32768 & s10;
        int i13 = ((65535 & s10) >>> 10) & 31;
        int i14 = s10 & 1023;
        if (i13 == 0) {
            if (i14 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i14 + 1056964608) - w.f6692a;
                if (i12 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i11 = 0;
            i10 = 0;
        } else {
            int i15 = i14 << 13;
            if (i13 == 31) {
                i2 = 255;
                if (i15 != 0) {
                    i15 |= 4194304;
                }
            } else {
                i2 = i13 + 112;
            }
            int i16 = i2;
            i10 = i15;
            i11 = i16;
        }
        return Float.intBitsToFloat((i11 << 23) | (i12 << 16) | i10);
    }

    public static String i(long j2) {
        StringBuilder sb2 = new StringBuilder("Color(");
        sb2.append(h(j2));
        sb2.append(", ");
        sb2.append(g(j2));
        sb2.append(", ");
        sb2.append(e(j2));
        sb2.append(", ");
        sb2.append(d(j2));
        sb2.append(", ");
        return w.d.r(sb2, f(j2).f7346a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            if (this.f6689a != ((s) obj).f6689a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6689a);
    }

    public final String toString() {
        return i(this.f6689a);
    }
}
