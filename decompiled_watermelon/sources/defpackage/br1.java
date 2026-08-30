package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: br1  reason: default package */
/* loaded from: classes.dex */
public final class br1 implements cr1 {
    public final String a;
    public final ip3 b;

    public br1(String str, ip3 ip3Var) {
        this.a = str;
        this.b = ip3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof br1) {
                br1 br1Var = (br1) obj;
                if (!this.a.equals(br1Var.a) || !this.b.equals(br1Var.b)) {
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
        return "Submenu(title=" + this.a + ", entries=" + this.b + ")";
    }
}
