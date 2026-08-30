package a7;

import a4.k2;
import ai.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public final m0 f632a;

    /* renamed from: b  reason: collision with root package name */
    public final int f633b;

    /* renamed from: c  reason: collision with root package name */
    public final String f634c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f635d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f636e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f637f;

    public y(m0 m0Var, nc.e eVar, Map map) {
        int i2;
        b9.e eVar2;
        map.getClass();
        if (eVar != null) {
            i2 = e7.d.b(aj.g.Y(eVar));
        } else {
            i2 = -1;
        }
        int i10 = 0;
        if (eVar != null) {
            jd.a Y = aj.g.Y(eVar);
            if (Y instanceof jd.d) {
                StringBuilder sb2 = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                nc.e u4 = a.a.u(((jd.d) Y).e());
                throw new IllegalArgumentException(w.d.s(sb2, u4 != null ? u4.c() : null, ". Routes can only be generated from concrete classes or objects."));
            }
            q0 q0Var = new q0(3, new b9.e(Y));
            int d4 = Y.e().d();
            for (int i11 = 0; i11 < d4; i11++) {
                String e6 = Y.e().e(i11);
                k0 a10 = e7.d.a(Y.e().j(i11), map);
                if (a10 != null) {
                    q0Var.i(Integer.valueOf(i11), e6, a10);
                } else {
                    a0.j.h(e7.d.g(e6, Y.e().j(i11).b(), Y.e().b(), map.toString()));
                    throw null;
                }
            }
            r1 = ((String) eVar2.L) + ((String) eVar2.R) + ((String) eVar2.X);
        }
        this.f632a = m0Var;
        this.f633b = i2;
        this.f634c = r1;
        this.f635d = new LinkedHashMap();
        this.f636e = new ArrayList();
        this.f637f = new LinkedHashMap();
        if (eVar != null) {
            jd.a Y2 = aj.g.Y(eVar);
            if (!(Y2 instanceof jd.d)) {
                int d10 = Y2.e().d();
                ArrayList arrayList = new ArrayList(d10);
                for (int i12 = 0; i12 < d10; i12++) {
                    String e10 = Y2.e().e(i12);
                    e10.getClass();
                    ld.e j2 = Y2.e().j(i12);
                    boolean h2 = j2.h();
                    k0 a11 = e7.d.a(j2, map);
                    if (a11 != null) {
                        arrayList.add(new g(e10, new h(a11, h2, Y2.e().k(i12))));
                    } else {
                        a0.j.h(e7.d.g(e10, j2.b(), Y2.e().b(), map.toString()));
                        throw null;
                    }
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    g gVar = (g) obj;
                    this.f635d.put(gVar.f566a, gVar.f567b);
                }
                return;
            }
            fj.j.q(Y2, ". Arguments can only be generated from concrete classes or objects.", "Cannot generate NavArguments for polymorphic serializer ");
            throw null;
        }
    }

    public x a() {
        x b10 = b();
        b10.getClass();
        k2 k2Var = b10.B;
        for (Map.Entry entry : this.f635d.entrySet()) {
            String str = (String) entry.getKey();
            h hVar = (h) entry.getValue();
            str.getClass();
            hVar.getClass();
            k2Var.getClass();
            ((LinkedHashMap) k2Var.f251d).put(str, hVar);
        }
        ArrayList arrayList = this.f636e;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            final t tVar = (t) obj;
            tVar.getClass();
            k2Var.getClass();
            ArrayList b02 = d0.d.b0((LinkedHashMap) k2Var.f251d, new mc.l() { // from class: d7.g
                @Override // mc.l
                public final Object k(Object obj2) {
                    boolean contains;
                    String str2 = (String) obj2;
                    switch (r2) {
                        case 0:
                            str2.getClass();
                            contains = tVar.c().contains(str2);
                            break;
                        default:
                            str2.getClass();
                            contains = tVar.c().contains(str2);
                            break;
                    }
                    return Boolean.valueOf(!contains);
                }
            });
            if (b02.isEmpty()) {
                ((ArrayList) k2Var.f250c).add(tVar);
            } else {
                String str2 = tVar.f618a;
                throw new IllegalArgumentException(("Deep link " + str2 + " can't be used to open destination " + ((x) k2Var.f249b) + ".\nFollowing required arguments are missing: " + b02).toString());
            }
        }
        Iterator it = this.f637f.entrySet().iterator();
        if (!it.hasNext()) {
            String str3 = this.f634c;
            if (str3 != null) {
                k2Var.getClass();
                if (!vc.h.j0(str3)) {
                    String concat = "android-app://androidx.navigation/".concat(str3);
                    final t tVar2 = new t(concat);
                    ArrayList b03 = d0.d.b0((LinkedHashMap) k2Var.f251d, new mc.l() { // from class: d7.g
                        @Override // mc.l
                        public final Object k(Object obj2) {
                            boolean contains;
                            String str22 = (String) obj2;
                            switch (r2) {
                                case 0:
                                    str22.getClass();
                                    contains = tVar2.c().contains(str22);
                                    break;
                                default:
                                    str22.getClass();
                                    contains = tVar2.c().contains(str22);
                                    break;
                            }
                            return Boolean.valueOf(!contains);
                        }
                    });
                    if (b03.isEmpty()) {
                        k2Var.f253f = new yb.n(new a2.n(10, concat));
                        k2Var.f248a = concat.hashCode();
                        k2Var.f252e = str3;
                    } else {
                        StringBuilder u4 = w.d.u("Cannot set route \"", str3, "\" for destination ");
                        u4.append((x) k2Var.f249b);
                        u4.append(". Following required arguments are missing: ");
                        u4.append(b03);
                        throw new IllegalArgumentException(u4.toString().toString());
                    }
                } else {
                    a0.j.h("Cannot have an empty route");
                    return null;
                }
            }
            int i10 = this.f633b;
            if (i10 != -1) {
                k2Var.f248a = i10;
            }
            return b10;
        }
        Map.Entry entry2 = (Map.Entry) it.next();
        ((Number) entry2.getKey()).intValue();
        entry2.getValue().getClass();
        m9.o.b();
        return null;
    }

    public x b() {
        return this.f632a.a();
    }
}
