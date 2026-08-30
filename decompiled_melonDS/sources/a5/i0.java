package a5;

import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 extends d.m {
    public mc.a X;
    public f0 Y;
    public final View Z;

    /* renamed from: b0  reason: collision with root package name */
    public final e0 f401b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f402c0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i0(mc.a r5, a5.f0 r6, android.view.View r7, x4.m r8, x4.c r9, java.util.UUID r10) {
        /*
            r4 = this;
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            android.content.Context r1 = r7.getContext()
            boolean r2 = r6.f394e
            if (r2 == 0) goto Le
            r2 = 2131951922(0x7f130132, float:1.9540272E38)
            goto L11
        Le:
            r2 = 2131951924(0x7f130134, float:1.9540276E38)
        L11:
            r0.<init>(r1, r2)
            r1 = 0
            r4.<init>(r0, r1)
            r4.X = r5
            r4.Y = r6
            r4.Z = r7
            r5 = 8
            float r5 = (float) r5
            android.view.Window r6 = r4.getWindow()
            if (r6 == 0) goto Lf1
            r0 = 1
            r6.requestFeature(r0)
            r0 = 17170445(0x106000d, float:2.461195E-38)
            r6.setBackgroundDrawableResource(r0)
            a5.f0 r0 = r4.Y
            boolean r0 = r0.f394e
            q8.r.S(r6, r0)
            r0 = 17
            r6.setGravity(r0)
            a5.f0 r0 = r4.Y
            boolean r0 = r0.f394e
            if (r0 != 0) goto L67
            r0 = 65792(0x10100, float:9.2194E-41)
            r6.addFlags(r0)
            android.view.WindowManager$LayoutParams r0 = r6.getAttributes()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L58
            a5.w r3 = a5.w.f436a
            r3.a(r0)
        L58:
            r3 = 30
            if (r2 < r3) goto L64
            a5.x r2 = a5.x.f437a
            r2.b(r0, r1)
            r2.c(r0, r1)
        L64:
            r6.setAttributes(r0)
        L67:
            a5.e0 r0 = new a5.e0
            android.content.Context r2 = r4.getContext()
            r0.<init>(r2, r6)
            a5.f0 r2 = r4.Y
            java.lang.String r2 = r2.f395f
            r4.setTitle(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Dialog:"
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            r2 = 2131361954(0x7f0a00a2, float:1.8343675E38)
            r0.setTag(r2, r10)
            r0.setClipChildren(r1)
            float r5 = r9.v(r5)
            r0.setElevation(r5)
            a5.g0 r5 = new a5.g0
            r9 = 0
            r5.<init>(r9)
            r0.setOutlineProvider(r5)
            r4.f401b0 = r0
            android.view.View r5 = r6.getDecorView()
            boolean r6 = r5 instanceof android.view.ViewGroup
            if (r6 == 0) goto Lab
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto Lac
        Lab:
            r5 = 0
        Lac:
            if (r5 == 0) goto Lb1
            f(r5)
        Lb1:
            r4.setContentView(r0)
            androidx.lifecycle.x r5 = androidx.lifecycle.s0.d(r7)
            r6 = 2131362452(0x7f0a0294, float:1.8344685E38)
            r0.setTag(r6, r5)
            androidx.lifecycle.e1 r5 = androidx.lifecycle.s0.e(r7)
            r6 = 2131362456(0x7f0a0298, float:1.8344693E38)
            r0.setTag(r6, r5)
            q7.f r5 = p7.o.j(r7)
            r6 = 2131362455(0x7f0a0297, float:1.8344691E38)
            r0.setTag(r6, r5)
            mc.a r5 = r4.X
            a5.f0 r6 = r4.Y
            r4.g(r5, r6, r8)
            d.a0 r5 = r4.a()
            a5.b r6 = new a5.b
            r7 = 1
            r6.<init>(r4, r7)
            r5.getClass()
            a7.n r7 = new a7.n
            r8 = 2
            r9 = 0
            r7.<init>(r6, r9, r8)
            r5.a(r4, r7)
            return
        Lf1:
            java.lang.String r5 = "Dialog has no window"
            a0.j.p(r5)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.i0.<init>(mc.a, a5.f0, android.view.View, x4.m, x4.c, java.util.UUID):void");
    }

    public static final void f(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof e0)) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
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

    public final void g(mc.a aVar, f0 f0Var, x4.m mVar) {
        int i2;
        int i10;
        boolean z10;
        int i11;
        this.X = aVar;
        this.Y = f0Var;
        s0 s0Var = f0Var.f392c;
        boolean b10 = u.b(this.Z);
        int i12 = t0.f432a[s0Var.ordinal()];
        int i13 = 0;
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    m9.o.o();
                    return;
                }
            } else {
                b10 = true;
            }
        } else {
            b10 = false;
        }
        Window window = getWindow();
        window.getClass();
        if (b10) {
            i2 = 8192;
        } else {
            i2 = -8193;
        }
        window.setFlags(i2, 8192);
        int i14 = h0.f397a[mVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                i10 = 1;
            } else {
                m9.o.o();
                return;
            }
        } else {
            i10 = 0;
        }
        e0 e0Var = this.f401b0;
        e0Var.setLayoutDirection(i10);
        boolean z11 = f0Var.f394e;
        boolean z12 = f0Var.f393d;
        Window window2 = e0Var.f384f0;
        if (e0Var.f388j0 && z12 == e0Var.f386h0 && z11 == e0Var.f387i0) {
            z10 = false;
        } else {
            z10 = true;
        }
        e0Var.f386h0 = z12;
        e0Var.f387i0 = z11;
        if (z10) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (z12) {
                i11 = -2;
            } else {
                i11 = -1;
            }
            if (i11 != attributes.width || !e0Var.f388j0) {
                window2.setLayout(i11, -2);
                e0Var.f388j0 = true;
            }
        }
        setCanceledOnTouchOutside(f0Var.f391b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z11) {
                if (Build.VERSION.SDK_INT < 31) {
                    i13 = 16;
                } else {
                    i13 = 48;
                }
            }
            window3.setSoftInputMode(i13);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (this.Y.f390a && keyEvent.isTracking() && !keyEvent.isCanceled() && i2 == 111) {
            this.X.b();
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
        if (r5 <= r1) goto L33;
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
            a5.f0 r1 = r9.Y
            boolean r1 = r1.f391b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L8b
            a5.e0 r1 = r9.f401b0
            r1.getClass()
            float r5 = r10.getX()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            float r5 = r10.getY()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L39
            goto L6e
        L39:
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
            int r5 = pc.a.M(r5)
            if (r7 > r5) goto L6e
            if (r5 > r6) goto L6e
            float r5 = r10.getY()
            int r5 = pc.a.M(r5)
            if (r8 > r5) goto L6e
            if (r5 > r1) goto L6e
            goto L8b
        L6e:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L88
            if (r10 == r4) goto L7c
            if (r10 == r2) goto L79
            goto L95
        L79:
            r9.f402c0 = r3
            return r0
        L7c:
            boolean r10 = r9.f402c0
            if (r10 == 0) goto L95
            mc.a r10 = r9.X
            r10.b()
            r9.f402c0 = r3
            return r4
        L88:
            r9.f402c0 = r4
            return r4
        L8b:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L96
            if (r10 == r4) goto L96
            if (r10 == r2) goto L96
        L95:
            return r0
        L96:
            r9.f402c0 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.i0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
