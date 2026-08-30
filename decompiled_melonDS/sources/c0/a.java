package c0;

import b5.l;
import w.i;
import w.u;
import w.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;

    public /* synthetic */ a(Object obj, boolean z10, int i2) {
        this.A = i2;
        this.L = obj;
        this.B = z10;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, b5.n] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                c cVar = (c) this.L;
                boolean z10 = this.B;
                if (cVar.f2365a != z10) {
                    cVar.f2365a = z10;
                    if (z10) {
                        if (cVar.f2366b) {
                            i iVar = cVar.f2367c;
                            iVar.getClass();
                            ?? obj = new Object();
                            obj.f2053c = new Object();
                            l lVar = new l(obj);
                            obj.f2052b = lVar;
                            obj.f2051a = w.d.class;
                            try {
                                iVar.f13950c.execute(new ad.c(29, iVar, obj));
                                obj.f2051a = "updateSessionConfigAsync";
                            } catch (Exception e6) {
                                lVar.b(e6);
                            }
                            m0.i.d(lVar).a(new a8.f(4, cVar), cVar.f2368d);
                            cVar.f2366b = false;
                            return;
                        }
                        return;
                    }
                    Exception exc = new Exception("The camera control has became inactive.");
                    b5.i iVar2 = cVar.f2371g;
                    if (iVar2 != null) {
                        iVar2.c(exc);
                        cVar.f2371g = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                x xVar = (x) this.L;
                boolean z11 = this.B;
                xVar.B0 = z11;
                if (z11) {
                    if (xVar.X == u.PENDING_OPEN || xVar.X == u.OPENING_WITH_ERROR) {
                        xVar.J(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
