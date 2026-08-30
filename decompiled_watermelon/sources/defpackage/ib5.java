package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ib5  reason: default package */
/* loaded from: classes.dex */
public final class ib5 extends cf0 {
    public final nc7 a;
    public final List b;
    public final an2 c;
    public final x90 d;

    public ib5(nc7 nc7Var, List list, an2 an2Var, x90 x90Var) {
        this.a = nc7Var;
        this.b = list;
        this.c = an2Var;
        this.d = x90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ib5) {
            ib5 ib5Var = (ib5) obj;
            if (this.a == ib5Var.a && this.b.equals(ib5Var.b) && this.c == ib5Var.c && this.d == ib5Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ej6.c((this.c.hashCode() + b31.b(this.a.hashCode() * 31, 31, this.b)) * 31, false, 31);
    }

    public final String toString() {
        return "RequestOpen(virtualCamera=" + this.a + ", sharedCameraIds=" + this.b + ", graphListener=" + this.c + ", isPrewarm=false, isForegroundObserver=" + this.d + ')';
    }
}
