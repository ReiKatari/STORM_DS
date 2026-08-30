package ai;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.l B;

    public /* synthetic */ b0(mc.l lVar, int i2) {
        this.A = i2;
        this.B = lVar;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                this.B.k(new zh.i(null));
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.k(zh.q.CONFIG);
                break;
            case 2:
                this.B.k(zh.q.RETRO_ACHIEVEMENTS);
                break;
            case 3:
                this.B.k(yg.a.NONE);
                break;
            case 4:
                this.B.k(re.a.PUBLIC_SAV);
                break;
            case l1.c.f8511g /* 5 */:
                this.B.k(re.a.PRIVATE_SAV);
                break;
            case l1.c.f8509e /* 6 */:
                this.B.k(re.a.BANNER_SAV);
                break;
            case 7:
                this.B.k(yg.a.IMPORT);
                break;
            case 8:
                this.B.k(yg.a.EXPORT);
                break;
            case l1.c.f8508d /* 9 */:
                this.B.k(yg.a.NONE);
                break;
            case l1.c.f8510f /* 10 */:
                this.B.k(yg.a.NONE);
                break;
            case 11:
                this.B.k(re.a.PUBLIC_SAV);
                break;
            case 12:
                this.B.k(re.a.PRIVATE_SAV);
                break;
            default:
                this.B.k(re.a.BANNER_SAV);
                break;
        }
        return yb.y.f14813a;
    }
}
