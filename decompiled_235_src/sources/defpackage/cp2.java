package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cp2  reason: default package */
/* loaded from: classes.dex */
public final class cp2 {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public cp2(Long l, String str, String str2, String str3, List list) {
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
            if (obj instanceof cp2) {
                cp2 cp2Var = (cp2) obj;
                if (!nb3.k(this.a, cp2Var.a) || !nb3.k(this.b, cp2Var.b) || !nb3.k(this.c, cp2Var.c) || !nb3.k(this.d, cp2Var.d) || !this.e.equals(cp2Var.e)) {
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
        return this.e.hashCode() + xg6.d(xg6.d(xg6.d(hashCode * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Game(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", gameCode=");
        i61.B(sb, this.c, ", gameChecksum=", this.d, ", cheats=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
