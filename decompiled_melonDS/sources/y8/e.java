package y8;

import androidx.work.impl.WorkDatabase;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final WorkDatabase f14794a;

    public e(WorkDatabase workDatabase, int i2) {
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f14794a = workDatabase;
                return;
            default:
                workDatabase.getClass();
                this.f14794a = workDatabase;
                return;
        }
    }
}
