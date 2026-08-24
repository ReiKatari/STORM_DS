package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p61  reason: default package */
/* loaded from: classes.dex */
public abstract class p61 {
    public static final java.util.List a = null;

    static {
            lh r0 = new lh     // Catch: java.lang.Throwable -> L1e
            r0.<init>()     // Catch: java.lang.Throwable -> L1e
            r1 = 1
            o61[] r1 = new defpackage.o61[r1]     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r1[r2] = r0     // Catch: java.lang.Throwable -> L1e
            java.util.List r0 = java.util.Arrays.asList(r1)     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1e
            qb6 r0 = defpackage.sb6.Y(r0)
            java.util.List r0 = defpackage.sb6.c0(r0)
            defpackage.p61.a = r0
            return
        L1e:
            r0 = move-exception
            java.util.ServiceConfigurationError r1 = new java.util.ServiceConfigurationError
            java.lang.String r2 = r0.getMessage()
            r1.<init>(r2, r0)
            throw r1
    }
}
