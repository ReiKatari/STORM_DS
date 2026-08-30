package defpackage;

import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: si0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class si0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ si0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) obj;
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    view.post(new m0(10, carouselLayoutManager));
                    return;
                }
                return;
            case 1:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj;
                int i10 = EmulatorActivity.P1;
                int i11 = i8 - i6;
                int i12 = i3 - i;
                int i13 = i4 - i2;
                if (i12 != i7 - i5 || i13 != i11) {
                    emulatorActivity.Q0();
                    ee6 ee6Var = (ee6) emulatorActivity.U().u.B;
                    ip4 ip4Var = new ip4(i12, i13);
                    ee6Var.getClass();
                    ee6Var.l(null, ip4Var);
                    return;
                }
                return;
            case 2:
                ((k42) obj).b();
                return;
            default:
                LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) obj;
                int i14 = LayoutEditorActivity.M0;
                int i15 = i8 - i6;
                int i16 = i3 - i;
                int i17 = i4 - i2;
                if (i16 != i7 - i5 || i17 != i15) {
                    layoutEditorActivity.C();
                    ee6 ee6Var2 = (ee6) layoutEditorActivity.B().d.B;
                    ip4 ip4Var2 = new ip4(i16, i17);
                    ee6Var2.getClass();
                    ee6Var2.l(null, ip4Var2);
                    return;
                }
                return;
        }
    }
}
