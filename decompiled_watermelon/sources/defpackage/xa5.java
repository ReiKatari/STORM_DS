package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xa5  reason: default package */
/* loaded from: classes.dex */
public final class xa5 extends cf0 {
    public final m8 a;

    public xa5(m8 m8Var) {
        m8Var.getClass();
        this.a = m8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xa5) && b53.x(this.a, ((xa5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestClose(activeCamera=" + this.a + ')';
    }
}
