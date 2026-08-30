package nf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import nf.i;
import oe.a0;
import oe.b0;
import ve.l;
import ve.n;
import ve.o;
import zb.m;
import zb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {
    @va.b("id")

    /* renamed from: a  reason: collision with root package name */
    private final String f10405a;
    @va.b("name")

    /* renamed from: b  reason: collision with root package name */
    private final String f10406b;
    @va.b("type")

    /* renamed from: c  reason: collision with root package name */
    private final String f10407c;
    @va.b("orientation")

    /* renamed from: d  reason: collision with root package name */
    private final String f10408d;
    @va.b("useCustomOpacity")

    /* renamed from: e  reason: collision with root package name */
    private final boolean f10409e;
    @va.b("opacity")

    /* renamed from: f  reason: collision with root package name */
    private final int f10410f;
    @va.b("layoutVariants")

    /* renamed from: g  reason: collision with root package name */
    private final List<C0018b> f10411g;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
        public static b a(ve.f fVar) {
            String str;
            c cVar;
            fVar.getClass();
            UUID uuid = fVar.f13798a;
            if (uuid != null) {
                str = uuid.toString();
            } else {
                str = null;
            }
            String str2 = fVar.f13799b;
            String name = fVar.f13800c.name();
            String name2 = fVar.f13801d.name();
            boolean z10 = fVar.f13802e;
            int i2 = fVar.f13803f;
            Map map = fVar.f13804g;
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                o oVar = (o) entry.getKey();
                oVar.getClass();
                a0 a0Var = oVar.f13823a;
                a0Var.getClass();
                e eVar = new e(a0Var.f10908a, a0Var.f10909b);
                ve.b bVar = oVar.f13824b;
                bVar.getClass();
                Iterator it2 = it;
                nf.a aVar = new nf.a(bVar.f13793a, bVar.f13794b, bVar.f13795c, bVar.f13796d);
                String name3 = oVar.f13825c.name();
                List list = oVar.f13826d;
                ArrayList arrayList2 = new ArrayList(m.G(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    l lVar = (l) it3.next();
                    lVar.getClass();
                    Iterator it4 = it3;
                    String name4 = lVar.f13815a.name();
                    Map.Entry entry2 = entry;
                    String name5 = lVar.f13816b.name();
                    b0 b0Var = lVar.f13817c;
                    arrayList2.add(new h(name4, name5, new g(b0Var.f10912a, b0Var.f10913b, b0Var.f10914c, b0Var.f10915d)));
                    it3 = it4;
                    entry = entry2;
                    str = str;
                    str2 = str2;
                    name = name;
                    name2 = name2;
                }
                Map.Entry entry3 = entry;
                String str3 = str;
                String str4 = str2;
                String str5 = name;
                String str6 = name2;
                ve.i iVar = oVar.f13827e;
                iVar.getClass();
                ve.h hVar = iVar.f13809a;
                hVar.getClass();
                c cVar2 = new c(hVar.f13806b.name(), hVar.f13805a, hVar.f13807c, hVar.f13808d);
                ve.h hVar2 = iVar.f13810b;
                if (hVar2 != null) {
                    cVar = new c(hVar2.f13806b.name(), hVar2.f13805a, hVar2.f13807c, hVar2.f13808d);
                } else {
                    cVar = null;
                }
                k kVar = new k(eVar, aVar, name3, arrayList2, new d(cVar2, cVar));
                n nVar = (n) entry3.getValue();
                nVar.getClass();
                arrayList.add(new C0018b(kVar, new j(i.a.a(nVar.f13821a), i.a.a(nVar.f13822b))));
                it = it2;
                str = str3;
                str2 = str4;
                name = str5;
                name2 = str6;
            }
            return new b(str, str2, name, name2, z10, i2, arrayList);
        }
    }

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* renamed from: nf.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0018b {
        @va.b("variant")

        /* renamed from: a  reason: collision with root package name */
        private final k f10412a;
        @va.b("layout")

        /* renamed from: b  reason: collision with root package name */
        private final j f10413b;

        public C0018b(k kVar, j jVar) {
            this.f10412a = kVar;
            this.f10413b = jVar;
        }

        public final j a() {
            return this.f10413b;
        }

        public final k b() {
            return this.f10412a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0018b)) {
                return false;
            }
            C0018b c0018b = (C0018b) obj;
            if (nc.k.a(this.f10412a, c0018b.f10412a) && nc.k.a(this.f10413b, c0018b.f10413b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f10413b.hashCode() + (this.f10412a.hashCode() * 31);
        }

        public final String toString() {
            k kVar = this.f10412a;
            j jVar = this.f10413b;
            return "LayoutEntryDto(variant=" + kVar + ", layout=" + jVar + ")";
        }
    }

    public b(String str, String str2, String str3, String str4, boolean z10, int i2, ArrayList arrayList) {
        str3.getClass();
        str4.getClass();
        this.f10405a = str;
        this.f10406b = str2;
        this.f10407c = str3;
        this.f10408d = str4;
        this.f10409e = z10;
        this.f10410f = i2;
        this.f10411g = arrayList;
    }

    public final ve.f a() {
        UUID uuid;
        String str = this.f10405a;
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        UUID uuid2 = uuid;
        String str2 = this.f10406b;
        ve.e eVar = (ve.e) pc.a.t(this.f10407c, ve.e.values());
        ve.d dVar = (ve.d) pc.a.t(this.f10408d, ve.d.values());
        boolean z10 = this.f10409e;
        int i2 = this.f10410f;
        List<C0018b> list = this.f10411g;
        int E = v.E(m.G(list, 10));
        if (E < 16) {
            E = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(E);
        for (C0018b c0018b : list) {
            linkedHashMap.put(c0018b.b().a(), c0018b.a().a());
        }
        return new ve.f(uuid2, str2, eVar, dVar, z10, i2, linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (nc.k.a(this.f10405a, bVar.f10405a) && nc.k.a(this.f10406b, bVar.f10406b) && nc.k.a(this.f10407c, bVar.f10407c) && nc.k.a(this.f10408d, bVar.f10408d) && this.f10409e == bVar.f10409e && this.f10410f == bVar.f10410f && nc.k.a(this.f10411g, bVar.f10411g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f10405a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f10406b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return this.f10411g.hashCode() + w.d.c(this.f10410f, w.d.e(w.d.d(w.d.d((i10 + i2) * 31, 31, this.f10407c), 31, this.f10408d), this.f10409e, 31), 31);
    }

    public final String toString() {
        String str = this.f10405a;
        String str2 = this.f10406b;
        String str3 = this.f10407c;
        String str4 = this.f10408d;
        boolean z10 = this.f10409e;
        int i2 = this.f10410f;
        List<C0018b> list = this.f10411g;
        StringBuilder k10 = kc.a.k("LayoutConfigurationDto(id=", str, ", name=", str2, ", type=");
        w.d.B(k10, str3, ", orientation=", str4, ", useCustomOpacity=");
        k10.append(z10);
        k10.append(", opacity=");
        k10.append(i2);
        k10.append(", layoutVariants=");
        k10.append(list);
        k10.append(")");
        return k10.toString();
    }
}
