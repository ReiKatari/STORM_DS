package defpackage;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tz5  reason: default package */
/* loaded from: classes.dex */
public final class tz5 extends qo7 {
    public static final xh5 L = new xh5("[^\\p{ASCII}]");
    public final of6 A;
    public final of6 B;
    public final de5 C;
    public final tp6 D;
    public final tp6 E;
    public final tp6 F;
    public final tp6 G;
    public final tp6 H;
    public final de5 I;
    public final tp6 J;
    public final ConcurrentHashMap.KeySetView K;
    public final p06 b;
    public final kd6 c;
    public final kx5 d;
    public final wh7 e;
    public final yj1 f;
    public final fg g;
    public final pn5 h;
    public final e70 i;
    public final db1 j;
    public final tp6 k;
    public final tp6 l;
    public final de5 m;
    public final LinkedHashSet n;
    public final lb6 o;
    public final tp6 p;
    public final tp6 q;
    public final tp6 r;
    public final de5 s;
    public final de5 t;
    public final tp6 u;
    public final de5 v;
    public final de5 w;
    public final of6 x;
    public final of6 y;
    public final of6 z;

    /* JADX WARN: Type inference failed for: r2v13, types: [lb6, kb6] */
    public tz5(p06 p06Var, kd6 kd6Var, kx5 kx5Var, wh7 wh7Var, yj1 yj1Var, fg fgVar, pn5 pn5Var, e70 e70Var, db1 db1Var) {
        Object em5Var;
        hn6 hn6Var;
        p06Var.getClass();
        kd6Var.getClass();
        kx5Var.getClass();
        wh7Var.getClass();
        yj1Var.getClass();
        fgVar.getClass();
        pn5Var.getClass();
        e70Var.getClass();
        db1Var.getClass();
        this.b = p06Var;
        this.c = kd6Var;
        this.d = kx5Var;
        this.e = wh7Var;
        this.f = yj1Var;
        this.g = fgVar;
        this.h = pn5Var;
        this.i = e70Var;
        this.j = db1Var;
        this.k = up6.a("");
        zt1 zt1Var = zt1.A;
        tp6 a = up6.a(zt1Var);
        this.l = a;
        this.m = new de5(a);
        this.n = new LinkedHashSet();
        int i = mb6.a;
        this.o = new kb6(4);
        ng6 ng6Var = (ng6) kd6Var;
        this.p = up6.a(ng6Var.s());
        String string = ng6Var.b.getString("rom_sorting_order", null);
        if (string == null) {
            hn6Var = ng6Var.s().getDefaultOrder();
        } else {
            try {
                String upperCase = string.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                em5Var = hn6.valueOf(upperCase);
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            hn6Var = (hn6) (em5Var instanceof em5 ? ng6Var.s().getDefaultOrder() : em5Var);
        }
        tp6 a2 = up6.a(hn6Var);
        this.q = a2;
        qw5 qw5Var = qw5.ALL;
        this.r = up6.a(qw5Var);
        ng6 ng6Var2 = (ng6) this.c;
        ng6Var2.getClass();
        wp0 p = ng6Var2.p("rom_view_mode", new tf6(ng6Var2, 23));
        as0 a3 = to7.a(this);
        n06 t = ((ng6) this.c).t();
        w31 w31Var = dh6.a;
        this.s = f04.R(p, a3, w31Var, t);
        this.t = f04.R(new b7(((pl) this.h).b.a.A(), 14), to7.a(this), w31Var, du1.A);
        tp6 a4 = up6.a(Boolean.FALSE);
        this.u = a4;
        this.v = new de5(a4);
        hv.L(to7.a(this), null, null, new pz5(this, null, 0), 3);
        b7 b7Var = new b7(((pl) this.h).b.a.B(), 2);
        ng6 ng6Var3 = (ng6) this.c;
        ng6Var3.getClass();
        this.w = f04.R(new xf2(b7Var, ng6Var3.p("rom_ra_covers_enabled", new tf6(ng6Var3, 26)), new et(3, null, 2)), to7.a(this), w31Var, zt1Var);
        of6 b = pf6.b(1, 0, m80.DROP_OLDEST, 2);
        this.x = b;
        this.y = b;
        of6 a5 = bl2.a();
        this.z = a5;
        this.A = a5;
        this.B = bl2.a();
        ng6 ng6Var4 = (ng6) this.c;
        ng6Var4.getClass();
        ng6Var4.p("rom_icon_filtering", new tf6(ng6Var4, 25));
        this.C = new de5(((xb2) this.b).l);
        yt1 yt1Var = yt1.A;
        tp6 a6 = up6.a(yt1Var);
        this.D = a6;
        tp6 a7 = up6.a(yt1Var);
        this.E = a7;
        this.F = up6.a(yt1Var);
        this.G = up6.a(hf.b0(gz5.a));
        tp6 a8 = up6.a(new ss5(yt1Var, yt1Var, false, false, true, n06.GRID, qw5Var, gn6.ALPHABETICALLY, hn6.ASCENDING, yt1Var, zt1Var));
        this.H = a8;
        this.I = new de5(a8);
        this.J = up6.a(yt1Var);
        new LinkedHashSet();
        p();
        hv.L(to7.a(this), null, null, new bf4(this, null, 14), 3);
        hv.L(to7.a(this), null, null, new dz5(this, null, 0), 3);
        hv.L(to7.a(this), null, null, new vy5(f04.z(new wp0(5, new le2[]{a6, a7, this.p, a2}, new rz5(null, this))), f04.z(f04.x(this.k, 200L)), this, null, 1), 3);
        hv.L(to7.a(this), null, null, new dz5(this, null, 1), 3);
        this.K = ConcurrentHashMap.newKeySet();
    }

    public static final kz5 e(tz5 tz5Var, pq5 pq5Var, String str) {
        String M = ej2.M(hf.k0(pq5Var));
        String M2 = ej2.M(pq5Var.a);
        String M3 = ej2.M(pq5Var.c);
        String M4 = ej2.M(pq5Var.b);
        StringBuilder sb = new StringBuilder();
        sb.append(M);
        sb.append("\u0000");
        sb.append(M2);
        sb.append("\u0000");
        sb.append(M3);
        return new kz5(pq5Var, str, i61.n(sb, "\u0000", M4));
    }

    public static final Map f(tz5 tz5Var, ArrayList arrayList, gn6 gn6Var) {
        if (gn6Var != gn6.ALPHABETICALLY) {
            return zt1.A;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            Character ch = null;
            if (i >= 0) {
                nr5 nr5Var = (nr5) obj;
                if (nr5Var instanceof mr5) {
                    String normalize = Normalizer.normalize(qs6.T0(hf.k0(((mr5) nr5Var).a)).toString(), Normalizer.Form.NFKD);
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
                i = i3;
            } else {
                hf.q0();
                throw null;
            }
        }
        return linkedHashMap;
    }

    public static final boolean g(tz5 tz5Var, pq5 pq5Var, qw5 qw5Var) {
        if (!pq5Var.h || pq5Var.c()) {
            int i = mz5.b[qw5Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (pq5Var.i.length() > 0) {
                                }
                            } else {
                                i.d();
                                return false;
                            }
                        } else {
                            return pq5Var.c();
                        }
                    } else if (!pq5Var.c()) {
                    }
                } else {
                    return pq5Var.k;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final pq5 h(tz5 tz5Var, DSiWareTitle dSiWareTitle) {
        String str;
        String A;
        String str2;
        String string;
        int titleId;
        int titleId2;
        int titleId3;
        int titleId4;
        String str3 = "";
        g04.y(16);
        String l = Long.toString(dSiWareTitle.getTitleId() & 4294967295L, 16);
        l.getClass();
        String lowerCase = qs6.B0(8, l).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        try {
            titleId = (int) ((dSiWareTitle.getTitleId() >> 24) & 255);
            titleId2 = (int) ((dSiWareTitle.getTitleId() >> 16) & 255);
            titleId3 = (int) ((dSiWareTitle.getTitleId() >> 8) & 255);
            titleId4 = (int) (255 & dSiWareTitle.getTitleId());
        } catch (Throwable unused) {
        }
        if (32 <= titleId && titleId < 127 && 32 <= titleId2 && titleId2 < 127 && 32 <= titleId3 && titleId3 < 127 && 32 <= titleId4 && titleId4 < 127) {
            char c = (char) titleId3;
            StringBuilder sb = new StringBuilder();
            sb.append((char) titleId);
            sb.append((char) titleId2);
            sb.append(c);
            sb.append((char) titleId4);
            str = sb.toString();
            if (qs6.v0(dSiWareTitle.getName()) && !xs6.Z(dSiWareTitle.getName(), lowerCase, true)) {
                A = dSiWareTitle.getName();
            } else if (str.length() <= 0) {
                A = lb1.A("DSiWare (", str, ")");
            } else {
                A = lb1.A("DSiWare (", lowerCase, ")");
            }
            String str4 = A;
            db1 db1Var = tz5Var.j;
            db1Var.getClass();
            SharedPreferences c2 = db1Var.c();
            String lowerCase2 = lowerCase.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            str2 = null;
            string = c2.getString("ra_hash_".concat(lowerCase2), null);
            if (string != null && !qs6.v0(string)) {
                str2 = string;
            }
            if (str2 != null) {
                str3 = str2;
            }
            String producer = dSiWareTitle.getProducer();
            String str5 = str4 + ".nds";
            g04.y(16);
            String l2 = Long.toString(dSiWareTitle.getTitleId() & 4294967295L, 16);
            l2.getClass();
            Uri parse = Uri.parse("dsiware-installed://00030004/" + qs6.B0(8, l2));
            parse.getClass();
            return new pq5(str4, producer, str5, parse, null, jt5.a(new jt5(u26.DSi, a36.DEFAULT, null, uw5.o, null, false, nx5.GLOBAL, null, null, null, null, null, null, null, null, null, null, null), null, null, null, null, str4, false, null, null, null, null, null, null, null, null, null, null, null, null, 262127), null, true, str3, 0L, false, Long.valueOf(4294967295L & dSiWareTitle.getTitleId()), dSiWareTitle.getIcon(), 1536);
        }
        str = "";
        if (qs6.v0(dSiWareTitle.getName())) {
        }
        if (str.length() <= 0) {
        }
        String str42 = A;
        db1 db1Var2 = tz5Var.j;
        db1Var2.getClass();
        SharedPreferences c22 = db1Var2.c();
        String lowerCase22 = lowerCase.toLowerCase(Locale.ROOT);
        lowerCase22.getClass();
        str2 = null;
        string = c22.getString("ra_hash_".concat(lowerCase22), null);
        if (string != null) {
            str2 = string;
        }
        if (str2 != null) {
        }
        String producer2 = dSiWareTitle.getProducer();
        String str52 = str42 + ".nds";
        g04.y(16);
        String l22 = Long.toString(dSiWareTitle.getTitleId() & 4294967295L, 16);
        l22.getClass();
        Uri parse2 = Uri.parse("dsiware-installed://00030004/" + qs6.B0(8, l22));
        parse2.getClass();
        return new pq5(str42, producer2, str52, parse2, null, jt5.a(new jt5(u26.DSi, a36.DEFAULT, null, uw5.o, null, false, nx5.GLOBAL, null, null, null, null, null, null, null, null, null, null, null), null, null, null, null, str42, false, null, null, null, null, null, null, null, null, null, null, null, null, 262127), null, true, str3, 0L, false, Long.valueOf(4294967295L & dSiWareTitle.getTitleId()), dSiWareTitle.getIcon(), 1536);
    }

    public static String i(lz5 lz5Var, String str) {
        String str2 = lz5Var.b;
        String decode = Uri.decode(qs6.M0(':', str2, str2));
        decode.getClass();
        String decode2 = Uri.decode(qs6.M0(':', str, str));
        decode2.getClass();
        if (!str.equals(str2) && decode.length() > 0 && xs6.g0(decode2, decode.concat("/"), false)) {
            return qs6.D0(decode2, decode.concat("/"));
        }
        return decode2;
    }

    public static String k(String str) {
        String decode = Uri.decode(qs6.M0(':', str, str));
        decode.getClass();
        String O0 = qs6.O0('/', decode, decode);
        if (O0.length() == 0) {
            if (decode.length() == 0) {
                return str;
            }
            return decode;
        }
        return O0;
    }

    public static lz5 l(String str, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o(str, ((lz5) obj).b)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (lz5) obj;
    }

    public static String m(String str, String str2) {
        if (nb3.k(str, str2)) {
            return null;
        }
        int x0 = qs6.x0('/', 0, 6, str);
        if (x0 != -1) {
            String substring = str.substring(0, x0);
            if (substring.length() >= str2.length()) {
                return substring;
            }
        }
        return str2;
    }

    public static boolean o(String str, String str2) {
        if (!nb3.k(str, str2)) {
            if (!xs6.g0(str, str2 + "/", false)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void j(boolean z) {
        int length;
        qw5[] values = qw5.values();
        tp6 tp6Var = this.r;
        int K0 = fv.K0(values, tp6Var.getValue());
        if (K0 < 0) {
            K0 = 0;
        }
        if (z) {
            length = K0 + 1;
        } else {
            length = (K0 - 1) + values.length;
        }
        tp6Var.l(values[length % values.length]);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(pq5 pq5Var, s41 s41Var) {
        oz5 oz5Var;
        int i;
        if (s41Var instanceof oz5) {
            oz5Var = (oz5) s41Var;
            int i2 = oz5Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oz5Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = oz5Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = oz5Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    oz5Var.Y = 1;
                    kx5 kx5Var = this.d;
                    kx5Var.getClass();
                    xe1 xe1Var = xk1.a;
                    obj = hv.d0(de1.L, new m5(pq5Var, kx5Var, (r41) null, 28), oz5Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return new ix5((Bitmap) obj, ((ng6) this.c).q());
            }
        }
        oz5Var = new oz5(this, s41Var);
        Object obj2 = oz5Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = oz5Var.Y;
        if (i == 0) {
        }
        return new ix5((Bitmap) obj2, ((ng6) this.c).q());
    }

    public final void p() {
        hv.L(to7.a(this), null, null, new pz5(this, null, 1), 3);
    }

    public final void q(gn6 gn6Var) {
        gn6Var.getClass();
        tp6 tp6Var = this.p;
        Object value = tp6Var.getValue();
        kd6 kd6Var = this.c;
        tp6 tp6Var2 = this.q;
        if (gn6Var == value) {
            Object value2 = tp6Var2.getValue();
            hn6 hn6Var = hn6.ASCENDING;
            if (value2 == hn6Var) {
                hn6Var = hn6.DESCENDING;
            }
            hn6 hn6Var2 = (hn6) tp6Var2.getValue();
            ng6 ng6Var = (ng6) kd6Var;
            ng6Var.getClass();
            hn6Var2.getClass();
            SharedPreferences.Editor edit = ng6Var.b.edit();
            String lowerCase = hn6Var2.toString().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            edit.putString("rom_sorting_order", lowerCase);
            edit.apply();
            tp6Var2.l(hn6Var);
            return;
        }
        ng6 ng6Var2 = (ng6) kd6Var;
        ng6Var2.getClass();
        SharedPreferences.Editor edit2 = ng6Var2.b.edit();
        String obj = gn6Var.toString();
        Locale locale = Locale.ROOT;
        String lowerCase2 = obj.toLowerCase(locale);
        lowerCase2.getClass();
        edit2.putString("rom_sorting_mode", lowerCase2);
        edit2.apply();
        hn6 defaultOrder = gn6Var.getDefaultOrder();
        ng6Var2.getClass();
        defaultOrder.getClass();
        SharedPreferences.Editor edit3 = ng6Var2.b.edit();
        String lowerCase3 = defaultOrder.toString().toLowerCase(locale);
        lowerCase3.getClass();
        edit3.putString("rom_sorting_order", lowerCase3);
        edit3.apply();
        tp6Var.m(null, gn6Var);
        tp6Var2.l(gn6Var.getDefaultOrder());
    }

    public final void r() {
        n06 n06Var;
        int i = mz5.a[((n06) this.s.A.getValue()).ordinal()];
        if (i != 1) {
            if (i == 2) {
                n06Var = n06.GRID;
            } else {
                i.d();
                return;
            }
        } else {
            n06Var = n06.LIST;
        }
        ng6 ng6Var = (ng6) this.c;
        ng6Var.getClass();
        n06Var.getClass();
        SharedPreferences.Editor edit = ng6Var.b.edit();
        String lowerCase = n06Var.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        edit.putString("rom_view_mode", lowerCase);
        edit.apply();
    }
}
