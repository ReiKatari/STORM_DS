package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ni7  reason: default package */
/* loaded from: classes.dex */
public final class ni7 {
    public final jd0 a;
    public final Map b;
    public final Set c;
    public bl5 d;

    public /* synthetic */ ni7(jd0 jd0Var, LinkedHashMap linkedHashMap, bl5 bl5Var, int i) {
        this((i & 1) != 0 ? new jd0(0) : jd0Var, (i & 2) != 0 ? new LinkedHashMap() : linkedHashMap, new LinkedHashSet(), (i & 8) != 0 ? null : bl5Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni7)) {
            return false;
        }
        ni7 ni7Var = (ni7) obj;
        if (nb3.k(this.a, ni7Var.a) && nb3.k(this.b, ni7Var.b) && nb3.k(this.c, ni7Var.c) && nb3.k(this.d, ni7Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.b.hashCode();
        int hashCode3 = (this.c.hashCode() + ((hashCode2 + (this.a.hashCode() * 31)) * 31)) * 31;
        bl5 bl5Var = this.d;
        if (bl5Var == null) {
            hashCode = 0;
        } else {
            hashCode = Integer.hashCode(bl5Var.a);
        }
        return hashCode3 + hashCode;
    }

    public final String toString() {
        return "InfoBundle(options=" + this.a + ", tags=" + this.b + ", listeners=" + this.c + ", template=" + this.d + ')';
    }

    public ni7(jd0 jd0Var, Map map, Set set, bl5 bl5Var) {
        jd0Var.getClass();
        map.getClass();
        this.a = jd0Var;
        this.b = map;
        this.c = set;
        this.d = bl5Var;
    }
}
