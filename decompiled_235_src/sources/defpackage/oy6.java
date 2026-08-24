package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oy6  reason: default package */
/* loaded from: classes.dex */
public final class oy6 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public oy6(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oy6) {
            oy6 oy6Var = (oy6) obj;
            if (!nb3.k(this.a, oy6Var.a) || !nb3.k(this.b, oy6Var.b) || !nb3.k(this.c, oy6Var.c) || !this.d.equals(oy6Var.d)) {
                return false;
            }
            return this.e.equals(oy6Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + i61.b(xg6.d(xg6.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), this.d, 31);
    }

    public final String toString() {
        return rs6.Q(rs6.S("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + ln2.M(gt0.c1(this.d)) + "\n            |   referenceColumnNames = {" + ln2.L(gt0.c1(this.e)) + "\n            |}\n        "));
    }
}
