package defpackage;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mp7  reason: default package */
/* loaded from: classes.dex */
public final class mp7 extends qp7 {
    public final /* synthetic */ int f;

    @Override // defpackage.qp7
    public final void c(View view, float f) {
        switch (this.f) {
            case 0:
                view.setAlpha(a(f));
                return;
            case 1:
                view.setElevation(a(f));
                return;
            case 2:
                view.setPivotX(a(f));
                return;
            case 3:
                view.setPivotY(a(f));
                return;
            case 4:
                view.setRotation(a(f));
                return;
            case 5:
                view.setRotationX(a(f));
                return;
            case 6:
                view.setRotationY(a(f));
                return;
            case 7:
                view.setScaleX(a(f));
                return;
            case 8:
                view.setScaleY(a(f));
                return;
            case 9:
                view.setTranslationX(a(f));
                return;
            case 10:
                view.setTranslationY(a(f));
                return;
            default:
                view.setTranslationZ(a(f));
                return;
        }
    }
}
