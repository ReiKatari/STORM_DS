package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class SoftInputBehaviourPreferencesFragmentKt {
    public static final void a(zy3 zy3Var, String str, String str2, boolean z, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        long j;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1557605748);
        if (sk2Var.f(str)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i7 = i | i2;
        if (sk2Var.f(str2)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i8 = i7 | i3;
        if (sk2Var.g(z)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i9 = i8 | i4;
        if (sk2Var.h(ki2Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i10 = i9 | i5;
        if ((i10 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i10 & 1, z2)) {
            jd7 C = mj2.C(sk2Var);
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L;
            k24 a = bh7.a(l14Var, sk2Var, 6);
            fr5 b = gr5.b(13.0f);
            zy3 t = a53.t(zy3Var, b);
            if (((Boolean) a.getValue()).booleanValue()) {
                i6 = 16;
                j = C.e;
            } else {
                i6 = 16;
                j = C.d;
            }
            zy3 i11 = dk7.i(t, j, iq2.g);
            if (((Boolean) a.getValue()).booleanValue()) {
                i11 = b53.z(2.0f, C.j, i11, b);
            }
            zy3 Y = b53.Y(a53.r(i11, l14Var, null, false, null, ki2Var, 28), 14.0f, 12.0f);
            sr5 a2 = rr5.a(rt.a, y60.h0, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a2);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            xg3 xg3Var = new xg3(1.0f, true);
            lr0 a3 = jr0.a(new ot(3.0f, true, new defpackage.i(1)), y60.j0, sk2Var, 6);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, xg3Var);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a3);
            oo2.S(sk2Var, dnVar2, l2);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            ir6.b(str, null, C.g, hi2.A(13.5d), pe2.c0, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, ((i10 >> 3) & 14) | 199680, 0, 131026);
            ir6.b(str2, null, C.i, hi2.A(11.5d), null, null, 0L, null, hi2.B(i6), 0, false, 0, 0, null, null, sk2Var, ((i10 >> 6) & 14) | 3072, 6, 130034);
            sk2Var = sk2Var;
            sk2Var.p(true);
            if (z) {
                sk2Var.X(1837998997);
                ev2.a(pu.t(), null, o76.h(b53.b0(wy3.a, 12.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14), 22.0f), C.l, sk2Var, 432, 0);
                sk2Var.p(false);
            } else {
                sk2Var.X(1838252050);
                sk2Var.p(false);
            }
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new gi(zy3Var, str, str2, z, ki2Var, i, 5);
        }
    }

    public static final void b(tu0 tu0Var, int i) {
        boolean z;
        zy3 zy3Var;
        boolean z2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1964418877);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i & 1, z)) {
            Context context = (Context) sk2Var.j(ue.b);
            Resources resources = (Resources) sk2Var.j(ue.c);
            Object L = sk2Var.L();
            Object obj = su0.a;
            if (L == obj) {
                L = resources.getStringArray(R.array.soft_input_behaviour);
                sk2Var.h0(L);
            }
            final String[] strArr = (String[]) L;
            strArr.getClass();
            Object L2 = sk2Var.L();
            if (L2 == obj) {
                L2 = resources.getStringArray(R.array.soft_input_behaviour_options);
                sk2Var.h0(L2);
            }
            String[] strArr2 = (String[]) L2;
            strArr2.getClass();
            Object L3 = sk2Var.L();
            if (L3 == obj) {
                L3 = resources.getStringArray(R.array.soft_input_behaviour_descriptions);
                sk2Var.h0(L3);
            }
            String[] strArr3 = (String[]) L3;
            strArr3.getClass();
            Object L4 = sk2Var.L();
            if (L4 == obj) {
                L4 = ts4.a(context);
                sk2Var.h0(L4);
            }
            final SharedPreferences sharedPreferences = (SharedPreferences) L4;
            boolean f = sk2Var.f(sharedPreferences);
            Object L5 = sk2Var.L();
            if (f || L5 == obj) {
                L5 = me2.G((fb6) ((f12) fb6.getEntries()).get(nu.w0(strArr, sharedPreferences.getString("soft_input_behaviour", "hide_system_buttons_when_controller_connected"))));
                sk2Var.h0(L5);
            }
            final k24 k24Var = (k24) L5;
            zy3 Y = b53.Y(mh7.m0(fz5.a(se.Z(dk7.i(o76.c, mj2.C(sk2Var).b, iq2.g), se.R(sk2Var)), false, new fu5(21)), mh7.n), 16.0f, 12.0f);
            lr0 a = jr0.a(new ot(8.0f, true, new defpackage.i(1)), y60.j0, sk2Var, 6);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            ki2 ki2Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(ki2Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, a);
            oo2.S(sk2Var, mu0.e, l);
            oo2.S(sk2Var, mu0.g, Integer.valueOf(hashCode));
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e0);
            sk2Var.X(-808560569);
            int i2 = 0;
            for (Object obj2 : fb6.getEntries()) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    final fb6 fb6Var = (fb6) obj2;
                    zy3 c = o76.c(wy3.a, 1.0f);
                    String str = strArr2[i2];
                    str.getClass();
                    String str2 = strArr3[i2];
                    str2.getClass();
                    if (((fb6) k24Var.getValue()) == fb6Var) {
                        zy3Var = c;
                        z2 = true;
                    } else {
                        zy3Var = c;
                        z2 = false;
                    }
                    boolean f2 = sk2Var.f(k24Var) | sk2Var.d(fb6Var.ordinal()) | sk2Var.h(sharedPreferences) | sk2Var.h(strArr) | sk2Var.d(i2);
                    Object L6 = sk2Var.L();
                    if (f2 || L6 == obj) {
                        final int i4 = i2;
                        L6 = new ki2() { // from class: gb6
                            @Override // defpackage.ki2
                            public final Object c() {
                                k24Var.setValue(fb6.this);
                                SharedPreferences sharedPreferences2 = sharedPreferences;
                                sharedPreferences2.getClass();
                                SharedPreferences.Editor edit = sharedPreferences2.edit();
                                edit.putString("soft_input_behaviour", strArr[i4]);
                                edit.apply();
                                return o27.a;
                            }
                        };
                        sk2Var.h0(L6);
                    }
                    a(zy3Var, str, str2, z2, (ki2) L6, sk2Var, 6);
                    i2 = i3;
                } else {
                    l07.v0();
                    throw null;
                }
            }
            sk2Var.p(false);
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new gu5(i, 11);
        }
    }
}
