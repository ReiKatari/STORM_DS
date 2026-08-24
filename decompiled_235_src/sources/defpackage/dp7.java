package defpackage;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dp7  reason: default package */
/* loaded from: classes.dex */
public final class dp7 extends hp7 {
    public final /* synthetic */ int g;

    @Override // defpackage.hp7
    public final void d(View view, float f) {
        switch (this.g) {
            case 0:
                view.setAlpha(a(f));
                return;
            case 1:
                view.setElevation(a(f));
                return;
            case 2:
                view.setRotation(a(f));
                return;
            case 3:
                view.setRotationX(a(f));
                return;
            case 4:
                view.setRotationY(a(f));
                return;
            case 5:
                view.setScaleX(a(f));
                return;
            case 6:
                view.setScaleY(a(f));
                return;
            case 7:
                view.setTranslationX(a(f));
                return;
            case 8:
                view.setTranslationY(a(f));
                return;
            default:
                view.setTranslationZ(a(f));
                return;
        }
    }
}
