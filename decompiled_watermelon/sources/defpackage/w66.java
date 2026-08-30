package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w66  reason: default package */
/* loaded from: classes.dex */
public final class w66 {
    public final String a;
    public final List b;
    public final mi2 c;
    public final Object d;
    public final mi2 e;

    public w66(String str, List list, mi2 mi2Var, Object obj, mi2 mi2Var2) {
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = mi2Var;
        this.d = obj;
        this.e = mi2Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w66) {
                w66 w66Var = (w66) obj;
                if (!this.a.equals(w66Var.a) || !b53.x(this.b, w66Var.b) || !this.c.equals(w66Var.c) || !b53.x(this.d, w66Var.d) || !this.e.equals(w66Var.e)) {
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
        int hashCode2 = (this.c.hashCode() + b31.b(this.a.hashCode() * 31, 31, this.b)) * 31;
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
