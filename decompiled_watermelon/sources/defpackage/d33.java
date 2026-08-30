package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d33  reason: default package */
/* loaded from: classes.dex */
public final class d33 extends b33 {
    public static final d33 R = new b33(1, 0, 1);

    @Override // defpackage.b33
    public final boolean equals(Object obj) {
        if (obj instanceof d33) {
            if (!isEmpty() || !((d33) obj).isEmpty()) {
                d33 d33Var = (d33) obj;
                if (this.A == d33Var.A && this.B == d33Var.B) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.b33
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.A * 31) + this.B;
    }

    @Override // defpackage.b33
    public final boolean isEmpty() {
        if (this.A > this.B) {
            return true;
        }
        return false;
    }

    @Override // defpackage.b33
    public final String toString() {
        return this.A + ".." + this.B;
    }
}
