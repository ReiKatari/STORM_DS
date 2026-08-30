package f5;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends t {
    @Override // f5.d
    public final void a(d dVar) {
        e5.a aVar = (e5.a) this.f4891b;
        int i2 = aVar.f4258v0;
        g gVar = this.f4897h;
        ArrayList arrayList = gVar.f4874l;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = -1;
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            int i13 = ((g) obj).f4869g;
            if (i11 == -1 || i13 < i11) {
                i11 = i13;
            }
            if (i10 < i13) {
                i10 = i13;
            }
        }
        if (i2 != 0 && i2 != 2) {
            gVar.d(i10 + aVar.f4260x0);
        } else {
            gVar.d(i11 + aVar.f4260x0);
        }
    }

    @Override // f5.t
    public final void d() {
        e5.g gVar = this.f4891b;
        if (gVar instanceof e5.a) {
            g gVar2 = this.f4897h;
            gVar2.f4864b = true;
            ArrayList arrayList = gVar2.f4874l;
            e5.a aVar = (e5.a) gVar;
            int i2 = aVar.f4258v0;
            boolean z10 = aVar.f4259w0;
            int i10 = 0;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            gVar2.f4867e = f.BOTTOM;
                            while (i10 < aVar.f4368u0) {
                                e5.g gVar3 = aVar.f4367t0[i10];
                                if (z10 || gVar3.f4303h0 != 8) {
                                    g gVar4 = gVar3.f4296e.f4898i;
                                    gVar4.f4873k.add(gVar2);
                                    arrayList.add(gVar4);
                                }
                                i10++;
                            }
                            m(this.f4891b.f4296e.f4897h);
                            m(this.f4891b.f4296e.f4898i);
                            return;
                        }
                        return;
                    }
                    gVar2.f4867e = f.TOP;
                    while (i10 < aVar.f4368u0) {
                        e5.g gVar5 = aVar.f4367t0[i10];
                        if (z10 || gVar5.f4303h0 != 8) {
                            g gVar6 = gVar5.f4296e.f4897h;
                            gVar6.f4873k.add(gVar2);
                            arrayList.add(gVar6);
                        }
                        i10++;
                    }
                    m(this.f4891b.f4296e.f4897h);
                    m(this.f4891b.f4296e.f4898i);
                    return;
                }
                gVar2.f4867e = f.RIGHT;
                while (i10 < aVar.f4368u0) {
                    e5.g gVar7 = aVar.f4367t0[i10];
                    if (z10 || gVar7.f4303h0 != 8) {
                        g gVar8 = gVar7.f4294d.f4898i;
                        gVar8.f4873k.add(gVar2);
                        arrayList.add(gVar8);
                    }
                    i10++;
                }
                m(this.f4891b.f4294d.f4897h);
                m(this.f4891b.f4294d.f4898i);
                return;
            }
            gVar2.f4867e = f.LEFT;
            while (i10 < aVar.f4368u0) {
                e5.g gVar9 = aVar.f4367t0[i10];
                if (z10 || gVar9.f4303h0 != 8) {
                    g gVar10 = gVar9.f4294d.f4897h;
                    gVar10.f4873k.add(gVar2);
                    arrayList.add(gVar10);
                }
                i10++;
            }
            m(this.f4891b.f4294d.f4897h);
            m(this.f4891b.f4294d.f4898i);
        }
    }

    @Override // f5.t
    public final void e() {
        e5.g gVar = this.f4891b;
        if (gVar instanceof e5.a) {
            int i2 = ((e5.a) gVar).f4258v0;
            g gVar2 = this.f4897h;
            if (i2 != 0 && i2 != 1) {
                gVar.f4289a0 = gVar2.f4869g;
            } else {
                gVar.Z = gVar2.f4869g;
            }
        }
    }

    @Override // f5.t
    public final void f() {
        this.f4892c = null;
        this.f4897h.c();
    }

    @Override // f5.t
    public final boolean k() {
        return false;
    }

    public final void m(g gVar) {
        g gVar2 = this.f4897h;
        gVar2.f4873k.add(gVar);
        gVar.f4874l.add(gVar2);
    }
}
