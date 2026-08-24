package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.textclassifier.TextClassification;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sa5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sa5 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ sa5(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a8, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b4, code lost:
        if (r1 != null) goto L85;
     */
    @Override // defpackage.eo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj, Object obj2) {
        boolean z;
        x64 x64Var;
        e33 e33Var;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        k47 k47Var;
        List actions;
        Drawable icon;
        Intent intent;
        View.OnClickListener onClickListener;
        CharSequence label;
        List actions2;
        TextClassification textClassification;
        boolean z5;
        boolean z6;
        boolean z7;
        int i = this.A;
        TextClassification textClassification2 = null;
        vs0 vs0Var = ox0.a;
        x64 x64Var2 = x64.a;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.L;
        Object obj4 = this.B;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qo2.i((a74) obj4, (ra5) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 1:
                n06 n06Var = (n06) obj4;
                es7 es7Var = (es7) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    if (n06Var == n06.GRID) {
                        e33Var = kj2.h;
                        if (e33Var != null) {
                            x64Var = x64Var2;
                        } else {
                            d33 d33Var = new d33("Filled.ViewList", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i2 = el7.a;
                            x64Var = x64Var2;
                            cn6 cn6Var = new cn6(kt0.b);
                            ww2 ww2Var = new ww2(1, (byte) 0);
                            ww2Var.o(3.0f, 14.0f);
                            ww2Var.l(4.0f);
                            ww2Var.u(-4.0f);
                            ww2Var.k(3.0f);
                            ww2Var.t(14.0f);
                            ww2Var.g();
                            ww2Var.o(3.0f, 19.0f);
                            ww2Var.l(4.0f);
                            ww2Var.u(-4.0f);
                            ww2Var.k(3.0f);
                            ww2Var.t(19.0f);
                            ww2Var.g();
                            ww2Var.o(3.0f, 9.0f);
                            ww2Var.l(4.0f);
                            ww2Var.t(5.0f);
                            ww2Var.k(3.0f);
                            ww2Var.t(9.0f);
                            ww2Var.g();
                            ww2Var.o(8.0f, 14.0f);
                            ww2Var.l(13.0f);
                            ww2Var.u(-4.0f);
                            ww2Var.k(8.0f);
                            ww2Var.t(14.0f);
                            ww2Var.g();
                            ww2Var.o(8.0f, 19.0f);
                            ww2Var.l(13.0f);
                            ww2Var.u(-4.0f);
                            ww2Var.k(8.0f);
                            ww2Var.t(19.0f);
                            ww2Var.g();
                            ww2Var.o(8.0f, 5.0f);
                            ww2Var.u(4.0f);
                            ww2Var.l(13.0f);
                            ww2Var.t(5.0f);
                            ww2Var.k(8.0f);
                            ww2Var.g();
                            d33.a(d33Var, ww2Var.b, 0, cn6Var);
                            e33Var = d33Var.b();
                            kj2.h = e33Var;
                        }
                    } else {
                        x64Var = x64Var2;
                        e33Var = ej2.a;
                        if (e33Var == null) {
                            d33 d33Var2 = new d33("Filled.GridView", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            cn6 cn6Var2 = new cn6(kt0.b);
                            ww2 ww2Var2 = new ww2(1, (byte) 0);
                            ww2Var2.o(3.0f, 3.0f);
                            ww2Var2.u(8.0f);
                            ww2Var2.l(8.0f);
                            ww2Var2.m(11.0f, 3.0f);
                            ww2Var2.m(3.0f, 3.0f);
                            ww2Var2.g();
                            ww2Var2.o(9.0f, 9.0f);
                            ww2Var2.m(5.0f, 9.0f);
                            ww2Var2.m(5.0f, 5.0f);
                            ww2Var2.l(4.0f);
                            ww2Var2.u(4.0f);
                            ww2Var2.g();
                            ww2Var2.o(3.0f, 13.0f);
                            ww2Var2.u(8.0f);
                            ww2Var2.l(8.0f);
                            ww2Var2.u(-8.0f);
                            ww2Var2.m(3.0f, 13.0f);
                            ww2Var2.g();
                            ww2Var2.o(9.0f, 19.0f);
                            ww2Var2.m(5.0f, 19.0f);
                            ww2Var2.u(-4.0f);
                            ww2Var2.l(4.0f);
                            ww2Var2.u(4.0f);
                            ww2Var2.g();
                            ww2Var2.o(13.0f, 3.0f);
                            ww2Var2.u(8.0f);
                            ww2Var2.l(8.0f);
                            ww2Var2.m(21.0f, 3.0f);
                            ww2Var2.l(-8.0f);
                            ww2Var2.g();
                            ww2Var2.o(19.0f, 9.0f);
                            ww2Var2.l(-4.0f);
                            ww2Var2.m(15.0f, 5.0f);
                            ww2Var2.l(4.0f);
                            ww2Var2.u(4.0f);
                            ww2Var2.g();
                            ww2Var2.o(13.0f, 13.0f);
                            ww2Var2.u(8.0f);
                            ww2Var2.l(8.0f);
                            ww2Var2.u(-8.0f);
                            ww2Var2.l(-8.0f);
                            ww2Var2.g();
                            ww2Var2.o(19.0f, 19.0f);
                            ww2Var2.l(-4.0f);
                            ww2Var2.u(-4.0f);
                            ww2Var2.l(4.0f);
                            ww2Var2.u(4.0f);
                            ww2Var2.g();
                            d33.a(d33Var2, ww2Var2.b, 1, cn6Var2);
                            e33Var = d33Var2.b();
                            ej2.a = e33Var;
                        }
                    }
                    i13.a(e33Var, yh2.O(xq2Var, R.string.rom_view_toggle), dj6.i(x64Var, 22.0f), es7Var.h, xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 2:
                ((Integer) obj2).getClass();
                vy7.A((Cheat) obj4, (qn2) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 3:
                ((Integer) obj2).getClass();
                vy7.C((pq5) obj3, (a74) obj4, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 4:
                RomDetailsActivity romDetailsActivity = (RomDetailsActivity) obj4;
                uo7 uo7Var = romDetailsActivity.C0;
                s9 s9Var = (s9) obj3;
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = RomDetailsActivity.J0;
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    qa4 C = np2.C(((hw5) uo7Var.getValue()).g, xq2Var2);
                    qa4 C2 = np2.C((rp6) ((hw5) uo7Var.getValue()).i.getValue(), xq2Var2);
                    qa4 C3 = np2.C((rp6) romDetailsActivity.A().e.getValue(), xq2Var2);
                    qa4 C4 = np2.C(romDetailsActivity.A().p, xq2Var2);
                    Uri uri = ((pq5) C.getValue()).d;
                    boolean h = xq2Var2.h(romDetailsActivity) | xq2Var2.f(C);
                    Object P = xq2Var2.P();
                    kp5 kp5Var = P;
                    if (h || P == vs0Var) {
                        kp5 kp5Var2 = new kp5(romDetailsActivity, C, null, 2);
                        xq2Var2.l0(kp5Var2);
                        kp5Var = kp5Var2;
                    }
                    qa4 a0 = np2.a0(uri, (eo2) kp5Var, xq2Var2);
                    boolean h2 = xq2Var2.h(romDetailsActivity);
                    Object P2 = xq2Var2.P();
                    fv5 fv5Var = P2;
                    if (h2 || P2 == vs0Var) {
                        fv5 fv5Var2 = new fv5(romDetailsActivity, null, 0);
                        xq2Var2.l0(fv5Var2);
                        fv5Var = fv5Var2;
                    }
                    mb3.i(xq2Var2, (eo2) fv5Var, null);
                    boolean h3 = xq2Var2.h(romDetailsActivity);
                    Object P3 = xq2Var2.P();
                    fv5 fv5Var3 = P3;
                    if (h3 || P3 == vs0Var) {
                        fv5 fv5Var4 = new fv5(romDetailsActivity, null, 1);
                        xq2Var2.l0(fv5Var4);
                        fv5Var3 = fv5Var4;
                    }
                    mb3.i(xq2Var2, (eo2) fv5Var3, jg7Var);
                    j06 j06Var = (j06) C3.getValue();
                    boolean h4 = xq2Var2.h(romDetailsActivity);
                    Object P4 = xq2Var2.P();
                    y3 y3Var = P4;
                    if (h4 || P4 == vs0Var) {
                        y3 y3Var2 = new y3(romDetailsActivity, (r41) null, 14);
                        xq2Var2.l0(y3Var2);
                        y3Var = y3Var2;
                    }
                    mb3.i(xq2Var2, (eo2) y3Var, j06Var);
                    bl2.e(false, n16.I(-1991523385, new fo0(romDetailsActivity, s9Var, C, a0, C2, C3, C4), xq2Var2), xq2Var2, 48, 1);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            case 5:
                zv0 zv0Var = (zv0) obj4;
                u56 u56Var = (u56) obj3;
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z8 = true;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z8)) {
                    zv0Var.e(u56Var, xq2Var3, 6);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
            case 6:
                fo2 fo2Var = (fo2) obj4;
                x56 x56Var = (x56) obj3;
                px0 px0Var4 = (px0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (xq2Var4.S(intValue4 & 1, z3)) {
                    fo2Var.e(x56Var.a, xq2Var4, 0);
                } else {
                    xq2Var4.V();
                }
                return jg7Var;
            case 7:
                dy7 dy7Var = (dy7) obj4;
                eo2 eo2Var = (eo2) obj3;
                px0 px0Var5 = (px0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z10 = true;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (xq2Var5.S(intValue5 & 1, z10)) {
                    hv.d(v56.a.a(dy7Var), eo2Var, xq2Var5, 8);
                } else {
                    xq2Var5.V();
                }
                return jg7Var;
            case 8:
                ah5 ah5Var = (ah5) obj4;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                float f = ah5Var.A;
                ah5Var.A = ((p76) obj3).a(floatValue - f) + f;
                return jg7Var;
            case 9:
                ((Integer) obj2).getClass();
                mp2.d((a74) obj4, (zv0) obj3, (px0) obj, ii2.a0(49));
                return jg7Var;
            case 10:
                fo2 fo2Var2 = (fo2) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                px0 px0Var6 = (px0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xq2 xq2Var6 = (xq2) px0Var6;
                if (xq2Var6.S(intValue6 & 1, z4)) {
                    fo2Var2.e(arrayList, xq2Var6, 0);
                } else {
                    xq2Var6.V();
                }
                return jg7Var;
            case 11:
                ((Integer) obj2).getClass();
                ((cs1) obj4).a((Drawable) obj3, (px0) obj, ii2.a0(49));
                return jg7Var;
            case 12:
                p27 p27Var = (p27) obj4;
                w61 w61Var = (w61) obj3;
                j07 j07Var = (j07) obj;
                Context context = (Context) obj2;
                boolean j = p27Var.j();
                fp m = p27Var.m();
                if (m != null) {
                    str = m.B;
                } else {
                    str = null;
                }
                k47 k47Var2 = p27Var.w;
                if (k47Var2 != null) {
                    long j2 = k47Var2.a;
                    mk4 mk4Var = p27Var.b;
                    k47Var = new k47(jx2.f(mk4Var.s((int) (j2 >> 32)), mk4Var.s((int) (j2 & 4294967295L))));
                } else {
                    k47Var = null;
                }
                zx4 zx4Var = p27Var.j;
                s27 s27Var = new s27(p27Var, w61Var, context, 0);
                nq6 nq6Var = by4.a;
                if (Build.VERSION.SDK_INT >= 28 && str != null && k47Var != null && zx4Var != null && (zx4Var instanceof zx4)) {
                    long j3 = k47Var.a;
                    Object obj5 = zx4Var.h;
                    hb4 hb4Var = zx4Var.e;
                    if (hb4Var.g()) {
                        h07 h07Var = (h07) zx4Var.g.getValue();
                        if (h07Var != null && k47.b(j3, h07Var.b) && nb3.k(str, h07Var.a)) {
                            textClassification = h07Var.c;
                        } else {
                            textClassification = null;
                        }
                        hb4Var.h(null);
                        textClassification2 = textClassification;
                    }
                    if (textClassification2 != null) {
                        actions = textClassification2.getActions();
                        if (actions.isEmpty()) {
                            icon = textClassification2.getIcon();
                            if (icon == null) {
                                label = textClassification2.getLabel();
                                break;
                            }
                            intent = textClassification2.getIntent();
                            if (intent == null) {
                                onClickListener = textClassification2.getOnClickListener();
                                break;
                            }
                            j07Var.a.a(new y07(obj5, textClassification2, -1));
                        } else {
                            j07Var.a.a(new y07(obj5, textClassification2, 0));
                        }
                        s27Var.g(j07Var);
                        actions2 = textClassification2.getActions();
                        int size = actions2.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            oc3.s(actions2.get(i4));
                            if (i4 > 0) {
                                j07Var.a.a(new y07(obj5, textClassification2, i4));
                            }
                        }
                    } else {
                        s27Var.g(j07Var);
                    }
                    ej2.g(j07Var, context, j, str, k47Var.a);
                } else {
                    s27Var.g(j07Var);
                    if (str != null && k47Var != null) {
                        ej2.g(j07Var, context, j, str, k47Var.a);
                    }
                }
                return jg7Var;
            case 13:
                ((Integer) obj2).getClass();
                vy7.k((gp1) obj3, (a74) obj4, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 14:
                final ss4 ss4Var = (ss4) obj4;
                qa4 qa4Var = (qa4) obj3;
                px0 px0Var7 = (px0) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                xq2 xq2Var7 = (xq2) px0Var7;
                if (xq2Var7.S(intValue7 & 1, z5)) {
                    if (ss4Var.h() == 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    Object P5 = xq2Var7.P();
                    if (P5 == vs0Var) {
                        P5 = new on2() { // from class: fr7
                            @Override // defpackage.on2
                            public final Object c() {
                                int i5 = r2;
                                jg7 jg7Var2 = jg7.a;
                                ss4 ss4Var2 = ss4Var;
                                switch (i5) {
                                    case 0:
                                        ss4Var2.i(0);
                                        return jg7Var2;
                                    default:
                                        ss4Var2.i(1);
                                        return jg7Var2;
                                }
                            }
                        };
                        xq2Var7.l0(P5);
                    }
                    ey6.a(z6, (on2) P5, null, false, mb3.i, mb3.j, 0L, 0L, xq2Var7, 221232);
                    if (ss4Var.h() == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    Object P6 = xq2Var7.P();
                    if (P6 == vs0Var) {
                        P6 = new on2() { // from class: fr7
                            @Override // defpackage.on2
                            public final Object c() {
                                int i5 = r2;
                                jg7 jg7Var2 = jg7.a;
                                ss4 ss4Var2 = ss4Var;
                                switch (i5) {
                                    case 0:
                                        ss4Var2.i(0);
                                        return jg7Var2;
                                    default:
                                        ss4Var2.i(1);
                                        return jg7Var2;
                                }
                            }
                        };
                        xq2Var7.l0(P6);
                    }
                    ey6.a(z7, (on2) P6, null, false, n16.I(1544752904, new e4(qa4Var, 9), xq2Var7), mb3.k, 0L, 0L, xq2Var7, 221232);
                } else {
                    xq2Var7.V();
                }
                return jg7Var;
            default:
                es7 es7Var2 = (es7) obj4;
                List list = (List) obj3;
                px0 px0Var8 = (px0) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z9 = true;
                }
                xq2 xq2Var8 = (xq2) px0Var8;
                if (xq2Var8.S(intValue8 & 1, z9)) {
                    is7.a(list, nc1.j0(vy7.L(x64Var2, es7Var2.b, u24.m), nc1.r), false, xq2Var8, 0, 4);
                } else {
                    xq2Var8.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ sa5(Object obj, int i, int i2, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    public /* synthetic */ sa5(Object obj, a74 a74Var, int i, int i2) {
        this.A = i2;
        this.L = obj;
        this.B = a74Var;
    }
}
