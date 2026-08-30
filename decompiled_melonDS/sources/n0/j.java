package n0;

import android.util.Rational;
import android.util.Size;
import j0.b0;
import j0.b1;
import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public int f9743a;

    /* renamed from: b  reason: collision with root package name */
    public int f9744b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9745c;

    /* renamed from: d  reason: collision with root package name */
    public final Serializable f9746d;

    public j(b0 b0Var, Rational rational) {
        this.f9743a = b0Var.b();
        this.f9744b = b0Var.c();
        this.f9746d = rational;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        this.f9745c = z10;
    }

    public Size a(b1 b1Var) {
        int p10 = b1Var.p();
        Size size = (Size) b1Var.h(b1.f7157u, null);
        int i2 = this.f9744b;
        int i10 = this.f9743a;
        if (size != null) {
            int x02 = ij.a.x0(p10);
            boolean z10 = true;
            if (1 != i2) {
                z10 = false;
            }
            int c02 = ij.a.c0(x02, z10, i10);
            if (c02 == 90 || c02 == 270) {
                return new Size(size.getHeight(), size.getWidth());
            }
        }
        return size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(xj.a... aVarArr) {
        this.f9743a = -1;
        this.f9744b = -1;
        this.f9745c = false;
        this.f9746d = aVarArr;
    }
}
