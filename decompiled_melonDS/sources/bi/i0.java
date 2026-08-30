package bi;

import ah.n0;
import android.content.SharedPreferences;
import androidx.lifecycle.s0;
import androidx.lifecycle.y0;
import cd.e1;
import cd.q1;
import cd.u0;
import cd.z0;
import java.util.Locale;
import kf.d2;
import kf.g1;
import kf.l0;
import kf.y1;
import oe.p0;
import oe.q0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 extends y0 {

    /* renamed from: b  reason: collision with root package name */
    public final cf.c f2285b;

    /* renamed from: c  reason: collision with root package name */
    public final cf.d f2286c;

    /* renamed from: d  reason: collision with root package name */
    public final g1 f2287d;

    /* renamed from: e  reason: collision with root package name */
    public final sd.i f2288e;

    /* renamed from: f  reason: collision with root package name */
    public final sd.d f2289f;

    /* renamed from: g  reason: collision with root package name */
    public final q1 f2290g;

    /* renamed from: h  reason: collision with root package name */
    public final q1 f2291h;

    /* renamed from: i  reason: collision with root package name */
    public final q1 f2292i;

    /* renamed from: j  reason: collision with root package name */
    public final e1 f2293j;

    /* renamed from: k  reason: collision with root package name */
    public final e1 f2294k;

    /* renamed from: l  reason: collision with root package name */
    public final e1 f2295l;
    public final e1 m;

    /* renamed from: n  reason: collision with root package name */
    public final q1 f2296n;

    /* renamed from: o  reason: collision with root package name */
    public final cd.y0 f2297o;

    /* renamed from: p  reason: collision with root package name */
    public final cd.x f2298p;

    /* renamed from: q  reason: collision with root package name */
    public final cd.y0 f2299q;

    public i0(cf.c cVar, cf.d dVar, g1 g1Var, sd.i iVar, sd.d dVar2) {
        q0 valueOf;
        cVar.getClass();
        dVar.getClass();
        g1Var.getClass();
        iVar.getClass();
        dVar2.getClass();
        this.f2285b = cVar;
        this.f2286c = dVar;
        this.f2287d = g1Var;
        this.f2288e = iVar;
        this.f2289f = dVar2;
        q1 c4 = cd.q.c("");
        this.f2290g = c4;
        d2 d2Var = (d2) dVar;
        SharedPreferences sharedPreferences = d2Var.f8181b;
        String string = sharedPreferences.getString("rom_sorting_mode", "alphabetically");
        string.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = string.toUpperCase(locale);
        upperCase.getClass();
        q1 c10 = cd.q.c(p0.valueOf(upperCase));
        this.f2291h = c10;
        String string2 = sharedPreferences.getString("rom_sorting_order", null);
        if (string2 == null) {
            String string3 = sharedPreferences.getString("rom_sorting_mode", "alphabetically");
            string3.getClass();
            String upperCase2 = string3.toUpperCase(locale);
            upperCase2.getClass();
            valueOf = p0.valueOf(upperCase2).getDefaultOrder();
        } else {
            String upperCase3 = string2.toUpperCase(locale);
            upperCase3.getClass();
            valueOf = q0.valueOf(upperCase3);
        }
        q1 c11 = cd.q.c(valueOf);
        this.f2292i = c11;
        e1 b10 = cd.q.b(1, 0, bd.a.DROP_OLDEST, 2);
        this.f2293j = b10;
        this.f2294k = b10;
        e1 b11 = aj.g.b();
        this.f2295l = b11;
        this.m = b11;
        q1 c12 = cd.q.c(null);
        this.f2296n = c12;
        this.f2297o = new cd.y0(c12);
        this.f2298p = d2Var.b("rom_icon_filtering", new y1(d2Var, 3));
        l0 l0Var = (l0) cVar;
        this.f2299q = new cd.y0(l0Var.f8251h);
        zc.x.v(s0.h(this), null, null, new a9.b(2, null, this), 3);
        cd.q.v(new u0(new z0(new di.b(23, (cc.c) null, l0Var)), c4, new n0(this, (cc.c) null)), s0.h(this));
        cd.q.v(new u0(c10, c11, new g0(0, null, this)), s0.h(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(ze.a r7, ec.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof bi.h0
            if (r0 == 0) goto L13
            r0 = r8
            bi.h0 r0 = (bi.h0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            bi.h0 r0 = new bi.h0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            p7.j.I(r8)
            goto L4a
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            return r3
        L2e:
            p7.j.I(r8)
            r0.Y = r4
            kf.g1 r8 = r6.f2287d
            r8.getClass()
            gd.f r2 = zc.g0.f15015a
            gd.e r2 = gd.e.L
            ah.u0 r4 = new ah.u0
            r5 = 8
            r4.<init>(r7, r8, r3, r5)
            java.lang.Object r8 = zc.x.F(r2, r4, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            cf.d r7 = r6.f2286c
            kf.d2 r7 = (kf.d2) r7
            oe.d0 r7 = r7.c()
            bi.g r0 = new bi.g
            r0.<init>(r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.i0.e(ze.a, ec.c):java.lang.Object");
    }

    public final void f(p0 p0Var) {
        p0Var.getClass();
        q1 q1Var = this.f2291h;
        Object value = q1Var.getValue();
        cf.d dVar = this.f2286c;
        q1 q1Var2 = this.f2292i;
        if (p0Var == value) {
            Object value2 = q1Var2.getValue();
            q0 q0Var = q0.ASCENDING;
            if (value2 == q0Var) {
                q0Var = q0.DESCENDING;
            }
            q0 q0Var2 = (q0) q1Var2.getValue();
            d2 d2Var = (d2) dVar;
            d2Var.getClass();
            q0Var2.getClass();
            SharedPreferences.Editor edit = d2Var.f8181b.edit();
            String lowerCase = q0Var2.toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            edit.putString("rom_sorting_order", lowerCase);
            edit.apply();
            q1Var2.j(q0Var);
            return;
        }
        d2 d2Var2 = (d2) dVar;
        d2Var2.getClass();
        SharedPreferences.Editor edit2 = d2Var2.f8181b.edit();
        String obj = p0Var.toString();
        Locale locale = Locale.ROOT;
        String lowerCase2 = obj.toLowerCase(locale);
        lowerCase2.getClass();
        edit2.putString("rom_sorting_mode", lowerCase2);
        edit2.apply();
        q0 defaultOrder = p0Var.getDefaultOrder();
        d2Var2.getClass();
        defaultOrder.getClass();
        SharedPreferences.Editor edit3 = d2Var2.f8181b.edit();
        String lowerCase3 = defaultOrder.toString().toLowerCase(locale);
        lowerCase3.getClass();
        edit3.putString("rom_sorting_order", lowerCase3);
        edit3.apply();
        q1Var.k(null, p0Var);
        q1Var2.j(p0Var.getDefaultOrder());
    }
}
