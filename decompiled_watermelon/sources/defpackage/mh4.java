package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mh4  reason: default package */
/* loaded from: classes.dex */
public final class mh4 implements ih4 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public mh4(float f, float f2, float f3, float f4) {
        boolean z;
        boolean z2;
        boolean z3;
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (f >= RecyclerView.A1) {
            z = true;
        } else {
            z = false;
        }
        if (f2 >= RecyclerView.A1) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z & z2;
        if (f3 >= RecyclerView.A1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!(z4 & z3 & (f4 >= RecyclerView.A1))) {
            kz2.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.ih4
    public final float a(sd3 sd3Var) {
        if (sd3Var == sd3.Ltr) {
            return this.a;
        }
        return this.c;
    }

    @Override // defpackage.ih4
    public final float b(sd3 sd3Var) {
        if (sd3Var == sd3.Ltr) {
            return this.c;
        }
        return this.a;
    }

    @Override // defpackage.ih4
    public final float c() {
        return this.d;
    }

    @Override // defpackage.ih4
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mh4) {
            mh4 mh4Var = (mh4) obj;
            if (ji1.b(this.a, mh4Var.a) && ji1.b(this.b, mh4Var.b) && ji1.b(this.c, mh4Var.c) && ji1.b(this.d, mh4Var.d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ej6.a(this.c, ej6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) ji1.c(this.a)) + ", top=" + ((Object) ji1.c(this.b)) + ", end=" + ((Object) ji1.c(this.c)) + ", bottom=" + ((Object) ji1.c(this.d)) + ')';
    }
}
