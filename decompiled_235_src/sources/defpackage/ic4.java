package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ic4  reason: default package */
/* loaded from: classes.dex */
public abstract class ic4 {
    public static final /* synthetic */ int X = 0;
    public final String A;
    public final z9 B;
    public mc4 L;
    public final un6 R;

    static {
        new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, z9] */
    public ic4(qd4 qd4Var) {
        qd4Var.getClass();
        LinkedHashMap linkedHashMap = rd4.b;
        this.A = xk2.o(qd4Var.getClass());
        ?? obj = new Object();
        obj.b = this;
        obj.c = new ArrayList();
        obj.d = new LinkedHashMap();
        this.B = obj;
        this.R = new un6(0);
    }

    public final Bundle a(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.B.d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle l = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((rb4) entry.getValue()).getClass();
            ((String) entry.getKey()).getClass();
        }
        if (bundle != null) {
            l.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                rb4 rb4Var = (rb4) entry2.getValue();
                boolean z = rb4Var.d;
                fd4 fd4Var = rb4Var.a;
                if (!z) {
                    str.getClass();
                    if (rb4Var.b || !l.containsKey(str) || !uj2.X(l, str)) {
                        try {
                            fd4Var.a(l, str);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    u34.s(i61.t("Wrong argument type for '", str, "' in argument savedState. "), fd4Var.b(), " expected.");
                    return null;
                }
            }
        }
        return l;
    }

    public final int[] b(ic4 ic4Var) {
        mc4 mc4Var;
        pu puVar = new pu();
        while (true) {
            z9 z9Var = this.B;
            mc4 mc4Var2 = this.L;
            if (ic4Var != null) {
                mc4Var = ic4Var.L;
            } else {
                mc4Var = null;
            }
            if (mc4Var != null) {
                mc4 mc4Var3 = ic4Var.L;
                mc4Var3.getClass();
                if (mc4Var3.Y.l(z9Var.a) == this) {
                    puVar.addFirst(this);
                    break;
                }
            }
            if (mc4Var2 == null || mc4Var2.Y.L != z9Var.a) {
                puVar.addFirst(this);
            }
            if (nb3.k(mc4Var2, ic4Var) || mc4Var2 == null) {
                break;
            }
            this = mc4Var2;
        }
        List<ic4> k1 = gt0.k1(puVar);
        ArrayList arrayList = new ArrayList(ht0.v0(k1, 10));
        for (ic4 ic4Var2 : k1) {
            arrayList.add(Integer.valueOf(ic4Var2.B.a));
        }
        return gt0.j1(arrayList);
    }

    public final Map c() {
        return c14.s0((LinkedHashMap) this.B.d);
    }

    public hc4 d(m44 m44Var) {
        boolean d;
        Bundle bundle;
        boolean z;
        xh5 xh5Var;
        n14 c;
        z9 z9Var = this.B;
        LinkedHashMap linkedHashMap = (LinkedHashMap) z9Var.d;
        Uri uri = (Uri) m44Var.B;
        ArrayList arrayList = (ArrayList) z9Var.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        hc4 hc4Var = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            fc4 fc4Var = (fc4) obj;
            fc4Var.getClass();
            ex6 ex6Var = fc4Var.d;
            if (((xh5) ex6Var.getValue()) == null) {
                d = true;
            } else if (uri == null) {
                d = false;
            } else {
                xh5 xh5Var2 = (xh5) ex6Var.getValue();
                xh5Var2.getClass();
                d = xh5Var2.d(uri.toString());
            }
            if (d) {
                if (uri != null) {
                    bundle = fc4Var.d(uri, linkedHashMap);
                } else {
                    bundle = null;
                }
                int b = fc4Var.b(uri);
                String str = (String) m44Var.L;
                if (str != null && str.equals(null)) {
                    z = true;
                } else {
                    z = false;
                }
                if (bundle == null) {
                    if (z) {
                        linkedHashMap.getClass();
                        Bundle l = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                        if (uri != null && (xh5Var = (xh5) ex6Var.getValue()) != null && (c = xh5Var.c(uri.toString())) != null) {
                            fc4Var.e(c, l, linkedHashMap);
                            if (((Boolean) fc4Var.e.getValue()).booleanValue()) {
                                fc4Var.f(uri, l, linkedHashMap);
                            }
                        }
                        if (xk2.C(linkedHashMap, new dc4(1, l)).isEmpty()) {
                        }
                    }
                }
                hc4 hc4Var2 = new hc4((ic4) z9Var.b, bundle, fc4Var.l, b, z);
                if (hc4Var == null || hc4Var2.compareTo(hc4Var) > 0) {
                    hc4Var = hc4Var2;
                }
            }
        }
        return hc4Var;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof ic4)) {
                z9 z9Var = this.B;
                ic4 ic4Var = (ic4) obj;
                un6 un6Var = ic4Var.R;
                z9 z9Var2 = ic4Var.B;
                boolean k = nb3.k((ArrayList) z9Var.c, (ArrayList) z9Var2.c);
                un6 un6Var2 = this.R;
                if (un6Var2.f() == un6Var.f()) {
                    Iterator it = ((f11) sb6.Y(new vn6(un6Var2))).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!nb3.k(un6Var2.c(intValue), un6Var.c(intValue))) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                } else {
                    z = false;
                    break;
                }
                if (c().size() == ic4Var.c().size()) {
                    for (Map.Entry entry : (Iterable) gt0.B0(c().entrySet()).b) {
                        if (ic4Var.c().containsKey(entry.getKey())) {
                            if (!nb3.k(ic4Var.c().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                    }
                    z2 = true;
                    if (z9Var.a == z9Var2.a || !nb3.k((String) z9Var.e, (String) z9Var2.e) || !k || !z || !z2) {
                    }
                }
                z2 = false;
                if (z9Var.a == z9Var2.a) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i;
        boolean z;
        int i2;
        z9 z9Var = this.B;
        int i3 = z9Var.a * 31;
        String str = (String) z9Var.e;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i3 + i;
        ArrayList arrayList = (ArrayList) z9Var.c;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            i4 = (((fc4) obj).a.hashCode() + (i4 * 31)) * 961;
        }
        un6 un6Var = this.R;
        un6Var.getClass();
        if (un6Var.f() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (String str2 : c().keySet()) {
                int d = xg6.d(i4 * 31, 31, str2);
                Object obj2 = c().get(str2);
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                } else {
                    i2 = 0;
                }
                i4 = d + i2;
            }
            return i4;
        }
        un6Var.g(0).getClass();
        u34.a();
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        z9 z9Var = this.B;
        z9Var.getClass();
        sb.append(Integer.toHexString(z9Var.a));
        sb.append(")");
        String str = (String) z9Var.e;
        if (str != null && !qs6.v0(str)) {
            sb.append(" route=");
            sb.append((String) z9Var.e);
        }
        return sb.toString();
    }
}
