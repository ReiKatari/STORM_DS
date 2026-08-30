package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vb6  reason: default package */
/* loaded from: classes.dex */
public final class vb6 implements fv0, Iterable, f93 {
    public final w86 A;
    public final int B;
    public final q85 L;

    public vb6(w86 w86Var, int i, uk2 uk2Var, q85 q85Var) {
        this.A = w86Var;
        this.B = i;
        this.L = q85Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vb6) {
            vb6 vb6Var = (vb6) obj;
            if (vb6Var.B == this.B && vb6Var.A == this.A && vb6Var.L.equals(this.L)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.A.hashCode();
        return this.L.hashCode() + ((hashCode + (this.B * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ub6(this.A, this.B, null, this.L);
    }
}
