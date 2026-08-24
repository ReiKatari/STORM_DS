package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pq4  reason: default package */
/* loaded from: classes.dex */
public final class pq4 implements lq4 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public pq4(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f >= RecyclerView.B1) {
            z = true;
        } else {
            z = false;
        }
        if (f2 >= RecyclerView.B1) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z & z2;
        if (f3 >= RecyclerView.B1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(z4 & z3 & (f4 >= RecyclerView.B1))) {
            n53.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.lq4
    public final float a() {
        return this.d;
    }

    @Override // defpackage.lq4
    public final float b(kk3 kk3Var) {
        if (kk3Var == kk3.Ltr) {
            return this.a;
        }
        return this.c;
    }

    @Override // defpackage.lq4
    public final float c(kk3 kk3Var) {
        if (kk3Var == kk3.Ltr) {
            return this.c;
        }
        return this.a;
    }

    @Override // defpackage.lq4
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pq4) {
            pq4 pq4Var = (pq4) obj;
            if (om1.b(this.a, pq4Var.a) && om1.b(this.b, pq4Var.b) && om1.b(this.c, pq4Var.c) && om1.b(this.d, pq4Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + xg6.a(this.c, xg6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) om1.c(this.a)) + ", top=" + ((Object) om1.c(this.b)) + ", end=" + ((Object) om1.c(this.c)) + ", bottom=" + ((Object) om1.c(this.d)) + ')';
    }
}
