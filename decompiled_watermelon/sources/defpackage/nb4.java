package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nb4  reason: default package */
/* loaded from: classes.dex */
public final class nb4 extends dz3 {
    public final float a;

    public nb4(float f) {
        this.a = f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, qb4] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = true;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        nb4 nb4Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof nb4) {
            nb4Var = (nb4) obj;
        } else {
            nb4Var = null;
        }
        if (nb4Var != null && ji1.b(this.a, nb4Var.a) && ji1.b(RecyclerView.A1, RecyclerView.A1)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        qb4 qb4Var = (qb4) yy3Var;
        float f = qb4Var.j0;
        float f2 = this.a;
        if (!ji1.b(f, f2) || !ji1.b(RecyclerView.A1, RecyclerView.A1) || !qb4Var.k0) {
            l.P(qb4Var).U(false);
        }
        qb4Var.j0 = f2;
        qb4Var.k0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ej6.a(RecyclerView.A1, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "OffsetModifierElement(x=" + ((Object) ji1.c(this.a)) + ", y=" + ((Object) ji1.c(RecyclerView.A1)) + ", rtlAware=true)";
    }
}
