package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ot2  reason: default package */
/* loaded from: classes.dex */
public final class ot2 {
    public final defpackage.xw a;

    public ot2() {
            r11 = this;
            r11.<init>()
            np6 r0 = new np6
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            xw r0 = defpackage.g04.u(r0)
            r11.a = r0
            return
    }

    public static void b(defpackage.ot2 r18, defpackage.oa r19, defpackage.qb r20, defpackage.xz r21, defpackage.pd2 r22, java.util.List r23, java.util.List r24, java.util.List r25, java.lang.Boolean r26, java.lang.Boolean r27, java.lang.Boolean r28, int r29) {
            r0 = r29
            r1 = r0 & 1
            if (r1 == 0) goto L8
            r1 = 0
            goto La
        L8:
            r1 = r19
        La:
            r3 = r0 & 2
            if (r3 == 0) goto L10
            r3 = 0
            goto L12
        L10:
            r3 = r20
        L12:
            r4 = r0 & 4
            if (r4 == 0) goto L18
            r4 = 0
            goto L1a
        L18:
            r4 = r21
        L1a:
            r5 = r0 & 8
            if (r5 == 0) goto L20
            r5 = 0
            goto L22
        L20:
            r5 = r22
        L22:
            r6 = r0 & 16
            if (r6 == 0) goto L28
            r6 = 0
            goto L2a
        L28:
            r6 = r23
        L2a:
            r7 = r0 & 32
            if (r7 == 0) goto L30
            r7 = 0
            goto L32
        L30:
            r7 = r24
        L32:
            r8 = r0 & 64
            if (r8 == 0) goto L38
            r8 = 0
            goto L3a
        L38:
            r8 = r25
        L3a:
            r9 = r0 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L40
            r9 = 0
            goto L42
        L40:
            r9 = r26
        L42:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L48
            r10 = 0
            goto L4a
        L48:
            r10 = r27
        L4a:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L52
            r0 = 0
        L4f:
            r11 = r18
            goto L55
        L52:
            r0 = r28
            goto L4f
        L55:
            xw r11 = r11.a
        L57:
            java.lang.Object r12 = r11.a
            r13 = r12
            np6 r13 = (defpackage.np6) r13
            if (r1 != 0) goto L61
            oa r14 = r13.a
            goto L62
        L61:
            r14 = r1
        L62:
            if (r3 != 0) goto L67
            qb r15 = r13.b
            goto L68
        L67:
            r15 = r3
        L68:
            if (r4 != 0) goto L6d
            xz r2 = r13.c
            goto L6e
        L6d:
            r2 = r4
        L6e:
            r29 = r0
            if (r5 != 0) goto L75
            pd2 r0 = r13.d
            goto L76
        L75:
            r0 = r5
        L76:
            if (r6 == 0) goto L85
            boolean r16 = r6.isEmpty()
            if (r16 == 0) goto L81
            r16 = 0
            goto L83
        L81:
            r16 = r6
        L83:
            if (r16 != 0) goto L88
        L85:
            r22 = r0
            goto L8b
        L88:
            r22 = r0
            goto L8f
        L8b:
            java.util.List r0 = r13.e
            r16 = r0
        L8f:
            if (r7 == 0) goto L9c
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L99
            r0 = 0
            goto L9a
        L99:
            r0 = r7
        L9a:
            if (r0 != 0) goto L9e
        L9c:
            java.util.List r0 = r13.f
        L9e:
            if (r8 == 0) goto Lad
            boolean r17 = r8.isEmpty()
            if (r17 == 0) goto La9
            r17 = 0
            goto Lab
        La9:
            r17 = r8
        Lab:
            if (r17 != 0) goto Lb0
        Lad:
            r24 = r0
            goto Lb3
        Lb0:
            r24 = r0
            goto Lb7
        Lb3:
            java.util.List r0 = r13.g
            r17 = r0
        Lb7:
            if (r9 != 0) goto Lbc
            java.lang.Boolean r0 = r13.h
            goto Lbd
        Lbc:
            r0 = r9
        Lbd:
            r26 = r0
            if (r10 != 0) goto Lc4
            java.lang.Boolean r0 = r13.i
            goto Lc5
        Lc4:
            r0 = r10
        Lc5:
            r27 = r0
            if (r29 != 0) goto Lcc
            java.lang.Boolean r0 = r13.j
            goto Lce
        Lcc:
            r0 = r29
        Lce:
            r13.getClass()
            np6 r13 = new np6
            r28 = r0
            r21 = r2
            r18 = r13
            r19 = r14
            r20 = r15
            r23 = r16
            r25 = r17
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = r18
            boolean r0 = r11.a(r12, r0)
            if (r0 == 0) goto Led
            return
        Led:
            r0 = r29
            goto L57
    }

    public final java.util.LinkedHashMap a() {
            r5 = this;
            xw r5 = r5.a
            java.lang.Object r5 = r5.a
            np6 r5 = (defpackage.np6) r5
            r5.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            oa r1 = r5.a
            if (r1 == 0) goto L20
            int r1 = r1.a
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            r2.getClass()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
        L20:
            qb r1 = r5.b
            if (r1 == 0) goto L32
            int r1 = r1.a
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r2.getClass()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
        L32:
            xz r1 = r5.c
            if (r1 == 0) goto L44
            int r1 = r1.a
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            r2.getClass()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
        L44:
            pd2 r1 = r5.d
            if (r1 == 0) goto L56
            int r1 = r1.a
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            r2.getClass()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
        L56:
            java.util.List r1 = r5.e
            r2 = 0
            if (r1 == 0) goto L69
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            r3.getClass()
            android.hardware.camera2.params.MeteringRectangle[] r4 = new android.hardware.camera2.params.MeteringRectangle[r2]
            java.lang.Object[] r1 = r1.toArray(r4)
            r0.put(r3, r1)
        L69:
            java.util.List r1 = r5.f
            if (r1 == 0) goto L7b
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            r3.getClass()
            android.hardware.camera2.params.MeteringRectangle[] r4 = new android.hardware.camera2.params.MeteringRectangle[r2]
            java.lang.Object[] r1 = r1.toArray(r4)
            r0.put(r3, r1)
        L7b:
            java.util.List r1 = r5.g
            if (r1 == 0) goto L8d
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS
            r3.getClass()
            android.hardware.camera2.params.MeteringRectangle[] r2 = new android.hardware.camera2.params.MeteringRectangle[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            r0.put(r3, r1)
        L8d:
            java.lang.Boolean r1 = r5.h
            if (r1 == 0) goto L99
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            r2.getClass()
            r0.put(r2, r1)
        L99:
            java.lang.Boolean r5 = r5.j
            if (r5 == 0) goto La5
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_LOCK
            r1.getClass()
            r0.put(r1, r5)
        La5:
            return r0
    }
}
