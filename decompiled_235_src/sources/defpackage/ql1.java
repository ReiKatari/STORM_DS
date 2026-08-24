package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.ui.dldi.DldiFileManagerActivity;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.inputsetup.b;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ql1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ql1 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ ql1(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        Object obj3;
        boolean z3;
        boolean z4;
        boolean z5;
        c11 c11Var;
        Rect rect;
        Rect rect2;
        boolean z6;
        boolean z7;
        boolean z8;
        ut0 ut0Var;
        int i = this.A;
        du duVar = ju.a;
        x64 x64Var = x64.a;
        Object obj4 = ox0.a;
        boolean z9 = false;
        jg7 jg7Var = jg7.a;
        Object obj5 = this.L;
        Object obj6 = this.B;
        switch (i) {
            case 0:
                File file = (File) obj6;
                Object obj7 = (DldiFileManagerActivity) obj5;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = DldiFileManagerActivity.r0;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    es7 F = bl2.F(xq2Var);
                    Object P = xq2Var.P();
                    if (P == obj4) {
                        File[] listFiles = file.listFiles();
                        if (listFiles != null) {
                            obj3 = fv.T0(listFiles);
                        } else {
                            obj3 = yt1.A;
                        }
                        P = np2.Y(obj3);
                        xq2Var.l0(P);
                    }
                    qa4 qa4Var = (qa4) P;
                    lc2 lc2Var = dj6.c;
                    long j = F.b;
                    jy2 jy2Var = u24.m;
                    a74 j0 = nc1.j0(vy7.L(lc2Var, j, jy2Var), nc1.o);
                    c40 c40Var = d90.k0;
                    eu euVar = ju.c;
                    yt0 a = wt0.a(euVar, c40Var, xq2Var, 0);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, j0);
                    jx0.i.getClass();
                    on2 on2Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(on2Var);
                    } else {
                        xq2Var.o0();
                    }
                    pn pnVar = ix0.f;
                    yh2.K(xq2Var, pnVar, a);
                    pn pnVar2 = ix0.e;
                    yh2.K(xq2Var, pnVar2, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    pn pnVar3 = ix0.g;
                    yh2.K(xq2Var, pnVar3, valueOf);
                    ne neVar = ix0.h;
                    yh2.F(xq2Var, neVar);
                    pn pnVar4 = ix0.d;
                    yh2.K(xq2Var, pnVar4, E);
                    d40 d40Var = d90.i0;
                    a74 O = ge7.O(dj6.c(x64Var, 1.0f), 16.0f);
                    l26 a2 = k26.a(duVar, d40Var, xq2Var, 48);
                    int hashCode2 = Long.hashCode(xq2Var.T);
                    xv4 l2 = xq2Var.l();
                    a74 E2 = l.E(xq2Var, O);
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(on2Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar, a2);
                    yh2.K(xq2Var, pnVar2, l2);
                    i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar4, E2);
                    a74 L = vy7.L(u24.g(dj6.i(x64Var, 36.0f), z16.b(8.0f)), F.d, jy2Var);
                    boolean h = xq2Var.h(obj7);
                    Object P2 = xq2Var.P();
                    if (h || P2 == obj4) {
                        P2 = new a5(obj7, 25);
                        xq2Var.l0(P2);
                    }
                    a74 u = mb3.u(L, false, null, (on2) P2, 15);
                    e40 e40Var = d90.Z;
                    e34 d = h70.d(e40Var, false);
                    int hashCode3 = Long.hashCode(xq2Var.T);
                    xv4 l3 = xq2Var.l();
                    a74 E3 = l.E(xq2Var, u);
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(on2Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar, d);
                    yh2.K(xq2Var, pnVar2, l3);
                    i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar4, E3);
                    i13.a(jw2.q(), "Back", dj6.i(x64Var, 20.0f), F.g, xq2Var, 432, 0);
                    xq2Var.p(true);
                    gi2.h(xq2Var, dj6.l(x64Var, 12.0f));
                    yt0 a3 = wt0.a(euVar, c40Var, xq2Var, 0);
                    int hashCode4 = Long.hashCode(xq2Var.T);
                    xv4 l4 = xq2Var.l();
                    a74 E4 = l.E(xq2Var, x64Var);
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(on2Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, pnVar, a3);
                    yh2.K(xq2Var, pnVar2, l4);
                    i61.w(hashCode4, xq2Var, pnVar3, xq2Var, neVar);
                    yh2.K(xq2Var, pnVar4, E4);
                    long j2 = F.g;
                    pi2 pi2Var = qs7.a;
                    x37.b("Файловый менеджер DLDI", null, j2, hi2.E(17), oj2.e0, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772550, 0, 130962);
                    long j3 = F.i;
                    sr2 sr2Var = qs7.c;
                    x37.b("Виртуальная SD-карта (Homebrew & Moonshell)", null, j3, hi2.E(11), null, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1575942, 0, 130994);
                    xq2Var.p(true);
                    xq2Var.p(true);
                    h70.a(vy7.L(dj6.e(dj6.c(x64Var, 1.0f), 1.0f), F.f, jy2Var), xq2Var, 0);
                    if (((List) qa4Var.getValue()).isEmpty()) {
                        xq2Var.b0(-33957378);
                        e34 d2 = h70.d(e40Var, false);
                        int hashCode5 = Long.hashCode(xq2Var.T);
                        xv4 l5 = xq2Var.l();
                        a74 E5 = l.E(xq2Var, lc2Var);
                        xq2Var.f0();
                        if (xq2Var.S) {
                            xq2Var.k(on2Var);
                        } else {
                            xq2Var.o0();
                        }
                        yh2.K(xq2Var, pnVar, d2);
                        yh2.K(xq2Var, pnVar2, l5);
                        i61.w(hashCode5, xq2Var, pnVar3, xq2Var, neVar);
                        yh2.K(xq2Var, pnVar4, E5);
                        yt0 a4 = wt0.a(euVar, d90.l0, xq2Var, 48);
                        int hashCode6 = Long.hashCode(xq2Var.T);
                        xv4 l6 = xq2Var.l();
                        a74 E6 = l.E(xq2Var, x64Var);
                        xq2Var.f0();
                        if (xq2Var.S) {
                            xq2Var.k(on2Var);
                        } else {
                            xq2Var.o0();
                        }
                        yh2.K(xq2Var, pnVar, a4);
                        yh2.K(xq2Var, pnVar2, l6);
                        i61.w(hashCode6, xq2Var, pnVar3, xq2Var, neVar);
                        yh2.K(xq2Var, pnVar4, E6);
                        i13.a(hi2.A(), null, dj6.i(x64Var, 48.0f), F.i, xq2Var, 432, 0);
                        gi2.h(xq2Var, dj6.e(x64Var, 8.0f));
                        x37.b("SD-карта пуста", null, F.g, hi2.E(14), oj2.d0, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772550, 0, 130962);
                        x37.b(i61.m("Папка: ", file.getAbsolutePath()), ge7.P(x64Var, 24.0f, 4.0f), F.i, hi2.E(10), null, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1575984, 0, 130992);
                        z2 = true;
                        i61.y(xq2Var, true, true, false);
                    } else {
                        xq2Var.b0(-32509616);
                        a74 O2 = ge7.O(lc2Var, 16.0f);
                        gu guVar = new gu(8.0f, true, new i(1));
                        boolean f = xq2Var.f(F);
                        Object P3 = xq2Var.P();
                        if (f || P3 == obj4) {
                            P3 = new y(24, qa4Var, F);
                            xq2Var.l0(P3);
                        }
                        gi2.e(O2, null, null, guVar, null, null, false, null, (qn2) P3, xq2Var, 24582, 494);
                        xq2Var.p(false);
                        z2 = true;
                    }
                    xq2Var.p(z2);
                    return jg7Var;
                }
                xq2Var.V();
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                nc1.n((a74) obj6, (za5) obj5, (px0) obj, ii2.a0(7));
                return jg7Var;
            case 2:
                ((Integer) obj2).getClass();
                u24.a((a74) obj6, (o75) obj5, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 3:
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                dd ddVar = ((bd) obj6).a;
                ddVar.j.i(floatValue);
                ddVar.k.i(floatValue2);
                ((ah5) obj5).A = floatValue;
                return jg7Var;
            case 4:
                qt6 qt6Var = (qt6) obj;
                q21 q21Var = (q21) obj2;
                return ((e34) obj6).d(qt6Var, qt6Var.v(new zv0(-431986394, true, new ql1(5, (zv0) obj5, new l70(qt6Var, q21Var.a))), jg7Var), q21Var.a);
            case 5:
                zv0 zv0Var = (zv0) obj6;
                l70 l70Var = (l70) obj5;
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z3)) {
                    zv0Var.e(l70Var, xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 6:
                ((Integer) obj2).getClass();
                jw2.d((aq0) obj6, (vy7) obj5, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 7:
                ((Integer) obj2).getClass();
                ((k41) obj6).a((i41) obj5, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 8:
                fa1 fa1Var = (fa1) obj6;
                qa4 qa4Var2 = (qa4) obj5;
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z4)) {
                    if (fa1Var instanceof ea1) {
                        xq2Var3.b0(193169358);
                        a74 g = u24.g(dj6.i(x64Var, 38.0f), z16.a);
                        Object P4 = xq2Var3.P();
                        if (P4 == obj4) {
                            P4 = new f4(qa4Var2, 18);
                            xq2Var3.l0(P4);
                        }
                        a74 u2 = mb3.u(g, false, null, (on2) P4, 15);
                        e34 d3 = h70.d(d90.Z, false);
                        int hashCode7 = Long.hashCode(xq2Var3.T);
                        xv4 l7 = xq2Var3.l();
                        a74 E7 = l.E(xq2Var3, u2);
                        jx0.i.getClass();
                        iy0 iy0Var = ix0.b;
                        xq2Var3.f0();
                        if (xq2Var3.S) {
                            xq2Var3.k(iy0Var);
                        } else {
                            xq2Var3.o0();
                        }
                        yh2.K(xq2Var3, ix0.f, d3);
                        yh2.K(xq2Var3, ix0.e, l7);
                        yh2.K(xq2Var3, ix0.g, Integer.valueOf(hashCode7));
                        yh2.F(xq2Var3, ix0.h);
                        yh2.K(xq2Var3, ix0.d, E7);
                        i13.b(kn2.Z(hv.E(), xq2Var3), yh2.O(xq2Var3, R.string.import_dsiware_title), dj6.i(x64Var, 24.0f), bl2.F(xq2Var3).g, xq2Var3, 392, 0);
                        xq2Var3.p(true);
                        xq2Var3.p(false);
                    } else {
                        xq2Var3.b0(193778632);
                        xq2Var3.p(false);
                    }
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 9:
                ((Integer) obj2).getClass();
                ak7.q((la1) obj6, (on2) obj5, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 10:
                m07 m07Var = (m07) obj6;
                x07 x07Var = (x07) obj5;
                px0 px0Var4 = (px0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue4 & 1, z5)) {
                    boolean f2 = xq2Var4.f(m07Var);
                    Object P5 = xq2Var4.P();
                    if (f2 || P5 == obj4) {
                        P5 = np2.I(new i4(0, m07Var, m07.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 3));
                        xq2Var4.l0(P5);
                    }
                    vf1.a(x07Var, (l07) ((pp6) P5).getValue(), xq2Var4, 0);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 11:
                ((Integer) obj2).getClass();
                vf1.a((x07) obj6, (l07) obj5, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 12:
                ((Integer) obj2).getClass();
                n16.g((List) obj6, (Collection) obj5, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 13:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj6;
                String str = (String) obj5;
                px0 px0Var5 = (px0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i3 = EmulatorActivity.Z1;
                if ((intValue5 & 3) != 2) {
                    z9 = true;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue5 & 1, z9)) {
                    qv1 qv1Var = (qv1) emulatorActivity.O1.getValue();
                    switch (str.hashCode()) {
                        case -2142842668:
                            if (str.equals("n3ds_black")) {
                                c11Var = c11.N3DS_BLACK;
                                break;
                            }
                            c11Var = c11.DS_LITE_BLACK;
                            break;
                        case -862657216:
                            if (str.equals("dsi_xl_blue")) {
                                c11Var = c11.DSI_XL_BLUE;
                                break;
                            }
                            c11Var = c11.DS_LITE_BLACK;
                            break;
                        case -623337657:
                            if (str.equals("n3ds_aqua")) {
                                c11Var = c11.N3DS_AQUA;
                                break;
                            }
                            c11Var = c11.DS_LITE_BLACK;
                            break;
                        case -282546383:
                            if (str.equals("crimson_red")) {
                                c11Var = c11.CRIMSON_RED;
                                break;
                            }
                            c11Var = c11.DS_LITE_BLACK;
                            break;
                        case 1503612680:
                            if (str.equals("ds_lite_white")) {
                                c11Var = c11.DS_LITE_WHITE;
                                break;
                            }
                            c11Var = c11.DS_LITE_BLACK;
                            break;
                        default:
                            c11Var = c11.DS_LITE_BLACK;
                            break;
                    }
                    c11 c11Var2 = c11Var;
                    if (qv1Var != null) {
                        rect = qv1Var.a;
                    } else {
                        rect = null;
                    }
                    if (qv1Var != null) {
                        rect2 = qv1Var.b;
                    } else {
                        rect2 = null;
                    }
                    f04.f(c11Var2, rect, rect2, null, xq2Var5, 0);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 14:
                s95 s95Var = (s95) obj6;
                qa4 qa4Var3 = (qa4) obj5;
                px0 px0Var6 = (px0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                xq2 xq2Var6 = (xq2) px0Var6;
                if (xq2Var6.S(intValue6 & 1, z6)) {
                    a74 G = g04.G(ge7.O(x64Var, 8.0f), gb3.Min);
                    l26 a5 = k26.a(duVar, d90.i0, xq2Var6, 48);
                    int hashCode8 = Long.hashCode(xq2Var6.T);
                    xv4 l8 = xq2Var6.l();
                    a74 E8 = l.E(xq2Var6, G);
                    jx0.i.getClass();
                    iy0 iy0Var2 = ix0.b;
                    xq2Var6.f0();
                    if (xq2Var6.S) {
                        xq2Var6.k(iy0Var2);
                    } else {
                        xq2Var6.o0();
                    }
                    yh2.K(xq2Var6, ix0.f, a5);
                    yh2.K(xq2Var6, ix0.e, l8);
                    yh2.K(xq2Var6, ix0.g, Integer.valueOf(hashCode8));
                    yh2.F(xq2Var6, ix0.h);
                    yh2.K(xq2Var6, ix0.d, E8);
                    if (((Boolean) xq2Var6.j(q83.a)).booleanValue()) {
                        xq2Var6.b0(1285663259);
                        h70.a(vy7.L(dj6.i(x64Var, 40.0f), kt0.c, u24.m), xq2Var6, 6);
                        xq2Var6.p(false);
                    } else {
                        xq2Var6.b0(1285774487);
                        a74 i4 = dj6.i(x64Var, 40.0f);
                        x23 x23Var = new x23((Context) xq2Var6.j(kf.b));
                        x23Var.c = s95Var.b.toString();
                        x23Var.b(false);
                        gi2.b(x23Var.a(), null, i4, null, RecyclerView.B1, xq2Var6, 432, 4088);
                        xq2Var6.p(false);
                    }
                    a74 b = dj6.b(x64Var, 1.0f);
                    j14 j14Var = (j14) qa4Var3.getValue();
                    Object P6 = xq2Var6.P();
                    if (P6 == obj4) {
                        P6 = new bz1(9);
                        xq2Var6.l0(P6);
                    }
                    f04.c(j14Var, b, (qn2) P6, null, "content-animation", null, n16.I(-983851858, new fj(s95Var, 2), xq2Var6), xq2Var6, 1597872, 40);
                    xq2Var6.p(true);
                } else {
                    xq2Var6.V();
                }
                return jg7Var;
            case 15:
                ((Integer) obj2).getClass();
                jx2.a((a74) obj6, (s95) obj5, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 16:
                jb1 jb1Var = (jb1) obj6;
                pk6 pk6Var = (pk6) obj5;
                int intValue7 = ((Integer) obj).intValue();
                if (obj2 instanceof ww0) {
                    ((ua4) jb1Var.f).b((ww0) obj2);
                } else if (!(obj2 instanceof np5)) {
                    if (obj2 instanceof br2) {
                        hf.i0(pk6Var, intValue7, obj2);
                        jb1Var.e((br2) obj2);
                    } else if (obj2 instanceof cf5) {
                        hf.i0(pk6Var, intValue7, obj2);
                        ((cf5) obj2).c();
                    }
                }
                return jg7Var;
            case 17:
                ((Integer) obj2).getClass();
                x73.b((b) obj6, (on2) obj5, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 18:
                ((Integer) obj2).getClass();
                np2.d((m20) obj6, (on2) obj5, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 19:
                iu2 iu2Var = (iu2) obj6;
                fu fuVar = (fu) obj5;
                qh1 qh1Var = (qh1) obj;
                q21 q21Var2 = (q21) obj2;
                if (q21.h(q21Var2.a) == Integer.MAX_VALUE) {
                    s53.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int h2 = q21.h(q21Var2.a);
                int[] j1 = gt0.j1(iu2Var.a(qh1Var, h2, qh1Var.r0(fuVar.a())));
                int[] iArr = new int[j1.length];
                fuVar.d(qh1Var, h2, j1, kk3.Ltr, iArr);
                return new ap3(0, j1, iArr);
            case 20:
                bq3 bq3Var = (bq3) obj6;
                aq3 aq3Var = (aq3) obj5;
                px0 px0Var7 = (px0) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                xq2 xq2Var7 = (xq2) px0Var7;
                if (xq2Var7.S(intValue8 & 1, z7)) {
                    cq3 cq3Var = (cq3) bq3Var.b.c();
                    int i5 = aq3Var.c;
                    Object obj8 = aq3Var.a;
                    if ((i5 >= cq3Var.a() || !cq3Var.c(i5).equals(obj8)) && (i5 = cq3Var.e(obj8)) != -1) {
                        aq3Var.c = i5;
                    }
                    if (i5 != -1) {
                        xq2Var7.b0(-1664741271);
                        xk2.d(cq3Var, bq3Var.a, i5, aq3Var.a, xq2Var7, 0);
                        xq2Var7.p(false);
                    } else {
                        xq2Var7.b0(-1664505826);
                        xq2Var7.p(false);
                    }
                    boolean h3 = xq2Var7.h(aq3Var);
                    Object P7 = xq2Var7.P();
                    if (h3 || P7 == obj4) {
                        P7 = new bg2(aq3Var, 5);
                        xq2Var7.l0(P7);
                    }
                    mb3.d(obj8, (qn2) P7, xq2Var7);
                } else {
                    xq2Var7.V();
                }
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return ((eq3) obj5).a(new fq3((bq3) obj6, (qt6) obj), ((q21) obj2).a);
            case 22:
                zv0 zv0Var2 = (zv0) obj6;
                rr3 rr3Var = (rr3) obj5;
                px0 px0Var8 = (px0) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                xq2 xq2Var8 = (xq2) px0Var8;
                if (xq2Var8.S(intValue9 & 1, z8)) {
                    zv0Var2.e(rr3Var, xq2Var8, 0);
                } else {
                    xq2Var8.V();
                }
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                xe7 xe7Var = (xe7) obj6;
                zv0 zv0Var3 = (zv0) obj5;
                px0 px0Var9 = (px0) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z9 = true;
                }
                xq2 xq2Var9 = (xq2) px0Var9;
                if (xq2Var9.S(intValue10 & 1, z9)) {
                    x37.a(xe7Var.i, n16.I(905505767, new eq(zv0Var3, 5), xq2Var9), xq2Var9, 48);
                } else {
                    xq2Var9.V();
                }
                return jg7Var;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                es7 es7Var = (es7) obj6;
                zv0 zv0Var4 = (zv0) obj5;
                px0 px0Var10 = (px0) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z9 = true;
                }
                xq2 xq2Var10 = (xq2) px0Var10;
                if (xq2Var10.S(intValue11 & 1, z9)) {
                    boolean z10 = es7Var.a;
                    long j4 = es7Var.j;
                    long j5 = es7Var.l;
                    long j6 = es7Var.b;
                    long j7 = es7Var.c;
                    if (z10) {
                        long j8 = kt0.d;
                        long j9 = es7Var.g;
                        nq6 nq6Var = vt0.a;
                        ut0Var = new ut0(j4, j4, j5, j5, j6, j7, j4, j8, j8, j9, j9, j8, false);
                    } else {
                        long j10 = kt0.d;
                        long j11 = es7Var.g;
                        nq6 nq6Var2 = vt0.a;
                        ut0Var = new ut0(j4, j4, j5, j5, j6, j7, j4, j10, j10, j11, j11, j10, true);
                    }
                    ut0 ut0Var2 = ut0Var;
                    pi2 pi2Var2 = qs7.b;
                    s47 s47Var = gi2.I(xq2Var10).d;
                    pi2 pi2Var3 = qs7.a;
                    oj2 oj2Var = oj2.e0;
                    s47 a6 = s47.a(s47Var, 0L, 0L, oj2Var, pi2Var3, hi2.D(-0.5d), hi2.E(36), null, 16645979);
                    s47 a7 = s47.a(gi2.I(xq2Var10).e, 0L, 0L, oj2Var, pi2Var3, hi2.D(-0.3d), hi2.E(30), null, 16645979);
                    s47 s47Var2 = gi2.I(xq2Var10).f;
                    oj2 oj2Var2 = oj2.d0;
                    hi2.f(ut0Var2, new xe7(pi2Var2, a6, a7, s47.a(s47Var2, 0L, 0L, oj2Var2, pi2Var3, hi2.D(-0.2d), hi2.E(26), null, 16645979), s47.a(gi2.I(xq2Var10).g, 0L, 0L, oj2Var2, pi2Var3, 0L, hi2.E(22), null, 16646107), s47.a(gi2.I(xq2Var10).h, 0L, 0L, oj2.Z, pi2Var2, hi2.D(0.1d), hi2.E(20), null, 16645979), s47.a(gi2.I(xq2Var10).i, 0L, 0L, null, null, hi2.D(0.15d), hi2.E(22), null, 16646015), s47.a(gi2.I(xq2Var10).j, 0L, 0L, null, null, hi2.D(0.15d), hi2.E(20), null, 16646015), s47.a(gi2.I(xq2Var10).k, 0L, 0L, oj2Var, pi2Var3, hi2.D(0.5d), 0L, null, 16777051), s47.a(gi2.I(xq2Var10).l, 0L, 0L, null, null, hi2.D(0.2d), hi2.E(16), null, 16646015), s47.a(gi2.I(xq2Var10).m, 0L, 0L, oj2Var2, pi2Var3, hi2.E(1), 0L, null, 16777051), 14), null, n16.I(1811609421, new eq(zv0Var4, 7), xq2Var10), xq2Var10, 3072);
                    return jg7Var;
                }
                xq2Var10.V();
                return jg7Var;
            case 25:
                ((Integer) obj2).getClass();
                kn2.g((o46) obj6, (zv0) obj5, (px0) obj, ii2.a0(1));
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                ((Integer) obj2).getClass();
                bl2.h((qe4) obj6, (on2) obj5, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 27:
                ah5 ah5Var = (ah5) obj6;
                float floatValue3 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ah5Var.A += ((lr3) obj5).b.a(floatValue3 - ah5Var.A);
                return jg7Var;
            case 28:
                Set set = (Set) obj5;
                av4 av4Var = (av4) obj2;
                ((String) obj).getClass();
                av4Var.getClass();
                long e = av4Var.a.e();
                if (((Set) obj6).contains(Long.valueOf(e))) {
                    return av4.a(av4Var, cv4.PERMANENT_FAILURE);
                }
                if (set.contains(Long.valueOf(e)) && av4Var.b != cv4.PERMANENT_FAILURE) {
                    return av4.a(av4Var, cv4.RETRYABLE);
                }
                return av4Var;
            default:
                ((Integer) obj2).getClass();
                qo2.b((zn5) obj6, (zn5) obj5, (px0) obj, ii2.a0(1));
                return jg7Var;
        }
    }

    public /* synthetic */ ql1(Object obj, int i, int i2, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }
}
