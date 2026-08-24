package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w90  reason: default package */
/* loaded from: classes.dex */
public abstract class w90 {
    public final defpackage.pu a;
    public int b;

    public w90(int r1) {
            r0 = this;
            switch(r1) {
                case 1: goto Le;
                default: goto L3;
            }
        L3:
            r0.<init>()
            pu r1 = new pu
            r1.<init>()
            r0.a = r1
            return
        Le:
            r0.<init>()
            pu r1 = new pu
            r1.<init>()
            r0.a = r1
            return
    }

    public void a(byte[] r4) {
            r3 = this;
            r4.getClass()
            monitor-enter(r3)
            int r0 = r3.b     // Catch: java.lang.Throwable -> L18
            int r1 = r4.length     // Catch: java.lang.Throwable -> L18
            int r1 = r1 + r0
            int r2 = defpackage.xu.a     // Catch: java.lang.Throwable -> L18
            if (r1 >= r2) goto L1a
            int r1 = r4.length     // Catch: java.lang.Throwable -> L18
            int r1 = r1 / 2
            int r0 = r0 + r1
            r3.b = r0     // Catch: java.lang.Throwable -> L18
            pu r0 = r3.a     // Catch: java.lang.Throwable -> L18
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r4 = move-exception
            goto L1c
        L1a:
            monitor-exit(r3)
            return
        L1c:
            monitor-exit(r3)
            throw r4
    }

    public void b(char[] r4) {
            r3 = this;
            r4.getClass()
            monitor-enter(r3)
            int r0 = r3.b     // Catch: java.lang.Throwable -> L16
            int r1 = r4.length     // Catch: java.lang.Throwable -> L16
            int r1 = r1 + r0
            int r2 = defpackage.xu.a     // Catch: java.lang.Throwable -> L16
            if (r1 >= r2) goto L18
            int r1 = r4.length     // Catch: java.lang.Throwable -> L16
            int r0 = r0 + r1
            r3.b = r0     // Catch: java.lang.Throwable -> L16
            pu r0 = r3.a     // Catch: java.lang.Throwable -> L16
            r0.addLast(r4)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r4 = move-exception
            goto L1a
        L18:
            monitor-exit(r3)
            return
        L1a:
            monitor-exit(r3)
            throw r4
    }

    public byte[] c(int r4) {
            r3 = this;
            monitor-enter(r3)
            pu r0 = r3.a     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            if (r1 == 0) goto Lc
            r0 = r2
            goto L10
        Lc:
            java.lang.Object r0 = r0.removeLast()     // Catch: java.lang.Throwable -> L1e
        L10:
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L20
            int r1 = r3.b     // Catch: java.lang.Throwable -> L1e
            int r2 = r0.length     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 / 2
            int r1 = r1 - r2
            r3.b = r1     // Catch: java.lang.Throwable -> L1e
            r2 = r0
            goto L20
        L1e:
            r4 = move-exception
            goto L27
        L20:
            monitor-exit(r3)
            if (r2 != 0) goto L26
            byte[] r3 = new byte[r4]
            return r3
        L26:
            return r2
        L27:
            monitor-exit(r3)
            throw r4
    }

    public char[] d(int r4) {
            r3 = this;
            monitor-enter(r3)
            pu r0 = r3.a     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1c
            r2 = 0
            if (r1 == 0) goto Lc
            r0 = r2
            goto L10
        Lc:
            java.lang.Object r0 = r0.removeLast()     // Catch: java.lang.Throwable -> L1c
        L10:
            char[] r0 = (char[]) r0     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1e
            int r1 = r3.b     // Catch: java.lang.Throwable -> L1c
            int r2 = r0.length     // Catch: java.lang.Throwable -> L1c
            int r1 = r1 - r2
            r3.b = r1     // Catch: java.lang.Throwable -> L1c
            r2 = r0
            goto L1e
        L1c:
            r4 = move-exception
            goto L25
        L1e:
            monitor-exit(r3)
            if (r2 != 0) goto L24
            char[] r3 = new char[r4]
            return r3
        L24:
            return r2
        L25:
            monitor-exit(r3)
            throw r4
    }
}
