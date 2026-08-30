package defpackage;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lb7  reason: default package */
/* loaded from: classes.dex */
public final class lb7 extends pb7 {
    public final /* synthetic */ int f;

    @Override // defpackage.pb7
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
            case ig7.b /* 6 */:
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
