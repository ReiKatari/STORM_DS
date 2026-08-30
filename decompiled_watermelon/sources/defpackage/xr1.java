package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xr1  reason: default package */
/* loaded from: classes.dex */
public final class xr1 extends zr1 {
    public final wr1 a;

    public xr1(wr1 wr1Var) {
        this.a = wr1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof xr1) || this.a != ((xr1) obj).a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Stop(reason=" + this.a + ")";
    }
}
