package defpackage;

import androidx.preference.Preference;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gk7  reason: default package */
/* loaded from: classes.dex */
public abstract class gk7 {
    public static final byte[] a = new byte[0];
    public static final cf4 b;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
        continue;
     */
    /* JADX WARN: Type inference failed for: r4v2, types: [f60, java.lang.Object] */
    static {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk7.<clinit>():void");
    }

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        StringBuilder q = wh1.q(j, "length=", ", offset=");
        q.append(j2);
        q.append(", count=");
        q.append(j2);
        throw new ArrayIndexOutOfBoundsException(q.toString());
    }

    public static final void b(Closeable closeable) {
        closeable.getClass();
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void c(j62 j62Var, jk4 jk4Var) {
        j62Var.getClass();
        try {
            IOException iOException = null;
            for (jk4 jk4Var2 : j62Var.D(jk4Var)) {
                try {
                    if (j62Var.F(jk4Var2).c) {
                        c(j62Var, jk4Var2);
                    }
                    j62Var.x(jk4Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
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

    public static final void d(eg1 eg1Var, jk4 jk4Var) {
        eg1Var.getClass();
        jk4Var.getClass();
        try {
            eg1Var.B.x(jk4Var);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int e(int i, int i2, String str, String str2) {
        str.getClass();
        while (i < i2) {
            if (zg6.r0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, char c, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
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
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (b53.E(charAt, 31) <= 0 || b53.E(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int i(int i, int i2, String str) {
        str.getClass();
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int j(int i, int i2, String str) {
        str.getClass();
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final String[] k(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr.getClass();
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
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

    public static final int m(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        return -1;
    }

    public static final int n(u60 u60Var) {
        u60Var.getClass();
        return (u60Var.readByte() & 255) | ((u60Var.readByte() & 255) << 16) | ((u60Var.readByte() & 255) << 8);
    }

    public static final int o(int i, String str) {
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
                return i;
            }
        }
        return i;
    }
}
