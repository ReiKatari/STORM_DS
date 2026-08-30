package defpackage;

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
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bw6  reason: default package */
/* loaded from: classes.dex */
public final class bw6 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static bw6 f0;
    public static bw6 g0;
    public final View A;
    public final CharSequence B;
    public final int L;
    public final aw6 R = new Runnable(this) { // from class: aw6
        public final /* synthetic */ bw6 B;

        {
            this.B = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = r2;
            bw6 bw6Var = this.B;
            switch (i) {
                case 0:
                    bw6Var.c(false);
                    return;
                default:
                    bw6Var.a();
                    return;
            }
        }
    };
    public final aw6 X = new Runnable(this) { // from class: aw6
        public final /* synthetic */ bw6 B;

        {
            this.B = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = r2;
            bw6 bw6Var = this.B;
            switch (i) {
                case 0:
                    bw6Var.c(false);
                    return;
                default:
                    bw6Var.a();
                    return;
            }
        }
    };
    public int Y;
    public int Z;
    public cw6 c0;
    public boolean d0;
    public boolean e0;

    /* JADX WARN: Type inference failed for: r0v0, types: [aw6] */
    /* JADX WARN: Type inference failed for: r0v1, types: [aw6] */
    public bw6(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.A = view;
        this.B = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = ga7.a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = dp.p(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.L = scaledTouchSlop;
        this.e0 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(bw6 bw6Var) {
        bw6 bw6Var2 = f0;
        if (bw6Var2 != null) {
            bw6Var2.A.removeCallbacks(bw6Var2.R);
        }
        f0 = bw6Var;
        if (bw6Var != null) {
            bw6Var.A.postDelayed(bw6Var.R, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        bw6 bw6Var = g0;
        View view = this.A;
        if (bw6Var == this) {
            g0 = null;
            cw6 cw6Var = this.c0;
            if (cw6Var != null) {
                View view2 = (View) cw6Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) cw6Var.a).getSystemService("window")).removeView(view2);
                }
                this.c0 = null;
                this.e0 = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f0 == this) {
            b(null);
        }
        view.removeCallbacks(this.X);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [cw6, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int[], java.io.Serializable] */
    public final void c(boolean z) {
        int height;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        long longPressTimeout;
        long j;
        long j2;
        View view = this.A;
        if (!view.isAttachedToWindow()) {
            return;
        }
        b(null);
        bw6 bw6Var = g0;
        if (bw6Var != null) {
            bw6Var.a();
        }
        g0 = this;
        this.d0 = z;
        Context context = view.getContext();
        ?? obj = new Object();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        obj.d = layoutParams;
        obj.e = new Rect();
        obj.f = new int[2];
        obj.g = new int[2];
        obj.a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        obj.b = inflate;
        obj.c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(cw6.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132017156;
        layoutParams.flags = 24;
        View view2 = (View) obj.b;
        Context context2 = (Context) obj.a;
        this.c0 = obj;
        int i7 = this.Y;
        int i8 = this.Z;
        boolean z3 = this.d0;
        WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) obj.d;
        if (view2.getParent() != null && view2.getParent() != null) {
            ((WindowManager) context2.getSystemService("window")).removeView(view2);
        }
        ((TextView) obj.c).setText(this.B);
        int[] iArr = (int[]) obj.g;
        int[] iArr2 = (int[]) obj.f;
        Rect rect = (Rect) obj.e;
        layoutParams2.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i7 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i8 + dimensionPixelOffset2;
            i = i8 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i = 0;
        }
        layoutParams2.gravity = 49;
        Resources resources = context2.getResources();
        if (z3) {
            i2 = R.dimen.tooltip_y_offset_touch;
        } else {
            i2 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i2);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
        int i9 = i7;
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
            i5 = 1;
        } else {
            rootView.getWindowVisibleDisplayFrame(rect);
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = context2.getResources();
                i5 = 1;
                i3 = i;
                z2 = z3;
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i6 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i6 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                i4 = 0;
                rect.set(0, i6, displayMetrics.widthPixels, displayMetrics.heightPixels);
            } else {
                i3 = i;
                z2 = z3;
                i4 = 0;
                i5 = 1;
            }
            rootView.getLocationOnScreen(iArr);
            view.getLocationOnScreen(iArr2);
            int i10 = iArr2[i4] - iArr[i4];
            iArr2[i4] = i10;
            iArr2[i5] = iArr2[i5] - iArr[i5];
            layoutParams2.x = (i10 + i9) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, i4);
            view2.measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = view2.getMeasuredHeight();
            int i11 = iArr2[i5];
            int i12 = ((i11 + i3) - dimensionPixelOffset3) - measuredHeight;
            int i13 = i11 + height + dimensionPixelOffset3;
            if (z2) {
                if (i12 >= 0) {
                    layoutParams2.y = i12;
                } else {
                    layoutParams2.y = i13;
                }
            } else if (measuredHeight + i13 <= rect.height()) {
                layoutParams2.y = i13;
            } else {
                layoutParams2.y = i12;
            }
        }
        ((WindowManager) context2.getSystemService("window")).addView(view2, layoutParams2);
        view.addOnAttachStateChangeListener(this);
        if (this.d0) {
            j2 = 2500;
        } else {
            WeakHashMap weakHashMap = aa7.a;
            if ((view.getWindowSystemUiVisibility() & 1) == i5) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        aw6 aw6Var = this.X;
        view.removeCallbacks(aw6Var);
        view.postDelayed(aw6Var, j2);
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
            cw6 r4 = r3.c0
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.d0
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
            r3.e0 = r4
            r3.a()
            return r0
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            cw6 r4 = r3.c0
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.e0
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
            r3.e0 = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw6.onHover(android.view.View, android.view.MotionEvent):boolean");
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
