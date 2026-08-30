package ah;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ long Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f819b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(long j2, v3.f0 f0Var, cc.c cVar) {
        super(2, cVar);
        this.X = 2;
        this.Z = j2;
        this.f819b0 = f0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        zc.u uVar = (zc.u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((y0) t(cVar, uVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((y0) t(cVar, uVar)).v(yb.y.f14813a);
            default:
                return ((y0) t(cVar, uVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new y0((h1) this.f819b0, this.Z, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new y0((d1.c) this.f819b0, this.Z, cVar, 1);
            default:
                return new y0(this.Z, (v3.f0) this.f819b0, cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.y0.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(Object obj, long j2, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f819b0 = obj;
        this.Z = j2;
    }
}
