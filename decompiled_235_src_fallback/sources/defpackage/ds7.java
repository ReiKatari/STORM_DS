package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ds7  reason: default package */
/* loaded from: classes.dex */
public abstract class ds7 {
    public static defpackage.e33 a;

    public static final java.util.LinkedHashSet a(byte[] r7) {
            r7.getClass()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r7.length
            if (r1 != 0) goto Lc
            return r0
        Lc:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            int r2 = r7.readInt()     // Catch: java.lang.Throwable -> L37
            r3 = 0
        L1b:
            if (r3 >= r2) goto L39
            java.lang.String r4 = r7.readUTF()     // Catch: java.lang.Throwable -> L37
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L37
            boolean r5 = r7.readBoolean()     // Catch: java.lang.Throwable -> L37
            n21 r6 = new n21     // Catch: java.lang.Throwable -> L37
            r4.getClass()     // Catch: java.lang.Throwable -> L37
            r6.<init>(r5, r4)     // Catch: java.lang.Throwable -> L37
            r0.add(r6)     // Catch: java.lang.Throwable -> L37
            int r3 = r3 + 1
            goto L1b
        L37:
            r2 = move-exception
            goto L41
        L39:
            r7.close()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            goto L4a
        L3d:
            r7 = move-exception
            goto L4e
        L3f:
            r7 = move-exception
            goto L47
        L41:
            throw r2     // Catch: java.lang.Throwable -> L42
        L42:
            r3 = move-exception
            defpackage.ge7.t(r7, r2)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            throw r3     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
        L47:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L3d
        L4a:
            r1.close()
            return r0
        L4e:
            throw r7     // Catch: java.lang.Throwable -> L4f
        L4f:
            r0 = move-exception
            defpackage.ge7.t(r1, r7)
            throw r0
    }

