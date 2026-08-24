package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class SoftInputBehaviourPreferencesFragmentKt {
    public static final void a(a74 a74Var, String str, String str2, boolean z, on2 on2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        long j;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1557605748);
        if (xq2Var.f(str)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i7 = i | i2;
        if (xq2Var.f(str2)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i8 = i7 | i3;
        if (xq2Var.g(z)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i9 = i8 | i4;
        if (xq2Var.h(on2Var)) {
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
        if (xq2Var.S(i10 & 1, z2)) {
            es7 F = bl2.F(xq2Var);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P;
            qa4 a = bw7.a(r94Var, xq2Var, 6);
            y16 b = z16.b(13.0f);
            a74 g = u24.g(a74Var, b);
            if (((Boolean) a.getValue()).booleanValue()) {
                i6 = 16;
                j = F.e;
            } else {
                i6 = 16;
                j = F.d;
            }
            a74 L = vy7.L(g, j, u24.m);
            if (((Boolean) a.getValue()).booleanValue()) {
                L = ak7.I(L, 2.0f, F.j, b);
            }
            a74 P2 = ge7.P(mb3.t(L, r94Var, null, false, null, on2Var, 28), 14.0f, 12.0f);
            l26 a2 = k26.a(ju.a, d90.i0, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = defpackage.l.E(xq2Var, P2);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a2);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a3 = wt0.a(new gu(3.0f, true, new defpackage.i(1)), d90.k0, xq2Var, 6);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = defpackage.l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            x37.b(str, null, F.g, hi2.D(13.5d), oj2.d0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, ((i10 >> 3) & 14) | 199680, 0, 131026);
            x37.b(str2, null, F.i, hi2.D(11.5d), null, null, 0L, null, hi2.E(i6), 0, false, 0, 0, null, null, xq2Var, ((i10 >> 6) & 14) | 3072, 6, 130034);
            xq2Var = xq2Var;
            xq2Var.p(true);
            if (z) {
                xq2Var.b0(1837998997);
                i13.a(jw2.r(), null, dj6.i(ge7.S(x64.a, 12.0f, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 14), 22.0f), F.l, xq2Var, 432, 0);
                xq2Var.p(false);
            } else {
                xq2Var.b0(1838252050);
                xq2Var.p(false);
            }
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new si(a74Var, str, str2, z, on2Var, i, 3);
        }
    }

    public static final void b(px0 px0Var, int i) {
        boolean z;
        a74 a74Var;
        boolean z2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1964418877);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i & 1, z)) {
            Context context = (Context) xq2Var.j(kf.b);
            Resources resources = (Resources) xq2Var.j(kf.c);
            Object P = xq2Var.P();
            Object obj = ox0.a;
            if (P == obj) {
                P = resources.getStringArray(R.array.soft_input_behaviour);
                xq2Var.l0(P);
            }
            final String[] strArr = (String[]) P;
            strArr.getClass();
            Object P2 = xq2Var.P();
            if (P2 == obj) {
                P2 = resources.getStringArray(R.array.soft_input_behaviour_options);
                xq2Var.l0(P2);
            }
            String[] strArr2 = (String[]) P2;
            strArr2.getClass();
            Object P3 = xq2Var.P();
            if (P3 == obj) {
                P3 = resources.getStringArray(R.array.soft_input_behaviour_descriptions);
                xq2Var.l0(P3);
            }
            String[] strArr3 = (String[]) P3;
            strArr3.getClass();
            Object P4 = xq2Var.P();
            if (P4 == obj) {
                P4 = v15.a(context);
                xq2Var.l0(P4);
            }
            final SharedPreferences sharedPreferences = (SharedPreferences) P4;
            boolean f = xq2Var.f(sharedPreferences);
            Object P5 = xq2Var.P();
            if (f || P5 == obj) {
                P5 = np2.Y((um6) ((u52) um6.getEntries()).get(fv.K0(strArr, sharedPreferences.getString("soft_input_behaviour", "hide_system_buttons_when_controller_connected"))));
                xq2Var.l0(P5);
            }
            final qa4 qa4Var = (qa4) P5;
            a74 P6 = ge7.P(nc1.j0(ua6.a(nb3.W(vy7.L(dj6.c, bl2.F(xq2Var).b, u24.m), nb3.U(xq2Var), true), false, new r76(2)), nc1.n), 16.0f, 12.0f);
            yt0 a = wt0.a(new gu(8.0f, true, new defpackage.i(1)), d90.k0, xq2Var, 6);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = defpackage.l.E(xq2Var, P6);
            jx0.i.getClass();
            on2 on2Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(on2Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, a);
            yh2.K(xq2Var, ix0.e, l);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            xq2Var.b0(-808560569);
            int i2 = 0;
            for (Object obj2 : um6.getEntries()) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    final um6 um6Var = (um6) obj2;
                    a74 c = dj6.c(x64.a, 1.0f);
                    String str = strArr2[i2];
                    str.getClass();
                    String str2 = strArr3[i2];
                    str2.getClass();
                    if (((um6) qa4Var.getValue()) == um6Var) {
                        a74Var = c;
                        z2 = true;
                    } else {
                        a74Var = c;
                        z2 = false;
                    }
                    boolean f2 = xq2Var.f(qa4Var) | xq2Var.d(um6Var.ordinal()) | xq2Var.h(sharedPreferences) | xq2Var.h(strArr) | xq2Var.d(i2);
                    Object P7 = xq2Var.P();
                    if (f2 || P7 == obj) {
                        final int i4 = i2;
                        P7 = new on2() { // from class: vm6
                            @Override // defpackage.on2
                            public final Object c() {
                                qa4Var.setValue(um6.this);
                                SharedPreferences sharedPreferences2 = sharedPreferences;
                                sharedPreferences2.getClass();
                                SharedPreferences.Editor edit = sharedPreferences2.edit();
                                edit.putString("soft_input_behaviour", strArr[i4]);
                                edit.apply();
                                return jg7.a;
                            }
                        };
                        xq2Var.l0(P7);
                    }
                    a(a74Var, str, str2, z2, (on2) P7, xq2Var, 6);
                    i2 = i3;
                } else {
                    hf.q0();
                    throw null;
                }
            }
            xq2Var.p(false);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new l56(i);
        }
    }
}
