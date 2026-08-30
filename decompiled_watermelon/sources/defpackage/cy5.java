package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cy5  reason: default package */
/* loaded from: classes.dex */
public final class cy5 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public cy5 f;
    public cy5 g;

    public cy5(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final cy5 a() {
        cy5 cy5Var = this.f;
        if (cy5Var == this) {
            cy5Var = null;
        }
        cy5 cy5Var2 = this.g;
        cy5Var2.getClass();
        cy5Var2.f = this.f;
        cy5 cy5Var3 = this.f;
        cy5Var3.getClass();
        cy5Var3.g = this.g;
        this.f = null;
        this.g = null;
        return cy5Var;
    }

    public final void b(cy5 cy5Var) {
        cy5Var.getClass();
        cy5Var.g = this;
        cy5Var.f = this.f;
        cy5 cy5Var2 = this.f;
        cy5Var2.getClass();
        cy5Var2.g = cy5Var;
        this.f = cy5Var;
    }

    public final cy5 c() {
        this.d = true;
        return new cy5(this.a, this.b, this.c, true);
    }

    public final void d(cy5 cy5Var, int i) {
        cy5Var.getClass();
        byte[] bArr = cy5Var.a;
        if (cy5Var.e) {
            int i2 = cy5Var.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!cy5Var.d) {
                    int i4 = cy5Var.b;
                    if (i3 - i4 <= 8192) {
                        nu.g0(i4, i2, 2, bArr, bArr);
                        cy5Var.c -= cy5Var.b;
                        cy5Var.b = 0;
                    } else {
                        c44.r();
                        return;
                    }
                } else {
                    c44.r();
                    return;
                }
            }
            int i5 = cy5Var.c;
            int i6 = this.b;
            nu.c0(i5, i6, i6 + i, this.a, bArr);
            cy5Var.c += i;
            this.b += i;
            return;
        }
        i.n("only owner can write");
    }

    public cy5() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
