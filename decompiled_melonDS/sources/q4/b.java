package q4;

import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends nc.l implements mc.l {
    public static final b L = new b(1, 0);
    public static final b R = new b(1, 1);
    public static final b X = new b(1, 2);
    public static final b Y = new b(1, 3);
    public static final b Z = new b(1, 4);

    /* renamed from: b0  reason: collision with root package name */
    public static final b f12209b0 = new b(1, 5);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, int i10) {
        super(i2);
        this.B = i10;
    }

    @Override // mc.l
    public final /* synthetic */ Object k(Object obj) {
        switch (this.B) {
            case 0:
                float[] fArr = ((i3.e0) obj).f6629a;
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                float[] fArr2 = ((i3.e0) obj).f6629a;
                return yb.y.f14813a;
            case 2:
                List list = (List) obj;
                return yb.y.f14813a;
            case 3:
                int i2 = ((i) obj).f12248a;
                return yb.y.f14813a;
            case 4:
                List list2 = (List) obj;
                return yb.y.f14813a;
            default:
                int i10 = ((i) obj).f12248a;
                return yb.y.f14813a;
        }
    }
}
