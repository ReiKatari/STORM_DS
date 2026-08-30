package l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h1 implements d1 {

    /* renamed from: a  reason: collision with root package name */
    public final float f8567a;

    /* renamed from: b  reason: collision with root package name */
    public final float f8568b;

    /* renamed from: c  reason: collision with root package name */
    public final float f8569c;

    /* renamed from: d  reason: collision with root package name */
    public final float f8570d;

    public h1(float f8, float f10, float f11, float f12) {
        boolean z10;
        boolean z11;
        boolean z12;
        this.f8567a = f8;
        this.f8568b = f10;
        this.f8569c = f11;
        this.f8570d = f12;
        if (f8 >= 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (f10 >= 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z13 = z10 & z11;
        if (f11 >= 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!(z13 & z12 & (f12 >= 0.0f))) {
            m1.a.a("Padding must be non-negative");
        }
    }

    @Override // l1.d1
    public final float a() {
        return this.f8570d;
    }

    @Override // l1.d1
    public final float b() {
        return this.f8568b;
    }

    @Override // l1.d1
    public final float c(x4.m mVar) {
        if (mVar == x4.m.Ltr) {
            return this.f8567a;
        }
        return this.f8569c;
    }

    @Override // l1.d1
    public final float d(x4.m mVar) {
        if (mVar == x4.m.Ltr) {
            return this.f8569c;
        }
        return this.f8567a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h1) {
            h1 h1Var = (h1) obj;
            if (x4.f.b(this.f8567a, h1Var.f8567a) && x4.f.b(this.f8568b, h1Var.f8568b) && x4.f.b(this.f8569c, h1Var.f8569c) && x4.f.b(this.f8570d, h1Var.f8570d)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f8570d) + w.d.b(this.f8569c, w.d.b(this.f8568b, Float.hashCode(this.f8567a) * 31, 31), 31);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) x4.f.c(this.f8567a)) + ", top=" + ((Object) x4.f.c(this.f8568b)) + ", end=" + ((Object) x4.f.c(this.f8569c)) + ", bottom=" + ((Object) x4.f.c(this.f8570d)) + ')';
    }
}
