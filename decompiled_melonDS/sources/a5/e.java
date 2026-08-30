package a5;

import me.magnum.melonds.common.camera.DSiCameraSource;
import y3.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends nc.l implements mc.l {
    public static final e L = new e(1, 0);
    public static final e R = new e(1, 1);
    public static final e X = new e(1, 2);
    public static final e Y = new e(1, 3);
    public static final e Z = new e(1, 4);

    /* renamed from: b0  reason: collision with root package name */
    public static final e f383b0 = new e(1, 5);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, int i10) {
        super(i2);
        this.B = i10;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        int i2 = this.B;
        yb.y yVar = yb.y.f14813a;
        switch (i2) {
            case 0:
                tc.c[] cVarArr = i4.v.f6808a;
                ((i4.x) obj).a(i4.t.f6803x, yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Number) obj).longValue();
                return yVar;
            case 2:
                h1 h1Var = (h1) obj;
                return yVar;
            case 3:
                tc.c[] cVarArr2 = i4.v.f6808a;
                ((i4.x) obj).a(i4.t.f6802w, yVar);
                return yVar;
            case 4:
                h1 h1Var2 = (h1) obj;
                return yVar;
            default:
                m0 m0Var = (m0) obj;
                if (m0Var.isAttachedToWindow()) {
                    m0Var.m();
                }
                return yVar;
        }
    }
}
