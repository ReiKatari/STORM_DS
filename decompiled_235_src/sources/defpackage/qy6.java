package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qy6  reason: default package */
/* loaded from: classes.dex */
public final class qy6 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public qy6(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this != obj) {
            if (obj instanceof qy6) {
                qy6 qy6Var = (qy6) obj;
                if (!this.a.equals(qy6Var.a) || !this.b.equals(qy6Var.b) || !nb3.k(this.c, qy6Var.c)) {
                    return false;
                }
                Set set2 = this.d;
                if (set2 != null && (set = qy6Var.d) != null) {
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
        sb.append(ln2.q(gt0.d1(this.b.values(), new tp5(12))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(ln2.q(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        if (set != null) {
            collection = gt0.d1(set, new tp5(13));
        } else {
            collection = yt1.A;
        }
        sb.append(ln2.q(collection));
        sb.append("\n            |}\n        ");
        return rs6.S(sb.toString());
    }
}
