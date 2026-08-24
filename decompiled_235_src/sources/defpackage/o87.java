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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import com.stormds.emulator.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o87  reason: default package */
/* loaded from: classes.dex */
public final class o87 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static o87 g0;
    public static o87 h0;
    public final View A;
    public final CharSequence B;
    public final int L;
    public final n87 R = new Runnable(this) { // from class: n87
        public final /* synthetic */ o87 B;

        {
            this.B = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = r2;
            o87 o87Var = this.B;
            switch (i) {
                case 0:
                    o87Var.c(false);
                    return;
                default:
                    o87Var.a();
                    return;
            }
        }
    };
    public final n87 X = new Runnable(this) { // from class: n87
        public final /* synthetic */ o87 B;

        {
            this.B = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i = r2;
            o87 o87Var = this.B;
            switch (i) {
                case 0:
                    o87Var.c(false);
                    return;
                default:
                    o87Var.a();
                    return;
            }
        }
    };
    public int Y;
    public int Z;
    public p87 d0;
    public boolean e0;
    public boolean f0;

    /* JADX WARN: Type inference failed for: r0v0, types: [n87] */
    /* JADX WARN: Type inference failed for: r0v1, types: [n87] */
    public o87(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        this.A = view;
        this.B = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = go7.a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = pp.p(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.L = scaledTouchSlop;
        this.f0 = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(o87 o87Var) {
        o87 o87Var2 = g0;
        if (o87Var2 != null) {
            o87Var2.A.removeCallbacks(o87Var2.R);
        }
        g0 = o87Var;
        if (o87Var != null) {
            o87Var.A.postDelayed(o87Var.R, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        o87 o87Var = h0;
        View view = this.A;
        if (o87Var == this) {
            h0 = null;
            p87 p87Var = this.d0;
            if (p87Var != null) {
                View view2 = (View) p87Var.b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) p87Var.a).getSystemService("window")).removeView(view2);
                }
                this.d0 = null;
                this.f0 = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (g0 == this) {
            b(null);
        }
        view.removeCallbacks(this.X);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, p87] */
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
        o87 o87Var = h0;
        if (o87Var != null) {
            o87Var.a();
        }
        h0 = this;
        this.e0 = z;
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
        layoutParams.setTitle(p87.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2132017156;
        layoutParams.flags = 24;
        View view2 = (View) obj.b;
        Context context2 = (Context) obj.a;
        this.d0 = obj;
        int i7 = this.Y;
        int i8 = this.Z;
        boolean z3 = this.e0;
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
        if (this.e0) {
            j2 = 2500;
        } else {
            WeakHashMap weakHashMap = ao7.a;
            if ((view.getWindowSystemUiVisibility() & 1) == i5) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j = 15000;
            }
            j2 = j - longPressTimeout;
        }
        n87 n87Var = this.X;
        view.removeCallbacks(n87Var);
        view.postDelayed(n87Var, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (java.lang.Math.abs(r5 - r3.Z) <= r2) goto L5;
     */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.d0 == null || !this.e0) {
            View view2 = this.A;
            AccessibilityManager accessibilityManager = (AccessibilityManager) view2.getContext().getSystemService("accessibility");
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7) {
                    if (action == 10) {
                        this.f0 = true;
                        a();
                        return false;
                    }
                } else if (view2.isEnabled() && this.d0 == null) {
                    int x = (int) motionEvent.getX();
                    int y = (int) motionEvent.getY();
                    if (!this.f0) {
                        int abs = Math.abs(x - this.Y);
                        int i = this.L;
                        if (abs <= i) {
                        }
                    }
                    this.Y = x;
                    this.Z = y;
                    this.f0 = false;
                    b(this);
                }
            }
        }
        return false;
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
