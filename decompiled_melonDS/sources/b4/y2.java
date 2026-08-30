package b4;

import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class y2 implements androidx.lifecycle.v {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ y2(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // androidx.lifecycle.v
    public final void d(androidx.lifecycle.x xVar, androidx.lifecycle.p pVar) {
        switch (this.A) {
            case 0:
                a aVar = (a) this.B;
                if (pVar == androidx.lifecycle.p.ON_DESTROY) {
                    aVar.c();
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                d7.f fVar = (d7.f) this.B;
                fVar.f3936q = pVar.getTargetState();
                if (fVar.f3923c != null) {
                    ArrayList q02 = zb.l.q0(fVar.f3926f);
                    int size = q02.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = q02.get(i2);
                        i2++;
                        a7.i iVar = (a7.i) obj;
                        iVar.getClass();
                        com.squareup.picasso.m mVar = iVar.f576b0;
                        mVar.getClass();
                        androidx.lifecycle.q targetState = pVar.getTargetState();
                        targetState.getClass();
                        ((a7.i) mVar.f3254c).R = targetState;
                        mVar.f3257f = pVar.getTargetState();
                        mVar.f();
                    }
                    return;
                }
                return;
            default:
                s7.a aVar2 = (s7.a) this.B;
                if (pVar == androidx.lifecycle.p.ON_START) {
                    aVar2.f12842h = true;
                    return;
                } else if (pVar == androidx.lifecycle.p.ON_STOP) {
                    aVar2.f12842h = false;
                    return;
                } else {
                    return;
                }
        }
    }
}
