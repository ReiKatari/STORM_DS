package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ir2  reason: default package */
/* loaded from: classes.dex */
public final class ir2 extends jk2 {
    public final /* synthetic */ int d;

    @Override // defpackage.jk2
    public final int B(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.d) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // defpackage.jk2
    public final int E() {
        switch (this.d) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }

    @Override // defpackage.jk2
    public final ViewPropertyAnimator F(View view, int i) {
        switch (this.d) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}
