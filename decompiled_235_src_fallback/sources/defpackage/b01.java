package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b01  reason: default package */
/* loaded from: classes.dex */
public final class b01 implements defpackage.e36, defpackage.fb4 {
    public final defpackage.e36 A;
    public final defpackage.fb4 B;
    public defpackage.l61 L;
    public java.lang.Throwable R;
    public final defpackage.a01 X;

    public b01(defpackage.e36 r2) {
            r1 = this;
            hb4 r0 = new hb4
            r0.<init>()
            r2.getClass()
            r1.<init>()
            r1.A = r2
            r1.B = r0
            a01 r2 = new a01
            r2.<init>(r1)
            r1.X = r2
            return
    }

    @Override // defpackage.e36
    public final boolean Y() {
            r0 = this;
            e36 r0 = r0.A
            boolean r0 = r0.Y()
            return r0
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            a01 r0 = r2.X
            if (r0 == 0) goto L8
            r1 = -1
            r0.p(r1)
        L8:
            e36 r2 = r2.A
            r2.close()
            return
    }

    @Override // defpackage.fb4
    public final java.lang.Object e(defpackage.r41 r1) {
            r0 = this;
            fb4 r0 = r0.B
            java.lang.Object r0 = r0.e(r1)
            return r0
    }

    @Override // defpackage.fb4
    public final void h(java.lang.Object r1) {
            r0 = this;
            r1 = 0
            fb4 r0 = r0.B
            r0.h(r1)
            return
    }

    @Override // defpackage.e36
    public final defpackage.j36 i0(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            a01 r0 = r1.X
            if (r0 == 0) goto L16
            zz0 r1 = new zz0
            java.lang.Object r2 = r0.h(r2)
            r2.getClass()
            j36 r2 = (defpackage.j36) r2
            r1.<init>(r2)
            return r1
        L16:
            e36 r1 = r1.A
            j36 r1 = r1.i0(r2)
            return r1
    }

    public final void k(java.lang.StringBuilder r6) {
            r5 = this;
            a01 r0 = r5.X
            l61 r1 = r5.L
            r2 = 10
            if (r1 != 0) goto L16
            java.lang.Throwable r1 = r5.R
            if (r1 == 0) goto Ld
            goto L16
        Ld:
            java.lang.String r5 = "\t\tStatus: Free connection"
            r6.append(r5)
            r6.append(r2)
            goto L87
        L16:
            java.lang.String r1 = "\t\tStatus: Acquired connection"
            r6.append(r1)
            r6.append(r2)
            l61 r1 = r5.L
            if (r1 == 0) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\t\tCoroutine: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r6.append(r1)
            r6.append(r2)
        L36:
            java.lang.Throwable r5 = r5.R
            if (r5 == 0) goto L87
            java.lang.String r1 = "\t\tAcquired:"
            r6.append(r1)
            r6.append(r2)
            java.io.StringWriter r1 = new java.io.StringWriter
            r1.<init>()
            java.io.PrintWriter r3 = new java.io.PrintWriter
            r3.<init>(r1)
            r5.printStackTrace(r3)
            r3.flush()
            java.lang.String r5 = r1.toString()
            r5.getClass()
            java.util.List r5 = defpackage.qs6.z0(r5)
            r1 = 1
            java.util.List r5 = defpackage.gt0.D0(r5, r1)
            java.util.Iterator r5 = r5.iterator()
        L66:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L87
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\t\t"
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r6.append(r1)
            r6.append(r2)
            goto L66
        L87:
            if (r0 == 0) goto La9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "\t\tPrepared Statement Cache Size: "
            r5.<init>(r1)
            java.lang.Object r1 = r0.g
            q61 r1 = (defpackage.q61) r1
            monitor-enter(r1)
            int r0 = r0.c     // Catch: java.lang.Throwable -> La6
            monitor-exit(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r6.append(r5)
            r6.append(r2)
            return
        La6:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        La9:
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            e36 r0 = r0.A
            java.lang.String r0 = r0.toString()
            return r0
    }
}
