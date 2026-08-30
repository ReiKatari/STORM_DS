package defpackage;

import defpackage.ov5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: od3  reason: default package */
/* loaded from: classes.dex */
public final class od3 {
    @r06("id")
    private final String a;
    @r06("name")
    private final String b;
    @r06("type")
    private final String c;
    @r06("orientation")
    private final String d;
    @r06("useCustomOpacity")
    private final boolean e;
    @r06("opacity")
    private final int f;
    @r06("layoutVariants")
    private final List<b> g;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: od3$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static od3 a(nd3 nd3Var) {
            String str;
            vd3 vd3Var;
            nd3Var.getClass();
            UUID uuid = nd3Var.a;
            if (uuid != null) {
                str = uuid.toString();
            } else {
                str = null;
            }
            String str2 = nd3Var.b;
            String name = nd3Var.c.name();
            String name2 = nd3Var.d.name();
            boolean z = nd3Var.e;
            int i = nd3Var.f;
            Map map = nd3Var.g;
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                o17 o17Var = (o17) entry.getKey();
                o17Var.getClass();
                ip4 ip4Var = o17Var.a;
                ip4Var.getClass();
                jp4 jp4Var = new jp4(ip4Var.a, ip4Var.b);
                w13 w13Var = o17Var.b;
                w13Var.getClass();
                Iterator it2 = it;
                b23 b23Var = new b23(w13Var.a, w13Var.b, w13Var.c, w13Var.d);
                String name3 = o17Var.c.name();
                List list = o17Var.d;
                ArrayList arrayList2 = new ArrayList(uq0.y0(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    kv5 kv5Var = (kv5) it3.next();
                    kv5Var.getClass();
                    Iterator it4 = it3;
                    String name4 = kv5Var.a.name();
                    Map.Entry entry2 = entry;
                    String name5 = kv5Var.b.name();
                    Rect rect = kv5Var.c;
                    arrayList2.add(new lv5(name4, name5, new z55(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight())));
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
                wd3 wd3Var = o17Var.e;
                wd3Var.getClass();
                ud3 ud3Var = wd3Var.a;
                ud3Var.getClass();
                vd3 vd3Var2 = new vd3(ud3Var.b.name(), ud3Var.a, ud3Var.c, ud3Var.d);
                ud3 ud3Var2 = wd3Var.b;
                if (ud3Var2 != null) {
                    vd3Var = new vd3(ud3Var2.b.name(), ud3Var2.a, ud3Var2.c, ud3Var2.d);
                } else {
                    vd3Var = null;
                }
                p17 p17Var = new p17(jp4Var, b23Var, name3, arrayList2, new xd3(vd3Var2, vd3Var));
                k17 k17Var = (k17) entry3.getValue();
                k17Var.getClass();
                arrayList.add(new b(p17Var, new l17(ov5.a.a(k17Var.a), ov5.a.a(k17Var.b))));
                it = it2;
                str = str3;
                str2 = str4;
                name = str5;
                name2 = str6;
            }
            return new od3(str, str2, name, name2, z, i, arrayList);
        }
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: od3$b */
    /* loaded from: classes.dex */
    public static final class b {
        @r06("variant")
        private final p17 a;
        @r06("layout")
        private final l17 b;

        public b(p17 p17Var, l17 l17Var) {
            this.a = p17Var;
            this.b = l17Var;
        }

        public final l17 a() {
            return this.b;
        }

        public final p17 b() {
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
            if (b53.x(this.a, bVar.a) && b53.x(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            p17 p17Var = this.a;
            l17 l17Var = this.b;
            return "LayoutEntryDto(variant=" + p17Var + ", layout=" + l17Var + ")";
        }
    }

    public od3(String str, String str2, String str3, String str4, boolean z, int i, ArrayList arrayList) {
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

    public final nd3 a() {
        UUID uuid;
        String str = this.a;
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        UUID uuid2 = uuid;
        String str2 = this.b;
        ld3 ld3Var = (ld3) se.t(this.c, ld3.values());
        kd3 kd3Var = (kd3) se.t(this.d, kd3.values());
        boolean z = this.e;
        int i = this.f;
        List<b> list = this.g;
        int j0 = zt3.j0(uq0.y0(list, 10));
        if (j0 < 16) {
            j0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0);
        for (b bVar : list) {
            linkedHashMap.put(bVar.b().a(), bVar.a().a());
        }
        return new nd3(uuid2, str2, ld3Var, kd3Var, z, i, linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od3)) {
            return false;
        }
        od3 od3Var = (od3) obj;
        if (b53.x(this.a, od3Var.a) && b53.x(this.b, od3Var.b) && b53.x(this.c, od3Var.c) && b53.x(this.d, od3Var.d) && this.e == od3Var.e && this.f == od3Var.f && b53.x(this.g, od3Var.g)) {
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
        return this.g.hashCode() + wh1.a(this.f, ej6.c(ej6.b(ej6.b((i2 + i) * 31, 31, this.c), 31, this.d), this.e, 31), 31);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        boolean z = this.e;
        int i = this.f;
        List<b> list = this.g;
        StringBuilder v = b31.v("LayoutConfigurationDto(id=", str, ", name=", str2, ", type=");
        b31.B(v, str3, ", orientation=", str4, ", useCustomOpacity=");
        v.append(z);
        v.append(", opacity=");
        v.append(i);
        v.append(", layoutVariants=");
        v.append(list);
        v.append(")");
        return v.toString();
    }
}
