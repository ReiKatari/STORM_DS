package a6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e1 extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f452a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f453b;

    public e1(g1 g1Var, View view) {
        this.f452a = 0;
        this.f453b = g1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f452a) {
            case 0:
                ((g1) this.f453b).b();
                return;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f453b;
                actionBarOverlayLayout.f942t0 = null;
                actionBarOverlayLayout.f930g0 = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f452a) {
            case 0:
                ((g1) this.f453b).a();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((c8.t) this.f453b).p();
                animator.removeListener(this);
                return;
            case 2:
                d8.f fVar = (d8.f) this.f453b;
                ArrayList arrayList = new ArrayList(fVar.X);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ColorStateList colorStateList = ((ba.a) arrayList.get(i2)).f2131b.f2146l0;
                    if (colorStateList != null) {
                        fVar.setTintList(colorStateList);
                    }
                }
                return;
            case 3:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f453b;
                actionBarOverlayLayout.f942t0 = null;
                actionBarOverlayLayout.f930g0 = false;
                return;
            case 4:
                qa.j jVar = (qa.j) this.f453b;
                jVar.p();
                jVar.f12437r.start();
                return;
            case l1.c.f8511g /* 5 */:
                ((HideBottomViewOnScrollBehavior) this.f453b).f2926k = null;
                return;
            default:
                ((HideViewOnScrollBehavior) this.f453b).f2937k = null;
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f452a) {
            case 0:
                ((g1) this.f453b).c();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
            default:
                super.onAnimationStart(animator);
                return;
            case 2:
                d8.f fVar = (d8.f) this.f453b;
                ArrayList arrayList = new ArrayList(fVar.X);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ba.a) arrayList.get(i2)).a(fVar);
                }
                return;
        }
    }

    public /* synthetic */ e1(int i2, Object obj) {
        this.f452a = i2;
        this.f453b = obj;
    }
}
