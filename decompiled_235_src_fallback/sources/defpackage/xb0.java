package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xb0  reason: default package */
/* loaded from: classes.dex */
public final class xb0 {
    public final defpackage.t57 a;
    public final defpackage.ed0 b;
    public final defpackage.ld0 c;
    public final defpackage.e65 d;
    public final defpackage.d51 e;
    public final java.lang.Object f;
    public final java.util.LinkedHashSet g;

    public xb0(defpackage.t57 r1, defpackage.ed0 r2, defpackage.ld0 r3, defpackage.e65 r4, defpackage.d51 r5, android.content.Context r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.f = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.g = r1
            return
    }

    public final java.lang.Object a(defpackage.kf0 r29, defpackage.s41 r30) {
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            boolean r3 = r2 instanceof defpackage.wb0
            if (r3 == 0) goto L19
            r3 = r2
            wb0 r3 = (defpackage.wb0) r3
            int r4 = r3.e0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.e0 = r4
            goto L1e
        L19:
            wb0 r3 = new wb0
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.Z
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.e0
            java.lang.String r6 = "CXCP"
            ed0 r0 = r0.b
            r7 = 2
            r8 = 0
            r9 = 1
            r10 = 0
            if (r5 == 0) goto L4e
            if (r5 == r9) goto L48
            if (r5 != r7) goto L42
            java.lang.Object r0 = r3.Y
            android.hardware.camera2.params.SessionConfiguration r0 = defpackage.j2.d(r0)
            rb r1 = r3.X
            kf0 r3 = r3.R
            defpackage.oi2.Y(r2)
            r5 = r0
            goto L12e
        L42:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r8
        L48:
            kf0 r1 = r3.R
            defpackage.oi2.Y(r2)
            goto L6b
        L4e:
            defpackage.oi2.Y(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 35
            if (r2 >= r5) goto L5d
            zy0 r0 = new zy0
            r0.<init>(r10)
            return r0
        L5d:
            java.lang.String r2 = r1.a
            r3.R = r1
            r3.e0 = r9
            java.lang.Object r2 = r0.b(r2, r3)
            if (r2 != r4) goto L6b
            goto L12a
        L6b:
            rb r2 = (defpackage.rb) r2
            int r5 = r1.h
            java.lang.String r11 = r1.a
            if (r5 != 0) goto L75
            r5 = r10
            goto L98
        L75:
            if (r5 != r9) goto L79
            r5 = r9
            goto L98
        L79:
            if (r5 != r7) goto L98
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported session mode: "
            r0.<init>(r2)
            int r1 = r1.h
            java.lang.String r1 = defpackage.q60.Z(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.i(r6, r0)
            zy0 r0 = new zy0
            r0.<init>(r10)
            return r0
        L98:
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            java.util.List r13 = r1.b
            java.util.Iterator r13 = r13.iterator()
        La3:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L113
            java.lang.Object r14 = r13.next()
            ji0 r14 = (defpackage.ji0) r14
            java.util.List r14 = r14.a
            java.util.Iterator r14 = r14.iterator()
        Lb5:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto La3
            java.lang.Object r15 = r14.next()
            pp4 r15 = (defpackage.pp4) r15
            int r8 = r15.b
            java.lang.String r10 = r15.c
            java.lang.Integer r17 = java.lang.Integer.valueOf(r8)
            vs0 r18 = defpackage.vs0.p0
            rp4 r8 = r15.d
            qp4 r9 = r15.e
            sp4 r7 = r15.f
            r21 = r7
            java.util.List r7 = r15.h
            android.util.Size r15 = r15.a
            if (r10 != 0) goto Ldc
            r16 = 0
            goto Le0
        Ldc:
            boolean r16 = r10.equals(r11)
        Le0:
            if (r16 != 0) goto Le5
            r26 = r10
            goto Le7
        Le5:
            r26 = 0
        Le7:
            r27 = 1536(0x600, float:2.152E-42)
            r16 = 0
            r24 = 0
            r25 = 0
            r22 = r7
            r19 = r8
            r20 = r9
            r23 = r15
            xi r7 = defpackage.cs1.q(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r7 == 0) goto L10e
            java.lang.Class<android.hardware.camera2.params.OutputConfiguration> r8 = android.hardware.camera2.params.OutputConfiguration.class
            ar0 r8 = defpackage.gh5.a(r8)
            java.lang.Object r7 = r7.e(r8)
            android.hardware.camera2.params.OutputConfiguration r7 = (android.hardware.camera2.params.OutputConfiguration) r7
            if (r7 == 0) goto L10e
            r12.add(r7)
        L10e:
            r7 = 2
            r8 = 0
            r9 = 1
            r10 = 0
            goto Lb5
        L113:
            java.util.List r7 = defpackage.gt0.k1(r12)
            android.hardware.camera2.params.SessionConfiguration r5 = defpackage.xp.g(r5, r7)
            r3.R = r1
            r3.X = r2
            r3.Y = r5
            r7 = 2
            r3.e0 = r7
            java.lang.Object r0 = r0.c(r11, r3)
            if (r0 != r4) goto L12b
        L12a:
            return r4
        L12b:
            r3 = r1
            r1 = r2
            r2 = r0
        L12e:
            hd0 r2 = (defpackage.hd0) r2
            if (r2 == 0) goto L1c8
            int r0 = r3.f
            java.lang.String r4 = r2.b
            id0 r7 = r2.c
            android.hardware.camera2.CameraDevice$CameraDeviceSetup r2 = r2.a     // Catch: java.lang.Exception -> L140
            android.hardware.camera2.CaptureRequest$Builder r0 = defpackage.xp.c(r2, r0)     // Catch: java.lang.Exception -> L140
            goto L1c9
        L140:
            r0 = move-exception
            boolean r2 = r0 instanceof android.hardware.camera2.CameraAccessException
            if (r2 == 0) goto L191
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to execute call: Camera encountered an error: "
            r2.<init>(r8)
            java.lang.String r8 = r0.getMessage()
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r6, r2)
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0
            int r2 = r0.getReason()
            r8 = 3
            r9 = 1
            if (r2 == r9) goto L18c
            r9 = 2
            if (r2 == r9) goto L18a
            if (r2 == r8) goto L188
            r8 = 4
            if (r2 == r8) goto L186
            r8 = 5
            if (r2 == r8) goto L184
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "Unexpected CameraAccessException: "
            r2.<init>(r8)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r6, r0)
            r0 = 11
        L182:
            r9 = 1
            goto L18d
        L184:
            r0 = r9
            goto L182
        L186:
            r0 = 1
            goto L182
        L188:
            r0 = 0
            goto L182
        L18a:
            r0 = 6
            goto L182
        L18c:
            r0 = r8
        L18d:
            r7.a(r4, r0, r9)
            goto L1c8
        L191:
            boolean r2 = r0 instanceof java.lang.IllegalArgumentException
            if (r2 != 0) goto L1ad
            boolean r2 = r0 instanceof java.lang.SecurityException
            if (r2 != 0) goto L1ad
            boolean r2 = r0 instanceof java.lang.UnsupportedOperationException
            if (r2 != 0) goto L1ad
            boolean r2 = r0 instanceof java.lang.NullPointerException
            if (r2 == 0) goto L1a2
            goto L1ad
        L1a2:
            boolean r2 = r0 instanceof java.lang.IllegalStateException
            if (r2 == 0) goto L1ac
            java.lang.String r0 = "Failed to execute call: Camera may be closed"
            android.util.Log.d(r6, r0)
            goto L1c8
        L1ac:
            throw r0
        L1ad:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to execute call: Unexpected exception: "
            r2.<init>(r8)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r6, r0)
            r0 = 9
            r2 = 0
            r7.a(r4, r0, r2)
        L1c8:
            r0 = 0
        L1c9:
            if (r0 == 0) goto L204
            java.util.Map r2 = r3.g
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1d5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1f7
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r3 = r3.getValue()
            boolean r6 = r4 instanceof android.hardware.camera2.CaptureRequest.Key
            if (r6 == 0) goto L1f0
            android.hardware.camera2.CaptureRequest$Key r4 = (android.hardware.camera2.CaptureRequest.Key) r4
            goto L1f1
        L1f0:
            r4 = 0
        L1f1:
            if (r4 == 0) goto L1d5
            r0.set(r4, r3)
            goto L1d5
        L1f7:
            android.hardware.camera2.CaptureRequest r0 = r0.build()
            r0.getClass()
            r5.getClass()
            defpackage.j2.q(r5, r0)
        L204:
            if (r1 == 0) goto L212
            ga0 r0 = r1.a(r5)
            int r0 = r0.b
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r0)
            goto L213
        L212:
            r8 = 0
        L213:
            if (r8 == 0) goto L21f
            int r0 = r8.intValue()
            zy0 r1 = new zy0
            r1.<init>(r0)
            return r1
        L21f:
            zy0 r0 = new zy0
            r2 = 0
            r0.<init>(r2)
            return r0
    }
}
