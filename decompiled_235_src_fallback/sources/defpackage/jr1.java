package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jr1  reason: default package */
/* loaded from: classes.dex */
public final class jr1 implements defpackage.b31 {
    public final /* synthetic */ int a;
    public java.lang.Object b;

    public /* synthetic */ jr1() {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            return
    }

    public /* synthetic */ jr1(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.b31
    public final void accept(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L4c;
                case 1: goto L3a;
                default: goto L5;
            }
        L5:
            yi2 r4 = (defpackage.yi2) r4
            java.lang.Object r0 = defpackage.zi2.c
            monitor-enter(r0)
            ci6 r1 = defpackage.zi2.d     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r3.b     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L1a
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto L37
        L1a:
            r3 = move-exception
            goto L38
        L1c:
            java.lang.Object r3 = r3.b     // Catch: java.lang.Throwable -> L1a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1a
            r1.remove(r3)     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            r3 = 0
        L25:
            int r0 = r2.size()
            if (r3 >= r0) goto L37
            java.lang.Object r0 = r2.get(r3)
            b31 r0 = (defpackage.b31) r0
            r0.accept(r4)
            int r3 = r3 + 1
            goto L25
        L37:
            return
        L38:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r3
        L3a:
            yi2 r4 = (defpackage.yi2) r4
            if (r4 != 0) goto L44
            yi2 r4 = new yi2
            r0 = -3
            r4.<init>(r0)
        L44:
            java.lang.Object r3 = r3.b
            u63 r3 = (defpackage.u63) r3
            r3.z(r4)
            return
        L4c:
            java.lang.Object r0 = r3.b
            b31 r0 = (defpackage.b31) r0
            r0.getClass()
            java.lang.Object r3 = r3.b
            b31 r3 = (defpackage.b31) r3
            r3.accept(r4)
            return
    }
}
