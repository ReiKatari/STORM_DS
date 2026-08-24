package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ik2  reason: default package */
/* loaded from: classes.dex */
public abstract class ik2 implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float A;
    public final int B;
    public final int L;
    public final View R;
    public hk2 X;
    public hk2 Y;
    public boolean Z;
    public int d0;
    public final int[] e0 = new int[2];

    public ik2(View view) {
        this.R = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.A = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.B = tapTimeout;
        this.L = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        hk2 hk2Var = this.Y;
        View view = this.R;
        if (hk2Var != null) {
            view.removeCallbacks(hk2Var);
        }
        hk2 hk2Var2 = this.X;
        if (hk2Var2 != null) {
            view.removeCallbacks(hk2Var2);
        }
    }

    public abstract lh6 b();

    public abstract boolean c();

    public boolean d() {
        lh6 b = b();
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
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        mp1 j;
        boolean z2;
        boolean z3 = this.Z;
        View view2 = this.R;
        if (z3) {
            lh6 b = b();
            if (b != null && b.a() && (j = b.j()) != null && j.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.e0;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                j.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean b2 = j.b(obtainNoHistory, this.d0);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1 && actionMasked != 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (b2) {
                }
            }
            if (d()) {
                z = false;
            }
            z = true;
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.d0);
                            if (findPointerIndex >= 0) {
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f = this.A;
                                float f2 = -f;
                                if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                                    a();
                                    view2.getParent().requestDisallowInterceptTouchEvent(true);
                                    if (c()) {
                                        z = true;
                                        if (z) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, RecyclerView.B1, RecyclerView.B1, 0);
                                            view2.onTouchEvent(obtain);
                                            obtain.recycle();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.d0 = motionEvent.getPointerId(0);
                    if (this.X == null) {
                        this.X = new hk2(this, 0);
                    }
                    view2.postDelayed(this.X, this.B);
                    if (this.Y == null) {
                        this.Y = new hk2(this, 1);
                    }
                    view2.postDelayed(this.Y, this.L);
                }
            }
            z = false;
            if (z) {
            }
        }
        this.Z = z;
        if (!z && !z3) {
            return false;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.Z = false;
        this.d0 = -1;
        hk2 hk2Var = this.X;
        if (hk2Var != null) {
            this.R.removeCallbacks(hk2Var);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
