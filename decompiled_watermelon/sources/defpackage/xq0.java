package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xq0  reason: default package */
/* loaded from: classes.dex */
public final class xq0 {
    public static final long b = mh7.d(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final /* synthetic */ int i = 0;
    public final long a;

    static {
        mh7.d(4282664004L);
        c = mh7.d(4287137928L);
        mh7.d(4291611852L);
        d = mh7.d(4294967295L);
        e = mh7.d(4294901760L);
        mh7.d(4278255360L);
        f = mh7.d(4278190335L);
        mh7.d(4294967040L);
        mh7.d(4278255615L);
        mh7.d(4294902015L);
        g = mh7.c(0);
        float[] fArr = dr0.a;
        h = mh7.b(RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, dr0.u);
    }

    public /* synthetic */ xq0(long j) {
        this.a = j;
    }

    public static final long a(long j, ar0 ar0Var) {
        gx0 gx0Var;
        ar0 f2 = f(j);
        int i2 = f2.c;
        int i3 = ar0Var.c;
        if ((i2 | i3) < 0) {
            gx0Var = l.B(f2, ar0Var);
        } else {
            j14 j14Var = hx0.a;
            int i4 = i2 | (i3 << 6);
            Object b2 = j14Var.b(i4);
            if (b2 == null) {
                b2 = l.B(f2, ar0Var);
                j14Var.i(i4, b2);
            }
            gx0Var = (gx0) b2;
        }
        return gx0Var.a(j);
    }

    public static long b(float f2, long j) {
        return mh7.b(h(j), g(j), e(j), f2, f(j));
    }

    public static final boolean c(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float d(long j) {
        float q0;
        float f2;
        if ((63 & j) == 0) {
            q0 = (float) io2.q0((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            q0 = (float) io2.q0((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return q0 / f2;
    }

    public static final float e(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) io2.q0((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - e92.a;
                if (i5 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        } else {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final ar0 f(long j) {
        float[] fArr = dr0.a;
        return dr0.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) io2.q0((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - e92.a;
                if (i5 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        } else {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static final float h(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) io2.q0((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - e92.a;
                if (i5 == 0) {
                    return intBitsToFloat;
                }
                return -intBitsToFloat;
            }
            i4 = 0;
            i3 = 0;
        } else {
            int i8 = i7 << 13;
            if (i6 == 31) {
                i2 = 255;
                if (i8 != 0) {
                    i8 |= 4194304;
                }
            } else {
                i2 = i6 + 112;
            }
            int i9 = i2;
            i3 = i8;
            i4 = i9;
        }
        return Float.intBitsToFloat((i4 << 23) | (i5 << 16) | i3);
    }

    public static String i(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(h(j));
        sb.append(", ");
        sb.append(g(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        sb.append(d(j));
        sb.append(", ");
        return wh1.o(sb, f(j).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xq0) {
            if (this.a != ((xq0) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return i(this.a);
    }
}
