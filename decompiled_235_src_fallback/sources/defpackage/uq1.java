package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uq1  reason: default package */
/* loaded from: classes.dex */
public enum uq1 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.uq1[] $VALUES = null;
    public static final defpackage.uq1 DAYS = null;
    public static final defpackage.uq1 HOURS = null;
    public static final defpackage.uq1 MICROSECONDS = null;
    public static final defpackage.uq1 MILLISECONDS = null;
    public static final defpackage.uq1 MINUTES = null;
    public static final defpackage.uq1 NANOSECONDS = null;
    public static final defpackage.uq1 SECONDS = null;
    private final java.util.concurrent.TimeUnit timeUnit;

    private static final /* synthetic */ defpackage.uq1[] $values() {
            uq1 r0 = defpackage.uq1.NANOSECONDS
            uq1 r1 = defpackage.uq1.MICROSECONDS
            uq1 r2 = defpackage.uq1.MILLISECONDS
            uq1 r3 = defpackage.uq1.SECONDS
            uq1 r4 = defpackage.uq1.MINUTES
            uq1 r5 = defpackage.uq1.HOURS
            uq1 r6 = defpackage.uq1.DAYS
            uq1[] r0 = new defpackage.uq1[]{r0, r1, r2, r3, r4, r5, r6}
            return r0
    }

    static {
            uq1 r0 = new uq1
            r1 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.lang.String r3 = "NANOSECONDS"
            r0.<init>(r3, r1, r2)
            defpackage.uq1.NANOSECONDS = r0
            uq1 r0 = new uq1
            r1 = 1
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS
            java.lang.String r3 = "MICROSECONDS"
            r0.<init>(r3, r1, r2)
            defpackage.uq1.MICROSECONDS = r0
            uq1 r0 = new uq1
            r1 = 2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r3 = "MILLISECONDS"
            r0.<init>(r3, r1, r2)
            defpackage.uq1.MILLISECONDS = r0
            uq1 r0 = new uq1
            r1 = 3
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            java.lang.String r3 = "SECONDS"
            r0.<init>(r3, r1, r2)
            defpackage.uq1.SECONDS = r0
            uq1 r0 = new uq1
            r1 = 4
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            java.lang.String r3 = "MINUTES"
            r0.<init>(r3, r1, r2)
            defpackage.uq1.MINUTES = r0
            uq1 r0 = new uq1
            r1 = 5
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS
            java.lang.String r3 = "HOURS"
            r0.<init>(r3, r1, r2)
            defpackage.uq1.HOURS = r0
            uq1 r0 = new uq1
            r1 = 6
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            java.lang.String r3 = "DAYS"
            r0.<init>(r3, r1, r2)
            defpackage.uq1.DAYS = r0
            uq1[] r0 = $values()
            defpackage.uq1.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.uq1.$ENTRIES = r0
            return
    }

    uq1(java.lang.String r1, int r2, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.timeUnit = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.uq1.$ENTRIES
            return r0
    }

    public static defpackage.uq1 valueOf(java.lang.String r1) {
            java.lang.Class<uq1> r0 = defpackage.uq1.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            uq1 r1 = (defpackage.uq1) r1
            return r1
    }

    public static defpackage.uq1[] values() {
            uq1[] r0 = defpackage.uq1.$VALUES
            java.lang.Object r0 = r0.clone()
            uq1[] r0 = (defpackage.uq1[]) r0
            return r0
    }

    public final java.util.concurrent.TimeUnit getTimeUnit$kotlin_stdlib() {
            r0 = this;
            java.util.concurrent.TimeUnit r0 = r0.timeUnit
            return r0
    }
}
