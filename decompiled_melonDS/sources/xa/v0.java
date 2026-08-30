package xa;

import android.net.Uri;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v0 implements ua.v {
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;

    public v0(ji.h hVar) {
        this.A = 2;
        this.B = hVar;
        this.L = hVar;
    }

    @Override // ua.v
    public final ua.u a(ua.h hVar, bb.a aVar) {
        switch (this.A) {
            case 0:
                if (aVar.f2155a == ((Class) this.B)) {
                    return (ua.u) this.L;
                }
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                Class<?> cls = aVar.f2155a;
                if (!((Class) this.B).isAssignableFrom(cls)) {
                    return null;
                }
                return new c(this, cls);
            default:
                if (Uri.class.isAssignableFrom(aVar.f2155a)) {
                    return new b0((ji.h) this.B, (ji.h) this.L, hVar, aVar, this, true);
                }
                return null;
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return "Factory[type=" + ((Class) this.B).getName() + ",adapter=" + ((ua.u) this.L) + "]";
            case DSiCameraSource.FrontCamera /* 1 */:
                return "Factory[typeHierarchy=" + ((Class) this.B).getName() + ",adapter=" + ((ua.u) this.L) + "]";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v0(Class cls, ua.u uVar, int i2) {
        this.A = i2;
        this.B = cls;
        this.L = uVar;
    }
}
