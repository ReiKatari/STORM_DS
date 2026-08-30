package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1283b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1284c;

    /* renamed from: d  reason: collision with root package name */
    public p0 f1285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e2 e2Var, boolean z10) {
        super(e2Var);
        e2Var.getClass();
        this.f1283b = z10;
    }

    public final p0 b(Context context) {
        boolean z10;
        int exitAnim;
        Animation loadAnimation;
        p0 p0Var;
        int i2;
        if (this.f1284c) {
            return this.f1285d;
        }
        e2 e2Var = this.f1343a;
        j0 j0Var = e2Var.f1273c;
        if (e2Var.f1271a == i2.VISIBLE) {
            z10 = true;
        } else {
            z10 = false;
        }
        int nextTransition = j0Var.getNextTransition();
        if (this.f1283b) {
            if (z10) {
                exitAnim = j0Var.getPopEnterAnim();
            } else {
                exitAnim = j0Var.getPopExitAnim();
            }
        } else if (z10) {
            exitAnim = j0Var.getEnterAnim();
        } else {
            exitAnim = j0Var.getExitAnim();
        }
        j0Var.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = j0Var.mContainer;
        p0 p0Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            j0Var.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = j0Var.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = j0Var.onCreateAnimation(nextTransition, z10, exitAnim);
            if (onCreateAnimation != null) {
                p0Var2 = new p0(onCreateAnimation);
            } else {
                Animator onCreateAnimator = j0Var.onCreateAnimator(nextTransition, z10, exitAnim);
                if (onCreateAnimator != null) {
                    p0Var2 = new p0(onCreateAnimator);
                } else {
                    if (exitAnim == 0 && nextTransition != 0) {
                        if (nextTransition != 4097) {
                            if (nextTransition != 8194) {
                                if (nextTransition != 8197) {
                                    if (nextTransition != 4099) {
                                        if (nextTransition != 4100) {
                                            i2 = -1;
                                        } else if (z10) {
                                            i2 = l0.f.J(context, 16842936);
                                        } else {
                                            i2 = l0.f.J(context, 16842937);
                                        }
                                    } else if (z10) {
                                        i2 = R.animator.fragment_fade_enter;
                                    } else {
                                        i2 = R.animator.fragment_fade_exit;
                                    }
                                } else if (z10) {
                                    i2 = l0.f.J(context, 16842938);
                                } else {
                                    i2 = l0.f.J(context, 16842939);
                                }
                            } else if (z10) {
                                i2 = R.animator.fragment_close_enter;
                            } else {
                                i2 = R.animator.fragment_close_exit;
                            }
                        } else if (z10) {
                            i2 = R.animator.fragment_open_enter;
                        } else {
                            i2 = R.animator.fragment_open_exit;
                        }
                        exitAnim = i2;
                    }
                    if (exitAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
                        try {
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                                } catch (Resources.NotFoundException e6) {
                                    throw e6;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    p0Var = new p0(loadAnimation);
                                    p0Var2 = p0Var;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                            if (loadAnimator != null) {
                                p0Var = new p0(loadAnimator);
                                p0Var2 = p0Var;
                            }
                        } catch (RuntimeException e10) {
                            if (!equals) {
                                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                                if (loadAnimation2 != null) {
                                    p0Var2 = new p0(loadAnimation2);
                                }
                            } else {
                                throw e10;
                            }
                        }
                    }
                }
            }
        }
        this.f1285d = p0Var2;
        this.f1284c = true;
        return p0Var2;
    }
}
