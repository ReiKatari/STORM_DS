package defpackage;

import java.util.ConcurrentModificationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wm4  reason: default package */
/* loaded from: classes.dex */
public class wm4 extends um4 {
    public final vm4 R;
    public Object X;
    public boolean Y;
    public int Z;

    public wm4(vm4 vm4Var, gy6[] gy6VarArr) {
        super(vm4Var.L, gy6VarArr);
        this.R = vm4Var;
        this.Z = vm4Var.X;
    }

    public final void c(int i, fy6 fy6Var, Object obj, int i2) {
        int i3 = i2 * 5;
        gy6[] gy6VarArr = this.A;
        if (i3 > 30) {
            gy6 gy6Var = gy6VarArr[i2];
            Object[] objArr = fy6Var.d;
            gy6Var.a(objArr, objArr.length, 0);
            while (true) {
                gy6 gy6Var2 = gy6VarArr[i2];
                if (!b53.x(gy6Var2.A[gy6Var2.L], obj)) {
                    gy6VarArr[i2].L += 2;
                } else {
                    this.B = i2;
                    return;
                }
            }
        } else {
            int z = 1 << yf2.z(i, i3);
            if (fy6Var.h(z)) {
                gy6VarArr[i2].a(fy6Var.d, Integer.bitCount(fy6Var.a) * 2, fy6Var.f(z));
                this.B = i2;
                return;
            }
            int t = fy6Var.t(z);
            fy6 s = fy6Var.s(t);
            gy6VarArr[i2].a(fy6Var.d, Integer.bitCount(fy6Var.a) * 2, t);
            c(i, s, obj, i2 + 1);
        }
    }

    @Override // defpackage.um4, java.util.Iterator
    public final Object next() {
        if (this.R.X == this.Z) {
            if (this.L) {
                gy6 gy6Var = this.A[this.B];
                this.X = gy6Var.A[gy6Var.L];
                this.Y = true;
                return super.next();
            }
            vd6.b();
            return null;
        }
        throw new ConcurrentModificationException();
    }

    @Override // defpackage.um4, java.util.Iterator
    public final void remove() {
        int i;
        if (this.Y) {
            boolean z = this.L;
            vm4 vm4Var = this.R;
            if (z) {
                if (z) {
                    gy6 gy6Var = this.A[this.B];
                    Object obj = gy6Var.A[gy6Var.L];
                    l07.o(vm4Var).remove(this.X);
                    if (obj != null) {
                        i = obj.hashCode();
                    } else {
                        i = 0;
                    }
                    c(i, vm4Var.L, obj, 0);
                } else {
                    vd6.b();
                    return;
                }
            } else {
                l07.o(vm4Var).remove(this.X);
            }
            this.X = null;
            this.Y = false;
            this.Z = vm4Var.X;
            return;
        }
        f81.o();
    }
}
