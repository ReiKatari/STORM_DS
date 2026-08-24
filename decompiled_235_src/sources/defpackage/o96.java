package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o96  reason: default package */
/* loaded from: classes.dex */
public final class o96 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public o96 f;
    public o96 g;

    public o96(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    public final o96 a() {
        o96 o96Var = this.f;
        if (o96Var == this) {
            o96Var = null;
        }
        o96 o96Var2 = this.g;
        o96Var2.getClass();
        o96Var2.f = this.f;
        o96 o96Var3 = this.f;
        o96Var3.getClass();
        o96Var3.g = this.g;
        this.f = null;
        this.g = null;
        return o96Var;
    }

    public final void b(o96 o96Var) {
        o96Var.getClass();
        o96Var.g = this;
        o96Var.f = this.f;
        o96 o96Var2 = this.f;
        o96Var2.getClass();
        o96Var2.g = o96Var;
        this.f = o96Var;
    }

    public final o96 c() {
        this.d = true;
        return new o96(this.a, this.b, this.c, true, false);
    }

    public final void d(o96 o96Var, int i) {
        o96Var.getClass();
        byte[] bArr = o96Var.a;
        if (o96Var.e) {
            int i2 = o96Var.c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!o96Var.d) {
                    int i4 = o96Var.b;
                    if (i3 - i4 <= 8192) {
                        fv.u0(i4, i2, 2, bArr, bArr);
                        o96Var.c -= o96Var.b;
                        o96Var.b = 0;
                    } else {
                        u34.t();
                        return;
                    }
                } else {
                    u34.t();
                    return;
                }
            }
            int i5 = o96Var.c;
            int i6 = this.b;
            fv.q0(i5, i6, i6 + i, this.a, bArr);
            o96Var.c += i;
            this.b += i;
            return;
        }
        i.m("only owner can write");
    }

    public o96() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }
}
