package defpackage;

import defpackage.b76;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk3  reason: default package */
/* loaded from: classes.dex */
public final class gk3 {
    @gc6("id")
    private final String a;
    @gc6("name")
    private final String b;
    @gc6("type")
    private final String c;
    @gc6("orientation")
    private final String d;
    @gc6("useCustomOpacity")
    private final boolean e;
    @gc6("opacity")
    private final int f;
    @gc6("layoutVariants")
    private final List<b> g;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: gk3$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static gk3 a(fk3 fk3Var) {
            String str;
            nk3 nk3Var;
            fk3Var.getClass();
            UUID uuid = fk3Var.a;
            if (uuid != null) {
                str = uuid.toString();
            } else {
                str = null;
            }
            String str2 = fk3Var.b;
            String name = fk3Var.c.name();
            String name2 = fk3Var.d.name();
            boolean z = fk3Var.e;
            int i = fk3Var.f;
            Map map = fk3Var.g;
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                jf7 jf7Var = (jf7) entry.getKey();
                jf7Var.getClass();
                my4 my4Var = jf7Var.a;
                my4Var.getClass();
                ny4 ny4Var = new ny4(my4Var.a, my4Var.b);
                d83 d83Var = jf7Var.b;
                d83Var.getClass();
                Iterator it2 = it;
                i83 i83Var = new i83(d83Var.a, d83Var.b, d83Var.c, d83Var.d);
                String name3 = jf7Var.c.name();
                List list = jf7Var.d;
                ArrayList arrayList2 = new ArrayList(ht0.v0(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    x66 x66Var = (x66) it3.next();
                    x66Var.getClass();
                    Iterator it4 = it3;
                    String name4 = x66Var.a.name();
                    Map.Entry entry2 = entry;
                    String name5 = x66Var.b.name();
                    Rect rect = x66Var.c;
                    arrayList2.add(new y66(name4, name5, new pf5(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight())));
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
                ok3 ok3Var = jf7Var.e;
                mk3 mk3Var = ok3Var.a;
                mk3Var.getClass();
                nk3 nk3Var2 = new nk3(mk3Var.a, mk3Var.c, mk3Var.d, mk3Var.b.name());
                mk3 mk3Var2 = ok3Var.b;
                if (mk3Var2 != null) {
                    nk3Var = new nk3(mk3Var2.a, mk3Var2.c, mk3Var2.d, mk3Var2.b.name());
                } else {
                    nk3Var = null;
                }
                kf7 kf7Var = new kf7(ny4Var, i83Var, name3, arrayList2, new pk3(nk3Var2, nk3Var));
                ff7 ff7Var = (ff7) entry3.getValue();
                ff7Var.getClass();
                arrayList.add(new b(kf7Var, new gf7(b76.a.a(ff7Var.a), b76.a.a(ff7Var.b))));
                it = it2;
                str = str3;
                str2 = str4;
                name = str5;
                name2 = str6;
            }
            return new gk3(str, str2, name, name2, z, i, arrayList);
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: gk3$b */
    /* loaded from: classes.dex */
    public static final class b {
        @gc6("variant")
        private final kf7 a;
        @gc6("layout")
        private final gf7 b;

        public b(kf7 kf7Var, gf7 gf7Var) {
            this.a = kf7Var;
            this.b = gf7Var;
        }

        public final gf7 a() {
            return this.b;
        }

        public final kf7 b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (nb3.k(this.a, bVar.a) && nb3.k(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            kf7 kf7Var = this.a;
            gf7 gf7Var = this.b;
            return "LayoutEntryDto(variant=" + kf7Var + ", layout=" + gf7Var + ")";
        }
    }

    public gk3(String str, String str2, String str3, String str4, boolean z, int i, ArrayList arrayList) {
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
        this.g = arrayList;
    }

    public final fk3 a() {
        UUID uuid;
        String str = this.a;
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        UUID uuid2 = uuid;
        String str2 = this.b;
        dk3 dk3Var = (dk3) jw2.o(this.c, dk3.values());
        ck3 ck3Var = (ck3) jw2.o(this.d, ck3.values());
        boolean z = this.e;
        int i = this.f;
        List<b> list = this.g;
        int k0 = c14.k0(ht0.v0(list, 10));
        if (k0 < 16) {
            k0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(k0);
        for (b bVar : list) {
            linkedHashMap.put(bVar.b().a(), bVar.a().a());
        }
        return new fk3(uuid2, str2, dk3Var, ck3Var, z, i, linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk3)) {
            return false;
        }
        gk3 gk3Var = (gk3) obj;
        if (nb3.k(this.a, gk3Var.a) && nb3.k(this.b, gk3Var.b) && nb3.k(this.c, gk3Var.c) && nb3.k(this.d, gk3Var.d) && this.e == gk3Var.e && this.f == gk3Var.f && nb3.k(this.g, gk3Var.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.g.hashCode() + lb1.a(this.f, xg6.e(xg6.d(xg6.d((i2 + i) * 31, 31, this.c), 31, this.d), this.e, 31), 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        boolean z = this.e;
        int i = this.f;
        List<b> list = this.g;
        StringBuilder u = i61.u("LayoutConfigurationDto(id=", str, ", name=", str2, ", type=");
        i61.B(u, str3, ", orientation=", str4, ", useCustomOpacity=");
        u.append(z);
        u.append(", opacity=");
        u.append(i);
        u.append(", layoutVariants=");
        u.append(list);
        u.append(")");
        return u.toString();
    }
}
