package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jq4  reason: default package */
/* loaded from: classes.dex */
public final class jq4 extends e74 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public jq4(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z4 = true;
        if (f < RecyclerView.B1 && !Float.isNaN(f)) {
            z = false;
        } else {
            z = true;
        }
        if (f2 < RecyclerView.B1 && !Float.isNaN(f2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z5 = z & z2;
        if (f3 < RecyclerView.B1 && !Float.isNaN(f3)) {
            z3 = false;
        } else {
            z3 = true;
        }
        boolean z6 = z5 & z3;
        if (f4 < RecyclerView.B1 && !Float.isNaN(f4)) {
            z4 = false;
        }
        if (!(z6 & z4)) {
            n53.a("Padding must be non-negative");
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, kq4] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        z64Var.m0 = this.c;
        z64Var.n0 = this.d;
        z64Var.o0 = true;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        jq4 jq4Var;
        if (obj instanceof jq4) {
            jq4Var = (jq4) obj;
        } else {
            jq4Var = null;
        }
        if (jq4Var != null && om1.b(this.a, jq4Var.a) && om1.b(this.b, jq4Var.b) && om1.b(this.c, jq4Var.c) && om1.b(this.d, jq4Var.d)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        kq4 kq4Var = (kq4) z64Var;
        kq4Var.k0 = this.a;
        kq4Var.l0 = this.b;
        kq4Var.m0 = this.c;
        kq4Var.n0 = this.d;
        kq4Var.o0 = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + xg6.a(this.d, xg6.a(this.c, xg6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
