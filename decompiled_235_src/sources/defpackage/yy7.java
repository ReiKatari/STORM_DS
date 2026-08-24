package defpackage;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yy7 */
/* loaded from: classes.dex */
public abstract class yy7 {
    public static final byte[] a = new byte[0];
    public static final eo4 b;

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00d3, code lost:
        continue;
     */
    /* JADX WARN: Type inference failed for: r4v2, types: [k80, java.lang.Object] */
    static {
        da0 da0Var = da0.R;
        da0[] da0VarArr = {xd5.n("efbbbf"), xd5.n("feff"), xd5.n("fffe0000"), xd5.n("fffe"), xd5.n("0000feff")};
        ArrayList arrayList = new ArrayList(new ku(da0VarArr, false));
        jt0.w0(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < 5) {
            arrayList2.set(hf.y(arrayList, da0VarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((da0) arrayList.get(0)).d() > 0) {
            int i4 = 0;
            while (i4 < arrayList.size()) {
                da0 da0Var2 = (da0) arrayList.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < arrayList.size()) {
                    da0 da0Var3 = (da0) arrayList.get(i6);
                    da0Var3.getClass();
                    da0Var2.getClass();
                    if (da0Var3.l(0, da0Var2, da0Var2.d())) {
                        if (da0Var3.d() != da0Var2.d()) {
                            if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                                arrayList.remove(i6);
                                ((Number) arrayList2.remove(i6)).intValue();
                            } else {
                                i6++;
                            }
                        } else {
                            u34.w(da0Var3, "duplicate option: ");
                            return;
                        }
                    }
                }
                i4 = i5;
            }
            ?? obj = new Object();
            ln2.h(0L, obj, 0, arrayList, 0, arrayList.size(), arrayList2);
            int i7 = (int) (obj.B / 4);
            int[] iArr = new int[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                iArr[i8] = obj.readInt();
            }
            b = new eo4((da0[]) Arrays.copyOf(da0VarArr, 5), iArr);
            return;
        }
        i.h("the empty byte string is not a supported option");
    }

    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        StringBuilder s = xg6.s(j, "length=", ", offset=");
        s.append(j2);
        s.append(", count=");
        s.append(j2);
        throw new ArrayIndexOutOfBoundsException(s.toString());
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

    public static final void c(db2 db2Var, lt4 lt4Var) {
        db2Var.getClass();
        try {
            IOException iOException = null;
            for (lt4 lt4Var2 : db2Var.x(lt4Var)) {
                try {
                    if (db2Var.A(lt4Var2).c) {
                        c(db2Var, lt4Var2);
                    }
                    db2Var.r(lt4Var2);
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

    public static final void d(ik1 ik1Var, lt4 lt4Var) {
        ik1Var.getClass();
        lt4Var.getClass();
        try {
            ik1Var.B.r(lt4Var);
        } catch (FileNotFoundException unused) {
        }
    }

    public static final int e(String str, char c, int i, int i2) {
        str.getClass();
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int f(String str, int i, int i2, String str2) {
        str.getClass();
        while (i < i2) {
            if (qs6.k0(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int g(String str, char c, int i, int i2, int i3) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return e(str, c, i, i2);
    }

    public static final boolean h(String[] strArr, String[] strArr2, Comparator comparator) {
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

    public static final int i(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (nb3.p(charAt, 31) <= 0 || nb3.p(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int j(int i, int i2, String str) {
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

    public static final int k(int i, int i2, String str) {
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

    public static final String[] l(String[] strArr, String[] strArr2, Comparator comparator) {
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

    public static final boolean m(String str) {
        str.getClass();
        if (!str.equalsIgnoreCase("Authorization") && !str.equalsIgnoreCase("Cookie") && !str.equalsIgnoreCase("Proxy-Authorization") && !str.equalsIgnoreCase("Set-Cookie")) {
            return false;
        }
        return true;
    }

    public static final int n(char c) {
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

    public static final int o(z80 z80Var) {
        z80Var.getClass();
        return (z80Var.readByte() & 255) | ((z80Var.readByte() & 255) << 16) | ((z80Var.readByte() & 255) << 8);
    }

    public static final int p(int i, String str) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
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
