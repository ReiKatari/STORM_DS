package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uj7  reason: default package */
/* loaded from: classes.dex */
public abstract class uj7 {
    public static final java.util.concurrent.atomic.AtomicReference a = null;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            defpackage.uj7.a = r0
            return
    }

    public static java.util.Calendar a(java.util.Calendar r4) {
            java.util.Calendar r4 = c(r4)
            r0 = 0
            java.util.Calendar r0 = c(r0)
            r1 = 1
            int r1 = r4.get(r1)
            r2 = 2
            int r2 = r4.get(r2)
            r3 = 5
            int r4 = r4.get(r3)
            r0.set(r1, r2, r4)
            return r0
    }

    public static java.util.Calendar b() {
            java.util.concurrent.atomic.AtomicReference r0 = defpackage.uj7.a
            java.lang.Object r0 = r0.get()
            z57 r0 = (defpackage.z57) r0
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 11
            r2 = 0
            r0.set(r1, r2)
            r1 = 12
            r0.set(r1, r2)
            r1 = 13
            r0.set(r1, r2)
            r1 = 14
            r0.set(r1, r2)
            java.lang.String r1 = "UTC"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            r0.setTimeZone(r1)
            return r0
    }

    public static java.util.Calendar c(java.util.Calendar r3) {
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            if (r3 != 0) goto L10
            r0.clear()
            return r0
        L10:
            long r1 = r3.getTimeInMillis()
            r0.setTimeInMillis(r1)
            return r0
    }
}
