package b4;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d1 extends ViewGroup {
    public final HashMap A;
    public final HashMap B;

    public d1(Context context) {
        super(context);
        setClipChildren(false);
        this.A = new HashMap();
        this.B = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, a4.o0> getHolderToLayoutNode() {
        return this.A;
    }

    public final HashMap<a4.o0, Object> getLayoutNodeToHolder() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        Iterator it = this.A.keySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        throw w.d.k(it);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i10) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            x3.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            x3.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i2), View.MeasureSpec.getSize(i10));
        Iterator it = this.A.keySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        throw w.d.k(it);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            a4.o0 o0Var = (a4.o0) this.A.get(childAt);
            if (childAt.isLayoutRequested() && o0Var != null) {
                a4.o0.X(o0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
