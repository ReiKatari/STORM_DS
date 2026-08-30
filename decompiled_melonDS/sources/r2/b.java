package r2;

import java.util.Collection;
import java.util.List;
import mc.l;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int A;
    public final /* synthetic */ Collection B;

    public /* synthetic */ b(int i2, Collection collection) {
        this.A = i2;
        this.B = collection;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        boolean contains;
        switch (this.A) {
            case 0:
                contains = this.B.contains(obj);
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                contains = this.B.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(this.B);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
