package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hk2  reason: default package */
/* loaded from: classes.dex */
public final class hk2 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ik2 B;

    public /* synthetic */ hk2(defpackage.ik2 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.A
            r1 = 1
            ik2 r11 = r11.B
            switch(r0) {
                case 0: goto L3e;
                default: goto L8;
            }
        L8:
            r11.a()
            android.view.View r0 = r11.R
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto L3d
            boolean r2 = r0.isLongClickable()
            if (r2 == 0) goto L1a
            goto L3d
        L1a:
            boolean r2 = r11.c()
            if (r2 != 0) goto L21
            goto L3d
        L21:
            android.view.ViewParent r2 = r0.getParent()
            r2.requestDisallowInterceptTouchEvent(r1)
            long r3 = android.os.SystemClock.uptimeMillis()
            r9 = 0
            r10 = 0
            r7 = 3
            r8 = 0
            r5 = r3
            android.view.MotionEvent r2 = android.view.MotionEvent.obtain(r3, r5, r7, r8, r9, r10)
            r0.onTouchEvent(r2)
            r2.recycle()
            r11.Z = r1
        L3d:
            return
        L3e:
            android.view.View r11 = r11.R
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L49
            r11.requestDisallowInterceptTouchEvent(r1)
        L49:
            return
    }
}
