package defpackage;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sp7  reason: default package */
/* loaded from: classes.dex */
public final class sp7 extends wp7 {
    public final /* synthetic */ int k;

    @Override // defpackage.wp7
    public final boolean d(float f, long j, ng3 ng3Var, View view) {
        switch (this.k) {
            case 0:
                view.setAlpha(b(f, j, ng3Var, view));
                return this.h;
            case 1:
                view.setElevation(b(f, j, ng3Var, view));
                return this.h;
            case 2:
                view.setRotation(b(f, j, ng3Var, view));
                return this.h;
            case 3:
                view.setRotationX(b(f, j, ng3Var, view));
                return this.h;
            case 4:
                view.setRotationY(b(f, j, ng3Var, view));
                return this.h;
            case 5:
                view.setScaleX(b(f, j, ng3Var, view));
                return this.h;
            case 6:
                view.setScaleY(b(f, j, ng3Var, view));
                return this.h;
            case 7:
                view.setTranslationX(b(f, j, ng3Var, view));
                return this.h;
            case 8:
                view.setTranslationY(b(f, j, ng3Var, view));
                return this.h;
            default:
                view.setTranslationZ(b(f, j, ng3Var, view));
                return this.h;
        }
    }
}
