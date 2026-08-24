package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: es4  reason: default package */
/* loaded from: classes.dex */
public abstract class es4 {
    public static final long a = 0;
    public static final /* synthetic */ int b = 0;

    static {
            y47[] r0 = defpackage.x47.b
            long r0 = defpackage.x47.c
            defpackage.es4.a = r0
            return
    }

    public static final defpackage.ds4 a(defpackage.ds4 r17, int r18, int r19, long r20, defpackage.g37 r22, defpackage.ux4 r23, defpackage.xu3 r24, int r25, int r26, defpackage.i47 r27) {
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = 0
            r13 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            if (r1 != 0) goto L1e
            goto L22
        L1e:
            int r15 = r0.a
            if (r1 != r15) goto L74
        L22:
            y47[] r15 = defpackage.x47.b
            long r15 = r3 & r13
            int r15 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r15 != 0) goto L2c
            r15 = r11
            goto L35
        L2c:
            r15 = r11
            long r11 = r0.c
            boolean r11 = defpackage.x47.a(r3, r11)
            if (r11 == 0) goto L75
        L35:
            if (r5 == 0) goto L3f
            g37 r11 = r0.d
            boolean r11 = r5.equals(r11)
            if (r11 == 0) goto L75
        L3f:
            if (r2 != 0) goto L42
            goto L46
        L42:
            int r11 = r0.b
            if (r2 != r11) goto L75
        L46:
            if (r6 == 0) goto L50
            ux4 r11 = r0.e
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L75
        L50:
            if (r7 == 0) goto L5a
            xu3 r11 = r0.f
            boolean r11 = r7.equals(r11)
            if (r11 == 0) goto L75
        L5a:
            if (r8 != 0) goto L5d
            goto L61
        L5d:
            int r11 = r0.g
            if (r8 != r11) goto L75
        L61:
            if (r9 != 0) goto L64
            goto L68
        L64:
            int r11 = r0.h
            if (r9 != r11) goto L75
        L68:
            if (r10 == 0) goto L73
            i47 r11 = r0.i
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L73
            goto L75
        L73:
            return r0
        L74:
            r15 = r11
        L75:
            y47[] r11 = defpackage.x47.b
            long r11 = r3 & r13
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 != 0) goto L7f
            long r3 = r0.c
        L7f:
            if (r5 != 0) goto L83
            g37 r5 = r0.d
        L83:
            if (r1 != 0) goto L87
            int r1 = r0.a
        L87:
            if (r2 != 0) goto L8b
            int r2 = r0.b
        L8b:
            ux4 r11 = r0.e
            if (r11 != 0) goto L90
            goto L93
        L90:
            if (r6 != 0) goto L93
            r6 = r11
        L93:
            if (r7 != 0) goto L97
            xu3 r7 = r0.f
        L97:
            if (r8 != 0) goto L9b
            int r8 = r0.g
        L9b:
            if (r9 != 0) goto L9f
            int r9 = r0.h
        L9f:
            if (r10 != 0) goto La4
            i47 r0 = r0.i
            r10 = r0
        La4:
            ds4 r0 = new ds4
            r17 = r0
            r18 = r1
            r19 = r2
            r20 = r3
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r10
            r17.<init>(r18, r19, r20, r22, r23, r24, r25, r26, r27)
            return r0
    }
}
