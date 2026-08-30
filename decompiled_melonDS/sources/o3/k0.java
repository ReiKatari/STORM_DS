package o3;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 extends i0 {
    public final String A;
    public final List B;
    public final int L;
    public final i3.o R;
    public final float X;
    public final i3.o Y;
    public final float Z;

    /* renamed from: b0  reason: collision with root package name */
    public final float f10781b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int f10782c0;

    /* renamed from: d0  reason: collision with root package name */
    public final int f10783d0;

    /* renamed from: e0  reason: collision with root package name */
    public final float f10784e0;

    /* renamed from: f0  reason: collision with root package name */
    public final float f10785f0;

    /* renamed from: g0  reason: collision with root package name */
    public final float f10786g0;

    /* renamed from: h0  reason: collision with root package name */
    public final float f10787h0;

    public k0(String str, List list, int i2, i3.o oVar, float f8, i3.o oVar2, float f10, float f11, int i10, int i11, float f12, float f13, float f14, float f15) {
        this.A = str;
        this.B = list;
        this.L = i2;
        this.R = oVar;
        this.X = f8;
        this.Y = oVar2;
        this.Z = f10;
        this.f10781b0 = f11;
        this.f10782c0 = i10;
        this.f10783d0 = i11;
        this.f10784e0 = f12;
        this.f10785f0 = f13;
        this.f10786g0 = f14;
        this.f10787h0 = f15;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && k0.class == obj.getClass()) {
                k0 k0Var = (k0) obj;
                if (this.A.equals(k0Var.A) && nc.k.a(this.R, k0Var.R) && this.X == k0Var.X && nc.k.a(this.Y, k0Var.Y) && this.Z == k0Var.Z && this.f10781b0 == k0Var.f10781b0 && this.f10782c0 == k0Var.f10782c0 && this.f10783d0 == k0Var.f10783d0 && this.f10784e0 == k0Var.f10784e0 && this.f10785f0 == k0Var.f10785f0 && this.f10786g0 == k0Var.f10786g0 && this.f10787h0 == k0Var.f10787h0 && this.L == k0Var.L && nc.k.a(this.B, k0Var.B)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (this.B.hashCode() + (this.A.hashCode() * 31)) * 31;
        int i10 = 0;
        i3.o oVar = this.R;
        if (oVar != null) {
            i2 = oVar.hashCode();
        } else {
            i2 = 0;
        }
        int b10 = w.d.b(this.X, (hashCode + i2) * 31, 31);
        i3.o oVar2 = this.Y;
        if (oVar2 != null) {
            i10 = oVar2.hashCode();
        }
        return Integer.hashCode(this.L) + w.d.b(this.f10787h0, w.d.b(this.f10786g0, w.d.b(this.f10785f0, w.d.b(this.f10784e0, w.d.c(this.f10783d0, w.d.c(this.f10782c0, w.d.b(this.f10781b0, w.d.b(this.Z, (b10 + i10) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
