package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s92  reason: default package */
/* loaded from: classes.dex */
public final class s92 extends defpackage.jg5 {
    public final /* synthetic */ defpackage.u92 a;

    public s92(defpackage.u92 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.jg5
    public final void b(androidx.recyclerview.widget.RecyclerView r8, int r9, int r10) {
            r7 = this;
            int r9 = r8.computeHorizontalScrollOffset()
            int r8 = r8.computeVerticalScrollOffset()
            u92 r7 = r7.a
            int r10 = r7.a
            androidx.recyclerview.widget.RecyclerView r0 = r7.s
            int r0 = r0.computeVerticalScrollRange()
            int r1 = r7.r
            int r2 = r0 - r1
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L1e
            if (r1 < r10) goto L1e
            r2 = r4
            goto L1f
        L1e:
            r2 = r3
        L1f:
            r7.t = r2
            androidx.recyclerview.widget.RecyclerView r2 = r7.s
            int r2 = r2.computeHorizontalScrollRange()
            int r5 = r7.q
            int r6 = r2 - r5
            if (r6 <= 0) goto L31
            if (r5 < r10) goto L31
            r10 = r4
            goto L32
        L31:
            r10 = r3
        L32:
            r7.u = r10
            boolean r6 = r7.t
            if (r6 != 0) goto L42
            if (r10 != 0) goto L42
            int r8 = r7.v
            if (r8 == 0) goto L79
            r7.g(r3)
            return
        L42:
            r10 = 1073741824(0x40000000, float:2.0)
            if (r6 == 0) goto L5a
            float r8 = (float) r8
            float r3 = (float) r1
            float r6 = r3 / r10
            float r6 = r6 + r8
            float r6 = r6 * r3
            float r8 = (float) r0
            float r6 = r6 / r8
            int r8 = (int) r6
            r7.l = r8
            int r8 = r1 * r1
            int r8 = r8 / r0
            int r8 = java.lang.Math.min(r1, r8)
            r7.k = r8
        L5a:
            boolean r8 = r7.u
            if (r8 == 0) goto L72
            float r8 = (float) r9
            float r9 = (float) r5
            float r10 = r9 / r10
            float r10 = r10 + r8
            float r10 = r10 * r9
            float r8 = (float) r2
            float r10 = r10 / r8
            int r8 = (int) r10
            r7.o = r8
            int r8 = r5 * r5
            int r8 = r8 / r2
            int r8 = java.lang.Math.min(r5, r8)
            r7.n = r8
        L72:
            int r8 = r7.v
            if (r8 == 0) goto L7a
            if (r8 != r4) goto L79
            goto L7a
        L79:
            return
        L7a:
            r7.g(r4)
            return
    }
}
