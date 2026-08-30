package ai;

import java.io.IOException;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements mc.a {
    public final /* synthetic */ int A;
    public final Object B;
    public final /* synthetic */ Object L;

    public i(wi.p pVar, wi.t tVar) {
        this.A = 5;
        this.L = pVar;
        this.B = tVar;
    }

    @Override // mc.a
    public final Object b() {
        wi.c cVar;
        Throwable th2;
        switch (this.A) {
            case 0:
                ((mc.l) this.B).k(Long.valueOf(((zh.c) this.L).f15110a));
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((n2.w0) this.L).setValue(new kg.a((Cheat) this.B));
                return yb.y.f14813a;
            case 2:
                ((mc.l) this.B).k((oe.f) this.L);
                return yb.y.f14813a;
            case 3:
                ((mc.l) this.B).k((oe.c) this.L);
                return yb.y.f14813a;
            case 4:
                ((mc.l) this.B).k((oe.q) this.L);
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                wi.p pVar = (wi.p) this.L;
                wi.t tVar = (wi.t) this.B;
                wi.c cVar2 = wi.c.INTERNAL_ERROR;
                IOException e6 = null;
                try {
                    try {
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (IOException e10) {
                    e6 = e10;
                    cVar = cVar2;
                }
                if (tVar.d(true, this)) {
                    do {
                        try {
                        } catch (Throwable th4) {
                            th2 = th4;
                            cVar = cVar2;
                            pVar.d(cVar, cVar2, e6);
                            qi.e.b(tVar);
                            throw th2;
                        }
                    } while (tVar.d(false, this));
                    cVar = wi.c.NO_ERROR;
                    try {
                        try {
                            pVar.d(cVar, wi.c.CANCEL, null);
                        } catch (IOException e11) {
                            e6 = e11;
                            wi.c cVar3 = wi.c.PROTOCOL_ERROR;
                            pVar.d(cVar3, cVar3, e6);
                            qi.e.b(tVar);
                            return yb.y.f14813a;
                        }
                        qi.e.b(tVar);
                        return yb.y.f14813a;
                    } catch (Throwable th5) {
                        th2 = th5;
                        pVar.d(cVar, cVar2, e6);
                        qi.e.b(tVar);
                        throw th2;
                    }
                }
                throw new IOException("Required SETTINGS preface not received");
            default:
                ((mc.l) this.B).k((ze.a) this.L);
                return yb.y.f14813a;
        }
    }

    public /* synthetic */ i(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }
}
