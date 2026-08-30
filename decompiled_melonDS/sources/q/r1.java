package q;

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
import java.lang.reflect.InvocationTargetException;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class r1 extends ListView {
    public final Rect A;
    public int B;
    public int L;
    public int R;

    /* renamed from: b0  reason: collision with root package name */
    public int f12008b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f12009c0;

    /* renamed from: d0  reason: collision with root package name */
    public p1 f12010d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f12011e0;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f12012f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f12013g0;

    /* renamed from: h0  reason: collision with root package name */
    public f6.d f12014h0;

    /* renamed from: i0  reason: collision with root package name */
    public ad.g f12015i0;

    public r1(Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.A = new Rect();
        this.B = 0;
        this.L = 0;
        this.R = 0;
        this.f12008b0 = 0;
        this.f12012f0 = z10;
        setCacheColorHint(0);
    }

    public final int a(int i2, int i10) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i11 = listPaddingTop + listPaddingBottom;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            if (i14 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i2, makeMeasureSpec);
            view.forceLayout();
            if (i13 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i10) {
                return i10;
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0148 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.r1.b(android.view.MotionEvent, int):boolean");
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
        if (this.f12015i0 == null) {
            super.drawableStateChanged();
            p1 p1Var = this.f12010d0;
            if (p1Var != null) {
                p1Var.B = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f12013g0 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f12012f0 && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f12012f0 && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f12012f0 && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.f12012f0 && this.f12011e0) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f12015i0 = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f12015i0 == null) {
            ad.g gVar = new ad.g(13, this);
            this.f12015i0 = gVar;
            post(gVar);
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
                if (i2 >= 30 && n1.f11981d) {
                    try {
                        n1.f11978a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        n1.f11979b.invoke(this, Integer.valueOf(pointToPosition));
                        n1.f11980c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e6) {
                        e6.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                } else {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f12013g0 && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f12009c0 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        ad.g gVar = this.f12015i0;
        if (gVar != null) {
            r1 r1Var = (r1) gVar.B;
            r1Var.f12015i0 = null;
            r1Var.removeCallbacks(gVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f12011e0 = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$Callback, q.p1, android.graphics.drawable.Drawable] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        p1 p1Var = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.A;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.A = drawable;
            drawable.setCallback(drawable2);
            drawable2.B = true;
            p1Var = drawable2;
        }
        this.f12010d0 = p1Var;
        super.setSelector(p1Var);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.B = rect.left;
        this.L = rect.top;
        this.R = rect.right;
        this.f12008b0 = rect.bottom;
    }
}
