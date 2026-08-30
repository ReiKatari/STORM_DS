package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g83  reason: default package */
/* loaded from: classes.dex */
public final class g83 extends l73 {
    public final yo3 A;

    public g83() {
        hd2 hd2Var = yo3.d0;
        this.A = new yo3(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof g83) || !((g83) obj).A.equals(this.A)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final void i(String str, l73 l73Var) {
        if (l73Var == null) {
            l73Var = c83.A;
        }
        this.A.put(str, l73Var);
    }
}
