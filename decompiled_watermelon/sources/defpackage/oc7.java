package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oc7  reason: default package */
/* loaded from: classes.dex */
public abstract class oc7 extends gy0 {
    public boolean f0;
    public boolean g0;

    @Override // defpackage.gy0
    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    @Override // defpackage.gy0
    public void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, tx4.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f0 = true;
                } else if (index == 22) {
                    this.g0 = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void l(pc7 pc7Var, int i, int i2);

    @Override // defpackage.gy0, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f0 || this.g0) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.B; i++) {
                    View view = (View) constraintLayout.A.get(this.A[i]);
                    if (view != null) {
                        if (this.f0) {
                            view.setVisibility(visibility);
                        }
                        if (this.g0 && elevation > RecyclerView.A1) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }
}
