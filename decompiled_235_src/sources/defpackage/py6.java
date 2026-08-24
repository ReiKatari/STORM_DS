package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: py6  reason: default package */
/* loaded from: classes.dex */
public final class py6 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public py6(String str, boolean z, List list, List list2) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof py6) {
            py6 py6Var = (py6) obj;
            String str = py6Var.a;
            if (this.b == py6Var.b && this.c.equals(py6Var.c) && nb3.k(this.d, py6Var.d)) {
                String str2 = this.a;
                if (xs6.g0(str2, "index_", false)) {
                    return xs6.g0(str, "index_", false);
                }
                return str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (xs6.g0(str, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.d.hashCode() + i61.b(((hashCode * 31) + (this.b ? 1 : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        return rs6.Q(rs6.S("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + ln2.M(this.c) + "\n            |   orders = {" + ln2.L(this.d) + "\n            |}\n        "));
    }
}
