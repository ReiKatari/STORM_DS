package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: md5  reason: default package */
/* loaded from: classes.dex */
public abstract class md5 {
    public static final i1 A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [i1] */
    /* JADX WARN: Type inference failed for: r0v5 */
    static {
        o92 o92Var;
        Integer num = hc3.a;
        if (num != null && num.intValue() < 34) {
            o92Var = new o92();
        } else {
            o92Var = new Object();
        }
        A = o92Var;
    }

    public abstract int a(int i);

    public byte[] b(byte[] bArr) {
        return c(bArr, bArr.length);
    }

    public byte[] c(byte[] bArr, int i) {
        if (bArr.length >= 0 && i >= 0 && i <= bArr.length) {
            if (i >= 0) {
                int i2 = i / 4;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    int d = d();
                    bArr[i3] = (byte) d;
                    bArr[i3 + 1] = (byte) (d >>> 8);
                    bArr[i3 + 2] = (byte) (d >>> 16);
                    bArr[i3 + 3] = (byte) (d >>> 24);
                    i3 += 4;
                }
                int i5 = i - i3;
                int a = a(i5 * 8);
                for (int i6 = 0; i6 < i5; i6++) {
                    bArr[i3 + i6] = (byte) (a >>> (i6 * 8));
                }
                return bArr;
            }
            i.f(lb1.k("fromIndex (0) must be not greater than toIndex (", i, ")."));
            return null;
        }
        i.f(xg6.q(xg6.t("fromIndex (0) or toIndex (", i, ") are out of range: 0.."), bArr.length, '.'));
        return null;
    }

    public abstract int d();
}
