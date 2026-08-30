package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList A;
    public final ArrayList B;
    public View.OnApplyWindowInsetsListener L;
    public boolean R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, g1 g1Var) {
        super(context, attributeSet);
        View view;
        String str;
        context.getClass();
        attributeSet.getClass();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.R = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i2 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q6.a.f12309b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        j0 C = g1Var.C(id2);
        if (classAttribute != null && C == null) {
            if (id2 == -1) {
                if (string != null) {
                    str = " with tag ".concat(string);
                } else {
                    str = "";
                }
                a0.j.p(kc.a.g("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str));
                throw null;
            }
            z0 H = g1Var.H();
            context.getClassLoader();
            j0 a10 = H.a(classAttribute);
            a10.getClass();
            a10.mFragmentId = id2;
            a10.mContainerId = id2;
            a10.mTag = string;
            a10.mFragmentManager = g1Var;
            a10.mHost = g1Var.f1331w;
            a10.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(g1Var);
            aVar.f1243r = true;
            a10.mContainer = this;
            a10.mInDynamicContainer = true;
            aVar.g(getId(), a10, string, 1);
            if (!aVar.f1235i) {
                aVar.f1236j = false;
                aVar.f1245t.A(aVar, true);
            } else {
                a0.j.p("This transaction is already being added to the back stack");
                throw null;
            }
        }
        ArrayList d4 = g1Var.f1312c.d();
        int size = d4.size();
        while (i2 < size) {
            Object obj = d4.get(i2);
            i2++;
            p1 p1Var = (p1) obj;
            j0 j0Var = p1Var.f1392c;
            if (j0Var.mContainerId == getId() && (view = j0Var.mView) != null && view.getParent() == null) {
                j0Var.mContainer = this;
                p1Var.b();
                p1Var.k();
            }
        }
    }

    public final void a(View view) {
        if (this.B.contains(view)) {
            this.A.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        j0 j0Var;
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof j0) {
            j0Var = (j0) tag;
        } else {
            j0Var = null;
        }
        if (j0Var != null) {
            super.addView(view, i2, layoutParams);
        } else {
            fj.j.f(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        a6.i2 i2Var;
        windowInsets.getClass();
        a6.i2 g10 = a6.i2.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.L;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            i2Var = a6.i2.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = a6.x0.f533a;
            WindowInsets f8 = g10.f();
            if (f8 != null) {
                WindowInsets b10 = a6.n0.b(this, f8);
                if (!b10.equals(f8)) {
                    g10 = a6.i2.g(this, b10);
                }
            }
            i2Var = g10;
        }
        if (!i2Var.f479a.n()) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                a6.x0.c(getChildAt(i2), i2Var);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        if (this.R) {
            ArrayList arrayList = this.A;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        canvas.getClass();
        view.getClass();
        if (this.R) {
            ArrayList arrayList = this.A;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        view.getClass();
        this.B.remove(view);
        if (this.A.remove(view)) {
            this.R = true;
        }
        super.endViewTransition(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    public final <F extends j0> F getFragment() {
        o0 o0Var;
        j0 j0Var;
        g1 t5;
        FragmentContainerView fragmentContainerView = this;
        while (true) {
            o0Var = null;
            if (fragmentContainerView != 0) {
                Object tag = fragmentContainerView.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof j0) {
                    j0Var = (j0) tag;
                } else {
                    j0Var = null;
                }
                if (j0Var != null) {
                    break;
                }
                ViewParent parent = fragmentContainerView.getParent();
                if (parent instanceof View) {
                    fragmentContainerView = (View) parent;
                } else {
                    fragmentContainerView = 0;
                }
            } else {
                j0Var = null;
                break;
            }
        }
        if (j0Var != null) {
            if (j0Var.isAdded()) {
                t5 = j0Var.getChildFragmentManager();
            } else {
                throw new IllegalStateException("The Fragment " + j0Var + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof o0) {
                    o0Var = (o0) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (o0Var != null) {
                t5 = o0Var.t();
            } else {
                a0.j.o(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
        }
        return (F) t5.C(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        windowInsets.getClass();
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                childAt.getClass();
                a(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        view.getClass();
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i2) {
        View childAt = getChildAt(i2);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i2, int i10) {
        int i11 = i2 + i10;
        for (int i12 = i2; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i2, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i2, int i10) {
        int i11 = i2 + i10;
        for (int i12 = i2; i12 < i11; i12++) {
            View childAt = getChildAt(i12);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i2, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean z10) {
        this.R = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.L = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        view.getClass();
        if (view.getParent() == this) {
            this.B.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        context.getClass();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.R = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q6.a.f12309b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }
}
