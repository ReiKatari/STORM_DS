package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mm0  reason: default package */
/* loaded from: classes.dex */
public final class mm0 {
    public static final char[] a = new char[117];
    public static final byte[] b = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        a('b', 8);
        a('t', 9);
        a('n', 10);
        a('f', 12);
        a('r', 13);
        a('/', 47);
        a('\"', 34);
        a('\\', 92);
        byte[] bArr = b;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = Byte.MAX_VALUE;
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

    public static void a(char c, int i) {
        if (c != 'u') {
            a[c] = (char) i;
        }
    }
}
