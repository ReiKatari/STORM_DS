package s2;

import java.util.ConcurrentModificationException;
import nc.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class e extends c {
    public final d R;
    public Object X;
    public boolean Y;
    public int Z;

    public e(d dVar, l[] lVarArr) {
        super(dVar.L, lVarArr);
        this.R = dVar;
        this.Z = dVar.X;
    }

    public final void c(int i2, k kVar, Object obj, int i10) {
        int i11 = i10 * 5;
        l[] lVarArr = this.A;
        if (i11 > 30) {
            l lVar = lVarArr[i10];
            Object[] objArr = kVar.f12821d;
            lVar.a(objArr, objArr.length, 0);
            while (true) {
                l lVar2 = lVarArr[i10];
                if (!nc.k.a(lVar2.A[lVar2.L], obj)) {
                    lVarArr[i10].L += 2;
                } else {
                    this.B = i10;
                    return;
                }
            }
        } else {
            int q10 = 1 << p7.a.q(i2, i11);
            if (kVar.h(q10)) {
                lVarArr[i10].a(kVar.f12821d, Integer.bitCount(kVar.f12818a) * 2, kVar.f(q10));
                this.B = i10;
                return;
            }
            int t5 = kVar.t(q10);
            k s10 = kVar.s(t5);
            lVarArr[i10].a(kVar.f12821d, Integer.bitCount(kVar.f12818a) * 2, t5);
            c(i2, s10, obj, i10 + 1);
        }
    }

    @Override // s2.c, java.util.Iterator
    public final Object next() {
        if (this.R.X == this.Z) {
            if (this.L) {
                l lVar = this.A[this.B];
                this.X = lVar.A[lVar.L];
                this.Y = true;
                return super.next();
            }
            fj.j.l();
            return null;
        }
        throw new ConcurrentModificationException();
    }

    @Override // s2.c, java.util.Iterator
    public final void remove() {
        int i2;
        if (this.Y) {
            boolean z10 = this.L;
            d dVar = this.R;
            if (z10) {
                if (z10) {
                    l lVar = this.A[this.B];
                    Object obj = lVar.A[lVar.L];
                    w.a(dVar).remove(this.X);
                    if (obj != null) {
                        i2 = obj.hashCode();
                    } else {
                        i2 = 0;
                    }
                    c(i2, dVar.L, obj, 0);
                } else {
                    fj.j.l();
                    return;
                }
            } else {
                w.a(dVar).remove(this.X);
            }
            this.X = null;
            this.Y = false;
            this.Z = dVar.X;
            return;
        }
        throw new IllegalStateException();
    }
}
