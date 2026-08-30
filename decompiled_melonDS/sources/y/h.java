package y;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final j f14638a;

    public h(int i2, Surface surface) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            this.f14638a = new j(new OutputConfiguration(i2, surface));
        } else if (i10 >= 28) {
            this.f14638a = new j(new m(new OutputConfiguration(i2, surface)));
        } else if (i10 >= 26) {
            this.f14638a = new j(new k(new OutputConfiguration(i2, surface)));
        } else {
            this.f14638a = new j(new i(new OutputConfiguration(i2, surface)));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f14638a.equals(((h) obj).f14638a);
    }

    public final int hashCode() {
        return this.f14638a.hashCode();
    }

    public h(j jVar) {
        this.f14638a = jVar;
    }
}
