package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k76  reason: default package */
/* loaded from: classes.dex */
public final class k76 {
    public final um a;
    public long b;

    public k76(um umVar, long j) {
        this.a = umVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k76) {
                k76 k76Var = (k76) obj;
                if (this.a == k76Var.a && i33.b(this.b, k76Var.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + ((Object) i33.c(this.b)) + ')';
    }
}
