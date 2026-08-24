package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: an0  reason: default package */
/* loaded from: classes.dex */
public final class an0 {
    public final Long a;
    public final String b;
    public final ArrayList c;

    public an0(Long l, String str, ArrayList arrayList) {
        str.getClass();
        this.a = l;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof an0) {
                an0 an0Var = (an0) obj;
                if (!nb3.k(this.a, an0Var.a) || !nb3.k(this.b, an0Var.b) || !this.c.equals(an0Var.c)) {
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
        return this.c.hashCode() + xg6.d(hashCode * 31, 31, this.b);
    }

    public final String toString() {
        return "CheatFolder(id=" + this.a + ", name=" + this.b + ", cheats=" + this.c + ")";
    }
}
