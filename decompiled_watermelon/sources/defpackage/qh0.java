package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qh0  reason: default package */
/* loaded from: classes.dex */
public final class qh0 {
    public od1 a;
    public sd3 b;
    public oh0 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qh0) {
                qh0 qh0Var = (qh0) obj;
                if (!b53.x(this.a, qh0Var.a) || this.b != qh0Var.b || !b53.x(this.c, qh0Var.c) || !i76.b(this.d, qh0Var.d)) {
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
        int hashCode2 = this.c.hashCode();
        return Long.hashCode(this.d) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + ((Object) i76.g(this.d)) + ')';
    }
}
