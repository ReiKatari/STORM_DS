package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class d extends f {
    public final boolean b;
    public boolean c;
    public k91 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b0 b0Var, boolean z) {
        super(b0Var);
        b0Var.getClass();
        this.b = z;
    }

    public final k91 b(Context context) {
        boolean z;
        int exitAnim;
        Animation loadAnimation;
        k91 k91Var;
        int i;
        if (this.c) {
            return this.d;
        }
        b0 b0Var = this.a;
        o oVar = b0Var.c;
        if (b0Var.a == kc6.VISIBLE) {
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
        k91 k91Var2 = null;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            oVar.mContainer.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = oVar.mContainer;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            Animation onCreateAnimation = oVar.onCreateAnimation(nextTransition, z, exitAnim);
            if (onCreateAnimation != null) {
                k91Var2 = new k91(onCreateAnimation);
            } else {
                Animator onCreateAnimator = oVar.onCreateAnimator(nextTransition, z, exitAnim);
                if (onCreateAnimator != null) {
                    k91Var2 = new k91(onCreateAnimator);
                } else {
                    if (exitAnim == 0 && nextTransition != 0) {
                        if (nextTransition != 4097) {
                            if (nextTransition != 8194) {
                                if (nextTransition != 8197) {
                                    if (nextTransition != 4099) {
                                        if (nextTransition != 4100) {
                                            i = -1;
                                        } else if (z) {
                                            i = yf2.U(context, 16842936);
                                        } else {
                                            i = yf2.U(context, 16842937);
                                        }
                                    } else if (z) {
                                        i = R.animator.fragment_fade_enter;
                                    } else {
                                        i = R.animator.fragment_fade_exit;
                                    }
                                } else if (z) {
                                    i = yf2.U(context, 16842938);
                                } else {
                                    i = yf2.U(context, 16842939);
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
                                    k91Var = new k91(loadAnimation);
                                    k91Var2 = k91Var;
                                }
                            }
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, exitAnim);
                            if (loadAnimator != null) {
                                k91Var = new k91(loadAnimator);
                                k91Var2 = k91Var;
                            }
                        } catch (RuntimeException e2) {
                            if (!equals) {
                                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, exitAnim);
                                if (loadAnimation2 != null) {
                                    k91Var2 = new k91(loadAnimation2);
                                }
                            } else {
                                throw e2;
                            }
                        }
                    }
                }
            }
        }
        this.d = k91Var2;
        this.c = true;
        return k91Var2;
    }
}
