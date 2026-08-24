package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jc5  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class jc5 {
    public static final /* synthetic */ int[] a = null;
    public static final /* synthetic */ int[] b = null;

    static {
            bd5[] r0 = defpackage.bd5.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            r1 = 1
            bd5 r2 = defpackage.bd5.ACHIEVEMENT     // Catch: java.lang.NoSuchFieldError -> L10
            int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
            r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L10
        L10:
            r2 = 2
            bd5 r3 = defpackage.bd5.LEADERBOARD     // Catch: java.lang.NoSuchFieldError -> L19
            int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
            r0[r3] = r2     // Catch: java.lang.NoSuchFieldError -> L19
        L19:
            defpackage.jc5.a = r0
            gc5[] r0 = defpackage.gc5.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            gc5 r3 = defpackage.gc5.ACCEPTED     // Catch: java.lang.NoSuchFieldError -> L2a
            int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2a
            r0[r3] = r1     // Catch: java.lang.NoSuchFieldError -> L2a
        L2a:
            gc5 r1 = defpackage.gc5.ALREADY_ACCEPTED     // Catch: java.lang.NoSuchFieldError -> L32
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L32
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L32
        L32:
            gc5 r1 = defpackage.gc5.PERMANENT_FAILURE     // Catch: java.lang.NoSuchFieldError -> L3b
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3b
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3b
        L3b:
            gc5 r1 = defpackage.gc5.RETRYABLE_FAILURE     // Catch: java.lang.NoSuchFieldError -> L44
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
            r2 = 4
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L44
        L44:
            defpackage.jc5.b = r0
            return
    }
}
