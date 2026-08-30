package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u82  reason: default package */
/* loaded from: classes.dex */
public final class u82 {
    public final String a;
    public final String b;

    public u82(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u82) {
                u82 u82Var = (u82) obj;
                if (!this.a.equals(u82Var.a) || !this.b.equals(u82Var.b)) {
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
        StringBuilder sb = new StringBuilder("DeviceInfo(manufacturer=");
        sb.append(this.a);
        sb.append(", model=");
        return wh1.o(sb, this.b, ')');
    }
}
