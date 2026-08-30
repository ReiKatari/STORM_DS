package ld;

import a1.z0;
import java.util.Iterator;
import kf.s0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.q2;
import nc.k;
import nd.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements Iterable, oc.a {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ g(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new z0((y) this.B);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new q2((jc.h) this.B);
            case 2:
                return new z0((Object[]) this.B);
            default:
                return new uc.b(k.d((Object[]) ((s0) this.B).B));
        }
    }
}
