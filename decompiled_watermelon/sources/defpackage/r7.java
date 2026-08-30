package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r7  reason: default package */
/* loaded from: classes.dex */
public final class r7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public r7(jb7 jb7Var, View view) {
        this.a = 6;
        this.b = jb7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.u0 = null;
                actionBarOverlayLayout.h0 = false;
                return;
            case ig7.b /* 6 */:
                ((jb7) obj).b();
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
                actionBarOverlayLayout.u0 = null;
                actionBarOverlayLayout.h0 = false;
                return;
            case 1:
                rn rnVar = (rn) obj;
                ArrayList arrayList = new ArrayList(rnVar.X);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((xu3) arrayList.get(i2)).b.m0;
                    if (colorStateList != null) {
                        rnVar.setTintList(colorStateList);
                    }
                }
                return;
            case 2:
                ol1 ol1Var = (ol1) obj;
                ol1Var.p();
                ol1Var.r.start();
                return;
            case 3:
                ((HideBottomViewOnScrollBehavior) obj).k = null;
                return;
            case 4:
                ((HideViewOnScrollBehavior) obj).k = null;
                return;
            case 5:
                ((ix6) obj).o();
                animator.removeListener(this);
                return;
            default:
                ((jb7) obj).a();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                rn rnVar = (rn) obj;
                ArrayList arrayList = new ArrayList(rnVar.X);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((xu3) arrayList.get(i2)).a(rnVar);
                }
                return;
            case ig7.b /* 6 */:
                ((jb7) obj).c();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ r7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
