package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zv  reason: default package */
/* loaded from: classes.dex */
public final class zv {
    public final tb5 a;

    public zv(tb5 tb5Var) {
        this.a = tb5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zv) || !b53.x(this.a, ((zv) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
