package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.stormds.emulator.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mp1  reason: default package */
/* loaded from: classes.dex */
public class mp1 extends ListView {
    public final Rect A;
    public int B;
    public int L;
    public int R;
    public int d0;
    public int e0;
    public kp1 f0;
    public boolean g0;
    public final boolean h0;
    public boolean i0;
    public fx3 j0;
    public g15 k0;

    public mp1(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.A = new Rect();
        this.B = 0;
        this.L = 0;
        this.R = 0;
        this.d0 = 0;
        this.h0 = z;
        setCacheColorHint(0);
    }

    public final int a(int i, int i2) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i3 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            if (i6 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0148 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(MotionEvent motionEvent, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z5 = true;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z = true;
                    z5 = false;
                    if (z || z5) {
                        this.i0 = false;
                        setPressed(false);
                        drawableStateChanged();
                        childAt2 = getChildAt(this.e0 - getFirstVisiblePosition());
                        if (childAt2 != null) {
                            childAt2.setPressed(false);
                        }
                    }
                    fx3 fx3Var = this.j0;
                    if (!z) {
                        if (fx3Var == null) {
                            this.j0 = new fx3(this);
                        }
                        fx3 fx3Var2 = this.j0;
                        boolean z6 = fx3Var2.l0;
                        fx3Var2.l0 = true;
                        fx3Var2.onTouch(this, motionEvent);
                    } else if (fx3Var != null) {
                        if (fx3Var.l0) {
                            fx3Var.d();
                        }
                        fx3Var.l0 = false;
                    }
                    return z;
                }
                z = false;
                z5 = false;
                if (z) {
                }
                this.i0 = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.e0 - getFirstVisiblePosition());
                if (childAt2 != null) {
                }
                fx3 fx3Var3 = this.j0;
                if (!z) {
                }
                return z;
            }
            z = true;
        } else {
            z = false;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex >= 0) {
            int x = (int) motionEvent.getX(findPointerIndex);
            int y = (int) motionEvent.getY(findPointerIndex);
            int pointToPosition = pointToPosition(x, y);
            if (pointToPosition != -1) {
                View childAt3 = getChildAt(pointToPosition - getFirstVisiblePosition());
                float f = x;
                float f2 = y;
                this.i0 = true;
                hp1.a(this, f, f2);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i2 = this.e0;
                if (i2 != -1 && (childAt = getChildAt(i2 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.e0 = pointToPosition;
                hp1.a(childAt3, f - childAt3.getLeft(), f2 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                if (selector != null && pointToPosition != -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.A;
                rect.set(left, top, right, bottom);
                rect.left -= this.B;
                rect.top -= this.L;
                rect.right += this.R;
                rect.bottom += this.d0;
                if (Build.VERSION.SDK_INT >= 33) {
                    z3 = jp1.a(this);
                } else {
                    Field field = lp1.a;
                    if (field != null) {
                        try {
                            z3 = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                    z3 = false;
                }
                if (childAt3.isEnabled() != z3) {
                    boolean z7 = !z3;
                    if (Build.VERSION.SDK_INT >= 33) {
                        jp1.b(this, z7);
                    } else {
                        Field field2 = lp1.a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z7));
                            } catch (IllegalAccessException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    if (pointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z2) {
                    float exactCenterX = rect.exactCenterX();
                    float exactCenterY = rect.exactCenterY();
                    if (getVisibility() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    selector.setVisible(z4, false);
                    selector.setHotspot(exactCenterX, exactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && pointToPosition != -1) {
                    selector2.setHotspot(f, f2);
                }
                kp1 kp1Var = this.f0;
                if (kp1Var != null) {
                    kp1Var.B = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, pointToPosition, getItemIdAtPosition(pointToPosition));
                }
                z5 = false;
                z = true;
            }
            if (z) {
            }
            this.i0 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.e0 - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
            fx3 fx3Var32 = this.j0;
            if (!z) {
            }
            return z;
        }
        z = false;
        z5 = false;
        if (z) {
        }
        this.i0 = false;
        setPressed(false);
        drawableStateChanged();
        childAt2 = getChildAt(this.e0 - getFirstVisiblePosition());
        if (childAt2 != null) {
        }
        fx3 fx3Var322 = this.j0;
        if (!z) {
        }
        return z;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.A;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.k0 == null) {
            super.drawableStateChanged();
            kp1 kp1Var = this.f0;
            if (kp1Var != null) {
                kp1Var.B = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.i0 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.h0 && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.h0 && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.h0 && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.h0 && this.g0) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.k0 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.k0 == null) {
            g15 g15Var = new g15(this, 5);
            this.k0 = g15Var;
            post(g15Var);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i >= 30 && ip1.d) {
                    try {
                        ip1.a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        ip1.b.invoke(this, Integer.valueOf(pointToPosition));
                        ip1.c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e2) {
                        e2.printStackTrace();
                    }
                } else {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.i0 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.e0 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        g15 g15Var = this.k0;
        if (g15Var != null) {
            mp1 mp1Var = (mp1) g15Var.B;
            mp1Var.k0 = null;
            mp1Var.removeCallbacks(g15Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.g0 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable, kp1] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        kp1 kp1Var = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.A;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.A = drawable;
            drawable.setCallback(drawable2);
            drawable2.B = true;
            kp1Var = drawable2;
        }
        this.f0 = kp1Var;
        super.setSelector(kp1Var);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.B = rect.left;
        this.L = rect.top;
        this.R = rect.right;
        this.d0 = rect.bottom;
    }
}
