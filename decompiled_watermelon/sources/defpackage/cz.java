package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapRegionDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.widget.Toast;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cz  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cz implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ cz(hf6 hf6Var, ic1 ic1Var, ff6 ff6Var, n47 n47Var) {
        this.A = 24;
        this.B = hf6Var;
        this.L = ic1Var;
        this.R = n47Var;
    }

    private final Object a(Object obj) {
        Integer d;
        Integer e;
        Integer e2;
        Integer d2;
        lr6 lr6Var;
        lr6 lr6Var2;
        mr6 mr6Var;
        mr6 mr6Var2;
        Integer d3;
        Integer e3;
        Integer e4;
        Integer d4;
        lr6 lr6Var3;
        lr6 lr6Var4;
        mr6 mr6Var3;
        mr6 mr6Var4;
        wv6 wv6Var;
        ip6 ip6Var = (ip6) this.L;
        j75 j75Var = (j75) this.R;
        np6 np6Var = (np6) obj;
        int i = hp6.a[((v93) this.B).ordinal()];
        o27 o27Var = o27.a;
        oq6 oq6Var = null;
        switch (i) {
            case 1:
                ip6Var.b.d(false);
                return o27Var;
            case 2:
                ip6Var.b.p();
                return o27Var;
            case 3:
                ip6Var.b.f();
                return o27Var;
            case 4:
                np6Var.e.a = null;
                if (np6Var.g.B.length() > 0) {
                    if (vr6.c(np6Var.f)) {
                        np6Var.i();
                        return o27Var;
                    }
                    boolean f = np6Var.f();
                    long j = np6Var.f;
                    if (f) {
                        int f2 = vr6.f(j);
                        np6Var.q(f2, f2);
                        return o27Var;
                    }
                    int e5 = vr6.e(j);
                    np6Var.q(e5, e5);
                    break;
                }
                break;
            case 5:
                np6Var.e.a = null;
                if (np6Var.g.B.length() > 0) {
                    if (vr6.c(np6Var.f)) {
                        np6Var.m();
                        return o27Var;
                    }
                    boolean f3 = np6Var.f();
                    long j2 = np6Var.f;
                    if (f3) {
                        int e6 = vr6.e(j2);
                        np6Var.q(e6, e6);
                        return o27Var;
                    }
                    int f4 = vr6.f(j2);
                    np6Var.q(f4, f4);
                    return o27Var;
                }
                break;
            case ig7.b /* 6 */:
                ur6 ur6Var = np6Var.e;
                ur6Var.a = null;
                to toVar = np6Var.g;
                String str = toVar.B;
                String str2 = toVar.B;
                if (str.length() > 0) {
                    if (np6Var.f()) {
                        ur6Var.a = null;
                        if (str2.length() > 0 && (e = np6Var.e()) != null) {
                            int intValue = e.intValue();
                            np6Var.q(intValue, intValue);
                            return o27Var;
                        }
                    } else {
                        ur6Var.a = null;
                        if (str2.length() > 0 && (d = np6Var.d()) != null) {
                            int intValue2 = d.intValue();
                            np6Var.q(intValue2, intValue2);
                            return o27Var;
                        }
                    }
                }
                break;
            case 7:
                ur6 ur6Var2 = np6Var.e;
                ur6Var2.a = null;
                to toVar2 = np6Var.g;
                String str3 = toVar2.B;
                String str4 = toVar2.B;
                if (str3.length() > 0) {
                    if (np6Var.f()) {
                        ur6Var2.a = null;
                        if (str4.length() > 0 && (d2 = np6Var.d()) != null) {
                            int intValue3 = d2.intValue();
                            np6Var.q(intValue3, intValue3);
                            return o27Var;
                        }
                    } else {
                        ur6Var2.a = null;
                        if (str4.length() > 0 && (e2 = np6Var.e()) != null) {
                            int intValue4 = e2.intValue();
                            np6Var.q(intValue4, intValue4);
                            return o27Var;
                        }
                    }
                }
                break;
            case 8:
                np6Var.l();
                return o27Var;
            case 9:
                np6Var.j();
                return o27Var;
            case 10:
                if (np6Var.g.B.length() > 0 && (lr6Var = np6Var.c) != null) {
                    int g = np6Var.g(lr6Var, -1);
                    np6Var.q(g, g);
                    return o27Var;
                }
                break;
            case 11:
                if (np6Var.g.B.length() > 0 && (lr6Var2 = np6Var.c) != null) {
                    int g2 = np6Var.g(lr6Var2, 1);
                    np6Var.q(g2, g2);
                    return o27Var;
                }
                break;
            case mj2.L /* 12 */:
                if (np6Var.g.B.length() > 0 && (mr6Var = np6Var.i) != null) {
                    int h = np6Var.h(mr6Var, -1);
                    np6Var.q(h, h);
                    return o27Var;
                }
                break;
            case 13:
                if (np6Var.g.B.length() > 0 && (mr6Var2 = np6Var.i) != null) {
                    int h2 = np6Var.h(mr6Var2, 1);
                    np6Var.q(h2, h2);
                    return o27Var;
                }
                break;
            case 14:
                np6Var.o();
                return o27Var;
            case ig7.e /* 15 */:
                np6Var.n();
                return o27Var;
            case 16:
                np6Var.e.a = null;
                if (np6Var.g.B.length() > 0) {
                    if (np6Var.f()) {
                        np6Var.o();
                        return o27Var;
                    }
                    np6Var.n();
                    return o27Var;
                }
                break;
            case 17:
                np6Var.e.a = null;
                if (np6Var.g.B.length() > 0) {
                    if (np6Var.f()) {
                        np6Var.n();
                        return o27Var;
                    }
                    np6Var.o();
                    return o27Var;
                }
                break;
            case 18:
                np6Var.e.a = null;
                if (np6Var.g.B.length() > 0) {
                    np6Var.q(0, 0);
                    return o27Var;
                }
                break;
            case 19:
                np6Var.e.a = null;
                to toVar3 = np6Var.g;
                if (toVar3.B.length() > 0) {
                    int length = toVar3.B.length();
                    np6Var.q(length, length);
                    return o27Var;
                }
                break;
            case 20:
                List a = np6Var.a(new d96(10));
                if (a != null) {
                    ip6Var.a(a);
                    return o27Var;
                }
                break;
            case 21:
                List a2 = np6Var.a(new d96(11));
                if (a2 != null) {
                    ip6Var.a(a2);
                    return o27Var;
                }
                break;
            case 22:
                List a3 = np6Var.a(new d96(12));
                if (a3 != null) {
                    ip6Var.a(a3);
                    return o27Var;
                }
                break;
            case 23:
                List a4 = np6Var.a(new d96(13));
                if (a4 != null) {
                    ip6Var.a(a4);
                    return o27Var;
                }
                break;
            case 24:
                List a5 = np6Var.a(new d96(14));
                if (a5 != null) {
                    ip6Var.a(a5);
                    return o27Var;
                }
                break;
            case 25:
                List a6 = np6Var.a(new d96(15));
                if (a6 != null) {
                    ip6Var.a(a6);
                    return o27Var;
                }
                break;
            case 26:
                if (!ip6Var.e) {
                    ip6Var.a(l07.b0(new cs0("\n", 1)));
                    return o27Var;
                }
                j75Var.A = ip6Var.a.x.B.r.b(ip6Var.l);
                return o27Var;
            case 27:
                if (!ip6Var.e) {
                    ip6Var.a(l07.b0(new cs0("\t", 1)));
                    return o27Var;
                }
                j75Var.A = false;
                return o27Var;
            case 28:
                np6Var.e.a = null;
                to toVar4 = np6Var.g;
                if (toVar4.B.length() > 0) {
                    np6Var.q(0, toVar4.B.length());
                    return o27Var;
                }
                break;
            case 29:
                np6Var.i();
                np6Var.p();
                return o27Var;
            case 30:
                np6Var.m();
                np6Var.p();
                return o27Var;
            case 31:
                ur6 ur6Var3 = np6Var.e;
                ur6Var3.a = null;
                to toVar5 = np6Var.g;
                String str5 = toVar5.B;
                String str6 = toVar5.B;
                if (str5.length() > 0) {
                    if (np6Var.f()) {
                        ur6Var3.a = null;
                        if (str6.length() > 0 && (e3 = np6Var.e()) != null) {
                            int intValue5 = e3.intValue();
                            np6Var.q(intValue5, intValue5);
                        }
                    } else {
                        ur6Var3.a = null;
                        if (str6.length() > 0 && (d3 = np6Var.d()) != null) {
                            int intValue6 = d3.intValue();
                            np6Var.q(intValue6, intValue6);
                        }
                    }
                }
                np6Var.p();
                return o27Var;
            case 32:
                ur6 ur6Var4 = np6Var.e;
                ur6Var4.a = null;
                to toVar6 = np6Var.g;
                String str7 = toVar6.B;
                String str8 = toVar6.B;
                if (str7.length() > 0) {
                    if (np6Var.f()) {
                        ur6Var4.a = null;
                        if (str8.length() > 0 && (d4 = np6Var.d()) != null) {
                            int intValue7 = d4.intValue();
                            np6Var.q(intValue7, intValue7);
                        }
                    } else {
                        ur6Var4.a = null;
                        if (str8.length() > 0 && (e4 = np6Var.e()) != null) {
                            int intValue8 = e4.intValue();
                            np6Var.q(intValue8, intValue8);
                        }
                    }
                }
                np6Var.p();
                return o27Var;
            case 33:
                np6Var.l();
                np6Var.p();
                return o27Var;
            case 34:
                np6Var.j();
                np6Var.p();
                return o27Var;
            case 35:
                np6Var.o();
                np6Var.p();
                return o27Var;
            case 36:
                np6Var.n();
                np6Var.p();
                return o27Var;
            case 37:
                np6Var.e.a = null;
                if (np6Var.g.B.length() > 0) {
                    if (np6Var.f()) {
                        np6Var.o();
                    } else {
                        np6Var.n();
                    }
                }
                np6Var.p();
                return o27Var;
            case 38:
                np6Var.e.a = null;
                if (np6Var.g.B.length() > 0) {
                    if (np6Var.f()) {
                        np6Var.n();
                    } else {
                        np6Var.o();
                    }
                }
                np6Var.p();
                return o27Var;
            case 39:
                if (np6Var.g.B.length() > 0 && (lr6Var3 = np6Var.c) != null) {
                    int g3 = np6Var.g(lr6Var3, -1);
                    np6Var.q(g3, g3);
                }
                np6Var.p();
                return o27Var;
            case 40:
                if (np6Var.g.B.length() > 0 && (lr6Var4 = np6Var.c) != null) {
                    int g4 = np6Var.g(lr6Var4, 1);
                    np6Var.q(g4, g4);
                }
                np6Var.p();
                return o27Var;
            case 41:
                if (np6Var.g.B.length() > 0 && (mr6Var3 = np6Var.i) != null) {
                    int h3 = np6Var.h(mr6Var3, -1);
                    np6Var.q(h3, h3);
                }
                np6Var.p();
                return o27Var;
            case 42:
                if (np6Var.g.B.length() > 0 && (mr6Var4 = np6Var.i) != null) {
                    int h4 = np6Var.h(mr6Var4, 1);
                    np6Var.q(h4, h4);
                }
                np6Var.p();
                return o27Var;
            case 43:
                np6Var.e.a = null;
                if (np6Var.g.B.length() > 0) {
                    np6Var.q(0, 0);
                }
                np6Var.p();
                return o27Var;
            case 44:
                np6Var.e.a = null;
                to toVar7 = np6Var.g;
                if (toVar7.B.length() > 0) {
                    int length2 = toVar7.B.length();
                    np6Var.q(length2, length2);
                }
                np6Var.p();
                return o27Var;
            case 45:
                np6Var.e.a = null;
                if (np6Var.g.B.length() > 0) {
                    long j3 = np6Var.f;
                    int i2 = vr6.c;
                    int i3 = (int) (j3 & 4294967295L);
                    np6Var.q(i3, i3);
                    return o27Var;
                }
                break;
            case 46:
                k27 k27Var = ip6Var.h;
                if (k27Var != null) {
                    k27Var.a(oq6.a(np6Var.h, np6Var.g, np6Var.f, 4));
                }
                k27 k27Var2 = ip6Var.h;
                if (k27Var2 != null) {
                    wv6 wv6Var2 = k27Var2.a;
                    if (wv6Var2 != null && (wv6Var = (wv6) wv6Var2.B) != null) {
                        k27Var2.a = wv6Var;
                        k27Var2.c -= ((oq6) wv6Var2.L).a.B.length();
                        k27Var2.b = new wv6(2, k27Var2.b, (oq6) wv6Var2.L);
                        oq6Var = (oq6) wv6Var.L;
                    }
                    if (oq6Var != null) {
                        ip6Var.k.n(oq6Var);
                        return o27Var;
                    }
                }
                break;
            case 47:
                k27 k27Var3 = ip6Var.h;
                if (k27Var3 != null) {
                    wv6 wv6Var3 = k27Var3.b;
                    if (wv6Var3 != null) {
                        k27Var3.b = (wv6) wv6Var3.B;
                        oq6 oq6Var2 = (oq6) wv6Var3.L;
                        k27Var3.a = new wv6(2, k27Var3.a, oq6Var2);
                        k27Var3.c = oq6Var2.a.B.length() + k27Var3.c;
                        oq6Var = (oq6) wv6Var3.L;
                    }
                    if (oq6Var != null) {
                        ip6Var.k.n(oq6Var);
                        return o27Var;
                    }
                }
                break;
            case 48:
            case 49:
                break;
            default:
                i.c();
                return null;
        }
        return o27Var;
    }

    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, n75] */
    @Override // defpackage.mi2
    public final Object n(Object obj) {
        Object kc5Var;
        InputStream openInputStream;
        BitmapRegionDecoder newInstance;
        Object obj2;
        xq0 xq0Var;
        long j;
        boolean z;
        b60 c;
        pq6 pq6Var;
        oh0 oh0Var;
        long j2;
        List actions;
        boolean z2;
        et0 et0Var;
        boolean shouldShowIcon;
        Drawable icon;
        et0 et0Var2;
        et0 et0Var3;
        int intValue;
        int intValue2;
        int intValue3;
        boolean z3;
        hm3 hm3Var;
        so soVar;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i = this.A;
        float f = 1.0f;
        et0 et0Var4 = null;
        Object obj3 = o27.a;
        Object obj4 = this.L;
        Object obj5 = this.B;
        Object obj6 = this.R;
        switch (i) {
            case 0:
                Context context = (Context) obj5;
                uq6 uq6Var = (uq6) obj4;
                e00 e00Var = (e00) obj6;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    try {
                        openInputStream = context.getContentResolver().openInputStream(uri);
                    } catch (Throwable th) {
                        kc5Var = new kc5(th);
                    }
                    if (openInputStream != null) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            newInstance = dd.c(openInputStream);
                        } else {
                            newInstance = BitmapRegionDecoder.newInstance(openInputStream, true);
                        }
                        if (newInstance != null) {
                            newInstance.recycle();
                            obj2 = obj3;
                        } else {
                            obj2 = null;
                        }
                        openInputStream.close();
                        if (obj2 != null) {
                            kc5Var = obj3;
                            if (kc5Var instanceof kc5) {
                                Toast.makeText(context, (int) R.string.background_add_processing_failed, 1).show();
                            } else {
                                String Q = l07.Q(uh1.g(context, uri));
                                if (Q == null) {
                                    Q = "";
                                }
                                uq6.c(uq6Var, Q, new x(5, uri, e00Var));
                            }
                        }
                    }
                    throw new Exception("Failed to open stream");
                }
                return obj3;
            case 1:
                final BackgroundsActivity backgroundsActivity = (BackgroundsActivity) obj5;
                final g56 g56Var = (g56) obj4;
                final l44 l44Var = (l44) obj6;
                h44 h44Var = (h44) obj;
                int i2 = BackgroundsActivity.A0;
                h44Var.getClass();
                nl2.E(h44Var, q75.a(zz.class), qp1.A, new et0(1638678397, true, new cj2() { // from class: vz
                    @Override // defpackage.cj2
                    public final Object q(Object obj7, Object obj8, Object obj9, Object obj10) {
                        gn gnVar = (gn) obj7;
                        int intValue4 = ((Integer) obj10).intValue();
                        int i3 = BackgroundsActivity.A0;
                        gnVar.getClass();
                        ((l34) obj8).getClass();
                        BackgroundsActivity backgroundsActivity2 = BackgroundsActivity.this;
                        e00 e00Var2 = (e00) backgroundsActivity2.z0.getValue();
                        sk2 sk2Var = (sk2) ((tu0) obj9);
                        boolean h = sk2Var.h(backgroundsActivity2);
                        Object L = sk2Var.L();
                        sn1 sn1Var = su0.a;
                        if (h || L == sn1Var) {
                            L = new z(1, backgroundsActivity2, BackgroundsActivity.class, "onBackgroundSelected", "onBackgroundSelected(Lme/magnum/melonds/domain/model/Background;)V", 0, 0, 2);
                            sk2Var.h0(L);
                        }
                        mi2 mi2Var = (mi2) ((lj2) L);
                        l44 l44Var2 = l44Var;
                        boolean h2 = sk2Var.h(l44Var2);
                        Object L2 = sk2Var.L();
                        if (h2 || L2 == sn1Var) {
                            L2 = new j0(13, l44Var2);
                            sk2Var.h0(L2);
                        }
                        mi2 mi2Var2 = (mi2) L2;
                        boolean h3 = sk2Var.h(backgroundsActivity2);
                        Object L3 = sk2Var.L();
                        if (h3 || L3 == sn1Var) {
                            L3 = new b5(6, backgroundsActivity2);
                            sk2Var.h0(L3);
                        }
                        dt3.i(e00Var2, g56Var, gnVar, mi2Var, mi2Var2, (ki2) L3, sk2Var, (intValue4 << 6) & 896);
                        return o27.a;
                    }
                }));
                c00.Companion.getClass();
                nl2.E(h44Var, q75.a(c00.class), c00.p, new et0(-44096588, true, new w5(1, g56Var, l44Var)));
                return obj3;
            case 2:
                mi2 mi2Var = (mi2) obj5;
                k24 k24Var = (k24) obj6;
                oq6 oq6Var = (oq6) obj;
                ((k24) obj4).setValue(oq6Var);
                boolean x = b53.x((String) k24Var.getValue(), oq6Var.a.B);
                to toVar = oq6Var.a;
                k24Var.setValue(toVar.B);
                if (!x) {
                    mi2Var.n(toVar.B);
                }
                return obj3;
            case 3:
                mi2 mi2Var2 = (mi2) obj5;
                aj2 aj2Var = (aj2) obj4;
                k24 k24Var2 = (k24) obj6;
                bm0 bm0Var = (bm0) obj;
                bm0Var.getClass();
                bl0 bl0Var = (bl0) k24Var2.getValue();
                if (b53.x(bl0Var, al0.b)) {
                    mi2Var2.n(bm0Var);
                } else if (bl0Var instanceof yk0) {
                    aj2Var.j(((yk0) bl0Var).b, bm0Var);
                }
                k24Var2.setValue(zk0.b);
                return obj3;
            case 4:
                k01 k01Var = (k01) obj5;
                c63 c63Var = (c63) obj4;
                xw5 xw5Var = (xw5) obj6;
                float floatValue = ((Float) obj).floatValue();
                if (!k01Var.l0) {
                    f = -1.0f;
                }
                ax5 ax5Var = k01Var.k0;
                long e = ax5Var.e(ax5Var.h(f * floatValue));
                ax5 ax5Var2 = xw5Var.a;
                float g = ax5Var.g(ax5Var.e(ax5Var2.c(ax5Var2.k, e, 1))) * f;
                if (Math.abs(g) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + g + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    c63Var.i(cancellationException);
                }
                return obj3;
            case 5:
                hm3 hm3Var2 = (hm3) obj5;
                oq6 oq6Var2 = (oq6) obj4;
                pb4 pb4Var = (pb4) obj6;
                hk1 hk1Var = (hk1) obj;
                mr6 d = hm3Var2.d();
                if (d != null) {
                    oh0 s = hk1Var.I().s();
                    long j3 = ((vr6) hm3Var2.A.getValue()).a;
                    long j4 = ((vr6) hm3Var2.B.getValue()).a;
                    lr6 lr6Var = d.a;
                    q04 q04Var = lr6Var.b;
                    kr6 kr6Var = lr6Var.a;
                    oi oiVar = hm3Var2.y;
                    long j5 = hm3Var2.z;
                    if (!vr6.c(j3)) {
                        oiVar.l(j5);
                        int r = pb4Var.r(vr6.f(j3));
                        int r2 = pb4Var.r(vr6.e(j3));
                        if (r != r2) {
                            s.h(lr6Var.i(r, r2), oiVar);
                        }
                    } else if (!vr6.c(j4)) {
                        long b = kr6Var.b.b();
                        xq0 xq0Var2 = new xq0(b);
                        if (b == 16) {
                            xq0Var = null;
                        } else {
                            xq0Var = xq0Var2;
                        }
                        if (xq0Var != null) {
                            j = xq0Var.a;
                        } else {
                            j = xq0.b;
                        }
                        oiVar.l(xq0.b(xq0.d(j) * 0.2f, j));
                        int r3 = pb4Var.r(vr6.f(j4));
                        int r4 = pb4Var.r(vr6.e(j4));
                        if (r3 != r4) {
                            s.h(lr6Var.i(r3, r4), oiVar);
                        }
                    } else if (!vr6.c(oq6Var2.b)) {
                        oiVar.l(j5);
                        long j6 = oq6Var2.b;
                        int r5 = pb4Var.r(vr6.f(j6));
                        int r6 = pb4Var.r(vr6.e(j6));
                        if (r5 != r6) {
                            s.h(lr6Var.i(r5, r6), oiVar);
                        }
                    }
                    if (lr6Var.d() && kr6Var.f != 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        long j7 = lr6Var.c;
                        y55 b2 = yf2.b(0L, (Float.floatToRawIntBits((int) (j7 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j7 >> 32)) << 32));
                        s.m();
                        oh0.l(s, b2);
                    }
                    xb6 xb6Var = kr6Var.b.a;
                    qo6 qo6Var = xb6Var.m;
                    qq6 qq6Var = xb6Var.a;
                    if (qo6Var == null) {
                        qo6Var = qo6.b;
                    }
                    qo6 qo6Var2 = qo6Var;
                    u26 u26Var = xb6Var.n;
                    if (u26Var == null) {
                        u26Var = u26.d;
                    }
                    u26 u26Var2 = u26Var;
                    ik1 ik1Var = xb6Var.p;
                    if (ik1Var == null) {
                        ik1Var = r72.a;
                    }
                    ik1 ik1Var2 = ik1Var;
                    try {
                        c = qq6Var.c();
                        pq6Var = pq6.a;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        if (c != null) {
                            if (qq6Var != pq6Var) {
                                f = qq6Var.a();
                            }
                            oh0Var = s;
                            q04Var.j(oh0Var, c, f, u26Var2, qo6Var2, ik1Var2);
                        } else {
                            oh0Var = s;
                            if (qq6Var != pq6Var) {
                                j2 = qq6Var.b();
                            } else {
                                j2 = xq0.b;
                            }
                            q04Var.i(oh0Var, j2, u26Var2, qo6Var2, ik1Var2);
                        }
                        if (z) {
                            oh0Var.j();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (z) {
                            s.j();
                        }
                        throw th;
                    }
                }
                return obj3;
            case ig7.b /* 6 */:
                ic1 ic1Var = (ic1) obj5;
                gs0 gs0Var = (gs0) obj4;
                d96 d96Var = (d96) obj6;
                Throwable th4 = (Throwable) obj;
                if (th4 != null) {
                    if (th4 instanceof CancellationException) {
                        gs0Var.u((CancellationException) th4);
                    } else {
                        gs0Var.v0(th4);
                    }
                } else {
                    d96Var.n(ic1Var.p());
                    gs0Var.c0(obj3);
                }
                return obj3;
            case 7:
                k75 k75Var = (k75) obj5;
                go goVar = (go) obj;
                float floatValue2 = ((Number) goVar.e.getValue()).floatValue() - k75Var.A;
                float a = ((vw5) obj4).a(floatValue2);
                k75Var.A = ((Number) goVar.e.getValue()).floatValue();
                ((k75) obj6).A = ((Number) goVar.a.b.n(goVar.f)).floatValue();
                if (Math.abs(floatValue2 - a) > 0.5f) {
                    goVar.a();
                }
                return obj3;
            case 8:
                Context context2 = (Context) obj5;
                mo6 mo6Var = (mo6) obj6;
                c11 c11Var = (c11) obj;
                List list = ((zn6) obj4).a;
                int size = list.size();
                int i3 = 0;
                while (i3 < size) {
                    yn6 yn6Var = (yn6) list.get(i3);
                    if (yn6Var instanceof ho6) {
                        ho6 ho6Var = (ho6) yn6Var;
                        z5 z5Var = new z5(7, ho6Var);
                        if (ho6Var.c == 0) {
                            et0Var3 = et0Var4;
                        } else {
                            et0Var3 = new et0(-1930700965, true, new wb1(0, ho6Var));
                        }
                        c11.b(c11Var, z5Var, et0Var3, new p6(24, ho6Var, mo6Var), 6);
                    } else if (yn6Var instanceof no6) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            no6 no6Var = (no6) yn6Var;
                            if (context2 != null) {
                                int i4 = no6Var.c;
                                TextClassification textClassification = no6Var.b;
                                if (i4 >= 0) {
                                    actions = textClassification.getActions();
                                    RemoteAction c2 = go4.c(actions.get(i4));
                                    if (i4 == 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    bt5 bt5Var = new bt5(10, c2);
                                    if (!z2) {
                                        shouldShowIcon = c2.shouldShowIcon();
                                        if (!shouldShowIcon) {
                                            et0Var = null;
                                            c11.b(c11Var, bt5Var, et0Var, new t06(6, c2), 6);
                                        }
                                    }
                                    et0Var = new et0(-1261173016, true, new wb1(2, c2));
                                    c11.b(c11Var, bt5Var, et0Var, new t06(6, c2), 6);
                                } else {
                                    bt5 bt5Var2 = new bt5(9, textClassification);
                                    icon = textClassification.getIcon();
                                    if (icon != null) {
                                        et0Var2 = new et0(-1123224187, true, new wb1(1, icon));
                                    } else {
                                        et0Var2 = null;
                                    }
                                    c11.b(c11Var, bt5Var2, et0Var2, new jd2(28, context2, textClassification), 6);
                                }
                            }
                        }
                    } else if (yn6Var instanceof lo6) {
                        c11Var.a.add(se.d);
                    }
                    i3++;
                    et0Var4 = null;
                }
                return obj3;
            case 9:
                xa6 xa6Var = (xa6) obj5;
                l34 l34Var = (l34) obj4;
                ch1 ch1Var = (ch1) obj;
                xa6Var.add(l34Var);
                return new ym((ef1) obj6, l34Var, xa6Var);
            case 10:
                jq1 jq1Var = (jq1) obj4;
                gq1 gq1Var = (gq1) obj6;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i5 = EmulatorActivity.P1;
                int i6 = 1 << ((t95) obj5).a;
                if (booleanValue) {
                    intValue = ((Number) jq1Var.c()).intValue() & (~i6);
                } else {
                    intValue = ((Number) jq1Var.c()).intValue() | i6;
                }
                gq1Var.n(Integer.valueOf(intValue));
                return obj3;
            case 11:
                jq1 jq1Var2 = (jq1) obj4;
                gq1 gq1Var2 = (gq1) obj6;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                int i7 = EmulatorActivity.P1;
                int i8 = 1 << ((x95) obj5).a;
                if (booleanValue2) {
                    intValue2 = ((Number) jq1Var2.c()).intValue() & (~i8);
                } else {
                    intValue2 = ((Number) jq1Var2.c()).intValue() | i8;
                }
                gq1Var2.n(Integer.valueOf(intValue2));
                return obj3;
            case mj2.L /* 12 */:
                ki2 ki2Var = (ki2) obj4;
                mi2 mi2Var3 = (mi2) obj6;
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                int i9 = EmulatorActivity.P1;
                int i10 = 1 << ((y95) obj5).a;
                if (booleanValue3) {
                    intValue3 = ((Number) ki2Var.c()).intValue() & (~i10);
                } else {
                    intValue3 = ((Number) ki2Var.c()).intValue() | i10;
                }
                mi2Var3.n(Integer.valueOf(intValue3));
                return obj3;
            case 13:
                hv1 hv1Var = (hv1) obj5;
                String str = (String) obj4;
                ak2 ak2Var = (ak2) obj6;
                Throwable th5 = (Throwable) obj;
                if (th5 != null) {
                    ?? obj7 = new Object();
                    boolean j1 = hv1Var.j1(str, "runtime_job_failed", new p6(28, hv1Var, obj7));
                    ht1 ht1Var = hv1Var.w;
                    if (j1) {
                        hv1Var.u0();
                        ht1Var.d = false;
                        jm4 jm4Var = (jm4) obj7.A;
                        if (jm4Var != null) {
                            tq5.w(ua7.a(hv1Var), null, null, new pw1(jm4Var, hv1Var, (j11) null), 3);
                        }
                        hv1Var.I0("ra_runtime_job_terminated", new ti4("error", th5.getClass().getSimpleName()));
                        if (!(th5 instanceof CancellationException)) {
                            ht1Var.d(zj2.DISABLED_LOAD_ERROR);
                            hv1Var.N0.p(new b15(ak2Var.f));
                        }
                    }
                }
                return obj3;
            case 14:
                Void r0 = (Void) obj;
                ((tf0) obj4).j((xg0) obj6, i11.a((Context) obj5));
                return r0;
            case ig7.e /* 15 */:
                fn3 fn3Var = (fn3) obj5;
                final mn3 mn3Var = (mn3) obj4;
                final mi2 mi2Var4 = (mi2) obj6;
                ch1 ch1Var2 = (ch1) obj;
                final ?? obj8 = new Object();
                dn3 dn3Var = new dn3() { // from class: bn3
                    @Override // defpackage.dn3
                    public final void d(fn3 fn3Var2, pm3 pm3Var) {
                        int i11 = cn3.a[pm3Var.ordinal()];
                        n75 n75Var = obj8;
                        if (i11 != 1) {
                            if (i11 != 2) {
                                return;
                            }
                            ry ryVar = (ry) n75Var.A;
                            if (ryVar != null) {
                                ryVar.a();
                            }
                            n75Var.A = null;
                            return;
                        }
                        n75Var.A = mi2Var4.n(mn3.this);
                    }
                };
                fn3Var.getLifecycle().a(dn3Var);
                return new ym(fn3Var, dn3Var, obj8, 2);
            case 16:
                ae6 ae6Var = (ae6) obj4;
                rf5 rf5Var = (rf5) obj;
                rf5Var.l(((Number) ae6Var.getValue()).floatValue());
                rf5Var.m(((Number) ae6Var.getValue()).floatValue());
                rf5Var.c(((Number) ((ae6) obj6).getValue()).floatValue());
                rf5Var.s(((sw6) ((k24) obj5).getValue()).a);
                return obj3;
            case 17:
                ek3 ek3Var = (ek3) obj;
                ek3Var.getClass();
                List c0 = l07.c0(new ti4(qb6.ALPHABETICALLY, "A-Z"), new ti4(qb6.RECENTLY_PLAYED, null), new ti4(qb6.MOST_PLAYED, null));
                ek3Var.b0(c0.size(), null, new k5(16, c0), new et0(802480018, true, new t5(c0, (qb6) obj5, (rb6) obj4, (mi2) obj6, 6)));
                return obj3;
            case 18:
                List list2 = (List) obj5;
                ek3 ek3Var2 = (ek3) obj;
                ek3Var2.getClass();
                ek3Var2.b0(list2.size(), null, new k5(15, list2), new et0(802480018, true, new hh5(list2, (bm5) obj4, (mi2) obj6)));
                return obj3;
            case 19:
                Map map = (Map) obj5;
                String str2 = (String) obj4;
                wc2 wc2Var = (wc2) obj6;
                ((ch1) obj).getClass();
                map.put(str2, wc2Var);
                return new ym(map, str2, wc2Var, 3);
            case 20:
                gl5 gl5Var = (gl5) obj;
                gl5Var.getClass();
                tq5.w((o31) obj5, null, null, new wx1((ya1) obj4, gl5Var, (List) obj6, (j11) null, 24), 3);
                return obj3;
            case 21:
                kt5 kt5Var = (kt5) obj5;
                ot5 ot5Var = (ot5) obj6;
                ch1 ch1Var3 = (ch1) obj;
                d24 d24Var = kt5Var.B;
                if (!d24Var.b(obj4)) {
                    kt5Var.A.remove(obj4);
                    d24Var.m(obj4, ot5Var);
                    return new ym(kt5Var, obj4, ot5Var, 4);
                }
                c44.t(obj4, " was used multiple times ", "Key ");
                return null;
            case 22:
                qh qhVar = (qh) obj5;
                c44 c44Var = (c44) obj4;
                j75 j75Var = (j75) obj6;
                rp4 rp4Var = (rp4) obj;
                long j8 = rp4Var.c;
                bq6 bq6Var = (bq6) qhVar.R;
                if (bq6Var.k() && bq6Var.n().a.B.length() != 0 && (hm3Var = bq6Var.d) != null && hm3Var.d() != null) {
                    qhVar.r(bq6Var.n(), j8, false, c44Var);
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    rp4Var.a();
                    j75Var.A = true;
                }
                return obj3;
            case 23:
                mb4 mb4Var = (mb4) obj;
                tq5.w((o31) obj5, null, null, new v74((ak1) obj4, (k24) obj6, null, 17), 3);
                return obj3;
            case 24:
                hf6 hf6Var = (hf6) obj5;
                n47 n47Var = (n47) obj6;
                Throwable th6 = (Throwable) obj;
                if ((th6 instanceof bw2) && ((bw2) th6).A == 3) {
                    tq5.w(hf6Var.b.f, null, null, new vm(hf6Var, n47Var, (ff6) null, (j11) null), 3);
                    return obj3;
                }
                throw null;
            case 25:
                j75 j75Var2 = (j75) obj5;
                so soVar2 = (so) obj4;
                xb6 xb6Var2 = (xb6) obj6;
                so soVar3 = (so) obj;
                if (j75Var2.A) {
                    Object obj9 = soVar3.a;
                    int i11 = soVar3.c;
                    int i12 = soVar3.b;
                    if ((obj9 instanceof xb6) && i12 == soVar2.b && i11 == soVar2.c) {
                        if (xb6Var2 == null) {
                            xb6Var2 = new xb6(0L, 0L, (pe2) null, (ke2) null, (le2) null, (pd2) null, (String) null, 0L, (d10) null, (rq6) null, (fr3) null, 0L, (qo6) null, (u26) null, 65535);
                        }
                        soVar = new so(i12, i11, xb6Var2);
                        j75Var2.A = soVar2.equals(soVar3);
                        return soVar;
                    }
                }
                soVar = soVar3;
                j75Var2.A = soVar2.equals(soVar3);
                return soVar;
            case 26:
                mi2 mi2Var5 = (mi2) obj4;
                er6 er6Var = (er6) ((n75) obj6).A;
                oq6 p = ((k91) obj5).p((List) obj);
                if (er6Var != null) {
                    er6Var.a(null, p);
                }
                mi2Var5.n(p);
                return obj3;
            case 27:
                return a(obj);
            default:
                final bq6 bq6Var2 = (bq6) obj4;
                o31 o31Var = (o31) obj6;
                Context context3 = (Context) obj5;
                xn6 xn6Var = (xn6) obj;
                w14 w14Var = xn6Var.a;
                w14 w14Var2 = xn6Var.a;
                lo6 lo6Var = lo6.b;
                w14Var.a(lo6Var);
                io6 io6Var = io6.Cut;
                if (!vr6.c(bq6Var2.n().b) && bq6Var2.j() && !(bq6Var2.f instanceof hk4) && bq6Var2.h != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                jd2 jd2Var = new jd2(29, o31Var, new wp6(bq6Var2, null, 1));
                Resources resources = context3.getResources();
                zr4 zr4Var = new zr4(17, jd2Var, (Object) null);
                if (z4) {
                    w14Var2.a(new ho6(io6Var.getKey(), resources.getString(io6Var.m10getStringId9Hzcbyc()), io6Var.m9getDrawableId3I4p1mQ(), zr4Var));
                }
                io6 io6Var2 = io6.Copy;
                if (!vr6.c(bq6Var2.n().b) && !(bq6Var2.f instanceof hk4) && bq6Var2.h != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                jd2 jd2Var2 = new jd2(29, o31Var, new wp6(bq6Var2, null, 2));
                Resources resources2 = context3.getResources();
                zr4 zr4Var2 = new zr4(17, jd2Var2, (Object) null);
                if (z5) {
                    w14Var2.a(new ho6(io6Var2.getKey(), resources2.getString(io6Var2.m10getStringId9Hzcbyc()), io6Var2.m9getDrawableId3I4p1mQ(), zr4Var2));
                }
                io6 io6Var3 = io6.Paste;
                if (bq6Var2.j() && ((Boolean) bq6Var2.x.getValue()).booleanValue() && bq6Var2.h != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                jd2 jd2Var3 = new jd2(29, o31Var, new wp6(bq6Var2, null, 3));
                Resources resources3 = context3.getResources();
                zr4 zr4Var3 = new zr4(17, jd2Var3, (Object) null);
                if (z6) {
                    w14Var2.a(new ho6(io6Var3.getKey(), resources3.getString(io6Var3.m10getStringId9Hzcbyc()), io6Var3.m9getDrawableId3I4p1mQ(), zr4Var3));
                }
                io6 io6Var4 = io6.SelectAll;
                if (vr6.d(bq6Var2.n().b) != bq6Var2.n().a.B.length()) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                ki2 ki2Var2 = new ki2() { // from class: gq6
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i13 = r2;
                        o27 o27Var = o27.a;
                        bq6 bq6Var3 = bq6Var2;
                        switch (i13) {
                            case 0:
                                return Boolean.valueOf(!bq6Var3.B);
                            case 1:
                                oq6 e2 = bq6.e(bq6Var3.n().a, ve2.g(0, bq6Var3.n().a.B.length()));
                                bq6Var3.c.n(e2);
                                long j9 = e2.b;
                                bq6Var3.w = new vr6(j9);
                                bq6Var3.u = oq6.a(bq6Var3.u, null, j9, 5);
                                bq6Var3.h(true);
                                return o27Var;
                            default:
                                ki2 ki2Var3 = bq6Var3.g;
                                if (ki2Var3 != null) {
                                    ki2Var3.c();
                                }
                                return o27Var;
                        }
                    }
                };
                ki2 ki2Var3 = new ki2() { // from class: gq6
                    @Override // defpackage.ki2
                    public final Object c() {
                        int i13 = r2;
                        o27 o27Var = o27.a;
                        bq6 bq6Var3 = bq6Var2;
                        switch (i13) {
                            case 0:
                                return Boolean.valueOf(!bq6Var3.B);
                            case 1:
                                oq6 e2 = bq6.e(bq6Var3.n().a, ve2.g(0, bq6Var3.n().a.B.length()));
                                bq6Var3.c.n(e2);
                                long j9 = e2.b;
                                bq6Var3.w = new vr6(j9);
                                bq6Var3.u = oq6.a(bq6Var3.u, null, j9, 5);
                                bq6Var3.h(true);
                                return o27Var;
                            default:
                                ki2 ki2Var32 = bq6Var3.g;
                                if (ki2Var32 != null) {
                                    ki2Var32.c();
                                }
                                return o27Var;
                        }
                    }
                };
                Resources resources4 = context3.getResources();
                zr4 zr4Var4 = new zr4(17, ki2Var3, ki2Var2);
                if (z7) {
                    w14Var2.a(new ho6(io6Var4.getKey(), resources4.getString(io6Var4.m10getStringId9Hzcbyc()), io6Var4.m9getDrawableId3I4p1mQ(), zr4Var4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    io6 io6Var5 = io6.Autofill;
                    if (bq6Var2.j() && vr6.c(bq6Var2.n().b)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    ki2 ki2Var4 = new ki2() { // from class: gq6
                        @Override // defpackage.ki2
                        public final Object c() {
                            int i13 = r2;
                            o27 o27Var = o27.a;
                            bq6 bq6Var3 = bq6Var2;
                            switch (i13) {
                                case 0:
                                    return Boolean.valueOf(!bq6Var3.B);
                                case 1:
                                    oq6 e2 = bq6.e(bq6Var3.n().a, ve2.g(0, bq6Var3.n().a.B.length()));
                                    bq6Var3.c.n(e2);
                                    long j9 = e2.b;
                                    bq6Var3.w = new vr6(j9);
                                    bq6Var3.u = oq6.a(bq6Var3.u, null, j9, 5);
                                    bq6Var3.h(true);
                                    return o27Var;
                                default:
                                    ki2 ki2Var32 = bq6Var3.g;
                                    if (ki2Var32 != null) {
                                        ki2Var32.c();
                                    }
                                    return o27Var;
                            }
                        }
                    };
                    Resources resources5 = context3.getResources();
                    zr4 zr4Var5 = new zr4(17, ki2Var4, (Object) null);
                    if (z8) {
                        w14Var2.a(new ho6(io6Var5.getKey(), resources5.getString(io6Var5.m10getStringId9Hzcbyc()), io6Var5.m9getDrawableId3I4p1mQ(), zr4Var5));
                    }
                }
                w14Var2.a(lo6Var);
                return obj3;
        }
    }

    public /* synthetic */ cz(k75 k75Var, vw5 vw5Var, k75 k75Var2, aa1 aa1Var) {
        this.A = 7;
        this.B = k75Var;
        this.L = vw5Var;
        this.R = k75Var2;
    }

    public /* synthetic */ cz(k01 k01Var, s37 s37Var, c63 c63Var, xw5 xw5Var) {
        this.A = 4;
        this.B = k01Var;
        this.L = c63Var;
        this.R = xw5Var;
    }

    public /* synthetic */ cz(zn6 zn6Var, Context context, mo6 mo6Var) {
        this.A = 8;
        this.L = zn6Var;
        this.B = context;
        this.R = mo6Var;
    }

    public /* synthetic */ cz(Object obj, Object obj2, Context context, int i) {
        this.A = i;
        this.L = obj;
        this.R = obj2;
        this.B = context;
    }

    public /* synthetic */ cz(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }
}
