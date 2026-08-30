package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yl4  reason: default package */
/* loaded from: classes.dex */
public final class yl4 {
    public final w35 a;
    public final List b;
    public final b35 c;
    public final boolean d;

    public yl4(w35 w35Var, List list, b35 b35Var, boolean z) {
        w35Var.getClass();
        this.a = w35Var;
        this.b = list;
        this.c = b35Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yl4) {
                yl4 yl4Var = (yl4) obj;
                if (!b53.x(this.a, yl4Var.a) || !this.b.equals(yl4Var.b) || !this.c.equals(yl4Var.c) || this.d != yl4Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int b = b31.b(this.a.hashCode() * 31, 31, this.b);
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + b) * 31);
    }

    public final String toString() {
        return "PendingRaSubmissionSnapshot(context=" + this.a + ", records=" + this.b + ", counts=" + this.c + ", closed=" + this.d + ")";
    }
}
