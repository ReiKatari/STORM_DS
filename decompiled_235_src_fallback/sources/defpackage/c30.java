package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c30  reason: default package */
/* loaded from: classes.dex */
public final class c30 extends defpackage.mu {
    public final defpackage.z20 b;

    public c30() {
            r1 = this;
            r1.<init>()
            z20 r0 = new z20
            r0.<init>()
            r1.b = r0
            z20 r1 = new z20
            r1.<init>()
            return
    }

    @Override // defpackage.mu
    public final byte[] a(int r5) {
            r4 = this;
            z20 r4 = r4.b
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = 0
            if (r5 >= r0) goto L9
            goto L34
        L9:
            monitor-enter(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = r4.get(r0)     // Catch: java.lang.Throwable -> L3f
            a30 r0 = (defpackage.a30) r0     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L18
            goto L34
        L18:
            monitor-enter(r0)
            java.lang.Object[] r4 = r0.a     // Catch: java.lang.Throwable -> L3c
            int r2 = r0.b     // Catch: java.lang.Throwable -> L3c
            r3 = r4[r2]     // Catch: java.lang.Throwable -> L3c
            r4[r2] = r1     // Catch: java.lang.Throwable -> L3c
            int r2 = r2 + (-1)
            r4 = r2 & 511(0x1ff, float:7.16E-43)
            r0.b = r4     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            java.lang.ref.Reference r3 = (java.lang.ref.Reference) r3
            if (r3 != 0) goto L2d
            goto L34
        L2d:
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L18
            r1 = r4
        L34:
            byte[] r1 = (byte[]) r1
            if (r1 != 0) goto L3b
            byte[] r4 = new byte[r5]
            return r4
        L3b:
            return r1
        L3c:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r4
        L3f:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3f
            throw r5
    }

    @Override // defpackage.mu
    public final void b(byte[] r3) {
            r2 = this;
            z20 r2 = r2.b
            int r0 = r3.length
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 >= r1) goto L9
            return
        L9:
            monitor-enter(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L23
            a30 r1 = (defpackage.a30) r1     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L25
            a30 r1 = new a30     // Catch: java.lang.Throwable -> L23
            r1.<init>()     // Catch: java.lang.Throwable -> L23
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            r2.put(r0, r1)     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r3 = move-exception
            goto L3d
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.ref.SoftReference r2 = new java.lang.ref.SoftReference
            r2.<init>(r3)
            monitor-enter(r1)
            int r3 = r1.b     // Catch: java.lang.Throwable -> L3a
            int r3 = r3 + 1
            r3 = r3 & 511(0x1ff, float:7.16E-43)
            r1.b = r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Object[] r0 = r1.a     // Catch: java.lang.Throwable -> L3a
            r0[r3] = r2     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r1)
            return
        L3a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            throw r2
        L3d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
            throw r3
    }
}
