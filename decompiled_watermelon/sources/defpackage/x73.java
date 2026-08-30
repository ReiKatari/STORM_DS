package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x73  reason: default package */
/* loaded from: classes.dex */
public final class x73 extends k83 {
    public final boolean A;
    public final String B;

    public x73(boolean z, Object obj) {
        obj.getClass();
        this.A = z;
        this.B = obj.toString();
    }

    @Override // defpackage.k83
    public final String b() {
        return this.B;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && x73.class == obj.getClass()) {
                x73 x73Var = (x73) obj;
                if (this.A == x73Var.A && b53.x(this.B, x73Var.B)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.B.hashCode() + (Boolean.hashCode(this.A) * 31);
    }

    @Override // defpackage.k83
    public final String toString() {
        boolean z = this.A;
        String str = this.B;
        if (z) {
            StringBuilder sb = new StringBuilder();
            xg6.a(sb, str);
            return sb.toString();
        }
        return str;
    }
}
