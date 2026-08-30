package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c45  reason: default package */
/* loaded from: classes.dex */
public abstract class c45 {
    public static final h1 A;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [h1] */
    /* JADX WARN: Type inference failed for: r0v5 */
    static {
        v42 v42Var;
        Integer num = t53.a;
        if (num != null && num.intValue() < 34) {
            v42Var = new v42();
        } else {
            v42Var = new Object();
        }
        A = v42Var;
    }

    public abstract int a(int i);

    public byte[] b(int i, byte[] bArr) {
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
            i.g(wh1.j("fromIndex (0) must be not greater than toIndex (", i, ")."));
            return null;
        }
        i.g(ej6.g(wh1.s("fromIndex (0) or toIndex (", i, ") are out of range: 0.."), bArr.length, '.'));
        return null;
    }

    public byte[] c(byte[] bArr) {
        return b(bArr.length, bArr);
    }

    public abstract int d();
}
