package xa;

import java.util.Calendar;
import java.util.GregorianCalendar;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class t0 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        if (aVar.d0() == cb.b.NULL) {
            aVar.Z();
            return null;
        }
        aVar.i();
        int i2 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (aVar.d0() != cb.b.END_OBJECT) {
            String X = aVar.X();
            int K = aVar.K();
            char c4 = 65535;
            switch (X.hashCode()) {
                case -1181204563:
                    if (X.equals("dayOfMonth")) {
                        c4 = 0;
                        break;
                    }
                    break;
                case -1074026988:
                    if (X.equals("minute")) {
                        c4 = 1;
                        break;
                    }
                    break;
                case -906279820:
                    if (X.equals("second")) {
                        c4 = 2;
                        break;
                    }
                    break;
                case 3704893:
                    if (X.equals("year")) {
                        c4 = 3;
                        break;
                    }
                    break;
                case 104080000:
                    if (X.equals("month")) {
                        c4 = 4;
                        break;
                    }
                    break;
                case 985252545:
                    if (X.equals("hourOfDay")) {
                        c4 = 5;
                        break;
                    }
                    break;
            }
            switch (c4) {
                case 0:
                    i11 = K;
                    break;
                case DSiCameraSource.FrontCamera /* 1 */:
                    i13 = K;
                    break;
                case 2:
                    i14 = K;
                    break;
                case 3:
                    i2 = K;
                    break;
                case 4:
                    i10 = K;
                    break;
                case l1.c.f8511g /* 5 */:
                    i12 = K;
                    break;
            }
        }
        aVar.w();
        return new GregorianCalendar(i2, i10, i11, i12, i13, i14);
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            cVar.F();
            return;
        }
        cVar.m();
        cVar.z("year");
        cVar.L(calendar.get(1));
        cVar.z("month");
        cVar.L(calendar.get(2));
        cVar.z("dayOfMonth");
        cVar.L(calendar.get(5));
        cVar.z("hourOfDay");
        cVar.L(calendar.get(11));
        cVar.z("minute");
        cVar.L(calendar.get(12));
        cVar.z("second");
        cVar.L(calendar.get(13));
        cVar.w();
    }
}
