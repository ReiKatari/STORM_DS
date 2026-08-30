package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t5  reason: default package */
/* loaded from: classes.dex */
public final class t5 implements cj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ mi2 L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public t5(List list, mi2 mi2Var, aj2 aj2Var, ih4 ih4Var) {
        this.A = 2;
        this.B = list;
        this.L = mi2Var;
        this.X = aj2Var;
        this.R = ih4Var;
    }

    @Override // defpackage.cj2
    public final Object q(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        int i6;
        int i7;
        boolean z4;
        boolean z5;
        int i8;
        int i9;
        boolean z6;
        ax2 A;
        boolean z7;
        boolean h;
        Object L;
        int i10;
        int i11;
        int i12;
        wc2 wc2Var;
        int i13;
        int i14;
        boolean z8;
        boolean z9;
        int i15;
        int i16;
        int i17 = this.A;
        wy3 wy3Var = wy3.a;
        mi2 mi2Var = this.L;
        o27 o27Var = o27.a;
        Object obj5 = su0.a;
        Object obj6 = this.X;
        Object obj7 = this.R;
        List list = this.B;
        int i18 = 2;
        boolean z10 = true;
        switch (i17) {
            case 0:
                ni3 ni3Var = (ni3) obj;
                int intValue = ((Number) obj2).intValue();
                tu0 tu0Var = (tu0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                aj2 aj2Var = (aj2) obj6;
                if ((intValue2 & 6) == 0) {
                    if (((sk2) tu0Var).f(ni3Var)) {
                        i18 = 4;
                    }
                    i = intValue2 | i18;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (((sk2) tu0Var).d(intValue)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    i |= i2;
                }
                if ((i & 147) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(i & 1, z)) {
                    n6 n6Var = (n6) list.get(intValue);
                    sk2Var.X(1214860516);
                    boolean contains = ((Set) obj7).contains(Long.valueOf(n6Var.a().a));
                    zy3 b0 = b53.b0(o76.c(wy3Var, 1.0f), RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 8.0f, 7);
                    boolean f = sk2Var.f(aj2Var) | sk2Var.f(n6Var) | sk2Var.g(contains);
                    Object L2 = sk2Var.L();
                    if (f || L2 == obj5) {
                        L2 = new r5(aj2Var, n6Var, contains);
                        sk2Var.h0(L2);
                    }
                    jv3.i(b0, n6Var, contains, (ki2) L2, this.L, sk2Var, 6);
                    sk2Var.p(false);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 1:
                ni3 ni3Var2 = (ni3) obj;
                int intValue3 = ((Number) obj2).intValue();
                tu0 tu0Var2 = (tu0) obj3;
                int intValue4 = ((Number) obj4).intValue();
                mi2 mi2Var2 = (mi2) obj6;
                k24 k24Var = (k24) obj7;
                if ((intValue4 & 6) == 0) {
                    if (((sk2) tu0Var2).f(ni3Var2)) {
                        i18 = 4;
                    }
                    i3 = intValue4 | i18;
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((sk2) tu0Var2).d(intValue3)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    i3 |= i4;
                }
                if ((i3 & 147) != 146) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(i3 & 1, z2)) {
                    Cheat cheat = (Cheat) list.get(intValue3);
                    sk2Var2.X(-517224611);
                    zy3 c = o76.c(wy3Var, 1.0f);
                    boolean f2 = sk2Var2.f(mi2Var) | sk2Var2.f(cheat);
                    Object L3 = sk2Var2.L();
                    if (f2 || L3 == obj5) {
                        L3 = new yl0(mi2Var, cheat, 0);
                        sk2Var2.h0(L3);
                    }
                    ki2 ki2Var = (ki2) L3;
                    boolean f3 = sk2Var2.f(k24Var) | sk2Var2.f(cheat);
                    Object L4 = sk2Var2.L();
                    if (f3 || L4 == obj5) {
                        L4 = new j5(3, cheat, k24Var);
                        sk2Var2.h0(L4);
                    }
                    ki2 ki2Var2 = (ki2) L4;
                    boolean f4 = sk2Var2.f(mi2Var2) | sk2Var2.f(cheat);
                    Object L5 = sk2Var2.L();
                    if (f4 || L5 == obj5) {
                        L5 = new yl0(mi2Var2, cheat, 1);
                        sk2Var2.h0(L5);
                    }
                    jv3.e(c, cheat, ki2Var, ki2Var2, (ki2) L5, sk2Var2, 6);
                    sk2Var2.p(false);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case 2:
                ni3 ni3Var3 = (ni3) obj;
                int intValue5 = ((Number) obj2).intValue();
                tu0 tu0Var3 = (tu0) obj3;
                int intValue6 = ((Number) obj4).intValue();
                aj2 aj2Var2 = (aj2) obj6;
                if ((intValue6 & 6) == 0) {
                    if (((sk2) tu0Var3).f(ni3Var3)) {
                        i18 = 4;
                    }
                    i5 = intValue6 | i18;
                } else {
                    i5 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (((sk2) tu0Var3).d(intValue5)) {
                        i6 = 32;
                    } else {
                        i6 = 16;
                    }
                    i5 |= i6;
                }
                if ((i5 & 147) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (sk2Var3.O(i5 & 1, z3)) {
                    rg5 rg5Var = (rg5) list.get(intValue5);
                    sk2Var3.X(-568966401);
                    zy3 c2 = o76.c(wy3Var, 1.0f);
                    boolean f5 = sk2Var3.f(mi2Var) | sk2Var3.h(rg5Var);
                    Object L6 = sk2Var3.L();
                    if (f5 || L6 == obj5) {
                        L6 = new f71(mi2Var, rg5Var, 0);
                        sk2Var3.h0(L6);
                    }
                    ki2 ki2Var3 = (ki2) L6;
                    boolean h2 = sk2Var3.h(aj2Var2) | sk2Var3.h(rg5Var);
                    Object L7 = sk2Var3.L();
                    if (h2 || L7 == obj5) {
                        L7 = new kc(aj2Var2, rg5Var, null, 4);
                        sk2Var3.h0(L7);
                    }
                    an5.a(c2, rg5Var, ki2Var3, (mi2) L7, (ih4) obj7, sk2Var3, 6);
                    sk2Var3.p(false);
                } else {
                    sk2Var3.R();
                }
                return o27Var;
            case 3:
                ni3 ni3Var4 = (ni3) obj;
                int intValue7 = ((Number) obj2).intValue();
                tu0 tu0Var4 = (tu0) obj3;
                int intValue8 = ((Number) obj4).intValue();
                mi2 mi2Var3 = (mi2) obj6;
                if ((intValue8 & 6) == 0) {
                    if (((sk2) tu0Var4).f(ni3Var4)) {
                        i18 = 4;
                    }
                    i7 = intValue8 | i18;
                } else {
                    i7 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    if (((sk2) tu0Var4).d(intValue7)) {
                        i8 = 32;
                    } else {
                        i8 = 16;
                    }
                    i7 |= i8;
                }
                if ((i7 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (sk2Var4.O(i7 & 1, z4)) {
                    f03 f03Var = (f03) list.get(intValue7);
                    sk2Var4.X(-867420325);
                    if (f03Var.a == ((yz2) obj7)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean f6 = sk2Var4.f(mi2Var) | sk2Var4.f(f03Var);
                    Object L8 = sk2Var4.L();
                    if (f6 || L8 == obj5) {
                        L8 = new n13(mi2Var, f03Var);
                        sk2Var4.h0(L8);
                    }
                    ki2 ki2Var4 = (ki2) L8;
                    boolean f7 = sk2Var4.f(mi2Var3) | sk2Var4.f(f03Var);
                    Object L9 = sk2Var4.L();
                    if (f7 || L9 == obj5) {
                        L9 = new o13(mi2Var3, f03Var);
                        sk2Var4.h0(L9);
                    }
                    q13.a(f03Var, z5, ki2Var4, (ki2) L9, sk2Var4, 0);
                    sk2Var4.p(false);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            case 4:
                th3 th3Var = (th3) obj;
                int intValue9 = ((Number) obj2).intValue();
                tu0 tu0Var5 = (tu0) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    if (((sk2) tu0Var5).f(th3Var)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    i9 = intValue10 | i11;
                } else {
                    i9 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    if (((sk2) tu0Var5).d(intValue9)) {
                        i10 = 32;
                    } else {
                        i10 = 16;
                    }
                    i9 |= i10;
                }
                if ((i9 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                sk2 sk2Var5 = (sk2) tu0Var5;
                if (sk2Var5.O(i9 & 1, z6)) {
                    ll4 ll4Var = (ll4) list.get(intValue9);
                    sk2Var5.X(-1828302986);
                    ll4Var.getClass();
                    String str = (String) ((kl4) obj7).b.get(ll4Var);
                    if (str == null) {
                        sk2Var5.X(772308564);
                        str = me2.X(sk2Var5, ll4Var.getTextResource());
                    } else {
                        sk2Var5.X(772307479);
                    }
                    sk2Var5.p(false);
                    String str2 = str;
                    if (ll4Var instanceof cp5) {
                        switch (nl4.a[((cp5) ll4Var).ordinal()]) {
                            case 1:
                                A = mj2.A();
                                break;
                            case 2:
                                A = cg2.J();
                                break;
                            case 3:
                                A = mj2.z();
                                break;
                            case 4:
                                A = jv3.B();
                                break;
                            case 5:
                                A = dt3.p0;
                                if (A == null) {
                                    zw2 zw2Var = new zw2("Filled.FastRewind", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i19 = f77.a;
                                    mb6 mb6Var = new mb6(xq0.b);
                                    vq2 vq2Var = new vq2(1, (byte) 0);
                                    vq2Var.o(11.0f, 18.0f);
                                    vq2Var.m(11.0f, 6.0f);
                                    vq2Var.n(-8.5f, 6.0f);
                                    vq2Var.n(8.5f, 6.0f);
                                    vq2Var.g();
                                    vq2Var.o(11.5f, 12.0f);
                                    vq2Var.n(8.5f, 6.0f);
                                    vq2Var.m(20.0f, 6.0f);
                                    vq2Var.n(-8.5f, 6.0f);
                                    vq2Var.g();
                                    zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
                                    A = zw2Var.b();
                                    dt3.p0 = A;
                                    break;
                                }
                                break;
                            case ig7.b /* 6 */:
                                A = f34.m;
                                if (A == null) {
                                    zw2 zw2Var2 = new zw2("Filled.Code", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i20 = f77.a;
                                    mb6 mb6Var2 = new mb6(xq0.b);
                                    vq2 vq2Var2 = new vq2(1, (byte) 0);
                                    vq2Var2.o(9.4f, 16.6f);
                                    vq2Var2.m(4.8f, 12.0f);
                                    vq2Var2.n(4.6f, -4.6f);
                                    vq2Var2.m(8.0f, 6.0f);
                                    vq2Var2.n(-6.0f, 6.0f);
                                    vq2Var2.n(6.0f, 6.0f);
                                    vq2Var2.n(1.4f, -1.4f);
                                    vq2Var2.g();
                                    vq2Var2.o(14.6f, 16.6f);
                                    vq2Var2.n(4.6f, -4.6f);
                                    vq2Var2.n(-4.6f, -4.6f);
                                    vq2Var2.m(16.0f, 6.0f);
                                    vq2Var2.n(6.0f, 6.0f);
                                    vq2Var2.n(-6.0f, 6.0f);
                                    vq2Var2.n(-1.4f, -1.4f);
                                    vq2Var2.g();
                                    zw2.a(zw2Var2, vq2Var2.b, 0, mb6Var2);
                                    A = zw2Var2.b();
                                    f34.m = A;
                                    break;
                                }
                                break;
                            case 7:
                                A = mh7.N();
                                break;
                            case 8:
                                A = jv3.n;
                                if (A == null) {
                                    zw2 zw2Var3 = new zw2("Filled.CloudSync", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i21 = f77.a;
                                    mb6 mb6Var3 = new mb6(xq0.b);
                                    vq2 vq2Var3 = new vq2(1, (byte) 0);
                                    vq2Var3.o(21.5f, 14.98f);
                                    vq2Var3.i(-0.02f, RecyclerView.A1, -0.03f, RecyclerView.A1, -0.05f, 0.01f);
                                    vq2Var3.h(21.2f, 13.3f, 19.76f, 12.0f, 18.0f, 12.0f);
                                    vq2Var3.i(-1.4f, RecyclerView.A1, -2.6f, 0.83f, -3.16f, 2.02f);
                                    vq2Var3.h(13.26f, 14.1f, 12.0f, 15.4f, 12.0f, 17.0f);
                                    vq2Var3.i(RecyclerView.A1, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                                    vq2Var3.n(6.5f, -0.02f);
                                    vq2Var3.i(1.38f, RecyclerView.A1, 2.5f, -1.12f, 2.5f, -2.5f);
                                    vq2Var3.p(22.88f, 14.98f, 21.5f, 14.98f);
                                    vq2Var3.g();
                                    vq2Var3.o(10.0f, 4.26f);
                                    vq2Var3.u(2.09f);
                                    vq2Var3.h(7.67f, 7.18f, 6.0f, 9.39f, 6.0f, 12.0f);
                                    vq2Var3.i(RecyclerView.A1, 1.77f, 0.78f, 3.34f, 2.0f, 4.44f);
                                    vq2Var3.t(14.0f);
                                    vq2Var3.l(2.0f);
                                    vq2Var3.u(6.0f);
                                    vq2Var3.k(4.0f);
                                    vq2Var3.u(-2.0f);
                                    vq2Var3.l(2.73f);
                                    vq2Var3.h(5.06f, 16.54f, 4.0f, 14.4f, 4.0f, 12.0f);
                                    vq2Var3.h(4.0f, 8.27f, 6.55f, 5.15f, 10.0f, 4.26f);
                                    vq2Var3.g();
                                    vq2Var3.o(20.0f, 6.0f);
                                    vq2Var3.l(-2.73f);
                                    vq2Var3.i(1.43f, 1.26f, 2.41f, 3.01f, 2.66f, 5.0f);
                                    vq2Var3.n(-2.02f, RecyclerView.A1);
                                    vq2Var3.h(17.68f, 9.64f, 16.98f, 8.45f, 16.0f, 7.56f);
                                    vq2Var3.t(10.0f);
                                    vq2Var3.l(-2.0f);
                                    vq2Var3.t(4.0f);
                                    vq2Var3.l(6.0f);
                                    vq2Var3.t(6.0f);
                                    vq2Var3.g();
                                    zw2.a(zw2Var3, vq2Var3.b, 0, mb6Var3);
                                    A = zw2Var3.b();
                                    jv3.n = A;
                                    break;
                                }
                                break;
                            case 9:
                                A = sn2.b;
                                if (A == null) {
                                    zw2 zw2Var4 = new zw2("Filled.Monitor", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i22 = f77.a;
                                    mb6 mb6Var4 = new mb6(xq0.b);
                                    vq2 vq2Var4 = new vq2(1, (byte) 0);
                                    vq2Var4.o(20.0f, 3.0f);
                                    vq2Var4.m(4.0f, 3.0f);
                                    vq2Var4.i(-1.1f, RecyclerView.A1, -2.0f, 0.9f, -2.0f, 2.0f);
                                    vq2Var4.u(11.0f);
                                    vq2Var4.i(RecyclerView.A1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                    vq2Var4.l(3.0f);
                                    vq2Var4.n(-1.0f, 1.0f);
                                    vq2Var4.u(2.0f);
                                    vq2Var4.l(12.0f);
                                    vq2Var4.u(-2.0f);
                                    vq2Var4.n(-1.0f, -1.0f);
                                    vq2Var4.l(3.0f);
                                    vq2Var4.i(1.1f, RecyclerView.A1, 2.0f, -0.9f, 2.0f, -2.0f);
                                    vq2Var4.m(22.0f, 5.0f);
                                    vq2Var4.i(RecyclerView.A1, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                    vq2Var4.g();
                                    vq2Var4.o(20.0f, 16.0f);
                                    vq2Var4.m(4.0f, 16.0f);
                                    vq2Var4.m(4.0f, 5.0f);
                                    vq2Var4.l(16.0f);
                                    vq2Var4.u(11.0f);
                                    vq2Var4.g();
                                    zw2.a(zw2Var4, vq2Var4.b, 0, mb6Var4);
                                    A = zw2Var4.b();
                                    sn2.b = A;
                                    break;
                                }
                                break;
                            case 10:
                                A = f34.l;
                                if (A == null) {
                                    zw2 zw2Var5 = new zw2("Filled.BugReport", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i23 = f77.a;
                                    mb6 mb6Var5 = new mb6(xq0.b);
                                    vq2 vq2Var5 = new vq2(1, (byte) 0);
                                    vq2Var5.o(20.0f, 8.0f);
                                    vq2Var5.l(-2.81f);
                                    vq2Var5.i(-0.45f, -0.78f, -1.07f, -1.45f, -1.82f, -1.96f);
                                    vq2Var5.m(17.0f, 4.41f);
                                    vq2Var5.m(15.59f, 3.0f);
                                    vq2Var5.n(-2.17f, 2.17f);
                                    vq2Var5.h(12.96f, 5.06f, 12.49f, 5.0f, 12.0f, 5.0f);
                                    vq2Var5.i(-0.49f, RecyclerView.A1, -0.96f, 0.06f, -1.41f, 0.17f);
                                    vq2Var5.m(8.41f, 3.0f);
                                    vq2Var5.m(7.0f, 4.41f);
                                    vq2Var5.n(1.62f, 1.63f);
                                    vq2Var5.h(7.88f, 6.55f, 7.26f, 7.22f, 6.81f, 8.0f);
                                    vq2Var5.m(4.0f, 8.0f);
                                    vq2Var5.u(2.0f);
                                    vq2Var5.l(2.09f);
                                    vq2Var5.i(-0.05f, 0.33f, -0.09f, 0.66f, -0.09f, 1.0f);
                                    vq2Var5.u(1.0f);
                                    vq2Var5.m(4.0f, 12.0f);
                                    vq2Var5.u(2.0f);
                                    vq2Var5.l(2.0f);
                                    vq2Var5.u(1.0f);
                                    vq2Var5.i(RecyclerView.A1, 0.34f, 0.04f, 0.67f, 0.09f, 1.0f);
                                    vq2Var5.m(4.0f, 16.0f);
                                    vq2Var5.u(2.0f);
                                    vq2Var5.l(2.81f);
                                    vq2Var5.i(1.04f, 1.79f, 2.97f, 3.0f, 5.19f, 3.0f);
                                    vq2Var5.q(4.15f, -1.21f, 5.19f, -3.0f);
                                    vq2Var5.m(20.0f, 18.0f);
                                    vq2Var5.u(-2.0f);
                                    vq2Var5.l(-2.09f);
                                    vq2Var5.i(0.05f, -0.33f, 0.09f, -0.66f, 0.09f, -1.0f);
                                    vq2Var5.u(-1.0f);
                                    vq2Var5.l(2.0f);
                                    vq2Var5.u(-2.0f);
                                    vq2Var5.l(-2.0f);
                                    vq2Var5.u(-1.0f);
                                    vq2Var5.i(RecyclerView.A1, -0.34f, -0.04f, -0.67f, -0.09f, -1.0f);
                                    vq2Var5.m(20.0f, 10.0f);
                                    vq2Var5.m(20.0f, 8.0f);
                                    vq2Var5.g();
                                    vq2Var5.o(14.0f, 16.0f);
                                    vq2Var5.l(-4.0f);
                                    vq2Var5.u(-2.0f);
                                    vq2Var5.l(4.0f);
                                    vq2Var5.u(2.0f);
                                    vq2Var5.g();
                                    vq2Var5.o(14.0f, 12.0f);
                                    vq2Var5.l(-4.0f);
                                    vq2Var5.u(-2.0f);
                                    vq2Var5.l(4.0f);
                                    vq2Var5.u(2.0f);
                                    vq2Var5.g();
                                    zw2.a(zw2Var5, vq2Var5.b, 0, mb6Var5);
                                    A = zw2Var5.b();
                                    f34.l = A;
                                    break;
                                }
                                break;
                            case 11:
                                A = ep2.v();
                                break;
                            case mj2.L /* 12 */:
                                A = yf2.v();
                                break;
                            default:
                                i.c();
                                return null;
                        }
                        ax2 ax2Var = A;
                        if (ll4Var == cp5.RESET && ll4Var != cp5.EXIT && ll4Var != k82.RESET && ll4Var != k82.EXIT) {
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                        h = sk2Var5.h(ll4Var) | sk2Var5.f(mi2Var);
                        L = sk2Var5.L();
                        if (!h || L == obj5) {
                            L = new bh3(ll4Var, mi2Var, (k24) obj6);
                            sk2Var5.h0(L);
                        }
                        ol4.d(str2, ax2Var, false, z7, (ki2) L, null, sk2Var5, RendererDebugBridge.CAPTURE_HEIGHT, 32);
                        sk2Var5.p(false);
                    } else {
                        if (ll4Var instanceof k82) {
                            int i24 = nl4.b[((k82) ll4Var).ordinal()];
                            if (i24 != 1) {
                                if (i24 != 2) {
                                    if (i24 == 3) {
                                        A = yf2.v();
                                    } else {
                                        i.c();
                                        return null;
                                    }
                                } else {
                                    A = ep2.v();
                                }
                            } else {
                                A = mj2.A();
                            }
                        } else {
                            A = mj2.A();
                        }
                        ax2 ax2Var2 = A;
                        if (ll4Var == cp5.RESET) {
                        }
                        z7 = true;
                        h = sk2Var5.h(ll4Var) | sk2Var5.f(mi2Var);
                        L = sk2Var5.L();
                        if (!h) {
                        }
                        L = new bh3(ll4Var, mi2Var, (k24) obj6);
                        sk2Var5.h0(L);
                        ol4.d(str2, ax2Var2, false, z7, (ki2) L, null, sk2Var5, RendererDebugBridge.CAPTURE_HEIGHT, 32);
                        sk2Var5.p(false);
                    }
                } else {
                    sk2Var5.R();
                }
                return o27Var;
            case 5:
                ni3 ni3Var5 = (ni3) obj;
                int intValue11 = ((Number) obj2).intValue();
                tu0 tu0Var6 = (tu0) obj3;
                int intValue12 = ((Number) obj4).intValue();
                if ((intValue12 & 6) == 0) {
                    if (((sk2) tu0Var6).f(ni3Var5)) {
                        i18 = 4;
                    }
                    i12 = intValue12 | i18;
                } else {
                    i12 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    if (((sk2) tu0Var6).d(intValue11)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) == 146) {
                    z10 = false;
                }
                sk2 sk2Var6 = (sk2) tu0Var6;
                if (sk2Var6.O(i12 & 1, z10)) {
                    int i25 = i12 & 126;
                    RewindSaveState rewindSaveState = (RewindSaveState) list.get(intValue11);
                    sk2Var6.X(-1131612671);
                    RewindWindow rewindWindow = (RewindWindow) obj7;
                    if (intValue11 == 0) {
                        wc2Var = (wc2) obj6;
                    } else {
                        wc2Var = null;
                    }
                    boolean f8 = sk2Var6.f(mi2Var) | sk2Var6.h(rewindSaveState);
                    Object L10 = sk2Var6.L();
                    if (f8 || L10 == obj5) {
                        L10 = new j5(8, mi2Var, rewindSaveState);
                        sk2Var6.h0(L10);
                    }
                    ct3.E(rewindWindow, rewindSaveState, intValue11, wc2Var, (ki2) L10, sk2Var6, (i25 << 3) & 896);
                    sk2Var6.p(false);
                } else {
                    sk2Var6.R();
                }
                return o27Var;
            default:
                ni3 ni3Var6 = (ni3) obj;
                int intValue13 = ((Number) obj2).intValue();
                tu0 tu0Var7 = (tu0) obj3;
                int intValue14 = ((Number) obj4).intValue();
                if ((intValue14 & 6) == 0) {
                    if (((sk2) tu0Var7).f(ni3Var6)) {
                        i16 = 4;
                    } else {
                        i16 = 2;
                    }
                    i14 = intValue14 | i16;
                } else {
                    i14 = intValue14;
                }
                if ((intValue14 & 48) == 0) {
                    if (((sk2) tu0Var7).d(intValue13)) {
                        i15 = 32;
                    } else {
                        i15 = 16;
                    }
                    i14 |= i15;
                }
                if ((i14 & 147) != 146) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                sk2 sk2Var7 = (sk2) tu0Var7;
                if (sk2Var7.O(i14 & 1, z8)) {
                    ti4 ti4Var = (ti4) list.get(intValue13);
                    sk2Var7.X(-1043389889);
                    qb6 qb6Var = (qb6) ti4Var.A;
                    String str3 = (String) ti4Var.B;
                    String str4 = "";
                    if (str3 == null) {
                        sk2Var7.X(-1043389115);
                        int i26 = ih5.a[qb6Var.ordinal()];
                        if (i26 != 1) {
                            if (i26 != 2) {
                                sk2Var7.X(-1043161918);
                                sk2Var7.p(false);
                                str3 = "";
                            } else {
                                str3 = b31.o(sk2Var7, -1696220850, R.string.rom_sort_most_played_chip, sk2Var7, false);
                            }
                        } else {
                            str3 = b31.o(sk2Var7, -1696223831, R.string.rom_sort_recent_chip, sk2Var7, false);
                        }
                        sk2Var7.p(false);
                    } else {
                        sk2Var7.X(-1696226040);
                        sk2Var7.p(false);
                    }
                    if (((qb6) obj7) == qb6Var) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        if (((rb6) obj6) == rb6.ASCENDING) {
                            str4 = " ↑";
                        } else {
                            str4 = " ↓";
                        }
                    }
                    String upperCase = str3.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    String concat = upperCase.concat(str4);
                    long j = mj2.C(sk2Var7).l;
                    long A2 = hi2.A(8.5d);
                    boolean f9 = sk2Var7.f(mi2Var) | sk2Var7.d(qb6Var.ordinal());
                    Object L11 = sk2Var7.L();
                    if (f9 || L11 == obj5) {
                        L11 = new j5(10, mi2Var, qb6Var);
                        sk2Var7.h0(L11);
                    }
                    nk2.j(concat, z9, (ki2) L11, null, j, A2, 12.0f, 9.0f, 4.0f, sk2Var7, 115015680, 8);
                    sk2Var7.p(false);
                } else {
                    sk2Var7.R();
                }
                return o27Var;
        }
    }

    public t5(List list, mi2 mi2Var, k24 k24Var, mi2 mi2Var2) {
        this.A = 1;
        this.B = list;
        this.L = mi2Var;
        this.R = k24Var;
        this.X = mi2Var2;
    }

    public /* synthetic */ t5(List list, Object obj, mi2 mi2Var, Object obj2, int i) {
        this.A = i;
        this.B = list;
        this.R = obj;
        this.L = mi2Var;
        this.X = obj2;
    }

    public /* synthetic */ t5(List list, Object obj, Object obj2, mi2 mi2Var, int i) {
        this.A = i;
        this.B = list;
        this.R = obj;
        this.X = obj2;
        this.L = mi2Var;
    }
}
