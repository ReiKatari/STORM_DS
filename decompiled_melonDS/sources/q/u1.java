package q;

import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class u1 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float A;
    public final int B;
    public final int L;
    public final View R;
    public t1 X;
    public t1 Y;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f12025b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int[] f12026c0 = new int[2];

    public u1(View view) {
        this.R = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.A = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.B = tapTimeout;
        this.L = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        t1 t1Var = this.Y;
        View view = this.R;
        if (t1Var != null) {
            view.removeCallbacks(t1Var);
        }
        t1 t1Var2 = this.X;
        if (t1Var2 != null) {
            view.removeCallbacks(t1Var2);
        }
    }

    public abstract p.b0 b();

    public abstract boolean c();

    public boolean d() {
        p.b0 b10 = b();
        if (b10 != null && b10.b()) {
            b10.dismiss();
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
        if (r14 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r4 != 3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.u1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.Z = false;
        this.f12025b0 = -1;
        t1 t1Var = this.X;
        if (t1Var != null) {
            this.R.removeCallbacks(t1Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
