package defpackage;

import android.os.Handler;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: al0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class al0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ al0(Object obj, int i) {
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
                    view.post(new n0(carouselLayoutManager, 10));
                    return;
                }
                return;
            case 1:
                EmulatorActivity emulatorActivity = (EmulatorActivity) obj;
                int i10 = EmulatorActivity.Z1;
                int i11 = i8 - i6;
                int i12 = i3 - i;
                int i13 = i4 - i2;
                if (i12 != i7 - i5 || i13 != i11) {
                    emulatorActivity.L0 = null;
                    emulatorActivity.M0 = null;
                    tp6 tp6Var = (tp6) emulatorActivity.W().u.b;
                    my4 my4Var = new my4(i12, i13);
                    tp6Var.getClass();
                    tp6Var.m(null, my4Var);
                    Handler handler = emulatorActivity.N0;
                    if (handler != null) {
                        handler.post(new yu1(emulatorActivity, 12));
                        return;
                    } else {
                        nb3.a0("handler");
                        throw null;
                    }
                }
                return;
            case 2:
                ((c92) obj).b();
                return;
            default:
                LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) obj;
                int i14 = LayoutEditorActivity.N0;
                int i15 = i8 - i6;
                int i16 = i3 - i;
                int i17 = i4 - i2;
                if (i16 != i7 - i5 || i17 != i15) {
                    layoutEditorActivity.D();
                    tp6 tp6Var2 = (tp6) layoutEditorActivity.C().d.b;
                    my4 my4Var2 = new my4(i16, i17);
                    tp6Var2.getClass();
                    tp6Var2.m(null, my4Var2);
                    return;
                }
                return;
        }
    }
}
