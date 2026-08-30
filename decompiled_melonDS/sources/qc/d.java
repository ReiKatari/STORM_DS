package qc;

import a0.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d {
    public static final a A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [qc.a] */
    /* JADX WARN: Type inference failed for: r0v5 */
    static {
        b bVar;
        Integer num = ic.a.f7031a;
        if (num != null && num.intValue() < 34) {
            bVar = new b();
        } else {
            bVar = new Object();
        }
        A = bVar;
    }

    public abstract int a(int i2);

    public byte[] b(int i2, byte[] bArr) {
        if (bArr.length >= 0 && i2 >= 0 && i2 <= bArr.length) {
            if (i2 >= 0) {
                int i10 = i2 / 4;
                int i11 = 0;
                for (int i12 = 0; i12 < i10; i12++) {
                    int d4 = d();
                    bArr[i11] = (byte) d4;
                    bArr[i11 + 1] = (byte) (d4 >>> 8);
                    bArr[i11 + 2] = (byte) (d4 >>> 16);
                    bArr[i11 + 3] = (byte) (d4 >>> 24);
                    i11 += 4;
                }
                int i13 = i2 - i11;
                int a10 = a(i13 * 8);
                for (int i14 = 0; i14 < i13; i14++) {
                    bArr[i11 + i14] = (byte) (a10 >>> (i14 * 8));
                }
                return bArr;
            }
            j.e(w.d.m("fromIndex (0) must be not greater than toIndex (", i2, ")."));
            return null;
        }
        j.e(w.d.p(kc.a.i("fromIndex (0) or toIndex (", i2, ") are out of range: 0.."), bArr.length, '.'));
        return null;
    }

    public byte[] c(byte[] bArr) {
        return b(bArr.length, bArr);
    }

    public abstract int d();
}
