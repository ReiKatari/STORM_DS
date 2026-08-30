package b7;

import android.content.Context;
import cd.n1;
import cd.z0;
import h1.x2;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import zc.t0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ Context B;

    public /* synthetic */ s(Context context, int i2) {
        this.A = i2;
        this.B = context;
    }

    @Override // mc.a
    public final Object b() {
        int i2 = this.A;
        Context context = this.B;
        switch (i2) {
            case 0:
                return q8.r.s(context);
            case DSiCameraSource.FrontCamera /* 1 */:
                int i10 = LayoutEditorView.f9528i0;
                return Integer.valueOf((int) ((context.getResources().getDisplayMetrics().densityDpi / 160) * 100.0f));
            case 2:
                int i11 = LayoutEditorView.f9528i0;
                return Integer.valueOf((int) ((context.getResources().getDisplayMetrics().densityDpi / 160) * 30.0f));
            default:
                return cd.q.y(cd.q.m(new z0(new x2(22, (cc.c) null, context))), t0.A, new n1(5000L, 0L), 1);
        }
    }
}
