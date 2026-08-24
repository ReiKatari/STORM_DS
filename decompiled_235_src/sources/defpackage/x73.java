package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x73  reason: default package */
/* loaded from: classes.dex */
public abstract class x73 {
    public static final Set a = fv.V0(new b63[]{b63.UP, b63.DOWN, b63.LEFT, b63.RIGHT, b63.A, b63.B, b63.X, b63.Y, b63.L, b63.R, b63.START, b63.SELECT});

    public static final void a(i63 i63Var, boolean z, on2 on2Var, on2 on2Var2, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        long j;
        float f;
        long j2;
        boolean z3;
        boolean z4;
        String P0;
        ArrayList arrayList;
        int i6;
        String O;
        boolean z5;
        long j3;
        oj2 oj2Var;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1793988537);
        if (xq2Var.f(i63Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (xq2Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (xq2Var.h(on2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        if (xq2Var.h(on2Var2)) {
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
        if (xq2Var.S(i10 & 1, z2)) {
            Object P = xq2Var.P();
            Object obj = ox0.a;
            if (P == obj) {
                nh2 nh2Var = nh2.b;
                P = mh2.a;
                xq2Var.l0(P);
            }
            ((mh2) P).getClass();
            nh2 nh2Var2 = new nh2();
            nh2 nh2Var3 = new nh2();
            es7 F = bl2.F(xq2Var);
            Object P2 = xq2Var.P();
            if (P2 == obj) {
                P2 = i61.f(xq2Var);
            }
            r94 r94Var = (r94) P2;
            qa4 a2 = bw7.a(r94Var, xq2Var, 6);
            y16 b = z16.b(13.0f);
            d40 d40Var = d90.i0;
            x64 x64Var = x64.a;
            a74 g = u24.g(dj6.c(x64Var, 1.0f), b);
            if (!((Boolean) a2.getValue()).booleanValue() && !z) {
                j = F.d;
            } else {
                j = F.e;
            }
            a74 L = vy7.L(g, j, u24.m);
            if (!((Boolean) a2.getValue()).booleanValue() && !z) {
                f = 1.0f;
            } else {
                f = 2.0f;
            }
            if (!((Boolean) a2.getValue()).booleanValue() && !z) {
                j2 = F.e;
            } else {
                j2 = F.l;
            }
            a74 S = ak7.S(ak7.I(L, f, j2, b), nh2Var2);
            if ((i10 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f2 = z3 | xq2Var.f(nh2Var3);
            Object P3 = xq2Var.P();
            if (f2 || P3 == obj) {
                P3 = new bi2(9, i63Var, nh2Var3);
                xq2Var.l0(P3);
            }
            a74 R = ge7.R(mb3.t(ge7.y(S, (qn2) P3), r94Var, null, false, null, on2Var, 28), 14.0f, 10.0f, 8.0f, 10.0f);
            l26 a3 = k26.a(ju.a, d40Var, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, R);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a3);
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
            yt0 a4 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a4);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            List c0 = hf.c0(i63Var.b, i63Var.c);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : c0) {
                if (!nb3.k((h63) obj2, g63.a)) {
                    arrayList2.add(obj2);
                }
            }
            if (z) {
                z4 = false;
                P0 = i61.l(xq2Var, 2025252762, R.string.press_any_button, xq2Var, false);
                arrayList = arrayList2;
            } else {
                z4 = false;
                xq2Var.b0(2025363897);
                if (arrayList2.isEmpty()) {
                    P0 = i61.l(xq2Var, 2025375739, R.string.not_set, xq2Var, false);
                    arrayList = arrayList2;
                } else {
                    xq2Var.b0(2025481666);
                    Object P4 = xq2Var.P();
                    if (P4 == obj) {
                        P4 = new bz1(26);
                        xq2Var.l0(P4);
                    }
                    P0 = gt0.P0(arrayList2, " / ", null, null, (qn2) P4, 30);
                    arrayList = arrayList2;
                    z4 = false;
                    xq2Var.p(false);
                }
                xq2Var.p(z4);
            }
            b63 b63Var = i63Var.a;
            xq2Var.b0(2139434571);
            switch (w73.a[b63Var.ordinal()]) {
                case 1:
                    i6 = R.string.input_a;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 2:
                    i6 = R.string.input_b;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 3:
                    i6 = R.string.input_x;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 4:
                    i6 = R.string.input_y;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 5:
                    i6 = R.string.input_left;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 6:
                    i6 = R.string.input_right;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 7:
                    i6 = R.string.input_up;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 8:
                    i6 = R.string.input_down;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 9:
                    i6 = R.string.input_l;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 10:
                    i6 = R.string.input_r;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 11:
                    i6 = R.string.input_start;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 12:
                    i6 = R.string.input_select;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 13:
                    i6 = R.string.input_lid;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 14:
                    i6 = R.string.input_pause;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 15:
                    i6 = R.string.input_fast_forward;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 16:
                    i6 = R.string.input_hold_fast_forward;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 17:
                    i6 = R.string.input_microphone;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 18:
                    i6 = R.string.input_reset;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 19:
                    i6 = R.string.input_swap_screens;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 20:
                    i6 = R.string.input_quick_save;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    i6 = R.string.input_quick_load;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case 22:
                    i6 = R.string.rewind;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                case ConnectionResult.API_DISABLED /* 23 */:
                    i6 = R.string.input_translate;
                    O = yh2.O(xq2Var, i6);
                    z5 = false;
                    xq2Var.p(false);
                    break;
                default:
                    xq2Var.p(z4);
                    O = null;
                    z5 = false;
                    break;
            }
            if (O == null) {
                O = "";
            }
            nq6 nq6Var = ye7.b;
            String str = P0;
            ArrayList arrayList3 = arrayList;
            x37.b(O, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47.a(((xe7) xq2Var.j(nq6Var)).i, F.g, 0L, oj2.Z, null, 0L, 0L, null, 16777210), xq2Var, 0, 0, 65534);
            s47 s47Var = ((xe7) xq2Var.j(nq6Var)).j;
            if (z) {
                j3 = F.l;
            } else if (!arrayList3.isEmpty()) {
                j3 = F.g;
            } else {
                j3 = F.h;
            }
            long j4 = j3;
            if (!z && arrayList3.isEmpty()) {
                oj2Var = oj2.Y;
            } else {
                oj2Var = oj2.d0;
            }
            x37.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47.a(s47Var, j4, 0L, oj2Var, null, 0L, 0L, null, 16777210), xq2Var, 0, 0, 65534);
            xq2Var = xq2Var;
            xq2Var.p(true);
            if (i63Var.b()) {
                xq2Var.b0(247131823);
                a74 S2 = ak7.S(x64Var, nh2Var3);
                boolean f3 = xq2Var.f(nh2Var2);
                Object P5 = xq2Var.P();
                if (f3 || P5 == obj) {
                    P5 = new do0(nh2Var2, 2);
                    xq2Var.l0(P5);
                }
                ej2.b(on2Var2, ge7.y(S2, (qn2) P5), false, n16.I(-2050622722, new d4(F, 1), xq2Var), xq2Var, ((i10 >> 9) & 14) | 24576, 12);
                xq2Var.p(false);
            } else {
                xq2Var.b0(247508845);
                xq2Var.p(false);
            }
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new j7(i63Var, z, on2Var, on2Var2, i);
        }
    }

    public static final void b(final b bVar, on2 on2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        vs0 vs0Var;
        bVar.getClass();
        on2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(17335339);
        if (xq2Var.h(bVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (xq2Var.h(on2Var)) {
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
        if (xq2Var.S(i5 & 1, z)) {
            qa4 n = nb3.n(bVar.f, xq2Var);
            qa4 n2 = nb3.n(bVar.j, xq2Var);
            qa4 n3 = nb3.n(bVar.h, xq2Var);
            qa4 n4 = nb3.n(bVar.l, xq2Var);
            be5 be5Var = bVar.n;
            List list = (List) n.getValue();
            b63 b63Var = (b63) n2.getValue();
            kk6 kk6Var = (kk6) n3.getValue();
            b.a aVar = (b.a) n4.getValue();
            boolean h = xq2Var.h(bVar);
            Object P = xq2Var.P();
            vs0 vs0Var2 = ox0.a;
            if (!h && P != vs0Var2) {
                vs0Var = vs0Var2;
            } else {
                vs0Var = vs0Var2;
                a0 a0Var = new a0(1, bVar, b.class, "startInputAssignment", "startInputAssignment(Lme/magnum/melonds/domain/model/Input;)V", 0, 0, 17);
                xq2Var.l0(a0Var);
                P = a0Var;
            }
            qn2 qn2Var = (qn2) ((po2) P);
            boolean h2 = xq2Var.h(bVar);
            Object P2 = xq2Var.P();
            if (h2 || P2 == vs0Var) {
                a0 a0Var2 = new a0(1, bVar, b.class, "clearInputAssignment", "clearInputAssignment(Lme/magnum/melonds/domain/model/Input;)V", 0, 0, 18);
                xq2Var.l0(a0Var2);
                P2 = a0Var2;
            }
            qn2 qn2Var2 = (qn2) ((po2) P2);
            boolean h3 = xq2Var.h(bVar);
            Object P3 = xq2Var.P();
            if (h3 || P3 == vs0Var) {
                P3 = new on2() { // from class: k73
                    @Override // defpackage.on2
                    public final Object c() {
                        int i6 = r2;
                        jg7 jg7Var = jg7.a;
                        b bVar2 = bVar;
                        switch (i6) {
                            case 0:
                                b.a aVar2 = b.a.X;
                                bVar2.getClass();
                                aVar2.getClass();
                                bVar2.i.l(null);
                                tp6 tp6Var = bVar2.k;
                                tp6Var.getClass();
                                tp6Var.m(null, aVar2);
                                return jg7Var;
                            default:
                                b.a aVar3 = b.a.Y;
                                bVar2.getClass();
                                aVar3.getClass();
                                bVar2.i.l(null);
                                tp6 tp6Var2 = bVar2.k;
                                tp6Var2.getClass();
                                tp6Var2.m(null, aVar3);
                                return jg7Var;
                        }
                    }
                };
                xq2Var.l0(P3);
            }
            on2 on2Var2 = (on2) P3;
            boolean h4 = xq2Var.h(bVar);
            Object P4 = xq2Var.P();
            if (h4 || P4 == vs0Var) {
                P4 = new on2() { // from class: k73
                    @Override // defpackage.on2
                    public final Object c() {
                        int i6 = r2;
                        jg7 jg7Var = jg7.a;
                        b bVar2 = bVar;
                        switch (i6) {
                            case 0:
                                b.a aVar2 = b.a.X;
                                bVar2.getClass();
                                aVar2.getClass();
                                bVar2.i.l(null);
                                tp6 tp6Var = bVar2.k;
                                tp6Var.getClass();
                                tp6Var.m(null, aVar2);
                                return jg7Var;
                            default:
                                b.a aVar3 = b.a.Y;
                                bVar2.getClass();
                                aVar3.getClass();
                                bVar2.i.l(null);
                                tp6 tp6Var2 = bVar2.k;
                                tp6Var2.getClass();
                                tp6Var2.m(null, aVar3);
                                return jg7Var;
                        }
                    }
                };
                xq2Var.l0(P4);
            }
            on2 on2Var3 = (on2) P4;
            boolean h5 = xq2Var.h(bVar);
            Object P5 = xq2Var.P();
            if (h5 || P5 == vs0Var) {
                a0 a0Var3 = new a0(1, bVar, b.class, "setSlot2InvertX", "setSlot2InvertX(Z)V", 0, 0, 19);
                xq2Var.l0(a0Var3);
                P5 = a0Var3;
            }
            qn2 qn2Var3 = (qn2) ((po2) P5);
            boolean h6 = xq2Var.h(bVar);
            Object P6 = xq2Var.P();
            if (h6 || P6 == vs0Var) {
                a0 a0Var4 = new a0(1, bVar, b.class, "setSlot2InvertY", "setSlot2InvertY(Z)V", 0, 0, 20);
                xq2Var.l0(a0Var4);
                P6 = a0Var4;
            }
            qn2 qn2Var4 = (qn2) ((po2) P6);
            boolean h7 = xq2Var.h(bVar);
            Object P7 = xq2Var.P();
            if (h7 || P7 == vs0Var) {
                a0 a0Var5 = new a0(1, bVar, b.class, "setSlot2Deadzone", "setSlot2Deadzone(F)V", 0, 0, 21);
                xq2Var.l0(a0Var5);
                P7 = a0Var5;
            }
            qn2 qn2Var5 = (qn2) ((po2) P7);
            boolean h8 = xq2Var.h(bVar);
            Object P8 = xq2Var.P();
            if (h8 || P8 == vs0Var) {
                a0 a0Var6 = new a0(1, bVar, b.class, "setSlot2UseDeviceFilter", "setSlot2UseDeviceFilter(Z)V", 0, 0, 22);
                xq2Var.l0(a0Var6);
                P8 = a0Var6;
            }
            qn2 qn2Var6 = (qn2) ((po2) P8);
            boolean h9 = xq2Var.h(bVar);
            Object P9 = xq2Var.P();
            if (h9 || P9 == vs0Var) {
                i4 i4Var = new i4(0, bVar, b.class, "stopAnyAssignment", "stopAnyAssignment()V", 0, 0, 6);
                xq2Var.l0(i4Var);
                P9 = i4Var;
            }
            c(list, b63Var, kk6Var, aVar, be5Var, qn2Var, qn2Var2, on2Var2, on2Var3, qn2Var3, qn2Var4, qn2Var5, qn2Var6, (on2) ((po2) P9), on2Var, xq2Var, 0, (i5 << 9) & 57344);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ql1(bVar, i, 17, on2Var);
        }
    }

    public static final void c(final List list, final b63 b63Var, final kk6 kk6Var, final b.a aVar, final le2 le2Var, final qn2 qn2Var, final qn2 qn2Var2, final on2 on2Var, final on2 on2Var2, final qn2 qn2Var3, final qn2 qn2Var4, final qn2 qn2Var5, final qn2 qn2Var6, final on2 on2Var3, final on2 on2Var4, px0 px0Var, final int i, final int i2) {
        qn2 qn2Var7;
        int i3;
        xq2 xq2Var;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(2056390557);
        int i4 = (xq2Var2.h(list) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= xq2Var2.d(b63Var == null ? -1 : b63Var.ordinal()) ? 32 : 16;
        }
        int i5 = i4 | (xq2Var2.f(kk6Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i5 |= xq2Var2.d(aVar != null ? aVar.ordinal() : -1) ? 2048 : 1024;
        }
        int i6 = i5 | (xq2Var2.h(le2Var) ? 16384 : 8192);
        if ((196608 & i) == 0) {
            qn2Var7 = qn2Var;
            i6 |= xq2Var2.h(qn2Var7) ? 131072 : 65536;
        } else {
            qn2Var7 = qn2Var;
        }
        if ((i & 1572864) == 0) {
            i6 |= xq2Var2.h(qn2Var2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i6 |= xq2Var2.h(on2Var) ? 8388608 : Compress.MAXWINSIZE;
        }
        if ((i & 100663296) == 0) {
            i6 |= xq2Var2.h(on2Var2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i6 |= xq2Var2.h(qn2Var3) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i3 = i2 | (xq2Var2.h(qn2Var4) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= xq2Var2.h(qn2Var5) ? 32 : 16;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            i3 |= xq2Var2.h(qn2Var6) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= xq2Var2.h(on2Var3) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= xq2Var2.h(on2Var4) ? 16384 : 8192;
        }
        int i7 = i3;
        if (xq2Var2.S(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            ah2 ah2Var = (ah2) xq2Var2.j(ky0.i);
            boolean z = (b63Var == null && aVar == null) ? false : true;
            boolean z2 = (i7 & 7168) == 2048;
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (z2 || P == vs0Var) {
                P = new x7(11, on2Var3);
                xq2Var2.l0(P);
            }
            ge7.b(z, (on2) P, xq2Var2, 0, 0);
            boolean h = xq2Var2.h(le2Var) | xq2Var2.h(ah2Var);
            Object P2 = xq2Var2.P();
            if (h || P2 == vs0Var) {
                P2 = new q73(le2Var, ah2Var, null);
                xq2Var2.l0(P2);
            }
            mb3.i(xq2Var2, (eo2) P2, jg7.a);
            boolean f = xq2Var2.f(list);
            Object P3 = xq2Var2.P();
            Set set = a;
            ArrayList arrayList = P3;
            if (f || P3 == vs0Var) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Iterator it2 = it;
                    if (set.contains(((i63) next).a)) {
                        arrayList2.add(next);
                    }
                    it = it2;
                }
                xq2Var2.l0(arrayList2);
                arrayList = arrayList2;
            }
            List list2 = (List) arrayList;
            boolean f2 = xq2Var2.f(list);
            Object P4 = xq2Var2.P();
            ArrayList arrayList3 = P4;
            if (f2 || P4 == vs0Var) {
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Object next2 = it3.next();
                    Iterator it4 = it3;
                    if (!set.contains(((i63) next2).a)) {
                        arrayList4.add(next2);
                    }
                    it3 = it4;
                }
                xq2Var2.l0(arrayList4);
                arrayList3 = arrayList4;
            }
            xq2Var = xq2Var2;
            ps7.a(yh2.O(xq2Var2, R.string.key_mapping), on2Var4, null, null, null, null, n16.I(1474138833, new n73(list2, b63Var, qn2Var7, qn2Var2, (List) arrayList3, kk6Var, aVar, on2Var, on2Var2, qn2Var3, qn2Var4, qn2Var5, qn2Var6, on2Var3), xq2Var2), xq2Var, ((i7 >> 9) & 112) | 1572864, 60);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: o73
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(i | 1);
                    int a02 = ii2.a0(i2);
                    x73.c(list, b63Var, kk6Var, aVar, le2Var, qn2Var, qn2Var2, on2Var, on2Var2, qn2Var3, qn2Var4, qn2Var5, qn2Var6, on2Var3, on2Var4, (px0) obj, a0, a02);
                    return jg7.a;
                }
            };
        }
    }

    public static final void d(String str, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1078369560);
        if (xq2Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i3 & 1, z)) {
            xq2Var = xq2Var2;
            x37.b(str, ge7.S(x64.a, 4.0f, 6.0f, RecyclerView.B1, 2.0f, 4), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47.a(((xe7) xq2Var2.j(ye7.b)).h, bl2.F(xq2Var2).l, 0L, oj2.e0, null, 0L, 0L, null, 16777210), xq2Var, (i3 & 14) | 48, 0, 65532);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new g5(str, i, 2);
        }
    }

    public static final void e(final kk6 kk6Var, b.a aVar, on2 on2Var, on2 on2Var2, qn2 qn2Var, qn2 qn2Var2, qn2 qn2Var3, qn2 qn2Var4, px0 px0Var, int i) {
        final kk6 kk6Var2;
        final qn2 qn2Var5;
        xq2 xq2Var;
        String g;
        int i2;
        String g2;
        a74 c;
        a74 L;
        a74 c2;
        a74 L2;
        a74 I;
        a74 b;
        a74 L3;
        a74 c3;
        a74 L4;
        a74 I2;
        a74 b2;
        a74 L5;
        a74 c4;
        a74 b3;
        a74 c5;
        a74 b4;
        a74 c6;
        a74 b5;
        a74 L6;
        boolean z;
        a74 L7;
        a74 L8;
        a74 c7;
        a74 b6;
        String O;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(1848560754);
        int i3 = i | (xq2Var2.f(kk6Var) ? 4 : 2) | (xq2Var2.d(aVar == null ? -1 : aVar.ordinal()) ? 32 : 16) | (xq2Var2.h(on2Var) ? 256 : 128) | (xq2Var2.h(on2Var2) ? 2048 : 1024) | (xq2Var2.h(qn2Var) ? 16384 : 8192) | (xq2Var2.h(qn2Var2) ? 131072 : 65536) | (xq2Var2.h(qn2Var3) ? 1048576 : 524288) | (xq2Var2.h(qn2Var4) ? 8388608 : Compress.MAXWINSIZE);
        if (xq2Var2.S(i3 & 1, (4793491 & i3) != 4793490)) {
            es7 F = bl2.F(xq2Var2);
            y16 b7 = z16.b(14.0f);
            y16 b8 = z16.b(10.0f);
            b.a aVar2 = b.a.X;
            if (aVar == aVar2) {
                xq2Var2.b0(403359991);
                g = yh2.O(xq2Var2, R.string.press_any_button);
                xq2Var2.s();
            } else {
                xq2Var2.b0(403422580);
                xq2Var2.s();
                g = g(kk6Var.c);
            }
            String str = g;
            b.a aVar3 = b.a.Y;
            if (aVar == aVar3) {
                i2 = i3;
                xq2Var2.b0(403583191);
                g2 = yh2.O(xq2Var2, R.string.press_any_button);
                xq2Var2.s();
            } else {
                i2 = i3;
                xq2Var2.b0(403645780);
                xq2Var2.s();
                g2 = g(kk6Var.d);
            }
            x64 x64Var = x64.a;
            c = dj6.c(x64Var, 1.0f);
            L = vy7.L(u24.g(c, b7), F.d, u24.m);
            a74 O2 = ge7.O(ak7.I(L, 1.0f, F.c(), b7), 14.0f);
            c40 c40Var = d90.k0;
            eu euVar = ju.c;
            yt0 a2 = wt0.a(euVar, c40Var, xq2Var2, 0);
            int hashCode = Long.hashCode(ge7.C(xq2Var2));
            xv4 z2 = xq2Var2.z();
            a74 E = l.E(xq2Var2, O2);
            jx0.i.getClass();
            String str2 = g2;
            iy0 b9 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b9);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a2);
            yh2.K(xq2Var2, ix0.f(), z2);
            i61.x(xq2Var2, Integer.valueOf(hashCode), xq2Var2, xq2Var2, E);
            x37.b(yh2.O(xq2Var2, R.string.slot2_analog_mapping_summary), ge7.S(x64Var, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, 12.0f, 7), F.e(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gi2.I(xq2Var2).j, xq2Var2, 48, 0, 65528);
            c2 = dj6.c(x64Var, 1.0f);
            L2 = vy7.L(u24.g(c2, b8), aVar == aVar2 ? F.c() : F.b(), u24.m);
            if (aVar == aVar2) {
                I = ak7.I(L2, 1.5f, F.a(), b8);
            } else {
                I = ak7.I(L2, 1.0f, F.c(), b8);
            }
            a74 P = ge7.P(mb3.u(I, false, null, on2Var, 15), 12.0f, 10.0f);
            d40 d40Var = d90.i0;
            du duVar = ju.a;
            l26 a3 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode2 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z3 = xq2Var2.z();
            a74 E2 = l.E(xq2Var2, P);
            iy0 b10 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b10);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a3);
            yh2.K(xq2Var2, ix0.f(), z3);
            i61.x(xq2Var2, Integer.valueOf(hashCode2), xq2Var2, xq2Var2, E2);
            n26 n26Var = n26.a;
            b = n26Var.b(x64Var, 1.0f, true);
            yt0 a4 = wt0.a(euVar, c40Var, xq2Var2, 0);
            int hashCode3 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z4 = xq2Var2.z();
            a74 E3 = l.E(xq2Var2, b);
            iy0 b11 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b11);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a4);
            yh2.K(xq2Var2, ix0.f(), z4);
            i61.x(xq2Var2, Integer.valueOf(hashCode3), xq2Var2, xq2Var2, E3);
            String O3 = yh2.O(xq2Var2, R.string.slot2_analog_axis_x);
            s47 a5 = gi2.I(xq2Var2).a();
            long d = F.d();
            oj2 oj2Var = oj2.Z;
            x37.b(O3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47.a(a5, d, 0L, oj2Var, null, 0L, 0L, null, 16777210), xq2Var2, 0, 0, 65534);
            x37.b(yh2.O(xq2Var2, R.string.slot2_analog_axis_x_expected), null, F.e(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gi2.I(xq2Var2).b(), xq2Var2, 0, 0, 65530);
            xq2Var2.r();
            L3 = vy7.L(u24.g(x64Var, z16.b(6.0f)), F.c(), u24.m);
            a74 P2 = ge7.P(L3, 8.0f, 4.0f);
            e40 e40Var = d90.L;
            e34 d2 = h70.d(e40Var, false);
            int hashCode4 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z5 = xq2Var2.z();
            a74 E4 = l.E(xq2Var2, P2);
            iy0 b12 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b12);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), d2);
            yh2.K(xq2Var2, ix0.f(), z5);
            i61.x(xq2Var2, Integer.valueOf(hashCode4), xq2Var2, xq2Var2, E4);
            x37.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47.a(gi2.I(xq2Var2).j, aVar == aVar2 ? F.a() : F.d(), 0L, nj2.t(), null, 0L, 0L, null, 16777210), xq2Var2, 0, 0, 65534);
            xq2Var2.r();
            xq2Var2.r();
            gi2.h(xq2Var2, dj6.e(x64Var, 8.0f));
            c3 = dj6.c(x64Var, 1.0f);
            L4 = vy7.L(u24.g(c3, b8), aVar == aVar3 ? F.c() : F.b(), u24.m);
            if (aVar == aVar3) {
                I2 = ak7.I(L4, 1.5f, F.a(), b8);
            } else {
                I2 = ak7.I(L4, 1.0f, F.c(), b8);
            }
            a74 P3 = ge7.P(mb3.u(I2, false, null, on2Var2, 15), 12.0f, 10.0f);
            l26 a6 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode5 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z6 = xq2Var2.z();
            a74 E5 = l.E(xq2Var2, P3);
            iy0 b13 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b13);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a6);
            yh2.K(xq2Var2, ix0.f(), z6);
            i61.x(xq2Var2, Integer.valueOf(hashCode5), xq2Var2, xq2Var2, E5);
            b2 = n26Var.b(x64Var, 1.0f, true);
            yt0 a7 = wt0.a(euVar, c40Var, xq2Var2, 0);
            int hashCode6 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z7 = xq2Var2.z();
            a74 E6 = l.E(xq2Var2, b2);
            iy0 b14 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b14);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a7);
            yh2.K(xq2Var2, ix0.f(), z7);
            i61.x(xq2Var2, Integer.valueOf(hashCode6), xq2Var2, xq2Var2, E6);
            x37.b(yh2.O(xq2Var2, R.string.slot2_analog_axis_y), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47.a(gi2.I(xq2Var2).a(), F.d(), 0L, oj2Var, null, 0L, 0L, null, 16777210), xq2Var2, 0, 0, 65534);
            x37.b(yh2.O(xq2Var2, R.string.slot2_analog_axis_y_expected), null, F.e(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gi2.I(xq2Var2).b(), xq2Var2, 0, 0, 65530);
            xq2Var2.r();
            L5 = vy7.L(u24.g(x64Var, z16.b(6.0f)), F.c(), u24.m);
            a74 P4 = ge7.P(L5, 8.0f, 4.0f);
            e34 d3 = h70.d(e40Var, false);
            int hashCode7 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z8 = xq2Var2.z();
            a74 E7 = l.E(xq2Var2, P4);
            iy0 b15 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b15);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), d3);
            yh2.K(xq2Var2, ix0.f(), z8);
            i61.x(xq2Var2, Integer.valueOf(hashCode7), xq2Var2, xq2Var2, E7);
            x37.b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47.a(gi2.I(xq2Var2).j, aVar == aVar3 ? F.a() : F.d(), 0L, nj2.t(), null, 0L, 0L, null, 16777210), xq2Var2, 0, 0, 65534);
            xq2Var2.r();
            xq2Var2.r();
            gi2.h(xq2Var2, dj6.e(x64Var, 10.0f));
            c4 = dj6.c(x64Var, 1.0f);
            a74 Q = ge7.Q(c4, RecyclerView.B1, 4.0f, 1);
            l26 a8 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode8 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z9 = xq2Var2.z();
            a74 E8 = l.E(xq2Var2, Q);
            iy0 b16 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b16);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a8);
            yh2.K(xq2Var2, ix0.f(), z9);
            i61.x(xq2Var2, Integer.valueOf(hashCode8), xq2Var2, xq2Var2, E8);
            String O4 = yh2.O(xq2Var2, R.string.slot2_analog_invert_x);
            s47 a9 = s47.a(gi2.I(xq2Var2).a(), F.d(), 0L, null, null, 0L, 0L, null, 16777214);
            b3 = n26Var.b(x64Var, 1.0f, true);
            x37.b(O4, b3, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, a9, xq2Var2, 0, 0, 65532);
            boolean z10 = kk6Var.e;
            Integer num = kk6Var.a;
            bx6.a(z10, qn2Var, null, false, nj2.i(F.a(), F.m, F.f(), F.n, xq2Var2, 996), xq2Var2, (i2 >> 9) & 112, 28);
            xq2Var2.r();
            c5 = dj6.c(x64Var, 1.0f);
            a74 Q2 = ge7.Q(c5, RecyclerView.B1, 4.0f, 1);
            l26 a10 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode9 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z11 = xq2Var2.z();
            a74 E9 = l.E(xq2Var2, Q2);
            iy0 b17 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b17);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a10);
            yh2.K(xq2Var2, ix0.f(), z11);
            i61.x(xq2Var2, Integer.valueOf(hashCode9), xq2Var2, xq2Var2, E9);
            String O5 = yh2.O(xq2Var2, R.string.slot2_analog_invert_y);
            s47 a11 = s47.a(gi2.I(xq2Var2).a(), F.d(), 0L, null, null, 0L, 0L, null, 16777214);
            b4 = n26Var.b(x64Var, 1.0f, true);
            x37.b(O5, b4, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, a11, xq2Var2, 0, 0, 65532);
            bx6.a(kk6Var.f, qn2Var2, null, false, nj2.i(F.a(), F.m, F.f(), F.n, xq2Var2, 996), xq2Var2, (i2 >> 12) & 112, 28);
            xq2Var2.r();
            c6 = dj6.c(x64Var, 1.0f);
            a74 Q3 = ge7.Q(c6, RecyclerView.B1, 4.0f, 1);
            l26 a12 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode10 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z12 = xq2Var2.z();
            a74 E10 = l.E(xq2Var2, Q3);
            iy0 b18 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b18);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a12);
            yh2.K(xq2Var2, ix0.f(), z12);
            i61.x(xq2Var2, Integer.valueOf(hashCode10), xq2Var2, xq2Var2, E10);
            String O6 = yh2.O(xq2Var2, R.string.slot2_analog_deadzone);
            s47 a13 = s47.a(gi2.I(xq2Var2).a(), F.d(), 0L, null, null, 0L, 0L, null, 16777214);
            b5 = n26Var.b(x64Var, 1.0f, true);
            x37.b(O6, b5, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, a13, xq2Var2, 0, 0, 65532);
            l26 a14 = k26.a(new gu(4.0f, true, new i(1)), d40Var, xq2Var2, 54);
            int hashCode11 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z13 = xq2Var2.z();
            a74 E11 = l.E(xq2Var2, x64Var);
            iy0 b19 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b19);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a14);
            yh2.K(xq2Var2, ix0.f(), z13);
            i61.x(xq2Var2, Integer.valueOf(hashCode11), xq2Var2, xq2Var2, E11);
            L6 = vy7.L(u24.g(dj6.i(x64Var, 32.0f), z16.c()), F.c(), u24.m);
            int i4 = i2 & 3670016;
            int i5 = i2 & 14;
            boolean z14 = (i4 == 1048576) | (i5 == 4);
            Object P5 = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (z14 || P5 == vs0Var) {
                z = false;
                qn2Var5 = qn2Var3;
                P5 = new on2() { // from class: l73
                    @Override // defpackage.on2
                    public final Object c() {
                        int i6 = r3;
                        jg7 jg7Var = jg7.a;
                        kk6 kk6Var3 = kk6Var;
                        qn2 qn2Var6 = qn2Var5;
                        switch (i6) {
                            case 0:
                                float f = kk6Var3.g - 0.01f;
                                if (f < RecyclerView.B1) {
                                    f = 0.0f;
                                }
                                qn2Var6.g(Float.valueOf(f));
                                return jg7Var;
                            default:
                                float f2 = kk6Var3.g + 0.01f;
                                if (f2 > 1.0f) {
                                    f2 = 1.0f;
                                }
                                qn2Var6.g(Float.valueOf(f2));
                                return jg7Var;
                        }
                    }
                };
                xq2Var2.l0(P5);
            } else {
                z = false;
                qn2Var5 = qn2Var3;
            }
            a74 u = mb3.u(L6, z, null, (on2) P5, 15);
            e40 e40Var2 = d90.Z;
            e34 d4 = h70.d(e40Var2, z);
            int hashCode12 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z15 = xq2Var2.z();
            a74 E12 = l.E(xq2Var2, u);
            iy0 b20 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b20);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), d4);
            yh2.K(xq2Var2, ix0.f(), z15);
            i61.x(xq2Var2, Integer.valueOf(hashCode12), xq2Var2, xq2Var2, E12);
            kk6Var2 = kk6Var;
            x37.b("-", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47.a(gi2.I(xq2Var2).a(), F.d(), 0L, nj2.p(), null, 0L, 0L, null, 16777210), xq2Var2, 6, 0, 65534);
            xq2Var2.r();
            L7 = vy7.L(u24.g(x64Var, z16.b(6.0f)), F.b(), u24.m);
            a74 P6 = ge7.P(L7, 10.0f, 4.0f);
            e34 d5 = h70.d(e40Var, false);
            int hashCode13 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z16 = xq2Var2.z();
            a74 E13 = l.E(xq2Var2, P6);
            iy0 b21 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b21);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), d5);
            yh2.K(xq2Var2, ix0.f(), z16);
            i61.x(xq2Var2, Integer.valueOf(hashCode13), xq2Var2, xq2Var2, E13);
            x37.b(String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Float.valueOf(gi2.p(kk6Var2.g, RecyclerView.B1, 1.0f))}, 1)), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47.a(gi2.I(xq2Var2).j, F.a(), 0L, nj2.p(), null, 0L, 0L, null, 16777210), xq2Var2, 0, 0, 65534);
            xq2Var2.r();
            L8 = vy7.L(u24.g(dj6.i(x64Var, 32.0f), z16.c()), F.c(), u24.m);
            boolean z17 = (i5 == 4) | (i4 == 1048576);
            Object P7 = xq2Var2.P();
            if (z17 || P7 == vs0Var) {
                P7 = new on2() { // from class: l73
                    @Override // defpackage.on2
                    public final Object c() {
                        int i6 = r3;
                        jg7 jg7Var = jg7.a;
                        kk6 kk6Var3 = kk6Var2;
                        qn2 qn2Var6 = qn2Var5;
                        switch (i6) {
                            case 0:
                                float f = kk6Var3.g - 0.01f;
                                if (f < RecyclerView.B1) {
                                    f = 0.0f;
                                }
                                qn2Var6.g(Float.valueOf(f));
                                return jg7Var;
                            default:
                                float f2 = kk6Var3.g + 0.01f;
                                if (f2 > 1.0f) {
                                    f2 = 1.0f;
                                }
                                qn2Var6.g(Float.valueOf(f2));
                                return jg7Var;
                        }
                    }
                };
                xq2Var2.l0(P7);
            }
            a74 u2 = mb3.u(L8, false, null, (on2) P7, 15);
            e34 d6 = h70.d(e40Var2, false);
            int hashCode14 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z18 = xq2Var2.z();
            a74 E14 = l.E(xq2Var2, u2);
            iy0 b22 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b22);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), d6);
            yh2.K(xq2Var2, ix0.f(), z18);
            i61.x(xq2Var2, Integer.valueOf(hashCode14), xq2Var2, xq2Var2, E14);
            x37.b("+", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47.a(gi2.I(xq2Var2).a(), F.d(), 0L, nj2.p(), null, 0L, 0L, null, 16777210), xq2Var2, 6, 0, 65534);
            xq2Var2.r();
            xq2Var2.r();
            xq2Var2.r();
            c7 = dj6.c(x64Var, 1.0f);
            a74 Q4 = ge7.Q(c7, RecyclerView.B1, 4.0f, 1);
            l26 a15 = k26.a(duVar, d40Var, xq2Var2, 48);
            int hashCode15 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z19 = xq2Var2.z();
            a74 E15 = l.E(xq2Var2, Q4);
            iy0 b23 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b23);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a15);
            yh2.K(xq2Var2, ix0.f(), z19);
            i61.x(xq2Var2, Integer.valueOf(hashCode15), xq2Var2, xq2Var2, E15);
            b6 = n26Var.b(x64Var, 1.0f, true);
            yt0 a16 = wt0.a(euVar, c40Var, xq2Var2, 0);
            int hashCode16 = Long.hashCode(ge7.C(xq2Var2));
            xv4 z20 = xq2Var2.z();
            a74 E16 = l.E(xq2Var2, b6);
            iy0 b24 = ix0.b();
            xq2Var2.f0();
            if (xq2Var2.D()) {
                xq2Var2.k(b24);
            } else {
                xq2Var2.o0();
            }
            yh2.K(xq2Var2, ix0.d(), a16);
            yh2.K(xq2Var2, ix0.f(), z20);
            i61.x(xq2Var2, Integer.valueOf(hashCode16), xq2Var2, xq2Var2, E16);
            x37.b(yh2.O(xq2Var2, R.string.slot2_analog_device), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, s47.a(gi2.I(xq2Var2).a(), F.d(), 0L, null, null, 0L, 0L, null, 16777214), xq2Var2, 0, 0, 65534);
            if (kk6Var2.b) {
                xq2Var2.b0(-271924794);
                O = num != null ? String.valueOf(num.intValue()) : null;
                if (O == null) {
                    xq2Var2.b0(-424412431);
                    O = yh2.O(xq2Var2, R.string.slot2_analog_map_axis_first);
                } else {
                    xq2Var2.b0(-424413764);
                }
                xq2Var2.s();
                xq2Var2.s();
            } else {
                xq2Var2.b0(-271806963);
                O = yh2.O(xq2Var2, R.string.slot2_analog_any_device);
                xq2Var2.s();
            }
            xq2Var = xq2Var2;
            x37.b(O, null, F.e(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gi2.I(xq2Var2).b(), xq2Var, 0, 0, 65530);
            xq2Var.r();
            bx6.a(kk6Var2.b, qn2Var4, null, num != null, nj2.i(F.a(), F.m, F.f(), F.n, xq2Var, 996), xq2Var, (i2 >> 18) & 112, 20);
            xq2Var.r();
            xq2Var.r();
        } else {
            kk6Var2 = kk6Var;
            qn2Var5 = qn2Var3;
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.e(new m73(kk6Var2, aVar, on2Var, on2Var2, qn2Var, qn2Var2, qn2Var5, qn2Var4, i));
        }
    }

    public static final void f(String str, on2 on2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        String str2;
        on2 on2Var2;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1858542056);
        if (xq2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (xq2Var.h(on2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            a74 L = vy7.L(dj6.c, kt0.c(0.8f, ((ut0) xq2Var.j(vt0.a)).a()), u24.m);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = new ns1(20);
                xq2Var.l0(P);
            }
            a74 u = mb3.u(L, true, null, (on2) P, 14);
            e34 d = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, u);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, d);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            vs0 vs0Var = vs0.Y;
            e40 e40Var = d90.Z;
            x64 x64Var = x64.a;
            a74 n = vs0Var.n(x64Var, e40Var);
            yt0 a2 = wt0.a(ju.c, d90.l0, xq2Var, 48);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, n);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a2);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            x37.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((xe7) xq2Var.j(ye7.b)).f, xq2Var, i6 & 14, 0, 65534);
            str2 = str;
            xq2Var = xq2Var;
            gi2.h(xq2Var, dj6.e(x64Var, 16.0f));
            on2Var2 = on2Var;
            mb3.o(on2Var2, null, false, null, jw0.d, xq2Var, ((i6 >> 3) & 14) | 805306368, 510);
            i4 = 1;
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            str2 = str;
            on2Var2 = on2Var;
            i4 = 1;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new in2(str2, on2Var2, i, i4);
        }
    }

    public static final String g(int i) {
        String axisToString = MotionEvent.axisToString(i);
        axisToString.getClass();
        String obj = qs6.T0(xs6.e0(xs6.e0(axisToString, "AXIS_", ""), "_", " ")).toString();
        return obj + " (#" + i + ")";
    }
}
