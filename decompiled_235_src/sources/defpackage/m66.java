package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m66  reason: default package */
/* loaded from: classes.dex */
public abstract class m66 {
    public static final Class a;
    public static final ng7 b;
    public static final ng7 c;
    public static final ng7 d;

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, ng7] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = w(false);
        c = w(true);
        d = new Object();
    }

    public static void A(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            if (z) {
                ms0Var.r(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    ((Boolean) list.get(i3)).getClass();
                    Logger logger = ms0.e;
                    i2++;
                }
                ms0Var.s(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ms0Var.k(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                boolean booleanValue = ((Boolean) list.get(i5)).booleanValue();
                ms0Var.r(i, 0);
                ms0Var.k(booleanValue ? (byte) 1 : (byte) 0);
            }
        }
    }

    public static void B(int i, List list, os0 os0Var) {
        if (list != null && !list.isEmpty()) {
            os0Var.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                ms0 ms0Var = (ms0) os0Var.B;
                ea0 ea0Var = (ea0) list.get(i2);
                ms0Var.r(i, 2);
                ms0Var.s(ea0Var.size());
                ca0 ca0Var = (ca0) ea0Var;
                ms0Var.l(ca0Var.R, ca0Var.g(), ca0Var.size());
            }
        }
    }

    public static void C(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            int i2 = 0;
            if (z) {
                ms0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    Logger logger = ms0.e;
                    i3 += 8;
                }
                ms0Var.s(i3);
                while (i2 < list.size()) {
                    ms0Var.p(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                ms0Var.getClass();
                ms0Var.o(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
        }
    }

    public static void D(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            if (z) {
                ms0Var.r(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += ms0.f(((Integer) list.get(i3)).intValue());
                }
                ms0Var.s(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ms0Var.q(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                ms0Var.r(i, 0);
                ms0Var.q(intValue);
            }
        }
    }

    public static void E(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            int i2 = 0;
            if (z) {
                ms0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    Logger logger = ms0.e;
                    i3 += 4;
                }
                ms0Var.s(i3);
                while (i2 < list.size()) {
                    ms0Var.n(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ms0Var.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void F(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            int i2 = 0;
            if (z) {
                ms0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    Logger logger = ms0.e;
                    i3 += 8;
                }
                ms0Var.s(i3);
                while (i2 < list.size()) {
                    ms0Var.p(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ms0Var.o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void G(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            int i2 = 0;
            if (z) {
                ms0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    Logger logger = ms0.e;
                    i3 += 4;
                }
                ms0Var.s(i3);
                while (i2 < list.size()) {
                    ms0Var.n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                ms0Var.getClass();
                ms0Var.m(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
        }
    }

    public static void H(int i, List list, os0 os0Var, j66 j66Var) {
        if (list != null && !list.isEmpty()) {
            os0Var.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                os0Var.o0(i, list.get(i2), j66Var);
            }
        }
    }

    public static void I(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            if (z) {
                ms0Var.r(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += ms0.f(((Integer) list.get(i3)).intValue());
                }
                ms0Var.s(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ms0Var.q(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                ms0Var.r(i, 0);
                ms0Var.q(intValue);
            }
        }
    }

    public static void J(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            int i2 = 0;
            if (z) {
                ms0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += ms0.j(((Long) list.get(i4)).longValue());
                }
                ms0Var.s(i3);
                while (i2 < list.size()) {
                    ms0Var.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ms0Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void K(int i, List list, os0 os0Var, j66 j66Var) {
        if (list != null && !list.isEmpty()) {
            os0Var.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                os0Var.r0(i, list.get(i2), j66Var);
            }
        }
    }

    public static void L(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            int i2 = 0;
            if (z) {
                ms0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    Logger logger = ms0.e;
                    i3 += 4;
                }
                ms0Var.s(i3);
                while (i2 < list.size()) {
                    ms0Var.n(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ms0Var.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void M(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            int i2 = 0;
            if (z) {
                ms0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    Logger logger = ms0.e;
                    i3 += 8;
                }
                ms0Var.s(i3);
                while (i2 < list.size()) {
                    ms0Var.p(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ms0Var.o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void N(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            if (z) {
                ms0Var.r(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    int intValue = ((Integer) list.get(i3)).intValue();
                    i2 += ms0.i((intValue >> 31) ^ (intValue << 1));
                }
                ms0Var.s(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue2 = ((Integer) list.get(i4)).intValue();
                    ms0Var.s((intValue2 >> 31) ^ (intValue2 << 1));
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                ms0Var.r(i, 0);
                ms0Var.s((intValue3 >> 31) ^ (intValue3 << 1));
            }
        }
    }

    public static void O(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            int i2 = 0;
            if (z) {
                ms0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += ms0.j((longValue >> 63) ^ (longValue << 1));
                }
                ms0Var.s(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    ms0Var.u((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                ms0Var.t(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    public static void P(int i, List list, os0 os0Var) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            if (list instanceof wr3) {
                wr3 wr3Var = (wr3) list;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Object v = wr3Var.v(i2);
                    if (v instanceof String) {
                        String str = (String) v;
                        ms0Var.r(i, 2);
                        int i3 = ms0Var.c;
                        byte[] bArr = ms0Var.b;
                        int i4 = ms0Var.d;
                        try {
                            int i5 = ms0.i(str.length() * 3);
                            int i6 = ms0.i(str.length());
                            if (i6 == i5) {
                                int i7 = i4 + i6;
                                ms0Var.d = i7;
                                int n = xj7.a.n(str, bArr, i7, i3 - i7);
                                ms0Var.d = i4;
                                ms0Var.s((n - i4) - i6);
                                ms0Var.d = n;
                            } else {
                                ms0Var.s(xj7.b(str));
                                int i8 = ms0Var.d;
                                ms0Var.d = xj7.a.n(str, bArr, i8, i3 - i8);
                            }
                        } catch (IndexOutOfBoundsException e) {
                            throw new ns0(e);
                        } catch (wj7 e2) {
                            ms0Var.d = i4;
                            ms0.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e2);
                            byte[] bytes = str.getBytes(aa3.a);
                            try {
                                ms0Var.s(bytes.length);
                                ms0Var.l(bytes, 0, bytes.length);
                            } catch (IndexOutOfBoundsException e3) {
                                throw new ns0(e3);
                            } catch (ns0 e4) {
                                throw e4;
                            }
                        }
                    } else {
                        ea0 ea0Var = (ea0) v;
                        ms0Var.r(i, 2);
                        ms0Var.s(ea0Var.size());
                        ca0 ca0Var = (ca0) ea0Var;
                        ms0Var.l(ca0Var.R, ca0Var.g(), ca0Var.size());
                    }
                }
                return;
            }
            for (int i9 = 0; i9 < list.size(); i9++) {
                String str2 = (String) list.get(i9);
                ms0Var.r(i, 2);
                int i10 = ms0Var.c;
                byte[] bArr2 = ms0Var.b;
                int i11 = ms0Var.d;
                try {
                    int i12 = ms0.i(str2.length() * 3);
                    int i13 = ms0.i(str2.length());
                    if (i13 == i12) {
                        int i14 = i11 + i13;
                        ms0Var.d = i14;
                        int n2 = xj7.a.n(str2, bArr2, i14, i10 - i14);
                        ms0Var.d = i11;
                        ms0Var.s((n2 - i11) - i13);
                        ms0Var.d = n2;
                    } else {
                        ms0Var.s(xj7.b(str2));
                        int i15 = ms0Var.d;
                        ms0Var.d = xj7.a.n(str2, bArr2, i15, i10 - i15);
                    }
                } catch (IndexOutOfBoundsException e5) {
                    throw new ns0(e5);
                } catch (wj7 e6) {
                    ms0Var.d = i11;
                    ms0.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e6);
                    byte[] bytes2 = str2.getBytes(aa3.a);
                    try {
                        ms0Var.s(bytes2.length);
                        ms0Var.l(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e7) {
                        throw new ns0(e7);
                    } catch (ns0 e8) {
                        throw e8;
                    }
                }
            }
        }
    }

    public static void Q(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            if (z) {
                ms0Var.r(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += ms0.i(((Integer) list.get(i3)).intValue());
                }
                ms0Var.s(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ms0Var.s(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                ms0Var.r(i, 0);
                ms0Var.s(intValue);
            }
        }
    }

    public static void R(int i, List list, os0 os0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            ms0 ms0Var = (ms0) os0Var.B;
            int i2 = 0;
            if (z) {
                ms0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += ms0.j(((Long) list.get(i4)).longValue());
                }
                ms0Var.s(i3);
                while (i2 < list.size()) {
                    ms0Var.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ms0Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h = ms0.h(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            h += ms0.b((ea0) list.get(i2));
        }
        return h;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ms0.h(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a93) {
            a93 a93Var = (a93) list;
            if (size <= 0) {
                return 0;
            }
            a93Var.c(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ms0.f(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return ms0.c(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return ms0.d(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ms0.h(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a93) {
            a93 a93Var = (a93) list;
            if (size <= 0) {
                return 0;
            }
            a93Var.c(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ms0.f(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (ms0.h(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof uy3) {
            uy3 uy3Var = (uy3) list;
            if (size <= 0) {
                return 0;
            }
            uy3Var.c(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ms0.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int l(int i, List list, j66 j66Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h = ms0.h(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            c1 c1Var = (c1) list.get(i2);
            c1Var.getClass();
            pr2 pr2Var = (pr2) c1Var;
            int i3 = pr2Var.memoizedSerializedSize;
            if (i3 == -1) {
                i3 = j66Var.i(c1Var);
                pr2Var.memoizedSerializedSize = i3;
            }
            h += ms0.i(i3) + i3;
        }
        return h;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ms0.h(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a93) {
            a93 a93Var = (a93) list;
            if (size <= 0) {
                return 0;
            }
            a93Var.c(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += ms0.i((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ms0.h(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof uy3) {
            uy3 uy3Var = (uy3) list;
            if (size <= 0) {
                return 0;
            }
            uy3Var.c(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += ms0.j((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int h = ms0.h(i) * size;
        if (list instanceof wr3) {
            wr3 wr3Var = (wr3) list;
            while (i2 < size) {
                Object v = wr3Var.v(i2);
                if (v instanceof ea0) {
                    int size2 = ((ea0) v).size();
                    h = ms0.i(size2) + size2 + h;
                } else {
                    h = ms0.g((String) v) + h;
                }
                i2++;
            }
            return h;
        }
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj instanceof ea0) {
                int size3 = ((ea0) obj).size();
                h = ms0.i(size3) + size3 + h;
            } else {
                h = ms0.g((String) obj) + h;
            }
            i2++;
        }
        return h;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ms0.h(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof a93) {
            a93 a93Var = (a93) list;
            if (size <= 0) {
                return 0;
            }
            a93Var.c(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ms0.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ms0.h(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof uy3) {
            uy3 uy3Var = (uy3) list;
            if (size <= 0) {
                return 0;
            }
            uy3Var.c(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ms0.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static Object v(int i, List list, y93 y93Var, Object obj, ng7 ng7Var) {
        if (y93Var == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (y93Var.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj = z(i, intValue, obj, ng7Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
            return obj;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (!y93Var.a(intValue2)) {
                obj = z(i, intValue2, obj, ng7Var);
                it.remove();
            }
        }
        return obj;
    }

    public static ng7 w(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (ng7) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
                return null;
            }
        }
        return null;
    }

    public static void x(ng7 ng7Var, Object obj, Object obj2) {
        ng7Var.getClass();
        pr2 pr2Var = (pr2) obj;
        mg7 mg7Var = pr2Var.unknownFields;
        mg7 mg7Var2 = ((pr2) obj2).unknownFields;
        if (!mg7Var2.equals(mg7.f)) {
            int i = mg7Var.a + mg7Var2.a;
            int[] copyOf = Arrays.copyOf(mg7Var.b, i);
            System.arraycopy(mg7Var2.b, 0, copyOf, mg7Var.a, mg7Var2.a);
            Object[] copyOf2 = Arrays.copyOf(mg7Var.c, i);
            System.arraycopy(mg7Var2.c, 0, copyOf2, mg7Var.a, mg7Var2.a);
            mg7Var = new mg7(i, copyOf, copyOf2, true);
        }
        pr2Var.unknownFields = mg7Var;
    }

    public static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static Object z(int i, int i2, Object obj, ng7 ng7Var) {
        if (obj == null) {
            ng7Var.getClass();
            obj = mg7.b();
        }
        ng7Var.getClass();
        ((mg7) obj).c(i << 3, Long.valueOf(i2));
        return obj;
    }
}
