package pd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f11591a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f11592b;

    static {
        String[] strArr = new String[93];
        for (int i2 = 0; i2 < 32; i2++) {
            strArr[i2] = "\\u" + b(i2 >> 12) + b(i2 >> 8) + b(i2 >> 4) + b(i2);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f11591a = strArr;
        byte[] bArr = new byte[93];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr[i10] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f11592b = bArr;
    }

    public static final void a(StringBuilder sb2, String str) {
        str.getClass();
        sb2.append('\"');
        int length = str.length();
        int i2 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            String[] strArr = f11591a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb2.append((CharSequence) str, i2, i10);
                sb2.append(strArr[charAt]);
                i2 = i10 + 1;
            }
        }
        if (i2 != 0) {
            sb2.append((CharSequence) str, i2, str.length());
        } else {
            sb2.append(str);
        }
        sb2.append('\"');
    }

    public static final char b(int i2) {
        int i10;
        int i11 = i2 & 15;
        if (i11 < 10) {
            i10 = i11 + 48;
        } else {
            i10 = i11 + 87;
        }
        return (char) i10;
    }
}
