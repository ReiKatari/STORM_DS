package defpackage;

import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rb7  reason: default package */
/* loaded from: classes.dex */
public final class rb7 extends vb7 {
    public final /* synthetic */ int k;

    @Override // defpackage.vb7
    public final boolean d(float f, long j, u93 u93Var, View view) {
        switch (this.k) {
            case 0:
                view.setAlpha(b(f, j, u93Var, view));
                return this.h;
            case 1:
                view.setElevation(b(f, j, u93Var, view));
                return this.h;
            case 2:
                view.setRotation(b(f, j, u93Var, view));
                return this.h;
            case 3:
                view.setRotationX(b(f, j, u93Var, view));
                return this.h;
            case 4:
                view.setRotationY(b(f, j, u93Var, view));
                return this.h;
            case 5:
                view.setScaleX(b(f, j, u93Var, view));
                return this.h;
            case ig7.b /* 6 */:
                view.setScaleY(b(f, j, u93Var, view));
                return this.h;
            case 7:
                view.setTranslationX(b(f, j, u93Var, view));
                return this.h;
            case 8:
                view.setTranslationY(b(f, j, u93Var, view));
                return this.h;
            default:
                view.setTranslationZ(b(f, j, u93Var, view));
                return this.h;
        }
    }
}
