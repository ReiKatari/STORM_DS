package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jw4  reason: default package */
/* loaded from: classes.dex */
public final class jw4 implements kw4 {
    public final m8 a;

    public jw4(m8 m8Var) {
        this.a = m8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof jw4) && this.a == ((jw4) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(activeCamera=" + this.a + ')';
    }
}
