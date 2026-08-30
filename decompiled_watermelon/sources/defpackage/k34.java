package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k34  reason: default package */
/* loaded from: classes.dex */
public final class k34 {
    public final z44 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public k34(z44 z44Var, boolean z, boolean z2) {
        if (!z44Var.a && z) {
            i.g(z44Var.b().concat(" does not allow nullable values"));
            throw null;
        }
        this.a = z44Var;
        this.b = z;
        this.c = z2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k34.class == obj.getClass()) {
            k34 k34Var = (k34) obj;
            if (this.b == k34Var.b && this.c == k34Var.c && this.a.equals(k34Var.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(q75.a(k34.class).c());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: null");
        }
        return sb.toString();
    }
}
