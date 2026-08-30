package androidx.core.widget;

import a.a;
import a0.j;
import a6.a0;
import a6.p0;
import a6.r;
import a6.t;
import a6.u;
import a6.x0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.preference.Preference;
import com.google.android.material.datepicker.h;
import f6.c;
import f6.e;
import f6.f;
import f6.g;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements t {
    public static final float A0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final h B0 = new h(3);
    public static final int[] C0 = {16843130};
    public final float A;
    public long B;
    public final Rect L;
    public final OverScroller R;

    /* renamed from: b0  reason: collision with root package name */
    public final EdgeEffect f1203b0;

    /* renamed from: c0  reason: collision with root package name */
    public final EdgeEffect f1204c0;

    /* renamed from: d0  reason: collision with root package name */
    public a0 f1205d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f1206e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f1207f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f1208g0;

    /* renamed from: h0  reason: collision with root package name */
    public View f1209h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1210i0;

    /* renamed from: j0  reason: collision with root package name */
    public VelocityTracker f1211j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f1212k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f1213l0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f1214m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f1215n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f1216o0;
    public int p0;

    /* renamed from: q0  reason: collision with root package name */
    public final int[] f1217q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int[] f1218r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f1219s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f1220t0;

    /* renamed from: u0  reason: collision with root package name */
    public g f1221u0;

    /* renamed from: v0  reason: collision with root package name */
    public final u f1222v0;

    /* renamed from: w0  reason: collision with root package name */
    public final r f1223w0;

    /* renamed from: x0  reason: collision with root package name */
    public float f1224x0;

    /* renamed from: y0  reason: collision with root package name */
    public f f1225y0;

    /* renamed from: z0  reason: collision with root package name */
    public final a6.h f1226z0;

    /* JADX WARN: Type inference failed for: r7v2, types: [a6.u, java.lang.Object] */
    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.L = new Rect();
        this.f1207f0 = true;
        this.f1208g0 = false;
        this.f1209h0 = null;
        this.f1210i0 = false;
        this.f1213l0 = true;
        this.p0 = -1;
        this.f1217q0 = new int[2];
        this.f1218r0 = new int[2];
        this.f1226z0 = new a6.h(getContext(), new d2.t(5, this));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = c.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f1203b0 = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = c.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f1204c0 = edgeEffect2;
        this.A = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.R = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1214m0 = viewConfiguration.getScaledTouchSlop();
        this.f1215n0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1216o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1222v0 = new Object();
        this.f1223w0 = new r(this);
        setNestedScrollingEnabled(true);
        x0.o(this, B0);
    }

    private a0 getScrollFeedbackProvider() {
        if (this.f1205d0 == null) {
            this.f1205d0 = new a0(this);
        }
        return this.f1205d0;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view != nestedScrollView) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && l((View) parent, nestedScrollView)) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a6.s
    public final void a(View view, View view2, int i2, int i10) {
        u uVar = this.f1222v0;
        if (i10 == 1) {
            uVar.f516b = i2;
        } else {
            uVar.f515a = i2;
        }
        this.f1223w0.g(2, i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
        } else {
            j.p("ScrollView can host only one direct child");
        }
    }

    @Override // a6.s
    public final void b(View view, int i2) {
        u uVar = this.f1222v0;
        if (i2 == 1) {
            uVar.f516b = 0;
        } else {
            uVar.f515a = 0;
        }
        w(i2);
    }

    @Override // a6.s
    public final void c(View view, int i2, int i10, int[] iArr, int i11) {
        this.f1223w0.c(i2, i10, i11, iArr, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return (scrollY - max) + bottom;
        }
        return bottom;
    }

    @Override // a6.t
    public final void d(View view, int i2, int i10, int i11, int i12, int i13, int[] iArr) {
        n(i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !i(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f8, float f10, boolean z10) {
        return this.f1223w0.a(f8, f10, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f8, float f10) {
        return this.f1223w0.b(f8, f10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i10, int[] iArr, int[] iArr2) {
        return this.f1223w0.c(i2, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i10, int i11, int i12, int[] iArr) {
        return this.f1223w0.d(i2, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1203b0;
        int i10 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft();
            } else {
                i2 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i2, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f1204c0;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i10 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // a6.s
    public final void e(View view, int i2, int i10, int i11, int i12, int i13) {
        n(i12, i13, null);
    }

    @Override // a6.s
    public final boolean f(View view, View view2, int i2, int i10) {
        if ((i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean g(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View view = findFocus;
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && m(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.L;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            s(h(rect), -1, null, 0, 1, true);
            findNextFocus.requestFocus(i2);
        } else {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(maxScrollAmount, -1, null, 0, 1, true);
        }
        if (view != null && view.isFocused() && !m(view, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        u uVar = this.f1222v0;
        return uVar.f516b | uVar.f515a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1224x0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1224x0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                j.p("Expected theme to define listPreferredItemHeight.");
                return 0.0f;
            }
        }
        return this.f1224x0;
    }

    public final int h(Rect rect) {
        int i2;
        int i10;
        int i11;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i2 = i12 - verticalFadingEdgeLength;
        } else {
            i2 = i12;
        }
        int i13 = rect.bottom;
        if (i13 > i2 && rect.top > scrollY) {
            if (rect.height() > height) {
                i11 = rect.top - scrollY;
            } else {
                i11 = rect.bottom - i2;
            }
            return Math.min(i11, (childAt.getBottom() + layoutParams.bottomMargin) - i12);
        } else if (rect.top >= scrollY || i13 >= i2) {
            return 0;
        } else {
            if (rect.height() > height) {
                i10 = 0 - (i2 - rect.bottom);
            } else {
                i10 = 0 - (scrollY - rect.top);
            }
            return Math.max(i10, -getScrollY());
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1223w0.f(0);
    }

    public final boolean i(KeyEvent keyEvent) {
        this.L.setEmpty();
        int i2 = 130;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 19) {
                        if (keyCode != 20) {
                            if (keyCode != 62) {
                                if (keyCode != 92) {
                                    if (keyCode != 93) {
                                        if (keyCode != 122) {
                                            if (keyCode == 123) {
                                                q(130);
                                                return false;
                                            }
                                        } else {
                                            q(33);
                                            return false;
                                        }
                                    } else {
                                        return k(130);
                                    }
                                } else {
                                    return k(33);
                                }
                            } else {
                                if (keyEvent.isShiftPressed()) {
                                    i2 = 33;
                                }
                                q(i2);
                                return false;
                            }
                        } else if (keyEvent.isAltPressed()) {
                            return k(130);
                        } else {
                            return g(130);
                        }
                    } else if (keyEvent.isAltPressed()) {
                        return k(33);
                    } else {
                        return g(33);
                    }
                }
                return false;
            }
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1223w0.f512d;
    }

    public final void j(int i2) {
        if (getChildCount() > 0) {
            this.R.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Preference.DEFAULT_ORDER, 0, 0);
            this.f1223w0.g(2, 1);
            this.f1220t0 = getScrollY();
            postInvalidateOnAnimation();
            if (Build.VERSION.SDK_INT >= 35) {
                e.a(this, Math.abs(this.R.getCurrVelocity()));
            }
        }
    }

    public final boolean k(int i2) {
        boolean z10;
        int childCount;
        if (i2 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        Rect rect = this.L;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i2, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i2, int i10) {
        Rect rect = this.L;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i10) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int i2, int i10, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1223w0.d(0, scrollY2, 0, i2 - scrollY2, null, i10, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.p0) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f1206e0 = (int) motionEvent.getY(i2);
            this.p0 = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1211j0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1208g0 = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        int i10;
        float f8;
        if (motionEvent.getAction() == 8 && !this.f1210i0) {
            if (l0.f.s(motionEvent, 2)) {
                f8 = motionEvent.getAxisValue(9);
                i2 = 9;
                i10 = (int) motionEvent.getX();
            } else if (l0.f.s(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i10 = getWidth() / 2;
                i2 = 26;
                f8 = axisValue;
            } else {
                i2 = 0;
                i10 = 0;
                f8 = 0.0f;
            }
            if (f8 != 0.0f) {
                s(-((int) (getVerticalScrollFactorCompat() * f8)), i2, motionEvent, i10, 1, l0.f.s(motionEvent, 8194));
                if (i2 != 0) {
                    this.f1226z0.a(motionEvent, i2);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f1210i0) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 6) {
                            o(motionEvent);
                        }
                    }
                } else {
                    int i10 = this.p0;
                    if (i10 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i10);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i10 + " in onInterceptTouchEvent");
                        } else {
                            int y10 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y10 - this.f1206e0) > this.f1214m0 && (2 & getNestedScrollAxes()) == 0) {
                                this.f1210i0 = true;
                                this.f1206e0 = y10;
                                if (this.f1211j0 == null) {
                                    this.f1211j0 = VelocityTracker.obtain();
                                }
                                this.f1211j0.addMovement(motionEvent);
                                this.f1219s0 = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            }
            this.f1210i0 = false;
            this.p0 = -1;
            VelocityTracker velocityTracker = this.f1211j0;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1211j0 = null;
            }
            if (this.R.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            w(0);
        } else {
            int y11 = (int) motionEvent.getY();
            int x9 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y11 >= childAt.getTop() - scrollY && y11 < childAt.getBottom() - scrollY && x9 >= childAt.getLeft() && x9 < childAt.getRight()) {
                    this.f1206e0 = y11;
                    this.p0 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker2 = this.f1211j0;
                    if (velocityTracker2 == null) {
                        this.f1211j0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.f1211j0.addMovement(motionEvent);
                    this.R.computeScrollOffset();
                    if (!v(motionEvent) && this.R.isFinished()) {
                        z10 = false;
                    }
                    this.f1210i0 = z10;
                    this.f1223w0.g(2, 0);
                }
            }
            if (!v(motionEvent) && this.R.isFinished()) {
                z10 = false;
            }
            this.f1210i0 = z10;
            VelocityTracker velocityTracker3 = this.f1211j0;
            if (velocityTracker3 != null) {
                velocityTracker3.recycle();
                this.f1211j0 = null;
            }
        }
        return this.f1210i0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i2, i10, i11, i12);
        int i14 = 0;
        this.f1207f0 = false;
        View view = this.f1209h0;
        if (view != null && l(view, this)) {
            View view2 = this.f1209h0;
            Rect rect = this.L;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        }
        this.f1209h0 = null;
        if (!this.f1208g0) {
            if (this.f1221u0 != null) {
                scrollTo(getScrollX(), this.f1221u0.A);
                this.f1221u0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i13 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i13 = 0;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i13 && scrollY >= 0) {
                i14 = paddingTop + scrollY > i13 ? i13 - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1208g0 = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i10) {
        super.onMeasure(i2, i10);
        if (this.f1212k0 && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f8, float f10, boolean z10) {
        if (!z10) {
            dispatchNestedFling(0.0f, f10, true);
            j((int) f10);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f8, float f10) {
        return this.f1223w0.b(f8, f10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i10, int[] iArr) {
        this.f1223w0.c(i2, i10, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i10, int i11, int i12) {
        n(i12, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i10, boolean z10, boolean z11) {
        super.scrollTo(i2, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        View findNextFocusFromRect;
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i2);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        }
        if (findNextFocusFromRect == null || !m(findNextFocusFromRect, 0, getHeight())) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i2, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        this.f1221u0 = gVar;
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, f6.g] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A = getScrollY();
        return baseSavedState;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i10, int i11, int i12) {
        super.onScrollChanged(i2, i10, i11, i12);
        f fVar = this.f1225y0;
        if (fVar != null) {
            fVar.getClass();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i10, int i11, int i12) {
        super.onSizeChanged(i2, i10, i11, i12);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && m(findFocus, 0, i12)) {
            Rect rect = this.L;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                if (this.f1213l0) {
                    u(0, false, h2);
                } else {
                    scrollBy(0, h2);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i2, int i10, int i11, int i12) {
        int i13;
        boolean z10;
        int i14;
        boolean z11;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i15 = i11 + i2;
        if (i10 > 0 || i10 < 0) {
            i13 = 0;
            z10 = true;
        } else {
            i13 = i10;
            z10 = false;
        }
        if (i15 > i12) {
            i14 = i12;
        } else if (i15 < 0) {
            i14 = 0;
        } else {
            i14 = i15;
            z11 = false;
            if (z11 && !this.f1223w0.f(1)) {
                this.R.springBack(i13, i14, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i13, i14);
            if (!z10 || z11) {
                return true;
            }
            return false;
        }
        z11 = true;
        if (z11) {
            this.R.springBack(i13, i14, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i13, i14);
        if (!z10) {
        }
        return true;
    }

    public final void q(int i2) {
        boolean z10;
        if (i2 == 130) {
            z10 = true;
        } else {
            z10 = false;
        }
        int height = getHeight();
        Rect rect = this.L;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i10 = rect.top;
        int i11 = height + i10;
        rect.bottom = i11;
        r(i2, i10, i11);
    }

    public final boolean r(int i2, int i10, int i11) {
        boolean z10;
        View view;
        int i12;
        boolean z11;
        boolean z12;
        boolean z13;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        if (i2 == 33) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view2 = null;
        boolean z14 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view3 = focusables.get(i14);
            int top = view3.getTop();
            int bottom = view3.getBottom();
            if (i10 < bottom && top < i11) {
                if (i10 < top && bottom < i11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (view2 == null) {
                    view2 = view3;
                    z14 = z12;
                } else {
                    if ((z10 && top < view2.getTop()) || (!z10 && bottom > view2.getBottom())) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z14) {
                        if (z12) {
                            if (!z13) {
                            }
                            view2 = view3;
                        }
                    } else if (z12) {
                        view2 = view3;
                        z14 = true;
                    } else {
                        if (!z13) {
                        }
                        view2 = view3;
                    }
                }
            }
        }
        if (view2 == null) {
            view = this;
        } else {
            view = view2;
        }
        if (i10 >= scrollY && i11 <= i13) {
            z11 = false;
        } else {
            if (z10) {
                i12 = i10 - scrollY;
            } else {
                i12 = i11 - i13;
            }
            s(i12, -1, null, 0, 1, true);
            z11 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i2);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f1207f0) {
            Rect rect = this.L;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h2 = h(rect);
            if (h2 != 0) {
                scrollBy(0, h2);
            }
        } else {
            this.f1209h0 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        boolean z11;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h2 = h(rect);
        if (h2 != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                scrollBy(0, h2);
                return z11;
            }
            u(0, false, h2);
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f1211j0) != null) {
            velocityTracker.recycle();
            this.f1211j0 = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1207f0 = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(int r21, int r22, android.view.MotionEvent r23, int r24, int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.s(int, int, android.view.MotionEvent, int, int, boolean):int");
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i2 >= 0) {
                if (width + i2 > width2) {
                    i2 = width2 - width;
                }
            } else {
                i2 = 0;
            }
            if (height < height2 && i10 >= 0) {
                if (height + i10 > height2) {
                    i10 = height2 - height;
                }
            } else {
                i10 = 0;
            }
            if (i2 != getScrollX() || i10 != getScrollY()) {
                super.scrollTo(i2, i10);
            }
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f1212k0) {
            this.f1212k0 = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        r rVar = this.f1223w0;
        if (rVar.f512d) {
            ViewGroup viewGroup = rVar.f511c;
            WeakHashMap weakHashMap = x0.f533a;
            p0.m(viewGroup);
        }
        rVar.f512d = z10;
    }

    public void setOnScrollChangeListener(f fVar) {
        this.f1225y0 = fVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f1213l0 = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return this.f1223w0.g(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        w(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float z10 = a.z(edgeEffect) * getHeight();
        float f8 = this.A * 0.015f;
        double log = Math.log((Math.abs(-i2) * 0.35f) / f8);
        double d4 = A0;
        if (((float) (Math.exp((d4 / (d4 - 1.0d)) * log) * f8)) < z10) {
            return true;
        }
        return false;
    }

    public final void u(int i2, boolean z10, int i10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.B > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            int scrollX = getScrollX();
            OverScroller overScroller = this.R;
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i10 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
            if (z10) {
                this.f1223w0.g(2, 1);
            } else {
                w(1);
            }
            this.f1220t0 = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.R.isFinished()) {
                this.R.abortAnimation();
                w(1);
            }
            scrollBy(i2, i10);
        }
        this.B = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean v(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.f1203b0;
        if (a.z(edgeEffect) != 0.0f) {
            a.R(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.f1204c0;
        if (a.z(edgeEffect2) != 0.0f) {
            a.R(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    public final void w(int i2) {
        this.f1223w0.h(i2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
        } else {
            j.p("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            j.p("ScrollView can host only one direct child");
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
        } else {
            j.p("ScrollView can host only one direct child");
        }
    }
}
