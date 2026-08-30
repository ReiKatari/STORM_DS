package s2;

import a1.t;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends l {
    public final /* synthetic */ int R;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.R) {
            case 0:
                int i2 = this.L;
                this.L = i2 + 2;
                Object[] objArr = this.A;
                return new t(1, objArr[i2], objArr[i2 + 1]);
            case DSiCameraSource.FrontCamera /* 1 */:
                int i10 = this.L;
                this.L = i10 + 2;
                return this.A[i10];
            default:
                int i11 = this.L;
                this.L = i11 + 2;
                return this.A[i11 + 1];
        }
    }
}
