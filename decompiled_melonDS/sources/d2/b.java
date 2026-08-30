package d2;

import i3.e0;
import y3.z;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b extends nc.i implements mc.l {

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ o f3718b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(o oVar) {
        super(1, nc.j.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.f3718b0 = oVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        float[] fArr = ((e0) obj).f6629a;
        z zVar = (z) this.f3718b0.f3754l0.getValue();
        if (zVar != null) {
            if (!zVar.U()) {
                zVar = null;
            }
            if (zVar != null) {
                zVar.V(fArr);
            }
        }
        return y.f14813a;
    }
}
