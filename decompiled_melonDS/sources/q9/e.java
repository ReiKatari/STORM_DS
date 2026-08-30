package q9;

import android.graphics.Bitmap;
import m9.o;
import zc.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final m9.c f12391a;

    static {
        gd.f fVar = g0.f15015a;
        ad.e eVar = ed.n.f4465a.Y;
        gd.e eVar2 = gd.e.L;
        n9.d dVar = n9.d.AUTOMATIC;
        Bitmap.Config config = g.f12394b;
        m9.b bVar = m9.b.ENABLED;
        f12391a = new m9.c(eVar, eVar2, eVar2, eVar2, p9.e.f11523a, dVar, config, true, false, null, null, null, bVar, bVar, bVar);
    }

    public static final boolean a(m9.j jVar) {
        int i2 = d.f12390a[jVar.f9408f.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (jVar.f9427z.f9377a != null || !(jVar.f9424w instanceof n9.c)) {
                        return false;
                    }
                } else {
                    o.o();
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
