package i3;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends l0 {

    /* renamed from: c  reason: collision with root package name */
    public final List f6620c;

    /* renamed from: d  reason: collision with root package name */
    public final long f6621d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6622e;

    public d0(List list, long j2, long j10) {
        this.f6620c = list;
        this.f6621d = j2;
        this.f6622e = j10;
    }

    @Override // i3.l0
    public final Shader b(long j2) {
        int i2;
        int[] iArr;
        int i10;
        float[] fArr;
        long j10 = this.f6621d;
        char c4 = ' ';
        int i11 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i11) == Float.POSITIVE_INFINITY) {
            i11 = (int) (j2 >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i11);
        long j11 = 4294967295L;
        int i12 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i12) == Float.POSITIVE_INFINITY) {
            i12 = (int) (j2 & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i12);
        long j12 = this.f6622e;
        int i13 = (int) (j12 >> 32);
        if (Float.intBitsToFloat(i13) == Float.POSITIVE_INFINITY) {
            i13 = (int) (j2 >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i13);
        int i14 = (int) (j12 & 4294967295L);
        if (Float.intBitsToFloat(i14) == Float.POSITIVE_INFINITY) {
            i14 = (int) (j2 & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i14);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.f6620c;
        if (list.size() >= 2) {
            if (Build.VERSION.SDK_INT >= 26) {
                i2 = 0;
            } else {
                int size = list.size() - 1;
                int i15 = 1;
                i2 = 0;
                while (i15 < size) {
                    char c10 = c4;
                    long j13 = j11;
                    if (s.d(((s) list.get(i15)).f6689a) == 0.0f) {
                        i2++;
                    }
                    i15++;
                    c4 = c10;
                    j11 = j13;
                }
            }
            char c11 = c4;
            long j14 = j11;
            float intBitsToFloat5 = Float.intBitsToFloat((int) (floatToRawIntBits >> c11));
            float intBitsToFloat6 = Float.intBitsToFloat((int) (floatToRawIntBits & j14));
            float intBitsToFloat7 = Float.intBitsToFloat((int) (floatToRawIntBits2 >> c11));
            float intBitsToFloat8 = Float.intBitsToFloat((int) (floatToRawIntBits2 & j14));
            if (Build.VERSION.SDK_INT >= 26) {
                int size2 = list.size();
                iArr = new int[size2];
                for (int i16 = 0; i16 < size2; i16++) {
                    iArr[i16] = z.y(((s) list.get(i16)).f6689a);
                }
            } else {
                iArr = new int[list.size() + i2];
                int size3 = list.size() - 1;
                int size4 = list.size();
                int i17 = 0;
                for (int i18 = 0; i18 < size4; i18++) {
                    long j15 = ((s) list.get(i18)).f6689a;
                    if (s.d(j15) == 0.0f) {
                        if (i18 == 0) {
                            i10 = i17 + 1;
                            iArr[i17] = z.y(s.b(((s) list.get(1)).f6689a, 0.0f));
                        } else if (i18 == size3) {
                            i10 = i17 + 1;
                            iArr[i17] = z.y(s.b(((s) list.get(i18 - 1)).f6689a, 0.0f));
                        } else {
                            int i19 = i17 + 1;
                            iArr[i17] = z.y(s.b(((s) list.get(i18 - 1)).f6689a, 0.0f));
                            i17 += 2;
                            iArr[i19] = z.y(s.b(((s) list.get(i18 + 1)).f6689a, 0.0f));
                        }
                        i17 = i10;
                    } else {
                        iArr[i17] = z.y(j15);
                        i17++;
                    }
                }
            }
            int[] iArr2 = iArr;
            if (i2 == 0) {
                fArr = null;
            } else {
                fArr = new float[list.size() + i2];
                fArr[0] = 0.0f;
                int size5 = list.size() - 1;
                int i20 = 1;
                for (int i21 = 1; i21 < size5; i21++) {
                    long j16 = ((s) list.get(i21)).f6689a;
                    float size6 = i21 / (list.size() - 1);
                    int i22 = i20 + 1;
                    fArr[i20] = size6;
                    if (s.d(j16) == 0.0f) {
                        i20 += 2;
                        fArr[i22] = size6;
                    } else {
                        i20 = i22;
                    }
                }
                fArr[i20] = 1.0f;
            }
            return new LinearGradient(intBitsToFloat5, intBitsToFloat6, intBitsToFloat7, intBitsToFloat8, iArr2, fArr, Shader.TileMode.CLAMP);
        }
        a0.j.h("colors must have length of at least 2 if colorStops is omitted.");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (this.f6620c.equals(d0Var.f6620c) && h3.b.b(this.f6621d, d0Var.f6621d) && h3.b.b(this.f6622e, d0Var.f6622e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + w.d.f(this.f6622e, w.d.f(this.f6621d, this.f6620c.hashCode() * 961, 31), 31);
    }

    public final String toString() {
        long j2;
        String str;
        long j10;
        String str2 = "";
        if (((((this.f6621d & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0) {
            str = "";
        } else {
            str = "start=" + ((Object) h3.b.g(j2)) + ", ";
        }
        if (((((this.f6622e & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) h3.b.g(j10)) + ", ";
        }
        return "LinearGradient(colors=" + this.f6620c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
