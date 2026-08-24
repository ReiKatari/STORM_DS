package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t5  reason: default package */
/* loaded from: classes.dex */
public final class t5 implements go2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ List B;
    public final /* synthetic */ qn2 L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public t5(List list, qn2 qn2Var, eo2 eo2Var, lq4 lq4Var) {
        this.A = 2;
        this.B = list;
        this.L = qn2Var;
        this.X = eo2Var;
        this.R = lq4Var;
    }

    @Override // defpackage.go2
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
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
        e33 C;
        boolean z5;
        boolean h;
        Object P;
        int i8;
        int i9;
        int i10;
        nh2 nh2Var;
        int i11;
        int i12;
        boolean z6;
        boolean z7;
        int i13;
        int i14;
        int i15 = this.A;
        x64 x64Var = x64.a;
        qn2 qn2Var = this.L;
        jg7 jg7Var = jg7.a;
        Object obj5 = ox0.a;
        Object obj6 = this.X;
        Object obj7 = this.R;
        List list = this.B;
        int i16 = 2;
        boolean z8 = true;
        switch (i15) {
            case 0:
                lp3 lp3Var = (lp3) obj;
                int intValue = ((Number) obj2).intValue();
                px0 px0Var = (px0) obj3;
                int intValue2 = ((Number) obj4).intValue();
                eo2 eo2Var = (eo2) obj6;
                if ((intValue2 & 6) == 0) {
                    if (((xq2) px0Var).f(lp3Var)) {
                        i16 = 4;
                    }
                    i = intValue2 | i16;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (((xq2) px0Var).d(intValue)) {
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
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(i & 1, z)) {
                    o6 o6Var = (o6) list.get(intValue);
                    xq2Var.b0(1214860516);
                    boolean contains = ((Set) obj7).contains(Long.valueOf(o6Var.a().a));
                    a74 S = ge7.S(dj6.c(x64Var, 1.0f), RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 8.0f, 7);
                    boolean f = xq2Var.f(eo2Var) | xq2Var.f(o6Var) | xq2Var.g(contains);
                    Object P2 = xq2Var.P();
                    if (f || P2 == obj5) {
                        P2 = new q5(eo2Var, o6Var, contains);
                        xq2Var.l0(P2);
                    }
                    l.f(S, o6Var, contains, (on2) P2, this.L, xq2Var, 6);
                    xq2Var.p(false);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                lp3 lp3Var2 = (lp3) obj;
                int intValue3 = ((Number) obj2).intValue();
                px0 px0Var2 = (px0) obj3;
                int intValue4 = ((Number) obj4).intValue();
                qn2 qn2Var2 = (qn2) obj6;
                qa4 qa4Var = (qa4) obj7;
                if ((intValue4 & 6) == 0) {
                    if (((xq2) px0Var2).f(lp3Var2)) {
                        i16 = 4;
                    }
                    i3 = intValue4 | i16;
                } else {
                    i3 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    if (((xq2) px0Var2).d(intValue3)) {
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
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(i3 & 1, z2)) {
                    Cheat cheat = (Cheat) list.get(intValue3);
                    xq2Var2.b0(-517224611);
                    a74 c = dj6.c(x64Var, 1.0f);
                    boolean f2 = xq2Var2.f(qn2Var) | xq2Var2.f(cheat);
                    Object P3 = xq2Var2.P();
                    if (f2 || P3 == obj5) {
                        P3 = new go0(qn2Var, cheat, 0);
                        xq2Var2.l0(P3);
                    }
                    on2 on2Var = (on2) P3;
                    boolean f3 = xq2Var2.f(qa4Var) | xq2Var2.f(cheat);
                    Object P4 = xq2Var2.P();
                    if (f3 || P4 == obj5) {
                        P4 = new i5(3, cheat, qa4Var);
                        xq2Var2.l0(P4);
                    }
                    on2 on2Var2 = (on2) P4;
                    boolean f4 = xq2Var2.f(qn2Var2) | xq2Var2.f(cheat);
                    Object P5 = xq2Var2.P();
                    if (f4 || P5 == obj5) {
                        P5 = new go0(qn2Var2, cheat, 1);
                        xq2Var2.l0(P5);
                    }
                    ak7.k(c, cheat, on2Var, on2Var2, (on2) P5, xq2Var2, 6);
                    xq2Var2.p(false);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                lp3 lp3Var3 = (lp3) obj;
                int intValue5 = ((Number) obj2).intValue();
                px0 px0Var3 = (px0) obj3;
                int intValue6 = ((Number) obj4).intValue();
                eo2 eo2Var2 = (eo2) obj6;
                if ((intValue6 & 6) == 0) {
                    if (((xq2) px0Var3).f(lp3Var3)) {
                        i16 = 4;
                    }
                    i5 = intValue6 | i16;
                } else {
                    i5 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    if (((xq2) px0Var3).d(intValue5)) {
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
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(i5 & 1, z3)) {
                    pq5 pq5Var = (pq5) list.get(intValue5);
                    xq2Var3.b0(-568966401);
                    a74 c2 = dj6.c(x64Var, 1.0f);
                    boolean f5 = xq2Var3.f(qn2Var) | xq2Var3.h(pq5Var);
                    Object P6 = xq2Var3.P();
                    if (f5 || P6 == obj5) {
                        P6 = new ua1(qn2Var, pq5Var, 0);
                        xq2Var3.l0(P6);
                    }
                    on2 on2Var3 = (on2) P6;
                    boolean h2 = xq2Var3.h(eo2Var2) | xq2Var3.h(pq5Var);
                    Object P7 = xq2Var3.P();
                    if (h2 || P7 == obj5) {
                        P7 = new yc(eo2Var2, pq5Var, null, 4);
                        xq2Var3.l0(P7);
                    }
                    px5.a(c2, pq5Var, on2Var3, (qn2) P7, (lq4) obj7, xq2Var3, 6);
                    xq2Var3.p(false);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 3:
                ro3 ro3Var = (ro3) obj;
                int intValue7 = ((Number) obj2).intValue();
                px0 px0Var4 = (px0) obj3;
                int intValue8 = ((Number) obj4).intValue();
                if ((intValue8 & 6) == 0) {
                    if (((xq2) px0Var4).f(ro3Var)) {
                        i9 = 4;
                    } else {
                        i9 = 2;
                    }
                    i7 = intValue8 | i9;
                } else {
                    i7 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    if (((xq2) px0Var4).d(intValue7)) {
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
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(i7 & 1, z4)) {
                    nu4 nu4Var = (nu4) list.get(intValue7);
                    xq2Var4.b0(-1828302986);
                    nu4Var.getClass();
                    String str = (String) ((mu4) obj7).b.get(nu4Var);
                    if (str == null) {
                        xq2Var4.b0(772308564);
                        str = yh2.O(xq2Var4, nu4Var.getTextResource());
                    } else {
                        xq2Var4.b0(772307479);
                    }
                    xq2Var4.p(false);
                    String str2 = str;
                    if (nu4Var instanceof xz5) {
                        switch (qu4.a[((xz5) nu4Var).ordinal()]) {
                            case 1:
                                C = oi2.C();
                                break;
                            case 2:
                                C = ej2.H();
                                break;
                            case 3:
                                C = kj2.C();
                                break;
                            case 4:
                                C = nw7.h0();
                                break;
                            case 5:
                                C = ak7.k;
                                if (C == null) {
                                    d33 d33Var = new d33("Filled.FastRewind", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i17 = el7.a;
                                    cn6 cn6Var = new cn6(kt0.b);
                                    ww2 ww2Var = new ww2(1, (byte) 0);
                                    ww2Var.o(11.0f, 18.0f);
                                    ww2Var.m(11.0f, 6.0f);
                                    ww2Var.n(-8.5f, 6.0f);
                                    ww2Var.n(8.5f, 6.0f);
                                    ww2Var.g();
                                    ww2Var.o(11.5f, 12.0f);
                                    ww2Var.n(8.5f, 6.0f);
                                    ww2Var.m(20.0f, 6.0f);
                                    ww2Var.n(-8.5f, 6.0f);
                                    ww2Var.g();
                                    d33.a(d33Var, ww2Var.b, 0, cn6Var);
                                    C = d33Var.b();
                                    ak7.k = C;
                                    break;
                                }
                                break;
                            case 6:
                                C = vy7.e0;
                                if (C == null) {
                                    d33 d33Var2 = new d33("Filled.Code", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i18 = el7.a;
                                    cn6 cn6Var2 = new cn6(kt0.b);
                                    ww2 ww2Var2 = new ww2(1, (byte) 0);
                                    ww2Var2.o(9.4f, 16.6f);
                                    ww2Var2.m(4.8f, 12.0f);
                                    ww2Var2.n(4.6f, -4.6f);
                                    ww2Var2.m(8.0f, 6.0f);
                                    ww2Var2.n(-6.0f, 6.0f);
                                    ww2Var2.n(6.0f, 6.0f);
                                    ww2Var2.n(1.4f, -1.4f);
                                    ww2Var2.g();
                                    ww2Var2.o(14.6f, 16.6f);
                                    ww2Var2.n(4.6f, -4.6f);
                                    ww2Var2.n(-4.6f, -4.6f);
                                    ww2Var2.m(16.0f, 6.0f);
                                    ww2Var2.n(6.0f, 6.0f);
                                    ww2Var2.n(-6.0f, 6.0f);
                                    ww2Var2.n(-1.4f, -1.4f);
                                    ww2Var2.g();
                                    d33.a(d33Var2, ww2Var2.b, 0, cn6Var2);
                                    C = d33Var2.b();
                                    vy7.e0 = C;
                                    break;
                                }
                                break;
                            case 7:
                                C = q60.F();
                                break;
                            case 8:
                                C = nw7.q0;
                                if (C == null) {
                                    d33 d33Var3 = new d33("Filled.CloudSync", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i19 = el7.a;
                                    cn6 cn6Var3 = new cn6(kt0.b);
                                    ww2 ww2Var3 = new ww2(1, (byte) 0);
                                    ww2Var3.o(21.5f, 14.98f);
                                    ww2Var3.i(-0.02f, RecyclerView.B1, -0.03f, RecyclerView.B1, -0.05f, 0.01f);
                                    ww2Var3.h(21.2f, 13.3f, 19.76f, 12.0f, 18.0f, 12.0f);
                                    ww2Var3.i(-1.4f, RecyclerView.B1, -2.6f, 0.83f, -3.16f, 2.02f);
                                    ww2Var3.h(13.26f, 14.1f, 12.0f, 15.4f, 12.0f, 17.0f);
                                    ww2Var3.i(RecyclerView.B1, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                                    ww2Var3.n(6.5f, -0.02f);
                                    ww2Var3.i(1.38f, RecyclerView.B1, 2.5f, -1.12f, 2.5f, -2.5f);
                                    ww2Var3.p(22.88f, 14.98f, 21.5f, 14.98f);
                                    ww2Var3.g();
                                    ww2Var3.o(10.0f, 4.26f);
                                    ww2Var3.u(2.09f);
                                    ww2Var3.h(7.67f, 7.18f, 6.0f, 9.39f, 6.0f, 12.0f);
                                    ww2Var3.i(RecyclerView.B1, 1.77f, 0.78f, 3.34f, 2.0f, 4.44f);
                                    ww2Var3.t(14.0f);
                                    ww2Var3.l(2.0f);
                                    ww2Var3.u(6.0f);
                                    ww2Var3.k(4.0f);
                                    ww2Var3.u(-2.0f);
                                    ww2Var3.l(2.73f);
                                    ww2Var3.h(5.06f, 16.54f, 4.0f, 14.4f, 4.0f, 12.0f);
                                    ww2Var3.h(4.0f, 8.27f, 6.55f, 5.15f, 10.0f, 4.26f);
                                    ww2Var3.g();
                                    ww2Var3.o(20.0f, 6.0f);
                                    ww2Var3.l(-2.73f);
                                    ww2Var3.i(1.43f, 1.26f, 2.41f, 3.01f, 2.66f, 5.0f);
                                    ww2Var3.n(-2.02f, RecyclerView.B1);
                                    ww2Var3.h(17.68f, 9.64f, 16.98f, 8.45f, 16.0f, 7.56f);
                                    ww2Var3.t(10.0f);
                                    ww2Var3.l(-2.0f);
                                    ww2Var3.t(4.0f);
                                    ww2Var3.l(6.0f);
                                    ww2Var3.t(6.0f);
                                    ww2Var3.g();
                                    d33.a(d33Var3, ww2Var3.b, 0, cn6Var3);
                                    C = d33Var3.b();
                                    nw7.q0 = C;
                                    break;
                                }
                                break;
                            case 9:
                                C = hi2.c;
                                if (C == null) {
                                    d33 d33Var4 = new d33("Filled.Monitor", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i20 = el7.a;
                                    cn6 cn6Var4 = new cn6(kt0.b);
                                    ww2 ww2Var4 = new ww2(1, (byte) 0);
                                    ww2Var4.o(20.0f, 3.0f);
                                    ww2Var4.m(4.0f, 3.0f);
                                    ww2Var4.i(-1.1f, RecyclerView.B1, -2.0f, 0.9f, -2.0f, 2.0f);
                                    ww2Var4.u(11.0f);
                                    ww2Var4.i(RecyclerView.B1, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                                    ww2Var4.l(3.0f);
                                    ww2Var4.n(-1.0f, 1.0f);
                                    ww2Var4.u(2.0f);
                                    ww2Var4.l(12.0f);
                                    ww2Var4.u(-2.0f);
                                    ww2Var4.n(-1.0f, -1.0f);
                                    ww2Var4.l(3.0f);
                                    ww2Var4.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
                                    ww2Var4.m(22.0f, 5.0f);
                                    ww2Var4.i(RecyclerView.B1, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                                    ww2Var4.g();
                                    ww2Var4.o(20.0f, 16.0f);
                                    ww2Var4.m(4.0f, 16.0f);
                                    ww2Var4.m(4.0f, 5.0f);
                                    ww2Var4.l(16.0f);
                                    ww2Var4.u(11.0f);
                                    ww2Var4.g();
                                    d33.a(d33Var4, ww2Var4.b, 0, cn6Var4);
                                    C = d33Var4.b();
                                    hi2.c = C;
                                    break;
                                }
                                break;
                            case 10:
                                C = hf.s;
                                if (C == null) {
                                    d33 d33Var5 = new d33("Filled.BugReport", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                    int i21 = el7.a;
                                    cn6 cn6Var5 = new cn6(kt0.b);
                                    ww2 ww2Var5 = new ww2(1, (byte) 0);
                                    ww2Var5.o(20.0f, 8.0f);
                                    ww2Var5.l(-2.81f);
                                    ww2Var5.i(-0.45f, -0.78f, -1.07f, -1.45f, -1.82f, -1.96f);
                                    ww2Var5.m(17.0f, 4.41f);
                                    ww2Var5.m(15.59f, 3.0f);
                                    ww2Var5.n(-2.17f, 2.17f);
                                    ww2Var5.h(12.96f, 5.06f, 12.49f, 5.0f, 12.0f, 5.0f);
                                    ww2Var5.i(-0.49f, RecyclerView.B1, -0.96f, 0.06f, -1.41f, 0.17f);
                                    ww2Var5.m(8.41f, 3.0f);
                                    ww2Var5.m(7.0f, 4.41f);
                                    ww2Var5.n(1.62f, 1.63f);
                                    ww2Var5.h(7.88f, 6.55f, 7.26f, 7.22f, 6.81f, 8.0f);
                                    ww2Var5.m(4.0f, 8.0f);
                                    ww2Var5.u(2.0f);
                                    ww2Var5.l(2.09f);
                                    ww2Var5.i(-0.05f, 0.33f, -0.09f, 0.66f, -0.09f, 1.0f);
                                    ww2Var5.u(1.0f);
                                    ww2Var5.m(4.0f, 12.0f);
                                    ww2Var5.u(2.0f);
                                    ww2Var5.l(2.0f);
                                    ww2Var5.u(1.0f);
                                    ww2Var5.i(RecyclerView.B1, 0.34f, 0.04f, 0.67f, 0.09f, 1.0f);
                                    ww2Var5.m(4.0f, 16.0f);
                                    ww2Var5.u(2.0f);
                                    ww2Var5.l(2.81f);
                                    ww2Var5.i(1.04f, 1.79f, 2.97f, 3.0f, 5.19f, 3.0f);
                                    ww2Var5.q(4.15f, -1.21f, 5.19f, -3.0f);
                                    ww2Var5.m(20.0f, 18.0f);
                                    ww2Var5.u(-2.0f);
                                    ww2Var5.l(-2.09f);
                                    ww2Var5.i(0.05f, -0.33f, 0.09f, -0.66f, 0.09f, -1.0f);
                                    ww2Var5.u(-1.0f);
                                    ww2Var5.l(2.0f);
                                    ww2Var5.u(-2.0f);
                                    ww2Var5.l(-2.0f);
                                    ww2Var5.u(-1.0f);
                                    ww2Var5.i(RecyclerView.B1, -0.34f, -0.04f, -0.67f, -0.09f, -1.0f);
                                    ww2Var5.m(20.0f, 10.0f);
                                    ww2Var5.m(20.0f, 8.0f);
                                    ww2Var5.g();
                                    ww2Var5.o(14.0f, 16.0f);
                                    ww2Var5.l(-4.0f);
                                    ww2Var5.u(-2.0f);
                                    ww2Var5.l(4.0f);
                                    ww2Var5.u(2.0f);
                                    ww2Var5.g();
                                    ww2Var5.o(14.0f, 12.0f);
                                    ww2Var5.l(-4.0f);
                                    ww2Var5.u(-2.0f);
                                    ww2Var5.l(4.0f);
                                    ww2Var5.u(2.0f);
                                    ww2Var5.g();
                                    d33.a(d33Var5, ww2Var5.b, 0, cn6Var5);
                                    C = d33Var5.b();
                                    hf.s = C;
                                    break;
                                }
                                break;
                            case 11:
                                C = ii2.y();
                                break;
                            case 12:
                                C = uj2.L();
                                break;
                            default:
                                i.d();
                                return null;
                        }
                        e33 e33Var = C;
                        if (nu4Var == xz5.RESET && nu4Var != xz5.EXIT && nu4Var != cd2.RESET && nu4Var != cd2.EXIT) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        h = xq2Var4.h(nu4Var) | xq2Var4.f(qn2Var);
                        P = xq2Var4.P();
                        if (!h || P == obj5) {
                            P = new co3(nu4Var, qn2Var, (qa4) obj6);
                            xq2Var4.l0(P);
                        }
                        ru4.d(str2, e33Var, false, z5, (on2) P, null, xq2Var4, RendererDebugBridge.CAPTURE_HEIGHT, 32);
                        xq2Var4.p(false);
                    } else {
                        if (nu4Var instanceof cd2) {
                            int i22 = qu4.b[((cd2) nu4Var).ordinal()];
                            if (i22 != 1) {
                                if (i22 != 2) {
                                    if (i22 == 3) {
                                        C = uj2.L();
                                    } else {
                                        i.d();
                                        return null;
                                    }
                                } else {
                                    C = ii2.y();
                                }
                            } else {
                                C = oi2.C();
                            }
                        } else {
                            C = oi2.C();
                        }
                        e33 e33Var2 = C;
                        if (nu4Var == xz5.RESET) {
                        }
                        z5 = true;
                        h = xq2Var4.h(nu4Var) | xq2Var4.f(qn2Var);
                        P = xq2Var4.P();
                        if (!h) {
                        }
                        P = new co3(nu4Var, qn2Var, (qa4) obj6);
                        xq2Var4.l0(P);
                        ru4.d(str2, e33Var2, false, z5, (on2) P, null, xq2Var4, RendererDebugBridge.CAPTURE_HEIGHT, 32);
                        xq2Var4.p(false);
                    }
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 4:
                lp3 lp3Var4 = (lp3) obj;
                int intValue9 = ((Number) obj2).intValue();
                px0 px0Var5 = (px0) obj3;
                int intValue10 = ((Number) obj4).intValue();
                if ((intValue10 & 6) == 0) {
                    if (((xq2) px0Var5).f(lp3Var4)) {
                        i16 = 4;
                    }
                    i10 = intValue10 | i16;
                } else {
                    i10 = intValue10;
                }
                if ((intValue10 & 48) == 0) {
                    if (((xq2) px0Var5).d(intValue9)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i10 |= i11;
                }
                if ((i10 & 147) == 146) {
                    z8 = false;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(i10 & 1, z8)) {
                    int i23 = i10 & 126;
                    RewindSaveState rewindSaveState = (RewindSaveState) list.get(intValue9);
                    xq2Var5.b0(-1131612671);
                    RewindWindow rewindWindow = (RewindWindow) obj7;
                    if (intValue9 == 0) {
                        nh2Var = (nh2) obj6;
                    } else {
                        nh2Var = null;
                    }
                    boolean f6 = xq2Var5.f(qn2Var) | xq2Var5.h(rewindSaveState);
                    Object P8 = xq2Var5.P();
                    if (f6 || P8 == obj5) {
                        P8 = new i5(9, qn2Var, rewindSaveState);
                        xq2Var5.l0(P8);
                    }
                    ge7.l(rewindWindow, rewindSaveState, intValue9, nh2Var, (on2) P8, xq2Var5, (i23 << 3) & 896);
                    xq2Var5.p(false);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            default:
                lp3 lp3Var5 = (lp3) obj;
                int intValue11 = ((Number) obj2).intValue();
                px0 px0Var6 = (px0) obj3;
                int intValue12 = ((Number) obj4).intValue();
                if ((intValue12 & 6) == 0) {
                    if (((xq2) px0Var6).f(lp3Var5)) {
                        i14 = 4;
                    } else {
                        i14 = 2;
                    }
                    i12 = intValue12 | i14;
                } else {
                    i12 = intValue12;
                }
                if ((intValue12 & 48) == 0) {
                    if (((xq2) px0Var6).d(intValue11)) {
                        i13 = 32;
                    } else {
                        i13 = 16;
                    }
                    i12 |= i13;
                }
                if ((i12 & 147) != 146) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                xq2 xq2Var6 = (xq2) px0Var6;
                if (xq2Var6.S(i12 & 1, z6)) {
                    vr4 vr4Var = (vr4) list.get(intValue11);
                    xq2Var6.b0(-1043389889);
                    gn6 gn6Var = (gn6) vr4Var.A;
                    String str3 = (String) vr4Var.B;
                    String str4 = "";
                    if (str3 == null) {
                        xq2Var6.b0(-1043389115);
                        int i24 = kr5.a[gn6Var.ordinal()];
                        if (i24 != 1) {
                            if (i24 != 2) {
                                xq2Var6.b0(-1043161918);
                                xq2Var6.p(false);
                                str3 = "";
                            } else {
                                str3 = i61.l(xq2Var6, -1696220850, R.string.rom_sort_most_played_chip, xq2Var6, false);
                            }
                        } else {
                            str3 = i61.l(xq2Var6, -1696223831, R.string.rom_sort_recent_chip, xq2Var6, false);
                        }
                        xq2Var6.p(false);
                    } else {
                        xq2Var6.b0(-1696226040);
                        xq2Var6.p(false);
                    }
                    if (((gn6) obj7) == gn6Var) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        if (((hn6) obj6) == hn6.ASCENDING) {
                            str4 = " ↑";
                        } else {
                            str4 = " ↓";
                        }
                    }
                    String upperCase = str3.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    String concat = upperCase.concat(str4);
                    long j = bl2.F(xq2Var6).l;
                    long D = hi2.D(8.5d);
                    boolean f7 = xq2Var6.f(qn2Var) | xq2Var6.d(gn6Var.ordinal());
                    Object P9 = xq2Var6.P();
                    if (f7 || P9 == obj5) {
                        P9 = new i5(11, qn2Var, gn6Var);
                        xq2Var6.l0(P9);
                    }
                    ak7.C(concat, z7, (on2) P9, null, j, D, 12.0f, 9.0f, 4.0f, xq2Var6, 115015680, 8);
                    xq2Var6.p(false);
                } else {
                    xq2Var6.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ t5(int i, qn2 qn2Var, Object obj, Object obj2, List list) {
        this.A = i;
        this.B = list;
        this.R = obj;
        this.X = obj2;
        this.L = qn2Var;
    }

    public t5(List list, qn2 qn2Var, qa4 qa4Var, qn2 qn2Var2) {
        this.A = 1;
        this.B = list;
        this.L = qn2Var;
        this.R = qa4Var;
        this.X = qn2Var2;
    }

    public t5(List list, mu4 mu4Var, qn2 qn2Var, qa4 qa4Var) {
        this.A = 3;
        this.B = list;
        this.R = mu4Var;
        this.L = qn2Var;
        this.X = qa4Var;
    }
}
