package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import java.text.Normalizer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yo5  reason: default package */
/* loaded from: classes.dex */
public final class yo5 extends ra7 {
    public static final h85 I = new h85("[^\\p{ASCII}]");
    public final ee6 A;
    public final ee6 B;
    public final ee6 C;
    public final ee6 D;
    public final ee6 E;
    public final q45 F;
    public final ee6 G;
    public final LinkedHashSet H;
    public final vp5 b;
    public final w16 c;
    public final vm5 d;
    public final y37 e;
    public final uf1 f;
    public final qf g;
    public final a50 h;
    public final ee6 i;
    public final ee6 j;
    public final q45 k;
    public final LinkedHashSet l;
    public final wz5 m;
    public final ee6 n;
    public final ee6 o;
    public final ee6 p;
    public final q45 q;
    public final q45 r;
    public final q45 s;
    public final c46 t;
    public final c46 u;
    public final c46 v;
    public final c46 w;
    public final c46 x;
    public final c46 y;
    public final q45 z;

    /* JADX WARN: Type inference failed for: r2v11, types: [vz5, wz5] */
    public yo5(vp5 vp5Var, w16 w16Var, vm5 vm5Var, y37 y37Var, uf1 uf1Var, qf qfVar, ud5 ud5Var, a50 a50Var) {
        Object kc5Var;
        rb6 rb6Var;
        vp5Var.getClass();
        w16Var.getClass();
        vm5Var.getClass();
        y37Var.getClass();
        uf1Var.getClass();
        qfVar.getClass();
        ud5Var.getClass();
        a50Var.getClass();
        this.b = vp5Var;
        this.c = w16Var;
        this.d = vm5Var;
        this.e = y37Var;
        this.f = uf1Var;
        this.g = qfVar;
        this.h = a50Var;
        this.i = fe6.a("");
        qp1 qp1Var = qp1.A;
        ee6 a = fe6.a(qp1Var);
        this.j = a;
        this.k = new q45(a);
        this.l = new LinkedHashSet();
        int i = xz5.a;
        this.m = new vz5(4);
        b56 b56Var = (b56) w16Var;
        this.n = fe6.a(b56Var.s());
        String string = b56Var.b.getString("rom_sorting_order", null);
        if (string == null) {
            rb6Var = b56Var.s().getDefaultOrder();
        } else {
            try {
                String upperCase = string.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                kc5Var = rb6.valueOf(upperCase);
            } catch (Throwable th) {
                kc5Var = new kc5(th);
            }
            rb6Var = (rb6) (kc5Var instanceof kc5 ? b56Var.s().getDefaultOrder() : kc5Var);
        }
        ee6 a2 = fe6.a(rb6Var);
        this.o = a2;
        bm5 bm5Var = bm5.ALL;
        this.p = fe6.a(bm5Var);
        b56 b56Var2 = (b56) this.c;
        b56Var2.getClass();
        ln0 p = b56Var2.p("rom_view_mode", new h46(b56Var2, 23));
        np0 a3 = ua7.a(this);
        tp5 t = ((b56) this.c).t();
        jo1 jo1Var = q56.a;
        this.q = se.V(p, a3, jo1Var, t);
        bd5 bd5Var = ((dl) ud5Var).b.a;
        this.r = se.V(new a7(bd5Var.A(), 14), ua7.a(this), jo1Var, up1.A);
        a7 a7Var = new a7(bd5Var.B(), 2);
        b56 b56Var3 = (b56) this.c;
        b56Var3.getClass();
        this.s = se.V(new gb2(a7Var, b56Var3.p("rom_ra_covers_enabled", new h46(b56Var3, 26)), new rs(3, 2, null)), ua7.a(this), jo1Var, qp1Var);
        c46 b = d46.b(1, 0, h60.DROP_OLDEST, 2);
        this.t = b;
        this.u = b;
        c46 f = ln2.f();
        this.v = f;
        this.w = f;
        c46 f2 = ln2.f();
        this.x = f2;
        this.y = f2;
        b56 b56Var4 = (b56) this.c;
        b56Var4.getClass();
        b56Var4.p("rom_icon_filtering", new h46(b56Var4, 25));
        this.z = new q45(((d72) this.b).l);
        pp1 pp1Var = pp1.A;
        ee6 a4 = fe6.a(pp1Var);
        this.A = a4;
        ee6 a5 = fe6.a(pp1Var);
        this.B = a5;
        this.C = fe6.a(pp1Var);
        this.D = fe6.a(l07.b0(lo5.a));
        ee6 a6 = fe6.a(new ri5(pp1Var, pp1Var, false, false, true, tp5.GRID, bm5Var, qb6.ALPHABETICALLY, rb6.ASCENDING, pp1Var, qp1Var));
        this.E = a6;
        this.F = new q45(a6);
        this.G = fe6.a(pp1Var);
        this.H = new LinkedHashSet();
        tq5.w(ua7.a(this), null, null, new v74(this, (j11) null, 14), 3);
        tq5.w(ua7.a(this), null, null, new v74(this, (j11) null, 13), 3);
        tq5.w(ua7.a(this), null, null, new io5(this, null, 0), 3);
        tq5.w(ua7.a(this), null, null, new wx1(se.q(new ln0(5, new u92[]{a4, a5, this.n, a2}, new wo5(null, this))), se.q(se.o(this.i, 200L)), this, (j11) null, 27), 3);
        tq5.w(ua7.a(this), null, null, new io5(this, null, 1), 3);
    }

