package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w31  reason: default package */
/* loaded from: classes.dex */
public class w31 implements defpackage.z31, defpackage.a15, defpackage.ye4, defpackage.ou6, defpackage.i71, defpackage.vr0, org.slf4j.ILoggerFactory, defpackage.x93, defpackage.jy4, defpackage.t35, defpackage.eh6, defpackage.k61 {
    public static defpackage.w31 B;
    public final /* synthetic */ int A;

    public /* synthetic */ w31(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public w31(defpackage.pj r1) {
            r0 = this;
            r1 = 28
            r0.A = r1
            r0.<init>()
            return
    }

    public static final java.lang.String l(defpackage.da0 r19, defpackage.da0[] r20, int r21) {
            r0 = r19
            r1 = r20
            da0 r2 = defpackage.f65.b
            int r2 = r0.d()
            r4 = 0
        Lb:
            if (r4 >= r2) goto La4
            int r5 = r4 + r2
            int r5 = r5 / 2
        L11:
            r6 = 10
            r7 = -1
            if (r5 <= r7) goto L1f
            byte r8 = r0.i(r5)
            if (r8 == r6) goto L1f
            int r5 = r5 + (-1)
            goto L11
        L1f:
            int r8 = r5 + 1
            r9 = 1
            r10 = r9
        L23:
            int r11 = r8 + r10
            byte r12 = r0.i(r11)
            if (r12 == r6) goto L2e
            int r10 = r10 + 1
            goto L23
        L2e:
            int r6 = r11 - r8
            r12 = r21
            r10 = 0
            r13 = 0
            r14 = 0
        L35:
            if (r10 == 0) goto L3b
            r10 = 46
            r15 = 0
            goto L4a
        L3b:
            r15 = r1[r12]
            byte r15 = r15.i(r13)
            byte[] r16 = defpackage.yy7.a
            r15 = r15 & 255(0xff, float:3.57E-43)
            r18 = r15
            r15 = r10
            r10 = r18
        L4a:
            int r3 = r8 + r14
            byte r3 = r0.i(r3)
            byte[] r17 = defpackage.yy7.a
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r10 = r10 - r3
            if (r10 != 0) goto L71
            int r14 = r14 + 1
            int r13 = r13 + 1
            if (r14 == r6) goto L71
            r3 = r1[r12]
            int r3 = r3.d()
            if (r3 != r13) goto L6f
            int r3 = r1.length
            int r3 = r3 - r9
            if (r12 != r3) goto L6a
            goto L71
        L6a:
            int r12 = r12 + 1
            r13 = r7
            r10 = r9
            goto L35
        L6f:
            r10 = r15
            goto L35
        L71:
            if (r10 >= 0) goto L75
        L73:
            r2 = r5
            goto Lb
        L75:
            if (r10 <= 0) goto L7a
        L77:
            int r4 = r11 + 1
            goto Lb
        L7a:
            int r3 = r6 - r14
            r7 = r1[r12]
            int r7 = r7.d()
            int r7 = r7 - r13
            int r12 = r12 + 1
            int r9 = r1.length
        L86:
            if (r12 >= r9) goto L92
            r10 = r1[r12]
            int r10 = r10.d()
            int r7 = r7 + r10
            int r12 = r12 + 1
            goto L86
        L92:
            if (r7 >= r3) goto L95
            goto L73
        L95:
            if (r7 <= r3) goto L98
            goto L77
        L98:
            int r6 = r6 + r8
            da0 r0 = r0.o(r8, r6)
            java.nio.charset.Charset r1 = defpackage.qm0.a
            java.lang.String r0 = r0.n(r1)
            return r0
        La4:
            r0 = 0
            return r0
    }

    public static defpackage.jv6 m(defpackage.hv6 r1, defpackage.fv6 r2, defpackage.tr6 r3) {
            r1.getClass()
            r2.getClass()
            r3.getClass()
            jv6 r0 = new jv6
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static /* synthetic */ defpackage.jv6 n(defpackage.hv6 r1, defpackage.fv6 r2) {
            tr6 r0 = defpackage.jv6.e
            jv6 r1 = m(r1, r2, r0)
            return r1
    }

    public static android.graphics.Typeface o(java.lang.String r2, defpackage.oj2 r3, int r4) {
            if (r4 != 0) goto L15
            oj2 r0 = defpackage.oj2.Y
            boolean r0 = defpackage.nb3.k(r3, r0)
            if (r0 == 0) goto L15
            if (r2 == 0) goto L12
            int r0 = r2.length()
            if (r0 != 0) goto L15
        L12:
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            return r2
        L15:
            r0 = 0
            if (r2 != 0) goto L1b
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            goto L1f
        L1b:
            android.graphics.Typeface r2 = android.graphics.Typeface.create(r2, r0)
        L1f:
            int r3 = r3.A
            r1 = 1
            if (r4 != r1) goto L25
            r0 = r1
        L25:
            android.graphics.Typeface r2 = defpackage.yr1.f(r2, r3, r0)
            return r2
    }

    public static defpackage.lt4 p(java.lang.String r1) {
            r1.getClass()
            da0 r0 = defpackage.f.a
            k80 r0 = new k80
            r0.<init>()
            r0.t0(r1)
            r1 = 0
            lt4 r1 = defpackage.f.d(r0, r1)
            return r1
    }

    public static defpackage.lt4 q(java.io.File r1) {
            java.lang.String r0 = defpackage.lt4.B
            java.lang.String r1 = r1.toString()
            r1.getClass()
            lt4 r1 = p(r1)
            return r1
    }

    public static boolean s(int r1, boolean r2) {
            if (r2 == 0) goto L18
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r0 > r2) goto L18
            r0 = 33
            if (r2 >= r0) goto L18
            r2 = 1
            if (r1 != r2) goto L10
            goto L17
        L10:
            r0 = 2
            if (r1 != r0) goto L14
            goto L17
        L14:
            r0 = 6
            if (r1 != r0) goto L18
        L17:
            return r2
        L18:
            r1 = 0
            return r1
    }

    public static boolean t(int r5, int r6, long r7, boolean r9, boolean r10, defpackage.sq1 r11) {
            boolean r10 = s(r5, r10)
            java.lang.String r0 = "CXCP"
            if (r10 == 0) goto Ld
            java.lang.String r1 = "shouldRetry: Active resume mode is activated"
            android.util.Log.d(r0, r1)
        Ld:
            r1 = -1
            if (r10 != 0) goto L23
            r2 = 10000000000(0x2540be400, double:4.9406564584E-314)
            if (r11 != 0) goto L18
            goto L33
        L18:
            long r10 = r11.a
            int r4 = defpackage.sq1.a(r2, r10)
            if (r4 != r1) goto L21
            goto L33
        L21:
            r2 = r10
            goto L33
        L23:
            r2 = 1800000000000(0x1a3185c5000, double:8.89318162514E-312)
            if (r11 != 0) goto L2b
            goto L33
        L2b:
            long r10 = r11.a
            int r4 = defpackage.sq1.a(r2, r10)
            if (r4 != r1) goto L21
        L33:
            int r7 = defpackage.sq1.a(r7, r2)
            r8 = 0
            if (r7 <= 0) goto L3b
            goto L7b
        L3b:
            r7 = 1
            if (r5 != 0) goto L41
            if (r6 > r7) goto L7b
            goto L7a
        L41:
            if (r5 != r7) goto L4c
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r5 >= r9) goto L7a
            if (r6 > r7) goto L7b
            goto L7a
        L4c:
            r10 = 2
            if (r5 != r10) goto L50
            goto L7a
        L50:
            r10 = 3
            if (r5 != r10) goto L58
            if (r9 == 0) goto L7a
            if (r6 > r7) goto L7b
            goto L7a
        L58:
            r9 = 4
            if (r5 != r9) goto L5c
            goto L7a
        L5c:
            r9 = 5
            if (r5 != r9) goto L60
            goto L7a
        L60:
            r9 = 6
            if (r5 != r9) goto L64
            goto L7a
        L64:
            r9 = 7
            if (r5 != r9) goto L68
            goto L7a
        L68:
            r9 = 8
            if (r5 != r9) goto L6f
            if (r6 > r7) goto L7b
            goto L7a
        L6f:
            r9 = 10
            if (r5 != r9) goto L74
            goto L7b
        L74:
            r9 = 11
            if (r5 != r9) goto L7c
            if (r6 > r7) goto L7b
        L7a:
            return r7
        L7b:
            return r8
        L7c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unexpected CameraError: "
            r5.<init>(r6)
            w31 r6 = defpackage.mp5.i
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
            return r8
    }

