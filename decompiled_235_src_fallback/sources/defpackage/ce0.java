package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ce0  reason: default package */
/* loaded from: classes.dex */
public final class ce0 extends defpackage.be0 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public ce0(java.util.List r3) {
            r2 = this;
            r0 = 0
            r2.a = r0
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.b = r0
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r3.next()
            be0 r0 = (defpackage.be0) r0
            boolean r1 = r0 instanceof defpackage.de0
            if (r1 != 0) goto L11
            java.lang.Object r1 = r2.b
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r0)
            goto L11
        L29:
            return
    }

    public ce0(defpackage.mq7 r2) {
            r1 = this;
            r0 = 2
            r1.a = r0
            r1.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.b = r0
            return
    }

    public ce0(defpackage.o54 r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    @Override // defpackage.be0
    public void a(int r4) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r3 = r3.b
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r0 = r3.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1d
            java.lang.Object r2 = r3.get(r1)
            int r1 = r1 + 1
            be0 r2 = (defpackage.be0) r2
            r2.a(r4)
            goto Lf
        L1d:
            return
    }

    @Override // defpackage.be0
    public final void b(int r8, defpackage.je0 r9) {
            r7 = this;
            int r0 = r7.a
            switch(r0) {
                case 0: goto L6d;
                case 1: goto L49;
                default: goto L5;
            }
        L5:
            java.lang.Object r7 = r7.b
            java.lang.ref.WeakReference r7 = (java.lang.ref.WeakReference) r7
            java.lang.Object r7 = r7.get()
            mq7 r7 = (defpackage.mq7) r7
            if (r7 == 0) goto L48
            java.util.HashSet r7 = r7.A
            java.util.Iterator r7 = r7.iterator()
        L17:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r7.next()
            di7 r0 = (defpackage.di7) r0
            rc6 r0 = r0.o
            ek0 r1 = r0.g
            java.util.List r1 = r1.d
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L17
            java.lang.Object r2 = r1.next()
            be0 r2 = (defpackage.be0) r2
            bg1 r3 = new bg1
            ek0 r4 = r0.g
            sy6 r4 = r4.e
            r5 = -1
            r3.<init>(r9, r4, r5)
            r2.b(r8, r3)
            goto L2d
        L48:
            return
        L49:
            java.lang.Object r7 = r7.b
            o54 r7 = (defpackage.o54) r7
            java.lang.Object r0 = r7.A
            monitor-enter(r0)
            boolean r8 = r7.X     // Catch: java.lang.Throwable -> L56
            if (r8 == 0) goto L58
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            goto L6a
        L56:
            r7 = move-exception
            goto L6b
        L58:
            android.util.LongSparseArray r8 = r7.e0     // Catch: java.lang.Throwable -> L56
            long r1 = r9.c()     // Catch: java.lang.Throwable -> L56
            ke0 r3 = new ke0     // Catch: java.lang.Throwable -> L56
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L56
            r8.put(r1, r3)     // Catch: java.lang.Throwable -> L56
            r7.k()     // Catch: java.lang.Throwable -> L56
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
        L6a:
            return
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L56
            throw r7
        L6d:
            java.lang.Object r7 = r7.b
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r0 = r7.size()
            r1 = 0
        L76:
            if (r1 >= r0) goto L84
            java.lang.Object r2 = r7.get(r1)
            int r1 = r1 + 1
            be0 r2 = (defpackage.be0) r2
            r2.b(r8, r9)
            goto L76
        L84:
            return
    }

    @Override // defpackage.be0
    public void c(int r4, defpackage.d90 r5) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r3 = r3.b
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r0 = r3.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1d
            java.lang.Object r2 = r3.get(r1)
            int r1 = r1 + 1
            be0 r2 = (defpackage.be0) r2
            r2.c(r4, r5)
            goto Lf
        L1d:
            return
    }

    @Override // defpackage.be0
    public void d(int r4, int r5) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r3 = r3.b
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r0 = r3.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1d
            java.lang.Object r2 = r3.get(r1)
            int r1 = r1 + 1
            be0 r2 = (defpackage.be0) r2
            r2.d(r4, r5)
            goto Lf
        L1d:
            return
    }

    @Override // defpackage.be0
    public void e(int r4) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            java.lang.Object r3 = r3.b
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r0 = r3.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1d
            java.lang.Object r2 = r3.get(r1)
            int r1 = r1 + 1
            be0 r2 = (defpackage.be0) r2
            r2.e(r4)
            goto Lf
        L1d:
            return
    }
}
