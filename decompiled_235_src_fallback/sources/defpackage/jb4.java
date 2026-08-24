package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jb4  reason: default package */
/* loaded from: classes.dex */
public final class jb4 {
    public final /* synthetic */ int a;
    public final defpackage.sw b;
    public final java.lang.Object c;

    public jb4(defpackage.fb4 r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r2.getClass()
            r1.<init>()
            r1.c = r2
            sw r2 = defpackage.g04.s(r0)
            r1.b = r2
            return
    }

    public jb4(defpackage.ra4 r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            r1.c = r2
            r2 = 0
            sw r2 = defpackage.g04.s(r2)
            r1.b = r2
            return
    }

    public final boolean a() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            sw r1 = r1.b
            boolean r1 = r1.b()
            return r1
        Lc:
            sw r1 = r1.b
            boolean r1 = r1.b()
            return r1
    }

    public final boolean b() {
            r6 = this;
            int r0 = r6.a
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto L3d;
                default: goto L8;
            }
        L8:
            sw r0 = r6.b
            boolean r0 = r0.a()
            if (r0 == 0) goto L3b
            java.lang.Object r6 = r6.c
            ra4 r6 = (defpackage.ra4) r6
            java.lang.Object r0 = r6.c
            monitor-enter(r0)
            int r3 = r6.a     // Catch: java.lang.Throwable -> L35
            int r3 = r3 - r2
            r6.a = r3     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L37
            boolean r3 = r6.b     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L37
            java.lang.Object r3 = r6.d     // Catch: java.lang.Throwable -> L35
            w61 r3 = (defpackage.w61) r3     // Catch: java.lang.Throwable -> L35
            ns3 r4 = new ns3     // Catch: java.lang.Throwable -> L35
            r5 = 20
            r4.<init>(r6, r1, r5)     // Catch: java.lang.Throwable -> L35
            r5 = 3
            ap6 r1 = defpackage.hv.L(r3, r1, r1, r4, r5)     // Catch: java.lang.Throwable -> L35
            r6.f = r1     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r6 = move-exception
            goto L39
        L37:
            monitor-exit(r0)
            goto L3c
        L39:
            monitor-exit(r0)
            throw r6
        L3b:
            r2 = r3
        L3c:
            return r2
        L3d:
            sw r0 = r6.b
            boolean r0 = r0.a()
            if (r0 == 0) goto L4d
            java.lang.Object r6 = r6.c
            fb4 r6 = (defpackage.fb4) r6
            r6.h(r1)
            goto L4e
        L4d:
            r2 = r3
        L4e:
            return r2
    }
}
