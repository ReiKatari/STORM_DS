package l4;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final p1.a0 f8821a = new p1.a0(28, new b0(13, (byte) 0), new c0(3));

    /* renamed from: b  reason: collision with root package name */
    public static final p1.a0 f8822b = new p1.a0(28, new b0(14, (byte) 0), new c0(4));

    /* renamed from: c  reason: collision with root package name */
    public static final p1.a0 f8823c = new p1.a0(28, new b0(15, (byte) 0), new c0(5));

    /* renamed from: d  reason: collision with root package name */
    public static final p1.a0 f8824d = new p1.a0(28, new b0(16, (byte) 0), new c0(6));

    /* renamed from: e  reason: collision with root package name */
    public static final p1.a0 f8825e = new p1.a0(28, new b0(17, (byte) 0), new c0(7));

    public static b a(String str, r0 r0Var, long j2, x4.c cVar, p4.d dVar, int i2, int i10) {
        zb.q qVar = zb.q.A;
        return new b(new t4.c(str, r0Var, qVar, qVar, dVar, cVar), i2, 1, j2);
    }

    public static final long b(int i2, int i10) {
        if (i2 < 0 || i10 < 0) {
            r4.a.a("start and end cannot be negative. [start: " + i2 + ", end: " + i10 + ']');
        }
        long j2 = (i10 & 4294967295L) | (i2 << 32);
        int i11 = q0.f8884c;
        return j2;
    }

    public static final long c(int i2, long j2) {
        int i10;
        int i11 = q0.f8884c;
        int i12 = (int) (j2 >> 32);
        int i13 = 0;
        if (i12 < 0) {
            i10 = 0;
        } else {
            i10 = i12;
        }
        if (i10 > i2) {
            i10 = i2;
        }
        int i14 = (int) (4294967295L & j2);
        if (i14 >= 0) {
            i13 = i14;
        }
        if (i13 <= i2) {
            i2 = i13;
        }
        if (i10 == i12 && i2 == i14) {
            return j2;
        }
        return b(i10, i2);
    }

    public static final int d(int i2, List list) {
        int i10;
        char c4;
        int i11 = ((s) zb.l.Z(list)).f8892c;
        if (i2 > ((s) zb.l.Z(list)).f8892c) {
            r4.a.a("Index " + i2 + " should be less or equal than last line's end " + i11);
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 <= size) {
                i10 = (i12 + size) >>> 1;
                s sVar = (s) list.get(i10);
                if (sVar.f8891b > i2) {
                    c4 = 1;
                } else if (sVar.f8892c <= i2) {
                    c4 = 65535;
                } else {
                    c4 = 0;
                }
                if (c4 < 0) {
                    i12 = i10 + 1;
                } else if (c4 <= 0) {
                    break;
                } else {
                    size = i10 - 1;
                }
            } else {
                i10 = -(i12 + 1);
                break;
            }
        }
        if (i10 >= 0 && i10 < list.size()) {
            return i10;
        }
        StringBuilder i13 = kc.a.i("Found paragraph index ", i10, " should be in range [0, ");
        i13.append(list.size());
        i13.append(").\nDebug info: index=");
        i13.append(i2);
        i13.append(", paragraphs=[");
        i13.append(z4.a.a(list, null, new i(1), 31));
        i13.append(']');
        r4.a.a(i13.toString());
        return i10;
    }

    public static final int e(int i2, List list) {
        char c4;
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            s sVar = (s) list.get(i11);
            if (sVar.f8893d > i2) {
                c4 = 1;
            } else if (sVar.f8894e <= i2) {
                c4 = 65535;
            } else {
                c4 = 0;
            }
            if (c4 < 0) {
                i10 = i11 + 1;
            } else if (c4 > 0) {
                size = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public static final int f(ArrayList arrayList, float f8) {
        char c4;
        if (f8 <= 0.0f) {
            return 0;
        }
        if (f8 >= ((s) zb.l.Z(arrayList)).f8896g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i10 = (i2 + size) >>> 1;
            s sVar = (s) arrayList.get(i10);
            if (sVar.f8895f > f8) {
                c4 = 1;
            } else if (sVar.f8896g <= f8) {
                c4 = 65535;
            } else {
                c4 = 0;
            }
            if (c4 < 0) {
                i2 = i10 + 1;
            } else if (c4 > 0) {
                size = i10 - 1;
            } else {
                return i10;
            }
        }
        return -(i2 + 1);
    }

    public static final void g(ArrayList arrayList, long j2, mc.l lVar) {
        int size = arrayList.size();
        for (int d4 = d(q0.f(j2), arrayList); d4 < size; d4++) {
            s sVar = (s) arrayList.get(d4);
            if (sVar.f8891b < q0.e(j2)) {
                if (sVar.f8891b != sVar.f8892c) {
                    lVar.k(sVar);
                }
            } else {
                return;
            }
        }
    }

    public static final r0 h(r0 r0Var, x4.m mVar) {
        int i2;
        int i10;
        float f8;
        j0 j0Var = r0Var.f8887a;
        w4.o oVar = k0.f8845d;
        w4.o oVar2 = j0Var.f8827a;
        if (oVar2.equals(w4.n.f14148a)) {
            oVar2 = k0.f8845d;
        }
        w4.o oVar3 = oVar2;
        long j2 = j0Var.f8828b;
        x4.p[] pVarArr = x4.o.f14348b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = k0.f8842a;
        }
        long j10 = j2;
        p4.j jVar = j0Var.f8829c;
        if (jVar == null) {
            jVar = p4.j.R;
        }
        p4.j jVar2 = jVar;
        p4.h hVar = j0Var.f8830d;
        if (hVar != null) {
            i2 = hVar.f11311a;
        } else {
            i2 = 0;
        }
        p4.h hVar2 = new p4.h(i2);
        p4.i iVar = j0Var.f8831e;
        if (iVar != null) {
            i10 = iVar.f11312a;
        } else {
            i10 = 65535;
        }
        p4.i iVar2 = new p4.i(i10);
        p4.p pVar = j0Var.f8832f;
        if (pVar == null) {
            pVar = p4.p.f11315a;
        }
        p4.p pVar2 = pVar;
        String str = j0Var.f8833g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j11 = j0Var.f8834h;
        if ((j11 & 1095216660480L) == 0) {
            j11 = k0.f8843b;
        }
        long j12 = j11;
        w4.a aVar = j0Var.f8835i;
        float f10 = 0.0f;
        if (aVar != null) {
            f8 = aVar.f14125a;
        } else {
            f8 = 0.0f;
        }
        if (!Float.isNaN(f8)) {
            f10 = f8;
        }
        w4.a aVar2 = new w4.a(f10);
        w4.p pVar3 = j0Var.f8836j;
        if (pVar3 == null) {
            pVar3 = w4.p.f14149c;
        }
        w4.p pVar4 = pVar3;
        s4.b bVar = j0Var.f8837k;
        if (bVar == null) {
            s4.b bVar2 = s4.b.L;
            bVar = s4.c.f12833a.f();
        }
        s4.b bVar3 = bVar;
        long j13 = j0Var.f8838l;
        if (j13 == 16) {
            j13 = k0.f8844c;
        }
        long j14 = j13;
        w4.l lVar = j0Var.m;
        if (lVar == null) {
            lVar = w4.l.f14143b;
        }
        w4.l lVar2 = lVar;
        i3.m0 m0Var = j0Var.f8839n;
        if (m0Var == null) {
            m0Var = i3.m0.f6659d;
        }
        i3.m0 m0Var2 = m0Var;
        z zVar = j0Var.f8840o;
        k3.e eVar = j0Var.f8841p;
        if (eVar == null) {
            eVar = k3.g.f7961a;
        }
        j0 j0Var2 = new j0(oVar3, j10, jVar2, hVar2, iVar2, pVar2, str2, j12, aVar2, pVar4, bVar3, j14, lVar2, m0Var2, zVar, eVar);
        v vVar = r0Var.f8888b;
        int i11 = w.f8913b;
        int i12 = vVar.f8903a;
        int i13 = 5;
        if (i12 == 0) {
            i12 = 5;
        }
        int i14 = vVar.f8904b;
        if (i14 == 3) {
            int i15 = s0.f8897a[mVar.ordinal()];
            if (i15 != 1) {
                if (i15 != 2) {
                    m9.o.o();
                    return null;
                }
            } else {
                i13 = 4;
            }
            i14 = i13;
        } else if (i14 == 0) {
            int i16 = s0.f8897a[mVar.ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    i14 = 2;
                } else {
                    m9.o.o();
                    return null;
                }
            } else {
                i14 = 1;
            }
        }
        long j15 = vVar.f8905c;
        if ((j15 & 1095216660480L) == 0) {
            j15 = w.f8912a;
        }
        w4.q qVar = vVar.f8906d;
        if (qVar == null) {
            qVar = w4.q.f14152c;
        }
        y yVar = vVar.f8907e;
        w4.i iVar3 = vVar.f8908f;
        int i17 = vVar.f8909g;
        if (i17 == 0) {
            i17 = w4.e.f14130b;
        }
        int i18 = vVar.f8910h;
        if (i18 == 0) {
            i18 = 1;
        }
        w4.s sVar = vVar.f8911i;
        if (sVar == null) {
            sVar = w4.s.f14156c;
        }
        return new r0(j0Var2, new v(i12, i14, j15, qVar, yVar, iVar3, i17, i18, sVar), r0Var.f8889c);
    }
}
