package ob;

import java.util.HashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f10873a;

    public d(int i2) {
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f10873a = new HashMap();
                return;
            case 2:
                this.f10873a = new HashMap(3);
                return;
            default:
                this.f10873a = new HashMap(3);
                return;
        }
    }

    public void a(Class cls, e eVar) {
        this.f10873a.put(cls, eVar);
    }

    public void b(Class cls, qb.a aVar) {
        this.f10873a.put(cls, aVar);
    }
}
