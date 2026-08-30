package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bm0  reason: default package */
/* loaded from: classes.dex */
public final class bm0 {
    public final String a;
    public final String b;
    public final String c;

    public bm0(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bm0) {
                bm0 bm0Var = (bm0) obj;
                if (!b53.x(this.a, bm0Var.a) || !b53.x(this.b, bm0Var.b) || !this.c.equals(bm0Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ej6.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return b31.q(b31.v("CheatSubmissionForm(name=", this.a, ", description=", this.b, ", code="), this.c, ")");
    }
}
