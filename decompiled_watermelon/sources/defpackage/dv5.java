package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dv5  reason: default package */
/* loaded from: classes.dex */
public abstract class dv5 {
    public static final Class a;
    public static final s27 b;
    public static final s27 c;
    public static final s27 d;

    /* JADX WARN: Type inference failed for: r0v6, types: [s27, java.lang.Object] */
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

    public static void A(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            if (z) {
                zp0Var.r(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    ((Boolean) list.get(i3)).getClass();
                    Logger logger = zp0.e;
                    i2++;
                }
                zp0Var.s(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    zp0Var.k(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                boolean booleanValue = ((Boolean) list.get(i5)).booleanValue();
                zp0Var.r(i, 0);
                zp0Var.k(booleanValue ? (byte) 1 : (byte) 0);
            }
        }
    }

    public static void B(int i, List list, bq0 bq0Var) {
        if (list != null && !list.isEmpty()) {
            bq0Var.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                zp0 zp0Var = (zp0) bq0Var.B;
                x70 x70Var = (x70) list.get(i2);
                zp0Var.r(i, 2);
                zp0Var.s(x70Var.size());
                v70 v70Var = (v70) x70Var;
                zp0Var.l(v70Var.R, v70Var.k(), v70Var.size());
            }
        }
    }

