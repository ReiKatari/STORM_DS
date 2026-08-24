package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: el0  reason: default package */
/* loaded from: classes.dex */
public final class el0 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;

    public el0(android.view.View r2, defpackage.au7 r3, defpackage.rr6 r4, android.animation.ValueAnimator r5) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            r1.X = r5
            return
    }

    public el0(defpackage.os0 r2, defpackage.fl0 r3, defpackage.o44 r4, defpackage.i44 r5) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.X = r2
            r1.B = r3
            r1.L = r4
            r1.R = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            int r0 = r4.A
            java.lang.Object r1 = r4.X
            java.lang.Object r2 = r4.R
            java.lang.Object r3 = r4.L
            java.lang.Object r4 = r4.B
            switch(r0) {
                case 0: goto L1c;
                default: goto Ld;
            }
        Ld:
            android.view.View r4 = (android.view.View) r4
            au7 r3 = (defpackage.au7) r3
            rr6 r2 = (defpackage.rr6) r2
            defpackage.wt7.i(r4, r3, r2)
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            r1.start()
            return
        L1c:
            os0 r1 = (defpackage.os0) r1
            java.lang.Object r0 = r1.B
            gl0 r0 = (defpackage.gl0) r0
            o44 r3 = (defpackage.o44) r3
            fl0 r4 = (defpackage.fl0) r4
            if (r4 == 0) goto L33
            r1 = 1
            r0.v0 = r1
            i44 r4 = r4.b
            r1 = 0
            r4.c(r1)
            r0.v0 = r1
        L33:
            boolean r4 = r3.isEnabled()
            if (r4 == 0) goto L46
            boolean r4 = r3.hasSubMenu()
            if (r4 == 0) goto L46
            i44 r2 = (defpackage.i44) r2
            r4 = 4
            r0 = 0
            r2.q(r3, r0, r4)
        L46:
            return
    }
}
