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
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public final ArrayList A;
    public final ArrayList B;
    public View.OnApplyWindowInsetsListener L;
    public boolean R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, u uVar) {
        super(context, attributeSet);
        View view;
        String str;
        context.getClass();
        attributeSet.getClass();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.R = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h75.b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        o C = uVar.C(id);
        if (classAttribute != null && C == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag ".concat(string);
                } else {
                    str = "";
                }
                defpackage.i.m(lb1.A("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str));
                throw null;
            }
            gl2 H = uVar.H();
            context.getClassLoader();
            o a = H.a(classAttribute);
            a.getClass();
            a.mFragmentId = id;
            a.mContainerId = id;
            a.mTag = string;
            a.mFragmentManager = uVar;
            a.mHost = uVar.w;
            a.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(uVar);
            aVar.r = true;
            a.mContainer = this;
            a.mInDynamicContainer = true;
            aVar.d(getId(), a, string, 1);
            if (!aVar.i) {
                aVar.j = false;
                aVar.t.A(aVar, true);
            } else {
                defpackage.i.m("This transaction is already being added to the back stack");
                throw null;
            }
        }
        ArrayList d = uVar.c.d();
        int size = d.size();
        while (i < size) {
            Object obj = d.get(i);
            i++;
            x xVar = (x) obj;
            o oVar = xVar.c;
            if (oVar.mContainerId == getId() && (view = oVar.mView) != null && view.getParent() == null) {
                oVar.mContainer = this;
                xVar.b();
                xVar.k();
            }
        }
    }

    public final void a(View view) {
        if (this.B.contains(view)) {
            this.A.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        o oVar;
        view.getClass();
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof o) {
            oVar = (o) tag;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            super.addView(view, i, layoutParams);
        } else {
            e41.g(view, " is not associated with a Fragment.", "Views added to a FragmentContainerView must be associated with a Fragment. View ");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        vu7 vu7Var;
        windowInsets.getClass();
        vu7 g = vu7.g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.L;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            onApplyWindowInsets.getClass();
            vu7Var = vu7.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = ao7.a;
            WindowInsets f = g.f();
            if (f != null && !f.equals(f)) {
                g = vu7.g(this, f);
            }
            vu7Var = g;
        }
        if (!vu7Var.a.r()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ao7.c(getChildAt(i), vu7Var);
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
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        canvas.getClass();
        view.getClass();
        if (this.R) {
            ArrayList arrayList = this.A;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
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
    /* JADX WARN: Type inference failed for: r0v16, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    public final <F extends o> F getFragment() {
        o oVar;
        p pVar;
        u t;
        FragmentContainerView fragmentContainerView = this;
        while (true) {
            if (fragmentContainerView != 0) {
                Object tag = fragmentContainerView.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof o) {
                    oVar = (o) tag;
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    break;
                }
                ViewParent parent = fragmentContainerView.getParent();
                if (parent instanceof View) {
                    fragmentContainerView = (View) parent;
                } else {
                    fragmentContainerView = 0;
                }
            } else {
                oVar = null;
                break;
            }
        }
        if (oVar != null) {
            if (oVar.isAdded()) {
                t = oVar.getChildFragmentManager();
            } else {
                throw new IllegalStateException("The Fragment " + oVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof p) {
                        pVar = (p) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    pVar = null;
                    break;
                }
            }
            if (pVar != null) {
                t = pVar.t();
            } else {
                e41.o(this, " is not within a subclass of FragmentActivity.", "View ");
                return null;
            }
        }
        return (F) t.C(getId());
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
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        childAt.getClass();
        a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        view.getClass();
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            childAt.getClass();
            a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.R = z;
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
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h75.b, 0, 0);
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
