package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dd1  reason: default package */
/* loaded from: classes.dex */
public final class dd1 {
    public final Object a;
    public final boolean b;

    public dd1(boolean z, Object obj) {
        this.a = obj;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dd1) {
                dd1 dd1Var = (dd1) obj;
                if (!b53.x(this.a, dd1Var.a) || this.b != dd1Var.b) {
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
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return Boolean.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        return "Deletable(data=" + this.a + ", isDeleted=" + this.b + ")";
    }
}
