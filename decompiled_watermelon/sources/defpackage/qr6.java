package defpackage;

import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qr6  reason: default package */
/* loaded from: classes.dex */
public final class qr6 {
    public final tj4 a = me2.G(null);
    public to b;
    public final xa6 c;

    public qr6(to toVar) {
        d96 d96Var = new d96(20);
        toVar.getClass();
        ro roVar = new ro(toVar);
        ArrayList arrayList = roVar.L;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) d96Var.n(((qo) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                so soVar = (so) list.get(i2);
                arrayList3.add(new qo(soVar.b, soVar.c, soVar.a, soVar.d));
            }
            tq0.D0(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = roVar.f();
        this.c = new xa6();
    }

    public static so c(so soVar, lr6 lr6Var) {
        q04 q04Var = lr6Var.b;
        int c = q04Var.c(q04Var.f - 1, false);
        if (soVar.b >= c) {
            return null;
        }
        return so.a(soVar, null, Math.min(soVar.c, c), 11);
    }

    public final void a(tu0 tu0Var, int i) {
        int i2;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        xb6 xb6Var;
        xb6 xb6Var2;
        xb6 xb6Var3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1154651354);
        char c2 = 2;
        if (sk2Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z7 = false;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i3 & 1, z)) {
            jm jmVar = (jm) sk2Var.j(ov0.s);
            to toVar = this.b;
            List a = toVar.a(toVar.B.length());
            int size = a.size();
            int i4 = 0;
            while (i4 < size) {
                so soVar = (so) a.get(i4);
                int i5 = soVar.b;
                Object obj = soVar.a;
                if (i5 != soVar.c) {
                    sk2Var.X(725478935);
                    Object L = sk2Var.L();
                    Object obj2 = su0.a;
                    if (L == obj2) {
                        L = b31.f(sk2Var);
                    }
                    l14 l14Var = (l14) L;
                    c = c2;
                    zy3 q = tq5.q(wy3.a, new zr4(19, this, soVar));
                    Object L2 = sk2Var.L();
                    if (L2 == obj2) {
                        z3 = true;
                        L2 = new d96(21);
                        sk2Var.h0(L2);
                    } else {
                        z3 = true;
                    }
                    zy3 Q = mh7.Q(fz5.a(q, z7, (mi2) L2).f(new wr6(new hi0(10, this, soVar))), l14Var);
                    pp4.a.getClass();
                    zy3 Q2 = yf2.Q(Q, l.n);
                    boolean h = sk2Var.h(this) | sk2Var.f(soVar) | sk2Var.h(jmVar);
                    Object L3 = sk2Var.L();
                    if (h || L3 == obj2) {
                        L3 = new eq6(this, soVar, jmVar);
                        sk2Var.h0(L3);
                    }
                    d50.a(a53.v(Q2, l14Var, false, null, (ki2) L3, 508), sk2Var, 0);
                    no3 no3Var = (no3) obj;
                    rr6 a2 = no3Var.a();
                    if (a2 == null || (a2.a == null && a2.b == null && a2.c == null && a2.d == null)) {
                        z2 = false;
                        sk2Var.X(728331710);
                        sk2Var.p(false);
                    } else {
                        sk2Var.X(726303039);
                        Object L4 = sk2Var.L();
                        if (L4 == obj2) {
                            L4 = new to3(l14Var);
                            sk2Var.h0(L4);
                        }
                        to3 to3Var = (to3) L4;
                        Object L5 = sk2Var.L();
                        xb6 xb6Var4 = null;
                        if (L5 == obj2) {
                            L5 = new ys3(to3Var, null, 13);
                            sk2Var.h0(L5);
                        }
                        l.g(sk2Var, (aj2) L5, o27.a);
                        qj4 qj4Var = to3Var.b;
                        qj4 qj4Var2 = to3Var.b;
                        if ((qj4Var.h() & 2) != 0) {
                            z4 = z3;
                        } else {
                            z4 = false;
                        }
                        Boolean valueOf = Boolean.valueOf(z4);
                        if ((qj4Var2.h() & 1) != 0) {
                            z5 = z3;
                        } else {
                            z5 = false;
                        }
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        if ((qj4Var2.h() & 4) != 0) {
                            z6 = z3;
                        } else {
                            z6 = false;
                        }
                        Boolean valueOf3 = Boolean.valueOf(z6);
                        rr6 a3 = no3Var.a();
                        if (a3 != null) {
                            xb6Var = a3.a;
                        } else {
                            xb6Var = null;
                        }
                        rr6 a4 = no3Var.a();
                        if (a4 != null) {
                            xb6Var2 = a4.b;
                        } else {
                            xb6Var2 = null;
                        }
                        rr6 a5 = no3Var.a();
                        if (a5 != null) {
                            xb6Var3 = a5.c;
                        } else {
                            xb6Var3 = null;
                        }
                        rr6 a6 = no3Var.a();
                        if (a6 != null) {
                            xb6Var4 = a6.d;
                        }
                        Object[] objArr = {valueOf, valueOf2, valueOf3, xb6Var, xb6Var2, xb6Var3, xb6Var4};
                        boolean h2 = sk2Var.h(this) | sk2Var.f(soVar);
                        Object L6 = sk2Var.L();
                        if (h2 || L6 == obj2) {
                            L6 = new zr4(this, soVar, to3Var);
                            sk2Var.h0(L6);
                        }
                        b(objArr, (mi2) L6, sk2Var, (i3 << 6) & 896);
                        z2 = false;
                        sk2Var.p(false);
                    }
                    sk2Var.p(z2);
                } else {
                    c = c2;
                    z2 = z7;
                    sk2Var.X(728345598);
                    sk2Var.p(z2);
                }
                i4++;
                z7 = z2;
                c2 = c;
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new bt5(i, 11, this);
        }
    }

    public final void b(Object[] objArr, mi2 mi2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-2083052099);
        if ((i & 48) == 0) {
            if (sk2Var.h(mi2Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(this)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i2 |= i5;
        }
        sk2Var.V(-358306546, Integer.valueOf(objArr.length));
        boolean z2 = false;
        if (sk2Var.d(objArr.length)) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        int i7 = i2 | i3;
        for (Object obj : objArr) {
            if (sk2Var.h(obj)) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            i7 |= i4;
        }
        sk2Var.p(false);
        if ((i7 & 14) == 0) {
            i7 |= 2;
        }
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            vq2 vq2Var = new vq2(2);
            vq2Var.a(mi2Var);
            vq2Var.d(objArr);
            ArrayList arrayList = vq2Var.b;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean h = sk2Var.h(this);
            if ((i7 & 112) == 32) {
                z2 = true;
            }
            boolean z3 = h | z2;
            Object L = sk2Var.L();
            if (z3 || L == su0.a) {
                L = new u10(this, mi2Var, 1);
                sk2Var.h0(L);
            }
            l.f(array, (mi2) L, sk2Var);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(this, objArr, mi2Var, i, 21);
        }
    }
}
