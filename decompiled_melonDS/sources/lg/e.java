package lg;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import me.magnum.melonds.common.camera.DSiCameraSource;
import yb.y;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.a B;

    public /* synthetic */ e(int i2, mc.a aVar) {
        this.A = i2;
        this.B = aVar;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                this.B.b();
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B.b();
                break;
            case 2:
                this.B.b();
                break;
            case 3:
                this.B.b();
                break;
            case 4:
                try {
                    return (List) this.B.b();
                } catch (SSLPeerUnverifiedException unused) {
                    return q.A;
                }
            case l1.c.f8511g /* 5 */:
                this.B.b();
                break;
            case l1.c.f8509e /* 6 */:
                this.B.b();
                break;
            case 7:
                this.B.b();
                break;
            case 8:
                this.B.b();
                break;
            default:
                this.B.b();
                break;
        }
        return y.f14813a;
    }
}
