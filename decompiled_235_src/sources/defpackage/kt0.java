package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt0  reason: default package */
/* loaded from: classes.dex */
public final class kt0 {
    public static final long b = hv.c(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final /* synthetic */ int i = 0;
    public final long a;

    static {
        hv.c(4282664004L);
        c = hv.c(4287137928L);
        hv.c(4291611852L);
        d = hv.c(4294967295L);
        e = hv.c(4294901760L);
        hv.c(4278255360L);
        f = hv.c(4278190335L);
        hv.c(4294967040L);
        hv.c(4278255615L);
        hv.c(4294902015L);
        g = hv.b(0);
        float[] fArr = qt0.a;
        h = hv.a(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, qt0.u);
    }

    public /* synthetic */ kt0(long j) {
        this.a = j;
    }

    public static final /* synthetic */ kt0 a(long j) {
        return new kt0(j);
    }

    public static final long b(long j, nt0 nt0Var) {
        e01 e01Var;
        nt0 g2 = g(j);
        int i2 = g2.c;
        int i3 = nt0Var.c;
        if ((i2 | i3) < 0) {
            e01Var = nc1.K(g2, nt0Var);
        } else {
            p94 p94Var = f01.a;
            int i4 = i2 | (i3 << 6);
            Object b2 = p94Var.b(i4);
            if (b2 == null) {
                b2 = nc1.K(g2, nt0Var);
                p94Var.i(i4, b2);
            }
            e01Var = (e01) b2;
        }
        return e01Var.a(j);
    }

    public static long c(float f2, long j) {
        return hv.a(i(j), h(j), f(j), f2, g(j));
    }

    public static final boolean d(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static final float e(long j) {
        float Q;
        float f2;
        if ((63 & j) == 0) {
            Q = (float) jx2.Q((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            Q = (float) jx2.Q((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return Q / f2;
    }

    public static final float f(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) jx2.Q((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - wd2.a;
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
                    i8 |= Compress.MAXWINSIZE;
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

    public static final nt0 g(long j) {
        float[] fArr = qt0.a;
        return qt0.y[(int) (j & 63)];
    }

    public static final float h(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) jx2.Q((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - wd2.a;
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
                    i8 |= Compress.MAXWINSIZE;
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

    public static final float i(long j) {
        int i2;
        int i3;
        int i4;
        if ((63 & j) == 0) {
            return ((float) jx2.Q((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i5 = 32768 & s;
        int i6 = ((65535 & s) >>> 10) & 31;
        int i7 = s & 1023;
        if (i6 == 0) {
            if (i7 != 0) {
                float intBitsToFloat = Float.intBitsToFloat(i7 + 1056964608) - wd2.a;
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
                    i8 |= Compress.MAXWINSIZE;
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

    public static String j(long j) {
        StringBuilder sb = new StringBuilder("Color(");
        sb.append(i(j));
        sb.append(", ");
        sb.append(h(j));
        sb.append(", ");
        sb.append(f(j));
        sb.append(", ");
        sb.append(e(j));
        sb.append(", ");
        return lb1.q(sb, g(j).a, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kt0) {
            if (this.a != ((kt0) obj).a) {
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
        return j(this.a);
    }
}
