package c0;

import b5.i;
import b5.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ c B;
    public final /* synthetic */ i L;

    public /* synthetic */ b(c cVar, i iVar, int i2) {
        this.A = i2;
        this.B = cVar;
        this.L = iVar;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, b5.n] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, b5.n] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                c cVar = this.B;
                cVar.f2366b = true;
                Exception exc = new Exception("Camera2CameraControl was updated with new options.");
                i iVar = cVar.f2371g;
                if (iVar != null) {
                    iVar.c(exc);
                    cVar.f2371g = null;
                }
                cVar.f2371g = this.L;
                if (cVar.f2365a) {
                    w.i iVar2 = cVar.f2367c;
                    iVar2.getClass();
                    ?? obj = new Object();
                    obj.f2053c = new Object();
                    l lVar = new l(obj);
                    obj.f2052b = lVar;
                    obj.f2051a = w.d.class;
                    try {
                        iVar2.f13950c.execute(new ad.c(29, iVar2, obj));
                        obj.f2051a = "updateSessionConfigAsync";
                    } catch (Exception e6) {
                        lVar.b(e6);
                    }
                    m0.i.d(lVar).a(new a8.f(4, cVar), cVar.f2368d);
                    cVar.f2366b = false;
                    return;
                }
                return;
            default:
                c cVar2 = this.B;
                cVar2.f2366b = true;
                Exception exc2 = new Exception("Camera2CameraControl was updated with new options.");
                i iVar3 = cVar2.f2371g;
                if (iVar3 != null) {
                    iVar3.c(exc2);
                    cVar2.f2371g = null;
                }
                cVar2.f2371g = this.L;
                if (cVar2.f2365a) {
                    w.i iVar4 = cVar2.f2367c;
                    iVar4.getClass();
                    ?? obj2 = new Object();
                    obj2.f2053c = new Object();
                    l lVar2 = new l(obj2);
                    obj2.f2052b = lVar2;
                    obj2.f2051a = w.d.class;
                    try {
                        iVar4.f13950c.execute(new ad.c(29, iVar4, obj2));
                        obj2.f2051a = "updateSessionConfigAsync";
                    } catch (Exception e10) {
                        lVar2.b(e10);
                    }
                    m0.i.d(lVar2).a(new a8.f(4, cVar2), cVar2.f2368d);
                    cVar2.f2366b = false;
                    return;
                }
                return;
        }
    }
}
