package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sk0  reason: default package */
/* loaded from: classes.dex */
public final class sk0 {
    public final Long a;
    public final String b;
    public final ArrayList c;

    public sk0(Long l, String str, ArrayList arrayList) {
        str.getClass();
        this.a = l;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sk0) {
                sk0 sk0Var = (sk0) obj;
                if (!b53.x(this.a, sk0Var.a) || !b53.x(this.b, sk0Var.b) || !this.c.equals(sk0Var.c)) {
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
        return this.c.hashCode() + ej6.b(hashCode * 31, 31, this.b);
    }

    public final String toString() {
        return "CheatFolder(id=" + this.a + ", name=" + this.b + ", cheats=" + this.c + ")";
    }
}
