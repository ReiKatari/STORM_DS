package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sn1  reason: default package */
/* loaded from: classes.dex */
public abstract class sn1 {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
        if (defpackage.jk4.c(defpackage.ej2.R(r11, true), 0) == false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v4, types: [ch5, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005e -> B:22:0x0063). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(mw6 mw6Var, long j, s41 s41Var) {
        jn1 jn1Var;
        int i;
        mw6 mw6Var2;
        ch5 ch5Var;
        Object c;
        Object obj;
        Object obj2;
        if (s41Var instanceof jn1) {
            jn1 jn1Var2 = (jn1) s41Var;
            int i2 = jn1Var2.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jn1Var2.Z = i2 - Integer.MIN_VALUE;
                jn1Var = jn1Var2;
                Object obj3 = jn1Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = jn1Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        ch5Var = jn1Var.X;
                        mw6 mw6Var3 = jn1Var.R;
                        oi2.Y(obj3);
                        oy4 oy4Var = (oy4) obj3;
                        List list = oy4Var.a;
                        int size = list.size();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= size) {
                                obj = list.get(i4);
                                if (nj2.o(((vy4) obj).a, ch5Var.A)) {
                                    break;
                                }
                                i4++;
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        vy4 vy4Var = (vy4) obj;
                        if (vy4Var == null) {
                            if (ej2.p(vy4Var)) {
                                List list2 = oy4Var.a;
                                int size2 = list2.size();
                                while (true) {
                                    if (i3 < size2) {
                                        obj2 = list2.get(i3);
                                        if (((vy4) obj2).d) {
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                vy4 vy4Var2 = (vy4) obj2;
                                if (vy4Var2 != null) {
                                    ch5Var.A = vy4Var2.a;
                                    mw6Var2 = mw6Var3;
                                    jn1Var.R = mw6Var2;
                                    jn1Var.X = ch5Var;
                                    jn1Var.Z = 1;
                                    c = mw6Var2.c(py4.Main, jn1Var);
                                    if (c != x61Var) {
                                        return x61Var;
                                    }
                                    mw6 mw6Var4 = mw6Var2;
                                    obj3 = c;
                                    mw6Var3 = mw6Var4;
                                }
                            }
                            oy4 oy4Var2 = (oy4) obj3;
                            List list3 = oy4Var2.a;
                            int size3 = list3.size();
                            int i32 = 0;
                            int i42 = 0;
                            while (true) {
                                if (i42 >= size3) {
                                }
                                i42++;
                            }
                            vy4 vy4Var3 = (vy4) obj;
                            if (vy4Var3 == null) {
                                vy4Var3 = null;
                            }
                        }
                        if (vy4Var3 == null || vy4Var3.c()) {
                            return null;
                        }
                        return vy4Var3;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj3);
                mw6Var2 = mw6Var;
                if (!f(mw6Var2.Y.p0, j)) {
                    ?? obj4 = new Object();
                    obj4.A = j;
                    ch5Var = obj4;
                    jn1Var.R = mw6Var2;
                    jn1Var.X = ch5Var;
                    jn1Var.Z = 1;
                    c = mw6Var2.c(py4.Main, jn1Var);
                    if (c != x61Var) {
                    }
                }
                return null;
            }
        }
        jn1Var = new s41(s41Var);
        Object obj32 = jn1Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = jn1Var.Z;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b A[Catch: qy4 -> 0x00a4, TRY_LEAVE, TryCatch #0 {qy4 -> 0x00a4, blocks: (B:12:0x002a, B:34:0x0097, B:36:0x009b, B:30:0x007d), top: B:46:0x0020 }] */
    /* JADX WARN: Type inference failed for: r10v2, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [dh5] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [zg5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(mw6 mw6Var, long j, s41 s41Var) {
        kn1 kn1Var;
        int i;
        Object obj;
        vy4 vy4Var;
        zg5 zg5Var;
        try {
            if (s41Var instanceof kn1) {
                kn1 kn1Var2 = (kn1) s41Var;
                int i2 = kn1Var2.d0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    kn1Var2.d0 = i2 - Integer.MIN_VALUE;
                    kn1Var = kn1Var2;
                    Object obj2 = kn1Var.Z;
                    Object obj3 = x61.COROUTINE_SUSPENDED;
                    i = kn1Var.d0;
                    if (i == 0) {
                        if (i == 1) {
                            zg5Var = kn1Var.Y;
                            dh5 dh5Var = kn1Var.X;
                            vy4Var = kn1Var.R;
                            oi2.Y(obj2);
                            j = dh5Var;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj2);
                        if (!f(mw6Var.Y.p0, j)) {
                            List list = mw6Var.Y.p0.a;
                            int size = list.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 < size) {
                                    obj = list.get(i3);
                                    if (nj2.o(((vy4) obj).a, j)) {
                                        break;
                                    }
                                    i3++;
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            vy4Var = (vy4) obj;
                            if (vy4Var != null) {
                                ?? obj4 = new Object();
                                ?? obj5 = new Object();
                                obj5.A = vy4Var;
                                long b = mw6Var.f().b();
                                ?? obj6 = new Object();
                                eo2 ln1Var = new ln1(obj6, obj5, obj4, null);
                                kn1Var.R = vy4Var;
                                kn1Var.X = obj4;
                                kn1Var.Y = obj6;
                                kn1Var.d0 = 1;
                                if (mw6Var.k(b, ln1Var, kn1Var) == obj3) {
                                    return obj3;
                                }
                                zg5Var = obj6;
                                j = obj4;
                            }
                        }
                        return null;
                    }
                    if (zg5Var.A) {
                        vy4 vy4Var2 = (vy4) j.A;
                        if (vy4Var2 == null) {
                            return vy4Var;
                        }
                        return vy4Var2;
                    }
                    return null;
                }
            }
            if (i == 0) {
            }
            if (zg5Var.A) {
            }
            return null;
        } catch (qy4 unused) {
            vy4 vy4Var3 = (vy4) j.A;
            if (vy4Var3 != null) {
                return vy4Var3;
            }
            return vy4Var;
        }
        kn1Var = new s41(s41Var);
        Object obj22 = kn1Var.Z;
        Object obj32 = x61.COROUTINE_SUSPENDED;
        i = kn1Var.d0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [ch5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [eo2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [mn1, d20] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x013c -> B:21:0x008e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x015f -> B:62:0x0165). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(mw6 mw6Var, long j, y36 y36Var, d20 d20Var) {
        mn1 mn1Var;
        int i;
        mw6 mw6Var2;
        float f;
        kk kkVar;
        y36 y36Var2;
        ch5 ch5Var;
        mw6 mw6Var3;
        eo2 eo2Var;
        ch5 ch5Var2;
        int size;
        vy4 vy4Var;
        int i2;
        Object obj;
        vy4 vy4Var2;
        int i3;
        long j2;
        ch5 ch5Var3;
        Object obj2;
        Object c;
        if (d20Var instanceof mn1) {
            mn1 mn1Var2 = (mn1) d20Var;
            int i4 = mn1Var2.g0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mn1Var2.g0 = i4 - Integer.MIN_VALUE;
                mn1Var = mn1Var2;
                Object obj3 = mn1Var.f0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = mn1Var.g0;
                int i5 = 1;
                vy4 vy4Var3 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            float f2 = mn1Var.e0;
                            vy4 vy4Var4 = mn1Var.d0;
                            kk kkVar2 = mn1Var.Z;
                            ch5 ch5Var4 = mn1Var.Y;
                            mw6 mw6Var4 = mn1Var.X;
                            ?? r13 = mn1Var.R;
                            oi2.Y(obj3);
                            ch5Var2 = ch5Var4;
                            mw6Var3 = mw6Var4;
                            char c2 = 2;
                            i3 = 1;
                            vy4Var = null;
                            long j3 = 0;
                            float f3 = f2;
                            y36 y36Var3 = r13;
                            if (!vy4Var4.c()) {
                                return vy4Var;
                            }
                            vy4Var3 = vy4Var;
                            i5 = i3;
                            kkVar = kkVar2;
                            f = f3;
                            mw6Var2 = mw6Var3;
                            ch5Var3 = ch5Var2;
                            y36Var2 = y36Var3;
                            mn1Var.R = y36Var2;
                            mn1Var.X = mw6Var2;
                            mn1Var.Y = ch5Var3;
                            mn1Var.Z = kkVar;
                            mn1Var.d0 = vy4Var3;
                            mn1Var.e0 = f;
                            mn1Var.g0 = i5;
                            c = mw6Var2.c(py4.Main, mn1Var);
                            if (c != x61Var) {
                                ch5Var = ch5Var3;
                                mw6Var3 = mw6Var2;
                                obj3 = c;
                                eo2Var = y36Var2;
                                ch5Var2 = ch5Var;
                                oy4 oy4Var = (oy4) obj3;
                                List list = oy4Var.a;
                                size = list.size();
                                vy4Var = vy4Var3;
                                i2 = 0;
                                while (true) {
                                    if (i2 >= size) {
                                        obj = list.get(i2);
                                        if (nj2.o(((vy4) obj).a, ch5Var2.A)) {
                                            break;
                                        }
                                        i2++;
                                    } else {
                                        obj = vy4Var;
                                        break;
                                    }
                                }
                                vy4Var2 = (vy4) obj;
                                if (vy4Var2 != null && !vy4Var2.c()) {
                                    if (!ej2.p(vy4Var2)) {
                                        List list2 = oy4Var.a;
                                        int size2 = list2.size();
                                        int i6 = 0;
                                        while (true) {
                                            if (i6 < size2) {
                                                obj2 = list2.get(i6);
                                                if (((vy4) obj2).d) {
                                                    break;
                                                }
                                                i6++;
                                            } else {
                                                obj2 = vy4Var;
                                                break;
                                            }
                                        }
                                        vy4 vy4Var5 = (vy4) obj2;
                                        if (vy4Var5 != null) {
                                            ch5Var2.A = vy4Var5.a;
                                            i3 = 1;
                                            j2 = 0;
                                        } else {
                                            return vy4Var;
                                        }
                                    } else {
                                        i3 = 1;
                                        long e = kkVar.e(f, ej2.R(vy4Var2, true), true);
                                        if ((9223372034707292159L & e) != 9205357640488583168L) {
                                            eo2Var.o(vy4Var2, new jk4(e));
                                            if (vy4Var2.c()) {
                                                return vy4Var2;
                                            }
                                            j2 = 0;
                                            kkVar.B = 0L;
                                        } else {
                                            j3 = 0;
                                            py4 py4Var = py4.Final;
                                            mn1Var.R = eo2Var;
                                            mn1Var.X = mw6Var3;
                                            mn1Var.Y = ch5Var2;
                                            mn1Var.Z = kkVar;
                                            mn1Var.d0 = vy4Var2;
                                            mn1Var.e0 = f;
                                            c2 = 2;
                                            mn1Var.g0 = 2;
                                            if (mw6Var3.c(py4Var, mn1Var) != x61Var) {
                                                float f4 = f;
                                                kkVar2 = kkVar;
                                                vy4Var4 = vy4Var2;
                                                f3 = f4;
                                                y36Var3 = eo2Var;
                                                if (!vy4Var4.c()) {
                                                }
                                            }
                                        }
                                    }
                                    vy4Var3 = vy4Var;
                                    i5 = i3;
                                    mw6Var2 = mw6Var3;
                                    ch5Var3 = ch5Var2;
                                    y36Var2 = eo2Var;
                                    mn1Var.R = y36Var2;
                                    mn1Var.X = mw6Var2;
                                    mn1Var.Y = ch5Var3;
                                    mn1Var.Z = kkVar;
                                    mn1Var.d0 = vy4Var3;
                                    mn1Var.e0 = f;
                                    mn1Var.g0 = i5;
                                    c = mw6Var2.c(py4.Main, mn1Var);
                                    if (c != x61Var) {
                                    }
                                } else {
                                    return vy4Var;
                                }
                            }
                            return x61Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    float f5 = mn1Var.e0;
                    kkVar = mn1Var.Z;
                    ch5 ch5Var5 = mn1Var.Y;
                    mw6Var3 = mn1Var.X;
                    eo2 eo2Var2 = mn1Var.R;
                    oi2.Y(obj3);
                    ch5Var = ch5Var5;
                    f = f5;
                    eo2Var = eo2Var2;
                    ch5Var2 = ch5Var;
                    oy4 oy4Var2 = (oy4) obj3;
                    List list3 = oy4Var2.a;
                    size = list3.size();
                    vy4Var = vy4Var3;
                    i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                        }
                        i2++;
                    }
                    vy4Var2 = (vy4) obj;
                    if (vy4Var2 != null) {
                        if (!ej2.p(vy4Var2)) {
                        }
                        vy4Var3 = vy4Var;
                        i5 = i3;
                        mw6Var2 = mw6Var3;
                        ch5Var3 = ch5Var2;
                        y36Var2 = eo2Var;
                        mn1Var.R = y36Var2;
                        mn1Var.X = mw6Var2;
                        mn1Var.Y = ch5Var3;
                        mn1Var.Z = kkVar;
                        mn1Var.d0 = vy4Var3;
                        mn1Var.e0 = f;
                        mn1Var.g0 = i5;
                        c = mw6Var2.c(py4.Main, mn1Var);
                        if (c != x61Var) {
                        }
                        return x61Var;
                    }
                    return vy4Var;
                }
                oi2.Y(obj3);
                mw6Var2 = mw6Var;
                if (f(mw6Var2.Y.p0, j)) {
                    return null;
                }
                f = mw6Var2.f().f();
                ?? obj4 = new Object();
                obj4.A = j;
                kkVar = new kk(0L, null);
                y36Var2 = y36Var;
                ch5Var3 = obj4;
                mn1Var.R = y36Var2;
                mn1Var.X = mw6Var2;
                mn1Var.Y = ch5Var3;
                mn1Var.Z = kkVar;
                mn1Var.d0 = vy4Var3;
                mn1Var.e0 = f;
                mn1Var.g0 = i5;
                c = mw6Var2.c(py4.Main, mn1Var);
                if (c != x61Var) {
                }
                return x61Var;
            }
        }
        mn1Var = new s41(d20Var);
        Object obj32 = mn1Var.f0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = mn1Var.g0;
        int i52 = 1;
        vy4 vy4Var32 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a3, code lost:
        if (r2 == r4) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v1, types: [ch5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [eo2] */
    /* JADX WARN: Type inference failed for: r3v2, types: [nn1, d20] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0144 -> B:20:0x008f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0165 -> B:60:0x016c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(mw6 mw6Var, long j, int i, z5 z5Var, d20 d20Var) {
        nn1 nn1Var;
        int i2;
        mw6 mw6Var2;
        float g;
        kk kkVar;
        z5 z5Var2;
        ch5 ch5Var;
        eo2 eo2Var;
        vy4 vy4Var;
        Object obj;
        int i3;
        long j2;
        char c;
        kk kkVar2;
        vy4 vy4Var2;
        ch5 ch5Var2;
        mw6 mw6Var3;
        long j3;
        Object obj2;
        ch5 ch5Var3;
        z5 z5Var3;
        if (d20Var instanceof nn1) {
            nn1 nn1Var2 = (nn1) d20Var;
            int i4 = nn1Var2.g0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                nn1Var2.g0 = i4 - Integer.MIN_VALUE;
                nn1Var = nn1Var2;
                Object obj3 = nn1Var.f0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = nn1Var.g0;
                int i5 = 1;
                vy4 vy4Var3 = null;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            float f = nn1Var.e0;
                            vy4Var2 = nn1Var.d0;
                            kkVar2 = nn1Var.Z;
                            ch5 ch5Var4 = nn1Var.Y;
                            mw6Var3 = nn1Var.X;
                            ?? r13 = nn1Var.R;
                            oi2.Y(obj3);
                            c = 2;
                            i3 = 1;
                            vy4Var = null;
                            j2 = 0;
                            ch5Var2 = ch5Var4;
                            g = f;
                            z5Var3 = r13;
                            if (!vy4Var2.c()) {
                                return vy4Var;
                            }
                            vy4Var3 = vy4Var;
                            i5 = i3;
                            kkVar = kkVar2;
                            mw6Var2 = mw6Var3;
                            ch5Var3 = ch5Var2;
                            z5Var2 = z5Var3;
                            nn1Var.R = z5Var2;
                            nn1Var.X = mw6Var2;
                            nn1Var.Y = ch5Var3;
                            nn1Var.Z = kkVar;
                            nn1Var.d0 = vy4Var3;
                            nn1Var.e0 = g;
                            nn1Var.g0 = i5;
                            obj3 = mw6Var2.c(py4.Main, nn1Var);
                            eo2Var = z5Var2;
                            ch5Var = ch5Var3;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        float f2 = nn1Var.e0;
                        kkVar = nn1Var.Z;
                        ch5 ch5Var5 = nn1Var.Y;
                        mw6 mw6Var4 = nn1Var.X;
                        eo2 eo2Var2 = nn1Var.R;
                        oi2.Y(obj3);
                        g = f2;
                        eo2Var = eo2Var2;
                        ch5Var = ch5Var5;
                        mw6Var2 = mw6Var4;
                        oy4 oy4Var = (oy4) obj3;
                        List list = oy4Var.a;
                        int size = list.size();
                        vy4Var = vy4Var3;
                        int i6 = 0;
                        while (true) {
                            if (i6 < size) {
                                obj = list.get(i6);
                                if (nj2.o(((vy4) obj).a, ch5Var.A)) {
                                    break;
                                }
                                i6++;
                            } else {
                                obj = vy4Var;
                                break;
                            }
                        }
                        vy4 vy4Var4 = (vy4) obj;
                        if (vy4Var4 != null && !vy4Var4.c()) {
                            if (ej2.p(vy4Var4)) {
                                List list2 = oy4Var.a;
                                int size2 = list2.size();
                                int i7 = 0;
                                while (true) {
                                    if (i7 < size2) {
                                        obj2 = list2.get(i7);
                                        if (((vy4) obj2).d) {
                                            break;
                                        }
                                        i7++;
                                    } else {
                                        obj2 = vy4Var;
                                        break;
                                    }
                                }
                                vy4 vy4Var5 = (vy4) obj2;
                                if (vy4Var5 != null) {
                                    ch5Var.A = vy4Var5.a;
                                    i3 = 1;
                                    j3 = 0;
                                } else {
                                    return vy4Var;
                                }
                            } else {
                                i3 = 1;
                                long e = kkVar.e(g, ej2.R(vy4Var4, true), true);
                                if ((9223372034707292159L & e) != 9205357640488583168L) {
                                    eo2Var.o(vy4Var4, new Float(Float.intBitsToFloat((int) (e & 4294967295L))));
                                    if (vy4Var4.c()) {
                                        return vy4Var4;
                                    }
                                    j3 = 0;
                                    kkVar.B = 0L;
                                } else {
                                    j2 = 0;
                                    py4 py4Var = py4.Final;
                                    nn1Var.R = eo2Var;
                                    nn1Var.X = mw6Var2;
                                    nn1Var.Y = ch5Var;
                                    nn1Var.Z = kkVar;
                                    nn1Var.d0 = vy4Var4;
                                    nn1Var.e0 = g;
                                    c = 2;
                                    nn1Var.g0 = 2;
                                    if (mw6Var2.c(py4Var, nn1Var) != x61Var) {
                                        mw6 mw6Var5 = mw6Var2;
                                        kkVar2 = kkVar;
                                        vy4Var2 = vy4Var4;
                                        ch5Var2 = ch5Var;
                                        mw6Var3 = mw6Var5;
                                        z5Var3 = eo2Var;
                                        if (!vy4Var2.c()) {
                                        }
                                    }
                                    return x61Var;
                                }
                            }
                            vy4Var3 = vy4Var;
                            i5 = i3;
                            z5Var2 = eo2Var;
                            ch5Var3 = ch5Var;
                            nn1Var.R = z5Var2;
                            nn1Var.X = mw6Var2;
                            nn1Var.Y = ch5Var3;
                            nn1Var.Z = kkVar;
                            nn1Var.d0 = vy4Var3;
                            nn1Var.e0 = g;
                            nn1Var.g0 = i5;
                            obj3 = mw6Var2.c(py4.Main, nn1Var);
                            eo2Var = z5Var2;
                            ch5Var = ch5Var3;
                        } else {
                            return vy4Var;
                        }
                    }
                } else {
                    oi2.Y(obj3);
                    lo4 lo4Var = lo4.Vertical;
                    mw6Var2 = mw6Var;
                    if (f(mw6Var2.Y.p0, j)) {
                        return null;
                    }
                    g = g(mw6Var2.f(), i);
                    ?? obj4 = new Object();
                    obj4.A = j;
                    kkVar = new kk(0L, lo4Var);
                    z5Var2 = z5Var;
                    ch5Var3 = obj4;
                    nn1Var.R = z5Var2;
                    nn1Var.X = mw6Var2;
                    nn1Var.Y = ch5Var3;
                    nn1Var.Z = kkVar;
                    nn1Var.d0 = vy4Var3;
                    nn1Var.e0 = g;
                    nn1Var.g0 = i5;
                    obj3 = mw6Var2.c(py4.Main, nn1Var);
                    eo2Var = z5Var2;
                    ch5Var = ch5Var3;
                }
            }
        }
        nn1Var = new s41(d20Var);
        Object obj32 = nn1Var.f0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = nn1Var.g0;
        int i52 = 1;
        vy4 vy4Var32 = null;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(mw6 mw6Var, long j, qn2 qn2Var, s41 s41Var) {
        pn1 pn1Var;
        int i;
        vy4 vy4Var;
        if (s41Var instanceof pn1) {
            pn1 pn1Var2 = (pn1) s41Var;
            int i2 = pn1Var2.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pn1Var2.Z = i2 - Integer.MIN_VALUE;
                pn1Var = pn1Var2;
                Object obj = pn1Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = pn1Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        qn2 qn2Var2 = pn1Var.X;
                        mw6 mw6Var2 = pn1Var.R;
                        oi2.Y(obj);
                        qn2Var = qn2Var2;
                        mw6Var = mw6Var2;
                        vy4Var = (vy4) obj;
                        if (vy4Var == null) {
                            if (ej2.p(vy4Var)) {
                                return Boolean.TRUE;
                            }
                            qn2Var.g(vy4Var);
                            j = vy4Var.a;
                            pn1Var.R = mw6Var;
                            pn1Var.X = qn2Var;
                            pn1Var.Z = 1;
                            obj = a(mw6Var, j, pn1Var);
                            if (obj == x61Var) {
                                return x61Var;
                            }
                            vy4Var = (vy4) obj;
                            if (vy4Var == null) {
                                return Boolean.FALSE;
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    pn1Var.R = mw6Var;
                    pn1Var.X = qn2Var;
                    pn1Var.Z = 1;
                    obj = a(mw6Var, j, pn1Var);
                    if (obj == x61Var) {
                    }
                    vy4Var = (vy4) obj;
                    if (vy4Var == null) {
                    }
                }
            }
        }
        pn1Var = new s41(s41Var);
        Object obj2 = pn1Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = pn1Var.Z;
        if (i == 0) {
        }
    }

    public static final boolean f(oy4 oy4Var, long j) {
        Object obj;
        List list = oy4Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                obj = list.get(i);
                if (nj2.o(((vy4) obj).a, j)) {
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        vy4 vy4Var = (vy4) obj;
        if (vy4Var != null && vy4Var.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float g(fo7 fo7Var, int i) {
        if (i == 2) {
            return fo7Var.f() * a;
        }
        return fo7Var.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x05c9, code lost:
        if (f(r10.Y.p0, r0) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0670, code lost:
        if (defpackage.jk4.d(defpackage.ej2.R(r5, true)) == androidx.recyclerview.widget.RecyclerView.B1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:197:0x0664, B:186:0x063f], limit reached: 224 */
    /* JADX WARN: Removed duplicated region for block: B:107:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x062d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0413 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x059a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ef  */
    /* JADX WARN: Type inference failed for: r10v26, types: [on2] */
    /* JADX WARN: Type inference failed for: r10v43, types: [qn2] */
    /* JADX WARN: Type inference failed for: r10v6, types: [on2] */
    /* JADX WARN: Type inference failed for: r11v0, types: [ch5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14, types: [on2] */
    /* JADX WARN: Type inference failed for: r12v2, types: [fo2] */
    /* JADX WARN: Type inference failed for: r12v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v42, types: [on2] */
    /* JADX WARN: Type inference failed for: r14v17, types: [fo2] */
    /* JADX WARN: Type inference failed for: r15v15, types: [ch5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r22v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [d20, qn1] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r3v41, types: [ch5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [qn2] */
    /* JADX WARN: Type inference failed for: r5v25, types: [fo2] */
    /* JADX WARN: Type inference failed for: r5v4, types: [on2] */
    /* JADX WARN: Type inference failed for: r6v30, types: [qn2] */
    /* JADX WARN: Type inference failed for: r7v3, types: [fo2] */
    /* JADX WARN: Type inference failed for: r7v30, types: [on2] */
    /* JADX WARN: Type inference failed for: r7v54, types: [qn2] */
    /* JADX WARN: Type inference failed for: r8v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v58, types: [on2] */
    /* JADX WARN: Type inference failed for: r9v25, types: [ch5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v34, types: [qn2] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x040a -> B:91:0x03be). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:115:0x0445 -> B:164:0x05a2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x044f -> B:117:0x0464). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x0544 -> B:117:0x0464). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:158:0x057f -> B:159:0x0585). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:163:0x059a -> B:164:0x05a2). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:172:0x05fe -> B:174:0x0601). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0235 -> B:31:0x0236). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x02ca -> B:31:0x0236). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x0321 -> B:77:0x0389). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0333 -> B:33:0x0252). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0375 -> B:74:0x037e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(mw6 mw6Var, vy4 vy4Var, c5 c5Var, ov4 ov4Var, z5 z5Var, dz3 dz3Var, k0 k0Var, d20 d20Var) {
        qn1 qn1Var;
        long j;
        long j2;
        ov4 ov4Var2;
        eo2 eo2Var;
        dz3 dz3Var2;
        mw6 mw6Var2;
        boolean z;
        vy4 vy4Var2;
        lo4 lo4Var;
        ao2 ao2Var;
        vy4 vy4Var3;
        x61 x61Var;
        float f;
        vy4 vy4Var4;
        ao2 ao2Var2;
        mw6 mw6Var3;
        kk kkVar;
        ch5 ch5Var;
        dz3 dz3Var3;
        ch5 ch5Var2;
        ov4 ov4Var3;
        mw6 mw6Var4;
        x61 x61Var2;
        int size;
        mw6 mw6Var5;
        int i;
        ao2 ao2Var3;
        eo2 eo2Var2;
        dz3 dz3Var4;
        vy4 vy4Var5;
        ao2 ao2Var4;
        ?? r22;
        vy4 vy4Var6;
        dz3 dz3Var5;
        ch5 ch5Var3;
        mw6 mw6Var6;
        ch5 ch5Var4;
        kk kkVar2;
        lo4 lo4Var2;
        vy4 vy4Var7;
        dz3 dz3Var6;
        vy4 vy4Var8;
        ch5 ch5Var5;
        ch5 ch5Var6;
        Object obj;
        dz3 dz3Var7;
        ch5 ch5Var7;
        int i2;
        ov4 ov4Var4;
        Object c;
        long j3;
        ov4 ov4Var5;
        ov4 ov4Var6;
        ov4 ov4Var7;
        ch5 ch5Var8;
        vy4 vy4Var9;
        vy4 vy4Var10;
        eo2 eo2Var3;
        fo2 fo2Var;
        lo4 lo4Var3;
        mw6 mw6Var7;
        kk kkVar3;
        dz3 dz3Var8;
        dz3 dz3Var9;
        k0 k0Var2;
        qn1 qn1Var2;
        int size2;
        int i3;
        int size3;
        int i4;
        fo2 fo2Var2;
        float g;
        mw6 mw6Var8;
        ch5 ch5Var9;
        fo2 fo2Var3;
        long j4;
        dz3 dz3Var10;
        qn1 qn1Var3;
        vy4 vy4Var11;
        k0 k0Var3;
        vy4 vy4Var12;
        k0 k0Var4;
        qn1 qn1Var4;
        vy4 vy4Var13;
        fo2 fo2Var4;
        qn1 qn1Var5;
        k0 k0Var5;
        qn1 qn1Var6;
        vy4 vy4Var14;
        int i5;
        List list;
        int i6;
        ch5 ch5Var10;
        Object c2;
        ch5 ch5Var11;
        k0 k0Var6;
        qn1 qn1Var7;
        dz3 dz3Var11;
        qn1 qn1Var8;
        dz3 dz3Var12;
        vy4 vy4Var15;
        dz3 dz3Var13;
        mw6 mw6Var9;
        mw6 mw6Var10;
        vy4 vy4Var16;
        Object obj2;
        List list2;
        if (d20Var instanceof qn1) {
            qn1 qn1Var9 = (qn1) d20Var;
            int i7 = qn1Var9.o0;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                qn1Var9.o0 = i7 - Integer.MIN_VALUE;
                qn1Var = qn1Var9;
                Object obj3 = qn1Var.n0;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                switch (qn1Var.o0) {
                    case 0:
                        j = 9205357640488583168L;
                        j2 = 9223372034707292159L;
                        oi2.Y(obj3);
                        c5Var.getClass();
                        boolean booleanValue = Boolean.TRUE.booleanValue();
                        if (!booleanValue) {
                            vy4Var.a();
                        }
                        qn1Var.R = mw6Var;
                        qn1Var.X = vy4Var;
                        qn1Var.Y = null;
                        ov4Var2 = ov4Var;
                        qn1Var.Z = ov4Var2;
                        eo2Var = z5Var;
                        qn1Var.d0 = eo2Var;
                        dz3Var2 = dz3Var;
                        qn1Var.e0 = dz3Var2;
                        ao2 ao2Var5 = k0Var;
                        qn1Var.f0 = ao2Var5;
                        qn1Var.l0 = booleanValue;
                        qn1Var.o0 = 1;
                        Object b = hz6.b(mw6Var, qn1Var, 2);
                        if (b != x61Var3) {
                            mw6Var2 = mw6Var;
                            z = booleanValue;
                            obj3 = b;
                            vy4Var2 = vy4Var;
                            lo4Var = null;
                            ao2Var = ao2Var5;
                            vy4Var3 = (vy4) obj3;
                            ?? obj4 = new Object();
                            obj4.A = 0L;
                            ov4 ov4Var8 = ov4Var2;
                            dz3 dz3Var14 = dz3Var2;
                            ch5 ch5Var12 = obj4;
                            if (!z) {
                                x61Var = x61Var3;
                                qn1Var2 = qn1Var;
                                fo2Var3 = ov4Var2;
                                dz3Var9 = dz3Var2;
                                ch5Var9 = obj4;
                                if (vy4Var2 == null) {
                                    List list3 = mw6Var2.Y.p0.a;
                                    int size4 = list3.size();
                                    for (int i8 = 0; i8 < size4; i8++) {
                                        if (((vy4) list3.get(i8)).d) {
                                            k0 k0Var7 = ao2Var;
                                            eo2Var3 = eo2Var;
                                            k0Var2 = k0Var7;
                                            ch5Var8 = ch5Var9;
                                            mw6Var7 = mw6Var2;
                                            lo4Var3 = lo4Var;
                                            vy4Var9 = vy4Var2;
                                            fo2Var = fo2Var3;
                                            vy4Var10 = vy4Var3;
                                            py4 py4Var = py4.Final;
                                            qn1Var2.R = mw6Var7;
                                            qn1Var2.X = lo4Var3;
                                            qn1Var2.Y = fo2Var;
                                            qn1Var2.Z = eo2Var3;
                                            qn1Var2.d0 = dz3Var9;
                                            qn1Var2.e0 = k0Var2;
                                            qn1Var2.f0 = vy4Var10;
                                            qn1Var2.g0 = vy4Var9;
                                            qn1Var2.h0 = ch5Var8;
                                            qn1Var2.i0 = null;
                                            qn1Var2.j0 = null;
                                            qn1Var2.k0 = null;
                                            qn1Var2.o0 = 4;
                                            obj3 = mw6Var7.c(py4Var, qn1Var2);
                                            qn1Var2 = qn1Var2;
                                            k0Var2 = k0Var2;
                                            dz3Var9 = dz3Var9;
                                            if (obj3 == x61Var) {
                                                return x61Var;
                                            }
                                            List list4 = ((oy4) obj3).a;
                                            size2 = list4.size();
                                            i3 = 0;
                                            while (true) {
                                                if (i3 < size2) {
                                                    if (((vy4) list4.get(i3)).c()) {
                                                        int size5 = list4.size();
                                                        for (int i9 = 0; i9 < size5; i9++) {
                                                            if (!((vy4) list4.get(i9)).d) {
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            }
                                            size3 = list4.size();
                                            i4 = 0;
                                            while (true) {
                                                if (i4 >= size3) {
                                                    eo2 eo2Var4 = eo2Var3;
                                                    ao2Var = k0Var2;
                                                    eo2Var = eo2Var4;
                                                    vy4Var3 = vy4Var10;
                                                    fo2Var2 = fo2Var;
                                                    vy4Var2 = vy4Var9;
                                                    lo4Var = lo4Var3;
                                                    mw6Var2 = mw6Var7;
                                                    qn1Var3 = qn1Var2;
                                                    dz3Var10 = dz3Var9;
                                                } else if (((vy4) list4.get(i4)).d) {
                                                    vy4 vy4Var17 = (vy4) gt0.J0(list4);
                                                    long e = jk4.e(vy4Var17 != null ? vy4Var17.c : 0L, vy4Var10.c);
                                                    long j5 = vy4Var10.a;
                                                    int i10 = vy4Var10.i;
                                                    if (!f(mw6Var7.Y.p0, j5)) {
                                                        g = g(mw6Var7.f(), i10);
                                                        ?? obj5 = new Object();
                                                        obj5.A = j5;
                                                        kkVar3 = new kk(e, lo4Var3);
                                                        mw6Var8 = mw6Var7;
                                                        qn1Var6 = qn1Var2;
                                                        k0Var5 = k0Var2;
                                                        dz3Var8 = dz3Var9;
                                                        ch5Var10 = obj5;
                                                        break;
                                                    } else {
                                                        eo2 eo2Var5 = eo2Var3;
                                                        ao2Var = k0Var2;
                                                        eo2Var = eo2Var5;
                                                        vy4Var3 = vy4Var10;
                                                        fo2Var2 = fo2Var;
                                                        lo4Var = lo4Var3;
                                                        mw6Var2 = mw6Var7;
                                                        vy4Var2 = null;
                                                        qn1Var3 = qn1Var2;
                                                        dz3Var10 = dz3Var9;
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                            ch5Var9 = ch5Var8;
                                            qn1Var2 = qn1Var3;
                                            fo2Var3 = fo2Var2;
                                            dz3Var9 = dz3Var10;
                                            if (vy4Var2 == null) {
                                            }
                                        }
                                    }
                                }
                                if (vy4Var2 != null) {
                                    fo2Var3.e(vy4Var3, vy4Var2, new jk4(ch5Var9.A));
                                    eo2Var.o(vy4Var2, new jk4(ch5Var9.A));
                                    j4 = vy4Var2.a;
                                    dz3Var13 = dz3Var9;
                                    qn1Var8 = qn1Var2;
                                    dz3Var11 = dz3Var9;
                                    break;
                                }
                                return jg7.a;
                            }
                            j3 = vy4Var3.a;
                            int i11 = vy4Var3.i;
                            if (f(mw6Var2.Y.p0, j3)) {
                                x61Var = x61Var3;
                                ov4Var6 = ov4Var8;
                                dz3Var7 = dz3Var14;
                                ch5Var7 = ch5Var12;
                                vy4Var8 = null;
                                ov4Var5 = ov4Var6;
                                dz3Var6 = dz3Var7;
                                ao2Var = ao2Var;
                                ch5Var5 = ch5Var7;
                                if (vy4Var8 == null && !vy4Var8.c()) {
                                    x61Var3 = x61Var;
                                    ov4Var8 = ov4Var5;
                                    dz3Var14 = dz3Var6;
                                    ch5Var12 = ch5Var5;
                                    j3 = vy4Var3.a;
                                    int i112 = vy4Var3.i;
                                    if (f(mw6Var2.Y.p0, j3)) {
                                        f = g(mw6Var2.f(), i112);
                                        ?? obj6 = new Object();
                                        obj6.A = j3;
                                        kkVar2 = new kk(0L, lo4Var);
                                        ch5Var4 = ch5Var12;
                                        mw6Var6 = mw6Var2;
                                        ov4Var4 = ov4Var8;
                                        dz3Var3 = dz3Var14;
                                        ch5Var6 = obj6;
                                        qn1Var.R = mw6Var6;
                                        qn1Var.X = lo4Var;
                                        qn1Var.Y = ov4Var4;
                                        qn1Var.Z = eo2Var;
                                        qn1Var.d0 = dz3Var3;
                                        qn1Var.e0 = ao2Var;
                                        qn1Var.f0 = vy4Var3;
                                        qn1Var.g0 = ch5Var4;
                                        qn1Var.h0 = mw6Var2;
                                        qn1Var.i0 = ch5Var6;
                                        qn1Var.j0 = kkVar2;
                                        qn1Var.k0 = null;
                                        qn1Var.m0 = f;
                                        qn1Var.o0 = 2;
                                        c = mw6Var2.c(py4.Main, qn1Var);
                                        if (c != x61Var3) {
                                            ao2 ao2Var6 = ao2Var;
                                            vy4Var4 = vy4Var3;
                                            obj3 = c;
                                            kkVar = kkVar2;
                                            ch5Var = ch5Var4;
                                            mw6Var4 = mw6Var6;
                                            mw6Var3 = mw6Var2;
                                            ch5Var2 = ch5Var6;
                                            ao2Var2 = ao2Var6;
                                            ov4Var3 = ov4Var4;
                                            oy4 oy4Var = (oy4) obj3;
                                            List list5 = oy4Var.a;
                                            x61Var2 = x61Var3;
                                            size = list5.size();
                                            mw6Var5 = mw6Var3;
                                            i = 0;
                                            ao2Var3 = ao2Var2;
                                            while (true) {
                                                if (i >= size) {
                                                    r22 = list5.get(i);
                                                    i2 = size;
                                                    vy4Var5 = vy4Var4;
                                                    ao2Var4 = ao2Var3;
                                                    eo2Var2 = eo2Var;
                                                    dz3Var4 = dz3Var3;
                                                    if (!nj2.o(((vy4) r22).a, ch5Var2.A)) {
                                                        i++;
                                                        vy4Var4 = vy4Var5;
                                                        ao2Var3 = ao2Var4;
                                                        dz3Var3 = dz3Var4;
                                                        eo2Var = eo2Var2;
                                                        size = i2;
                                                    }
                                                } else {
                                                    eo2Var2 = eo2Var;
                                                    dz3Var4 = dz3Var3;
                                                    vy4Var5 = vy4Var4;
                                                    ao2Var4 = ao2Var3;
                                                    r22 = 0;
                                                }
                                            }
                                            vy4Var6 = r22;
                                            if (vy4Var6 != null && !vy4Var6.c()) {
                                                if (!ej2.p(vy4Var6)) {
                                                    List list6 = oy4Var.a;
                                                    int size6 = list6.size();
                                                    int i12 = 0;
                                                    while (true) {
                                                        if (i12 < size6) {
                                                            obj = list6.get(i12);
                                                            if (!((vy4) obj).d) {
                                                                i12++;
                                                            }
                                                        } else {
                                                            obj = null;
                                                        }
                                                    }
                                                    vy4 vy4Var18 = (vy4) obj;
                                                    if (vy4Var18 != null) {
                                                        ch5Var2.A = vy4Var18.a;
                                                    }
                                                } else {
                                                    long e2 = kkVar.e(f, ej2.R(vy4Var6, true), true);
                                                    if ((e2 & j2) != j) {
                                                        vy4Var6.a();
                                                        ch5Var.A = e2;
                                                        if (!vy4Var6.c()) {
                                                            kkVar.B = 0L;
                                                        } else {
                                                            vy4Var3 = vy4Var5;
                                                            ao2Var = ao2Var4;
                                                            dz3Var6 = dz3Var4;
                                                            vy4Var8 = vy4Var6;
                                                            mw6Var2 = mw6Var4;
                                                            ch5Var5 = ch5Var;
                                                            x61Var = x61Var2;
                                                            eo2Var = eo2Var2;
                                                            ov4Var5 = ov4Var3;
                                                            if (vy4Var8 == null) {
                                                            }
                                                            vy4Var2 = vy4Var8;
                                                            qn1Var2 = qn1Var;
                                                            fo2Var3 = ov4Var5;
                                                            dz3Var9 = dz3Var6;
                                                            ch5Var9 = ch5Var5;
                                                            if (vy4Var2 == null) {
                                                            }
                                                            if (vy4Var2 != null) {
                                                            }
                                                            return jg7.a;
                                                        }
                                                    } else {
                                                        py4 py4Var2 = py4.Final;
                                                        qn1Var.R = mw6Var4;
                                                        qn1Var.X = lo4Var;
                                                        qn1Var.Y = ov4Var3;
                                                        qn1Var.Z = eo2Var2;
                                                        dz3Var5 = dz3Var4;
                                                        qn1Var.d0 = dz3Var5;
                                                        ao2Var = ao2Var4;
                                                        qn1Var.e0 = ao2Var;
                                                        vy4 vy4Var19 = vy4Var5;
                                                        qn1Var.f0 = vy4Var19;
                                                        qn1Var.g0 = ch5Var;
                                                        qn1Var.h0 = mw6Var5;
                                                        qn1Var.i0 = ch5Var2;
                                                        qn1Var.j0 = kkVar;
                                                        qn1Var.k0 = vy4Var6;
                                                        qn1Var.m0 = f;
                                                        qn1Var.o0 = 3;
                                                        x61Var = x61Var2;
                                                        if (mw6Var5.c(py4Var2, qn1Var) == x61Var) {
                                                            return x61Var;
                                                        }
                                                        vy4Var3 = vy4Var19;
                                                        ch5Var3 = ch5Var2;
                                                        mw6Var2 = mw6Var5;
                                                        mw6Var6 = mw6Var4;
                                                        ch5Var4 = ch5Var;
                                                        kkVar2 = kkVar;
                                                        lo4Var2 = lo4Var;
                                                        vy4Var7 = vy4Var6;
                                                        eo2Var = eo2Var2;
                                                        ov4Var7 = ov4Var3;
                                                        if (vy4Var7.c()) {
                                                            x61Var3 = x61Var;
                                                            lo4Var = lo4Var2;
                                                            ov4Var4 = ov4Var7;
                                                            dz3Var3 = dz3Var5;
                                                            ch5Var6 = ch5Var3;
                                                            qn1Var.R = mw6Var6;
                                                            qn1Var.X = lo4Var;
                                                            qn1Var.Y = ov4Var4;
                                                            qn1Var.Z = eo2Var;
                                                            qn1Var.d0 = dz3Var3;
                                                            qn1Var.e0 = ao2Var;
                                                            qn1Var.f0 = vy4Var3;
                                                            qn1Var.g0 = ch5Var4;
                                                            qn1Var.h0 = mw6Var2;
                                                            qn1Var.i0 = ch5Var6;
                                                            qn1Var.j0 = kkVar2;
                                                            qn1Var.k0 = null;
                                                            qn1Var.m0 = f;
                                                            qn1Var.o0 = 2;
                                                            c = mw6Var2.c(py4.Main, qn1Var);
                                                            if (c != x61Var3) {
                                                            }
                                                        } else {
                                                            mw6Var2 = mw6Var6;
                                                            ch5Var7 = ch5Var4;
                                                            lo4Var = lo4Var2;
                                                            ov4Var6 = ov4Var7;
                                                            dz3Var7 = dz3Var5;
                                                            vy4Var8 = null;
                                                            ov4Var5 = ov4Var6;
                                                            dz3Var6 = dz3Var7;
                                                            ao2Var = ao2Var;
                                                            ch5Var5 = ch5Var7;
                                                            if (vy4Var8 == null) {
                                                            }
                                                            vy4Var2 = vy4Var8;
                                                            qn1Var2 = qn1Var;
                                                            fo2Var3 = ov4Var5;
                                                            dz3Var9 = dz3Var6;
                                                            ch5Var9 = ch5Var5;
                                                            if (vy4Var2 == null) {
                                                            }
                                                            if (vy4Var2 != null) {
                                                            }
                                                            return jg7.a;
                                                        }
                                                    }
                                                }
                                                vy4Var3 = vy4Var5;
                                                ao2Var = ao2Var4;
                                                dz3Var3 = dz3Var4;
                                                eo2Var = eo2Var2;
                                                ch5Var6 = ch5Var2;
                                                mw6Var6 = mw6Var4;
                                                ch5Var4 = ch5Var;
                                                kkVar2 = kkVar;
                                                x61Var3 = x61Var2;
                                                mw6Var2 = mw6Var5;
                                                ov4Var4 = ov4Var3;
                                                qn1Var.R = mw6Var6;
                                                qn1Var.X = lo4Var;
                                                qn1Var.Y = ov4Var4;
                                                qn1Var.Z = eo2Var;
                                                qn1Var.d0 = dz3Var3;
                                                qn1Var.e0 = ao2Var;
                                                qn1Var.f0 = vy4Var3;
                                                qn1Var.g0 = ch5Var4;
                                                qn1Var.h0 = mw6Var2;
                                                qn1Var.i0 = ch5Var6;
                                                qn1Var.j0 = kkVar2;
                                                qn1Var.k0 = null;
                                                qn1Var.m0 = f;
                                                qn1Var.o0 = 2;
                                                c = mw6Var2.c(py4.Main, qn1Var);
                                                if (c != x61Var3) {
                                                }
                                            }
                                            vy4Var3 = vy4Var5;
                                            ao2Var = ao2Var4;
                                            dz3Var7 = dz3Var4;
                                            eo2Var = eo2Var2;
                                            mw6Var2 = mw6Var4;
                                            ch5Var7 = ch5Var;
                                            x61Var = x61Var2;
                                            ov4Var6 = ov4Var3;
                                            vy4Var8 = null;
                                            ov4Var5 = ov4Var6;
                                            dz3Var6 = dz3Var7;
                                            ao2Var = ao2Var;
                                            ch5Var5 = ch5Var7;
                                            if (vy4Var8 == null) {
                                            }
                                            vy4Var2 = vy4Var8;
                                            qn1Var2 = qn1Var;
                                            fo2Var3 = ov4Var5;
                                            dz3Var9 = dz3Var6;
                                            ch5Var9 = ch5Var5;
                                            if (vy4Var2 == null) {
                                            }
                                            if (vy4Var2 != null) {
                                            }
                                            return jg7.a;
                                        }
                                    }
                                } else {
                                    vy4Var2 = vy4Var8;
                                    qn1Var2 = qn1Var;
                                    fo2Var3 = ov4Var5;
                                    dz3Var9 = dz3Var6;
                                    ch5Var9 = ch5Var5;
                                    if (vy4Var2 == null) {
                                    }
                                    if (vy4Var2 != null) {
                                    }
                                    return jg7.a;
                                }
                            }
                        }
                        return x61Var3;
                    case 1:
                        j = 9205357640488583168L;
                        j2 = 9223372034707292159L;
                        z = qn1Var.l0;
                        eo2Var = (eo2) qn1Var.d0;
                        ?? r7 = (fo2) qn1Var.Z;
                        lo4 lo4Var4 = (lo4) qn1Var.Y;
                        vy4Var2 = (vy4) qn1Var.X;
                        mw6Var2 = (mw6) qn1Var.R;
                        oi2.Y(obj3);
                        ao2Var = (qn2) qn1Var.f0;
                        lo4Var = lo4Var4;
                        dz3Var2 = (on2) qn1Var.e0;
                        ov4Var2 = r7;
                        vy4Var3 = (vy4) obj3;
                        ?? obj42 = new Object();
                        obj42.A = 0L;
                        ov4 ov4Var82 = ov4Var2;
                        dz3 dz3Var142 = dz3Var2;
                        ch5 ch5Var122 = obj42;
                        if (!z) {
                        }
                        j3 = vy4Var3.a;
                        int i1122 = vy4Var3.i;
                        if (f(mw6Var2.Y.p0, j3)) {
                        }
                        break;
                    case 2:
                        j = 9205357640488583168L;
                        j2 = 9223372034707292159L;
                        f = qn1Var.m0;
                        kk kkVar4 = qn1Var.j0;
                        ch5 ch5Var13 = qn1Var.i0;
                        vy4Var4 = (vy4) qn1Var.f0;
                        ao2Var2 = (qn2) qn1Var.e0;
                        eo2 eo2Var6 = (eo2) qn1Var.Z;
                        oi2.Y(obj3);
                        mw6Var3 = (mw6) qn1Var.h0;
                        eo2Var = eo2Var6;
                        kkVar = kkVar4;
                        lo4Var = (lo4) qn1Var.X;
                        ch5Var = (ch5) qn1Var.g0;
                        dz3Var3 = (on2) qn1Var.d0;
                        ch5Var2 = ch5Var13;
                        ov4Var3 = (fo2) qn1Var.Y;
                        mw6Var4 = (mw6) qn1Var.R;
                        oy4 oy4Var2 = (oy4) obj3;
                        List list52 = oy4Var2.a;
                        x61Var2 = x61Var3;
                        size = list52.size();
                        mw6Var5 = mw6Var3;
                        i = 0;
                        ao2Var3 = ao2Var2;
                        while (true) {
                            if (i >= size) {
                            }
                            i++;
                            vy4Var4 = vy4Var5;
                            ao2Var3 = ao2Var4;
                            dz3Var3 = dz3Var4;
                            eo2Var = eo2Var2;
                            size = i2;
                        }
                        vy4Var6 = r22;
                        if (vy4Var6 != null) {
                            if (!ej2.p(vy4Var6)) {
                            }
                            vy4Var3 = vy4Var5;
                            ao2Var = ao2Var4;
                            dz3Var3 = dz3Var4;
                            eo2Var = eo2Var2;
                            ch5Var6 = ch5Var2;
                            mw6Var6 = mw6Var4;
                            ch5Var4 = ch5Var;
                            kkVar2 = kkVar;
                            x61Var3 = x61Var2;
                            mw6Var2 = mw6Var5;
                            ov4Var4 = ov4Var3;
                            qn1Var.R = mw6Var6;
                            qn1Var.X = lo4Var;
                            qn1Var.Y = ov4Var4;
                            qn1Var.Z = eo2Var;
                            qn1Var.d0 = dz3Var3;
                            qn1Var.e0 = ao2Var;
                            qn1Var.f0 = vy4Var3;
                            qn1Var.g0 = ch5Var4;
                            qn1Var.h0 = mw6Var2;
                            qn1Var.i0 = ch5Var6;
                            qn1Var.j0 = kkVar2;
                            qn1Var.k0 = null;
                            qn1Var.m0 = f;
                            qn1Var.o0 = 2;
                            c = mw6Var2.c(py4.Main, qn1Var);
                            if (c != x61Var3) {
                            }
                            return x61Var3;
                        }
                        vy4Var3 = vy4Var5;
                        ao2Var = ao2Var4;
                        dz3Var7 = dz3Var4;
                        eo2Var = eo2Var2;
                        mw6Var2 = mw6Var4;
                        ch5Var7 = ch5Var;
                        x61Var = x61Var2;
                        ov4Var6 = ov4Var3;
                        vy4Var8 = null;
                        ov4Var5 = ov4Var6;
                        dz3Var6 = dz3Var7;
                        ao2Var = ao2Var;
                        ch5Var5 = ch5Var7;
                        if (vy4Var8 == null) {
                        }
                        vy4Var2 = vy4Var8;
                        qn1Var2 = qn1Var;
                        fo2Var3 = ov4Var5;
                        dz3Var9 = dz3Var6;
                        ch5Var9 = ch5Var5;
                        if (vy4Var2 == null) {
                        }
                        if (vy4Var2 != null) {
                        }
                        return jg7.a;
                    case 3:
                        j = 9205357640488583168L;
                        j2 = 9223372034707292159L;
                        f = qn1Var.m0;
                        vy4Var7 = qn1Var.k0;
                        kk kkVar5 = qn1Var.j0;
                        ch5 ch5Var14 = qn1Var.i0;
                        ch5 ch5Var15 = (ch5) qn1Var.g0;
                        eo2 eo2Var7 = (eo2) qn1Var.Z;
                        lo4Var2 = (lo4) qn1Var.X;
                        oi2.Y(obj3);
                        kkVar2 = kkVar5;
                        eo2Var = eo2Var7;
                        ch5Var3 = ch5Var14;
                        dz3Var5 = (on2) qn1Var.d0;
                        ch5Var4 = ch5Var15;
                        vy4Var3 = (vy4) qn1Var.f0;
                        mw6Var2 = (mw6) qn1Var.h0;
                        ao2Var = (qn2) qn1Var.e0;
                        mw6Var6 = (mw6) qn1Var.R;
                        ov4Var7 = (fo2) qn1Var.Y;
                        x61Var = x61Var3;
                        if (vy4Var7.c()) {
                        }
                        break;
                    case 4:
                        j = 9205357640488583168L;
                        j2 = 9223372034707292159L;
                        ch5Var8 = (ch5) qn1Var.h0;
                        vy4Var9 = (vy4) qn1Var.g0;
                        vy4Var10 = (vy4) qn1Var.f0;
                        eo2Var3 = (eo2) qn1Var.Z;
                        fo2Var = (fo2) qn1Var.Y;
                        lo4Var3 = (lo4) qn1Var.X;
                        mw6Var7 = (mw6) qn1Var.R;
                        oi2.Y(obj3);
                        x61Var = x61Var3;
                        qn1Var2 = qn1Var;
                        k0Var2 = (qn2) qn1Var.e0;
                        dz3Var9 = (on2) qn1Var.d0;
                        List list42 = ((oy4) obj3).a;
                        size2 = list42.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                            }
                            i3++;
                        }
                        size3 = list42.size();
                        i4 = 0;
                        while (true) {
                            if (i4 >= size3) {
                            }
                            i4++;
                        }
                        ch5Var9 = ch5Var8;
                        qn1Var2 = qn1Var3;
                        fo2Var3 = fo2Var2;
                        dz3Var9 = dz3Var10;
                        if (vy4Var2 == null) {
                        }
                        if (vy4Var2 != null) {
                        }
                        return jg7.a;
                    case 5:
                        j = 9205357640488583168L;
                        j2 = 9223372034707292159L;
                        float f2 = qn1Var.m0;
                        kk kkVar6 = qn1Var.j0;
                        ch5 ch5Var16 = qn1Var.i0;
                        oi2.Y(obj3);
                        ch5 ch5Var17 = ch5Var16;
                        vy4Var10 = (vy4) qn1Var.f0;
                        eo2Var3 = (eo2) qn1Var.Z;
                        mw6Var7 = (mw6) qn1Var.h0;
                        k0 k0Var8 = (qn2) qn1Var.e0;
                        fo2Var = (fo2) qn1Var.Y;
                        kkVar3 = kkVar6;
                        mw6 mw6Var11 = (mw6) qn1Var.R;
                        x61Var = x61Var3;
                        qn1 qn1Var10 = qn1Var;
                        float f3 = f2;
                        ch5Var8 = (ch5) qn1Var.g0;
                        dz3Var8 = (on2) qn1Var.d0;
                        lo4Var3 = (lo4) qn1Var.X;
                        oy4 oy4Var3 = (oy4) obj3;
                        List list7 = oy4Var3.a;
                        x61 x61Var4 = x61Var;
                        int size7 = list7.size();
                        mw6 mw6Var12 = mw6Var7;
                        int i13 = 0;
                        while (true) {
                            if (i13 >= size7) {
                                ?? r222 = list7.get(i13);
                                i5 = i13;
                                list = list7;
                                i6 = size7;
                                vy4Var11 = vy4Var10;
                                k0Var3 = k0Var8;
                                if (nj2.o(((vy4) r222).a, ch5Var17.A)) {
                                    vy4Var12 = r222;
                                } else {
                                    i13 = i5 + 1;
                                    vy4Var10 = vy4Var11;
                                    list7 = list;
                                    size7 = i6;
                                    k0Var8 = k0Var3;
                                }
                            } else {
                                vy4Var11 = vy4Var10;
                                k0Var3 = k0Var8;
                                vy4Var12 = null;
                            }
                        }
                        vy4 vy4Var20 = vy4Var12;
                        if (vy4Var20 != null && !vy4Var20.c()) {
                            if (ej2.p(vy4Var20)) {
                                if ((kkVar3.e(f3, ej2.R(vy4Var20, true), true) & j2) != j) {
                                    vy4Var20.a();
                                    ch5Var8.A = ej2.R(vy4Var20, false);
                                    if (!vy4Var20.c()) {
                                        kkVar3.B = 0L;
                                    } else {
                                        lo4 lo4Var5 = lo4Var3;
                                        mw6Var2 = mw6Var11;
                                        lo4Var = lo4Var5;
                                        fo2 fo2Var5 = fo2Var;
                                        vy4Var2 = vy4Var20;
                                        fo2Var4 = fo2Var5;
                                        qn1Var5 = qn1Var10;
                                        eo2Var = eo2Var3;
                                        vy4Var3 = vy4Var11;
                                        x61Var = x61Var4;
                                        ao2Var = k0Var3;
                                        qn1Var3 = qn1Var5;
                                        fo2Var2 = fo2Var4;
                                        dz3Var10 = dz3Var8;
                                        ch5Var9 = ch5Var8;
                                        qn1Var2 = qn1Var3;
                                        fo2Var3 = fo2Var2;
                                        dz3Var9 = dz3Var10;
                                        if (vy4Var2 == null) {
                                        }
                                        if (vy4Var2 != null) {
                                        }
                                        return jg7.a;
                                    }
                                } else {
                                    py4 py4Var3 = py4.Final;
                                    qn1Var10.R = mw6Var11;
                                    qn1Var10.X = lo4Var3;
                                    qn1Var10.Y = fo2Var;
                                    qn1Var10.Z = eo2Var3;
                                    qn1Var10.d0 = dz3Var8;
                                    k0Var4 = k0Var3;
                                    qn1Var10.e0 = k0Var4;
                                    qn1Var10.f0 = vy4Var11;
                                    qn1Var10.g0 = ch5Var8;
                                    qn1Var10.h0 = mw6Var12;
                                    qn1Var10.i0 = ch5Var17;
                                    qn1Var10.j0 = kkVar3;
                                    qn1Var10.k0 = vy4Var20;
                                    qn1Var10.m0 = f3;
                                    qn1Var10.o0 = 6;
                                    x61Var = x61Var4;
                                    if (mw6Var12.c(py4Var3, qn1Var10) == x61Var) {
                                        return x61Var;
                                    }
                                    g = f3;
                                    qn1Var4 = qn1Var10;
                                    mw6Var8 = mw6Var11;
                                    vy4Var13 = vy4Var20;
                                    vy4Var10 = vy4Var11;
                                    mw6Var7 = mw6Var12;
                                    ch5Var11 = ch5Var17;
                                    qn1Var6 = qn1Var4;
                                    k0Var5 = k0Var4;
                                    dz3Var8 = dz3Var8;
                                    ch5Var10 = ch5Var11;
                                    if (vy4Var13.c()) {
                                        eo2 eo2Var8 = eo2Var3;
                                        ao2Var = k0Var4;
                                        eo2Var = eo2Var8;
                                        ch5Var9 = ch5Var8;
                                        vy4Var3 = vy4Var10;
                                        fo2Var3 = fo2Var;
                                        lo4Var = lo4Var3;
                                        vy4Var2 = null;
                                        mw6Var2 = mw6Var8;
                                        qn1Var2 = qn1Var4;
                                        dz3Var9 = dz3Var8;
                                        if (vy4Var2 == null) {
                                        }
                                        if (vy4Var2 != null) {
                                        }
                                        return jg7.a;
                                    }
                                    qn1Var6.R = mw6Var8;
                                    qn1Var6.X = lo4Var3;
                                    qn1Var6.Y = fo2Var;
                                    qn1Var6.Z = eo2Var3;
                                    qn1Var6.d0 = dz3Var8;
                                    qn1Var6.e0 = k0Var5;
                                    qn1Var6.f0 = vy4Var10;
                                    qn1Var6.g0 = ch5Var8;
                                    qn1Var6.h0 = mw6Var7;
                                    qn1Var6.i0 = ch5Var10;
                                    qn1Var6.j0 = kkVar3;
                                    qn1Var6.k0 = null;
                                    qn1Var6.m0 = g;
                                    qn1Var6.o0 = 5;
                                    c2 = mw6Var7.c(py4.Main, qn1Var6);
                                    if (c2 == x61Var) {
                                        return x61Var;
                                    }
                                    qn1 qn1Var11 = qn1Var6;
                                    f3 = g;
                                    obj3 = c2;
                                    mw6Var11 = mw6Var8;
                                    qn1Var10 = qn1Var11;
                                    k0Var8 = k0Var5;
                                    ch5Var17 = ch5Var10;
                                    oy4 oy4Var32 = (oy4) obj3;
                                    List list72 = oy4Var32.a;
                                    x61 x61Var42 = x61Var;
                                    int size72 = list72.size();
                                    mw6 mw6Var122 = mw6Var7;
                                    int i132 = 0;
                                    while (true) {
                                        if (i132 >= size72) {
                                        }
                                        i132 = i5 + 1;
                                        vy4Var10 = vy4Var11;
                                        list72 = list;
                                        size72 = i6;
                                        k0Var8 = k0Var3;
                                    }
                                    vy4 vy4Var202 = vy4Var12;
                                    if (vy4Var202 != null) {
                                        if (ej2.p(vy4Var202)) {
                                            List list8 = oy4Var32.a;
                                            int size8 = list8.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size8) {
                                                    ?? r13 = list8.get(i14);
                                                    if (((vy4) r13).d) {
                                                        vy4Var14 = r13;
                                                    } else {
                                                        i14++;
                                                    }
                                                } else {
                                                    vy4Var14 = null;
                                                }
                                            }
                                            vy4 vy4Var21 = vy4Var14;
                                            if (vy4Var21 != null) {
                                                ch5Var17.A = vy4Var21.a;
                                            }
                                        }
                                    }
                                }
                            }
                            k0Var5 = k0Var3;
                            g = f3;
                            qn1Var6 = qn1Var10;
                            mw6Var8 = mw6Var11;
                            vy4Var10 = vy4Var11;
                            mw6Var7 = mw6Var122;
                            x61Var = x61Var42;
                            dz3Var8 = dz3Var8;
                            ch5Var10 = ch5Var17;
                            qn1Var6.R = mw6Var8;
                            qn1Var6.X = lo4Var3;
                            qn1Var6.Y = fo2Var;
                            qn1Var6.Z = eo2Var3;
                            qn1Var6.d0 = dz3Var8;
                            qn1Var6.e0 = k0Var5;
                            qn1Var6.f0 = vy4Var10;
                            qn1Var6.g0 = ch5Var8;
                            qn1Var6.h0 = mw6Var7;
                            qn1Var6.i0 = ch5Var10;
                            qn1Var6.j0 = kkVar3;
                            qn1Var6.k0 = null;
                            qn1Var6.m0 = g;
                            qn1Var6.o0 = 5;
                            c2 = mw6Var7.c(py4.Main, qn1Var6);
                            if (c2 == x61Var) {
                            }
                        }
                        lo4 lo4Var6 = lo4Var3;
                        mw6Var2 = mw6Var11;
                        lo4Var = lo4Var6;
                        qn1Var5 = qn1Var10;
                        eo2Var = eo2Var3;
                        fo2Var4 = fo2Var;
                        vy4Var3 = vy4Var11;
                        x61Var = x61Var42;
                        vy4Var2 = null;
                        ao2Var = k0Var3;
                        qn1Var3 = qn1Var5;
                        fo2Var2 = fo2Var4;
                        dz3Var10 = dz3Var8;
                        ch5Var9 = ch5Var8;
                        qn1Var2 = qn1Var3;
                        fo2Var3 = fo2Var2;
                        dz3Var9 = dz3Var10;
                        if (vy4Var2 == null) {
                        }
                        if (vy4Var2 != null) {
                        }
                        return jg7.a;
                    case 6:
                        float f4 = qn1Var.m0;
                        vy4Var13 = qn1Var.k0;
                        kk kkVar7 = qn1Var.j0;
                        ch5 ch5Var18 = qn1Var.i0;
                        j = 9205357640488583168L;
                        j2 = 9223372034707292159L;
                        fo2 fo2Var6 = (fo2) qn1Var.Y;
                        lo4 lo4Var7 = (lo4) qn1Var.X;
                        oi2.Y(obj3);
                        x61Var = x61Var3;
                        mw6Var8 = (mw6) qn1Var.R;
                        k0Var4 = (qn2) qn1Var.e0;
                        lo4Var3 = lo4Var7;
                        kkVar3 = kkVar7;
                        vy4Var10 = (vy4) qn1Var.f0;
                        fo2Var = fo2Var6;
                        g = f4;
                        ch5Var8 = (ch5) qn1Var.g0;
                        eo2Var3 = (eo2) qn1Var.Z;
                        mw6Var7 = (mw6) qn1Var.h0;
                        dz3Var8 = (on2) qn1Var.d0;
                        qn1Var4 = qn1Var;
                        ch5Var11 = ch5Var18;
                        qn1Var6 = qn1Var4;
                        k0Var5 = k0Var4;
                        dz3Var8 = dz3Var8;
                        ch5Var10 = ch5Var11;
                        if (vy4Var13.c()) {
                        }
                        qn1Var6.R = mw6Var8;
                        qn1Var6.X = lo4Var3;
                        qn1Var6.Y = fo2Var;
                        qn1Var6.Z = eo2Var3;
                        qn1Var6.d0 = dz3Var8;
                        qn1Var6.e0 = k0Var5;
                        qn1Var6.f0 = vy4Var10;
                        qn1Var6.g0 = ch5Var8;
                        qn1Var6.h0 = mw6Var7;
                        qn1Var6.i0 = ch5Var10;
                        qn1Var6.j0 = kkVar3;
                        qn1Var6.k0 = null;
                        qn1Var6.m0 = g;
                        qn1Var6.o0 = 5;
                        c2 = mw6Var7.c(py4.Main, qn1Var6);
                        if (c2 == x61Var) {
                        }
                        break;
                    case 7:
                        ch5 ch5Var19 = (ch5) qn1Var.e0;
                        mw6 mw6Var13 = (mw6) qn1Var.d0;
                        mw6 mw6Var14 = (mw6) qn1Var.Z;
                        ?? r8 = (on2) qn1Var.X;
                        eo2 eo2Var9 = (eo2) qn1Var.R;
                        oi2.Y(obj3);
                        x61Var = x61Var3;
                        qn1 qn1Var12 = qn1Var;
                        k0 k0Var9 = (qn2) qn1Var.Y;
                        oy4 oy4Var4 = (oy4) obj3;
                        List list9 = oy4Var4.a;
                        int size9 = list9.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 < size9) {
                                ?? r12 = list9.get(i15);
                                mw6Var9 = mw6Var13;
                                mw6Var10 = mw6Var14;
                                list2 = list9;
                                if (nj2.o(((vy4) r12).a, ch5Var19.A)) {
                                    vy4Var16 = r12;
                                } else {
                                    i15++;
                                    mw6Var13 = mw6Var9;
                                    mw6Var14 = mw6Var10;
                                    list9 = list2;
                                }
                            } else {
                                mw6Var9 = mw6Var13;
                                mw6Var10 = mw6Var14;
                                vy4Var16 = null;
                            }
                        }
                        vy4 vy4Var22 = vy4Var16;
                        if (vy4Var22 == null) {
                            if (!ej2.p(vy4Var22)) {
                                break;
                            } else {
                                List list10 = oy4Var4.a;
                                int size10 = list10.size();
                                int i16 = 0;
                                while (true) {
                                    if (i16 < size10) {
                                        obj2 = list10.get(i16);
                                        if (!((vy4) obj2).d) {
                                            i16++;
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                vy4 vy4Var23 = (vy4) obj2;
                                if (vy4Var23 != null) {
                                    ch5Var19.A = vy4Var23.a;
                                    mw6Var13 = mw6Var9;
                                    mw6Var14 = mw6Var10;
                                    qn1Var7 = qn1Var12;
                                    k0Var6 = k0Var9;
                                    qn1Var7.R = eo2Var9;
                                    qn1Var7.X = r8;
                                    qn1Var7.Y = k0Var6;
                                    qn1Var7.Z = mw6Var14;
                                    qn1Var7.d0 = mw6Var13;
                                    qn1Var7.e0 = ch5Var19;
                                    qn1Var7.f0 = null;
                                    qn1Var7.g0 = null;
                                    qn1Var7.h0 = null;
                                    qn1Var7.i0 = null;
                                    qn1Var7.j0 = null;
                                    qn1Var7.k0 = null;
                                    qn1Var7.o0 = 7;
                                    obj3 = mw6Var13.c(py4.Main, qn1Var7);
                                    qn1Var12 = qn1Var7;
                                    k0Var9 = k0Var6;
                                    if (obj3 == x61Var) {
                                        return x61Var;
                                    }
                                    oy4 oy4Var42 = (oy4) obj3;
                                    List list92 = oy4Var42.a;
                                    int size92 = list92.size();
                                    int i152 = 0;
                                    while (true) {
                                        if (i152 < size92) {
                                        }
                                        i152++;
                                        mw6Var13 = mw6Var9;
                                        mw6Var14 = mw6Var10;
                                        list92 = list2;
                                    }
                                    vy4 vy4Var222 = vy4Var16;
                                    if (vy4Var222 == null) {
                                        vy4Var222 = null;
                                    }
                                }
                            }
                        }
                        if (vy4Var222 != null && !vy4Var222.c()) {
                            if (ej2.p(vy4Var222)) {
                                eo2Var9.o(vy4Var222, new jk4(ej2.R(vy4Var222, false)));
                                vy4Var222.a();
                                dz3 dz3Var15 = r8;
                                ao2Var = k0Var9;
                                dz3Var11 = dz3Var15;
                                mw6Var2 = mw6Var10;
                                j4 = vy4Var222.a;
                                eo2Var = eo2Var9;
                                qn1Var8 = qn1Var12;
                                ?? obj7 = new Object();
                                obj7.A = j4;
                                k0 k0Var10 = ao2Var;
                                r8 = dz3Var11;
                                k0Var6 = k0Var10;
                                ch5Var19 = obj7;
                                eo2Var9 = eo2Var;
                                mw6Var13 = mw6Var2;
                                mw6Var14 = mw6Var13;
                                qn1Var7 = qn1Var8;
                                qn1Var7.R = eo2Var9;
                                qn1Var7.X = r8;
                                qn1Var7.Y = k0Var6;
                                qn1Var7.Z = mw6Var14;
                                qn1Var7.d0 = mw6Var13;
                                qn1Var7.e0 = ch5Var19;
                                qn1Var7.f0 = null;
                                qn1Var7.g0 = null;
                                qn1Var7.h0 = null;
                                qn1Var7.i0 = null;
                                qn1Var7.j0 = null;
                                qn1Var7.k0 = null;
                                qn1Var7.o0 = 7;
                                obj3 = mw6Var13.c(py4.Main, qn1Var7);
                                qn1Var12 = qn1Var7;
                                k0Var9 = k0Var6;
                                if (obj3 == x61Var) {
                                }
                                oy4 oy4Var422 = (oy4) obj3;
                                List list922 = oy4Var422.a;
                                int size922 = list922.size();
                                int i1522 = 0;
                                while (true) {
                                    if (i1522 < size922) {
                                    }
                                    i1522++;
                                    mw6Var13 = mw6Var9;
                                    mw6Var14 = mw6Var10;
                                    list922 = list2;
                                }
                                vy4 vy4Var2222 = vy4Var16;
                                if (vy4Var2222 == null) {
                                }
                                if (vy4Var2222 != null) {
                                    if (ej2.p(vy4Var2222)) {
                                    }
                                }
                                dz3 dz3Var16 = r8;
                                ao2Var = k0Var9;
                                dz3Var13 = dz3Var16;
                                vy4Var15 = null;
                                dz3Var12 = dz3Var13;
                                if (vy4Var15 == null) {
                                }
                                return jg7.a;
                            }
                            dz3 dz3Var17 = r8;
                            ao2Var = k0Var9;
                            dz3Var12 = dz3Var17;
                            vy4Var15 = vy4Var2222;
                            if (vy4Var15 == null) {
                                dz3Var12.c();
                            } else {
                                ao2Var.g(vy4Var15);
                            }
                            return jg7.a;
                        }
                        dz3 dz3Var162 = r8;
                        ao2Var = k0Var9;
                        dz3Var13 = dz3Var162;
                        vy4Var15 = null;
                        dz3Var12 = dz3Var13;
                        if (vy4Var15 == null) {
                        }
                        return jg7.a;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        qn1Var = new s41(d20Var);
        Object obj32 = qn1Var.n0;
        x61 x61Var32 = x61.COROUTINE_SUSPENDED;
        switch (qn1Var.o0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fb, code lost:
        if (r0 == androidx.recyclerview.widget.RecyclerView.B1) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v2, types: [ch5, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:23:0x007e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(mw6 mw6Var, long j, k0 k0Var, d20 d20Var) {
        rn1 rn1Var;
        int i;
        mw6 mw6Var2;
        long j2;
        rn1 rn1Var2;
        lo4 lo4Var;
        k0 k0Var2;
        int i2;
        ch5 ch5Var;
        lo4 lo4Var2;
        mw6 mw6Var3;
        rn1 rn1Var3;
        Object c;
        boolean z;
        mw6 mw6Var4;
        Object obj;
        long j3;
        float intBitsToFloat;
        Object obj2;
        if (d20Var instanceof rn1) {
            rn1 rn1Var4 = (rn1) d20Var;
            int i3 = rn1Var4.f0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rn1Var4.f0 = i3 - Integer.MIN_VALUE;
                rn1Var = rn1Var4;
                Object obj3 = rn1Var.e0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = rn1Var.f0;
                vy4 vy4Var = null;
                int i4 = 1;
                if (i == 0) {
                    if (i == 1) {
                        ch5 ch5Var2 = rn1Var.d0;
                        mw6Var3 = rn1Var.Z;
                        lo4Var2 = rn1Var.Y;
                        mw6 mw6Var5 = rn1Var.X;
                        qn2 qn2Var = rn1Var.R;
                        oi2.Y(obj3);
                        ch5 ch5Var3 = ch5Var2;
                        mw6Var2 = mw6Var5;
                        rn1 rn1Var5 = rn1Var;
                        qn2 qn2Var2 = qn2Var;
                        oy4 oy4Var = (oy4) obj3;
                        List list = oy4Var.a;
                        int size = list.size();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= size) {
                                obj = list.get(i5);
                                mw6Var4 = mw6Var3;
                                if (nj2.o(((vy4) obj).a, ch5Var3.A)) {
                                    break;
                                }
                                i5++;
                                mw6Var3 = mw6Var4;
                            } else {
                                mw6Var4 = mw6Var3;
                                obj = null;
                                break;
                            }
                        }
                        vy4 vy4Var2 = (vy4) obj;
                        if (vy4Var2 == null) {
                            if (ej2.p(vy4Var2)) {
                                List list2 = oy4Var.a;
                                int size2 = list2.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 < size2) {
                                        obj2 = list2.get(i6);
                                        if (((vy4) obj2).d) {
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                vy4 vy4Var3 = (vy4) obj2;
                                if (vy4Var3 != null) {
                                    ch5Var3.A = vy4Var3.a;
                                    i2 = 1;
                                }
                            } else {
                                i2 = 1;
                                long R = ej2.R(vy4Var2, true);
                                if (lo4Var2 == null) {
                                    intBitsToFloat = jk4.d(R);
                                } else {
                                    if (lo4Var2 == lo4.Vertical) {
                                        j3 = R & 4294967295L;
                                    } else {
                                        j3 = R >> 32;
                                    }
                                    intBitsToFloat = Float.intBitsToFloat((int) j3);
                                }
                            }
                            mw6Var3 = mw6Var4;
                            k0Var2 = qn2Var2;
                            i4 = i2;
                            ch5Var = ch5Var3;
                            rn1Var3 = rn1Var5;
                            rn1Var3.R = k0Var2;
                            rn1Var3.X = mw6Var2;
                            rn1Var3.Y = lo4Var2;
                            rn1Var3.Z = mw6Var3;
                            rn1Var3.d0 = ch5Var;
                            rn1Var3.f0 = i4;
                            c = mw6Var3.c(py4.Main, rn1Var3);
                            if (c == x61Var) {
                                return x61Var;
                            }
                            ch5 ch5Var4 = ch5Var;
                            qn2Var2 = k0Var2;
                            obj3 = c;
                            ch5Var3 = ch5Var4;
                            rn1Var5 = rn1Var3;
                            oy4 oy4Var2 = (oy4) obj3;
                            List list3 = oy4Var2.a;
                            int size3 = list3.size();
                            int i52 = 0;
                            while (true) {
                                if (i52 >= size3) {
                                }
                                i52++;
                                mw6Var3 = mw6Var4;
                            }
                            vy4 vy4Var22 = (vy4) obj;
                            if (vy4Var22 == null) {
                                vy4Var22 = null;
                            }
                        }
                        i2 = 1;
                        if (vy4Var22 == null || vy4Var22.c()) {
                            vy4Var = null;
                        } else if (ej2.p(vy4Var22)) {
                            vy4Var = vy4Var22;
                        } else {
                            qn2Var2.g(vy4Var22);
                            rn1Var2 = rn1Var5;
                            lo4Var = lo4Var2;
                            k0Var2 = qn2Var2;
                            i4 = i2;
                            j2 = vy4Var22.a;
                            ?? obj4 = new Object();
                            obj4.A = j2;
                            lo4Var2 = lo4Var;
                            rn1Var3 = rn1Var2;
                            mw6Var3 = mw6Var2;
                            ch5Var = obj4;
                            rn1Var3.R = k0Var2;
                            rn1Var3.X = mw6Var2;
                            rn1Var3.Y = lo4Var2;
                            rn1Var3.Z = mw6Var3;
                            rn1Var3.d0 = ch5Var;
                            rn1Var3.f0 = i4;
                            c = mw6Var3.c(py4.Main, rn1Var3);
                            if (c == x61Var) {
                            }
                        }
                        if (vy4Var == null) {
                            z = i2;
                        } else {
                            z = 0;
                        }
                        return Boolean.valueOf(z);
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj3);
                lo4 lo4Var3 = lo4.Vertical;
                mw6Var2 = mw6Var;
                j2 = j;
                if (f(mw6Var2.Y.p0, j2)) {
                    i2 = 1;
                    if (vy4Var == null) {
                    }
                    return Boolean.valueOf(z);
                }
                rn1Var2 = rn1Var;
                lo4Var = lo4Var3;
                k0Var2 = k0Var;
                ?? obj42 = new Object();
                obj42.A = j2;
                lo4Var2 = lo4Var;
                rn1Var3 = rn1Var2;
                mw6Var3 = mw6Var2;
                ch5Var = obj42;
                rn1Var3.R = k0Var2;
                rn1Var3.X = mw6Var2;
                rn1Var3.Y = lo4Var2;
                rn1Var3.Z = mw6Var3;
                rn1Var3.d0 = ch5Var;
                rn1Var3.f0 = i4;
                c = mw6Var3.c(py4.Main, rn1Var3);
                if (c == x61Var) {
                }
            }
        }
        rn1Var = new s41(d20Var);
        Object obj32 = rn1Var.e0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = rn1Var.f0;
        vy4 vy4Var4 = null;
        int i42 = 1;
        if (i == 0) {
        }
    }
}
