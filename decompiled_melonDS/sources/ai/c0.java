package ai;

import a2.n;
import a7.d0;
import android.app.RemoteAction;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapRegionDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.widget.Toast;
import androidx.lifecycle.x;
import c1.p;
import c1.y1;
import e.e;
import f2.h1;
import h1.f3;
import h1.l2;
import h1.n2;
import h1.p2;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
import n2.m;
import n2.r;
import n2.s2;
import nc.t;
import u1.k1;
import u1.q1;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ c0(f2.b1 b1Var, zc.u uVar, Context context) {
        this.A = 3;
        this.L = b1Var;
        this.B = uVar;
        this.R = context;
    }

    private final Object a(Object obj) {
        Integer d4;
        Integer e6;
        Integer e10;
        Integer d10;
        l4.o0 o0Var;
        l4.o0 o0Var2;
        k1 k1Var;
        k1 k1Var2;
        Integer d11;
        Integer e11;
        Integer e12;
        Integer d12;
        l4.o0 o0Var3;
        l4.o0 o0Var4;
        k1 k1Var3;
        k1 k1Var4;
        p1.a0 a0Var;
        u1.z0 z0Var = (u1.z0) this.L;
        nc.p pVar = (nc.p) this.R;
        f2.r0 r0Var = (f2.r0) obj;
        q4.x xVar = null;
        switch (u1.y0.f13464a[((u1.h0) this.B).ordinal()]) {
            case DSiCameraSource.FrontCamera /* 1 */:
                z0Var.f13467b.d(false);
                break;
            case 2:
                z0Var.f13467b.p();
                break;
            case 3:
                z0Var.f13467b.f();
                break;
            case 4:
                r0Var.f4783e.f4742a = null;
                if (r0Var.f4785g.B.length() > 0) {
                    if (l4.q0.c(r0Var.f4784f)) {
                        r0Var.i();
                        break;
                    } else {
                        boolean f8 = r0Var.f();
                        long j2 = r0Var.f4784f;
                        if (f8) {
                            int f10 = l4.q0.f(j2);
                            r0Var.q(f10, f10);
                            break;
                        } else {
                            int e13 = l4.q0.e(j2);
                            r0Var.q(e13, e13);
                            break;
                        }
                    }
                }
                break;
            case l1.c.f8511g /* 5 */:
                r0Var.f4783e.f4742a = null;
                if (r0Var.f4785g.B.length() > 0) {
                    if (l4.q0.c(r0Var.f4784f)) {
                        r0Var.m();
                        break;
                    } else {
                        boolean f11 = r0Var.f();
                        long j10 = r0Var.f4784f;
                        if (f11) {
                            int e14 = l4.q0.e(j10);
                            r0Var.q(e14, e14);
                            break;
                        } else {
                            int f12 = l4.q0.f(j10);
                            r0Var.q(f12, f12);
                            break;
                        }
                    }
                }
                break;
            case l1.c.f8509e /* 6 */:
                h1 h1Var = r0Var.f4783e;
                h1Var.f4742a = null;
                l4.h hVar = r0Var.f4785g;
                String str = hVar.B;
                String str2 = hVar.B;
                if (str.length() > 0) {
                    if (r0Var.f()) {
                        h1Var.f4742a = null;
                        if (str2.length() > 0 && (e6 = r0Var.e()) != null) {
                            int intValue = e6.intValue();
                            r0Var.q(intValue, intValue);
                            break;
                        }
                    } else {
                        h1Var.f4742a = null;
                        if (str2.length() > 0 && (d4 = r0Var.d()) != null) {
                            int intValue2 = d4.intValue();
                            r0Var.q(intValue2, intValue2);
                            break;
                        }
                    }
                }
                break;
            case 7:
                h1 h1Var2 = r0Var.f4783e;
                h1Var2.f4742a = null;
                l4.h hVar2 = r0Var.f4785g;
                String str3 = hVar2.B;
                String str4 = hVar2.B;
                if (str3.length() > 0) {
                    if (r0Var.f()) {
                        h1Var2.f4742a = null;
                        if (str4.length() > 0 && (d10 = r0Var.d()) != null) {
                            int intValue3 = d10.intValue();
                            r0Var.q(intValue3, intValue3);
                            break;
                        }
                    } else {
                        h1Var2.f4742a = null;
                        if (str4.length() > 0 && (e10 = r0Var.e()) != null) {
                            int intValue4 = e10.intValue();
                            r0Var.q(intValue4, intValue4);
                            break;
                        }
                    }
                }
                break;
            case 8:
                r0Var.l();
                break;
            case l1.c.f8508d /* 9 */:
                r0Var.j();
                break;
            case l1.c.f8510f /* 10 */:
                if (r0Var.f4785g.B.length() > 0 && (o0Var = r0Var.f4781c) != null) {
                    int g10 = r0Var.g(o0Var, -1);
                    r0Var.q(g10, g10);
                    break;
                }
                break;
            case 11:
                if (r0Var.f4785g.B.length() > 0 && (o0Var2 = r0Var.f4781c) != null) {
                    int g11 = r0Var.g(o0Var2, 1);
                    r0Var.q(g11, g11);
                    break;
                }
                break;
            case 12:
                if (r0Var.f4785g.B.length() > 0 && (k1Var = r0Var.f4787i) != null) {
                    int h2 = r0Var.h(k1Var, -1);
                    r0Var.q(h2, h2);
                    break;
                }
                break;
            case 13:
                if (r0Var.f4785g.B.length() > 0 && (k1Var2 = r0Var.f4787i) != null) {
                    int h10 = r0Var.h(k1Var2, 1);
                    r0Var.q(h10, h10);
                    break;
                }
                break;
            case 14:
                r0Var.o();
                break;
            case l1.c.f8512h /* 15 */:
                r0Var.n();
                break;
            case 16:
                r0Var.f4783e.f4742a = null;
                if (r0Var.f4785g.B.length() > 0) {
                    if (r0Var.f()) {
                        r0Var.o();
                        break;
                    } else {
                        r0Var.n();
                        break;
                    }
                }
                break;
            case 17:
                r0Var.f4783e.f4742a = null;
                if (r0Var.f4785g.B.length() > 0) {
                    if (r0Var.f()) {
                        r0Var.n();
                        break;
                    } else {
                        r0Var.o();
                        break;
                    }
                }
                break;
            case 18:
                r0Var.f4783e.f4742a = null;
                if (r0Var.f4785g.B.length() > 0) {
                    r0Var.q(0, 0);
                    break;
                }
                break;
            case 19:
                r0Var.f4783e.f4742a = null;
                l4.h hVar3 = r0Var.f4785g;
                if (hVar3.B.length() > 0) {
                    int length = hVar3.B.length();
                    r0Var.q(length, length);
                    break;
                }
                break;
            case 20:
                List a10 = r0Var.a(new od.x(24));
                if (a10 != null) {
                    z0Var.a(a10);
                    break;
                }
                break;
            case 21:
                List a11 = r0Var.a(new od.x(25));
                if (a11 != null) {
                    z0Var.a(a11);
                    break;
                }
                break;
            case 22:
                List a12 = r0Var.a(new od.x(26));
                if (a12 != null) {
                    z0Var.a(a12);
                    break;
                }
                break;
            case 23:
                List a13 = r0Var.a(new od.x(27));
                if (a13 != null) {
                    z0Var.a(a13);
                    break;
                }
                break;
            case 24:
                List a14 = r0Var.a(new od.x(28));
                if (a14 != null) {
                    z0Var.a(a14);
                    break;
                }
                break;
            case 25:
                List a15 = r0Var.a(new od.x(29));
                if (a15 != null) {
                    z0Var.a(a15);
                    break;
                }
                break;
            case 26:
                if (!z0Var.f13470e) {
                    z0Var.a(p7.t.x(new q4.a("\n", 1)));
                    break;
                } else {
                    pVar.A = z0Var.f13466a.f13401x.B.f13395r.b(z0Var.f13477l);
                    break;
                }
            case 27:
                if (!z0Var.f13470e) {
                    z0Var.a(p7.t.x(new q4.a("\t", 1)));
                    break;
                } else {
                    pVar.A = false;
                    break;
                }
            case 28:
                r0Var.f4783e.f4742a = null;
                l4.h hVar4 = r0Var.f4785g;
                if (hVar4.B.length() > 0) {
                    r0Var.q(0, hVar4.B.length());
                    break;
                }
                break;
            case 29:
                r0Var.i();
                r0Var.p();
                break;
            case 30:
                r0Var.m();
                r0Var.p();
                break;
            case 31:
                h1 h1Var3 = r0Var.f4783e;
                h1Var3.f4742a = null;
                l4.h hVar5 = r0Var.f4785g;
                String str5 = hVar5.B;
                String str6 = hVar5.B;
                if (str5.length() > 0) {
                    if (r0Var.f()) {
                        h1Var3.f4742a = null;
                        if (str6.length() > 0 && (e11 = r0Var.e()) != null) {
                            int intValue5 = e11.intValue();
                            r0Var.q(intValue5, intValue5);
                        }
                    } else {
                        h1Var3.f4742a = null;
                        if (str6.length() > 0 && (d11 = r0Var.d()) != null) {
                            int intValue6 = d11.intValue();
                            r0Var.q(intValue6, intValue6);
                        }
                    }
                }
                r0Var.p();
                break;
            case 32:
                h1 h1Var4 = r0Var.f4783e;
                h1Var4.f4742a = null;
                l4.h hVar6 = r0Var.f4785g;
                String str7 = hVar6.B;
                String str8 = hVar6.B;
                if (str7.length() > 0) {
                    if (r0Var.f()) {
                        h1Var4.f4742a = null;
                        if (str8.length() > 0 && (d12 = r0Var.d()) != null) {
                            int intValue7 = d12.intValue();
                            r0Var.q(intValue7, intValue7);
                        }
                    } else {
                        h1Var4.f4742a = null;
                        if (str8.length() > 0 && (e12 = r0Var.e()) != null) {
                            int intValue8 = e12.intValue();
                            r0Var.q(intValue8, intValue8);
                        }
                    }
                }
                r0Var.p();
                break;
            case 33:
                r0Var.l();
                r0Var.p();
                break;
            case 34:
                r0Var.j();
                r0Var.p();
                break;
            case 35:
                r0Var.o();
                r0Var.p();
                break;
            case 36:
                r0Var.n();
                r0Var.p();
                break;
            case 37:
                r0Var.f4783e.f4742a = null;
                if (r0Var.f4785g.B.length() > 0) {
                    if (r0Var.f()) {
                        r0Var.o();
                    } else {
                        r0Var.n();
                    }
                }
                r0Var.p();
                break;
            case 38:
                r0Var.f4783e.f4742a = null;
                if (r0Var.f4785g.B.length() > 0) {
                    if (r0Var.f()) {
                        r0Var.n();
                    } else {
                        r0Var.o();
                    }
                }
                r0Var.p();
                break;
            case 39:
                if (r0Var.f4785g.B.length() > 0 && (o0Var3 = r0Var.f4781c) != null) {
                    int g12 = r0Var.g(o0Var3, -1);
                    r0Var.q(g12, g12);
                }
                r0Var.p();
                break;
            case 40:
                if (r0Var.f4785g.B.length() > 0 && (o0Var4 = r0Var.f4781c) != null) {
                    int g13 = r0Var.g(o0Var4, 1);
                    r0Var.q(g13, g13);
                }
                r0Var.p();
                break;
            case 41:
                if (r0Var.f4785g.B.length() > 0 && (k1Var3 = r0Var.f4787i) != null) {
                    int h11 = r0Var.h(k1Var3, -1);
                    r0Var.q(h11, h11);
                }
                r0Var.p();
                break;
            case 42:
                if (r0Var.f4785g.B.length() > 0 && (k1Var4 = r0Var.f4787i) != null) {
                    int h12 = r0Var.h(k1Var4, 1);
                    r0Var.q(h12, h12);
                }
                r0Var.p();
                break;
            case 43:
                r0Var.f4783e.f4742a = null;
                if (r0Var.f4785g.B.length() > 0) {
                    r0Var.q(0, 0);
                }
                r0Var.p();
                break;
            case 44:
                r0Var.f4783e.f4742a = null;
                l4.h hVar7 = r0Var.f4785g;
                if (hVar7.B.length() > 0) {
                    int length2 = hVar7.B.length();
                    r0Var.q(length2, length2);
                }
                r0Var.p();
                break;
            case 45:
                r0Var.f4783e.f4742a = null;
                if (r0Var.f4785g.B.length() > 0) {
                    long j11 = r0Var.f4784f;
                    int i2 = l4.q0.f8884c;
                    int i10 = (int) (j11 & 4294967295L);
                    r0Var.q(i10, i10);
                    break;
                }
                break;
            case 46:
                q1 q1Var = z0Var.f13473h;
                if (q1Var != null) {
                    q1Var.a(q4.x.a(r0Var.f4786h, r0Var.f4785g, r0Var.f4784f, 4));
                }
                q1 q1Var2 = z0Var.f13473h;
                if (q1Var2 != null) {
                    p1.a0 a0Var2 = q1Var2.f13417a;
                    if (a0Var2 != null && (a0Var = (p1.a0) a0Var2.B) != null) {
                        q1Var2.f13417a = a0Var;
                        q1Var2.f13419c -= ((q4.x) a0Var2.L).f12276a.B.length();
                        q1Var2.f13418b = new p1.a0(14, q1Var2.f13418b, (q4.x) a0Var2.L);
                        xVar = (q4.x) a0Var.L;
                    }
                    if (xVar != null) {
                        z0Var.f13476k.k(xVar);
                        break;
                    }
                }
                break;
            case 47:
                q1 q1Var3 = z0Var.f13473h;
                if (q1Var3 != null) {
                    p1.a0 a0Var3 = q1Var3.f13418b;
                    if (a0Var3 != null) {
                        q1Var3.f13418b = (p1.a0) a0Var3.B;
                        q4.x xVar2 = (q4.x) a0Var3.L;
                        q1Var3.f13417a = new p1.a0(14, q1Var3.f13417a, xVar2);
                        q1Var3.f13419c = xVar2.f12276a.B.length() + q1Var3.f13419c;
                        xVar = (q4.x) a0Var3.L;
                    }
                    if (xVar != null) {
                        z0Var.f13476k.k(xVar);
                        break;
                    }
                }
                break;
            case 48:
            case 49:
                break;
            default:
                m9.o.o();
                return null;
        }
        return yb.y.f14813a;
    }

    /* JADX WARN: Type inference failed for: r0v83, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v100, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // mc.l
    public final Object k(Object obj) {
        boolean z10;
        u1.p0 p0Var;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        float f8;
        Object kVar;
        InputStream openInputStream;
        BitmapRegionDecoder newInstance;
        Object obj2;
        i3.s sVar;
        long j2;
        boolean z16;
        boolean z17;
        i3.q qVar;
        long j10;
        float f10;
        l4.f fVar;
        List actions;
        boolean z18;
        v2.c cVar;
        boolean shouldShowIcon;
        Drawable icon;
        v2.c cVar2;
        v2.c cVar3;
        int i2 = this.A;
        int i10 = 2;
        int i11 = 0;
        Object obj3 = yb.y.f14813a;
        Object obj4 = this.R;
        Object obj5 = this.L;
        Object obj6 = this.B;
        switch (i2) {
            case 0:
                zh.q qVar2 = (zh.q) obj;
                qVar2.getClass();
                zc.x.v((zc.u) obj6, null, null, new a2.o((q1.a0) obj5, qVar2, (List) obj4, null, 6), 3);
                return obj3;
            case DSiCameraSource.FrontCamera /* 1 */:
                z2.p pVar = (z2.p) obj6;
                a7.i iVar = (a7.i) obj5;
                n2.h0 h0Var = (n2.h0) obj;
                pVar.add(iVar);
                return new b7.n((b7.r) obj4, iVar, pVar, 0);
            case 2:
                d0.c cVar4 = (d0.c) obj6;
                a0.j jVar = (a0.j) obj5;
                nc.p pVar2 = (nc.p) obj4;
                v3.t tVar = (v3.t) obj;
                long j11 = tVar.f13693c;
                f2.b1 b1Var = (f2.b1) cVar4.R;
                if (b1Var.k() && b1Var.n().f12276a.B.length() != 0 && (p0Var = b1Var.f4709d) != null && p0Var.d() != null) {
                    cVar4.m(b1Var.n(), j11, false, jVar);
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    tVar.a();
                    pVar2.A = true;
                }
                return obj3;
            case 3:
                final f2.b1 b1Var2 = (f2.b1) obj5;
                zc.u uVar = (zc.u) obj6;
                Context context = (Context) obj4;
                w1.a aVar = (w1.a) obj;
                a1.h0 h0Var2 = aVar.f14111a;
                a1.h0 h0Var3 = aVar.f14111a;
                x1.f fVar2 = x1.f.f14333b;
                h0Var2.a(fVar2);
                u1.t0 t0Var = u1.t0.Cut;
                if (!l4.q0.c(b1Var2.n().f12277b) && b1Var2.j() && !(b1Var2.f4711f instanceof q4.r) && b1Var2.f4713h != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                a3.e eVar = new a3.e(uVar, new f2.v0(b1Var2, null, 1));
                Resources resources = context.getResources();
                a7.l lVar = new a7.l(19, eVar, null);
                if (z11) {
                    h0Var3.a(new x1.d(t0Var.getKey(), resources.getString(t0Var.m18getStringId9Hzcbyc()), t0Var.m17getDrawableId3I4p1mQ(), lVar));
                }
                u1.t0 t0Var2 = u1.t0.Copy;
                if (!l4.q0.c(b1Var2.n().f12277b) && !(b1Var2.f4711f instanceof q4.r) && b1Var2.f4713h != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                a3.e eVar2 = new a3.e(uVar, new f2.v0(b1Var2, null, 2));
                Resources resources2 = context.getResources();
                a7.l lVar2 = new a7.l(19, eVar2, null);
                if (z12) {
                    h0Var3.a(new x1.d(t0Var2.getKey(), resources2.getString(t0Var2.m18getStringId9Hzcbyc()), t0Var2.m17getDrawableId3I4p1mQ(), lVar2));
                }
                u1.t0 t0Var3 = u1.t0.Paste;
                if (b1Var2.j() && ((Boolean) b1Var2.f4728x.getValue()).booleanValue() && b1Var2.f4713h != null) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                a3.e eVar3 = new a3.e(uVar, new f2.v0(b1Var2, null, 3));
                Resources resources3 = context.getResources();
                a7.l lVar3 = new a7.l(19, eVar3, null);
                if (z13) {
                    h0Var3.a(new x1.d(t0Var3.getKey(), resources3.getString(t0Var3.m18getStringId9Hzcbyc()), t0Var3.m17getDrawableId3I4p1mQ(), lVar3));
                }
                u1.t0 t0Var4 = u1.t0.SelectAll;
                if (l4.q0.d(b1Var2.n().f12277b) != b1Var2.n().f12276a.B.length()) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                mc.a aVar2 = new mc.a() { // from class: f2.f1
                    @Override // mc.a
                    public final Object b() {
                        switch (r2) {
                            case 0:
                                return Boolean.valueOf(!b1Var2.B);
                            case DSiCameraSource.FrontCamera /* 1 */:
                                b1 b1Var3 = b1Var2;
                                q4.x e6 = b1.e(b1Var3.n().f12276a, l4.i0.b(0, b1Var3.n().f12276a.B.length()));
                                b1Var3.f4708c.k(e6);
                                long j12 = e6.f12277b;
                                b1Var3.f4727w = new l4.q0(j12);
                                b1Var3.f4725u = q4.x.a(b1Var3.f4725u, null, j12, 5);
                                b1Var3.h(true);
                                return yb.y.f14813a;
                            default:
                                mc.a aVar3 = b1Var2.f4712g;
                                if (aVar3 != null) {
                                    aVar3.b();
                                }
                                return yb.y.f14813a;
                        }
                    }
                };
                mc.a aVar3 = new mc.a() { // from class: f2.f1
                    @Override // mc.a
                    public final Object b() {
                        switch (r2) {
                            case 0:
                                return Boolean.valueOf(!b1Var2.B);
                            case DSiCameraSource.FrontCamera /* 1 */:
                                b1 b1Var3 = b1Var2;
                                q4.x e6 = b1.e(b1Var3.n().f12276a, l4.i0.b(0, b1Var3.n().f12276a.B.length()));
                                b1Var3.f4708c.k(e6);
                                long j12 = e6.f12277b;
                                b1Var3.f4727w = new l4.q0(j12);
                                b1Var3.f4725u = q4.x.a(b1Var3.f4725u, null, j12, 5);
                                b1Var3.h(true);
                                return yb.y.f14813a;
                            default:
                                mc.a aVar32 = b1Var2.f4712g;
                                if (aVar32 != null) {
                                    aVar32.b();
                                }
                                return yb.y.f14813a;
                        }
                    }
                };
                Resources resources4 = context.getResources();
                a7.l lVar4 = new a7.l(19, aVar3, aVar2);
                if (z14) {
                    h0Var3.a(new x1.d(t0Var4.getKey(), resources4.getString(t0Var4.m18getStringId9Hzcbyc()), t0Var4.m17getDrawableId3I4p1mQ(), lVar4));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    u1.t0 t0Var5 = u1.t0.Autofill;
                    if (b1Var2.j() && l4.q0.c(b1Var2.n().f12277b)) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    mc.a aVar4 = new mc.a() { // from class: f2.f1
                        @Override // mc.a
                        public final Object b() {
                            switch (r2) {
                                case 0:
                                    return Boolean.valueOf(!b1Var2.B);
                                case DSiCameraSource.FrontCamera /* 1 */:
                                    b1 b1Var3 = b1Var2;
                                    q4.x e6 = b1.e(b1Var3.n().f12276a, l4.i0.b(0, b1Var3.n().f12276a.B.length()));
                                    b1Var3.f4708c.k(e6);
                                    long j12 = e6.f12277b;
                                    b1Var3.f4727w = new l4.q0(j12);
                                    b1Var3.f4725u = q4.x.a(b1Var3.f4725u, null, j12, 5);
                                    b1Var3.h(true);
                                    return yb.y.f14813a;
                                default:
                                    mc.a aVar32 = b1Var2.f4712g;
                                    if (aVar32 != null) {
                                        aVar32.b();
                                    }
                                    return yb.y.f14813a;
                            }
                        }
                    };
                    Resources resources5 = context.getResources();
                    a7.l lVar5 = new a7.l(19, aVar4, null);
                    if (z15) {
                        h0Var3.a(new x1.d(t0Var5.getKey(), resources5.getString(t0Var5.m18getStringId9Hzcbyc()), t0Var5.m17getDrawableId3I4p1mQ(), lVar5));
                    }
                }
                h0Var3.a(fVar2);
                return obj3;
            case 4:
                s2 s2Var = (s2) obj5;
                i3.k0 k0Var = (i3.k0) obj;
                k0Var.k(((Number) s2Var.getValue()).floatValue());
                k0Var.l(((Number) s2Var.getValue()).floatValue());
                k0Var.d(((Number) ((s2) obj4).getValue()).floatValue());
                k0Var.u(((i3.q0) ((n2.w0) obj6).getValue()).f6679a);
                return obj3;
            case l1.c.f8511g /* 5 */:
                h3.b bVar = (h3.b) obj;
                zc.x.v((zc.u) obj6, null, null, new di.b((h1.p0) obj5, (n2.w0) obj4, null, 8), 3);
                return obj3;
            case l1.c.f8509e /* 6 */:
                h1.j jVar2 = (h1.j) obj6;
                zc.y0 y0Var = (zc.y0) obj5;
                n2 n2Var = (n2) obj4;
                float floatValue = ((Float) obj).floatValue();
                if (jVar2.f5916k0) {
                    f8 = 1.0f;
                } else {
                    f8 = -1.0f;
                }
                p2 p2Var = jVar2.f5915j0;
                long e6 = p2Var.e(p2Var.h(f8 * floatValue));
                p2 p2Var2 = n2Var.f5985a;
                float g10 = p2Var.g(p2Var.e(p2Var2.c(p2Var2.f5999k, e6, 1))) * f8;
                if (Math.abs(g10) < Math.abs(floatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + g10 + " < " + floatValue + ')');
                    cancellationException.initCause(null);
                    y0Var.i(cancellationException);
                }
                return obj3;
            case 7:
                nc.q qVar3 = (nc.q) obj6;
                d1.i iVar2 = (d1.i) obj;
                float floatValue2 = ((Number) iVar2.f3590e.getValue()).floatValue() - qVar3.A;
                float a10 = ((l2) obj5).a(floatValue2);
                qVar3.A = ((Number) iVar2.f3590e.getValue()).floatValue();
                ((nc.q) obj4).A = ((Number) iVar2.f3586a.f3691b.k(iVar2.f3591f)).floatValue();
                if (Math.abs(floatValue2 - a10) > 0.5f) {
                    iVar2.a();
                }
                return obj3;
            case 8:
                final BackgroundsActivity backgroundsActivity = (BackgroundsActivity) obj6;
                final y1 y1Var = (y1) obj5;
                final a7.d0 d0Var = (a7.d0) obj4;
                a7.a0 a0Var = (a7.a0) obj;
                int i12 = BackgroundsActivity.f9488y0;
                a0Var.getClass();
                l0.f.g(a0Var, nc.u.a(hg.e.class), zb.r.A, new v2.c(1638678397, true, new mc.r() { // from class: hg.b
                    @Override // mc.r
                    public final Object r(Object obj7, Object obj8, Object obj9, Object obj10) {
                        p pVar3 = (p) obj7;
                        int intValue = ((Integer) obj10).intValue();
                        int i13 = BackgroundsActivity.f9488y0;
                        pVar3.getClass();
                        ((a7.i) obj8).getClass();
                        BackgroundsActivity backgroundsActivity2 = BackgroundsActivity.this;
                        l lVar6 = (l) backgroundsActivity2.f9492x0.getValue();
                        r rVar = (r) ((m) obj9);
                        boolean h2 = rVar.h(backgroundsActivity2);
                        Object L = rVar.L();
                        n2.e eVar4 = n2.l.f9953a;
                        if (h2 || L == eVar4) {
                            L = new a2.g(1, backgroundsActivity2, BackgroundsActivity.class, "onBackgroundSelected", "onBackgroundSelected(Lme/magnum/melonds/domain/model/Background;)V", 0, 0, 6);
                            rVar.h0(L);
                        }
                        mc.l lVar7 = (mc.l) ((nc.i) L);
                        d0 d0Var2 = d0Var;
                        boolean h10 = rVar.h(d0Var2);
                        Object L2 = rVar.L();
                        if (h10 || L2 == eVar4) {
                            L2 = new a2.c(21, d0Var2);
                            rVar.h0(L2);
                        }
                        mc.l lVar8 = (mc.l) L2;
                        boolean h11 = rVar.h(backgroundsActivity2);
                        Object L3 = rVar.L();
                        if (h11 || L3 == eVar4) {
                            L3 = new n(23, backgroundsActivity2);
                            rVar.h0(L3);
                        }
                        ig.m.e(lVar6, y1Var, pVar3, lVar7, lVar8, (mc.a) L3, rVar, (intValue << 6) & 896);
                        return y.f14813a;
                    }
                }));
                hg.h.Companion.getClass();
                l0.f.g(a0Var, nc.u.a(hg.h.class), hg.h.f6495e, new v2.c(-44096588, true, new lg.c(3, y1Var, d0Var)));
                return obj3;
            case l1.c.f8508d /* 9 */:
                Context context2 = (Context) obj6;
                rg.d dVar = (rg.d) obj5;
                hg.l lVar6 = (hg.l) obj4;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    try {
                        openInputStream = context2.getContentResolver().openInputStream(uri);
                    } catch (Throwable th2) {
                        kVar = new yb.k(th2);
                    }
                    if (openInputStream != null) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            newInstance = BitmapRegionDecoder.newInstance(openInputStream);
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
                            kVar = obj3;
                            if (kVar instanceof yb.k) {
                                Toast.makeText(context2, (int) R.string.background_add_processing_failed, 1).show();
                            } else {
                                String V = ij.a.V(k6.a.d(context2, uri));
                                if (V == null) {
                                    V = "";
                                }
                                rg.d.d(dVar, V, new he.g(6, uri, lVar6));
                            }
                        }
                    }
                    throw new Exception("Failed to open stream");
                }
                return obj3;
            case l1.c.f8510f /* 10 */:
                mc.l lVar7 = (mc.l) obj6;
                mc.p pVar3 = (mc.p) obj5;
                n2.w0 w0Var = (n2.w0) obj4;
                kg.e eVar4 = (kg.e) obj;
                eVar4.getClass();
                kg.d dVar2 = (kg.d) w0Var.getValue();
                if (nc.k.a(dVar2, kg.c.f8293b)) {
                    lVar7.k(eVar4);
                } else if (dVar2 instanceof kg.a) {
                    pVar3.j(((kg.a) dVar2).f8291b, eVar4);
                }
                w0Var.setValue(kg.b.f8292b);
                return obj3;
            case 11:
                rg.d dVar3 = (rg.d) obj6;
                q4.x xVar = (q4.x) obj;
                xVar.getClass();
                dVar3.getClass();
                dVar3.f12717b.setValue(xVar);
                ((n2.w0) obj4).setValue(Boolean.valueOf(!((Boolean) ((mc.l) obj5).k(xVar.f12276a.B)).booleanValue()));
                return obj3;
            case 12:
                mc.l lVar8 = (mc.l) obj6;
                n2.w0 w0Var2 = (n2.w0) obj4;
                q4.x xVar2 = (q4.x) obj;
                ((n2.w0) obj5).setValue(xVar2);
                boolean a11 = nc.k.a((String) w0Var2.getValue(), xVar2.f12276a.B);
                l4.h hVar = xVar2.f12276a;
                w0Var2.setValue(hVar.B);
                if (!a11) {
                    lVar8.k(hVar.B);
                }
                return obj3;
            case 13:
                u1.p0 p0Var2 = (u1.p0) obj6;
                q4.x xVar3 = (q4.x) obj5;
                q4.q qVar4 = (q4.q) obj4;
                k3.d dVar4 = (k3.d) obj;
                k1 d4 = p0Var2.d();
                if (d4 != null) {
                    i3.q p10 = dVar4.E().p();
                    long j12 = ((l4.q0) p0Var2.A.getValue()).f8885a;
                    long j13 = ((l4.q0) p0Var2.B.getValue()).f8885a;
                    l4.o0 o0Var = d4.f13358a;
                    l4.n0 n0Var = o0Var.f8865a;
                    l4.q qVar5 = o0Var.f8866b;
                    cd.h1 h1Var = p0Var2.f13402y;
                    long j14 = p0Var2.f13403z;
                    if (!l4.q0.c(j12)) {
                        h1Var.j(j14);
                        int m = qVar4.m(l4.q0.f(j12));
                        int m10 = qVar4.m(l4.q0.e(j12));
                        if (m != m10) {
                            p10.a(o0Var.h(m, m10), h1Var);
                        }
                    } else if (!l4.q0.c(j13)) {
                        long b10 = n0Var.f8854b.b();
                        i3.s sVar2 = new i3.s(b10);
                        if (b10 == 16) {
                            sVar = null;
                        } else {
                            sVar = sVar2;
                        }
                        if (sVar != null) {
                            j2 = sVar.f6689a;
                        } else {
                            j2 = i3.s.f6681b;
                        }
                        h1Var.j(i3.s.b(j2, i3.s.d(j2) * 0.2f));
                        int m11 = qVar4.m(l4.q0.f(j13));
                        int m12 = qVar4.m(l4.q0.e(j13));
                        if (m11 != m12) {
                            p10.a(o0Var.h(m11, m12), h1Var);
                        }
                    } else if (!l4.q0.c(xVar3.f12277b)) {
                        h1Var.j(j14);
                        long j15 = xVar3.f12277b;
                        int m13 = qVar4.m(l4.q0.f(j15));
                        int m14 = qVar4.m(l4.q0.e(j15));
                        if (m13 != m14) {
                            p10.a(o0Var.h(m13, m14), h1Var);
                        }
                    }
                    long j16 = o0Var.f8867c;
                    if (((int) (j16 >> 32)) >= qVar5.f8878d && !qVar5.f8877c && ((int) (j16 & 4294967295L)) >= qVar5.f8879e) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if (z16 && n0Var.f8858f != 3) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (z17) {
                        h3.c h2 = pc.a.h(0L, (Float.floatToRawIntBits((int) (j16 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j16 >> 32)) << 32));
                        p10.p();
                        i3.q.e(p10, h2);
                    }
                    l4.j0 j0Var = n0Var.f8854b.f8887a;
                    w4.l lVar9 = j0Var.m;
                    w4.o oVar = j0Var.f8827a;
                    if (lVar9 == null) {
                        lVar9 = w4.l.f14143b;
                    }
                    w4.l lVar10 = lVar9;
                    i3.m0 m0Var = j0Var.f8839n;
                    if (m0Var == null) {
                        m0Var = i3.m0.f6659d;
                    }
                    i3.m0 m0Var2 = m0Var;
                    k3.e eVar5 = j0Var.f8841p;
                    if (eVar5 == null) {
                        eVar5 = k3.g.f7961a;
                    }
                    k3.e eVar6 = eVar5;
                    try {
                        i3.o c4 = oVar.c();
                        w4.n nVar = w4.n.f14148a;
                        try {
                            if (c4 != null) {
                                if (oVar != nVar) {
                                    f10 = oVar.a();
                                } else {
                                    f10 = 1.0f;
                                }
                                qVar = p10;
                                l4.q.j(qVar5, qVar, c4, f10, m0Var2, lVar10, eVar6);
                            } else {
                                qVar = p10;
                                if (oVar != nVar) {
                                    j10 = oVar.b();
                                } else {
                                    j10 = i3.s.f6681b;
                                }
                                l4.q.i(qVar5, qVar, j10, m0Var2, lVar10, eVar6);
                            }
                            if (z17) {
                                qVar.m();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (z17) {
                                p10.m();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return obj3;
            case 14:
                nc.p pVar4 = (nc.p) obj6;
                l4.f fVar3 = (l4.f) obj5;
                l4.j0 j0Var2 = (l4.j0) obj4;
                l4.f fVar4 = (l4.f) obj;
                if (pVar4.A) {
                    Object obj7 = fVar4.f8790a;
                    int i13 = fVar4.f8792c;
                    int i14 = fVar4.f8791b;
                    if ((obj7 instanceof l4.j0) && i14 == fVar3.f8791b && i13 == fVar3.f8792c) {
                        if (j0Var2 == null) {
                            j0Var2 = new l4.j0(0L, 0L, (p4.j) null, (p4.h) null, (p4.i) null, (p4.p) null, (String) null, 0L, (w4.a) null, (w4.p) null, (s4.b) null, 0L, (w4.l) null, (i3.m0) null, 65535);
                        }
                        fVar = new l4.f(i14, i13, j0Var2);
                        pVar4.A = fVar3.equals(fVar4);
                        return fVar;
                    }
                }
                fVar = fVar4;
                pVar4.A = fVar3.equals(fVar4);
                return fVar;
            case l1.c.f8512h /* 15 */:
                mc.l lVar11 = (mc.l) obj5;
                q4.d0 d0Var2 = (q4.d0) ((nc.t) obj4).A;
                q4.x q10 = ((p1.a0) obj6).q((List) obj);
                if (d0Var2 != null) {
                    d0Var2.a(null, q10);
                }
                lVar11.k(q10);
                return obj3;
            case 16:
                return a(obj);
            case 17:
                androidx.lifecycle.x xVar4 = (androidx.lifecycle.x) obj6;
                final u6.c cVar5 = (u6.c) obj5;
                final mc.l lVar12 = (mc.l) obj4;
                n2.h0 h0Var4 = (n2.h0) obj;
                final ?? obj8 = new Object();
                androidx.lifecycle.v vVar = new androidx.lifecycle.v() { // from class: u6.a
                    @Override // androidx.lifecycle.v
                    public final void d(x xVar5, androidx.lifecycle.p pVar5) {
                        int i15 = b.f13495a[pVar5.ordinal()];
                        t tVar2 = obj8;
                        if (i15 != 1) {
                            if (i15 != 2) {
                                return;
                            }
                            e eVar7 = (e) tVar2.A;
                            if (eVar7 != null) {
                                eVar7.a();
                            }
                            tVar2.A = null;
                            return;
                        }
                        tVar2.A = lVar12.k(c.this);
                    }
                };
                xVar4.getLifecycle().a(vVar);
                return new b7.n(xVar4, vVar, obj8, 2);
            case 18:
                y2.e eVar7 = (y2.e) obj6;
                y2.i iVar3 = (y2.i) obj4;
                n2.h0 h0Var5 = (n2.h0) obj;
                a1.m0 m0Var3 = eVar7.B;
                if (!m0Var3.b(obj5)) {
                    eVar7.A.remove(obj5);
                    m0Var3.m(obj5, iVar3);
                    return new b7.n(eVar7, obj5, iVar3, 3);
                }
                fj.j.m(obj5, " was used multiple times ", "Key ");
                return null;
            default:
                Context context3 = (Context) obj5;
                x1.g gVar = (x1.g) obj4;
                g1.e eVar8 = (g1.e) obj;
                ?? r22 = ((x1.c) obj6).f14324a;
                int size = r22.size();
                int i15 = 0;
                while (i15 < size) {
                    x1.b bVar2 = (x1.b) r22.get(i15);
                    if (bVar2 instanceof x1.d) {
                        x1.d dVar5 = (x1.d) bVar2;
                        y2.b bVar3 = new y2.b(i10, dVar5);
                        if (dVar5.f14326c == 0) {
                            cVar3 = null;
                        } else {
                            cVar3 = new v2.c(-1930700965, true, new z1.j(i11, dVar5));
                        }
                        g1.e.b(eVar8, bVar3, cVar3, new q1.e(18, dVar5, gVar), 6);
                    } else if (bVar2 instanceof x1.h) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            x1.h hVar2 = (x1.h) bVar2;
                            if (context3 != null) {
                                int i16 = hVar2.f14335c;
                                TextClassification textClassification = hVar2.f14334b;
                                if (i16 >= 0) {
                                    actions = textClassification.getActions();
                                    RemoteAction d10 = qj.a.d(actions.get(i16));
                                    if (i16 == 0) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    y2.b bVar4 = new y2.b(4, d10);
                                    if (!z18) {
                                        shouldShowIcon = d10.shouldShowIcon();
                                        if (!shouldShowIcon) {
                                            cVar = null;
                                            g1.e.b(eVar8, bVar4, cVar, new kf.s0(27, d10), 6);
                                        }
                                    }
                                    cVar = new v2.c(-1261173016, true, new z1.j(2, d10));
                                    g1.e.b(eVar8, bVar4, cVar, new kf.s0(27, d10), 6);
                                } else {
                                    y2.b bVar5 = new y2.b(3, textClassification);
                                    icon = textClassification.getIcon();
                                    if (icon != null) {
                                        cVar2 = new v2.c(-1123224187, true, new z1.j(1, icon));
                                    } else {
                                        cVar2 = null;
                                    }
                                    g1.e.b(eVar8, bVar5, cVar2, new q1.e(19, context3, textClassification), 6);
                                }
                            }
                        }
                    } else if (bVar2 instanceof x1.f) {
                        eVar8.f5019a.add(g1.b.f5013b);
                    }
                    i15++;
                    i10 = 2;
                    i11 = 0;
                }
                return obj3;
        }
    }

    public /* synthetic */ c0(h1.j jVar, f3 f3Var, zc.y0 y0Var, n2 n2Var) {
        this.A = 6;
        this.B = jVar;
        this.L = y0Var;
        this.R = n2Var;
    }

    public /* synthetic */ c0(Object obj, Object obj2, Object obj3, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    public /* synthetic */ c0(nc.q qVar, l2 l2Var, nc.q qVar2, h1.l lVar) {
        this.A = 7;
        this.B = qVar;
        this.L = l2Var;
        this.R = qVar2;
    }
}
