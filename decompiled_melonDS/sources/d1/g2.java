package d1;

import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g2 implements a2, n2.c, q4.q {
    public int A;
    public int B;
    public final Object L;

    public g2(int i2, int i10, v vVar) {
        this.A = i2;
        this.B = i10;
        this.L = new b9.e(new a0(i2, i10, vVar));
    }

    @Override // d1.a2
    public int A() {
        return this.B;
    }

    @Override // d1.y1
    public p F(long j2, p pVar, p pVar2, p pVar3) {
        return ((b9.e) this.L).F(j2, pVar, pVar2, pVar3);
    }

    @Override // d1.a2
    public int J() {
        return this.A;
    }

    @Override // d1.y1
    public p L(long j2, p pVar, p pVar2, p pVar3) {
        return ((b9.e) this.L).L(j2, pVar, pVar2, pVar3);
    }

    @Override // n2.c
    public void b(Object obj, mc.p pVar) {
        ((n2.c) this.L).b(obj, pVar);
    }

    @Override // n2.c
    public void d(int i2, Object obj) {
        int i10;
        n2.c cVar = (n2.c) this.L;
        if (this.B == 0) {
            i10 = this.A;
        } else {
            i10 = 0;
        }
        cVar.d(i2 + i10, obj);
    }

    @Override // n2.c
    public void e(Object obj) {
        this.B++;
        ((n2.c) this.L).e(obj);
    }

    @Override // n2.c
    public void f() {
        ((n2.c) this.L).f();
    }

    @Override // n2.c
    public void g(int i2, Object obj) {
        int i10;
        n2.c cVar = (n2.c) this.L;
        if (this.B == 0) {
            i10 = this.A;
        } else {
            i10 = 0;
        }
        cVar.g(i2 + i10, obj);
    }

    @Override // n2.c
    public void i(int i2, int i10, int i11) {
        int i12;
        if (this.B == 0) {
            i12 = this.A;
        } else {
            i12 = 0;
        }
        ((n2.c) this.L).i(i2 + i12, i10 + i12, i11);
    }

    @Override // n2.c
    public Object j() {
        return ((n2.c) this.L).j();
    }

    @Override // n2.c
    public void k(int i2, int i10) {
        int i11;
        n2.c cVar = (n2.c) this.L;
        if (this.B == 0) {
            i11 = this.A;
        } else {
            i11 = 0;
        }
        cVar.k(i2 + i11, i10);
    }

    @Override // q4.q
    public int l(int i2) {
        int l10 = ((q4.q) this.L).l(i2);
        if (i2 >= 0 && i2 <= this.B) {
            u1.r1.c(l10, this.A, i2);
        }
        return l10;
    }

    @Override // q4.q
    public int m(int i2) {
        int m = ((q4.q) this.L).m(i2);
        if (i2 >= 0 && i2 <= this.A) {
            u1.r1.b(m, this.B, i2);
        }
        return m;
    }

    @Override // n2.c
    public void n() {
        if (this.B <= 0) {
            n2.t.a("OffsetApplier up called with no corresponding down");
        }
        this.B--;
        ((n2.c) this.L).n();
    }

    public g2(q4.q qVar, int i2, int i10) {
        this.L = qVar;
        this.A = i2;
        this.B = i10;
    }

    public g2(n2.c cVar, int i2) {
        this.L = cVar;
        this.A = i2;
    }

    public g2(int i2, int i10, mc.a aVar) {
        this.A = i2;
        this.B = i10;
        this.L = aVar;
    }

    public g2() {
        this.L = new g2[256];
        this.A = 0;
        this.B = 0;
    }

    public g2(int i2, int i10) {
        this.L = null;
        this.A = i2;
        int i11 = i10 & 7;
        this.B = i11 == 0 ? 8 : i11;
    }

    public g2(View view) {
        this.L = view;
    }
}
