package c8;

import h1.x2;
import j0.v0;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.common.camera.DSiCameraSource;
import zc.y0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements b5.j, m0.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ i(cc.g gVar, zc.w wVar, mc.p pVar) {
        this.A = 2;
        this.B = gVar;
        this.L = wVar;
        this.R = (ec.j) pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x014f A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:4:0x0019, B:12:0x002b, B:13:0x0043, B:17:0x0048, B:18:0x004f, B:20:0x0055, B:21:0x006b, B:22:0x00cf, B:24:0x00d5, B:25:0x00ea, B:27:0x00fa, B:29:0x00fe, B:30:0x010a, B:32:0x0127, B:34:0x0139, B:36:0x0141, B:40:0x014f, B:42:0x0161, B:45:0x0179, B:46:0x0186, B:48:0x0199, B:51:0x01b4, B:52:0x01c7, B:54:0x01e1, B:56:0x01e5, B:57:0x01ee, B:58:0x0213, B:60:0x0219, B:61:0x0229, B:63:0x0241, B:64:0x0246, B:65:0x024e, B:68:0x0251, B:69:0x0257, B:71:0x0259, B:72:0x0272), top: B:78:0x0019, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0176  */
    @Override // m0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ta.a apply(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.i.apply(java.lang.Object):ta.a");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ec.j, mc.p] */
    @Override // b5.j
    public Object h(b5.i iVar) {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                b5.l lVar = (b5.l) this.B;
                l0.h hVar = (l0.h) this.L;
                iVar.a(new a8.f(15, lVar), hVar);
                lVar.a(new m0.h(0, lVar, new v0(iVar, 0)), hVar);
                return "surfaceList[" + ((Collection) this.R) + "]";
            case 2:
                cc.g gVar = (cc.g) this.B;
                iVar.a(new a8.f(25, (y0) gVar.t(zc.r.B)), p8.k.INSTANCE);
                return zc.x.v(zc.x.a(gVar), null, (zc.w) this.L, new x2((mc.p) ((ec.j) this.R), iVar, (cc.c) null), 1);
            default:
                String str = (String) this.L;
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                iVar.a(new p8.o(atomicBoolean, 0), p8.k.INSTANCE);
                ((Executor) this.B).execute(new p8.p(atomicBoolean, iVar, (mc.a) this.R, 0));
                return str;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    public /* synthetic */ i(Runnable runnable, t tVar, Runnable runnable2) {
        this.A = 0;
        this.B = runnable;
        this.R = tVar;
        this.L = runnable2;
    }
}
