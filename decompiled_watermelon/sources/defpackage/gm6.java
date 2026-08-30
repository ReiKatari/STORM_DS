package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gm6  reason: default package */
/* loaded from: classes.dex */
public final class gm6 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public gm6(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this != obj) {
            if (obj instanceof gm6) {
                gm6 gm6Var = (gm6) obj;
                if (!this.a.equals(gm6Var.a) || !this.b.equals(gm6Var.b) || !b53.x(this.c, gm6Var.c)) {
                    return false;
                }
                Set set2 = this.d;
                if (set2 != null && (set = gm6Var.d) != null) {
                    return set2.equals(set);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(sn2.w(tq0.g1(this.b.values(), new so5(9))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(sn2.w(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        if (set != null) {
            collection = tq0.g1(set, new so5(10));
        } else {
            collection = pp1.A;
        }
        sb.append(sn2.w(collection));
        sb.append("\n            |}\n        ");
        return ah6.Z(sb.toString());
    }
}
