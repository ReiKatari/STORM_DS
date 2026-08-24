package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vg5  reason: default package */
/* loaded from: classes.dex */
public final class vg5 implements java.lang.Runnable {
    public int A;
    public int B;
    public android.widget.OverScroller L;
    public android.view.animation.Interpolator R;
    public boolean X;
    public boolean Y;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView Z;

    public vg5(androidx.recyclerview.widget.RecyclerView r3) {
            r2 = this;
            r2.<init>()
            r2.Z = r3
            tf5 r0 = androidx.recyclerview.widget.RecyclerView.F1
            r2.R = r0
            r1 = 0
            r2.X = r1
            r2.Y = r1
            android.widget.OverScroller r1 = new android.widget.OverScroller
            android.content.Context r3 = r3.getContext()
            r1.<init>(r3, r0)
            r2.L = r1
            return
    }

    public final void a(int r13, int r14) {
            r12 = this;
            r0 = 2
            androidx.recyclerview.widget.RecyclerView r1 = r12.Z
            r1.setScrollState(r0)
            r0 = 0
            r12.B = r0
            r12.A = r0
            android.view.animation.Interpolator r0 = r12.R
            tf5 r2 = androidx.recyclerview.widget.RecyclerView.F1
            if (r0 == r2) goto L1e
            r12.R = r2
            android.widget.OverScroller r0 = new android.widget.OverScroller
            android.content.Context r1 = r1.getContext()
            r0.<init>(r1, r2)
            r12.L = r0
        L1e:
            android.widget.OverScroller r3 = r12.L
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r4 = 0
            r5 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r6 = r13
            r7 = r14
            r3.fling(r4, r5, r6, r7, r8, r9, r10, r11)
            r12.b()
            return
    }

    public final void b() {
            r2 = this;
            boolean r0 = r2.X
            if (r0 == 0) goto L8
            r0 = 1
            r2.Y = r0
            return
        L8:
            androidx.recyclerview.widget.RecyclerView r0 = r2.Z
            r0.removeCallbacks(r2)
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r0.postOnAnimation(r2)
            return
    }

