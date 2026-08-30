package ec;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import zc.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c extends a {
    public final cc.g B;
    public transient cc.c L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(cc.c r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L7
            cc.g r0 = r2.g()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.c.<init>(cc.c):void");
    }

    @Override // cc.c
    public cc.g g() {
        cc.g gVar = this.B;
        gVar.getClass();
        return gVar;
    }

    @Override // ec.a
    public void w() {
        zc.h hVar;
        cc.c cVar = this.L;
        if (cVar != null && cVar != this) {
            cc.e t5 = g().t(cc.d.A);
            t5.getClass();
            q qVar = (q) t5;
            ed.f fVar = (ed.f) cVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ed.f.f4453b0;
            do {
            } while (atomicReferenceFieldUpdater.get(fVar) == ed.b.f4447c);
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            if (obj instanceof zc.h) {
                hVar = (zc.h) obj;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                hVar.q();
            }
        }
        this.L = b.A;
    }

    public c(cc.c cVar, cc.g gVar) {
        super(cVar);
        this.B = gVar;
    }
}
