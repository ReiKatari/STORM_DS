package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a71  reason: default package */
/* loaded from: classes.dex */
public enum a71 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.a71[] $VALUES = null;
    public static final defpackage.a71 ATOMIC = null;
    public static final defpackage.a71 DEFAULT = null;
    public static final defpackage.a71 LAZY = null;
    public static final defpackage.a71 UNDISPATCHED = null;

    private static final /* synthetic */ defpackage.a71[] $values() {
            a71 r0 = defpackage.a71.DEFAULT
            a71 r1 = defpackage.a71.LAZY
            a71 r2 = defpackage.a71.ATOMIC
            a71 r3 = defpackage.a71.UNDISPATCHED
            a71[] r0 = new defpackage.a71[]{r0, r1, r2, r3}
            return r0
    }

    static {
            a71 r0 = new a71
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.a71.DEFAULT = r0
            a71 r0 = new a71
            java.lang.String r1 = "LAZY"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.a71.LAZY = r0
            a71 r0 = new a71
            java.lang.String r1 = "ATOMIC"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.a71.ATOMIC = r0
            a71 r0 = new a71
            java.lang.String r1 = "UNDISPATCHED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.a71.UNDISPATCHED = r0
            a71[] r0 = $values()
            defpackage.a71.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.a71.$ENTRIES = r0
            return
    }

    a71(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.a71.$ENTRIES
            return r0
    }

    public static /* synthetic */ void isLazy$annotations() {
            return
    }

    public static defpackage.a71 valueOf(java.lang.String r1) {
            java.lang.Class<a71> r0 = defpackage.a71.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            a71 r1 = (defpackage.a71) r1
            return r1
    }

    public static defpackage.a71[] values() {
            a71[] r0 = defpackage.a71.$VALUES
            java.lang.Object r0 = r0.clone()
            a71[] r0 = (defpackage.a71[]) r0
            return r0
    }

    public final <R, T> void invoke(defpackage.eo2 r4, R r5, defpackage.r41<? super T> r6) {
            r3 = this;
            int[] r0 = defpackage.z61.a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            jg7 r1 = defpackage.jg7.a
            if (r3 == r0) goto L6c
            r0 = 2
            if (r3 == r0) goto L5a
            r1 = 3
            if (r3 == r1) goto L1b
            r4 = 4
            if (r3 != r4) goto L17
            goto L43
        L17:
            defpackage.i.d()
            return
        L1b:
            r6.getClass()
            l61 r3 = r6.b()     // Catch: java.lang.Throwable -> L44
            r1 = 0
            java.lang.Object r1 = defpackage.k57.c(r3, r1)     // Catch: java.lang.Throwable -> L44
            boolean r2 = r4 instanceof defpackage.d20     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L32
            java.lang.Object r4 = defpackage.np2.k0(r4, r5, r6)     // Catch: java.lang.Throwable -> L30
            goto L39
        L30:
            r4 = move-exception
            goto L46
        L32:
            defpackage.ge7.p(r0, r4)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r4 = r4.o(r5, r6)     // Catch: java.lang.Throwable -> L30
        L39:
            defpackage.k57.a(r3, r1)     // Catch: java.lang.Throwable -> L44
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            if (r4 == r3) goto L43
            r6.i(r4)
        L43:
            return
        L44:
            r3 = move-exception
            goto L4a
        L46:
            defpackage.k57.a(r3, r1)     // Catch: java.lang.Throwable -> L44
            throw r4     // Catch: java.lang.Throwable -> L44
        L4a:
            boolean r4 = r3 instanceof defpackage.mk1
            if (r4 == 0) goto L52
            mk1 r3 = (defpackage.mk1) r3
            java.lang.Throwable r3 = r3.A
        L52:
            em5 r3 = defpackage.oi2.p(r3)
            r6.i(r3)
            return
        L5a:
            r4.getClass()
            r6.getClass()
            r41 r3 = defpackage.np2.F(r4, r5, r6)
            r41 r3 = defpackage.np2.V(r3)
            r3.i(r1)
            return
        L6c:
            r41 r3 = defpackage.np2.F(r4, r5, r6)     // Catch: java.lang.Throwable -> L78
            r41 r3 = defpackage.np2.V(r3)     // Catch: java.lang.Throwable -> L78
            defpackage.ok1.a(r3, r1)     // Catch: java.lang.Throwable -> L78
            return
        L78:
            r3 = move-exception
            boolean r4 = r3 instanceof defpackage.mk1
            if (r4 == 0) goto L81
            mk1 r3 = (defpackage.mk1) r3
            java.lang.Throwable r3 = r3.A
        L81:
            em5 r4 = defpackage.oi2.p(r3)
            r6.i(r4)
            throw r3
    }

    public final boolean isLazy() {
            r1 = this;
            a71 r0 = defpackage.a71.LAZY
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }
}
