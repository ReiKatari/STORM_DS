package androidx.lifecycle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final g0 f1450a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1451b;

    /* renamed from: c  reason: collision with root package name */
    public int f1452c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d0 f1453d;

    public c0(d0 d0Var, g0 g0Var) {
        this.f1453d = d0Var;
        this.f1450a = g0Var;
    }

    public final void a(boolean z10) {
        int i2;
        boolean z11;
        boolean z12;
        if (z10 != this.f1451b) {
            this.f1451b = z10;
            if (z10) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            d0 d0Var = this.f1453d;
            int i10 = d0Var.f1462c;
            d0Var.f1462c = i2 + i10;
            if (!d0Var.f1463d) {
                d0Var.f1463d = true;
                while (true) {
                    try {
                        int i11 = d0Var.f1462c;
                        if (i10 == i11) {
                            break;
                        }
                        if (i10 == 0 && i11 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (i10 > 0 && i11 == 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z11) {
                            d0Var.e();
                        } else if (z12) {
                            d0Var.f();
                        }
                        i10 = i11;
                    } catch (Throwable th2) {
                        d0Var.f1463d = false;
                        throw th2;
                    }
                }
                d0Var.f1463d = false;
            }
            if (this.f1451b) {
                d0Var.b(this);
            }
        }
    }
}
