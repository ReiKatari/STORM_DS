package aa;

import android.view.View;
import cd.q1;
import com.google.android.material.carousel.CarouselLayoutManager;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import oe.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f677a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f678b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f677a = i2;
        this.f678b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17 = this.f677a;
        Object obj = this.f678b;
        switch (i17) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i11 - i2 != i15 - i13 || i12 - i10 != i16 - i14) {
                    view.post(new a8.f(1, carouselLayoutManager));
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj;
                int i18 = EmulatorActivity.f9503a1;
                int i19 = i16 - i14;
                int i20 = i11 - i2;
                int i21 = i12 - i10;
                if (i20 != i15 - i13 || i21 != i19) {
                    emulatorActivity.F();
                    q1 q1Var = (q1) emulatorActivity.C().f772k.f3840b;
                    a0 a0Var = new a0(i20, i21);
                    q1Var.getClass();
                    q1Var.k(null, a0Var);
                    return;
                }
                return;
            case 2:
                ((ih.f) obj).a();
                return;
            default:
                LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) obj;
                int i22 = LayoutEditorActivity.K0;
                int i23 = i16 - i14;
                int i24 = i11 - i2;
                int i25 = i12 - i10;
                if (i24 != i15 - i13 || i25 != i23) {
                    layoutEditorActivity.B();
                    q1 q1Var2 = (q1) layoutEditorActivity.A().f12728d.f3840b;
                    a0 a0Var2 = new a0(i24, i25);
                    q1Var2.getClass();
                    q1Var2.k(null, a0Var2);
                    return;
                }
                return;
        }
    }
}
