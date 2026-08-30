package n2;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q2 implements Iterator, oc.a {
    public final /* synthetic */ int A;
    public int B;
    public int L;
    public int R;
    public Object X;
    public final Object Y;

    public q2(jc.h hVar) {
        this.A = 1;
        this.Y = hVar;
        this.B = -1;
        int g10 = p7.j.g(0, 0, ((CharSequence) hVar.f7805b).length());
        this.L = g10;
        this.R = g10;
    }

    public void a() {
        jc.h hVar = (jc.h) this.Y;
        CharSequence charSequence = (CharSequence) hVar.f7805b;
        int i2 = this.R;
        int i10 = 0;
        if (i2 < 0) {
            this.B = 0;
            this.X = null;
            return;
        }
        if (i2 > charSequence.length()) {
            this.X = new sc.b(this.L, vc.h.d0(charSequence), 1);
            this.R = -1;
        } else {
            yb.j jVar = (yb.j) ((mc.p) hVar.f7806c).j(charSequence, Integer.valueOf(this.R));
            if (jVar == null) {
                this.X = new sc.b(this.L, vc.h.d0(charSequence), 1);
                this.R = -1;
            } else {
                int intValue = ((Number) jVar.A).intValue();
                int intValue2 = ((Number) jVar.B).intValue();
                this.X = p7.j.L(this.L, intValue);
                int i11 = intValue + intValue2;
                this.L = i11;
                if (intValue2 == 0) {
                    i10 = 1;
                }
                this.R = i11 + i10;
            }
        }
        this.B = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                throw null;
            default:
                if (this.B == -1) {
                    a();
                }
                if (this.B == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                throw null;
            default:
                if (this.B == -1) {
                    a();
                }
                if (this.B != 0) {
                    sc.d dVar = (sc.d) this.X;
                    dVar.getClass();
                    this.X = null;
                    this.B = -1;
                    return dVar;
                }
                fj.j.l();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q2(e2 e2Var, int i2, m0 m0Var, s sVar) {
        this.A = 0;
        this.X = e2Var;
        this.B = i2;
        this.Y = sVar;
        this.L = e2Var.f9899b0;
    }
}
