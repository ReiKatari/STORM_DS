package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ko6  reason: default package */
/* loaded from: classes.dex */
public final class ko6 extends defpackage.yc7 {
    public static final defpackage.ko6.a b = null;
    public final java.text.SimpleDateFormat a;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ko6$a */
    /* loaded from: classes.dex */
    public class a implements defpackage.zc7 {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // defpackage.zc7
        public final defpackage.yc7 a(defpackage.su2 r1, defpackage.ie7 r2) {
                r0 = this;
                java.lang.Class r0 = r2.a
                java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
                if (r0 != r1) goto Ld
                ko6 r0 = new ko6
                r1 = 0
                r0.<init>(r1)
                return r0
            Ld:
                r0 = 0
                return r0
        }
    }

    static {
            ko6$a r0 = new ko6$a
            r0.<init>()
            defpackage.ko6.b = r0
            return
    }

    private ko6() {
            r2 = this;
            r2.<init>()
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "MMM d, yyyy"
            r0.<init>(r1)
            r2.a = r0
            return
    }

    public /* synthetic */ ko6(int r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r8) {
            r7 = this;
            java.lang.String r0 = "Failed parsing '"
            jf3 r1 = r8.n0()
            jf3 r2 = defpackage.jf3.NULL
            if (r1 != r2) goto Lf
            r8.j0()
            r7 = 0
            return r7
        Lf:
            java.lang.String r1 = r8.l0()
            monitor-enter(r7)
            java.text.SimpleDateFormat r2 = r7.a     // Catch: java.lang.Throwable -> L30
            java.util.TimeZone r2 = r2.getTimeZone()     // Catch: java.lang.Throwable -> L30
            java.text.SimpleDateFormat r3 = r7.a     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            java.util.Date r3 = r3.parse(r1)     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            java.sql.Date r4 = new java.sql.Date     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            long r5 = r3.getTime()     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32 java.text.ParseException -> L34
            java.text.SimpleDateFormat r8 = r7.a     // Catch: java.lang.Throwable -> L30
            r8.setTimeZone(r2)     // Catch: java.lang.Throwable -> L30
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L30
            return r4
        L30:
            r8 = move-exception
            goto L59
        L32:
            r8 = move-exception
            goto L53
        L34:
            r3 = move-exception
            ne3 r4 = new ne3     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L32
            r5.append(r1)     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "' as SQL Date; at path "
            r5.append(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.String r8 = r8.D()     // Catch: java.lang.Throwable -> L32
            r5.append(r8)     // Catch: java.lang.Throwable -> L32
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> L32
            r4.<init>(r8, r3)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L53:
            java.text.SimpleDateFormat r0 = r7.a     // Catch: java.lang.Throwable -> L30
            r0.setTimeZone(r2)     // Catch: java.lang.Throwable -> L30
            throw r8     // Catch: java.lang.Throwable -> L30
        L59:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L30
            throw r8
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r2, java.lang.Object r3) {
            r1 = this;
            java.sql.Date r3 = (java.sql.Date) r3
            if (r3 != 0) goto L8
            r2.A()
            return
        L8:
            monitor-enter(r1)
            java.text.SimpleDateFormat r0 = r1.a     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r0.format(r3)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            r2.c0(r3)
            return
        L14:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r2
    }
}
