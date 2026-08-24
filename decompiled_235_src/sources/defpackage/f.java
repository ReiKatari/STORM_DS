package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f  reason: default package */
/* loaded from: classes.dex */
public abstract class f {
    public static final da0 a;
    public static final da0 b;
    public static final da0 c;
    public static final da0 d;
    public static final da0 e;

    static {
        da0 da0Var = da0.R;
        a = xd5.o("/");
        b = xd5.o("\\");
        c = xd5.o("/\\");
        d = xd5.o(".");
        e = xd5.o("..");
    }

    public static final int a(lt4 lt4Var) {
        da0 da0Var = lt4Var.A;
        if (da0Var.d() != 0) {
            if (da0Var.i(0) != 47) {
                if (da0Var.i(0) == 92) {
                    if (da0Var.d() > 2 && da0Var.i(1) == 92) {
                        da0 da0Var2 = b;
                        da0Var2.getClass();
                        int f = da0Var.f(da0Var2.h(), 2);
                        if (f == -1) {
                            return da0Var.d();
                        }
                        return f;
                    }
                } else if (da0Var.d() > 2 && da0Var.i(1) == 58 && da0Var.i(2) == 92) {
                    char i = (char) da0Var.i(0);
                    if ('a' > i || i >= '{') {
                        if ('A' <= i && i < '[') {
                            return 3;
                        }
                    } else {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [k80, java.lang.Object] */
    public static final lt4 b(lt4 lt4Var, lt4 lt4Var2, boolean z) {
        lt4Var2.getClass();
        if (a(lt4Var2) != -1 || lt4Var2.e() != null) {
            return lt4Var2;
        }
        da0 c2 = c(lt4Var);
        if (c2 == null && (c2 = c(lt4Var2)) == null) {
            c2 = f(lt4.B);
        }
        ?? obj = new Object();
        obj.k0(lt4Var.A);
        if (obj.B > 0) {
            obj.k0(c2);
        }
        obj.k0(lt4Var2.A);
        return d(obj, z);
    }

    public static final da0 c(lt4 lt4Var) {
        da0 da0Var = lt4Var.A;
        da0 da0Var2 = a;
        if (da0.g(da0Var, da0Var2) != -1) {
            return da0Var2;
        }
        da0 da0Var3 = lt4Var.A;
        da0 da0Var4 = b;
        if (da0.g(da0Var3, da0Var4) != -1) {
            return da0Var4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011e A[EDGE_INSN: B:101:0x011e->B:81:0x011e ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013c  */
    /* JADX WARN: Type inference failed for: r1v0, types: [k80, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final lt4 d(k80 k80Var, boolean z) {
        da0 da0Var;
        boolean z2;
        long j;
        char v;
        boolean z3;
        boolean u;
        da0 da0Var2;
        int size;
        int i;
        da0 l;
        ?? obj = new Object();
        da0 da0Var3 = null;
        int i2 = 0;
        while (true) {
            da0 da0Var4 = a;
            da0Var4.getClass();
            if (!k80Var.F(da0Var4.d(), 0L, da0Var4)) {
                da0Var = b;
                da0Var.getClass();
                if (!k80Var.F(da0Var.d(), 0L, da0Var)) {
                    break;
                }
            }
            byte readByte = k80Var.readByte();
            if (da0Var3 == null) {
                da0Var3 = e(readByte);
            }
            i2++;
        }
        if (i2 >= 2 && nb3.k(da0Var3, da0Var)) {
            z2 = true;
        } else {
            z2 = false;
        }
        da0 da0Var5 = c;
        if (z2) {
            da0Var3.getClass();
            obj.k0(da0Var3);
            obj.k0(da0Var3);
        } else if (i2 > 0) {
            da0Var3.getClass();
            obj.k0(da0Var3);
        } else {
            long D = k80Var.D(da0Var5);
            if (da0Var3 == null) {
                if (D == -1) {
                    da0Var3 = f(lt4.B);
                } else {
                    da0Var3 = e(k80Var.v(D));
                }
            }
            if (nb3.k(da0Var3, da0Var) && k80Var.B >= 2) {
                j = -1;
                if (k80Var.v(1L) == 58 && (('a' <= (v = (char) k80Var.v(0L)) && v < '{') || ('A' <= v && v < '['))) {
                    if (D == 2) {
                        obj.O(k80Var, 3L);
                    } else {
                        obj.O(k80Var, 2L);
                    }
                }
                if (obj.B <= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                ArrayList arrayList = new ArrayList();
                while (true) {
                    u = k80Var.u();
                    da0Var2 = d;
                    if (!u) {
                        break;
                    }
                    long D2 = k80Var.D(da0Var5);
                    if (D2 == j) {
                        l = k80Var.l(k80Var.B);
                    } else {
                        l = k80Var.l(D2);
                        k80Var.readByte();
                    }
                    da0 da0Var6 = e;
                    if (nb3.k(l, da0Var6)) {
                        if (!z3 || !arrayList.isEmpty()) {
                            if (z && (z3 || (!arrayList.isEmpty() && !nb3.k(gt0.Q0(arrayList), da0Var6)))) {
                                if (!z2 || arrayList.size() != 1) {
                                    gt0.Z0(arrayList);
                                }
                            } else {
                                arrayList.add(l);
                            }
                        }
                    } else if (!nb3.k(l, da0Var2) && !nb3.k(l, da0.R)) {
                        arrayList.add(l);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        obj.k0(da0Var3);
                    }
                    obj.k0((da0) arrayList.get(i));
                }
                if (obj.B == 0) {
                    obj.k0(da0Var2);
                }
                return new lt4(obj.l(obj.B));
            }
        }
        j = -1;
        if (obj.B <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            u = k80Var.u();
            da0Var2 = d;
            if (!u) {
            }
        }
        size = arrayList2.size();
        while (i < size) {
        }
        if (obj.B == 0) {
        }
        return new lt4(obj.l(obj.B));
    }

    public static final da0 e(byte b2) {
        if (b2 != 47) {
            if (b2 == 92) {
                return b;
            }
            i.h(lb1.g(b2, "not a directory separator: "));
            return null;
        }
        return a;
    }

    public static final da0 f(String str) {
        if (nb3.k(str, "/")) {
            return a;
        }
        if (nb3.k(str, "\\")) {
            return b;
        }
        i.h(i61.m("not a directory separator: ", str));
        return null;
    }
}
