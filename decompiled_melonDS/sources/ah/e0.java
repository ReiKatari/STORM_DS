package ah;

import q.q3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 extends qg.b {

    /* renamed from: i  reason: collision with root package name */
    public final cf.b f752i;

    /* renamed from: j  reason: collision with root package name */
    public final pf.p f753j;

    /* renamed from: k  reason: collision with root package name */
    public final pf.j f754k;

    /* renamed from: l  reason: collision with root package name */
    public final q3 f755l;
    public Object m;

    /* renamed from: n  reason: collision with root package name */
    public Object f756n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(cf.d dVar, cf.b bVar, pf.p pVar, pf.j jVar, q3 q3Var) {
        super(bVar, dVar);
        dVar.getClass();
        bVar.getClass();
        pVar.getClass();
        jVar.getClass();
        this.f752i = bVar;
        this.f753j = pVar;
        this.f754k = jVar;
        this.f755l = q3Var;
        zb.q qVar = zb.q.A;
        this.m = qVar;
        this.f756n = qVar;
        zc.x.v(androidx.lifecycle.s0.h(this), null, null, new a9.b(1, null, this), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0197  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, java.lang.Iterable] */
    @Override // qg.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.ArrayList r18, cc.c r19) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.e0.e(java.util.ArrayList, cc.c):java.lang.Object");
    }

    @Override // qg.b
    public final ze.a f() {
        pf.o oVar;
        p7.o oVar2 = this.f753j.f11645d;
        if (oVar2 instanceof pf.o) {
            oVar = (pf.o) oVar2;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            return oVar.f11641c;
        }
        a0.j.p("Emulator must be running a ROM session");
        return null;
    }
}
