package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk0  reason: default package */
/* loaded from: classes.dex */
public final class gk0 implements defpackage.jk5, defpackage.bt2 {
    public final long A;
    public final defpackage.ww B;
    public defpackage.ft2 L;

    public gk0(long r3) {
            r2 = this;
            r2.<init>()
            r2.A = r3
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L15
            ww r3 = new ww
            r3.<init>()
            r3.a = r0
            r2.B = r3
            return
        L15:
            java.lang.String r2 = "Failed requirement."
            defpackage.i.h(r2)
            r2 = 0
            throw r2
    }

    @Override // defpackage.jk5
    public final void J(defpackage.yk5 r7, long r8, defpackage.th r10) {
            r6 = this;
            ww r1 = r6.B
        L2:
            long r2 = r1.a
            r7 = -1
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 != 0) goto Lc
        La:
            r4 = r7
            goto L10
        Lc:
            r7 = 1
            long r7 = r7 + r2
            goto La
        L10:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ww.b
            boolean r7 = r0.compareAndSet(r1, r2, r4)
            if (r7 == 0) goto L2
            long r7 = r6.A
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 != 0) goto L49
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Capture processing is now enabled for "
            r7.<init>(r8)
            ft2 r8 = r6.L
            r7.append(r8)
            java.lang.String r8 = " after "
            r7.append(r8)
            r7.append(r4)
            java.lang.String r8 = " frames."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "CXCP"
            android.util.Log.w(r8, r7)
            ft2 r6 = r6.L
            r6.getClass()
            r7 = 1
            r6.D(r7)
        L49:
            return
    }

    @Override // defpackage.bt2
    public final void a() {
            r6 = this;
            ww r1 = r6.B
        L2:
            long r2 = r1.a
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto Lb
            goto Ld
        Lb:
            r4 = 0
        Ld:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ww.b
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L2
            ft2 r0 = r6.L
            r0.getClass()
            r1 = 0
            r0.D(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Capture processing has been disabled for "
            r0.<init>(r1)
            ft2 r1 = r6.L
            r1.getClass()
            r0.append(r1)
            java.lang.String r1 = " until "
            r0.append(r1)
            long r1 = r6.A
            r0.append(r1)
            java.lang.String r6 = " frames have been completed."
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "CXCP"
            android.util.Log.w(r0, r6)
            return
    }

    @Override // defpackage.bt2
    public final void b() {
            r3 = this;
            ww r0 = r3.B
            r1 = -1
            r0.a = r1
            ft2 r3 = r3.L
            r3.getClass()
            r0 = 0
            r3.D(r0)
            return
    }

    @Override // defpackage.bt2
    public final void c() {
            r0 = this;
            return
    }
}
