package j7;

import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public e0 f7737a;

    /* renamed from: b  reason: collision with root package name */
    public int f7738b;

    /* renamed from: c  reason: collision with root package name */
    public int f7739c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7740d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7741e;

    public y() {
        c();
    }

    public final void a() {
        int m;
        boolean z10 = this.f7740d;
        e0 e0Var = this.f7737a;
        if (z10) {
            m = e0Var.i();
        } else {
            m = e0Var.m();
        }
        this.f7739c = m;
    }

    public final void b(View view, int i2) {
        int n10;
        e0 e0Var = this.f7737a;
        int i10 = 0;
        if (Integer.MIN_VALUE == e0Var.f7541a) {
            n10 = 0;
        } else {
            n10 = e0Var.n() - e0Var.f7541a;
        }
        if (n10 >= 0) {
            boolean z10 = this.f7740d;
            e0 e0Var2 = this.f7737a;
            if (z10) {
                int d4 = e0Var2.d(view);
                e0 e0Var3 = this.f7737a;
                if (Integer.MIN_VALUE != e0Var3.f7541a) {
                    i10 = e0Var3.n() - e0Var3.f7541a;
                }
                this.f7739c = i10 + d4;
            } else {
                this.f7739c = e0Var2.g(view);
            }
            this.f7738b = i2;
            return;
        }
        this.f7738b = i2;
        boolean z11 = this.f7740d;
        e0 e0Var4 = this.f7737a;
        if (z11) {
            int i11 = (e0Var4.i() - n10) - this.f7737a.d(view);
            this.f7739c = this.f7737a.i() - i11;
            if (i11 > 0) {
                int e6 = this.f7739c - this.f7737a.e(view);
                int m = this.f7737a.m();
                int min = e6 - (Math.min(this.f7737a.g(view) - m, 0) + m);
                if (min < 0) {
                    this.f7739c = Math.min(i11, -min) + this.f7739c;
                    return;
                }
                return;
            }
            return;
        }
        int g10 = e0Var4.g(view);
        int m10 = g10 - this.f7737a.m();
        this.f7739c = g10;
        if (m10 > 0) {
            int i12 = (this.f7737a.i() - Math.min(0, (this.f7737a.i() - n10) - this.f7737a.d(view))) - (this.f7737a.e(view) + g10);
            if (i12 < 0) {
                this.f7739c -= Math.min(m10, -i12);
            }
        }
    }

    public final void c() {
        this.f7738b = -1;
        this.f7739c = Integer.MIN_VALUE;
        this.f7740d = false;
        this.f7741e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f7738b + ", mCoordinate=" + this.f7739c + ", mLayoutFromEnd=" + this.f7740d + ", mValid=" + this.f7741e + '}';
    }
}
