package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: na2  reason: default package */
/* loaded from: classes.dex */
public final class na2 {
    public final String a;
    public final Map b;

    public na2(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public static yc1 a(String str) {
        return new yc1(str);
    }

    public static na2 c(String str) {
        return new na2(str, Collections.EMPTY_MAP);
    }

    public final Annotation b(Class cls) {
        return (Annotation) this.b.get(cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na2)) {
            return false;
        }
        na2 na2Var = (na2) obj;
        if (this.a.equals(na2Var.a) && this.b.equals(na2Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
