package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cc1  reason: default package */
/* loaded from: classes.dex */
public abstract class cc1 {
    public static final defpackage.qm a = null;
    public static final java.lang.String[] b = null;
    public static final java.text.DateFormat[] c = null;

    static {
            qm r0 = new qm
            r1 = 2
            r0.<init>(r1)
            defpackage.cc1.a = r0
            java.lang.String r15 = "EEE, dd-MM-yyyy HH:mm:ss z"
            java.lang.String r16 = "EEE MMM d yyyy HH:mm:ss z"
            java.lang.String r2 = "EEE, dd MMM yyyy HH:mm:ss zzz"
            java.lang.String r3 = "EEEE, dd-MMM-yy HH:mm:ss zzz"
            java.lang.String r4 = "EEE MMM d HH:mm:ss yyyy"
            java.lang.String r5 = "EEE, dd-MMM-yyyy HH:mm:ss z"
            java.lang.String r6 = "EEE, dd-MMM-yyyy HH-mm-ss z"
            java.lang.String r7 = "EEE, dd MMM yy HH:mm:ss z"
            java.lang.String r8 = "EEE dd-MMM-yyyy HH:mm:ss z"
            java.lang.String r9 = "EEE dd MMM yyyy HH:mm:ss z"
            java.lang.String r10 = "EEE dd-MMM-yyyy HH-mm-ss z"
            java.lang.String r11 = "EEE dd-MMM-yy HH:mm:ss z"
            java.lang.String r12 = "EEE dd MMM yy HH:mm:ss z"
            java.lang.String r13 = "EEE,dd-MMM-yy HH:mm:ss z"
            java.lang.String r14 = "EEE,dd-MMM-yyyy HH:mm:ss z"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            defpackage.cc1.b = r0
            int r0 = r0.length
            java.text.DateFormat[] r0 = new java.text.DateFormat[r0]
            defpackage.cc1.c = r0
            return
    }

    public static final java.util.Date a(java.lang.String r10) {
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.text.ParsePosition r0 = new java.text.ParsePosition
            r2 = 0
            r0.<init>(r2)
            qm r3 = defpackage.cc1.a
            java.lang.Object r3 = r3.get()
            java.text.DateFormat r3 = (java.text.DateFormat) r3
            java.util.Date r3 = r3.parse(r10, r0)
            int r4 = r0.getIndex()
            int r5 = r10.length()
            if (r4 != r5) goto L25
            return r3
        L25:
            java.lang.String[] r3 = defpackage.cc1.b
            monitor-enter(r3)
            int r4 = r3.length     // Catch: java.lang.Throwable -> L45
            r5 = r2
        L2a:
            if (r5 >= r4) goto L59
            java.text.DateFormat[] r6 = defpackage.cc1.c     // Catch: java.lang.Throwable -> L45
            r7 = r6[r5]     // Catch: java.lang.Throwable -> L45
            if (r7 != 0) goto L47
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L45
            java.lang.String[] r8 = defpackage.cc1.b     // Catch: java.lang.Throwable -> L45
            r8 = r8[r5]     // Catch: java.lang.Throwable -> L45
            java.util.Locale r9 = java.util.Locale.US     // Catch: java.lang.Throwable -> L45
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L45
            java.util.TimeZone r8 = defpackage.az7.a     // Catch: java.lang.Throwable -> L45
            r7.setTimeZone(r8)     // Catch: java.lang.Throwable -> L45
            r6[r5] = r7     // Catch: java.lang.Throwable -> L45
            goto L47
        L45:
            r10 = move-exception
            goto L5b
        L47:
            r0.setIndex(r2)     // Catch: java.lang.Throwable -> L45
            java.util.Date r6 = r7.parse(r10, r0)     // Catch: java.lang.Throwable -> L45
            int r7 = r0.getIndex()     // Catch: java.lang.Throwable -> L45
            if (r7 == 0) goto L56
            monitor-exit(r3)
            return r6
        L56:
            int r5 = r5 + 1
            goto L2a
        L59:
            monitor-exit(r3)
            return r1
        L5b:
            monitor-exit(r3)
            throw r10
    }
}
