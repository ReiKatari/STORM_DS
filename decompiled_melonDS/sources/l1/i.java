package l1;

import g2.w6;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final s f8571a = new s(4);

    /* renamed from: b  reason: collision with root package name */
    public static final s f8572b = new s(3);

    /* renamed from: c  reason: collision with root package name */
    public static final d f8573c = new d();

    /* renamed from: d  reason: collision with root package name */
    public static final e f8574d = new e(0);

    /* renamed from: e  reason: collision with root package name */
    public static final e f8575e;

    static {
        new e(3);
        f8575e = new e(2);
        new e(1);
    }

    public static void a(int i2, int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float f8 = (i2 - i11) / 2;
        if (!z10) {
            int length = iArr.length;
            int i13 = 0;
            while (i10 < length) {
                int i14 = iArr[i10];
                iArr2[i13] = Math.round(f8);
                f8 += i14;
                i10++;
                i13++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i15 = iArr[length2];
                iArr2[length2] = Math.round(f8);
                f8 += i15;
            } else {
                return;
            }
        }
    }

    public static void b(int[] iArr, int[] iArr2, boolean z10) {
        int i2 = 0;
        if (!z10) {
            int length = iArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i2 < length) {
                int i12 = iArr[i2];
                iArr2[i10] = i11;
                i11 += i12;
                i2++;
                i10++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i13 = iArr[length2];
                iArr2[length2] = i2;
                i2 += i13;
            } else {
                return;
            }
        }
    }

    public static void c(int i2, int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        int i13 = i2 - i11;
        if (!z10) {
            int length = iArr.length;
            int i14 = 0;
            while (i10 < length) {
                int i15 = iArr[i10];
                iArr2[i14] = i13;
                i13 += i15;
                i10++;
                i14++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 < length2) {
                int i16 = iArr[length2];
                iArr2[length2] = i13;
                i13 += i16;
            } else {
                return;
            }
        }
    }

    public static void d(int i2, int[] iArr, int[] iArr2, boolean z10) {
        float length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        if (iArr.length == 0) {
            length = 0.0f;
        } else {
            length = (i2 - i11) / iArr.length;
        }
        float f8 = length / 2;
        if (!z10) {
            int length2 = iArr.length;
            int i13 = 0;
            while (i10 < length2) {
                int i14 = iArr[i10];
                iArr2[i13] = Math.round(f8);
                f8 += i14 + length;
                i10++;
                i13++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 < length3) {
                int i15 = iArr[length3];
                iArr2[length3] = Math.round(f8);
                f8 += i15 + length;
            } else {
                return;
            }
        }
    }

    public static void e(int i2, int[] iArr, int[] iArr2, boolean z10) {
        float f8;
        if (iArr.length != 0) {
            int i10 = 0;
            int i11 = 0;
            for (int i12 : iArr) {
                i11 += i12;
            }
            float max = (i2 - i11) / Math.max(iArr.length - 1, 1);
            if (z10 && iArr.length == 1) {
                f8 = max;
            } else {
                f8 = 0.0f;
            }
            if (!z10) {
                int length = iArr.length;
                int i13 = 0;
                while (i10 < length) {
                    int i14 = iArr[i10];
                    iArr2[i13] = Math.round(f8);
                    f8 += i14 + max;
                    i10++;
                    i13++;
                }
                return;
            }
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i15 = iArr[length2];
                iArr2[length2] = Math.round(f8);
                f8 += i15 + max;
            }
        }
    }

    public static void f(int i2, int[] iArr, int[] iArr2, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        float length = (i2 - i11) / (iArr.length + 1);
        if (!z10) {
            int length2 = iArr.length;
            float f8 = length;
            int i13 = 0;
            while (i10 < length2) {
                int i14 = iArr[i10];
                iArr2[i13] = Math.round(f8);
                f8 += i14 + length;
                i10++;
                i13++;
            }
            return;
        }
        float f10 = length;
        for (int length3 = iArr.length - 1; -1 < length3; length3--) {
            int i15 = iArr[length3];
            iArr2[length3] = Math.round(f10);
            f10 += i15 + length;
        }
    }

    public static g g(float f8) {
        return new g(f8, true, new w6(11));
    }
}
