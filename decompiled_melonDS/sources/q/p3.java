package q;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p3 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: e0  reason: collision with root package name */
    public static p3 f11987e0;

    /* renamed from: f0  reason: collision with root package name */
    public static p3 f11988f0;
    public final View A;
    public final CharSequence B;
    public final int L;
    public final o3 R = new Runnable(this) { // from class: q.o3
        public final /* synthetic */ p3 B;

        {
            this.B = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            switch (r2) {
                case 0:
                    this.B.c(false);
                    return;
                default:
                    this.B.a();
                    return;
            }
        }
    };
    public final o3 X = new Runnable(this) { // from class: q.o3
        public final /* synthetic */ p3 B;

        {
            this.B = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            switch (r2) {
                case 0:
                    this.B.c(false);
                    return;
                default:
                    this.B.a();
                    return;
            }
        }
    };
    public int Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public q3 f11989b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f11990c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f11991d0;

    /* JADX WARN: Type inference failed for: r0v0, types: [q.o3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [q.o3] */
    public p3(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.A = view;
        this.B = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = a6.y0.f540a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = a6.k.o(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.L = scaledTouchSlop;
        this.f11991d0 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(p3 p3Var) {
        p3 p3Var2 = f11987e0;
        if (p3Var2 != null) {
            p3Var2.A.removeCallbacks(p3Var2.R);
        }
        f11987e0 = p3Var;
        if (p3Var != null) {
            p3Var.A.postDelayed(p3Var.R, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        p3 p3Var = f11988f0;
        View view = this.A;
        if (p3Var == this) {
            f11988f0 = null;
            q3 q3Var = this.f11989b0;
            if (q3Var != null) {
                View view2 = (View) q3Var.f11995b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) q3Var.f11994a).getSystemService("window")).removeView(view2);
                }
                this.f11989b0 = null;
                this.f11991d0 = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f11987e0 == this) {
            b(null);
        }
        view.removeCallbacks(this.X);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, q.q3] */
    public final void c(boolean z10) {
        int height;
        int i2;
        int i10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        int i14;
        long longPressTimeout;
        long j2;
        long j10;
        View view = this.A;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        p3 p3Var = f11988f0;
        if (p3Var != null) {
            p3Var.a();
        }
        f11988f0 = this;
        this.f11990c0 = z10;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.f11997d = layoutParams;
        obj.f11998e = new Rect();
        obj.f11999f = new int[2];
        obj.f12000g = new int[2];
        obj.f11994a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        obj.f11995b = inflate;
        obj.f11996c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(q3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131951620;
        layoutParams.flags = 24;
        View view2 = (View) obj.f11995b;
        Context context2 = (Context) obj.f11994a;
        this.f11989b0 = obj;
        int i15 = this.Y;
        int i16 = this.Z;
        boolean z12 = this.f11990c0;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.f11997d;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.f11996c).setText(this.B);
        int[] iArr = (int[]) obj.f12000g;
        int[] iArr2 = (int[]) obj.f11999f;
        Rect rect = (Rect) obj.f11998e;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i15 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i16 + dimensionPixelOffset2;
            i2 = i16 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i2 = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z12) {
            i10 = R.dimen.tooltip_y_offset_touch;
        } else {
            i10 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i10);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        int i17 = i15;
        if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
            Context context3 = view.getContext();
            while (true) {
                if (!(context3 instanceof ContextWrapper)) {
                    break;
                } else if (context3 instanceof Activity) {
                    rootView = ((Activity) context3).getWindow().getDecorView();
                    break;
                } else {
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            i13 = 1;
        } else {
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context2.getResources();
                i13 = 1;
                i11 = i2;
                z11 = z12;
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i14 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i14 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i12 = 0;
                rect.set(0, i14, displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                i11 = i2;
                z11 = z12;
                i12 = 0;
                i13 = 1;
            }
            rootView.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int i18 = iArr2[i12] - iArr[i12];
            iArr2[i12] = i18;
            iArr2[i13] = iArr2[i13] - iArr[i13];
            layoutParams2.x = (i18 + i17) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, i12);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i19 = iArr2[i13];
            int i20 = ((i19 + i11) - dimensionPixelOffset3) - measuredHeight;
            int i21 = i19 + height + dimensionPixelOffset3;
            if (z11) {
                if (i20 >= 0) {
                    layoutParams2.y = i20;
                } else {
                    layoutParams2.y = i21;
                }
            } else if (measuredHeight + i21 <= rect.height()) {
                layoutParams2.y = i21;
            } else {
                layoutParams2.y = i20;
            }
        }
        ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.f11990c0) {
            j10 = 2500;
        } else {
            WeakHashMap weakHashMap = a6.x0.f533a;
            if ((view.getWindowSystemUiVisibility() & 1) == i13) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j2 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j2 = 15000;
            }
            j10 = j2 - longPressTimeout;
        }
        o3 o3Var = this.X;
        view.removeCallbacks(o3Var);
        view.postDelayed(o3Var, j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (java.lang.Math.abs(r5 - r3.Z) <= r2) goto L5;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            q.q3 r4 = r3.f11989b0
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f11990c0
            if (r4 == 0) goto La
            goto L6f
        La:
            android.view.View r4 = r3.A
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            goto L6f
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f11991d0 = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            q.q3 r4 = r3.f11989b0
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f11991d0
            if (r1 != 0) goto L66
            int r1 = r3.Y
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.L
            if (r1 > r2) goto L66
            int r1 = r3.Z
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.Y = r4
            r3.Z = r5
            r3.f11991d0 = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.p3.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.Y = view.getWidth() / 2;
        this.Z = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
