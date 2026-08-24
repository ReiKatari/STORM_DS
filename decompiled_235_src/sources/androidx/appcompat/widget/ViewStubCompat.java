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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int A;
    public int B;
    public WeakReference L;
    public LayoutInflater R;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m75.B, 0, 0);
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
            i.h("ViewStub must have a valid layoutResource");
            return null;
        }
        i.m("ViewStub must have a non-null ViewGroup viewParent");
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
                i.m("setVisibility called on un-referenced view");
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

    public void setOnInflateListener(rp7 rp7Var) {
    }
}
