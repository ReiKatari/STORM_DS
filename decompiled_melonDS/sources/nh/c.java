package nh;

import ec.j;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.w0;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ d1.c Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ w0 f10445b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d1.c cVar, w0 w0Var, cc.c cVar2, int i2) {
        super(2, cVar2);
        this.X = i2;
        this.Z = cVar;
        this.f10445b0 = w0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((c) t(cVar, uVar)).v(y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((c) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((c) t(cVar, uVar)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new c(this.Z, this.f10445b0, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new c(this.Z, this.f10445b0, cVar, 1);
            default:
                return new c(this.Z, this.f10445b0, cVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (zc.x.i(r0, r12) == r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (zc.x.i(r0, r12) == r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
        if (zc.x.i(r0, r12) == r11) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b9, code lost:
        if (zc.x.i(r0, r12) == r11) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ff, code lost:
        if (zc.x.i(r0, r12) == r11) goto L55;
     */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.c.v(java.lang.Object):java.lang.Object");
    }
}
