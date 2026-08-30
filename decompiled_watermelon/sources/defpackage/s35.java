package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s35  reason: default package */
/* loaded from: classes.dex */
public final class s35 {
    public final boolean a;
    public final int b;
    public final String c;

    public s35(String str, int i, boolean z) {
        this.a = z;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s35)) {
            return false;
        }
        s35 s35Var = (s35) obj;
        if (this.a == s35Var.a && this.b == s35Var.b && b53.x(this.c, s35Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = wh1.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RaPendingSyncMenuState(isVisible=");
        sb.append(this.a);
        sb.append(", pendingCount=");
        sb.append(this.b);
        sb.append(", label=");
        return b31.q(sb, this.c, ")");
    }
}
