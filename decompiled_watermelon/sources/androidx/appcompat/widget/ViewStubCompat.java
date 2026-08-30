package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int A;
    public int B;
    public WeakReference L;
    public LayoutInflater R;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, by4.B, 0, 0);
        this.B = obtainStyledAttributes.getResourceId(2, -1);
        this.A = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.A != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.R;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.A, viewGroup, false);
                int i = this.B;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.L = new WeakReference(inflate);
                return inflate;
            }
            i.i("ViewStub must have a valid layoutResource");
            return null;
        }
        i.n("ViewStub must have a non-null ViewGroup viewParent");
        return null;
    }

    public int getInflatedId() {
        return this.B;
    }

    public LayoutInflater getLayoutInflater() {
        return this.R;
    }

    public int getLayoutResource() {
        return this.A;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.B = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.R = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.A = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.L;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            } else {
                i.n("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i);
        if (i != 0 && i != 4) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public void setOnInflateListener(qb7 qb7Var) {
    }
}
