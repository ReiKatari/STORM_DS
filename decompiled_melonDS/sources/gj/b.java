package gj;

import ah.b0;
import fj.a0;
import fj.d0;
import fj.x;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import mc.p;
import nc.s;
import nc.t;
import vc.o;
import yb.y;
import zb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f5683a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c4) {
        if ('0' <= c4 && c4 < ':') {
            return c4 - '0';
        }
        if ('a' <= c4 && c4 < 'g') {
            return c4 - 'W';
        }
        if ('A' <= c4 && c4 < 'G') {
            return c4 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c4);
    }

    public static final LinkedHashMap b(ArrayList arrayList) {
        String str = x.B;
        x l10 = x8.e.l("/");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.E(1));
        v.G(linkedHashMap, new yb.j[]{new yb.j(l10, new j(l10, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))});
        for (j jVar : zb.l.l0(arrayList, new b0(3))) {
            if (((j) linkedHashMap.put(jVar.f5693a, jVar)) == null) {
                while (true) {
                    x xVar = jVar.f5693a;
                    x b10 = xVar.b();
                    if (b10 != null) {
                        j jVar2 = (j) linkedHashMap.get(b10);
                        if (jVar2 != null) {
                            jVar2.f5708q.add(xVar);
                            break;
                        }
                        j jVar3 = new j(b10, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMap.put(b10, jVar3);
                        jVar3.f5708q.add(xVar);
                        jVar = jVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String c(int i2) {
        p7.k.f(16);
        String num = Integer.toString(i2, 16);
        num.getClass();
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [nc.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [nc.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [nc.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [nc.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [nc.t, java.lang.Object] */
    public static final j d(final a0 a0Var) {
        long j2;
        int t5 = a0Var.t();
        if (t5 == 33639248) {
            a0Var.skip(4L);
            short w10 = a0Var.w();
            int i2 = w10 & 65535;
            if ((w10 & 1) == 0) {
                int w11 = a0Var.w() & 65535;
                int w12 = a0Var.w() & 65535;
                int w13 = a0Var.w() & 65535;
                long t10 = a0Var.t() & 4294967295L;
                final ?? obj = new Object();
                obj.A = a0Var.t() & 4294967295L;
                final ?? obj2 = new Object();
                obj2.A = a0Var.t() & 4294967295L;
                int w14 = a0Var.w() & 65535;
                int w15 = a0Var.w() & 65535;
                a0Var.skip(8L);
                final ?? obj3 = new Object();
                obj3.A = a0Var.t() & 4294967295L;
                String z10 = a0Var.z(a0Var.w() & 65535);
                if (!vc.h.Z(z10, (char) 0)) {
                    if (obj2.A == 4294967295L) {
                        j2 = 8;
                    } else {
                        j2 = 0;
                    }
                    if (obj.A == 4294967295L) {
                        j2 += 8;
                    }
                    if (obj3.A == 4294967295L) {
                        j2 += 8;
                    }
                    final long j10 = j2;
                    final ?? obj4 = new Object();
                    final ?? obj5 = new Object();
                    final ?? obj6 = new Object();
                    final ?? obj7 = new Object();
                    e(a0Var, w14, new p() { // from class: gj.l
                        @Override // mc.p
                        public final Object j(Object obj8, Object obj9) {
                            long j11;
                            int intValue = ((Integer) obj8).intValue();
                            long longValue = ((Long) obj9).longValue();
                            a0 a0Var2 = a0Var;
                            if (intValue != 1) {
                                if (intValue == 10) {
                                    if (longValue >= 4) {
                                        a0Var2.skip(4L);
                                        b.e(a0Var2, (int) (longValue - 4), new k(obj4, a0Var2, obj5, obj6));
                                    } else {
                                        fj.j.h("bad zip: NTFS extra too short");
                                        return null;
                                    }
                                }
                            } else {
                                nc.p pVar = nc.p.this;
                                if (!pVar.A) {
                                    pVar.A = true;
                                    if (longValue >= j10) {
                                        s sVar = obj2;
                                        long j12 = sVar.A;
                                        if (j12 == 4294967295L) {
                                            j12 = a0Var2.v();
                                        }
                                        sVar.A = j12;
                                        s sVar2 = obj;
                                        long j13 = 0;
                                        if (sVar2.A == 4294967295L) {
                                            j11 = a0Var2.v();
                                        } else {
                                            j11 = 0;
                                        }
                                        sVar2.A = j11;
                                        s sVar3 = obj3;
                                        if (sVar3.A == 4294967295L) {
                                            j13 = a0Var2.v();
                                        }
                                        sVar3.A = j13;
                                    } else {
                                        fj.j.h("bad zip: zip64 extra too short");
                                        return null;
                                    }
                                } else {
                                    fj.j.h("bad zip: zip64 extra repeated");
                                    return null;
                                }
                            }
                            return y.f14813a;
                        }
                    });
                    if (j10 > 0 && !obj7.A) {
                        fj.j.h("bad zip: zip64 extra required but absent");
                        return null;
                    }
                    String z11 = a0Var.z(w15);
                    String str = x.B;
                    return new j(x8.e.l("/").d(z10), o.O(z10, "/", false), z11, t10, obj.A, obj2.A, w11, obj3.A, w13, w12, (Long) obj4.A, (Long) obj5.A, (Long) obj6.A, 57344);
                }
                fj.j.h("bad zip: filename contains 0x00");
                return null;
            }
            fj.j.h("unsupported zip: general purpose bit flag=".concat(c(i2)));
            return null;
        }
        fj.j.o("bad zip: expected ", c(33639248), " but was ", c(t5));
        return null;
    }

    public static final void e(a0 a0Var, int i2, p pVar) {
        fj.e eVar = a0Var.B;
        long j2 = i2;
        while (j2 != 0) {
            if (j2 >= 4) {
                int w10 = a0Var.w() & 65535;
                long w11 = a0Var.w() & 65535;
                long j10 = j2 - 4;
                if (j10 >= w11) {
                    a0Var.O(w11);
                    long j11 = eVar.B;
                    pVar.j(Integer.valueOf(w10), Long.valueOf(w11));
                    long j12 = (eVar.B + w11) - j11;
                    int i10 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                    if (i10 >= 0) {
                        if (i10 > 0) {
                            eVar.skip(j12);
                        }
                        j2 = j10 - w11;
                    } else {
                        fj.j.h(w.d.l(w10, "unsupported zip: too many bytes processed for "));
                        return;
                    }
                } else {
                    fj.j.h("bad zip: truncated value in extra field");
                    return;
                }
            } else {
                fj.j.h("bad zip: truncated header in extra field");
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [nc.t, java.lang.Object] */
    public static final j f(a0 a0Var, j jVar) {
        int t5 = a0Var.t();
        if (t5 == 67324752) {
            a0Var.skip(2L);
            short w10 = a0Var.w();
            int i2 = w10 & 65535;
            if ((w10 & 1) == 0) {
                a0Var.skip(18L);
                int w11 = a0Var.w() & 65535;
                a0Var.skip(a0Var.w() & 65535);
                if (jVar == null) {
                    a0Var.skip(w11);
                    return null;
                }
                ?? obj = new Object();
                ?? obj2 = new Object();
                ?? obj3 = new Object();
                e(a0Var, w11, new k(a0Var, (t) obj, (t) obj2, (t) obj3));
                return new j(jVar.f5693a, jVar.f5694b, jVar.f5695c, jVar.f5696d, jVar.f5697e, jVar.f5698f, jVar.f5699g, jVar.f5700h, jVar.f5701i, jVar.f5702j, jVar.f5703k, jVar.f5704l, jVar.m, (Integer) obj.A, (Integer) obj2.A, (Integer) obj3.A);
            }
            fj.j.h("unsupported zip: general purpose bit flag=".concat(c(i2)));
            return null;
        }
        fj.j.o("bad zip: expected ", c(67324752), " but was ", c(t5));
        return null;
    }

    public static final int g(d0 d0Var, int i2) {
        int i10;
        int[] iArr = d0Var.Y;
        int i11 = i2 + 1;
        int length = d0Var.X.length;
        iArr.getClass();
        int i12 = length - 1;
        int i13 = 0;
        while (true) {
            if (i13 <= i12) {
                i10 = (i13 + i12) >>> 1;
                int i14 = iArr[i10];
                if (i14 < i11) {
                    i13 = i10 + 1;
                } else if (i14 <= i11) {
                    break;
                } else {
                    i12 = i10 - 1;
                }
            } else {
                i10 = (-i13) - 1;
                break;
            }
        }
        if (i10 >= 0) {
            return i10;
        }
        return ~i10;
    }
}
