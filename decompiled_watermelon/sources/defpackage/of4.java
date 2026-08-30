package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: of4  reason: default package */
/* loaded from: classes.dex */
public final class of4 extends jk2 {
    public final y55 d;

    public of4(y55 y55Var) {
        this.d = y55Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof of4) {
                if (!this.d.equals(((of4) obj).d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.jk2
    public final y55 v() {
        return this.d;
    }
}