    public static final po5 e(yo5 yo5Var, rg5 rg5Var, String str) {
        String str2 = rg5Var.f.e;
        if (str2 == null) {
            str2 = rg5Var.a;
        }
        String R = cg2.R(str2);
        String R2 = cg2.R(rg5Var.c);
        String R3 = cg2.R(rg5Var.b);
        return new po5(rg5Var, str, R + "\u0000" + R2 + "\u0000" + R3);
    }

    public static final Map f(yo5 yo5Var, List list, qb6 qb6Var) {
        if (qb6Var != qb6.ALPHABETICALLY) {
            return qp1.A;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            Character ch = null;
            if (i >= 0) {
                lh5 lh5Var = (lh5) obj;
                if (lh5Var instanceof kh5) {
                    rg5 rg5Var = ((kh5) lh5Var).a;
                    String str = rg5Var.f.e;
                    if (str == null) {
                        str = rg5Var.a;
                    }
                    String normalize = Normalizer.normalize(zg6.Z0(str).toString(), Normalizer.Form.NFKD);
                    normalize.getClass();
                    Pattern compile = Pattern.compile("\\p{Mn}+");
                    compile.getClass();
                    String replaceAll = compile.matcher(normalize).replaceAll("");
                    replaceAll.getClass();
                    if (replaceAll.length() != 0) {
                        ch = Character.valueOf(replaceAll.charAt(0));
                    }
                    if (ch != null) {
                        char charValue = ch.charValue();
                        if ('a' <= charValue && charValue < '{') {
                            charValue = (char) (charValue - ' ');
                        } else if ('A' > charValue || charValue >= '[') {
                            charValue = Character.toUpperCase(charValue);
                        }
                        if (('A' > charValue || charValue >= '[') && !Character.isLetter(charValue)) {
                            charValue = '#';
                        }
                        linkedHashMap.putIfAbsent(Character.valueOf(charValue), Integer.valueOf(i));
                    }
                }
                i = i2;
            } else {
                l07.v0();
                throw null;
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean g(defpackage.yo5 r3, defpackage.rg5 r4, defpackage.bm5 r5) {
        /*
            boolean r3 = r4.h
            int[] r0 = defpackage.ro5.b
            int r5 = r5.ordinal()
            r5 = r0[r5]
            r0 = 1
            if (r5 == r0) goto L2f
            r1 = 2
            if (r5 == r1) goto L2c
            r1 = 3
            r2 = 0
            if (r5 == r1) goto L28
            r1 = 4
            if (r5 == r1) goto L27
            r3 = 5
            if (r5 != r3) goto L23
            java.lang.String r3 = r4.i
            int r3 = r3.length()
            if (r3 <= 0) goto L2b
            goto L2f
        L23:
            defpackage.i.c()
            return r2
        L27:
            return r3
        L28:
            if (r3 != 0) goto L2b
            goto L2f
        L2b:
            return r2
        L2c:
            boolean r3 = r4.k
            return r3
        L2f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo5.g(yo5, rg5, bm5):boolean");
    }

    public static final rg5 h(yo5 yo5Var, DSiWareTitle dSiWareTitle) {
        iq2.g(16);
        String l = Long.toString(dSiWareTitle.getTitleId() & 4294967295L, 16);
        l.getClass();
        String H0 = zg6.H0(8, l);
        String name = dSiWareTitle.getName();
        String producer = dSiWareTitle.getProducer();
        String str = H0 + ".app";
        iq2.g(16);
        String l2 = Long.toString(dSiWareTitle.getTitleId() & 4294967295L, 16);
        l2.getClass();
        Uri parse = Uri.parse("dsiware-installed://00030004/" + zg6.H0(8, l2));
        parse.getClass();
        return new rg5(name, producer, str, parse, null, new ti5(cs5.DSi, is5.DEFAULT, (UUID) null, (me2) fm5.d, (String) null, false, ym5.GLOBAL, (m11) null, (VideoRenderer) null, (Boolean) null, (Integer) null, (VideoFiltering) null, (String) null, (String) null, (Boolean) null), null, true, "", 0L, false, Long.valueOf(dSiWareTitle.getTitleId() & 4294967295L), dSiWareTitle.getIcon(), 1536);
    }

    public static String i(qo5 qo5Var, String str) {
        String str2 = qo5Var.b;
        String decode = Uri.decode(zg6.S0(':', str2, str2));
        decode.getClass();
        String decode2 = Uri.decode(zg6.S0(':', str, str));
        decode2.getClass();
        if (!str.equals(str2) && decode.length() > 0 && gh6.n0(decode2, decode.concat("/"), false)) {
            return zg6.J0(decode2, decode.concat("/"));
        }
        return decode2;
    }

    public static String k(String str) {
        String decode = Uri.decode(zg6.S0(':', str, str));
        decode.getClass();
        String U0 = zg6.U0('/', decode, decode);
        if (U0.length() == 0) {
            if (decode.length() == 0) {
                return str;
            }
            return decode;
        }
        return U0;
    }

    public static qo5 l(String str, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o(str, ((qo5) obj).b)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (qo5) obj;
    }

    public static String m(String str, String str2) {
        if (b53.x(str, str2)) {
            return null;
        }
        int D0 = zg6.D0('/', 0, 6, str);
        if (D0 != -1) {
            String substring = str.substring(0, D0);
            if (substring.length() >= str2.length()) {
                return substring;
            }
        }
        return str2;
    }

    public static boolean o(String str, String str2) {
        if (!b53.x(str, str2) && !gh6.n0(str, str2.concat("/"), false)) {
            return false;
        }
        return true;
    }

    public final void j(boolean z) {
        int length;
        bm5[] values = bm5.values();
        ee6 ee6Var = this.p;
        int w0 = nu.w0(values, ee6Var.getValue());
        if (w0 < 0) {
            w0 = 0;
        }
        if (z) {
            length = w0 + 1;
        } else {
            length = (w0 - 1) + values.length;
        }
        ee6Var.k(values[length % values.length]);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.rg5 r7, defpackage.k11 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.uo5
            if (r0 == 0) goto L13
            r0 = r8
            uo5 r0 = (defpackage.uo5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            uo5 r0 = new uo5
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.me2.a0(r8)
            goto L4a
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L2e:
            defpackage.me2.a0(r8)
            r0.Y = r4
            vm5 r8 = r6.d
            r8.getClass()
            bb1 r2 = defpackage.tg1.a
            ha1 r2 = defpackage.ha1.L
            n5 r4 = new n5
            r5 = 27
            r4.<init>(r7, r8, r3, r5)
            java.lang.Object r8 = defpackage.tq5.G(r2, r4, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            w16 r6 = r6.c
            b56 r6 = (defpackage.b56) r6
            um5 r6 = r6.q()
            tm5 r7 = new tm5
            r7.<init>(r8, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo5.n(rg5, k11):java.lang.Object");
    }

    public final void p(qb6 qb6Var) {
        qb6Var.getClass();
        ee6 ee6Var = this.n;
        Object value = ee6Var.getValue();
        w16 w16Var = this.c;
        ee6 ee6Var2 = this.o;
        if (qb6Var == value) {
            Object value2 = ee6Var2.getValue();
            rb6 rb6Var = rb6.ASCENDING;
            if (value2 == rb6Var) {
                rb6Var = rb6.DESCENDING;
            }
            rb6 rb6Var2 = (rb6) ee6Var2.getValue();
            b56 b56Var = (b56) w16Var;
            b56Var.getClass();
            rb6Var2.getClass();
            SharedPreferences.Editor edit = b56Var.b.edit();
            String lowerCase = rb6Var2.toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            edit.putString("rom_sorting_order", lowerCase);
            edit.apply();
            ee6Var2.k(rb6Var);
            return;
        }
        b56 b56Var2 = (b56) w16Var;
        b56Var2.getClass();
        SharedPreferences.Editor edit2 = b56Var2.b.edit();
        String obj = qb6Var.toString();
        Locale locale = Locale.ROOT;
        String lowerCase2 = obj.toLowerCase(locale);
        lowerCase2.getClass();
        edit2.putString("rom_sorting_mode", lowerCase2);
        edit2.apply();
        rb6 defaultOrder = qb6Var.getDefaultOrder();
        b56Var2.getClass();
        defaultOrder.getClass();
        SharedPreferences.Editor edit3 = b56Var2.b.edit();
        String lowerCase3 = defaultOrder.toString().toLowerCase(locale);
        lowerCase3.getClass();
        edit3.putString("rom_sorting_order", lowerCase3);
        edit3.apply();
        ee6Var.l(null, qb6Var);
        ee6Var2.k(qb6Var.getDefaultOrder());
    }

    public final void q() {
        tp5 tp5Var;
        int i = ro5.a[((tp5) this.q.A.getValue()).ordinal()];
        if (i != 1) {
            if (i == 2) {
                tp5Var = tp5.GRID;
            } else {
                i.c();
                return;
            }
        } else {
            tp5Var = tp5.LIST;
        }
        b56 b56Var = (b56) this.c;
        b56Var.getClass();
        tp5Var.getClass();
        SharedPreferences.Editor edit = b56Var.b.edit();
        String lowerCase = tp5Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        edit.putString("rom_view_mode", lowerCase);
        edit.apply();
    }
}
