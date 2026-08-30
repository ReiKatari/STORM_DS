package f5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends t {
    @Override // f5.d
    public final void a(d dVar) {
        g gVar = this.f4897h;
        if (!gVar.f4865c || gVar.f4872j) {
            return;
        }
        gVar.d((int) ((((g) gVar.f4874l.get(0)).f4869g * ((e5.l) this.f4891b).f4361t0) + 0.5f));
    }

    @Override // f5.t
    public final void d() {
        e5.g gVar = this.f4891b;
        e5.l lVar = (e5.l) gVar;
        int i2 = lVar.f4362u0;
        int i10 = lVar.f4363v0;
        int i11 = lVar.f4365x0;
        g gVar2 = this.f4897h;
        if (i11 == 1) {
            if (i2 != -1) {
                gVar2.f4874l.add(gVar.U.f4294d.f4897h);
                this.f4891b.U.f4294d.f4897h.f4873k.add(gVar2);
                gVar2.f4868f = i2;
            } else if (i10 != -1) {
                gVar2.f4874l.add(gVar.U.f4294d.f4898i);
                this.f4891b.U.f4294d.f4898i.f4873k.add(gVar2);
                gVar2.f4868f = -i10;
            } else {
                gVar2.f4864b = true;
                gVar2.f4874l.add(gVar.U.f4294d.f4898i);
                this.f4891b.U.f4294d.f4898i.f4873k.add(gVar2);
            }
            m(this.f4891b.f4294d.f4897h);
            m(this.f4891b.f4294d.f4898i);
            return;
        }
        if (i2 != -1) {
            gVar2.f4874l.add(gVar.U.f4296e.f4897h);
            this.f4891b.U.f4296e.f4897h.f4873k.add(gVar2);
            gVar2.f4868f = i2;
        } else if (i10 != -1) {
            gVar2.f4874l.add(gVar.U.f4296e.f4898i);
            this.f4891b.U.f4296e.f4898i.f4873k.add(gVar2);
            gVar2.f4868f = -i10;
        } else {
            gVar2.f4864b = true;
            gVar2.f4874l.add(gVar.U.f4296e.f4898i);
            this.f4891b.U.f4296e.f4898i.f4873k.add(gVar2);
        }
        m(this.f4891b.f4296e.f4897h);
        m(this.f4891b.f4296e.f4898i);
    }

    @Override // f5.t
    public final void e() {
        e5.g gVar = this.f4891b;
        int i2 = ((e5.l) gVar).f4365x0;
        g gVar2 = this.f4897h;
        if (i2 == 1) {
            gVar.Z = gVar2.f4869g;
        } else {
            gVar.f4289a0 = gVar2.f4869g;
        }
    }

    @Override // f5.t
    public final void f() {
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
