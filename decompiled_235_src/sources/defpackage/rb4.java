package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rb4  reason: default package */
/* loaded from: classes.dex */
public final class rb4 {
    public final fd4 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public rb4(fd4 fd4Var, boolean z, boolean z2) {
        if (!fd4Var.a && z) {
            i.f(fd4Var.b().concat(" does not allow nullable values"));
            throw null;
        }
        this.a = fd4Var;
        this.b = z;
        this.c = z2;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rb4.class == obj.getClass()) {
            rb4 rb4Var = (rb4) obj;
            if (this.b == rb4Var.b && this.c == rb4Var.c && this.a.equals(rb4Var.a)) {
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
        sb.append(gh5.a(rb4.class).c());
        sb.append(" Type: " + this.a);
        sb.append(" Nullable: " + this.b);
        if (this.c) {
            sb.append(" DefaultValue: null");
        }
        return sb.toString();
    }
}
