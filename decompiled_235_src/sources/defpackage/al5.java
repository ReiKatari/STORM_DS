package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: al5  reason: default package */
/* loaded from: classes.dex */
public final class al5 extends lh0 {
    public final pq7 a;
    public final List b;
    public final gt2 c;
    public final fc0 d;

    public al5(pq7 pq7Var, List list, gt2 gt2Var, fc0 fc0Var) {
        this.a = pq7Var;
        this.b = list;
        this.c = gt2Var;
        this.d = fc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof al5) {
            al5 al5Var = (al5) obj;
            if (this.a == al5Var.a && this.b.equals(al5Var.b) && this.c == al5Var.c && this.d == al5Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + xg6.e((this.c.hashCode() + i61.b(this.a.hashCode() * 31, this.b, 31)) * 31, false, 31);
    }

    public final String toString() {
        return "RequestOpen(virtualCamera=" + this.a + ", sharedCameraIds=" + this.b + ", graphListener=" + this.c + ", isPrewarm=false, isForegroundObserver=" + this.d + ')';
    }
}
