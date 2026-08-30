package f2;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4788a;

    /* renamed from: b  reason: collision with root package name */
    public int f4789b;

    /* renamed from: c  reason: collision with root package name */
    public int f4790c;

    /* renamed from: d  reason: collision with root package name */
    public int f4791d;

    /* renamed from: e  reason: collision with root package name */
    public Object f4792e;

    public s(int i2, int i10, int i11, l4.o0 o0Var) {
        this.f4788a = 0;
        this.f4789b = i2;
        this.f4790c = i10;
        this.f4791d = i11;
        this.f4792e = o0Var;
    }

    public void a(int i2, int i10) {
        if (i2 >= 0) {
            if (i10 >= 0) {
                int i11 = this.f4791d;
                int i12 = i11 * 2;
                int[] iArr = (int[]) this.f4792e;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4792e = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[i11 * 4];
                    this.f4792e = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = (int[]) this.f4792e;
                iArr4[i12] = i2;
                iArr4[i12 + 1] = i10;
                this.f4791d++;
                return;
            }
            a0.j.h("Pixel distance must be non-negative");
            return;
        }
        a0.j.h("Layout positions must be non-negative");
    }

    public u b(int i2) {
        return new u(ij.a.g0((l4.o0) this.f4792e, i2), i2, 1L);
    }

    public void c(RecyclerView recyclerView, boolean z10) {
        this.f4791d = 0;
        int[] iArr = (int[]) this.f4792e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        j7.u0 u0Var = recyclerView.f1640k0;
        if (recyclerView.f1638j0 != null && u0Var != null && u0Var.f7716i) {
            if (z10) {
                if (!recyclerView.f1622b0.j()) {
                    u0Var.i(recyclerView.f1638j0.a(), this);
                }
            } else if (!recyclerView.P()) {
                u0Var.h(this.f4789b, this.f4790c, recyclerView.f1621a1, this);
            }
            int i2 = this.f4791d;
            if (i2 > u0Var.f7717j) {
                u0Var.f7717j = i2;
                u0Var.f7718k = z10;
                recyclerView.L.q();
            }
        }
    }

    public int d() {
        return this.f4791d - this.f4790c;
    }

    public int e(int i2) {
        return ((o2.k0) this.f4792e).f10646f[this.f4790c + i2];
    }

    public Object f(int i2) {
        return ((o2.k0) this.f4792e).f10648h[this.f4791d + i2];
    }

    public String toString() {
        switch (this.f4788a) {
            case 0:
                StringBuilder sb2 = new StringBuilder("SelectionInfo(id=1, range=(");
                int i2 = this.f4789b;
                sb2.append(i2);
                sb2.append('-');
                l4.o0 o0Var = (l4.o0) this.f4792e;
                sb2.append(ij.a.g0(o0Var, i2));
                sb2.append(',');
                int i10 = this.f4790c;
                sb2.append(i10);
                sb2.append('-');
                sb2.append(ij.a.g0(o0Var, i10));
                sb2.append("), prevOffset=");
                return w.d.p(sb2, this.f4791d, ')');
            case 3:
                return "";
            default:
                return super.toString();
        }
    }

    public s(o2.k0 k0Var) {
        this.f4788a = 2;
        this.f4792e = k0Var;
    }

    public /* synthetic */ s(int i2) {
        this.f4788a = i2;
    }
}