    public final void c(int r10, int r11, int r12, android.view.animation.Interpolator r13) {
            r9 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            androidx.recyclerview.widget.RecyclerView r2 = r9.Z
            if (r12 != r0) goto L33
            int r12 = java.lang.Math.abs(r10)
            int r0 = java.lang.Math.abs(r11)
            if (r12 <= r0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = r1
        L14:
            if (r3 == 0) goto L1b
            int r4 = r2.getWidth()
            goto L1f
        L1b:
            int r4 = r2.getHeight()
        L1f:
            if (r3 == 0) goto L22
            goto L23
        L22:
            r12 = r0
        L23:
            float r12 = (float) r12
            float r0 = (float) r4
            float r12 = r12 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 + r0
            r0 = 1133903872(0x43960000, float:300.0)
            float r12 = r12 * r0
            int r12 = (int) r12
            r0 = 2000(0x7d0, float:2.803E-42)
            int r12 = java.lang.Math.min(r12, r0)
        L33:
            r8 = r12
            if (r13 != 0) goto L38
            tf5 r13 = androidx.recyclerview.widget.RecyclerView.F1
        L38:
            android.view.animation.Interpolator r12 = r9.R
            if (r12 == r13) goto L49
            r9.R = r13
            android.widget.OverScroller r12 = new android.widget.OverScroller
            android.content.Context r0 = r2.getContext()
            r12.<init>(r0, r13)
            r9.L = r12
        L49:
            r9.B = r1
            r9.A = r1
            r12 = 2
            r2.setScrollState(r12)
            android.widget.OverScroller r3 = r9.L
            r4 = 0
            r5 = 0
            r6 = r10
            r7 = r11
            r3.startScroll(r4, r5, r6, r7, r8)
            r9.b()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r14 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r14.Z
            int[] r8 = r0.p1
            gg5 r1 = r0.m0
            if (r1 != 0) goto L11
            r0.removeCallbacks(r14)
            android.widget.OverScroller r14 = r14.L
            r14.abortAnimation()
            return
        L11:
            r9 = 0
            r14.Y = r9
            r10 = 1
            r14.X = r10
            r0.p()
            android.widget.OverScroller r11 = r14.L
            boolean r1 = r11.computeScrollOffset()
            if (r1 == 0) goto L1b3
            int r1 = r11.getCurrX()
            int r2 = r11.getCurrY()
            int r3 = r14.A
            int r3 = r1 - r3
            int r4 = r14.B
            int r4 = r2 - r4
            r14.A = r1
            r14.B = r2
            android.widget.EdgeEffect r1 = r0.H0
            android.widget.EdgeEffect r2 = r0.J0
            int r5 = r0.getWidth()
            int r1 = androidx.recyclerview.widget.RecyclerView.o(r3, r1, r2, r5)
            android.widget.EdgeEffect r2 = r0.I0
            android.widget.EdgeEffect r3 = r0.K0
            int r5 = r0.getHeight()
            int r2 = androidx.recyclerview.widget.RecyclerView.o(r4, r2, r3, r5)
            int[] r4 = r0.p1
            r4[r9] = r9
            r4[r10] = r9
            r5 = 0
            r3 = 1
            boolean r3 = r0.v(r1, r2, r3, r4, r5)
            if (r3 == 0) goto L62
            r3 = r8[r9]
            int r1 = r1 - r3
            r3 = r8[r10]
            int r2 = r2 - r3
        L62:
            int r3 = r0.getOverScrollMode()
            r12 = 2
            if (r3 == r12) goto L6c
            r0.n(r1, r2)
        L6c:
            wf5 r3 = r0.l0
            if (r3 == 0) goto Lac
            r8[r9] = r9
            r8[r10] = r9
            r0.g0(r1, r2, r8)
            r3 = r8[r9]
            r4 = r8[r10]
            int r1 = r1 - r3
            int r2 = r2 - r4
            gg5 r5 = r0.m0
            iv3 r5 = r5.e
            if (r5 == 0) goto La5
            boolean r6 = r5.d
            if (r6 != 0) goto La5
            boolean r6 = r5.e
            if (r6 == 0) goto La5
            sg5 r6 = r0.d1
            int r6 = r6.b()
            if (r6 != 0) goto L97
            r5.i()
            goto La5
        L97:
            int r7 = r5.a
            if (r7 < r6) goto La2
            int r6 = r6 - r10
            r5.a = r6
            r5.g(r3, r4)
            goto La5
        La2:
            r5.g(r3, r4)
        La5:
            r13 = r3
            r3 = r1
            r1 = r13
            r13 = r4
            r4 = r2
            r2 = r13
            goto Lb0
        Lac:
            r3 = r1
            r4 = r2
            r1 = r9
            r2 = r1
        Lb0:
            java.util.ArrayList r5 = r0.o0
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto Lbb
            r0.invalidate()
        Lbb:
            int[] r7 = r0.p1
            r7[r9] = r9
            r7[r10] = r9
            r5 = 0
            r6 = 1
            r0.w(r1, r2, r3, r4, r5, r6, r7)
            r5 = r8[r9]
            int r3 = r3 - r5
            r5 = r8[r10]
            int r4 = r4 - r5
            if (r1 != 0) goto Ld0
            if (r2 == 0) goto Ld3
        Ld0:
            r0.x(r1, r2)
        Ld3:
            boolean r5 = androidx.recyclerview.widget.RecyclerView.d(r0)
            if (r5 != 0) goto Ldc
            r0.invalidate()
        Ldc:
            int r5 = r11.getCurrX()
            int r6 = r11.getFinalX()
            if (r5 != r6) goto Le8
            r5 = r10
            goto Le9
        Le8:
            r5 = r9
        Le9:
            int r6 = r11.getCurrY()
            int r7 = r11.getFinalY()
            if (r6 != r7) goto Lf5
            r6 = r10
            goto Lf6
        Lf5:
            r6 = r9
        Lf6:
            boolean r7 = r11.isFinished()
            if (r7 != 0) goto L107
            if (r5 != 0) goto L100
            if (r3 == 0) goto L105
        L100:
            if (r6 != 0) goto L107
            if (r4 == 0) goto L105
            goto L107
        L105:
            r5 = r9
            goto L108
        L107:
            r5 = r10
        L108:
            gg5 r6 = r0.m0
            iv3 r6 = r6.e
            if (r6 == 0) goto L114
            boolean r6 = r6.d
            if (r6 == 0) goto L114
            goto L198
        L114:
            if (r5 == 0) goto L198
            int r1 = r0.getOverScrollMode()
            if (r1 == r12) goto L185
            float r1 = r11.getCurrVelocity()
            int r1 = (int) r1
            if (r3 >= 0) goto L125
            int r2 = -r1
            goto L12a
        L125:
            if (r3 <= 0) goto L129
            r2 = r1
            goto L12a
        L129:
            r2 = r9
        L12a:
            if (r4 >= 0) goto L12e
            int r1 = -r1
            goto L132
        L12e:
            if (r4 <= 0) goto L131
            goto L132
        L131:
            r1 = r9
        L132:
            if (r2 >= 0) goto L146
            r0.z()
            android.widget.EdgeEffect r3 = r0.H0
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto L158
            android.widget.EdgeEffect r3 = r0.H0
            int r4 = -r2
            r3.onAbsorb(r4)
            goto L158
        L146:
            if (r2 <= 0) goto L158
            r0.A()
            android.widget.EdgeEffect r3 = r0.J0
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto L158
            android.widget.EdgeEffect r3 = r0.J0
            r3.onAbsorb(r2)
        L158:
            if (r1 >= 0) goto L16c
            r0.B()
            android.widget.EdgeEffect r3 = r0.I0
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto L17e
            android.widget.EdgeEffect r3 = r0.I0
            int r4 = -r1
            r3.onAbsorb(r4)
            goto L17e
        L16c:
            if (r1 <= 0) goto L17e
            r0.y()
            android.widget.EdgeEffect r3 = r0.K0
            boolean r3 = r3.isFinished()
            if (r3 == 0) goto L17e
            android.widget.EdgeEffect r3 = r0.K0
            r3.onAbsorb(r1)
        L17e:
            if (r2 != 0) goto L182
            if (r1 == 0) goto L185
        L182:
            r0.postInvalidateOnAnimation()
        L185:
            boolean r1 = androidx.recyclerview.widget.RecyclerView.D1
            if (r1 == 0) goto L1a2
            ls0 r1 = r0.c1
            java.lang.Object r2 = r1.e
            int[] r2 = (int[]) r2
            if (r2 == 0) goto L195
            r3 = -1
            java.util.Arrays.fill(r2, r3)
        L195:
            r1.d = r9
            goto L1a2
        L198:
            r14.b()
            dr2 r3 = r0.b1
            if (r3 == 0) goto L1a2
            r3.a(r0, r1, r2)
        L1a2:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 < r2) goto L1b3
            float r1 = r11.getCurrVelocity()
            float r1 = java.lang.Math.abs(r1)
            defpackage.zf5.a(r0, r1)
        L1b3:
            gg5 r1 = r0.m0
            iv3 r1 = r1.e
            if (r1 == 0) goto L1c0
            boolean r2 = r1.d
            if (r2 == 0) goto L1c0
            r1.g(r9, r9)
        L1c0:
            r14.X = r9
            boolean r1 = r14.Y
            if (r1 == 0) goto L1cf
            r0.removeCallbacks(r14)
            java.util.WeakHashMap r1 = defpackage.ao7.a
            r0.postOnAnimation(r14)
            return
        L1cf:
            r0.setScrollState(r9)
            r0.o0(r10)
            return
    }
}
