package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v14  reason: default package */
/* loaded from: classes.dex */
public final class v14 extends q14 {
    public final float g;
    public final float h;

    public v14(View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.h = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new q92(1));
        return animatorSet;
    }

    public final void b(float f) {
        float f2;
        float interpolation = this.a.getInterpolation(f);
        View view = this.b;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width > RecyclerView.B1 && height > RecyclerView.B1) {
            float a = 1.0f - vo.a(RecyclerView.B1, this.g / width, interpolation);
            float a2 = 1.0f - vo.a(RecyclerView.B1, this.h / height, interpolation);
            if (!Float.isNaN(a) && !Float.isNaN(a2)) {
                view.setScaleX(a);
                view.setPivotY(height);
                view.setScaleY(a2);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        View childAt = viewGroup.getChildAt(i);
                        childAt.setPivotY(-childAt.getTop());
                        if (a2 != RecyclerView.B1) {
                            f2 = a / a2;
                        } else {
                            f2 = 1.0f;
                        }
                        childAt.setScaleY(f2);
                    }
                }
            }
        }
    }
}
