package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jh5  reason: default package */
/* loaded from: classes.dex */
public final class jh5 extends lh5 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public jh5(String str, String str2, String str3, boolean z) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jh5) {
                jh5 jh5Var = (jh5) obj;
                if (!b53.x(this.a, jh5Var.a) || !this.b.equals(jh5Var.b) || !this.c.equals(jh5Var.c) || this.d != jh5Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ej6.b(ej6.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b31.v("Folder(docId=", this.a, ", name=", this.b, ", relativePath=");
        v.append(this.c);
        v.append(", isRoot=");
        v.append(this.d);
        v.append(")");
        return v.toString();
    }
}
