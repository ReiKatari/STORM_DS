package ua;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13525a;

    public /* synthetic */ d(int i2) {
        this.f13525a = i2;
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        switch (this.f13525a) {
            case 0:
                if (aVar.d0() == cb.b.NULL) {
                    aVar.Z();
                    return null;
                }
                return Double.valueOf(aVar.J());
            case DSiCameraSource.FrontCamera /* 1 */:
                if (aVar.d0() == cb.b.NULL) {
                    aVar.Z();
                    return null;
                }
                return Float.valueOf((float) aVar.J());
            default:
                aVar.k0();
                return null;
        }
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        switch (this.f13525a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    cVar.F();
                    return;
                }
                double doubleValue = number.doubleValue();
                h.a(doubleValue);
                cVar.K(doubleValue);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    cVar.F();
                    return;
                }
                float floatValue = number2.floatValue();
                h.a(floatValue);
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                cVar.X(number2);
                return;
            default:
                cVar.F();
                return;
        }
    }

    public String toString() {
        switch (this.f13525a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }
}
