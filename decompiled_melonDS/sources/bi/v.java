package bi;

import d1.v1;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.w0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends ec.j implements mc.p {
    public final /* synthetic */ int X = 2;
    public int Y;
    public final /* synthetic */ boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public Object f2310b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Object f2311c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ Object f2312d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(d1.c cVar, boolean z10, v1 v1Var, mc.a aVar, cc.c cVar2) {
        super(2, cVar2);
        this.f2310b0 = cVar;
        this.Z = z10;
        this.f2311c0 = v1Var;
        this.f2312d0 = aVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((v) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((v) t(cVar, uVar)).v(yb.y.f14813a);
            case 2:
                return ((v) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((v) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new v((me.magnum.melonds.ui.romlist.a) this.f2310b0, (ze.a) this.f2311c0, (w) this.f2312d0, this.Z, cVar);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new v((j1.i) this.f2310b0, (j1.k) this.f2311c0, this.Z, (f1.g) this.f2312d0, cVar);
            case 2:
                return new v((d1.c) this.f2310b0, this.Z, (v1) this.f2311c0, (mc.a) this.f2312d0, cVar);
            default:
                return new v((w0) this.f2311c0, this.Z, (j1.i) this.f2312d0, cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e0  */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.v.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(j1.i iVar, j1.k kVar, boolean z10, f1.g gVar, cc.c cVar) {
        super(2, cVar);
        this.f2310b0 = iVar;
        this.f2311c0 = kVar;
        this.Z = z10;
        this.f2312d0 = gVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(me.magnum.melonds.ui.romlist.a aVar, ze.a aVar2, w wVar, boolean z10, cc.c cVar) {
        super(2, cVar);
        this.f2310b0 = aVar;
        this.f2311c0 = aVar2;
        this.f2312d0 = wVar;
        this.Z = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w0 w0Var, boolean z10, j1.i iVar, cc.c cVar) {
        super(2, cVar);
        this.f2311c0 = w0Var;
        this.Z = z10;
        this.f2312d0 = iVar;
    }
}
