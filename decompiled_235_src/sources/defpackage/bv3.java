package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv3  reason: default package */
/* loaded from: classes.dex */
public final class bv3 extends xd6 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;
    public final int g;

    public bv3(List list, ArrayList arrayList, long j, long j2, int i) {
        this.c = list;
        this.d = arrayList;
        this.e = j;
        this.f = j2;
        this.g = i;
    }

    @Override // defpackage.xd6
    public final Shader b(long j) {
        int i;
        int[] iArr;
        int i2;
        float[] fArr;
        float f;
        float f2;
        float size;
        long j2 = this.e;
        char c = ' ';
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i3);
        long j3 = 4294967295L;
        int i4 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i4);
        long j4 = this.f;
        int i5 = (int) (j4 >> 32);
        if (Float.intBitsToFloat(i5) == Float.POSITIVE_INFINITY) {
            i5 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i5);
        int i6 = (int) (j4 & 4294967295L);
        if (Float.intBitsToFloat(i6) == Float.POSITIVE_INFINITY) {
            i6 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i6);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.c;
        List list2 = this.d;
        nb3.f0(list, list2);
        if (Build.VERSION.SDK_INT >= 26) {
            i = 0;
        } else {
            int size2 = list.size() - 1;
            int i7 = 1;
            i = 0;
            while (i7 < size2) {
                char c2 = c;
                long j5 = j3;
                if (kt0.e(((kt0) list.get(i7)).a) == RecyclerView.B1) {
                    i++;
                }
                i7++;
                c = c2;
                j3 = j5;
            }
        }
        char c3 = c;
        long j6 = j3;
        float intBitsToFloat5 = Float.intBitsToFloat((int) (floatToRawIntBits >> c3));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (floatToRawIntBits & j6));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (floatToRawIntBits2 >> c3));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (floatToRawIntBits2 & j6));
        if (Build.VERSION.SDK_INT >= 26) {
            int size3 = list.size();
            iArr = new int[size3];
            for (int i8 = 0; i8 < size3; i8++) {
                iArr[i8] = hv.b0(((kt0) list.get(i8)).a);
            }
        } else {
            iArr = new int[list.size() + i];
            int size4 = list.size() - 1;
            int size5 = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size5; i10++) {
                long j7 = ((kt0) list.get(i10)).a;
                if (kt0.e(j7) == RecyclerView.B1) {
                    if (i10 == 0) {
                        i2 = i9 + 1;
                        iArr[i9] = hv.b0(kt0.c(RecyclerView.B1, ((kt0) list.get(1)).a));
                    } else if (i10 == size4) {
                        i2 = i9 + 1;
                        iArr[i9] = hv.b0(kt0.c(RecyclerView.B1, ((kt0) list.get(i10 - 1)).a));
                    } else {
                        int i11 = i9 + 1;
                        iArr[i9] = hv.b0(kt0.c(RecyclerView.B1, ((kt0) list.get(i10 - 1)).a));
                        i9 += 2;
                        iArr[i11] = hv.b0(kt0.c(RecyclerView.B1, ((kt0) list.get(i10 + 1)).a));
                    }
                    i9 = i2;
                } else {
                    iArr[i9] = hv.b0(j7);
                    i9++;
                }
            }
        }
        int[] iArr2 = iArr;
        if (i == 0) {
            if (list2 != null) {
                fArr = gt0.i1(list2);
            } else {
                fArr = null;
            }
        } else {
            fArr = new float[list.size() + i];
            if (list2 != null) {
                f = ((Number) list2.get(0)).floatValue();
            } else {
                f = 0.0f;
            }
            fArr[0] = f;
            int size6 = list.size() - 1;
            int i12 = 1;
            for (int i13 = 1; i13 < size6; i13++) {
                long j8 = ((kt0) list.get(i13)).a;
                if (list2 != null) {
                    size = ((Number) list2.get(i13)).floatValue();
                } else {
                    size = i13 / (list.size() - 1);
                }
                int i14 = i12 + 1;
                fArr[i12] = size;
                if (kt0.e(j8) == RecyclerView.B1) {
                    i12 += 2;
                    fArr[i14] = size;
                } else {
                    i12 = i14;
                }
            }
            if (list2 != null) {
                f2 = ((Number) list2.get(list.size() - 1)).floatValue();
            } else {
                f2 = 1.0f;
            }
            fArr[i12] = f2;
        }
        return new LinearGradient(intBitsToFloat5, intBitsToFloat6, intBitsToFloat7, intBitsToFloat8, iArr2, fArr, u24.G(this.g));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bv3) {
                bv3 bv3Var = (bv3) obj;
                if (this.c.equals(bv3Var.c) && nb3.k(this.d, bv3Var.d) && jk4.c(this.e, bv3Var.e) && jk4.c(this.f, bv3Var.f) && this.g == bv3Var.g) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.c.hashCode() * 31;
        List list = this.d;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return Integer.hashCode(this.g) + i61.c(this.f, i61.c(this.e, (hashCode + i) * 31, 31), 31);
    }

    public final String toString() {
        long j;
        String str;
        long j2;
        String str2 = "";
        if (((((this.e & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0) {
            str = "";
        } else {
            str = "start=" + ((Object) jk4.h(j)) + ", ";
        }
        if (((((this.f & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) jk4.h(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.c + ", stops=" + this.d + ", " + str + str2 + "tileMode=" + ((Object) uj2.d0(this.g)) + ')';
    }
}
