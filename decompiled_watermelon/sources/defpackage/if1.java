package defpackage;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: if1  reason: default package */
/* loaded from: classes.dex */
public final class if1 extends bt0 {
    public ki2 X;
    public ff1 Y;
    public final View Z;
    public final cf1 c0;
    public boolean d0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public if1(defpackage.ki2 r6, defpackage.ff1 r7, android.view.View r8, defpackage.sd3 r9, defpackage.od1 r10, java.util.UUID r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if1.<init>(ki2, ff1, android.view.View, sd3, od1, java.util.UUID):void");
    }

    public static final void f(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof cf1)) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    f(viewGroup2);
                }
            }
        }
    }

    public final void g(ki2 ki2Var, ff1 ff1Var, sd3 sd3Var) {
        int i;
        int i2;
        boolean z;
        int i3;
        this.X = ki2Var;
        this.Y = ff1Var;
        mx5 mx5Var = ff1Var.c;
        boolean b = oj.b(this.Z);
        int i4 = nx5.a[mx5Var.ordinal()];
        int i5 = 0;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    i.c();
                    return;
                }
            } else {
                b = true;
            }
        } else {
            b = false;
        }
        Window window = getWindow();
        window.getClass();
        if (b) {
            i = 8192;
        } else {
            i = -8193;
        }
        window.setFlags(i, 8192);
        int i6 = hf1.a[sd3Var.ordinal()];
        if (i6 != 1) {
            if (i6 == 2) {
                i2 = 1;
            } else {
                i.c();
                return;
            }
        } else {
            i2 = 0;
        }
        cf1 cf1Var = this.c0;
        cf1Var.setLayoutDirection(i2);
        boolean z2 = ff1Var.e;
        boolean z3 = ff1Var.d;
        Window window2 = cf1Var.h0;
        if (cf1Var.l0 && z3 == cf1Var.j0 && z2 == cf1Var.k0) {
            z = false;
        } else {
            z = true;
        }
        cf1Var.j0 = z3;
        cf1Var.k0 = z2;
        if (z) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (z3) {
                i3 = -2;
            } else {
                i3 = -1;
            }
            if (i3 != attributes.width || !cf1Var.l0) {
                window2.setLayout(i3, -2);
                cf1Var.l0 = true;
            }
        }
        setCanceledOnTouchOutside(ff1Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z2) {
                if (Build.VERSION.SDK_INT < 31) {
                    i5 = 16;
                } else {
                    i5 = 48;
                }
            }
            window3.setSoftInputMode(i5);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.Y.a && keyEvent.isTracking() && !keyEvent.isCanceled() && i == 111) {
            this.X.c();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
        if (r5 <= r1) goto L29;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            ff1 r1 = r9.Y
            boolean r1 = r1.b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L86
            cf1 r1 = r9.c0
            r1.getClass()
            float r5 = r10.getX()
            float r5 = java.lang.Math.abs(r5)
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            float r5 = r10.getY()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L34
            goto L69
        L34:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = defpackage.jv3.X(r5)
            if (r7 > r5) goto L69
            if (r5 > r6) goto L69
            float r5 = r10.getY()
            int r5 = defpackage.jv3.X(r5)
            if (r8 > r5) goto L69
            if (r5 > r1) goto L69
            goto L86
        L69:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L83
            if (r10 == r4) goto L77
            if (r10 == r2) goto L74
            goto L90
        L74:
            r9.d0 = r3
            return r0
        L77:
            boolean r10 = r9.d0
            if (r10 == 0) goto L90
            ki2 r10 = r9.X
            r10.c()
            r9.d0 = r3
            return r4
        L83:
            r9.d0 = r4
            return r4
        L86:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L91
            if (r10 == r4) goto L91
            if (r10 == r2) goto L91
        L90:
            return r0
        L91:
            r9.d0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
