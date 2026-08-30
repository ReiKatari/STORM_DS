package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yj2  reason: default package */
/* loaded from: classes.dex */
public final class yj2 {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public yj2(Long l, String str, String str2, String str3, List list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yj2) {
                yj2 yj2Var = (yj2) obj;
                if (!b53.x(this.a, yj2Var.a) || !b53.x(this.b, yj2Var.b) || !b53.x(this.c, yj2Var.c) || !b53.x(this.d, yj2Var.d) || !this.e.equals(yj2Var.e)) {
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
        Long l = this.a;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return this.e.hashCode() + ej6.b(ej6.b(ej6.b(hashCode * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Game(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", gameCode=");
        b31.B(sb, this.c, ", gameChecksum=", this.d, ", cheats=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
