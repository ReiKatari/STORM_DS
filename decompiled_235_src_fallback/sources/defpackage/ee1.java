package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ee1  reason: default package */
/* loaded from: classes.dex */
public final class ee1 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.ArrayList B;
    public final /* synthetic */ defpackage.ke1 L;

    public /* synthetic */ ee1(defpackage.ke1 r1, java.util.ArrayList r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.L = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r17 = this;
            r0 = r17
            int r1 = r0.A
            r2 = 0
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            java.util.ArrayList r5 = r0.B
            switch(r1) {
                case 0: goto Le2;
                case 1: goto L4b;
                default: goto Ld;
            }
        Ld:
            int r1 = r5.size()
        L11:
            ke1 r2 = r0.L
            if (r4 >= r1) goto L42
            java.lang.Object r6 = r5.get(r4)
            int r4 = r4 + 1
            wg5 r6 = (defpackage.wg5) r6
            r2.getClass()
            android.view.View r7 = r6.a
            android.view.ViewPropertyAnimator r8 = r7.animate()
            java.util.ArrayList r9 = r2.o
            r9.add(r6)
            android.view.ViewPropertyAnimator r9 = r8.alpha(r3)
            long r10 = r2.c
            android.view.ViewPropertyAnimator r9 = r9.setDuration(r10)
            fe1 r10 = new fe1
            r10.<init>(r2, r6, r7, r8)
            android.view.ViewPropertyAnimator r2 = r9.setListener(r10)
            r2.start()
            goto L11
        L42:
            r5.clear()
            java.util.ArrayList r0 = r2.l
            r0.remove(r5)
            return
        L4b:
            int r1 = r5.size()
        L4f:
            ke1 r7 = r0.L
            if (r4 >= r1) goto Ld9
            java.lang.Object r6 = r5.get(r4)
            int r4 = r4 + 1
            r8 = r6
            ie1 r8 = (defpackage.ie1) r8
            java.util.ArrayList r12 = r7.r
            long r13 = r7.f
            wg5 r6 = r8.a
            r9 = 0
            if (r6 != 0) goto L67
            r10 = r9
            goto L6a
        L67:
            android.view.View r6 = r6.a
            r10 = r6
        L6a:
            wg5 r6 = r8.b
            if (r6 == 0) goto L70
            android.view.View r9 = r6.a
        L70:
            r15 = r9
            if (r10 == 0) goto La8
            android.view.ViewPropertyAnimator r6 = r10.animate()
            android.view.ViewPropertyAnimator r9 = r6.setDuration(r13)
            wg5 r6 = r8.a
            r12.add(r6)
            int r6 = r8.e
            int r11 = r8.c
            int r6 = r6 - r11
            float r6 = (float) r6
            r9.translationX(r6)
            int r6 = r8.f
            int r11 = r8.d
            int r6 = r6 - r11
            float r6 = (float) r6
            r9.translationY(r6)
            android.view.ViewPropertyAnimator r6 = r9.alpha(r2)
            r11 = r6
            he1 r6 = new he1
            r16 = r11
            r11 = 0
            r3 = r16
            r6.<init>(r7, r8, r9, r10, r11)
            android.view.ViewPropertyAnimator r3 = r3.setListener(r6)
            r3.start()
        La8:
            if (r15 == 0) goto Ld4
            android.view.ViewPropertyAnimator r9 = r15.animate()
            wg5 r3 = r8.b
            r12.add(r3)
            android.view.ViewPropertyAnimator r3 = r9.translationX(r2)
            android.view.ViewPropertyAnimator r3 = r3.translationY(r2)
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r13)
            r12 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r3 = r3.alpha(r12)
            he1 r6 = new he1
            r11 = 1
            r10 = r15
            r6.<init>(r7, r8, r9, r10, r11)
            android.view.ViewPropertyAnimator r3 = r3.setListener(r6)
            r3.start()
            goto Ld6
        Ld4:
            r12 = 1065353216(0x3f800000, float:1.0)
        Ld6:
            r3 = r12
            goto L4f
        Ld9:
            r5.clear()
            java.util.ArrayList r0 = r7.n
            r0.remove(r5)
            return
        Le2:
            int r1 = r5.size()
        Le6:
            ke1 r7 = r0.L
            if (r4 >= r1) goto L135
            java.lang.Object r3 = r5.get(r4)
            int r4 = r4 + 1
            je1 r3 = (defpackage.je1) r3
            wg5 r8 = r3.a
            int r6 = r3.b
            int r9 = r3.c
            int r10 = r3.d
            int r3 = r3.e
            r7.getClass()
            r11 = r10
            android.view.View r10 = r8.a
            int r6 = r11 - r6
            int r11 = r3 - r9
            if (r6 == 0) goto L10f
            android.view.ViewPropertyAnimator r3 = r10.animate()
            r3.translationX(r2)
        L10f:
            if (r11 == 0) goto L118
            android.view.ViewPropertyAnimator r3 = r10.animate()
            r3.translationY(r2)
        L118:
            android.view.ViewPropertyAnimator r12 = r10.animate()
            java.util.ArrayList r3 = r7.p
            r3.add(r8)
            long r13 = r7.e
            android.view.ViewPropertyAnimator r3 = r12.setDuration(r13)
            r9 = r6
            ge1 r6 = new ge1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            android.view.ViewPropertyAnimator r3 = r3.setListener(r6)
            r3.start()
            goto Le6
        L135:
            r5.clear()
            java.util.ArrayList r0 = r7.m
            r0.remove(r5)
            return
    }
}
