package i5;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class z extends c {

    /* renamed from: e0  reason: collision with root package name */
    public boolean f7024e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f7025f0;

    @Override // i5.c
    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    @Override // i5.c
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, v.f6994b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.f7024e0 = true;
                } else if (index == 22) {
                    this.f7025f0 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void l(e5.p pVar, int i2, int i10);

    @Override // i5.c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7024e0 || this.f7025f0) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i2 = 0; i2 < this.B; i2++) {
                    View view = (View) constraintLayout.A.get(this.A[i2]);
                    if (view != null) {
                        if (this.f7024e0) {
                            view.setVisibility(visibility);
                        }
                        if (this.f7025f0 && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }
}
