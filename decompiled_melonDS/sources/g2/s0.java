package g2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s0 implements cd.i {
    public final /* synthetic */ int A;
    public final /* synthetic */ z2.p B;

    public /* synthetic */ s0(z2.p pVar, int i2) {
        this.A = i2;
        this.B = pVar;
    }

    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        switch (this.A) {
            case 0:
                j1.h hVar = (j1.h) obj;
                boolean z10 = hVar instanceof j1.f;
                z2.p pVar = this.B;
                if (z10) {
                    pVar.add(hVar);
                } else if (hVar instanceof j1.g) {
                    pVar.remove(((j1.g) hVar).f7334a);
                } else if (hVar instanceof j1.d) {
                    pVar.add(hVar);
                } else if (hVar instanceof j1.e) {
                    pVar.remove(((j1.e) hVar).f7333a);
                } else if (hVar instanceof j1.k) {
                    pVar.add(hVar);
                } else if (hVar instanceof j1.l) {
                    pVar.remove(((j1.l) hVar).f7338a);
                } else if (hVar instanceof j1.j) {
                    pVar.remove(((j1.j) hVar).f7336a);
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                j1.h hVar2 = (j1.h) obj;
                boolean z11 = hVar2 instanceof j1.k;
                z2.p pVar2 = this.B;
                if (z11) {
                    pVar2.add(hVar2);
                } else if (hVar2 instanceof j1.l) {
                    pVar2.remove(((j1.l) hVar2).f7338a);
                } else if (hVar2 instanceof j1.j) {
                    pVar2.remove(((j1.j) hVar2).f7336a);
                } else if (hVar2 instanceof j1.b) {
                    pVar2.add(hVar2);
                } else if (hVar2 instanceof j1.c) {
                    pVar2.remove(((j1.c) hVar2).f7332a);
                } else if (hVar2 instanceof j1.a) {
                    pVar2.remove(((j1.a) hVar2).f7331a);
                }
                return yb.y.f14813a;
            default:
                j1.h hVar3 = (j1.h) obj;
                boolean z12 = hVar3 instanceof j1.k;
                z2.p pVar3 = this.B;
                if (z12) {
                    pVar3.add(hVar3);
                } else if (hVar3 instanceof j1.l) {
                    pVar3.remove(((j1.l) hVar3).f7338a);
                } else if (hVar3 instanceof j1.j) {
                    pVar3.remove(((j1.j) hVar3).f7336a);
                } else if (hVar3 instanceof j1.b) {
                    pVar3.add(hVar3);
                } else if (hVar3 instanceof j1.c) {
                    pVar3.remove(((j1.c) hVar3).f7332a);
                } else if (hVar3 instanceof j1.a) {
                    pVar3.remove(((j1.a) hVar3).f7331a);
                }
                return yb.y.f14813a;
        }
    }
}
