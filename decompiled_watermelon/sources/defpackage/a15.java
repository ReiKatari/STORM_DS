package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a15  reason: default package */
/* loaded from: classes.dex */
public final class a15 {
    public final u05 a;
    public final List b;

    public a15(u05 u05Var, List list) {
        this.a = u05Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a15) {
                a15 a15Var = (a15) obj;
                if (!this.a.equals(a15Var.a) || !this.b.equals(a15Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RAGameWithSetsEntity(game=" + this.a + ", sets=" + this.b + ")";
    }
}
