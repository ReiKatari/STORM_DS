package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nd1  reason: default package */
/* loaded from: classes.dex */
public final class nd1 extends defpackage.yc7 {
    public static final defpackage.kd1 c = null;
    public final defpackage.md1 a;
    public final java.util.ArrayList b;

    static {
            kd1 r0 = new kd1
            r0.<init>()
            defpackage.nd1.c = r0
            return
    }

    public nd1(defpackage.md1 r7, int r8, int r9) {
            r6 = this;
            r6.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.b = r0
            java.util.Objects.requireNonNull(r7)
            r6.a = r7
            java.util.Locale r6 = java.util.Locale.US
            java.text.DateFormat r7 = java.text.DateFormat.getDateTimeInstance(r8, r9, r6)
            r0.add(r7)
            java.util.Locale r7 = java.util.Locale.getDefault()
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L29
            java.text.DateFormat r7 = java.text.DateFormat.getDateTimeInstance(r8, r9)
            r0.add(r7)
        L29:
            int r7 = defpackage.qc3.a
            r1 = 9
            if (r7 < r1) goto L84
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r1 = 0
            java.lang.String r2 = "Unknown DateFormat style: "
            r3 = 3
            r4 = 2
            r5 = 1
            if (r8 == 0) goto L53
            if (r8 == r5) goto L50
            if (r8 == r4) goto L4d
            if (r8 != r3) goto L45
            java.lang.String r8 = "M/d/yy"
            goto L55
        L45:
            java.lang.String r6 = defpackage.lb1.g(r8, r2)
            defpackage.i.h(r6)
            throw r1
        L4d:
            java.lang.String r8 = "MMM d, yyyy"
            goto L55
        L50:
            java.lang.String r8 = "MMMM d, yyyy"
            goto L55
        L53:
            java.lang.String r8 = "EEEE, MMMM d, yyyy"
        L55:
            r7.append(r8)
            java.lang.String r8 = " "
            r7.append(r8)
            if (r9 == 0) goto L73
            if (r9 == r5) goto L73
            if (r9 == r4) goto L70
            if (r9 != r3) goto L68
            java.lang.String r8 = "h:mm a"
            goto L75
        L68:
            java.lang.String r6 = defpackage.lb1.g(r9, r2)
            defpackage.i.h(r6)
            throw r1
        L70:
            java.lang.String r8 = "h:mm:ss a"
            goto L75
        L73:
            java.lang.String r8 = "h:mm:ss a z"
        L75:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat
            r8.<init>(r7, r6)
            r0.add(r8)
        L84:
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r9) {
            r8 = this;
            jf3 r0 = r9.n0()
            jf3 r1 = defpackage.jf3.NULL
            if (r0 != r1) goto Ld
            r9.j0()
            r8 = 0
            return r8
        Ld:
            java.lang.String r0 = r9.l0()
            java.util.ArrayList r1 = r8.b
            monitor-enter(r1)
            java.util.ArrayList r2 = r8.b     // Catch: java.lang.Throwable -> L33
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L33
            r4 = 0
            r5 = r4
        L1c:
            if (r5 >= r3) goto L3e
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Throwable -> L33
            int r5 = r5 + 1
            java.text.DateFormat r6 = (java.text.DateFormat) r6     // Catch: java.lang.Throwable -> L33
            java.util.TimeZone r7 = r6.getTimeZone()     // Catch: java.lang.Throwable -> L33
            java.util.Date r9 = r6.parse(r0)     // Catch: java.lang.Throwable -> L35 java.text.ParseException -> L3a
            r6.setTimeZone(r7)     // Catch: java.lang.Throwable -> L33
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            goto L48
        L33:
            r8 = move-exception
            goto L69
        L35:
            r8 = move-exception
            r6.setTimeZone(r7)     // Catch: java.lang.Throwable -> L33
            throw r8     // Catch: java.lang.Throwable -> L33
        L3a:
            r6.setTimeZone(r7)     // Catch: java.lang.Throwable -> L33
            goto L1c
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L4f
            r1.<init>(r4)     // Catch: java.text.ParseException -> L4f
            java.util.Date r9 = defpackage.e13.b(r0, r1)     // Catch: java.text.ParseException -> L4f
        L48:
            md1 r8 = r8.a
            java.util.Date r8 = r8.a(r9)
            return r8
        L4f:
            r8 = move-exception
            ne3 r1 = new ne3
            java.lang.String r2 = "Failed parsing '"
            java.lang.String r3 = "' as Date; at path "
            java.lang.StringBuilder r0 = defpackage.i61.t(r2, r0, r3)
            java.lang.String r9 = r9.D()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r1.<init>(r9, r8)
            throw r1
        L69:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L33
            throw r8
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r3, java.lang.Object r4) {
            r2 = this;
            java.util.Date r4 = (java.util.Date) r4
            if (r4 != 0) goto L8
            r3.A()
            return
        L8:
            java.util.ArrayList r0 = r2.b
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.text.DateFormat r0 = (java.text.DateFormat) r0
            java.util.ArrayList r2 = r2.b
            monitor-enter(r2)
            java.lang.String r4 = r0.format(r4)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            r3.c0(r4)
            return
        L1d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.util.ArrayList r3 = r3.b
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            java.text.DateFormat r3 = (java.text.DateFormat) r3
            boolean r0 = r3 instanceof java.text.SimpleDateFormat
            r1 = 41
            java.lang.String r2 = "DefaultDateTypeAdapter("
            if (r0 == 0) goto L27
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.text.SimpleDateFormat r3 = (java.text.SimpleDateFormat) r3
            java.lang.String r3 = r3.toPattern()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
        L27:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r0.append(r3)
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
