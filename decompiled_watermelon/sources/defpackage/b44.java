package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b44  reason: default package */
/* loaded from: classes.dex */
public abstract class b44 {
    public static final /* synthetic */ int X = 0;
    public final String A;
    public final y9 B;
    public g44 L;
    public final ec6 R;

    static {
        new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [y9, java.lang.Object] */
    public b44(k54 k54Var) {
        k54Var.getClass();
        LinkedHashMap linkedHashMap = l54.b;
        this.A = hi2.x(k54Var.getClass());
        ?? obj = new Object();
        obj.b = this;
        obj.c = new ArrayList();
        obj.d = new LinkedHashMap();
        this.B = obj;
        this.R = new ec6(0);
    }

    public final Bundle b(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.B.d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle k = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((k34) entry.getValue()).getClass();
            ((String) entry.getKey()).getClass();
        }
        if (bundle != null) {
            k.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                k34 k34Var = (k34) entry2.getValue();
                boolean z = k34Var.d;
                z44 z44Var = k34Var.a;
                if (!z) {
                    str.getClass();
                    if (k34Var.b || !k.containsKey(str) || !hk2.G(k, str)) {
                        try {
                            z44Var.a(k, str);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    f81.n(b31.u("Wrong argument type for '", str, "' in argument savedState. "), z44Var.b(), " expected.");
                    return null;
                }
            }
        }
        return k;
    }

    public final int[] c(b44 b44Var) {
        g44 g44Var;
        xt xtVar = new xt();
        while (true) {
            y9 y9Var = this.B;
            g44 g44Var2 = this.L;
            if (b44Var != null) {
                g44Var = b44Var.L;
            } else {
                g44Var = null;
            }
            if (g44Var != null) {
                g44 g44Var3 = b44Var.L;
                g44Var3.getClass();
                if (g44Var3.Y.j(y9Var.a) == this) {
                    xtVar.addFirst(this);
                    break;
                }
            }
            if (g44Var2 == null || g44Var2.Y.c != y9Var.a) {
                xtVar.addFirst(this);
            }
            if (b53.x(g44Var2, b44Var) || g44Var2 == null) {
                break;
            }
            this = g44Var2;
        }
        List<b44> n1 = tq0.n1(xtVar);
        ArrayList arrayList = new ArrayList(uq0.y0(n1, 10));
        for (b44 b44Var2 : n1) {
            arrayList.add(Integer.valueOf(b44Var2.B.a));
        }
        return tq0.m1(arrayList);
    }

    public final Map d() {
        return zt3.r0((LinkedHashMap) this.B.d);
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj != null && (obj instanceof b44)) {
                y9 y9Var = this.B;
                b44 b44Var = (b44) obj;
                ec6 ec6Var = b44Var.R;
                y9 y9Var2 = b44Var.B;
                boolean x = b53.x((ArrayList) y9Var.c, (ArrayList) y9Var2.c);
                ec6 ec6Var2 = this.R;
                if (ec6Var2.g() == ec6Var.g()) {
                    Iterator it = ((ay0) d06.w0(new fc6(ec6Var2))).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!b53.x(ec6Var2.c(intValue), ec6Var.c(intValue))) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                } else {
                    z = false;
                    break;
                }
                if (d().size() == b44Var.d().size()) {
                    for (Map.Entry entry : (Iterable) tq0.E0(d().entrySet()).b) {
                        if (b44Var.d().containsKey(entry.getKey())) {
                            if (!b53.x(b44Var.d().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                    }
                    z2 = true;
                    if (y9Var.a == y9Var2.a || !b53.x((String) y9Var.e, (String) y9Var2.e) || !x || !z || !z2) {
                    }
                }
                z2 = false;
                if (y9Var.a == y9Var2.a) {
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
        y9 y9Var = this.B;
        int i3 = y9Var.a * 31;
        String str = (String) y9Var.e;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i3 + i;
        ArrayList arrayList = (ArrayList) y9Var.c;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            i4 = (((y34) obj).a.hashCode() + (i4 * 31)) * 961;
        }
        ec6 ec6Var = this.R;
        ec6Var.getClass();
        if (ec6Var.g() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (String str2 : d().keySet()) {
                int b = ej6.b(i4 * 31, 31, str2);
                Object obj2 = d().get(str2);
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                } else {
                    i2 = 0;
                }
                i4 = b + i2;
            }
            return i4;
        }
        ec6Var.h(0).getClass();
        c44.b();
        return 0;
    }

    public a44 i(os osVar) {
        boolean d;
        Bundle bundle;
        boolean z;
        h85 h85Var;
        ku3 c;
        y9 y9Var = this.B;
        LinkedHashMap linkedHashMap = (LinkedHashMap) y9Var.d;
        Uri uri = (Uri) osVar.B;
        ArrayList arrayList = (ArrayList) y9Var.c;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        a44 a44Var = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y34 y34Var = (y34) obj;
            y34Var.getClass();
            il6 il6Var = y34Var.d;
            if (((h85) il6Var.getValue()) == null) {
                d = true;
            } else if (uri == null) {
                d = false;
            } else {
                h85 h85Var2 = (h85) il6Var.getValue();
                h85Var2.getClass();
                d = h85Var2.d(uri.toString());
            }
            if (d) {
                if (uri != null) {
                    bundle = y34Var.d(uri, linkedHashMap);
                } else {
                    bundle = null;
                }
                int b = y34Var.b(uri);
                String str = (String) osVar.L;
                if (str != null && str.equals(null)) {
                    z = true;
                } else {
                    z = false;
                }
                if (bundle == null) {
                    if (z) {
                        linkedHashMap.getClass();
                        Bundle k = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                        if (uri != null && (h85Var = (h85) il6Var.getValue()) != null && (c = h85Var.c(uri.toString())) != null) {
                            y34Var.e(c, k, linkedHashMap);
                            if (((Boolean) y34Var.e.getValue()).booleanValue()) {
                                y34Var.f(uri, k, linkedHashMap);
                            }
                        }
                        if (cg2.Q(linkedHashMap, new w34(1, k)).isEmpty()) {
                        }
                    }
                }
                a44 a44Var2 = new a44((b44) y9Var.b, bundle, y34Var.l, b, z);
                if (a44Var == null || a44Var2.compareTo(a44Var) > 0) {
                    a44Var = a44Var2;
                }
            }
        }
        return a44Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        y9 y9Var = this.B;
        y9Var.getClass();
        sb.append(Integer.toHexString(y9Var.a));
        sb.append(")");
        String str = (String) y9Var.e;
        if (str != null && !zg6.B0(str)) {
            sb.append(" route=");
            sb.append((String) y9Var.e);
        }
        return sb.toString();
    }
}
