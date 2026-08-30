package j7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final d2.t f7502a;

    /* renamed from: b  reason: collision with root package name */
    public int f7503b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f7504c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f7505d = -1;

    public b(d2.t tVar) {
        this.f7502a = tVar;
    }

    public final void a() {
        k0 k0Var = (k0) this.f7502a.B;
        int i2 = this.f7503b;
        if (i2 == 0) {
            return;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    k0Var.f7619a.d(this.f7504c, this.f7505d, null);
                }
            } else {
                k0Var.f7619a.f(this.f7504c, this.f7505d);
            }
        } else {
            k0Var.f7619a.e(this.f7504c, this.f7505d);
        }
        this.f7503b = 0;
    }

    public final void b(int i2, int i10) {
        int i11;
        int i12;
        int i13;
        if (this.f7503b == 3 && i2 <= (i12 = this.f7505d + (i11 = this.f7504c)) && (i13 = i2 + i10) >= i11) {
            this.f7504c = Math.min(i2, i11);
            this.f7505d = Math.max(i12, i13) - this.f7504c;
            return;
        }
        a();
        this.f7504c = i2;
        this.f7505d = i10;
        this.f7503b = 3;
    }

    public final void c(int i2, int i10) {
        a();
        ((k0) this.f7502a.B).f7619a.c(i2, i10);
    }
}
