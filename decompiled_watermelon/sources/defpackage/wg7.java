package defpackage;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wg7  reason: default package */
/* loaded from: classes.dex */
public abstract class wg7 {
    public static final void a(zy3 zy3Var, nt ntVar, qt qtVar, i20 i20Var, int i, int i2, et0 et0Var, tu0 tu0Var, int i3) {
        boolean z;
        i20 i20Var2;
        int i4;
        int i5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1303174015);
        int i6 = i3 | 224256;
        if ((599187 & i6) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i6 & 1, z)) {
            i20 i20Var3 = y60.g0;
            b(zy3Var, ntVar, qtVar, sb2.b, et0Var, sk2Var, 14380470);
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
            i20Var2 = i20Var3;
        } else {
            sk2Var.R();
            i20Var2 = i20Var;
            i4 = i;
            i5 = i2;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new v3(zy3Var, ntVar, qtVar, i20Var2, i4, i5, et0Var, i3);
        }
    }

    public static final void b(zy3 zy3Var, nt ntVar, qt qtVar, sb2 sb2Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i3;
        boolean z8;
        boolean z9;
        boolean z10;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        i20 i20Var = y60.g0;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1956591841);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i2 = i11 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.f(ntVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i2 |= i10;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.f(qtVar)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i2 |= i9;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.f(i20Var)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i2 |= i8;
        }
        if ((i & 24576) == 0) {
            if (sk2Var.d(Preference.DEFAULT_ORDER)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i2 |= i7;
        }
        if ((196608 & i) == 0) {
            if (sk2Var.d(Preference.DEFAULT_ORDER)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i2 |= i6;
        }
        if ((1572864 & i) == 0) {
            if (sk2Var.f(sb2Var)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i2 |= i5;
        }
        if ((12582912 & i) == 0) {
            if (sk2Var.h(et0Var)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i2 |= i4;
        }
        int i12 = i2;
        if ((i12 & 4793491) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i12 & 1, z)) {
            int i13 = i12 & 3670016;
            if (i13 == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (z2 || L == sn1Var) {
                L = new pb2(sb2Var.a);
                sk2Var.h0(L);
            }
            pb2 pb2Var = (pb2) L;
            int i14 = i12 >> 3;
            if ((((i14 & 14) ^ 6) > 4 && sk2Var.f(ntVar)) || (i14 & 6) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((((i14 & 112) ^ 48) > 32 && sk2Var.f(qtVar)) || (i14 & 48) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z11 = z3 | z4;
            if ((((i14 & 896) ^ RendererDebugBridge.CAPTURE_HEIGHT) > 256 && sk2Var.f(i20Var)) || (i14 & RendererDebugBridge.CAPTURE_HEIGHT) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z12 = z11 | z5;
            if ((((i14 & 7168) ^ 3072) > 2048 && sk2Var.d(Preference.DEFAULT_ORDER)) || (i14 & 3072) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z13 = z12 | z6;
            if ((((57344 & i14) ^ 24576) > 16384 && sk2Var.d(Preference.DEFAULT_ORDER)) || (i14 & 24576) == 16384) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean f = z13 | z7 | sk2Var.f(pb2Var);
            Object L2 = sk2Var.L();
            if (!f && L2 != sn1Var) {
                i3 = i13;
            } else {
                i3 = i13;
                rb2 rb2Var = new rb2(ntVar, qtVar, ntVar.a(), new b41(i20Var), qtVar.a(), pb2Var);
                sk2Var.h0(rb2Var);
                L2 = rb2Var;
            }
            rb2 rb2Var2 = (rb2) L2;
            if (i3 == 1048576) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((i12 & 29360128) == 8388608) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z14 = z8 | z9;
            if ((i12 & 458752) == 131072) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z15 = z14 | z10;
            Object L3 = sk2Var.L();
            ArrayList arrayList = L3;
            if (z15 || L3 == sn1Var) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new et0(-1192950673, true, new sp(et0Var, 3)));
                sb2Var.getClass();
                int i15 = mb2.a[sb2Var.a.ordinal()];
                sk2Var.h0(arrayList2);
                arrayList = arrayList2;
            }
            et0 et0Var2 = new et0(1271844412, true, new n0(6, (List) arrayList));
            boolean f2 = sk2Var.f(rb2Var2);
            Object L4 = sk2Var.L();
            if (f2 || L4 == sn1Var) {
                L4 = new m04(rb2Var2);
                sk2Var.h0(L4);
            }
            tv3 tv3Var = (tv3) L4;
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, tv3Var);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            et0Var2.j(sk2Var, 0);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new r4(zy3Var, (Object) ntVar, (Object) qtVar, (Object) sb2Var, (wi2) et0Var, i, 3);
        }
    }

    public static final vg7 c(long j, Set set, Set set2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (ji1.a(ni1.b(j), ((ji1) obj).A) >= 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            float f = ((ji1) it.next()).A;
            while (it.hasNext()) {
                f = Math.max(f, ((ji1) it.next()).A);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set2) {
                if (ji1.a(ni1.a(j), ((ji1) obj2).A) >= 0) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                float f2 = ((ji1) it2.next()).A;
                while (it2.hasNext()) {
                    f2 = Math.max(f2, ((ji1) it2.next()).A);
                }
                return new vg7((int) f, (int) f2);
            }
            vd6.b();
            return null;
        }
        vd6.b();
        return null;
    }

    public static final void d(mv3 mv3Var, rb2 rb2Var, long j, mi2 mi2Var) {
        if (oo2.M(oo2.K(mv3Var)) == RecyclerView.A1) {
            oo2.K(mv3Var);
            yn4 c = mv3Var.c(j);
            mi2Var.n(c);
            rb2Var.getClass();
            c.l0();
            c.k0();
            return;
        }
        rb2Var.getClass();
        mv3Var.g0(mv3Var.T(Preference.DEFAULT_ORDER));
    }
}
