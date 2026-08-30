package pd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f11589a = new char[117];

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f11590b = new byte[126];

    static {
        for (int i2 = 0; i2 < 32; i2++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        byte[] bArr = f11590b;
        for (int i10 = 0; i10 < 33; i10++) {
            bArr[i10] = Byte.MAX_VALUE;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    public static void a(char c4, int i2) {
        if (c4 != 'u') {
            f11589a[c4] = (char) i2;
        }
    }
}
