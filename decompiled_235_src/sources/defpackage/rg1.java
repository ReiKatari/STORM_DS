package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rg1  reason: default package */
/* loaded from: classes.dex */
public final class rg1 {
    public final fj6 a;
    public final y56 b;
    public final x97 c;
    public final n05 d;
    public final Boolean e;
    public final ra0 f;
    public final ra0 g;

    public rg1(fj6 fj6Var, y56 y56Var, x97 x97Var, n05 n05Var, Boolean bool, ra0 ra0Var, ra0 ra0Var2) {
        this.a = fj6Var;
        this.b = y56Var;
        this.c = x97Var;
        this.d = n05Var;
        this.e = bool;
        this.f = ra0Var;
        this.g = ra0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rg1) {
            rg1 rg1Var = (rg1) obj;
            if (nb3.k(this.a, rg1Var.a) && this.b == rg1Var.b && nb3.k(this.c, rg1Var.c) && this.d == rg1Var.d && nb3.k(this.e, rg1Var.e) && this.f == rg1Var.f && this.g == rg1Var.g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        fj6 fj6Var = this.a;
        if (fj6Var != null) {
            i = fj6Var.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        y56 y56Var = this.b;
        if (y56Var != null) {
            i2 = y56Var.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 28629151;
        x97 x97Var = this.c;
        if (x97Var != null) {
            i3 = x97Var.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        n05 n05Var = this.d;
        if (n05Var != null) {
            i4 = n05Var.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 961;
        Boolean bool = this.e;
        if (bool != null) {
            i5 = bool.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 961;
        ra0 ra0Var = this.f;
        if (ra0Var != null) {
            i6 = ra0Var.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        ra0 ra0Var2 = this.g;
        if (ra0Var2 != null) {
            i7 = ra0Var2.hashCode();
        }
        return (i13 + i7) * 31;
    }
}