    public static void C(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            int i2 = 0;
            if (z) {
                zp0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).getClass();
                    Logger logger = zp0.e;
                    i3 += 8;
                }
                zp0Var.s(i3);
                while (i2 < list.size()) {
                    zp0Var.p(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                zp0Var.getClass();
                zp0Var.o(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
        }
    }

    public static void D(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            if (z) {
                zp0Var.r(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += zp0.f(((Integer) list.get(i3)).intValue());
                }
                zp0Var.s(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    zp0Var.q(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                zp0Var.r(i, 0);
                zp0Var.q(intValue);
            }
        }
    }

    public static void E(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            int i2 = 0;
            if (z) {
                zp0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    Logger logger = zp0.e;
                    i3 += 4;
                }
                zp0Var.s(i3);
                while (i2 < list.size()) {
                    zp0Var.n(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                zp0Var.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void F(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            int i2 = 0;
            if (z) {
                zp0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    Logger logger = zp0.e;
                    i3 += 8;
                }
                zp0Var.s(i3);
                while (i2 < list.size()) {
                    zp0Var.p(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                zp0Var.o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void G(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            int i2 = 0;
            if (z) {
                zp0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).getClass();
                    Logger logger = zp0.e;
                    i3 += 4;
                }
                zp0Var.s(i3);
                while (i2 < list.size()) {
                    zp0Var.n(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                float floatValue = ((Float) list.get(i2)).floatValue();
                zp0Var.getClass();
                zp0Var.m(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
        }
    }

    public static void H(int i, List list, bq0 bq0Var, cv5 cv5Var) {
        if (list != null && !list.isEmpty()) {
            bq0Var.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                bq0Var.m0(i, list.get(i2), cv5Var);
            }
        }
    }

    public static void I(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            if (z) {
                zp0Var.r(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += zp0.f(((Integer) list.get(i3)).intValue());
                }
                zp0Var.s(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    zp0Var.q(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                zp0Var.r(i, 0);
                zp0Var.q(intValue);
            }
        }
    }

    public static void J(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            int i2 = 0;
            if (z) {
                zp0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zp0.j(((Long) list.get(i4)).longValue());
                }
                zp0Var.s(i3);
                while (i2 < list.size()) {
                    zp0Var.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                zp0Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void K(int i, List list, bq0 bq0Var, cv5 cv5Var) {
        if (list != null && !list.isEmpty()) {
            bq0Var.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                bq0Var.p0(i, list.get(i2), cv5Var);
            }
        }
    }

    public static void L(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            int i2 = 0;
            if (z) {
                zp0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).getClass();
                    Logger logger = zp0.e;
                    i3 += 4;
                }
                zp0Var.s(i3);
                while (i2 < list.size()) {
                    zp0Var.n(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                zp0Var.m(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void M(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            int i2 = 0;
            if (z) {
                zp0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).getClass();
                    Logger logger = zp0.e;
                    i3 += 8;
                }
                zp0Var.s(i3);
                while (i2 < list.size()) {
                    zp0Var.p(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                zp0Var.o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void N(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            if (z) {
                zp0Var.r(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    int intValue = ((Integer) list.get(i3)).intValue();
                    i2 += zp0.i((intValue >> 31) ^ (intValue << 1));
                }
                zp0Var.s(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue2 = ((Integer) list.get(i4)).intValue();
                    zp0Var.s((intValue2 >> 31) ^ (intValue2 << 1));
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue3 = ((Integer) list.get(i5)).intValue();
                zp0Var.r(i, 0);
                zp0Var.s((intValue3 >> 31) ^ (intValue3 << 1));
            }
        }
    }

    public static void O(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            int i2 = 0;
            if (z) {
                zp0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += zp0.j((longValue >> 63) ^ (longValue << 1));
                }
                zp0Var.s(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    zp0Var.u((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                zp0Var.t(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    public static void P(int i, List list, bq0 bq0Var) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            if (list instanceof vk3) {
                vk3 vk3Var = (vk3) list;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Object g = vk3Var.g(i2);
                    if (g instanceof String) {
                        String str = (String) g;
                        zp0Var.r(i, 2);
                        int i3 = zp0Var.c;
                        byte[] bArr = zp0Var.b;
                        int i4 = zp0Var.d;
                        try {
                            int i5 = zp0.i(str.length() * 3);
                            int i6 = zp0.i(str.length());
                            if (i6 == i5) {
                                int i7 = i4 + i6;
                                zp0Var.d = i7;
                                int k = c67.a.k(i7, i3 - i7, str, bArr);
                                zp0Var.d = i4;
                                zp0Var.s((k - i4) - i6);
                                zp0Var.d = k;
                            } else {
                                zp0Var.s(c67.b(str));
                                int i8 = zp0Var.d;
                                zp0Var.d = c67.a.k(i8, i3 - i8, str, bArr);
                            }
                        } catch (b67 e) {
                            zp0Var.d = i4;
                            zp0.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                            byte[] bytes = str.getBytes(s33.a);
                            try {
                                zp0Var.s(bytes.length);
                                zp0Var.l(bytes, 0, bytes.length);
                            } catch (aq0 e2) {
                                throw e2;
                            } catch (IndexOutOfBoundsException e3) {
                                throw new aq0(e3);
                            }
                        } catch (IndexOutOfBoundsException e4) {
                            throw new aq0(e4);
                        }
                    } else {
                        x70 x70Var = (x70) g;
                        zp0Var.r(i, 2);
                        zp0Var.s(x70Var.size());
                        v70 v70Var = (v70) x70Var;
                        zp0Var.l(v70Var.R, v70Var.k(), v70Var.size());
                    }
                }
                return;
            }
            for (int i9 = 0; i9 < list.size(); i9++) {
                String str2 = (String) list.get(i9);
                zp0Var.r(i, 2);
                int i10 = zp0Var.c;
                byte[] bArr2 = zp0Var.b;
                int i11 = zp0Var.d;
                try {
                    int i12 = zp0.i(str2.length() * 3);
                    int i13 = zp0.i(str2.length());
                    if (i13 == i12) {
                        int i14 = i11 + i13;
                        zp0Var.d = i14;
                        int k2 = c67.a.k(i14, i10 - i14, str2, bArr2);
                        zp0Var.d = i11;
                        zp0Var.s((k2 - i11) - i13);
                        zp0Var.d = k2;
                    } else {
                        zp0Var.s(c67.b(str2));
                        int i15 = zp0Var.d;
                        zp0Var.d = c67.a.k(i15, i10 - i15, str2, bArr2);
                    }
                } catch (b67 e5) {
                    zp0Var.d = i11;
                    zp0.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
                    byte[] bytes2 = str2.getBytes(s33.a);
                    try {
                        zp0Var.s(bytes2.length);
                        zp0Var.l(bytes2, 0, bytes2.length);
                    } catch (aq0 e6) {
                        throw e6;
                    } catch (IndexOutOfBoundsException e7) {
                        throw new aq0(e7);
                    }
                } catch (IndexOutOfBoundsException e8) {
                    throw new aq0(e8);
                }
            }
        }
    }

    public static void Q(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            if (z) {
                zp0Var.r(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += zp0.i(((Integer) list.get(i3)).intValue());
                }
                zp0Var.s(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    zp0Var.s(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                int intValue = ((Integer) list.get(i5)).intValue();
                zp0Var.r(i, 0);
                zp0Var.s(intValue);
            }
        }
    }

    public static void R(int i, List list, bq0 bq0Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            zp0 zp0Var = (zp0) bq0Var.B;
            int i2 = 0;
            if (z) {
                zp0Var.r(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += zp0.j(((Long) list.get(i4)).longValue());
                }
                zp0Var.s(i3);
                while (i2 < list.size()) {
                    zp0Var.u(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                zp0Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h = zp0.h(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            h += zp0.b((x70) list.get(i2));
        }
        return h;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zp0.h(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof s23) {
            s23 s23Var = (s23) list;
            if (size <= 0) {
                return 0;
            }
            s23Var.d(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zp0.f(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zp0.c(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zp0.d(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zp0.h(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof s23) {
            s23 s23Var = (s23) list;
            if (size <= 0) {
                return 0;
            }
            s23Var.d(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zp0.f(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (zp0.h(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof pr3) {
            pr3 pr3Var = (pr3) list;
            if (size <= 0) {
                return 0;
            }
            pr3Var.d(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zp0.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int l(int i, List list, cv5 cv5Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int h = zp0.h(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            b1 b1Var = (b1) list.get(i2);
            b1Var.getClass();
            jl2 jl2Var = (jl2) b1Var;
            int i3 = jl2Var.memoizedSerializedSize;
            if (i3 == -1) {
                i3 = cv5Var.g(b1Var);
                jl2Var.memoizedSerializedSize = i3;
            }
            h += zp0.i(i3) + i3;
        }
        return h;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zp0.h(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof s23) {
            s23 s23Var = (s23) list;
            if (size <= 0) {
                return 0;
            }
            s23Var.d(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += zp0.i((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zp0.h(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof pr3) {
            pr3 pr3Var = (pr3) list;
            if (size <= 0) {
                return 0;
            }
            pr3Var.d(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += zp0.j((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int h = zp0.h(i) * size;
        if (list instanceof vk3) {
            vk3 vk3Var = (vk3) list;
            while (i2 < size) {
                Object g = vk3Var.g(i2);
                if (g instanceof x70) {
                    int size2 = ((x70) g).size();
                    h = zp0.i(size2) + size2 + h;
                } else {
                    h = zp0.g((String) g) + h;
                }
                i2++;
            }
            return h;
        }
        while (i2 < size) {
            Object obj = list.get(i2);
            if (obj instanceof x70) {
                int size3 = ((x70) obj).size();
                h = zp0.i(size3) + size3 + h;
            } else {
                h = zp0.g((String) obj) + h;
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
        return (zp0.h(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof s23) {
            s23 s23Var = (s23) list;
            if (size <= 0) {
                return 0;
            }
            s23Var.d(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zp0.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zp0.h(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof pr3) {
            pr3 pr3Var = (pr3) list;
            if (size <= 0) {
                return 0;
            }
            pr3Var.d(0);
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += zp0.j(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static Object v(int i, List list, q33 q33Var, Object obj, s27 s27Var) {
        if (q33Var == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = (Integer) list.get(i3);
                int intValue = num.intValue();
                if (q33Var.a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    obj = z(i, intValue, obj, s27Var);
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
            if (!q33Var.a(intValue2)) {
                obj = z(i, intValue2, obj, s27Var);
                it.remove();
            }
        }
        return obj;
    }

    public static s27 w(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (s27) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
                return null;
            }
        }
        return null;
    }

    public static void x(s27 s27Var, Object obj, Object obj2) {
        s27Var.getClass();
        jl2 jl2Var = (jl2) obj;
        r27 r27Var = jl2Var.unknownFields;
        r27 r27Var2 = ((jl2) obj2).unknownFields;
        if (!r27Var2.equals(r27.f)) {
            int i = r27Var.a + r27Var2.a;
            int[] copyOf = Arrays.copyOf(r27Var.b, i);
            System.arraycopy(r27Var2.b, 0, copyOf, r27Var.a, r27Var2.a);
            Object[] copyOf2 = Arrays.copyOf(r27Var.c, i);
            System.arraycopy(r27Var2.c, 0, copyOf2, r27Var.a, r27Var2.a);
            r27Var = new r27(i, copyOf, copyOf2, true);
        }
        jl2Var.unknownFields = r27Var;
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

    public static Object z(int i, int i2, Object obj, s27 s27Var) {
        if (obj == null) {
            s27Var.getClass();
            obj = r27.b();
        }
        s27Var.getClass();
        ((r27) obj).c(i << 3, Long.valueOf(i2));
        return obj;
    }
}
