package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd0  reason: default package */
/* loaded from: classes.dex */
public final class cd0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ java.lang.String Y;
    public final /* synthetic */ defpackage.ed0 Z;

    public /* synthetic */ cd0(java.lang.String r1, defpackage.ed0 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Y = r1
            r0.Z = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            cd0 r2 = (defpackage.cd0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            cd0 r2 = (defpackage.cd0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            ed0 r0 = r2.Z
            java.lang.String r2 = r2.Y
            switch(r4) {
                case 0: goto L10;
                default: goto L9;
            }
        L9:
            cd0 r4 = new cd0
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            cd0 r4 = new cd0
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r17) {
            r16 = this;
            r0 = r16
            int r1 = r0.X
            ed0 r2 = r0.Z
            java.lang.String r3 = r0.Y
            java.lang.String r4 = "CXCP"
            r6 = 1
            java.lang.String r8 = "Failed to execute call: Camera encountered an error: "
            r9 = 3
            r10 = 2
            r11 = 4
            r12 = 5
            java.lang.String r13 = "Unexpected CameraAccessException: "
            java.lang.String r5 = "Failed to execute call: Camera may be closed"
            java.lang.String r14 = "Failed to execute call: Unexpected exception: "
            switch(r1) {
                case 0: goto L15f;
                default: goto L1a;
            }
        L1a:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r17)
            n55 r1 = r2.a
            id0 r2 = r2.c
            java.lang.Object r0 = r1.get()     // Catch: java.lang.Exception -> L33
            android.hardware.camera2.CameraManager r0 = (android.hardware.camera2.CameraManager) r0     // Catch: java.lang.Exception -> L33
            boolean r0 = defpackage.xp.n(r0, r3)     // Catch: java.lang.Exception -> L33
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> L33
            goto Laf
        L33:
            r0 = move-exception
            boolean r7 = r0 instanceof android.hardware.camera2.CameraAccessException
            if (r7 == 0) goto L7b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r8)
            java.lang.String r15 = r0.getMessage()
            r7.append(r15)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r4, r7)
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0
            int r7 = r0.getReason()
            if (r7 == r6) goto L75
            if (r7 == r10) goto L73
            if (r7 == r9) goto L71
            if (r7 == r11) goto L6f
            if (r7 == r12) goto L6d
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r13)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            android.util.Log.w(r4, r0)
            r0 = 11
            goto L76
        L6d:
            r0 = r10
            goto L76
        L6f:
            r0 = r6
            goto L76
        L71:
            r0 = 0
            goto L76
        L73:
            r0 = 6
            goto L76
        L75:
            r0 = r9
        L76:
            r2.a(r3, r0, r6)
        L79:
            r0 = 0
            goto Laf
        L7b:
            boolean r7 = r0 instanceof java.lang.IllegalArgumentException
            if (r7 != 0) goto L95
            boolean r7 = r0 instanceof java.lang.SecurityException
            if (r7 != 0) goto L95
            boolean r7 = r0 instanceof java.lang.UnsupportedOperationException
            if (r7 != 0) goto L95
            boolean r7 = r0 instanceof java.lang.NullPointerException
            if (r7 == 0) goto L8c
            goto L95
        L8c:
            boolean r7 = r0 instanceof java.lang.IllegalStateException
            if (r7 == 0) goto L94
            android.util.Log.d(r4, r5)
            goto L79
        L94:
            throw r0
        L95:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r14)
            java.lang.String r0 = r0.getMessage()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            android.util.Log.w(r4, r0)
            r7 = 0
            r15 = 9
            r2.a(r3, r15, r7)
            goto L79
        Laf:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r0 = defpackage.nb3.k(r0, r7)
            if (r0 != 0) goto Lba
        Lb7:
            r5 = 0
            goto L15e
        Lba:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Initializing CameraDeviceSetup for "
            r0.<init>(r7)
            java.lang.String r7 = defpackage.xf0.b(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
            java.lang.Object r0 = r1.get()     // Catch: java.lang.Exception -> Ldb
            android.hardware.camera2.CameraManager r0 = (android.hardware.camera2.CameraManager) r0     // Catch: java.lang.Exception -> Ldb
            android.hardware.camera2.CameraDevice$CameraDeviceSetup r0 = defpackage.xp.b(r0, r3)     // Catch: java.lang.Exception -> Ldb
            goto L157
        Ldb:
            r0 = move-exception
            boolean r1 = r0 instanceof android.hardware.camera2.CameraAccessException
            if (r1 == 0) goto L123
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            java.lang.String r5 = r0.getMessage()
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r4, r1)
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0
            int r1 = r0.getReason()
            if (r1 == r6) goto L11d
            if (r1 == r10) goto L11b
            if (r1 == r9) goto L119
            if (r1 == r11) goto L117
            if (r1 == r12) goto L115
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r13)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r4, r0)
            r7 = 11
            goto L11e
        L115:
            r7 = r10
            goto L11e
        L117:
            r7 = r6
            goto L11e
        L119:
            r7 = 0
            goto L11e
        L11b:
            r7 = 6
            goto L11e
        L11d:
            r7 = r9
        L11e:
            r2.a(r3, r7, r6)
        L121:
            r0 = 0
            goto L157
        L123:
            boolean r1 = r0 instanceof java.lang.IllegalArgumentException
            if (r1 != 0) goto L13d
            boolean r1 = r0 instanceof java.lang.SecurityException
            if (r1 != 0) goto L13d
            boolean r1 = r0 instanceof java.lang.UnsupportedOperationException
            if (r1 != 0) goto L13d
            boolean r1 = r0 instanceof java.lang.NullPointerException
            if (r1 == 0) goto L134
            goto L13d
        L134:
            boolean r1 = r0 instanceof java.lang.IllegalStateException
            if (r1 == 0) goto L13c
            android.util.Log.d(r4, r5)
            goto L121
        L13c:
            throw r0
        L13d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r14)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r4, r0)
            r7 = 0
            r15 = 9
            r2.a(r3, r15, r7)
            goto L121
        L157:
            if (r0 == 0) goto Lb7
            hd0 r5 = new hd0
            r5.<init>(r0, r3, r2)
        L15e:
            return r5
        L15f:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r17)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Initializing CameraDeviceSetupCompat for "
            r0.<init>(r1)
            java.lang.String r1 = defpackage.xf0.b(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r4, r0)
            id0 r1 = r2.c
            ex6 r0 = r2.l     // Catch: java.lang.Exception -> L19a
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L19a
            af0 r0 = (defpackage.af0) r0     // Catch: java.lang.Exception -> L19a
            r0.getClass()     // Catch: java.lang.Exception -> L19a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L19a
            r2.<init>()     // Catch: java.lang.Exception -> L19a
            lc0 r7 = r0.a     // Catch: java.lang.Exception -> L19a
            if (r7 == 0) goto L19c
            rb r15 = new rb     // Catch: java.lang.Exception -> L19a
            android.hardware.camera2.CameraManager r7 = r7.a     // Catch: java.lang.Exception -> L19a
            r15.<init>(r7, r3)     // Catch: java.lang.Exception -> L19a
            r2.add(r15)     // Catch: java.lang.Exception -> L19a
            goto L19c
        L19a:
            r0 = move-exception
            goto L1b2
        L19c:
            lc0 r0 = r0.b     // Catch: java.lang.Exception -> L19a
            if (r0 == 0) goto L1aa
            rb r7 = new rb     // Catch: java.lang.Exception -> L19a java.lang.UnsupportedOperationException -> L1aa
            android.hardware.camera2.CameraManager r0 = r0.a     // Catch: java.lang.Exception -> L19a java.lang.UnsupportedOperationException -> L1aa
            r7.<init>(r0, r3)     // Catch: java.lang.Exception -> L19a java.lang.UnsupportedOperationException -> L1aa
            r2.add(r7)     // Catch: java.lang.Exception -> L19a java.lang.UnsupportedOperationException -> L1aa
        L1aa:
            rb r0 = new rb     // Catch: java.lang.Exception -> L19a
            r0.<init>(r2)     // Catch: java.lang.Exception -> L19a
            r5 = r0
            goto L22d
        L1b2:
            boolean r2 = r0 instanceof android.hardware.camera2.CameraAccessException
            if (r2 == 0) goto L1f9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r8)
            java.lang.String r5 = r0.getMessage()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.w(r4, r2)
            android.hardware.camera2.CameraAccessException r0 = (android.hardware.camera2.CameraAccessException) r0
            int r2 = r0.getReason()
            if (r2 == r6) goto L1f3
            if (r2 == r10) goto L1f1
            if (r2 == r9) goto L1ef
            if (r2 == r11) goto L1ed
            if (r2 == r12) goto L1eb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r13)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r4, r0)
            r7 = 11
            goto L1f4
        L1eb:
            r7 = r10
            goto L1f4
        L1ed:
            r7 = r6
            goto L1f4
        L1ef:
            r7 = 0
            goto L1f4
        L1f1:
            r7 = 6
            goto L1f4
        L1f3:
            r7 = r9
        L1f4:
            r1.a(r3, r7, r6)
        L1f7:
            r5 = 0
            goto L22d
        L1f9:
            boolean r2 = r0 instanceof java.lang.IllegalArgumentException
            if (r2 != 0) goto L213
            boolean r2 = r0 instanceof java.lang.SecurityException
            if (r2 != 0) goto L213
            boolean r2 = r0 instanceof java.lang.UnsupportedOperationException
            if (r2 != 0) goto L213
            boolean r2 = r0 instanceof java.lang.NullPointerException
            if (r2 == 0) goto L20a
            goto L213
        L20a:
            boolean r1 = r0 instanceof java.lang.IllegalStateException
            if (r1 == 0) goto L212
            android.util.Log.d(r4, r5)
            goto L1f7
        L212:
            throw r0
        L213:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r14)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r4, r0)
            r7 = 0
            r15 = 9
            r1.a(r3, r15, r7)
            goto L1f7
        L22d:
            return r5
    }
}
