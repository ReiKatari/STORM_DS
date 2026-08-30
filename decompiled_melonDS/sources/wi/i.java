package wi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final fj.h f14253a;

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f14254b;

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f14255c;

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f14256d;

    static {
        fj.h hVar = fj.h.R;
        f14253a = na.f.h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f14254b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f14255c = new String[64];
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            binaryString.getClass();
            String replace = qi.g.c("%8s", binaryString).replace(' ', '0');
            replace.getClass();
            strArr[i2] = replace;
        }
        f14256d = strArr;
        String[] strArr2 = f14255c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = w.d.s(new StringBuilder(), strArr2[i10], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f14255c;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i13]);
            sb2.append('|');
            strArr3[i14 | 8] = w.d.s(sb2, strArr3[i12], "|PADDED");
        }
        int length = f14255c.length;
        for (int i15 = 0; i15 < length; i15++) {
            String[] strArr4 = f14255c;
            if (strArr4[i15] == null) {
                strArr4[i15] = f14256d[i15];
            }
        }
    }

    public static String a(int i2) {
        String[] strArr = f14254b;
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        return qi.g.c("0x%02x", Integer.valueOf(i2));
    }

    public static String b(boolean z10, int i2, int i10, int i11, int i12) {
        String str;
        String str2;
        String str3;
        String a10 = a(i11);
        if (i12 == 0) {
            str = "";
        } else {
            String[] strArr = f14256d;
            if (i11 != 2 && i11 != 3) {
                if (i11 != 4 && i11 != 6) {
                    if (i11 != 7 && i11 != 8) {
                        String[] strArr2 = f14255c;
                        if (i12 < strArr2.length) {
                            str2 = strArr2[i12];
                            str2.getClass();
                        } else {
                            str2 = strArr[i12];
                        }
                        if (i11 == 5 && (i12 & 4) != 0) {
                            str = vc.o.T(str2, "HEADERS", "PUSH_PROMISE");
                        } else if (i11 == 0 && (i12 & 32) != 0) {
                            str = vc.o.T(str2, "PRIORITY", "COMPRESSED");
                        } else {
                            str = str2;
                        }
                    }
                } else if (i12 == 1) {
                    str = "ACK";
                } else {
                    str = strArr[i12];
                }
            }
            str = strArr[i12];
        }
        if (z10) {
            str3 = "<<";
        } else {
            str3 = ">>";
        }
        return qi.g.c("%s 0x%08x %5d %-13s %s", str3, Integer.valueOf(i2), Integer.valueOf(i10), a10, str);
    }

    public static String c(boolean z10, int i2, int i10, long j2) {
        String str;
        String a10 = a(8);
        if (z10) {
            str = "<<";
        } else {
            str = ">>";
        }
        return qi.g.c("%s 0x%08x %5d %-13s %d", str, Integer.valueOf(i2), Integer.valueOf(i10), a10, Long.valueOf(j2));
    }
}
