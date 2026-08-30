package f5;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends t {

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f4852k;

    /* renamed from: l  reason: collision with root package name */
    public int f4853l;

    public c(e5.g gVar, int i2) {
        super(gVar);
        e5.g gVar2;
        d dVar;
        int i10;
        d dVar2;
        ArrayList arrayList = new ArrayList();
        this.f4852k = arrayList;
        this.f4895f = i2;
        e5.g gVar3 = this.f4891b;
        e5.g n10 = gVar3.n(i2);
        while (true) {
            gVar2 = gVar3;
            gVar3 = n10;
            if (gVar3 == null) {
                break;
            }
            n10 = gVar3.n(this.f4895f);
        }
        this.f4891b = gVar2;
        int i11 = this.f4895f;
        if (i11 == 0) {
            dVar = gVar2.f4294d;
        } else if (i11 == 1) {
            dVar = gVar2.f4296e;
        } else {
            dVar = null;
        }
        arrayList.add(dVar);
        e5.g m = gVar2.m(this.f4895f);
        while (m != null) {
            int i12 = this.f4895f;
            if (i12 == 0) {
                dVar2 = m.f4294d;
            } else if (i12 == 1) {
                dVar2 = m.f4296e;
            } else {
                dVar2 = null;
            }
            arrayList.add(dVar2);
            m = m.m(this.f4895f);
        }
        int size = arrayList.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList.get(i13);
            i13++;
            t tVar = (t) obj;
            int i14 = this.f4895f;
            if (i14 == 0) {
                tVar.f4891b.f4290b = this;
            } else if (i14 == 1) {
                tVar.f4891b.f4292c = this;
            }
        }
        if (this.f4895f == 0 && ((e5.h) this.f4891b.U).f4336y0 && arrayList.size() > 1) {
            this.f4891b = ((t) arrayList.get(arrayList.size() - 1)).f4891b;
        }
        int i15 = this.f4895f;
        e5.g gVar4 = this.f4891b;
        if (i15 == 0) {
            i10 = gVar4.f4309k0;
        } else {
            i10 = gVar4.f4311l0;
        }
        this.f4853l = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x039b, code lost:
        r2 = r2 - r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    @Override // f5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(f5.d r27) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.c.a(f5.d):void");
    }

    @Override // f5.t
    public final void d() {
        ArrayList arrayList = this.f4852k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((t) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        e5.g gVar = ((t) arrayList.get(0)).f4891b;
        e5.g gVar2 = ((t) arrayList.get(size2 - 1)).f4891b;
        int i10 = this.f4895f;
        g gVar3 = this.f4898i;
        g gVar4 = this.f4897h;
        if (i10 == 0) {
            e5.d dVar = gVar.I;
            e5.d dVar2 = gVar2.K;
            g i11 = t.i(dVar, 0);
            int e6 = dVar.e();
            e5.g m = m();
            if (m != null) {
                e6 = m.I.e();
            }
            if (i11 != null) {
                t.b(gVar4, i11, e6);
            }
            g i12 = t.i(dVar2, 0);
            int e10 = dVar2.e();
            e5.g n10 = n();
            if (n10 != null) {
                e10 = n10.K.e();
            }
            if (i12 != null) {
                t.b(gVar3, i12, -e10);
            }
        } else {
            e5.d dVar3 = gVar.J;
            e5.d dVar4 = gVar2.L;
            g i13 = t.i(dVar3, 1);
            int e11 = dVar3.e();
            e5.g m10 = m();
            if (m10 != null) {
                e11 = m10.J.e();
            }
            if (i13 != null) {
                t.b(gVar4, i13, e11);
            }
            g i14 = t.i(dVar4, 1);
            int e12 = dVar4.e();
            e5.g n11 = n();
            if (n11 != null) {
                e12 = n11.L.e();
            }
            if (i14 != null) {
                t.b(gVar3, i14, -e12);
            }
        }
        gVar4.f4863a = this;
        gVar3.f4863a = this;
    }

    @Override // f5.t
    public final void e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4852k;
            if (i2 < arrayList.size()) {
                ((t) arrayList.get(i2)).e();
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // f5.t
    public final void f() {
        this.f4892c = null;
        ArrayList arrayList = this.f4852k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((t) obj).f();
        }
    }

    @Override // f5.t
    public final long j() {
        ArrayList arrayList = this.f4852k;
        int size = arrayList.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            t tVar = (t) arrayList.get(i2);
            j2 = tVar.f4898i.f4868f + tVar.j() + j2 + tVar.f4897h.f4868f;
        }
        return j2;
    }

    @Override // f5.t
    public final boolean k() {
        ArrayList arrayList = this.f4852k;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((t) arrayList.get(i2)).k()) {
                return false;
            }
        }
        return true;
    }

    public final e5.g m() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f4852k;
            if (i2 < arrayList.size()) {
                e5.g gVar = ((t) arrayList.get(i2)).f4891b;
                if (gVar.f4303h0 != 8) {
                    return gVar;
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    public final e5.g n() {
        ArrayList arrayList = this.f4852k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e5.g gVar = ((t) arrayList.get(size)).f4891b;
            if (gVar.f4303h0 != 8) {
                return gVar;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        if (this.f4895f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb2.append(str);
        ArrayList arrayList = this.f4852k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            sb2.append("<");
            sb2.append((t) obj);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
