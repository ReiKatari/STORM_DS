package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p47  reason: default package */
/* loaded from: classes.dex */
public final class p47 {
    public final bb0 a;
    public final Map b;
    public final Set c;
    public jb5 d;

    public /* synthetic */ p47(bb0 bb0Var, LinkedHashMap linkedHashMap, jb5 jb5Var, int i) {
        this((i & 1) != 0 ? new bb0(0) : bb0Var, (i & 2) != 0 ? new LinkedHashMap() : linkedHashMap, new LinkedHashSet(), (i & 8) != 0 ? null : jb5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p47)) {
            return false;
        }
        p47 p47Var = (p47) obj;
        if (b53.x(this.a, p47Var.a) && b53.x(this.b, p47Var.b) && b53.x(this.c, p47Var.c) && b53.x(this.d, p47Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode();
        int hashCode3 = (this.c.hashCode() + ((hashCode2 + (this.a.hashCode() * 31)) * 31)) * 31;
        jb5 jb5Var = this.d;
        if (jb5Var == null) {
            hashCode = 0;
        } else {
            hashCode = Integer.hashCode(jb5Var.a);
        }
        return hashCode3 + hashCode;
    }

    public final String toString() {
        return "InfoBundle(options=" + this.a + ", tags=" + this.b + ", listeners=" + this.c + ", template=" + this.d + ')';
    }

    public p47(bb0 bb0Var, Map map, Set set, jb5 jb5Var) {
        bb0Var.getClass();
        map.getClass();
        this.a = bb0Var;
        this.b = map;
        this.c = set;
        this.d = jb5Var;
    }
}
