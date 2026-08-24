package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ho3  reason: default package */
/* loaded from: classes.dex */
public final class ho3 implements defpackage.o55 {
    public static final java.lang.Object c = null;
    public volatile java.lang.Object a;
    public volatile defpackage.o55 b;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.ho3.c = r0
            return
    }

    public ho3(defpackage.o55 r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = defpackage.ho3.c
            r1.a = r0
            r1.b = r2
            return
    }

    @Override // defpackage.o55
    public final java.lang.Object get() {
            r2 = this;
            java.lang.Object r0 = r2.a
            java.lang.Object r1 = defpackage.ho3.c
            if (r0 != r1) goto L1d
            monitor-enter(r2)
            java.lang.Object r0 = r2.a     // Catch: java.lang.Throwable -> L17
            if (r0 != r1) goto L19
            o55 r0 = r2.b     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L17
            r2.a = r0     // Catch: java.lang.Throwable -> L17
            r1 = 0
            r2.b = r1     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r0 = move-exception
            goto L1b
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            return r0
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
            throw r0
        L1d:
            return r0
    }
}
