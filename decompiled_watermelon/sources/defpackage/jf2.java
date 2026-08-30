package defpackage;

import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jf2  reason: default package */
/* loaded from: classes.dex */
public abstract class jf2 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float A;
    public final int B;
    public final int L;
    public final View R;
    public if2 X;
    public if2 Y;
    public boolean Z;
    public int c0;
    public final int[] d0 = new int[2];

    public jf2(View view) {
        this.R = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.A = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.B = tapTimeout;
        this.L = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        if2 if2Var = this.Y;
        View view = this.R;
        if (if2Var != null) {
            view.removeCallbacks(if2Var);
        }
        if2 if2Var2 = this.X;
        if (if2Var2 != null) {
            view.removeCallbacks(if2Var2);
        }
    }

    public abstract y56 b();

    public abstract boolean c();

    public boolean d() {
        y56 b = b();
        if (b != null && b.a()) {
            b.dismiss();
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
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf2.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.Z = false;
        this.c0 = -1;
        if2 if2Var = this.X;
        if (if2Var != null) {
            this.R.removeCallbacks(if2Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
