package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gh4  reason: default package */
/* loaded from: classes.dex */
public final class gh4 extends dz3 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public gh4(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z4 = true;
        if (f < RecyclerView.A1 && !Float.isNaN(f)) {
            z = false;
        } else {
            z = true;
        }
        if (f2 < RecyclerView.A1 && !Float.isNaN(f2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z5 = z & z2;
        if (f3 < RecyclerView.A1 && !Float.isNaN(f3)) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z6 = z5 & z3;
        if (f4 < RecyclerView.A1 && !Float.isNaN(f4)) {
            z4 = false;
        }
        if (!(z6 & z4)) {
            kz2.a("Padding must be non-negative");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, hh4] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        yy3Var.l0 = this.c;
        yy3Var.m0 = this.d;
        yy3Var.n0 = true;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        gh4 gh4Var;
        if (obj instanceof gh4) {
            gh4Var = (gh4) obj;
        } else {
            gh4Var = null;
        }
        if (gh4Var != null && ji1.b(this.a, gh4Var.a) && ji1.b(this.b, gh4Var.b) && ji1.b(this.c, gh4Var.c) && ji1.b(this.d, gh4Var.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        hh4 hh4Var = (hh4) yy3Var;
        hh4Var.j0 = this.a;
        hh4Var.k0 = this.b;
        hh4Var.l0 = this.c;
        hh4Var.m0 = this.d;
        hh4Var.n0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ej6.a(this.d, ej6.a(this.c, ej6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
