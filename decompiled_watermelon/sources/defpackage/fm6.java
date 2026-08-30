package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fm6  reason: default package */
/* loaded from: classes.dex */
public final class fm6 {
    public final String a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public fm6(String str, boolean z, List list, List list2) {
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
        if (obj instanceof fm6) {
            fm6 fm6Var = (fm6) obj;
            String str = fm6Var.a;
            if (this.b == fm6Var.b && this.c.equals(fm6Var.c) && b53.x(this.d, fm6Var.d)) {
                String str2 = this.a;
                if (gh6.n0(str2, "index_", false)) {
                    return gh6.n0(str, "index_", false);
                }
                return str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (gh6.n0(str, "index_", false)) {
            hashCode = -1184239155;
        } else {
            hashCode = str.hashCode();
        }
        return this.d.hashCode() + b31.b(((hashCode * 31) + (this.b ? 1 : 0)) * 31, 31, this.c);
    }

    public final String toString() {
        return ah6.X(ah6.Z("\n            |Index {\n            |   name = '" + this.a + "',\n            |   unique = '" + this.b + "',\n            |   columns = {" + sn2.I(this.c) + "\n            |   orders = {" + sn2.H(this.d) + "\n            |}\n        "));
    }
}
