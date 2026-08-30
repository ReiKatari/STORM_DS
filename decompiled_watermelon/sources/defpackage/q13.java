package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.inputsetup.b;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q13  reason: default package */
/* loaded from: classes.dex */
public abstract class q13 {
    public static final void a(f03 f03Var, boolean z, ki2 ki2Var, ki2 ki2Var2, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        long j;
        boolean z3;
        String S0;
        boolean z4;
        int i6;
        String X;
        boolean z5;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1793988537);
        if (sk2Var.f(f03Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (sk2Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (sk2Var.h(ki2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        if (sk2Var.h(ki2Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i10 & 1, z2)) {
            Object L = sk2Var.L();
            Object obj = su0.a;
            if (L == obj) {
                wc2 wc2Var = wc2.b;
                L = vc2.a;
                sk2Var.h0(L);
            }
            ((vc2) L).getClass();
            wc2 wc2Var2 = new wc2();
            wc2 wc2Var3 = new wc2();
            jd7 C = mj2.C(sk2Var);
            Object L2 = sk2Var.L();
            if (L2 == obj) {
                L2 = b31.f(sk2Var);
            }
            l14 l14Var = (l14) L2;
            k24 a = bh7.a(l14Var, sk2Var, 6);
            fr5 b = gr5.b(13.0f);
            i20 i20Var = y60.h0;
            wy3 wy3Var = wy3.a;
            zy3 t = a53.t(o76.c(wy3Var, 1.0f), b);
            if (!((Boolean) a.getValue()).booleanValue() && !z) {
                j = C.d;
            } else {
                j = C.e;
            }
            zy3 i11 = dk7.i(t, j, iq2.g);
            if (((Boolean) a.getValue()).booleanValue() || z) {
                i11 = b53.z(2.0f, C.j, i11, b);
            }
            zy3 I = b53.I(i11, wc2Var2);
            if ((i10 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f = z3 | sk2Var.f(wc2Var3);
            Object L3 = sk2Var.L();
            if (f || L3 == obj) {
                L3 = new gi2(6, f03Var, wc2Var3);
                sk2Var.h0(L3);
            }
            zy3 a0 = b53.a0(a53.r(a53.C(I, (mi2) L3), l14Var, null, false, null, ki2Var, 28), 14.0f, 11.0f, 6.0f, 11.0f);
            sr5 a2 = rr5.a(rt.a, i20Var, sk2Var, 48);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, a0);
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
            lr0 a3 = jr0.a(rt.c, y60.j0, sk2Var, 0);
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
            if (z) {
                z4 = false;
                S0 = b31.o(sk2Var, 2025130746, R.string.press_any_button, sk2Var, false);
            } else {
                sk2Var.X(2025245818);
                List c0 = l07.c0(f03Var.b, f03Var.c);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : c0) {
                    if (!b53.x((e03) obj2, d03.a)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    z4 = false;
                    S0 = b31.o(sk2Var, 2025379707, R.string.not_set, sk2Var, false);
                } else {
                    sk2Var.X(2025485634);
                    Object L4 = sk2Var.L();
                    if (L4 == obj) {
                        L4 = new qu1(14);
                        sk2Var.h0(L4);
                    }
                    S0 = tq0.S0(arrayList, " / ", null, null, (mi2) L4, 30);
                    z4 = false;
                    sk2Var.p(false);
                }
                sk2Var.p(z4);
            }
            String str = S0;
            yz2 yz2Var = f03Var.a;
            sk2Var.X(2139434571);
            switch (p13.a[yz2Var.ordinal()]) {
                case 1:
                    i6 = R.string.input_a;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 2:
                    i6 = R.string.input_b;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 3:
                    i6 = R.string.input_x;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 4:
                    i6 = R.string.input_y;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 5:
                    i6 = R.string.input_left;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case ig7.b /* 6 */:
                    i6 = R.string.input_right;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 7:
                    i6 = R.string.input_up;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 8:
                    i6 = R.string.input_down;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 9:
                    i6 = R.string.input_l;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 10:
                    i6 = R.string.input_r;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 11:
                    i6 = R.string.input_start;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case mj2.L /* 12 */:
                    i6 = R.string.input_select;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 13:
                    i6 = R.string.input_lid;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 14:
                    i6 = R.string.input_pause;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case ig7.e /* 15 */:
                    i6 = R.string.input_fast_forward;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 16:
                    i6 = R.string.input_hold_fast_forward;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 17:
                    i6 = R.string.input_microphone;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 18:
                    i6 = R.string.input_reset;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 19:
                    i6 = R.string.input_swap_screens;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 20:
                    i6 = R.string.input_quick_save;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 21:
                    i6 = R.string.input_quick_load;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                case 22:
                    i6 = R.string.rewind;
                    X = me2.X(sk2Var, i6);
                    z5 = false;
                    sk2Var.p(false);
                    break;
                default:
                    sk2Var.p(z4);
                    X = null;
                    z5 = false;
                    break;
            }
            if (X == null) {
                X = "";
            }
            ye6 ye6Var = d17.b;
            ir6.b(X, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((c17) sk2Var.j(ye6Var)).i, sk2Var, 0, 0, 65534);
            ir6.b(str, null, ((hr0) sk2Var.j(ir0.a)).c(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((c17) sk2Var.j(ye6Var)).i, sk2Var, 0, 0, 65530);
            sk2Var = sk2Var;
            sk2Var.p(true);
            if (f03Var.b()) {
                sk2Var.X(246797240);
                zy3 I2 = b53.I(wy3Var, wc2Var3);
                boolean f2 = sk2Var.f(wc2Var2);
                Object L5 = sk2Var.L();
                if (f2 || L5 == obj) {
                    L5 = new vl0(wc2Var2, 2);
                    sk2Var.h0(L5);
                }
                oo2.c(ki2Var2, a53.C(I2, (mi2) L5), false, nt0.c, sk2Var, ((i10 >> 9) & 14) | 24576, 12);
                sk2Var.p(false);
            } else {
                sk2Var.X(247134861);
                sk2Var.p(false);
            }
            sk2Var.p(true);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new i7(f03Var, z, ki2Var, ki2Var2, i);
        }
    }

    public static final void b(final b bVar, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        sn1 sn1Var;
        bVar.getClass();
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(17335339);
        if (sk2Var.h(bVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (sk2Var.h(ki2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i5 & 1, z)) {
            k24 x = l.x(bVar.f, sk2Var);
            k24 x2 = l.x(bVar.j, sk2Var);
            k24 x3 = l.x(bVar.h, sk2Var);
            k24 x4 = l.x(bVar.l, sk2Var);
            o45 o45Var = bVar.n;
            List list = (List) x.getValue();
            yz2 yz2Var = (yz2) x2.getValue();
            u86 u86Var = (u86) x3.getValue();
            b.a aVar = (b.a) x4.getValue();
            boolean h = sk2Var.h(bVar);
            Object L = sk2Var.L();
            sn1 sn1Var2 = su0.a;
            if (!h && L != sn1Var2) {
                sn1Var = sn1Var2;
            } else {
                sn1Var = sn1Var2;
                z zVar = new z(1, bVar, b.class, "startInputAssignment", "startInputAssignment(Lme/magnum/melonds/domain/model/Input;)V", 0, 0, 17);
                sk2Var.h0(zVar);
                L = zVar;
            }
            mi2 mi2Var = (mi2) ((lj2) L);
            boolean h2 = sk2Var.h(bVar);
            Object L2 = sk2Var.L();
            if (h2 || L2 == sn1Var) {
                z zVar2 = new z(1, bVar, b.class, "clearInputAssignment", "clearInputAssignment(Lme/magnum/melonds/domain/model/Input;)V", 0, 0, 18);
                sk2Var.h0(zVar2);
                L2 = zVar2;
            }
            mi2 mi2Var2 = (mi2) ((lj2) L2);
            boolean h3 = sk2Var.h(bVar);
            Object L3 = sk2Var.L();
            if (h3 || L3 == sn1Var) {
                L3 = new ki2() { // from class: g13
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i6 = r2;
                        o27 o27Var = o27.a;
                        b bVar2 = bVar;
                        switch (i6) {
                            case 0:
                                b.a aVar2 = b.a.X;
                                bVar2.getClass();
                                aVar2.getClass();
                                bVar2.i.k(null);
                                ee6 ee6Var = bVar2.k;
                                ee6Var.getClass();
                                ee6Var.l(null, aVar2);
                                return o27Var;
                            default:
                                b.a aVar3 = b.a.Y;
                                bVar2.getClass();
                                aVar3.getClass();
                                bVar2.i.k(null);
                                ee6 ee6Var2 = bVar2.k;
                                ee6Var2.getClass();
                                ee6Var2.l(null, aVar3);
                                return o27Var;
                        }
                    }
                };
                sk2Var.h0(L3);
            }
            ki2 ki2Var2 = (ki2) L3;
            boolean h4 = sk2Var.h(bVar);
            Object L4 = sk2Var.L();
            if (h4 || L4 == sn1Var) {
                L4 = new ki2() { // from class: g13
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i6 = r2;
                        o27 o27Var = o27.a;
                        b bVar2 = bVar;
                        switch (i6) {
                            case 0:
                                b.a aVar2 = b.a.X;
                                bVar2.getClass();
                                aVar2.getClass();
                                bVar2.i.k(null);
                                ee6 ee6Var = bVar2.k;
                                ee6Var.getClass();
                                ee6Var.l(null, aVar2);
                                return o27Var;
                            default:
                                b.a aVar3 = b.a.Y;
                                bVar2.getClass();
                                aVar3.getClass();
                                bVar2.i.k(null);
                                ee6 ee6Var2 = bVar2.k;
                                ee6Var2.getClass();
                                ee6Var2.l(null, aVar3);
                                return o27Var;
                        }
                    }
                };
                sk2Var.h0(L4);
            }
            ki2 ki2Var3 = (ki2) L4;
            boolean h5 = sk2Var.h(bVar);
            Object L5 = sk2Var.L();
            if (h5 || L5 == sn1Var) {
                z zVar3 = new z(1, bVar, b.class, "setSlot2InvertX", "setSlot2InvertX(Z)V", 0, 0, 19);
                sk2Var.h0(zVar3);
                L5 = zVar3;
            }
            mi2 mi2Var3 = (mi2) ((lj2) L5);
            boolean h6 = sk2Var.h(bVar);
            Object L6 = sk2Var.L();
            if (h6 || L6 == sn1Var) {
                z zVar4 = new z(1, bVar, b.class, "setSlot2InvertY", "setSlot2InvertY(Z)V", 0, 0, 20);
                sk2Var.h0(zVar4);
                L6 = zVar4;
            }
            mi2 mi2Var4 = (mi2) ((lj2) L6);
            boolean h7 = sk2Var.h(bVar);
            Object L7 = sk2Var.L();
            if (h7 || L7 == sn1Var) {
                z zVar5 = new z(1, bVar, b.class, "setSlot2Deadzone", "setSlot2Deadzone(F)V", 0, 0, 21);
                sk2Var.h0(zVar5);
                L7 = zVar5;
            }
            mi2 mi2Var5 = (mi2) ((lj2) L7);
            boolean h8 = sk2Var.h(bVar);
            Object L8 = sk2Var.L();
            if (h8 || L8 == sn1Var) {
                z zVar6 = new z(1, bVar, b.class, "setSlot2UseDeviceFilter", "setSlot2UseDeviceFilter(Z)V", 0, 0, 22);
                sk2Var.h0(zVar6);
                L8 = zVar6;
            }
            mi2 mi2Var6 = (mi2) ((lj2) L8);
            boolean h9 = sk2Var.h(bVar);
            Object L9 = sk2Var.L();
            if (h9 || L9 == sn1Var) {
                i4 i4Var = new i4(0, bVar, b.class, "stopAnyAssignment", "stopAnyAssignment()V", 0, 0, 6);
                sk2Var.h0(i4Var);
                L9 = i4Var;
            }
            c(list, yz2Var, u86Var, aVar, o45Var, mi2Var, mi2Var2, ki2Var2, ki2Var3, mi2Var3, mi2Var4, mi2Var5, mi2Var6, (ki2) ((lj2) L9), ki2Var, sk2Var, 0, (i5 << 9) & 57344);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new s4(i, 16, bVar, ki2Var);
        }
    }

    public static final void c(final List list, final yz2 yz2Var, final u86 u86Var, final b.a aVar, final u92 u92Var, final mi2 mi2Var, final mi2 mi2Var2, final ki2 ki2Var, final ki2 ki2Var2, final mi2 mi2Var3, final mi2 mi2Var4, final mi2 mi2Var5, final mi2 mi2Var6, final ki2 ki2Var3, final ki2 ki2Var4, tu0 tu0Var, final int i, final int i2) {
        mi2 mi2Var7;
        int i3;
        sk2 sk2Var;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(2056390557);
        int i4 = (sk2Var2.h(list) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= sk2Var2.d(yz2Var == null ? -1 : yz2Var.ordinal()) ? 32 : 16;
        }
        int i5 = -1;
        int i6 = i4 | (sk2Var2.f(u86Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            if (aVar != null) {
                i5 = aVar.ordinal();
            }
            i6 |= sk2Var2.d(i5) ? 2048 : 1024;
        }
        int i7 = i6 | (sk2Var2.h(u92Var) ? 16384 : 8192);
        if ((196608 & i) == 0) {
            mi2Var7 = mi2Var;
            i7 |= sk2Var2.h(mi2Var7) ? 131072 : 65536;
        } else {
            mi2Var7 = mi2Var;
        }
        if ((i & 1572864) == 0) {
            i7 |= sk2Var2.h(mi2Var2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i7 |= sk2Var2.h(ki2Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i7 |= sk2Var2.h(ki2Var2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i7 |= sk2Var2.h(mi2Var3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (sk2Var2.h(mi2Var4) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= sk2Var2.h(mi2Var5) ? 32 : 16;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i3 |= sk2Var2.h(mi2Var6) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= sk2Var2.h(ki2Var3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= sk2Var2.h(ki2Var4) ? 16384 : 8192;
        }
        int i8 = i3;
        if (sk2Var2.O(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            jc2 jc2Var = (jc2) sk2Var2.j(ov0.i);
            boolean z = (yz2Var == null && aVar == null) ? false : true;
            boolean z2 = (i8 & 7168) == 2048;
            Object L = sk2Var2.L();
            sn1 sn1Var = su0.a;
            if (z2 || L == sn1Var) {
                L = new w7(11, ki2Var3);
                sk2Var2.h0(L);
            }
            b53.d(z, (ki2) L, sk2Var2, 0, 0);
            boolean h = sk2Var2.h(u92Var) | sk2Var2.h(jc2Var);
            Object L2 = sk2Var2.L();
            if (h || L2 == sn1Var) {
                L2 = new m13(u92Var, jc2Var, null);
                sk2Var2.h0(L2);
            }
            l.g(sk2Var2, (aj2) L2, o27.a);
            final mi2 mi2Var8 = mi2Var7;
            sk2Var = sk2Var2;
            ep2.h(me2.X(sk2Var2, R.string.key_mapping), ki2Var4, null, null, null, null, ct3.H0(1474138833, new bj2() { // from class: i13
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:46:0x017e  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x018e  */
                /* JADX WARN: Type inference failed for: r4v17 */
                /* JADX WARN: Type inference failed for: r4v18, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r4v31 */
                @Override // defpackage.bj2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object i(java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
                    /*
                        Method dump skipped, instructions count: 418
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.i13.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, sk2Var2), sk2Var, ((i8 >> 9) & 112) | 1572864, 60);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2() { // from class: j13
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ep2.I(i | 1);
                    int I2 = ep2.I(i2);
                    q13.c(list, yz2Var, u86Var, aVar, u92Var, mi2Var, mi2Var2, ki2Var, ki2Var2, mi2Var3, mi2Var4, mi2Var5, mi2Var6, ki2Var3, ki2Var4, (tu0) obj, I, I2);
                    return o27.a;
                }
            };
        }
    }

    public static final void d(final u86 u86Var, b.a aVar, ki2 ki2Var, ki2 ki2Var2, mi2 mi2Var, mi2 mi2Var2, final mi2 mi2Var3, mi2 mi2Var4, tu0 tu0Var, int i) {
        int i2;
        int ordinal;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        final u86 u86Var2;
        String f;
        String f2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        mv0 mv0Var;
        boolean z7;
        String o;
        boolean z8;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1848560754);
        if (sk2Var.f(u86Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (aVar == null) {
            ordinal = -1;
        } else {
            ordinal = aVar.ordinal();
        }
        if (sk2Var.d(ordinal)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (sk2Var.h(ki2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i12 = i11 | i4;
        if (sk2Var.h(ki2Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (sk2Var.h(mi2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (sk2Var.h(mi2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i15 = i14 | i7;
        if (sk2Var.h(mi2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if (sk2Var.h(mi2Var4)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i17 = i16 | i9;
        if ((4793491 & i17) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i17 & 1, z)) {
            if (aVar == b.a.X) {
                f = b31.o(sk2Var, 403238967, R.string.press_any_button, sk2Var, false);
            } else {
                sk2Var.X(403301556);
                sk2Var.p(false);
                f = f(u86Var.c);
            }
            String str = f;
            if (aVar == b.a.Y) {
                f2 = b31.o(sk2Var, 403462167, R.string.press_any_button, sk2Var, false);
            } else {
                sk2Var.X(403524756);
                sk2Var.p(false);
                f2 = f(u86Var.d);
            }
            String str2 = f2;
            wy3 wy3Var = wy3.a;
            zy3 Y = b53.Y(wy3Var, 16.0f, 12.0f);
            h20 h20Var = y60.j0;
            mt mtVar = rt.c;
            lr0 a = jr0.a(mtVar, h20Var, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, Y);
            nu0.i.getClass();
            mv0 mv0Var2 = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var2);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            ir6.b(me2.X(sk2Var, R.string.slot2_analog_mapping_title), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).g, sk2Var, 0, 0, 65534);
            ir6.b(me2.X(sk2Var, R.string.slot2_analog_mapping_summary), b53.b0(wy3Var, RecyclerView.A1, 4.0f, RecyclerView.A1, RecyclerView.A1, 13), sn2.y(sk2Var).c(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).j, sk2Var, 48, 0, 65528);
            zy3 b0 = b53.b0(a53.s(wy3Var, false, null, ki2Var, 15), RecyclerView.A1, 12.0f, RecyclerView.A1, RecyclerView.A1, 13);
            i20 i20Var = y60.h0;
            lt ltVar = rt.a;
            sr5 a2 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, b0);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var2);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a2);
            oo2.S(sk2Var, dnVar2, l2);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            ur5 ur5Var = ur5.a;
            zy3 a3 = ur5Var.a(wy3Var, 1.0f, true);
            lr0 a4 = jr0.a(mtVar, h20Var, sk2Var, 0);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, a3);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var2);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a4);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e03);
            ir6.b(me2.X(sk2Var, R.string.slot2_analog_axis_x), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).i, sk2Var, 0, 0, 65534);
            ir6.b(me2.X(sk2Var, R.string.slot2_analog_axis_x_expected), null, sn2.y(sk2Var).c(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).j, sk2Var, 0, 0, 65530);
            sk2Var.p(true);
            ir6.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).j, sk2Var, 0, 0, 65534);
            sk2Var.p(true);
            zy3 b02 = b53.b0(a53.s(wy3Var, false, null, ki2Var2, 15), RecyclerView.A1, 12.0f, RecyclerView.A1, RecyclerView.A1, 13);
            sr5 a5 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode4 = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e04 = l07.e0(sk2Var, b02);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var2);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a5);
            oo2.S(sk2Var, dnVar2, l4);
            b31.x(hashCode4, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e04);
            zy3 a6 = ur5Var.a(wy3Var, 1.0f, true);
            lr0 a7 = jr0.a(mtVar, h20Var, sk2Var, 0);
            int hashCode5 = Long.hashCode(sk2Var.T);
            sm4 l5 = sk2Var.l();
            zy3 e05 = l07.e0(sk2Var, a6);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var2);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a7);
            oo2.S(sk2Var, dnVar2, l5);
            b31.x(hashCode5, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e05);
            ir6.b(me2.X(sk2Var, R.string.slot2_analog_axis_y), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).i, sk2Var, 0, 0, 65534);
            ir6.b(me2.X(sk2Var, R.string.slot2_analog_axis_y_expected), null, sn2.y(sk2Var).c(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).j, sk2Var, 0, 0, 65530);
            sk2Var.p(true);
            ir6.b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).j, sk2Var, 0, 0, 65534);
            sk2Var.p(true);
            zy3 b03 = b53.b0(wy3Var, RecyclerView.A1, 12.0f, RecyclerView.A1, RecyclerView.A1, 13);
            sr5 a8 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode6 = Long.hashCode(sk2Var.T);
            sm4 l6 = sk2Var.l();
            zy3 e06 = l07.e0(sk2Var, b03);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var2);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a8);
            oo2.S(sk2Var, dnVar2, l6);
            b31.x(hashCode6, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e06);
            ir6.b(me2.X(sk2Var, R.string.slot2_analog_invert_x), ur5Var.a(wy3Var, 1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).i, sk2Var, 0, 0, 65532);
            boolean z9 = u86Var.e;
            Integer num = u86Var.a;
            hl6.a(z9, mi2Var, null, false, null, sk2Var, (i17 >> 9) & 112, 60);
            sk2Var.p(true);
            zy3 b04 = b53.b0(wy3Var, RecyclerView.A1, 8.0f, RecyclerView.A1, RecyclerView.A1, 13);
            sr5 a9 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode7 = Long.hashCode(sk2Var.T);
            sm4 l7 = sk2Var.l();
            zy3 e07 = l07.e0(sk2Var, b04);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var2);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a9);
            oo2.S(sk2Var, dnVar2, l7);
            b31.x(hashCode7, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e07);
            ir6.b(me2.X(sk2Var, R.string.slot2_analog_invert_y), ur5Var.a(wy3Var, 1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).i, sk2Var, 0, 0, 65532);
            hl6.a(u86Var.f, mi2Var2, null, false, null, sk2Var, (i17 >> 12) & 112, 60);
            sk2Var.p(true);
            zy3 b05 = b53.b0(wy3Var, RecyclerView.A1, 8.0f, RecyclerView.A1, RecyclerView.A1, 13);
            sr5 a10 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode8 = Long.hashCode(sk2Var.T);
            sm4 l8 = sk2Var.l();
            zy3 e08 = l07.e0(sk2Var, b05);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var2);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a10);
            oo2.S(sk2Var, dnVar2, l8);
            b31.x(hashCode8, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e08);
            ir6.b(me2.X(sk2Var, R.string.slot2_analog_deadzone), ur5Var.a(wy3Var, 1.0f, true), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).i, sk2Var, 0, 0, 65532);
            int i18 = i17 & 3670016;
            if (i18 == 1048576) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i19 = i17 & 14;
            if (i19 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z10 = z3 | z2;
            Object L = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (z10 || L == sn1Var) {
                L = new ki2() { // from class: h13
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i20 = r3;
                        o27 o27Var = o27.a;
                        u86 u86Var3 = u86Var;
                        mi2 mi2Var5 = mi2Var3;
                        switch (i20) {
                            case 0:
                                float f3 = u86Var3.g - 0.01f;
                                if (f3 < RecyclerView.A1) {
                                    f3 = 0.0f;
                                }
                                mi2Var5.n(Float.valueOf(f3));
                                return o27Var;
                            default:
                                float f4 = u86Var3.g + 0.01f;
                                if (f4 > 1.0f) {
                                    f4 = 1.0f;
                                }
                                mi2Var5.n(Float.valueOf(f4));
                                return o27Var;
                        }
                    }
                };
                sk2Var.h0(L);
            }
            u86Var2 = u86Var;
            l.k((ki2) L, null, false, null, nt0.a, sk2Var, 805306368, 510);
            ir6.b(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(io2.l(u86Var2.g, RecyclerView.A1, 1.0f))}, 1)), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).j, sk2Var, 0, 0, 65534);
            if (i18 == 1048576) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i19 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z5 | z4;
            Object L2 = sk2Var.L();
            if (!z11 && L2 != sn1Var) {
                z6 = true;
            } else {
                z6 = true;
                L2 = new ki2() { // from class: h13
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i20 = r3;
                        o27 o27Var = o27.a;
                        u86 u86Var3 = u86Var2;
                        mi2 mi2Var5 = mi2Var3;
                        switch (i20) {
                            case 0:
                                float f3 = u86Var3.g - 0.01f;
                                if (f3 < RecyclerView.A1) {
                                    f3 = 0.0f;
                                }
                                mi2Var5.n(Float.valueOf(f3));
                                return o27Var;
                            default:
                                float f4 = u86Var3.g + 0.01f;
                                if (f4 > 1.0f) {
                                    f4 = 1.0f;
                                }
                                mi2Var5.n(Float.valueOf(f4));
                                return o27Var;
                        }
                    }
                };
                sk2Var.h0(L2);
            }
            l.k((ki2) L2, null, false, null, nt0.b, sk2Var, 805306368, 510);
            sk2Var.p(z6);
            zy3 b06 = b53.b0(wy3Var, RecyclerView.A1, 8.0f, RecyclerView.A1, RecyclerView.A1, 13);
            sr5 a11 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode9 = Long.hashCode(sk2Var.T);
            sm4 l9 = sk2Var.l();
            zy3 e09 = l07.e0(sk2Var, b06);
            sk2Var.b0();
            if (sk2Var.S) {
                mv0Var = mv0Var2;
                sk2Var.k(mv0Var);
            } else {
                mv0Var = mv0Var2;
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a11);
            oo2.S(sk2Var, dnVar2, l9);
            b31.x(hashCode9, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e09);
            zy3 a12 = ur5Var.a(wy3Var, 1.0f, true);
            lr0 a13 = jr0.a(mtVar, h20Var, sk2Var, 0);
            int hashCode10 = Long.hashCode(sk2Var.T);
            sm4 l10 = sk2Var.l();
            zy3 e010 = l07.e0(sk2Var, a12);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a13);
            oo2.S(sk2Var, dnVar2, l10);
            b31.x(hashCode10, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e010);
            mv0 mv0Var3 = mv0Var;
            ir6.b(me2.X(sk2Var, R.string.slot2_analog_device), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).i, sk2Var, 0, 0, 65534);
            ir6.b(me2.X(sk2Var, R.string.slot2_analog_device_summary), null, sn2.y(sk2Var).c(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).j, sk2Var, 0, 0, 65530);
            sk2Var.p(true);
            boolean z12 = u86Var2.b;
            if (num != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            hl6.a(z12, mi2Var4, null, z7, null, sk2Var, (i17 >> 18) & 112, 52);
            sk2Var.p(true);
            if (u86Var2.b) {
                sk2Var.X(1319829179);
                if (num != null) {
                    o = String.valueOf(num.intValue());
                } else {
                    o = null;
                }
                if (o == null) {
                    z8 = false;
                    o = b31.o(sk2Var, 319671132, R.string.slot2_analog_map_axis_first, sk2Var, false);
                } else {
                    z8 = false;
                    sk2Var.X(319669799);
                    sk2Var.p(false);
                }
                sk2Var.p(z8);
            } else {
                o = b31.o(sk2Var, 1319938578, R.string.slot2_analog_any_device, sk2Var, false);
            }
            zy3 b07 = b53.b0(wy3Var, RecyclerView.A1, 4.0f, RecyclerView.A1, RecyclerView.A1, 13);
            sr5 a14 = rr5.a(ltVar, i20Var, sk2Var, 48);
            int hashCode11 = Long.hashCode(sk2Var.T);
            sm4 l11 = sk2Var.l();
            zy3 e011 = l07.e0(sk2Var, b07);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var3);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a14);
            oo2.S(sk2Var, dnVar2, l11);
            b31.x(hashCode11, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e011);
            ir6.b(o, null, sn2.y(sk2Var).c(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, sn2.D(sk2Var).j, sk2Var, 0, 0, 65530);
            sk2Var = sk2Var;
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            u86Var2 = u86Var;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new pm5(u86Var2, aVar, ki2Var, ki2Var2, mi2Var, mi2Var2, mi2Var3, mi2Var4, i);
        }
    }

    public static final void e(String str, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        String str2;
        ki2 ki2Var2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1858542056);
        if (sk2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (sk2Var.h(ki2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i5 & 1, z)) {
            zy3 i6 = dk7.i(o76.c, xq0.b(0.8f, ((hr0) sk2Var.j(ir0.a)).a()), iq2.g);
            Object L = sk2Var.L();
            if (L == su0.a) {
                L = new d5(17);
                sk2Var.h0(L);
            }
            zy3 s = a53.s(i6, true, null, (ki2) L, 14);
            tv3 d = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e0 = l07.e0(sk2Var, s);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, d);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e0);
            y60 y60Var = y60.n0;
            j20 j20Var = y60.Z;
            wy3 wy3Var = wy3.a;
            zy3 i7 = y60Var.i(wy3Var, j20Var);
            lr0 a = jr0.a(rt.c, y60.k0, sk2Var, 48);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, i7);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a);
            oo2.S(sk2Var, dnVar2, l2);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e02);
            ir6.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((c17) sk2Var.j(d17.b)).f, sk2Var, i5 & 14, 0, 65534);
            str2 = str;
            sk2Var = sk2Var;
            cg2.k(sk2Var, o76.d(wy3Var, 16.0f));
            ki2Var2 = ki2Var;
            l.k(ki2Var2, null, false, null, nt0.d, sk2Var, ((i5 >> 3) & 14) | 805306368, 510);
            sk2Var.p(true);
            sk2Var.p(true);
        } else {
            str2 = str;
            ki2Var2 = ki2Var;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new s4(i, 17, str2, ki2Var2);
        }
    }

    public static final String f(int i) {
        String axisToString = MotionEvent.axisToString(i);
        axisToString.getClass();
        String obj = zg6.Z0(gh6.l0(gh6.l0(axisToString, "AXIS_", ""), "_", " ")).toString();
        return obj + " (#" + i + ")";
    }
}
