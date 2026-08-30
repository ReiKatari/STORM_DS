package fj;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f4976a;

    /* renamed from: b  reason: collision with root package name */
    public int f4977b;

    /* renamed from: c  reason: collision with root package name */
    public int f4978c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4979d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4980e;

    /* renamed from: f  reason: collision with root package name */
    public b0 f4981f;

    /* renamed from: g  reason: collision with root package name */
    public b0 f4982g;

    public b0(byte[] bArr, int i2, int i10, boolean z10) {
        bArr.getClass();
        this.f4976a = bArr;
        this.f4977b = i2;
        this.f4978c = i10;
        this.f4979d = z10;
        this.f4980e = false;
    }

    public final b0 a() {
        b0 b0Var = this.f4981f;
        if (b0Var == this) {
            b0Var = null;
        }
        b0 b0Var2 = this.f4982g;
        b0Var2.getClass();
        b0Var2.f4981f = this.f4981f;
        b0 b0Var3 = this.f4981f;
        b0Var3.getClass();
        b0Var3.f4982g = this.f4982g;
        this.f4981f = null;
        this.f4982g = null;
        return b0Var;
    }

    public final void b(b0 b0Var) {
        b0Var.getClass();
        b0Var.f4982g = this;
        b0Var.f4981f = this.f4981f;
        b0 b0Var2 = this.f4981f;
        b0Var2.getClass();
        b0Var2.f4982g = b0Var;
        this.f4981f = b0Var;
    }

    public final b0 c() {
        this.f4979d = true;
        return new b0(this.f4976a, this.f4977b, this.f4978c, true);
    }

    public final void d(b0 b0Var, int i2) {
        b0Var.getClass();
        if (b0Var.f4980e) {
            int i10 = b0Var.f4978c;
            int i11 = i10 + i2;
            if (i11 > 8192) {
                if (!b0Var.f4979d) {
                    int i12 = b0Var.f4977b;
                    if (i11 - i12 <= 8192) {
                        byte[] bArr = b0Var.f4976a;
                        zb.k.k(bArr, bArr, 0, i12, i10, 2);
                        b0Var.f4978c -= b0Var.f4977b;
                        b0Var.f4977b = 0;
                    } else {
                        j.b();
                        return;
                    }
                } else {
                    j.b();
                    return;
                }
            }
            byte[] bArr2 = b0Var.f4976a;
            int i13 = b0Var.f4978c;
            int i14 = this.f4977b;
            zb.k.f(i13, i14, i14 + i2, this.f4976a, bArr2);
            b0Var.f4978c += i2;
            this.f4977b += i2;
            return;
        }
        a0.j.p("only owner can write");
    }

    public b0() {
        this.f4976a = new byte[8192];
        this.f4980e = true;
        this.f4979d = false;
    }
}
