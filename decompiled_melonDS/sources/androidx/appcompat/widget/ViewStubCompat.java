package androidx.appcompat.widget;

import a0.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import q.s3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public int A;
    public int B;
    public WeakReference L;
    public LayoutInflater R;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.A = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.a.B, 0, 0);
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
                int i2 = this.B;
                if (i2 != -1) {
                    inflate.setId(i2);
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
            j.h("ViewStub must have a valid layoutResource");
            return null;
        }
        j.p("ViewStub must have a non-null ViewGroup viewParent");
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
    public final void onMeasure(int i2, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.B = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.R = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.A = i2;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        WeakReference weakReference = this.L;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i2);
                return;
            } else {
                j.p("setVisibility called on un-referenced view");
                return;
            }
        }
        super.setVisibility(i2);
        if (i2 != 0 && i2 != 4) {
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

    public void setOnInflateListener(s3 s3Var) {
    }
}
