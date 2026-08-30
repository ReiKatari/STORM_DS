package p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends b3.o {

    /* renamed from: i0  reason: collision with root package name */
    public j4.d f11204i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ d f11205j0;

    public c(d dVar) {
        this.f11205j0 = dVar;
    }

    @Override // b3.o
    public final void G0() {
        d dVar = this.f11205j0;
        dVar.f11206a = this;
        if (dVar.f11207b != null) {
            O0();
        }
    }

    @Override // b3.o
    public final void H0() {
        d dVar = this.f11205j0;
        if (dVar.f11206a == this) {
            dVar.f11206a = null;
        }
        j4.d dVar2 = this.f11204i0;
        if (dVar2 != null) {
            dVar2.b();
        }
        this.f11204i0 = null;
    }

    public final void O0() {
        he.g gVar = new he.g(17, this, this.f11205j0);
        a4.o0 t5 = a4.l.t(this);
        int i2 = t5.B;
        j4.b rectManager = ((b4.x) a4.s0.a(t5)).getRectManager();
        j4.e eVar = rectManager.f7418b;
        eVar.getClass();
        a1.x xVar = eVar.f7442a;
        j4.d dVar = new j4.d(eVar, i2, this, gVar);
        Object b10 = xVar.b(i2);
        if (b10 == null) {
            xVar.i(i2, dVar);
            b10 = dVar;
        }
        j4.d dVar2 = (j4.d) b10;
        if (dVar2 != dVar) {
            while (true) {
                j4.d dVar3 = dVar2.f7437d;
                if (dVar3 == null) {
                    break;
                }
                dVar2 = dVar3;
            }
            dVar2.f7437d = dVar;
        }
        if (a4.l.t(this.A).f278b0) {
            rectManager.f7417a.m(i2, true);
        }
        rectManager.f7420d = true;
        rectManager.j();
        this.f11204i0 = dVar;
    }
}
