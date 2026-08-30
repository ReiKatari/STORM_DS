package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fk2  reason: default package */
/* loaded from: classes.dex */
public final class fk2 {
    public final Long a;
    public final String b;
    public final String c;
    public final String d;

    public fk2(Long l, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = l;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk2)) {
            return false;
        }
        fk2 fk2Var = (fk2) obj;
        if (b53.x(this.a, fk2Var.a) && b53.x(this.b, fk2Var.b) && b53.x(this.c, fk2Var.c) && b53.x(this.d, fk2Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l = this.a;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return this.d.hashCode() + ej6.b(ej6.b(hashCode * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "GameEntity(id=" + this.a + ", name=" + this.b + ", gameCode=" + this.c + ", gameChecksum=" + this.d + ")";
    }
}
