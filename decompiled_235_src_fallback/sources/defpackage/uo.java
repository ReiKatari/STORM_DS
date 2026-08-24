package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uo  reason: default package */
/* loaded from: classes.dex */
public final class uo implements defpackage.pp6 {
    public final defpackage.wc7 A;
    public final defpackage.vs4 B;
    public defpackage.ap L;
    public long R;
    public long X;
    public boolean Y;

    public /* synthetic */ uo(defpackage.wc7 r10, java.lang.Object r11, defpackage.ap r12, int r13) {
            r9 = this;
            r13 = r13 & 4
            if (r13 == 0) goto L5
            r12 = 0
        L5:
            r3 = r12
            r6 = -9223372036854775808
            r8 = 0
            r4 = -9223372036854775808
            r0 = r9
            r1 = r10
            r2 = r11
            r0.<init>(r1, r2, r3, r4, r6, r8)
            return
    }

    public uo(defpackage.wc7 r2, java.lang.Object r3, defpackage.ap r4, long r5, long r7, boolean r9) {
            r1 = this;
            r1.<init>()
            r1.A = r2
            vs4 r0 = defpackage.np2.Y(r3)
            r1.B = r0
            if (r4 == 0) goto L12
            ap r2 = defpackage.nw7.R(r4)
            goto L1d
        L12:
            qn2 r2 = r2.a
            java.lang.Object r2 = r2.g(r3)
            ap r2 = (defpackage.ap) r2
            r2.d()
        L1d:
            r1.L = r2
            r1.R = r5
            r1.X = r7
            r1.Y = r9
            return
    }

    public final java.lang.Object a() {
            r1 = this;
            wc7 r0 = r1.A
            qn2 r0 = r0.b
            ap r1 = r1.L
            java.lang.Object r1 = r0.g(r1)
            return r1
    }

    @Override // defpackage.pp6
    public final java.lang.Object getValue() {
            r0 = this;
            vs4 r0 = r0.B
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AnimationState(value="
            r0.<init>(r1)
            vs4 r1 = r3.B
            java.lang.Object r1 = r1.getValue()
            r0.append(r1)
            java.lang.String r1 = ", velocity="
            r0.append(r1)
            java.lang.Object r1 = r3.a()
            r0.append(r1)
            java.lang.String r1 = ", isRunning="
            r0.append(r1)
            boolean r1 = r3.Y
            r0.append(r1)
            java.lang.String r1 = ", lastFrameTimeNanos="
            r0.append(r1)
            long r1 = r3.R
            r0.append(r1)
            java.lang.String r1 = ", finishedTimeNanos="
            r0.append(r1)
            long r1 = r3.X
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
