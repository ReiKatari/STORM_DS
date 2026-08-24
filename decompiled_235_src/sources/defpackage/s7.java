package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s7  reason: default package */
/* loaded from: classes.dex */
public final class s7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public s7(kp7 kp7Var, View view) {
        this.a = 9;
        this.b = kp7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.v0 = null;
                actionBarOverlayLayout.i0 = false;
                return;
            case 9:
                ((kp7) obj).a();
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.v0 = null;
                actionBarOverlayLayout.i0 = false;
                return;
            case 1:
                eo eoVar = (eo) obj;
                ArrayList arrayList = new ArrayList(eoVar.X);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((g24) arrayList.get(i2)).b.n0;
                    if (colorStateList != null) {
                        eoVar.setTintList(colorStateList);
                    }
                }
                return;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj;
                bottomSheetBehavior.J(5);
                WeakReference weakReference = bottomSheetBehavior.W;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.W.get()).requestLayout();
                    return;
                }
                return;
            case 3:
                vp1 vp1Var = (vp1) obj;
                vp1Var.p();
                vp1Var.r.start();
                return;
            case 4:
                ((HideBottomViewOnScrollBehavior) obj).k = null;
                return;
            case 5:
                ((HideViewOnScrollBehavior) obj).k = null;
                return;
            case 6:
                v14 v14Var = (v14) obj;
                v14Var.b.setTranslationY(RecyclerView.B1);
                v14Var.b(RecyclerView.B1);
                return;
            case 7:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                sideSheetBehavior.w(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    return;
                }
                return;
            case 8:
                ((ea7) obj).n();
                animator.removeListener(this);
                return;
            default:
                ((kp7) obj).c();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                eo eoVar = (eo) obj;
                ArrayList arrayList = new ArrayList(eoVar.X);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((g24) arrayList.get(i2)).a(eoVar);
                }
                return;
            case 9:
                ((kp7) obj).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ s7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
