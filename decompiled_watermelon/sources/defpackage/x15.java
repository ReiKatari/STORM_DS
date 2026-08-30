package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x15  reason: default package */
/* loaded from: classes.dex */
public final class x15 extends z15 {
    public final String a;
    public final String b;

    public x15(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.z15
    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x15)) {
            return false;
        }
        x15 x15Var = (x15) obj;
        if (b53.x(this.a, x15Var.a) && b53.x(this.b, x15Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Authenticated(username=" + this.a + ", token=" + this.b + ")";
    }
}
