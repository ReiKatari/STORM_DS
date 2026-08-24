package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class d extends f {
    public final boolean b;
    public boolean c;
    public yc1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b0 b0Var, boolean z) {
        super(b0Var);
        b0Var.getClass();
        this.b = z;
    }

    public final yc1 b(Context context) {
        boolean z;
        int exitAnim;
        Animation loadAnimation;
        yc1 yc1Var;
        int i;
        if (this.c) {
            return this.d;
        }
        b0 b0Var = this.a;
        o oVar = b0Var.c;
        if (b0Var.a == ao6.VISIBLE) {
            z = true;
        } else {
            z = false;
        }
        int nextTransition = oVar.getNextTransition();
        if (this.b) {
            if (z) {
                exitAnim = oVar.getPopEnterAnim();
            } else {
                exitAnim = oVar.getPopExitAnim();
            }
        } else if (z) {
            exitAnim = oVar.getEnterAnim();
        } else {
            exitAnim = oVar.getExitAnim();
        }
        oVar.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = oVar.mContainer;
        yc1 yc1Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            oVar.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = oVar.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = oVar.onCreateAnimation(nextTransition, z, exitAnim);
            if (onCreateAnimation != null) {
                yc1Var2 = new yc1(onCreateAnimation);
            } else {
                Animator onCreateAnimator = oVar.onCreateAnimator(nextTransition, z, exitAnim);
                if (onCreateAnimator != null) {
                    yc1Var2 = new yc1(onCreateAnimator);
                } else {
                    if (exitAnim == 0 && nextTransition != 0) {
                        if (nextTransition != 4097) {
                            if (nextTransition != 8194) {
                                if (nextTransition != 8197) {
                                    if (nextTransition != 4099) {
                                        if (nextTransition != 4100) {
                                            i = -1;
                                        } else if (z) {
                                            i = xk2.J(context, 16842936);
                                        } else {
                                            i = xk2.J(context, 16842937);
                                        }
                                    } else if (z) {
                                        i = R.animator.fragment_fade_enter;
                                    } else {
                                        i = R.animator.fragment_fade_exit;
                                    }
                                } else if (z) {
                                    i = xk2.J(context, 16842938);
                                } else {
                                    i = xk2.J(context, 16842939);
                                }
                            } else if (z) {
                                i = R.animator.fragment_close_enter;
                            } else {
                                i = R.animator.fragment_close_exit;
                            }
                        } else if (z) {
                            i = R.animator.fragment_open_enter;
                        } else {
                            i = R.animator.fragment_open_exit;
                        }
                        exitAnim = i;
                    }
                    if (exitAnim != 0) {
                        boolean equals = "anim".equals(context.getResources().getResourceTypeName(exitAnim));
                        try {
                            if (equals) {
                                try {
                                    loadAnimation = AnimationUtils.loadAnimation(context, exitAnim);
                                } catch (Resources.NotFoundException e) {
                                    throw e;
                                } catch (RuntimeException unused) {
                                }
                                if (loadAnimation != null) {
                                    yc1Var = new yc1(loadAnimation);
                                    yc1Var2 = yc1Var;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                            if (loadAnimator != null) {
                                yc1Var = new yc1(loadAnimator);
                                yc1Var2 = yc1Var;
                            }
                        } catch (RuntimeException e2) {
                            if (!equals) {
                                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                                if (loadAnimation2 != null) {
                                    yc1Var2 = new yc1(loadAnimation2);
                                }
                            } else {
                                throw e2;
                            }
                        }
                    }
                }
            }
        }
        this.d = yc1Var2;
        this.c = true;
        return yc1Var2;
    }
}
