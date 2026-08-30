package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vj0  reason: default package */
/* loaded from: classes.dex */
public final class vj0 extends wj0 {
    public final Throwable a;

    public vj0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vj0) {
            if (b53.x(this.a, ((vj0) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.wj0
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
