package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ex  reason: default package */
/* loaded from: classes.dex */
public final class ex {
    public final int a;
    public final pd0 b;

    public ex(int i, pd0 pd0Var) {
        this.a = i;
        if (pd0Var != null) {
            this.b = pd0Var;
        } else {
            c44.i("Null cameraIdentifier");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ex) {
            ex exVar = (ex) obj;
            if (this.a == exVar.a && this.b.equals(exVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.a + ", cameraIdentifier=" + this.b + "}";
    }
}
