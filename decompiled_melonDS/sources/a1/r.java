package a1;

import java.util.ConcurrentModificationException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f89a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final long[] f90b = new long[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Object f91c = new Object();

    public static final void a(x0 x0Var) {
        int i2 = x0Var.R;
        int[] iArr = x0Var.B;
        Object[] objArr = x0Var.L;
        int i10 = 0;
        for (int i11 = 0; i11 < i2; i11++) {
            Object obj = objArr[i11];
            if (obj != f91c) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        x0Var.A = false;
        x0Var.R = i10;
    }

    public static final int b(f fVar, Object obj, int i2) {
        int i10 = fVar.L;
        if (i10 == 0) {
            return -1;
        }
        try {
            int a10 = b1.a.a(i10, i2, fVar.A);
            if (a10 < 0 || nc.k.a(obj, fVar.B[a10])) {
                return a10;
            }
            int i11 = a10 + 1;
            while (i11 < i10 && fVar.A[i11] == i2) {
                if (nc.k.a(obj, fVar.B[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a10 - 1; i12 >= 0 && fVar.A[i12] == i2; i12--) {
                if (nc.k.a(obj, fVar.B[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
