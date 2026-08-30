package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import defpackage.im5;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gi3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gi3 implements mi2 {
    public final /* synthetic */ int A;

    public /* synthetic */ gi3(int i, jk3 jk3Var) {
        this.A = 4;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        String l0;
        im5.a aVar;
        ContextWrapper contextWrapper;
        int i = this.A;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                List list = (List) obj;
                return new ki3(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 1:
                ((Integer) obj).getClass();
                yh3 yh3Var = mi3.a;
                return pp1.A;
            case 2:
                ((Integer) obj).getClass();
                yh3 yh3Var2 = mi3.a;
                return -1;
            case 3:
                List list2 = (List) obj;
                return new pk3(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 4:
                ys4 ys4Var = (ys4) obj;
                return o27Var;
            case 5:
                oq6 oq6Var = (oq6) obj;
                return o27Var;
            case ig7.b /* 6 */:
                List list3 = (List) obj;
                return o27Var;
            case 7:
                gx2 gx2Var = (gx2) obj;
                return o27Var;
            case 8:
                uo3 uo3Var = (uo3) obj;
                uo3Var.getClass();
                io2 io2Var = uo3Var.l;
                if (!(io2Var instanceof uo3)) {
                    return null;
                }
                return (uo3) io2Var;
            case 9:
                uo3 uo3Var2 = (uo3) obj;
                uo3Var2.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append(uo3Var2.j);
                sb.append('=');
                sb.append(uo3Var2.k);
                return sb.toString();
            case 10:
                iq2.g(16);
                String num = Integer.toString(((e17) obj).A & 255, 16);
                num.getClass();
                return zg6.H0(2, num);
            case 11:
                ((Long) obj).getClass();
                return o27Var;
            case mj2.L /* 12 */:
                jw3 jw3Var = (jw3) obj;
                jw3Var.getClass();
                String str = jw3Var.a;
                String str2 = jw3Var.b;
                Set set = lw3.a;
                str.getClass();
                str2.getClass();
                if (lw3.a.contains(str)) {
                    l0 = "<redacted>";
                } else {
                    l0 = gh6.l0(gh6.l0(str2, "\r", "\\r"), "\n", "\\n");
                    if (l0.length() > 200) {
                        l0 = zg6.Y0(200, l0) + "…(len=" + l0.length() + ")";
                    }
                }
                return wh1.l(str, "=", l0);
            case 13:
                md3 md3Var = (md3) obj;
                md3Var.getClass();
                try {
                    return new pd3(md3Var.k(), md3Var.m(), md3Var.q(), md3Var.o(), md3Var.r(), md3Var.n(), jy3.d(md3Var.p()), jy3.d(md3Var.l()));
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            case 14:
                yl5 yl5Var = (yl5) obj;
                yl5Var.getClass();
                String p = yl5Var.p();
                String m = yl5Var.m();
                String n = yl5Var.n();
                String s = yl5Var.s();
                String q = yl5Var.q();
                cs5 m2 = yl5Var.l().m();
                is5 n2 = yl5Var.l().n();
                String k = yl5Var.l().k();
                yi5 l = yl5Var.l();
                if (l.l()) {
                    aVar = im5.a.GbaRom;
                } else {
                    aVar = im5.a.None;
                }
                return new zl5(p, m, n, s, q, new zi5(m2, n2, k, new im5(aVar, l.i(), l.j())), yl5Var.o(), yl5Var.t(), yl5Var.r());
            case ig7.e /* 15 */:
                c73 c73Var = (c73) obj;
                c73Var.getClass();
                c73Var.a = false;
                return o27Var;
            case 16:
                xl5 xl5Var = (xl5) obj;
                xl5Var.getClass();
                if (xl5Var.c()) {
                    return xl5.a(xl5Var, xi5.a(xl5Var.b(), cs5.DSi));
                }
                return xl5Var;
            case 17:
                c73 c73Var2 = (c73) obj;
                c73Var2.getClass();
                c73Var2.a = false;
                return o27Var;
            case 18:
                wi4 wi4Var = (wi4) obj;
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(wi4Var.b);
                sb2.append(", ");
                return ej6.g(sb2, wi4Var.c, ')');
            case 19:
                z31 z31Var = (z31) obj;
                z31Var.getClass();
                return new m34(st5.a(z31Var));
            case 20:
                return new ty(st5.a((z31) obj));
            case 21:
                Context context = (Context) obj;
                context.getClass();
                if (!(context instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) context).getBaseContext();
            case 22:
                b44 b44Var = (b44) obj;
                b44Var.getClass();
                g44 g44Var = b44Var.L;
                if (g44Var == null || g44Var.Y.c != b44Var.B.a) {
                    return null;
                }
                return g44Var;
            case 23:
                b44 b44Var2 = (b44) obj;
                b44Var2.getClass();
                g44 g44Var2 = b44Var2.L;
                if (g44Var2 == null || g44Var2.Y.c != b44Var2.B.a) {
                    return null;
                }
                return g44Var2;
            case 24:
                b44 b44Var3 = (b44) obj;
                b44Var3.getClass();
                return Integer.valueOf(b44Var3.B.a);
            case 25:
                ((z31) obj).getClass();
                return new t34();
            case 26:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    contextWrapper = (ContextWrapper) context2;
                } else {
                    contextWrapper = null;
                }
                if (contextWrapper == null) {
                    return null;
                }
                return contextWrapper.getBaseContext();
            case 27:
                Context context3 = (Context) obj;
                context3.getClass();
                if (!(context3 instanceof Activity)) {
                    return null;
                }
                return (Activity) context3;
            case 28:
                b44 b44Var4 = (b44) obj;
                b44Var4.getClass();
                return b44Var4.L;
            default:
                b44 b44Var5 = (b44) obj;
                b44Var5.getClass();
                if (!(b44Var5 instanceof g44)) {
                    return null;
                }
                vh0 vh0Var = ((g44) b44Var5).Y;
                return vh0Var.j(vh0Var.c);
        }
    }

    public /* synthetic */ gi3(int i) {
        this.A = i;
    }
}
