package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vs7  reason: default package */
/* loaded from: classes.dex */
public abstract class vs7 {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = lt4.B;
        lt4 p = w31.p("/");
        LinkedHashMap n0 = c14.n0(new vr4(p, new jy7(p, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (jy7 jy7Var : gt0.d1(arrayList, new tp5(15))) {
            if (((jy7) n0.put(jy7Var.a, jy7Var)) == null) {
                while (true) {
                    lt4 lt4Var = jy7Var.a;
                    lt4 b = lt4Var.b();
                    if (b != null) {
                        jy7 jy7Var2 = (jy7) n0.get(b);
                        if (jy7Var2 != null) {
                            jy7Var2.q.add(lt4Var);
                            break;
                        }
                        jy7 jy7Var3 = new jy7(b, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        n0.put(b, jy7Var3);
                        jy7Var3.q.add(lt4Var);
                        jy7Var = jy7Var3;
                    }
                }
            }
        }
        return n0;
    }

    public static final String b(int i) {
        g04.y(16);
        String num = Integer.toString(i, 16);
        num.getClass();
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [zg5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [ch5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [ch5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [ch5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [dh5, java.lang.Object] */
    public static final jy7 c(final fe5 fe5Var) {
        long j;
        int n = fe5Var.n();
        if (n == 33639248) {
            fe5Var.skip(4L);
            short u = fe5Var.u();
            int i = u & 65535;
            if ((u & 1) == 0) {
                int u2 = fe5Var.u() & 65535;
                int u3 = fe5Var.u() & 65535;
                int u4 = fe5Var.u() & 65535;
                long n2 = fe5Var.n() & 4294967295L;
                final ?? obj = new Object();
                obj.A = fe5Var.n() & 4294967295L;
                final ?? obj2 = new Object();
                obj2.A = fe5Var.n() & 4294967295L;
                int u5 = fe5Var.u() & 65535;
                int u6 = fe5Var.u() & 65535;
                fe5Var.skip(8L);
                final ?? obj3 = new Object();
                obj3.A = fe5Var.n() & 4294967295L;
                String v = fe5Var.v(fe5Var.u() & 65535);
                if (!qs6.k0(v, (char) 0)) {
                    if (obj2.A == 4294967295L) {
                        j = 8;
                    } else {
                        j = 0;
                    }
                    if (obj.A == 4294967295L) {
                        j += 8;
                    }
                    if (obj3.A == 4294967295L) {
                        j += 8;
                    }
                    final long j2 = j;
                    final ?? obj4 = new Object();
                    final ?? obj5 = new Object();
                    final ?? obj6 = new Object();
                    final ?? obj7 = new Object();
                    d(fe5Var, u5, new eo2() { // from class: my7
                        @Override // defpackage.eo2
                        public final Object o(Object obj8, Object obj9) {
                            long j3;
                            int intValue = ((Integer) obj8).intValue();
                            long longValue = ((Long) obj9).longValue();
                            fe5 fe5Var2 = fe5Var;
                            if (intValue != 1) {
                                if (intValue == 10) {
                                    if (longValue >= 4) {
                                        fe5Var2.skip(4L);
                                        vs7.d(fe5Var2, (int) (longValue - 4), new ly7(obj4, fe5Var2, obj5, obj6));
                                    } else {
                                        e41.i("bad zip: NTFS extra too short");
                                        return null;
                                    }
                                }
                            } else {
                                zg5 zg5Var = zg5.this;
                                if (!zg5Var.A) {
                                    zg5Var.A = true;
                                    if (longValue >= j2) {
                                        ch5 ch5Var = obj2;
                                        long j4 = ch5Var.A;
                                        if (j4 == 4294967295L) {
                                            j4 = fe5Var2.r();
                                        }
                                        ch5Var.A = j4;
                                        ch5 ch5Var2 = obj;
                                        long j5 = 0;
                                        if (ch5Var2.A == 4294967295L) {
                                            j3 = fe5Var2.r();
                                        } else {
                                            j3 = 0;
                                        }
                                        ch5Var2.A = j3;
                                        ch5 ch5Var3 = obj3;
                                        if (ch5Var3.A == 4294967295L) {
                                            j5 = fe5Var2.r();
                                        }
                                        ch5Var3.A = j5;
                                    } else {
                                        e41.i("bad zip: zip64 extra too short");
                                        return null;
                                    }
                                } else {
                                    e41.i("bad zip: zip64 extra repeated");
                                    return null;
                                }
                            }
                            return jg7.a;
                        }
                    });
                    if (j2 > 0 && !obj7.A) {
                        e41.i("bad zip: zip64 extra required but absent");
                        return null;
                    }
                    String v2 = fe5Var.v(u6);
                    String str = lt4.B;
                    return new jy7(w31.p("/").d(v), xs6.Y(v, "/", false), v2, n2, obj.A, obj2.A, u2, obj3.A, u4, u3, (Long) obj4.A, (Long) obj5.A, (Long) obj6.A, 57344);
                }
                e41.i("bad zip: filename contains 0x00");
                return null;
            }
            e41.i("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        fa6.i("bad zip: expected ", b(33639248), " but was ", b(n));
        return null;
    }

    public static final void d(fe5 fe5Var, int i, eo2 eo2Var) {
        k80 k80Var = fe5Var.B;
        long j = i;
        while (j != 0) {
            if (j >= 4) {
                int u = fe5Var.u() & 65535;
                long u2 = fe5Var.u() & 65535;
                long j2 = j - 4;
                if (j2 >= u2) {
                    fe5Var.g0(u2);
                    long j3 = k80Var.B;
                    eo2Var.o(Integer.valueOf(u), Long.valueOf(u2));
                    long j4 = (k80Var.B + u2) - j3;
                    int i2 = (j4 > 0L ? 1 : (j4 == 0L ? 0 : -1));
                    if (i2 >= 0) {
                        if (i2 > 0) {
                            k80Var.skip(j4);
                        }
                        j = j2 - u2;
                    } else {
                        e41.i(lb1.g(u, "unsupported zip: too many bytes processed for "));
                        return;
                    }
                } else {
                    e41.i("bad zip: truncated value in extra field");
                    return;
                }
            } else {
                e41.i("bad zip: truncated header in extra field");
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [dh5, java.lang.Object] */
    public static final jy7 e(fe5 fe5Var, jy7 jy7Var) {
        int n = fe5Var.n();
        if (n == 67324752) {
            fe5Var.skip(2L);
            short u = fe5Var.u();
            int i = u & 65535;
            if ((u & 1) == 0) {
                fe5Var.skip(18L);
                int u2 = fe5Var.u() & 65535;
                fe5Var.skip(fe5Var.u() & 65535);
                if (jy7Var == null) {
                    fe5Var.skip(u2);
                    return null;
                }
                ?? obj = new Object();
                ?? obj2 = new Object();
                ?? obj3 = new Object();
                d(fe5Var, u2, new ly7(fe5Var, (dh5) obj, (dh5) obj2, (dh5) obj3));
                return new jy7(jy7Var.a, jy7Var.b, jy7Var.c, jy7Var.d, jy7Var.e, jy7Var.f, jy7Var.g, jy7Var.h, jy7Var.i, jy7Var.j, jy7Var.k, jy7Var.l, jy7Var.m, (Integer) obj.A, (Integer) obj2.A, (Integer) obj3.A);
            }
            e41.i("unsupported zip: general purpose bit flag=".concat(b(i)));
            return null;
        }
        fa6.i("bad zip: expected ", b(67324752), " but was ", b(n));
        return null;
    }

    public static void f(i80 i80Var, byte[] bArr) {
        long j;
        i80Var.getClass();
        bArr.getClass();
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = i80Var.X;
            int i2 = i80Var.Y;
            int i3 = i80Var.Z;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = i80Var.R;
            k80 k80Var = i80Var.A;
            k80Var.getClass();
            if (j2 != k80Var.B) {
                long j3 = i80Var.R;
                if (j3 == -1) {
                    j = 0;
                } else {
                    j = j3 + (i80Var.Z - i80Var.Y);
                }
            } else {
                i.m("no more bytes");
                return;
            }
        } while (i80Var.h(j) != -1);
    }
}
