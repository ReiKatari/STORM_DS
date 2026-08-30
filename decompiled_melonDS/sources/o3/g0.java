package o3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends i0 implements Iterable, oc.a {
    public final String A;
    public final float B;
    public final float L;
    public final float R;
    public final float X;
    public final float Y;
    public final float Z;

    /* renamed from: b0  reason: collision with root package name */
    public final float f10741b0;

    /* renamed from: c0  reason: collision with root package name */
    public final List f10742c0;

    /* renamed from: d0  reason: collision with root package name */
    public final List f10743d0;

    public g0(String str, float f8, float f10, float f11, float f12, float f13, float f14, float f15, List list, ArrayList arrayList) {
        this.A = str;
        this.B = f8;
        this.L = f10;
        this.R = f11;
        this.X = f12;
        this.Y = f13;
        this.Z = f14;
        this.f10741b0 = f15;
        this.f10742c0 = list;
        this.f10743d0 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof g0)) {
            g0 g0Var = (g0) obj;
            if (nc.k.a(this.A, g0Var.A) && this.B == g0Var.B && this.L == g0Var.L && this.R == g0Var.R && this.X == g0Var.X && this.Y == g0Var.Y && this.Z == g0Var.Z && this.f10741b0 == g0Var.f10741b0 && nc.k.a(this.f10742c0, g0Var.f10742c0) && nc.k.a(this.f10743d0, g0Var.f10743d0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int b10 = w.d.b(this.f10741b0, w.d.b(this.Z, w.d.b(this.Y, w.d.b(this.X, w.d.b(this.R, w.d.b(this.L, w.d.b(this.B, this.A.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        return this.f10743d0.hashCode() + ((this.f10742c0.hashCode() + b10) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f0(this);
    }
}
