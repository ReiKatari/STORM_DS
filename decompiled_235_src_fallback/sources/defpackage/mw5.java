package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mw5  reason: default package */
/* loaded from: classes.dex */
public final class mw5 {
    @defpackage.gc6("name")
    private final java.lang.String a;
    @defpackage.gc6("developerName")
    private final java.lang.String b;
    @defpackage.gc6("fileName")
    private final java.lang.String c;
    @defpackage.gc6("uri")
    private final java.lang.String d;
    @defpackage.gc6("parentTreeUri")
    private final java.lang.String e;
    @defpackage.gc6("config")
    private defpackage.mt5 f;
    @defpackage.gc6("lastPlayed")
    private java.util.Date g;
    @defpackage.gc6("isDsiWareTitle")
    private final boolean h;
    @defpackage.gc6("retroAchievementsHash")
    private final java.lang.String i;
    @defpackage.gc6("totalPlayTime")
    private final long j;
    @defpackage.gc6("isFavorite")
    private final boolean k;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: mw5$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static defpackage.mw5 a(defpackage.pq5 r13) {
                r13.getClass()
                mw5 r0 = new mw5
                java.lang.String r1 = r13.a
                java.lang.String r2 = r13.b
                java.lang.String r3 = r13.c
                android.net.Uri r4 = r13.d
                java.lang.String r4 = r4.toString()
                r4.getClass()
                android.net.Uri r5 = r13.e
                if (r5 == 0) goto L1d
                java.lang.String r5 = r5.toString()
                goto L1e
            L1d:
                r5 = 0
            L1e:
                jt5 r6 = r13.f
                mt5 r6 = defpackage.mt5.a.a(r6)
                java.util.Date r7 = r13.g
                boolean r8 = r13.h
                java.lang.String r9 = r13.i
                long r10 = r13.j
                long r10 = defpackage.oq1.e(r10)
                boolean r12 = r13.k
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
                return r0
        }
    }

    public mw5(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, defpackage.mt5 r6, java.util.Date r7, boolean r8, java.lang.String r9, long r10, boolean r12) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r9.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r12
            return
    }

    public static defpackage.mw5 a(defpackage.mw5 r13, defpackage.mt5 r14) {
            java.lang.String r1 = r13.a
            java.lang.String r2 = r13.b
            java.lang.String r3 = r13.c
            java.lang.String r4 = r13.d
            java.lang.String r5 = r13.e
            java.util.Date r7 = r13.g
            boolean r8 = r13.h
            java.lang.String r9 = r13.i
            long r10 = r13.j
            boolean r12 = r13.k
            r13.getClass()
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r9.getClass()
            mw5 r0 = new mw5
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return r0
    }

    public final defpackage.mt5 b() {
            r0 = this;
            mt5 r0 = r0.f
            return r0
    }

    public final boolean c() {
            r0 = this;
            boolean r0 = r0.h
            return r0
    }

    public final defpackage.pq5 d() {
            r18 = this;
            r0 = r18
            pq5 r1 = new pq5
            r2 = r1
            java.lang.String r1 = r0.a
            r3 = r2
            java.lang.String r2 = r0.b
            r4 = r3
            java.lang.String r3 = r0.c
            java.lang.String r5 = r0.d
            android.net.Uri r5 = android.net.Uri.parse(r5)
            java.lang.String r6 = r0.e
            if (r6 == 0) goto L1c
            android.net.Uri r6 = android.net.Uri.parse(r6)
            goto L1d
        L1c:
            r6 = 0
        L1d:
            mt5 r7 = r0.f
            jt5 r7 = r7.b()
            r8 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            java.util.Date r7 = r0.g
            r9 = r8
            boolean r8 = r0.h
            r10 = r9
            java.lang.String r9 = r0.i
            jd1 r11 = defpackage.oq1.B
            long r11 = r0.j
            uq1 r13 = defpackage.uq1.MILLISECONDS
            long r11 = defpackage.n16.M(r11, r13)
            boolean r0 = r0.k
            r14 = 0
            r15 = 6144(0x1800, float:8.61E-42)
            r13 = 0
            r16 = r11
            r12 = r0
            r0 = r10
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.mw5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mw5 r8 = (defpackage.mw5) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.c
            java.lang.String r3 = r8.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r7.e
            java.lang.String r3 = r8.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            mt5 r1 = r7.f
            mt5 r3 = r8.f
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            java.util.Date r1 = r7.g
            java.util.Date r3 = r8.g
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L59
            return r2
        L59:
            boolean r1 = r7.h
            boolean r3 = r8.h
            if (r1 == r3) goto L60
            return r2
        L60:
            java.lang.String r1 = r7.i
            java.lang.String r3 = r8.i
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L6b
            return r2
        L6b:
            long r3 = r7.j
            long r5 = r8.j
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L74
            return r2
        L74:
            boolean r7 = r7.k
            boolean r8 = r8.k
            if (r7 == r8) goto L7b
            return r2
        L7b:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.d
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.e
            r3 = 0
            if (r2 != 0) goto L22
            r2 = r3
            goto L26
        L22:
            int r2 = r2.hashCode()
        L26:
            int r0 = r0 + r2
            int r0 = r0 * r1
            mt5 r2 = r4.f
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.util.Date r0 = r4.g
            if (r0 != 0) goto L35
            goto L39
        L35:
            int r3 = r0.hashCode()
        L39:
            int r2 = r2 + r3
            int r2 = r2 * r1
            boolean r0 = r4.h
            int r0 = defpackage.xg6.e(r2, r0, r1)
            java.lang.String r2 = r4.i
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.j
            int r0 = defpackage.i61.c(r2, r0, r1)
            boolean r4 = r4.k
            int r4 = java.lang.Boolean.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r14 = this;
            java.lang.String r0 = r14.a
            java.lang.String r1 = r14.b
            java.lang.String r2 = r14.c
            java.lang.String r3 = r14.d
            java.lang.String r4 = r14.e
            mt5 r5 = r14.f
            java.util.Date r6 = r14.g
            boolean r7 = r14.h
            java.lang.String r8 = r14.i
            long r9 = r14.j
            boolean r14 = r14.k
            java.lang.String r11 = ", developerName="
            java.lang.String r12 = ", fileName="
            java.lang.String r13 = "RomDto(name="
            java.lang.StringBuilder r0 = defpackage.i61.u(r13, r0, r11, r1, r12)
            java.lang.String r1 = ", uri="
            java.lang.String r11 = ", parentTreeUri="
            defpackage.i61.B(r0, r2, r1, r3, r11)
            r0.append(r4)
            java.lang.String r1 = ", config="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", lastPlayed="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", isDsiWareTitle="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", retroAchievementsHash="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", totalPlayTime="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", isFavorite="
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = ")"
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            return r14
    }
}
