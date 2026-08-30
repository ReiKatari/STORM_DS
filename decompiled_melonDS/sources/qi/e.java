package qi;

import androidx.preference.Preference;
import fj.k;
import fj.v;
import fj.x;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import vc.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f12548a = new byte[0];

    /* renamed from: b  reason: collision with root package name */
    public static final v f12549b;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
        continue;
     */
    /* JADX WARN: Type inference failed for: r4v2, types: [fj.e, java.lang.Object] */
    static {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qi.e.<clinit>():void");
    }

    public static final void a(long j2, long j10, long j11) {
        if ((j10 | j11) >= 0 && j10 <= j2 && j2 - j10 >= j11) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + j2 + ", offset=" + j10 + ", count=" + j10);
    }

    public static final void b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e6) {
            throw e6;
        } catch (Exception unused) {
        }
    }

    public static final void c(k kVar, x xVar) {
        kVar.getClass();
        try {
            IOException iOException = null;
            for (x xVar2 : kVar.B(xVar)) {
                try {
                    if (kVar.F(xVar2).f4856c) {
                        c(kVar, xVar2);
                    }
                    kVar.v(xVar2);
                } catch (IOException e6) {
                    if (iOException == null) {
                        iOException = e6;
                    }
                }
            }
            if (iOException == null) {
                return;
            }
            throw iOException;
        } catch (FileNotFoundException unused) {
        }
    }

    public static final void d(ri.g gVar, x xVar) {
        gVar.getClass();
        xVar.getClass();
        try {
            gVar.B.v(xVar);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int e(int i2, int i10, String str, String str2) {
        str.getClass();
        while (i2 < i10) {
            if (h.Z(str2, str.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return i10;
    }

    public static final int f(String str, char c4, int i2, int i10) {
        str.getClass();
        while (i2 < i10) {
            if (str.charAt(i2) == c4) {
                return i2;
            }
            i2++;
        }
        return i10;
    }

    public static final boolean g(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final int h(String str) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (nc.k.b(charAt, 31) <= 0 || nc.k.b(charAt, 127) >= 0) {
                return i2;
            }
        }
        return -1;
    }

    public static final int i(int i2, int i10, String str) {
        str.getClass();
        while (i2 < i10) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i10;
    }

    public static final int j(int i2, int i10, String str) {
        str.getClass();
        int i11 = i10 - 1;
        if (i2 <= i11) {
            while (true) {
                char charAt = str.charAt(i11);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i11 + 1;
                }
                if (i11 == i2) {
                    break;
                }
                i11--;
            }
        }
        return i2;
    }

    public static final String[] k(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i2]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i2++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean l(String str) {
        str.getClass();
        if (!str.equalsIgnoreCase("Authorization") && !str.equalsIgnoreCase("Cookie") && !str.equalsIgnoreCase("Proxy-Authorization") && !str.equalsIgnoreCase("Set-Cookie")) {
            return false;
        }
        return true;
    }

    public static final int m(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' <= c4 && c4 < 'G') {
            return c4 - '7';
        }
        return -1;
    }

    public static final int n(fj.g gVar) {
        gVar.getClass();
        return (gVar.readByte() & 255) | ((gVar.readByte() & 255) << 16) | ((gVar.readByte() & 255) << 8);
    }

    public static final int o(int i2, String str) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Preference.DEFAULT_ORDER;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
                return i2;
            }
        }
        return i2;
    }
}
