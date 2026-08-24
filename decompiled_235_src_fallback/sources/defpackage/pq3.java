package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pq3  reason: default package */
/* loaded from: classes.dex */
public final class pq3 {
    public final defpackage.qn2 a;
    public final defpackage.m44 b;
    public defpackage.bk1 c;
    public int d;
    public int e;
    public int f;

    public pq3(defpackage.qn2 r4) {
            r3 = this;
            r3.<init>()
            m44 r0 = new m44
            r1 = 6
            r2 = 0
            r0.<init>(r1, r2)
            r3.b = r0
            r0 = -1
            r3.d = r0
            r3.e = r0
            r3.a = r4
            return
    }

    public final defpackage.oq3 a(int r5, long r6, boolean r8, defpackage.qn2 r9) {
            r4 = this;
            bk1 r0 = r4.c
            if (r0 == 0) goto L58
            a25 r1 = new a25
            java.lang.Object r2 = r0.R
            b25 r2 = (defpackage.b25) r2
            boolean r3 = r2 instanceof defpackage.dk
            m44 r4 = r4.b
            r1.<init>(r0, r5, r4, r9)
            q21 r4 = new q21
            r4.<init>(r6)
            r1.d = r4
            if (r3 == 0) goto L4e
            r4 = 1
            if (r8 == 0) goto L35
            dk r2 = (defpackage.dk) r2
            java.util.PriorityQueue r6 = r2.B
            e35 r7 = new e35
            r7.<init>(r4, r1)
            r6.add(r7)
            boolean r6 = r2.L
            if (r6 != 0) goto L51
            r2.L = r4
            android.view.View r4 = r2.A
            r4.post(r2)
            goto L51
        L35:
            dk r2 = (defpackage.dk) r2
            java.util.PriorityQueue r6 = r2.B
            e35 r7 = new e35
            r8 = 0
            r7.<init>(r8, r1)
            r6.add(r7)
            boolean r6 = r2.L
            if (r6 != 0) goto L51
            r2.L = r4
            android.view.View r4 = r2.A
            r4.post(r2)
            goto L51
        L4e:
            r2.a(r1)
        L51:
            java.lang.String r4 = "compose:lazy:schedule_prefetch:index"
            long r5 = (long) r5
            defpackage.lb4.J(r5, r4)
            return r1
        L58:
            nq1 r4 = defpackage.nq1.a
            return r4
    }
}
