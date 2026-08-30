package xa;

import java.util.Calendar;
import java.util.GregorianCalendar;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p implements ua.v {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ p(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // ua.v
    public final ua.u a(ua.h hVar, bb.a aVar) {
        switch (this.A) {
            case 0:
                if (aVar.f2155a == Number.class) {
                    return (r) this.B;
                }
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                if (aVar.f2155a == Object.class) {
                    return new t(hVar, (ua.s) this.B);
                }
                return null;
            default:
                Class cls = aVar.f2155a;
                if (cls != Calendar.class && cls != GregorianCalendar.class) {
                    return null;
                }
                return (t0) this.B;
        }
    }

    public String toString() {
        switch (this.A) {
            case 2:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((t0) this.B) + "]";
            default:
                return super.toString();
        }
    }
}
