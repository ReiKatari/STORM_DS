package a7;

import a1.x0;
import a1.y0;
import a4.k2;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class x {
    public static final /* synthetic */ int X = 0;
    public final String A;
    public final k2 B;
    public z L;
    public final x0 R;

    static {
        new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, a4.k2] */
    public x(m0 m0Var) {
        m0Var.getClass();
        LinkedHashMap linkedHashMap = n0.f607b;
        this.A = pc.a.y(m0Var.getClass());
        ?? obj = new Object();
        obj.f249b = this;
        obj.f250c = new ArrayList();
        obj.f251d = new LinkedHashMap();
        this.B = obj;
        this.R = new x0(0);
    }

    public final Bundle a(Bundle bundle) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.B.f251d;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle b10 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((h) entry.getValue()).getClass();
            ((String) entry.getKey()).getClass();
        }
        if (bundle != null) {
            b10.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                h hVar = (h) entry2.getValue();
                boolean z10 = hVar.f574d;
                k0 k0Var = hVar.f571a;
                if (!z10) {
                    str.getClass();
                    if (hVar.f572b || !b10.containsKey(str) || !p7.l.v(b10, str)) {
                        try {
                            k0Var.a(b10, str);
                        } catch (IllegalStateException unused) {
                        }
                    }
                    a0.j.n(w.d.u("Wrong argument type for '", str, "' in argument savedState. "), k0Var.b(), " expected.");
                    return null;
                }
            }
        }
        return b10;
    }

    public final int[] b(x xVar) {
        z zVar;
        zb.j jVar = new zb.j();
        z zVar2 = this;
        while (true) {
            k2 k2Var = zVar2.B;
            z zVar3 = zVar2.L;
            if (xVar != null) {
                zVar = xVar.L;
            } else {
                zVar = null;
            }
            if (zVar != null) {
                z zVar4 = xVar.L;
                zVar4.getClass();
                if (zVar4.Y.e(k2Var.f248a) == zVar2) {
                    jVar.addFirst(zVar2);
                    break;
                }
            }
            if (zVar3 == null || zVar3.Y.f3860b != k2Var.f248a) {
                jVar.addFirst(zVar2);
            }
            if (nc.k.a(zVar3, xVar) || zVar3 == null) {
                break;
            }
            zVar2 = zVar3;
        }
        List<x> p0 = zb.l.p0(jVar);
        ArrayList arrayList = new ArrayList(zb.m.G(p0, 10));
        for (x xVar2 : p0) {
            arrayList.add(Integer.valueOf(xVar2.B.f248a));
        }
        return zb.l.o0(arrayList);
    }

    public final Map c() {
        return zb.v.I((LinkedHashMap) this.B.f251d);
    }

    public w d(a4.n nVar) {
        boolean c4;
        Bundle bundle;
        boolean z10;
        vc.f fVar;
        b9.e b10;
        k2 k2Var = this.B;
        LinkedHashMap linkedHashMap = (LinkedHashMap) k2Var.f251d;
        Uri uri = (Uri) nVar.B;
        ArrayList arrayList = (ArrayList) k2Var.f250c;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        w wVar = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            t tVar = (t) obj;
            tVar.getClass();
            yb.n nVar2 = tVar.f621d;
            if (((vc.f) nVar2.getValue()) == null) {
                c4 = true;
            } else if (uri == null) {
                c4 = false;
            } else {
                vc.f fVar2 = (vc.f) nVar2.getValue();
                fVar2.getClass();
                c4 = fVar2.c(uri.toString());
            }
            if (c4) {
                if (uri != null) {
                    bundle = tVar.d(uri, linkedHashMap);
                } else {
                    bundle = null;
                }
                int b11 = tVar.b(uri);
                String str = (String) nVar.L;
                if (str != null && str.equals(null)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (bundle == null) {
                    if (z10) {
                        linkedHashMap.getClass();
                        Bundle b12 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                        if (uri != null && (fVar = (vc.f) nVar2.getValue()) != null && (b10 = fVar.b(uri.toString())) != null) {
                            tVar.e(b10, b12, linkedHashMap);
                            if (((Boolean) tVar.f622e.getValue()).booleanValue()) {
                                tVar.f(uri, b12, linkedHashMap);
                            }
                        }
                        if (d0.d.b0(linkedHashMap, new r(1, b12)).isEmpty()) {
                        }
                    }
                }
                w wVar2 = new w((x) k2Var.f249b, bundle, tVar.f629l, b11, z10);
                if (wVar == null || wVar2.compareTo(wVar) > 0) {
                    wVar = wVar2;
                }
            }
        }
        return wVar;
    }

    public boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this != obj) {
            if (obj != null && (obj instanceof x)) {
                k2 k2Var = this.B;
                x xVar = (x) obj;
                x0 x0Var = xVar.R;
                k2 k2Var2 = xVar.B;
                boolean a10 = nc.k.a((ArrayList) k2Var.f250c, (ArrayList) k2Var2.f250c);
                x0 x0Var2 = this.R;
                if (x0Var2.g() == x0Var.g()) {
                    Iterator it = ((uc.a) uc.h.I(new y0(x0Var2))).iterator();
                    while (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        if (!nc.k.a(x0Var2.c(intValue), x0Var.c(intValue))) {
                            z10 = false;
                            break;
                        }
                    }
                    z10 = true;
                } else {
                    z10 = false;
                    break;
                }
                if (c().size() == xVar.c().size()) {
                    Set<Map.Entry> entrySet = c().entrySet();
                    entrySet.getClass();
                    for (Map.Entry entry : entrySet) {
                        if (xVar.c().containsKey(entry.getKey())) {
                            if (!nc.k.a(xVar.c().get(entry.getKey()), entry.getValue())) {
                            }
                        }
                    }
                    z11 = true;
                    if (k2Var.f248a == k2Var2.f248a || !nc.k.a((String) k2Var.f252e, (String) k2Var2.f252e) || !a10 || !z10 || !z11) {
                    }
                }
                z11 = false;
                if (k2Var.f248a == k2Var2.f248a) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i2;
        boolean z10;
        int i10;
        k2 k2Var = this.B;
        int i11 = k2Var.f248a * 31;
        String str = (String) k2Var.f252e;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = i11 + i2;
        ArrayList arrayList = (ArrayList) k2Var.f250c;
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            i12 = (((t) obj).f618a.hashCode() + (i12 * 31)) * 961;
        }
        x0 x0Var = this.R;
        x0Var.getClass();
        if (x0Var.g() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            for (String str2 : c().keySet()) {
                int d4 = w.d.d(i12 * 31, 31, str2);
                Object obj2 = c().get(str2);
                if (obj2 != null) {
                    i10 = obj2.hashCode();
                } else {
                    i10 = 0;
                }
                i12 = d4 + i10;
            }
            return i12;
        }
        x0Var.h(0).getClass();
        m9.o.b();
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(0x");
        k2 k2Var = this.B;
        k2Var.getClass();
        sb2.append(Integer.toHexString(k2Var.f248a));
        sb2.append(")");
        String str = (String) k2Var.f252e;
        if (str != null && !vc.h.j0(str)) {
            sb2.append(" route=");
            sb2.append((String) k2Var.f252e);
        }
        return sb2.toString();
    }
}