    public static defpackage.jv6 u(int r5, android.util.Size r6, defpackage.dz r7, int r8, defpackage.gv6 r9, defpackage.tr6 r10) {
            java.util.LinkedHashMap r0 = r7.f
            r6.getClass()
            r9.getClass()
            r10.getClass()
            java.util.LinkedHashMap r1 = defpackage.jv6.h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.Object r1 = r1.get(r2)
            hv6 r1 = (defpackage.hv6) r1
            if (r1 != 0) goto L1b
            hv6 r1 = defpackage.hv6.PRIV
        L1b:
            fv6 r2 = defpackage.fv6.NOT_SUPPORT
            android.util.Size r3 = defpackage.mj6.a
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            int r4 = r4 * r3
            r3 = 1
            if (r8 != r3) goto L57
            java.util.LinkedHashMap r6 = r7.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r8)
            android.util.Size r6 = (android.util.Size) r6
            int r6 = defpackage.mj6.a(r6)
            if (r4 > r6) goto L41
            fv6 r2 = defpackage.fv6.S720P_16_9
            goto Lec
        L41:
            java.util.LinkedHashMap r6 = r7.d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r6.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            int r5 = defpackage.mj6.a(r5)
            if (r4 > r5) goto Lec
            fv6 r2 = defpackage.fv6.S1440P_4_3
            goto Lec
        L57:
            gv6 r3 = defpackage.gv6.FEATURE_COMBINATION_TABLE
            if (r9 != r3) goto L89
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r0.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            fv6[] r7 = defpackage.jv6.f
            int r8 = r7.length
            r9 = 0
        L69:
            if (r9 >= r8) goto L7c
            r0 = r7[r9]
            android.util.Size r3 = r0.getRelatedFixedSize()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L79
            r2 = r0
            goto L7c
        L79:
            int r9 = r9 + 1
            goto L69
        L7c:
            fv6 r7 = defpackage.fv6.NOT_SUPPORT
            if (r2 != r7) goto Lec
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto Lec
            fv6 r2 = defpackage.fv6.MAXIMUM
            goto Lec
        L89:
            android.util.Size r6 = r7.a
            int r6 = defpackage.mj6.a(r6)
            if (r4 > r6) goto L94
            fv6 r2 = defpackage.fv6.VGA
            goto Lec
        L94:
            android.util.Size r6 = r7.c
            int r9 = r6.getWidth()
            int r6 = r6.getHeight()
            int r6 = r6 * r9
            if (r4 > r6) goto La4
            fv6 r2 = defpackage.fv6.PREVIEW
            goto Lec
        La4:
            android.util.Size r6 = r7.e
            int r9 = r6.getWidth()
            int r6 = r6.getHeight()
            int r6 = r6 * r9
            if (r4 > r6) goto Lb4
            fv6 r2 = defpackage.fv6.RECORD
            goto Lec
        Lb4:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r0.get(r6)
            android.util.Size r6 = (android.util.Size) r6
            java.util.LinkedHashMap r7 = r7.i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r7.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            if (r6 == 0) goto Ld7
            int r7 = r6.getWidth()
            int r6 = r6.getHeight()
            int r6 = r6 * r7
            if (r4 > r6) goto Ldd
        Ld7:
            r6 = 2
            if (r8 == r6) goto Ldd
            fv6 r2 = defpackage.fv6.MAXIMUM
            goto Lec
        Ldd:
            if (r5 == 0) goto Lec
            int r6 = r5.getWidth()
            int r5 = r5.getHeight()
            int r5 = r5 * r6
            if (r4 > r5) goto Lec
            fv6 r2 = defpackage.fv6.ULTRA_MAXIMUM
        Lec:
            jv6 r5 = m(r1, r2, r10)
            return r5
    }

    @Override // defpackage.ye4
    public boolean a() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.vr0
    public defpackage.s83 b() {
            r2 = this;
            s83 r2 = defpackage.s83.L
            long r0 = java.lang.System.currentTimeMillis()
            s83 r2 = defpackage.bl2.z(r0)
            return r2
    }

    @Override // defpackage.z31
    public long c(long r3, long r5) {
            r2 = this;
            float r2 = defpackage.u24.d(r3, r5)
            int r3 = java.lang.Float.floatToRawIntBits(r2)
            long r3 = (long) r3
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r5 = (long) r2
            r2 = 32
            long r2 = r3 << r2
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r5 & r0
            long r2 = r2 | r4
            int r4 = defpackage.a66.a
            return r2
    }

    @Override // defpackage.eh6
    public defpackage.le2 d(defpackage.yt6 r2) {
            r1 = this;
            ch6 r1 = defpackage.ch6.START
            g21 r2 = new g21
            r0 = 4
            r2.<init>(r1, r0)
            return r2
    }

    @Override // defpackage.jy4
    public android.graphics.Typeface e(int r1, defpackage.oj2 r2) {
            r0 = this;
            r0 = 0
            android.graphics.Typeface r0 = o(r0, r2, r1)
            return r0
    }

    @Override // defpackage.ou6
    public defpackage.pu6 f(defpackage.nu6 r7) {
            r6 = this;
            bn2 r0 = new bn2
            android.content.Context r1 = r7.a
            java.lang.String r2 = r7.b
            zb r3 = r7.c
            boolean r4 = r7.d
            boolean r5 = r7.e
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // org.slf4j.ILoggerFactory
    public defpackage.ry3 g(java.lang.String r1) {
            r0 = this;
            mb4 r0 = defpackage.mb4.A
            return r0
    }

    @Override // defpackage.t35
    public void h() {
            r0 = this;
            return
    }

    @Override // defpackage.a15
    public java.lang.CharSequence i(androidx.preference.Preference r1) {
            r0 = this;
            androidx.preference.EditTextPreference r1 = (androidx.preference.EditTextPreference) r1
            java.lang.String r0 = r1.Z
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            android.content.Context r0 = r1.getContext()
            r1 = 2131952302(0x7f1302ae, float:1.9541043E38)
            java.lang.String r0 = r0.getString(r1)
            return r0
        L16:
            java.lang.String r0 = r1.Z
            return r0
    }

    @Override // defpackage.t35
    public void j(int r1, java.lang.Object r2) {
            r0 = this;
            return
    }

    @Override // defpackage.jy4
    public android.graphics.Typeface k(defpackage.sr2 r1, defpackage.oj2 r2, int r3) {
            r0 = this;
            java.lang.String r0 = r1.R
            android.graphics.Typeface r0 = o(r0, r2, r3)
            return r0
    }

    public android.content.pm.Signature[] r(android.content.pm.PackageManager r1, java.lang.String r2) {
            r0 = this;
            r0 = 64
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r2, r0)
            android.content.pm.Signature[] r0 = r0.signatures
            return r0
    }

    @Override // defpackage.ye4
    public void shutdown() {
            r0 = this;
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 25: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.String r1 = "SharingStarted.Eagerly"
            return r1
    }
}