    public static final defpackage.e33 b() {
            e33 r0 = defpackage.ds7.a
            if (r0 == 0) goto L5
            return r0
        L5:
            d33 r1 = new d33
            r9 = 0
            r11 = 96
            java.lang.String r2 = "Filled.Warning"
            r3 = 1103101952(0x41c00000, float:24.0)
            r4 = 1103101952(0x41c00000, float:24.0)
            r5 = 1103101952(0x41c00000, float:24.0)
            r6 = 1103101952(0x41c00000, float:24.0)
            r7 = 0
            r10 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11)
            int r0 = defpackage.el7.a
            cn6 r0 = new cn6
            long r2 = defpackage.kt0.b
            r0.<init>(r2)
            ww2 r2 = new ww2
            r3 = 1
            r4 = 0
            r2.<init>(r3, r4)
            r3 = 1065353216(0x3f800000, float:1.0)
            r5 = 1101529088(0x41a80000, float:21.0)
            r2.o(r3, r5)
            r6 = 1102053376(0x41b00000, float:22.0)
            r2.l(r6)
            r6 = 1094713344(0x41400000, float:12.0)
            r7 = 1073741824(0x40000000, float:2.0)
            r2.m(r6, r7)
            r2.m(r3, r5)
            r2.g()
            r3 = 1099956224(0x41900000, float:18.0)
            r5 = 1095761920(0x41500000, float:13.0)
            r2.o(r5, r3)
            r3 = -1073741824(0xffffffffc0000000, float:-2.0)
            r2.l(r3)
            r2.u(r3)
            r2.l(r7)
            r2.u(r7)
            r2.g()
            r6 = 1096810496(0x41600000, float:14.0)
            r2.o(r5, r6)
            r2.l(r3)
            r3 = -1065353216(0xffffffffc0800000, float:-4.0)
            r2.u(r3)
            r2.l(r7)
            r3 = 1082130432(0x40800000, float:4.0)
            r2.u(r3)
            r2.g()
            java.util.ArrayList r2 = r2.b
            defpackage.d33.a(r1, r2, r4, r0)
            e33 r0 = r1.b()
            defpackage.ds7.a = r0
            return r0
    }

    public static final defpackage.w10 c(int r2) {
            if (r2 == 0) goto L15
            r0 = 1
            if (r2 != r0) goto L8
            w10 r2 = defpackage.w10.LINEAR
            return r2
        L8:
            java.lang.String r0 = "Could not convert "
            java.lang.String r1 = " to BackoffPolicy"
            java.lang.String r2 = defpackage.lb1.k(r0, r2, r1)
            defpackage.i.h(r2)
            r2 = 0
            return r2
        L15:
            w10 r2 = defpackage.w10.EXPONENTIAL
            return r2
    }

    public static final defpackage.kf4 d(int r2) {
            if (r2 == 0) goto L33
            r0 = 1
            if (r2 == r0) goto L30
            r0 = 2
            if (r2 == r0) goto L2d
            r0 = 3
            if (r2 == r0) goto L2a
            r0 = 4
            if (r2 == r0) goto L27
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L1a
            r0 = 5
            if (r2 != r0) goto L1a
            kf4 r2 = defpackage.kf4.TEMPORARILY_UNMETERED
            return r2
        L1a:
            java.lang.String r0 = "Could not convert "
            java.lang.String r1 = " to NetworkType"
            java.lang.String r2 = defpackage.lb1.k(r0, r2, r1)
            defpackage.i.h(r2)
            r2 = 0
            return r2
        L27:
            kf4 r2 = defpackage.kf4.METERED
            return r2
        L2a:
            kf4 r2 = defpackage.kf4.NOT_ROAMING
            return r2
        L2d:
            kf4 r2 = defpackage.kf4.UNMETERED
            return r2
        L30:
            kf4 r2 = defpackage.kf4.CONNECTED
            return r2
        L33:
            kf4 r2 = defpackage.kf4.NOT_REQUIRED
            return r2
    }

    public static final defpackage.oo4 e(int r2) {
            if (r2 == 0) goto L15
            r0 = 1
            if (r2 != r0) goto L8
            oo4 r2 = defpackage.oo4.DROP_WORK_REQUEST
            return r2
        L8:
            java.lang.String r0 = "Could not convert "
            java.lang.String r1 = " to OutOfQuotaPolicy"
            java.lang.String r2 = defpackage.lb1.k(r0, r2, r1)
            defpackage.i.h(r2)
            r2 = 0
            return r2
        L15:
            oo4 r2 = defpackage.oo4.RUN_AS_NON_EXPEDITED_WORK_REQUEST
            return r2
    }

    public static final defpackage.iw7 f(int r2) {
            if (r2 == 0) goto L2d
            r0 = 1
            if (r2 == r0) goto L2a
            r0 = 2
            if (r2 == r0) goto L27
            r0 = 3
            if (r2 == r0) goto L24
            r0 = 4
            if (r2 == r0) goto L21
            r0 = 5
            if (r2 != r0) goto L14
            iw7 r2 = defpackage.iw7.CANCELLED
            return r2
        L14:
            java.lang.String r0 = "Could not convert "
            java.lang.String r1 = " to State"
            java.lang.String r2 = defpackage.lb1.k(r0, r2, r1)
            defpackage.i.h(r2)
            r2 = 0
            return r2
        L21:
            iw7 r2 = defpackage.iw7.BLOCKED
            return r2
        L24:
            iw7 r2 = defpackage.iw7.FAILED
            return r2
        L27:
            iw7 r2 = defpackage.iw7.SUCCEEDED
            return r2
        L2a:
            iw7 r2 = defpackage.iw7.RUNNING
            return r2
        L2d:
            iw7 r2 = defpackage.iw7.ENQUEUED
            return r2
    }

    public static final int g(defpackage.iw7 r1) {
            r1.getClass()
            int[] r0 = defpackage.gx7.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 0
            switch(r1) {
                case 1: goto L1d;
                case 2: goto L1b;
                case 3: goto L19;
                case 4: goto L17;
                case 5: goto L15;
                case 6: goto L13;
                default: goto Lf;
            }
        Lf:
            defpackage.i.d()
            return r0
        L13:
            r1 = 5
            return r1
        L15:
            r1 = 4
            return r1
        L17:
            r1 = 3
            return r1
        L19:
            r1 = 2
            return r1
        L1b:
            r1 = 1
            return r1
        L1d:
            return r0
    }

    public static final defpackage.af4 h(byte[] r6) {
            r6.getClass()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L56
            int r0 = r6.length
            if (r0 != 0) goto Ld
            goto L56
        Ld:
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r6)
            java.io.ObjectInputStream r6 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L48
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L48
            int r1 = r6.readInt()     // Catch: java.lang.Throwable -> L2a
            int[] r2 = new int[r1]     // Catch: java.lang.Throwable -> L2a
            r3 = 0
            r4 = r3
        L1f:
            if (r4 >= r1) goto L2c
            int r5 = r6.readInt()     // Catch: java.lang.Throwable -> L2a
            r2[r4] = r5     // Catch: java.lang.Throwable -> L2a
            int r4 = r4 + 1
            goto L1f
        L2a:
            r1 = move-exception
            goto L4a
        L2c:
            int r1 = r6.readInt()     // Catch: java.lang.Throwable -> L2a
            int[] r4 = new int[r1]     // Catch: java.lang.Throwable -> L2a
        L32:
            if (r3 >= r1) goto L3d
            int r5 = r6.readInt()     // Catch: java.lang.Throwable -> L2a
            r4[r3] = r5     // Catch: java.lang.Throwable -> L2a
            int r3 = r3 + 1
            goto L32
        L3d:
            af4 r1 = defpackage.kn2.A(r4, r2)     // Catch: java.lang.Throwable -> L2a
            r6.close()     // Catch: java.lang.Throwable -> L48
            r0.close()
            return r1
        L48:
            r6 = move-exception
            goto L50
        L4a:
            throw r1     // Catch: java.lang.Throwable -> L4b
        L4b:
            r2 = move-exception
            defpackage.ge7.t(r6, r1)     // Catch: java.lang.Throwable -> L48
            throw r2     // Catch: java.lang.Throwable -> L48
        L50:
            throw r6     // Catch: java.lang.Throwable -> L51
        L51:
            r1 = move-exception
            defpackage.ge7.t(r0, r6)
            throw r1
        L56:
            af4 r6 = new af4
            r0 = 0
            r6.<init>(r0)
            return r6
    }
}
