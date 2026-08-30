package me.magnum.melonds.ui.settings.fragments;

import a4.f0;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import b3.p;
import b4.r0;
import f1.n;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.h3;
import g2.l5;
import g2.n0;
import l1.m1;
import l1.o1;
import l1.r1;
import l1.u;
import l1.w;
import l1.w0;
import l4.b0;
import me.magnum.melonds.R;
import n2.p1;
import n2.r;
import n2.s;
import n2.t2;
import od.x;
import p7.t;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class SoftInputBehaviourPreferencesFragmentKt {
    public static final void a(p pVar, String str, String str2, boolean z10, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        r rVar = (r) mVar;
        rVar.Z(-1557605748);
        if (rVar.f(str)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i2 | i10;
        if (rVar.f(str2)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (rVar.g(z10)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i16 = i15 | i12;
        if (rVar.h(aVar)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i17 = i16 | i13;
        if ((i17 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i17 & 1, z11)) {
            float f8 = 16;
            p w10 = l1.c.w(n.i(pVar, false, null, aVar, 15), f8, f8, f8, f8);
            o1 a10 = m1.a(l1.i.g(32), b3.c.f1756e0, rVar, 54);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            p c4 = b3.a.c(w10, rVar);
            a4.h.f220a.getClass();
            f0 f0Var = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            a4.f fVar = a4.g.f215e;
            s.C(a10, fVar, rVar);
            a4.f fVar2 = a4.g.f214d;
            s.C(l10, fVar2, rVar);
            Integer valueOf = Integer.valueOf(hashCode);
            a4.f fVar3 = a4.g.f216f;
            s.u(rVar, valueOf, fVar3);
            a4.e eVar = a4.g.f217g;
            s.y(rVar, eVar);
            a4.f fVar4 = a4.g.f213c;
            s.C(c4, fVar4, rVar);
            h3.a(z10, null, false, null, rVar, ((i17 >> 9) & 14) | 48, 60);
            if (1.0f <= 0.0d) {
                m1.a.a("invalid weight; must be greater than zero");
            }
            w0 w0Var = new w0(1.0f, true);
            w a11 = u.a(l1.i.g(4), b3.c.f1758g0, rVar, 6);
            int hashCode2 = Long.hashCode(rVar.T);
            v2.g l11 = rVar.l();
            p c10 = b3.a.c(w0Var, rVar);
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(a11, fVar, rVar);
            s.C(l11, fVar2, rVar);
            w.d.x(hashCode2, rVar, fVar3, rVar, eVar);
            s.C(c10, fVar4, rVar);
            t2 t2Var = g7.f5161b;
            e7.b(str, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar.j(t2Var)).f5150i, rVar, (i17 >> 3) & 14, 0, 65534);
            p7.l.b(str2, null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, ((f7) rVar.j(t2Var)).f5151j, rVar, (i17 >> 6) & 14, 0, 65534);
            rVar = rVar;
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new k(pVar, str, str2, z10, aVar, i2);
        }
    }

    public static final void b(n2.m mVar, int i2) {
        boolean z10;
        ue.a aVar;
        b3.m mVar2;
        boolean z11;
        final String[] strArr;
        r rVar = (r) mVar;
        rVar.Z(1964418877);
        if (i2 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i2 & 1, z10)) {
            Context context = (Context) rVar.j(r0.f1937b);
            Resources resources = (Resources) rVar.j(r0.f1938c);
            Object L = rVar.L();
            Object obj = n2.l.f9953a;
            if (L == obj) {
                L = resources.getStringArray(R.array.soft_input_behaviour);
                rVar.h0(L);
            }
            String[] strArr2 = (String[]) L;
            strArr2.getClass();
            Object L2 = rVar.L();
            if (L2 == obj) {
                L2 = resources.getStringArray(R.array.soft_input_behaviour_options);
                rVar.h0(L2);
            }
            String[] strArr3 = (String[]) L2;
            strArr3.getClass();
            Object L3 = rVar.L();
            if (L3 == obj) {
                L3 = resources.getStringArray(R.array.soft_input_behaviour_descriptions);
                rVar.h0(L3);
            }
            String[] strArr4 = (String[]) L3;
            strArr4.getClass();
            Object L4 = rVar.L();
            if (L4 == obj) {
                L4 = context.getSharedPreferences(androidx.preference.f0.a(context), 0);
                rVar.h0(L4);
            }
            final SharedPreferences sharedPreferences = (SharedPreferences) L4;
            boolean f8 = rVar.f(sharedPreferences);
            Object L5 = rVar.L();
            if (f8 || L5 == obj) {
                L5 = s.w((ue.a) ((fc.b) ue.a.getEntries()).get(zb.k.A(strArr2, sharedPreferences.getString("soft_input_behaviour", "hide_system_buttons_when_controller_connected"))));
                rVar.h0(L5);
            }
            final n2.w0 w0Var = (n2.w0) L5;
            p D = l1.c.D(i4.n.a(n.r(r1.f8615c, n.o(rVar)), false, new x(16)), new l5(26));
            w a10 = u.a(l1.i.f8573c, b3.c.f1758g0, rVar, 0);
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            p c4 = b3.a.c(D, rVar);
            a4.h.f220a.getClass();
            mc.a aVar2 = a4.g.f212b;
            rVar.b0();
            if (rVar.S) {
                rVar.k(aVar2);
            } else {
                rVar.k0();
            }
            s.C(a10, a4.g.f215e, rVar);
            s.C(l10, a4.g.f214d, rVar);
            s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            s.y(rVar, a4.g.f217g);
            s.C(c4, a4.g.f213c, rVar);
            rVar.X(-808560444);
            int i10 = 0;
            for (Object obj2 : ue.a.getEntries()) {
                int i11 = i10 + 1;
                if (i10 >= 0) {
                    ue.a aVar3 = (ue.a) obj2;
                    b3.m mVar3 = b3.m.f1770a;
                    if (i10 > 0) {
                        rVar.X(454805141);
                        aVar = aVar3;
                        mVar2 = mVar3;
                        n0.c(l1.c.x(mVar3, 68, 0.0f, 16, 0.0f, 10), 0L, 0.0f, 0.0f, rVar, 6, 14);
                        rVar.p(false);
                    } else {
                        aVar = aVar3;
                        mVar2 = mVar3;
                        rVar.X(454897397);
                        rVar.p(false);
                    }
                    p b10 = r1.b(mVar2, 1.0f);
                    String str = strArr3[i10];
                    str.getClass();
                    String str2 = strArr4[i10];
                    str2.getClass();
                    if (((ue.a) w0Var.getValue()) == aVar) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean f10 = rVar.f(w0Var) | rVar.d(aVar.ordinal()) | rVar.h(sharedPreferences) | rVar.h(strArr2) | rVar.d(i10);
                    Object L6 = rVar.L();
                    if (f10 || L6 == obj) {
                        strArr = strArr2;
                        final int i12 = i10;
                        final ue.a aVar4 = aVar;
                        Object obj3 = new mc.a() { // from class: me.magnum.melonds.ui.settings.fragments.j
                            @Override // mc.a
                            public final Object b() {
                                w0Var.setValue(ue.a.this);
                                SharedPreferences sharedPreferences2 = sharedPreferences;
                                sharedPreferences2.getClass();
                                SharedPreferences.Editor edit = sharedPreferences2.edit();
                                edit.putString("soft_input_behaviour", strArr[i12]);
                                edit.apply();
                                return y.f14813a;
                            }
                        };
                        rVar.h0(obj3);
                        L6 = obj3;
                    } else {
                        strArr = strArr2;
                    }
                    a(b10, str, str2, z11, (mc.a) L6, rVar, 6);
                    strArr2 = strArr;
                    i10 = i11;
                } else {
                    t.F();
                    throw null;
                }
            }
            rVar.p(false);
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b0(i2);
        }
    }
}
