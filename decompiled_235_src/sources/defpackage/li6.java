package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: li6  reason: default package */
/* loaded from: classes.dex */
public final class li6 {
    public final String a;
    public final List b;
    public final qn2 c;
    public final Object d;
    public final qn2 e;

    public li6(String str, List list, qn2 qn2Var, Object obj, qn2 qn2Var2) {
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = qn2Var;
        this.d = obj;
        this.e = qn2Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof li6) {
                li6 li6Var = (li6) obj;
                if (!this.a.equals(li6Var.a) || !nb3.k(this.b, li6Var.b) || !this.c.equals(li6Var.c) || !nb3.k(this.d, li6Var.d) || !this.e.equals(li6Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.c.hashCode() + i61.b(this.a.hashCode() * 31, this.b, 31)) * 31;
        Object obj = this.d;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.e.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "Payload(title=" + this.a + ", items=" + this.b + ", labelOf=" + this.c + ", selected=" + this.d + ", onSelect=" + this.e + ")";
    }
}
