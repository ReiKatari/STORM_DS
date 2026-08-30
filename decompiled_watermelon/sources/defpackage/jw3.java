package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jw3  reason: default package */
/* loaded from: classes.dex */
public final class jw3 {
    public final String a;
    public final String b;

    public jw3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw3)) {
            return false;
        }
        jw3 jw3Var = (jw3) obj;
        if (b53.x(this.a, jw3Var.a) && b53.x(this.b, jw3Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RequestParameter(key=" + this.a + ", value=" + this.b + ")";
    }
}
