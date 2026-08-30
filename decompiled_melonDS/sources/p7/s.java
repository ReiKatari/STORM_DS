package p7;

import ah.b0;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final String f11444a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11445b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f11446c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f11447d;

    public s(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.f11444a = str;
        this.f11445b = map;
        this.f11446c = abstractSet;
        this.f11447d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this != obj) {
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (!this.f11444a.equals(sVar.f11444a) || !this.f11445b.equals(sVar.f11445b) || !nc.k.a(this.f11446c, sVar.f11446c)) {
                    return false;
                }
                Set set2 = this.f11447d;
                if (set2 != null && (set = sVar.f11447d) != null) {
                    return set2.equals(set);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f11445b.hashCode();
        return this.f11446c.hashCode() + ((hashCode + (this.f11444a.hashCode() * 31)) * 31);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map, java.lang.Object] */
    public final String toString() {
        Collection collection;
        StringBuilder sb2 = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb2.append(this.f11444a);
        sb2.append("',\n            |    columns = {");
        sb2.append(t.i(zb.l.l0(this.f11445b.values(), new b0(13))));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(t.i(this.f11446c));
        sb2.append("\n            |    indices = {");
        Set set = this.f11447d;
        if (set != null) {
            collection = zb.l.l0(set, new b0(14));
        } else {
            collection = zb.q.A;
        }
        sb2.append(t.i(collection));
        sb2.append("\n            |}\n        ");
        return vc.i.K(sb2.toString());
    }
}
