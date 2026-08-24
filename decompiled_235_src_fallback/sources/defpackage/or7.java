package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: or7  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class or7 {
    public static final /* synthetic */ int[] a = null;

    static {
            gp1[] r0 = defpackage.gp1.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            gp1 r1 = defpackage.gp1.ACTIVE     // Catch: java.lang.NoSuchFieldError -> L10
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
        L10:
            gp1 r1 = defpackage.gp1.INSTALLED     // Catch: java.lang.NoSuchFieldError -> L19
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
        L19:
            gp1 r1 = defpackage.gp1.NOT_INSTALLED     // Catch: java.lang.NoSuchFieldError -> L22
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
            r2 = 3
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
        L22:
            defpackage.or7.a = r0
            return
    }
}
