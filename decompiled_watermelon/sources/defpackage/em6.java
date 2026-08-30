package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: em6  reason: default package */
/* loaded from: classes.dex */
public final class em6 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public em6(String str, String str2, String str3, List list, List list2) {
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
        if (obj instanceof em6) {
            em6 em6Var = (em6) obj;
            if (!b53.x(this.a, em6Var.a) || !b53.x(this.b, em6Var.b) || !b53.x(this.c, em6Var.c) || !this.d.equals(em6Var.d)) {
                return false;
            }
            return this.e.equals(em6Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + b31.b(ej6.b(ej6.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return ah6.X(ah6.Z("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + sn2.I(tq0.f1(this.d)) + "\n            |   referenceColumnNames = {" + sn2.H(tq0.f1(this.e)) + "\n            |}\n        "));
    }
}
