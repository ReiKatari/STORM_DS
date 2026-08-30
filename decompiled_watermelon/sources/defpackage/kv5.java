package defpackage;

import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kv5  reason: default package */
/* loaded from: classes.dex */
public final class kv5 {
    public final if4 a;
    public final jv5 b;
    public final Rect c;

    public kv5(if4 if4Var, jv5 jv5Var, Rect rect) {
        if4Var.getClass();
        jv5Var.getClass();
        this.a = if4Var;
        this.b = jv5Var;
        this.c = rect;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kv5) {
                kv5 kv5Var = (kv5) obj;
                if (this.a != kv5Var.a || this.b != kv5Var.b || !this.c.equals(kv5Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ScreenFold(orientation=" + this.a + ", type=" + this.b + ", foldBounds=" + this.c + ")";
    }
}
