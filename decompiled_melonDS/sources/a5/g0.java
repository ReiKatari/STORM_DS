package a5;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g0 extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f396a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.f396a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(0.0f);
                return;
            case 2:
                view.getClass();
                throw new ClassCastException();
            default:
                if ((view instanceof l3.l) && (outline2 = ((l3.l) view).f8771b0) != null) {
                    outline.set(outline2);
                    return;
                }
                return;
        }
    }
}
