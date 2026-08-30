package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l04  reason: default package */
/* loaded from: classes.dex */
public final class l04 {
    public final ip4 a;
    public final float b;
    public final yz2 c;

    public l04(ip4 ip4Var, float f, yz2 yz2Var) {
        yz2Var.getClass();
        this.a = ip4Var;
        this.b = f;
        this.c = yz2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l04) {
                l04 l04Var = (l04) obj;
                if (!this.a.equals(l04Var.a) || Float.compare(this.b, l04Var.b) != 0 || this.c != l04Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ej6.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ButtonCircle(center=" + this.a + ", radiusSquared=" + this.b + ", input=" + this.c + ")";
    }
}
