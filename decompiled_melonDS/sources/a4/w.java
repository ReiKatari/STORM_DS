package a4;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public int[] f350a;

    /* renamed from: b  reason: collision with root package name */
    public int f351b;

    public w() {
        this.f350a = new int[10];
    }

    public int a(int i2) {
        int i10 = this.f351b - 1;
        if (i10 >= 0) {
            return this.f350a[i10];
        }
        return i2;
    }

    public int b() {
        int[] iArr = this.f350a;
        int i2 = this.f351b - 1;
        this.f351b = i2;
        return iArr[i2];
    }

    public void c(int i2) {
        int[] iArr = this.f350a;
        if (this.f351b >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.f350a = iArr;
        }
        int i10 = this.f351b;
        this.f351b = i10 + 1;
        iArr[i10] = i2;
    }

    public void d(int i2, int i10, int i11) {
        int i12 = this.f351b;
        int[] iArr = this.f350a;
        int i13 = i12 + 3;
        if (i13 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.f350a = iArr;
        }
        iArr[i12] = i2 + i11;
        iArr[i12 + 1] = i10 + i11;
        iArr[i12 + 2] = i11;
        this.f351b = i13;
    }

    public void e(int i2, int i10, int i11, int i12) {
        int i13 = this.f351b;
        int[] iArr = this.f350a;
        int i14 = i13 + 4;
        if (i14 >= iArr.length) {
            iArr = Arrays.copyOf(iArr, iArr.length * 2);
            this.f350a = iArr;
        }
        iArr[i13] = i2;
        iArr[i13 + 1] = i10;
        iArr[i13 + 2] = i11;
        iArr[i13 + 3] = i12;
        this.f351b = i14;
    }

    public void f(int i2, int i10) {
        if (i2 < i10) {
            int i11 = i2 - 3;
            for (int i12 = i2; i12 < i10; i12 += 3) {
                int[] iArr = this.f350a;
                int i13 = iArr[i12];
                int i14 = iArr[i10];
                if (i13 < i14 || (i13 == i14 && iArr[i12 + 1] <= iArr[i10 + 1])) {
                    i11 += 3;
                    g(i11, i12);
                }
            }
            g(i11 + 3, i10);
            f(i2, i11);
            f(i11 + 6, i10);
        }
    }

    public void g(int i2, int i10) {
        int[] iArr = this.f350a;
        int i11 = iArr[i2];
        iArr[i2] = iArr[i10];
        iArr[i10] = i11;
        int i12 = i2 + 1;
        int i13 = i10 + 1;
        int i14 = iArr[i12];
        iArr[i12] = iArr[i13];
        iArr[i13] = i14;
        int i15 = i2 + 2;
        int i16 = i10 + 2;
        int i17 = iArr[i15];
        iArr[i15] = iArr[i16];
        iArr[i16] = i17;
    }

    public w(int i2) {
        this.f350a = new int[i2];
    }
}
