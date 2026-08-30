package f2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ b1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(b1 b1Var, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = b1Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                long j2 = ((h3.b) obj).f6050a;
                return new t0(this.Z, (cc.c) obj2, 0).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((t0) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            default:
                return ((t0) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                t0 t0Var = new t0(this.Z, cVar, 0);
                long j2 = ((h3.b) obj).f6050a;
                return t0Var;
            case DSiCameraSource.FrontCamera /* 1 */:
                return new t0(this.Z, cVar, 1);
            default:
                return new t0(this.Z, cVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x02bf, code lost:
        if (r2 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x03ff, code lost:
        if (r5.s(r45) == r1) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:?, code lost:
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v34, types: [k1.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v58 */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.t0.v(java.lang.Object):java.lang.Object");
    }
}
