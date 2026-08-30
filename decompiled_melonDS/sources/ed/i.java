package ed;

import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class i extends nc.o implements tc.c, mc.a {

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ int f4455b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i2, int i10, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i2);
        this.f4455b0 = i10;
    }

    @Override // nc.c
    public final tc.a a() {
        nc.u.f10262a.getClass();
        return this;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.f4455b0) {
            case 0:
                return this.B.getClass().getSimpleName();
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((s2) this.B).getValue();
            case 2:
                return ((s2) this.B).getValue();
            default:
                return ((s2) this.B).getValue();
        }
    }
}
