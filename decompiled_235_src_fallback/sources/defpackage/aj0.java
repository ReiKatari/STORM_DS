package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aj0  reason: default package */
/* loaded from: classes.dex */
public final class aj0 implements defpackage.cj7 {
    public final defpackage.al1 b;

    public aj0(android.content.Context r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            q61 r0 = defpackage.al1.g
            al1 r0 = r0.l(r3)
            r2.b = r0
            boolean r2 = r3 instanceof android.app.Application
            java.lang.String r0 = "CXCP"
            if (r2 == 0) goto L30
            boolean r2 = defpackage.kj2.H()
            if (r2 == 0) goto L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = "The provided context ("
            r2.<init>(r1)
            r2.append(r3)
            java.lang.String r3 = ") is application scoped and will be used to infer the default display for computing the default preview size, orientation, and default aspect ratio for UseCase outputs."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.util.Log.i(r0, r2)
        L30:
            boolean r2 = defpackage.kj2.F(r0)
            if (r2 == 0) goto L3b
            java.lang.String r2 = "Created UseCaseConfigurationMap"
            android.util.Log.d(r0, r2)
        L3b:
            return
    }

    @Override // defpackage.cj7
    public final defpackage.yy0 a(defpackage.bj7 r32, int r33) {
            r31 = this;
            r0 = r32
            r0.getClass()
            java.lang.String r1 = "CXCP"
            boolean r2 = defpackage.kj2.F(r1)
            if (r2 == 0) goto L1e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Creating config for "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r1, r2)
        L1e:
            da4 r1 = defpackage.da4.d()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            da4 r4 = defpackage.da4.d()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            sa4 r6 = defpackage.sa4.a()
            android.util.ArrayMap r6 = r6.a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int[] r10 = defpackage.yi0.a
            int r11 = r0.ordinal()
            r11 = r10[r11]
            r12 = 0
            java.lang.Class<androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk> r14 = androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.class
            switch(r11) {
                case 1: goto L6c;
                case 2: goto L6c;
                case 3: goto L6c;
                case 4: goto L6c;
                case 5: goto L6c;
                case 6: goto L5c;
                default: goto L58;
            }
        L58:
            defpackage.i.d()
            return r12
        L5c:
            y65 r11 = defpackage.si1.a()
            u65 r11 = r11.b(r14)
            if (r11 == 0) goto L68
            r11 = 1
            goto L69
        L68:
            r11 = 3
        L69:
            r19 = r11
            goto L6e
        L6c:
            r19 = 1
        L6e:
            xx r11 = defpackage.zi7.G
            rc6 r22 = new rc6
            r30 = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>(r9)
            ek0 r16 = new ek0
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r3)
            go4 r18 = defpackage.go4.a(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r5)
            sy6 r4 = defpackage.sy6.b
            android.util.ArrayMap r4 = new android.util.ArrayMap
            r4.<init>()
            java.util.Set r5 = r6.keySet()
            java.util.Iterator r5 = r5.iterator()
        La7:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto Lbd
            java.lang.Object r17 = r5.next()
            r13 = r17
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r15 = r6.get(r13)
            r4.put(r13, r15)
            goto La7
        Lbd:
            sy6 r5 = new sy6
            r5.<init>(r4)
            r20 = r3
            r21 = r5
            r17 = r9
            r16.<init>(r17, r18, r19, r20, r21)
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r23 = r7
            r24 = r8
            r21 = r12
            r25 = r16
            r20 = r22
            r22 = r2
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r2 = r20
            r1.m(r11, r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            da4 r3 = defpackage.da4.d()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            sa4 r5 = defpackage.sa4.a()
            android.util.ArrayMap r5 = r5.a
            int r6 = r0.ordinal()
            r6 = r10[r6]
            switch(r6) {
                case 1: goto L119;
                case 2: goto L117;
                case 3: goto L117;
                case 4: goto L117;
                case 5: goto L117;
                case 6: goto L108;
                default: goto L104;
            }
        L104:
            defpackage.i.d()
            return r30
        L108:
            y65 r6 = defpackage.si1.a()
            u65 r6 = r6.b(r14)
            if (r6 == 0) goto L114
            r13 = 1
            goto L115
        L114:
            r13 = 3
        L115:
            r9 = r13
            goto L121
        L117:
            r9 = 1
            goto L121
        L119:
            r6 = 2
            r7 = r33
            if (r7 != r6) goto L11f
            r6 = 5
        L11f:
            r13 = r6
            goto L115
        L121:
            xx r12 = defpackage.zi7.H
            ek0 r6 = new ek0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r2)
            go4 r8 = defpackage.go4.a(r3)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r4)
            sy6 r2 = defpackage.sy6.b
            android.util.ArrayMap r2 = new android.util.ArrayMap
            r2.<init>()
            java.util.Set r3 = r5.keySet()
            java.util.Iterator r3 = r3.iterator()
        L142:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L156
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r11 = r5.get(r4)
            r2.put(r4, r11)
            goto L142
        L156:
            sy6 r11 = new sy6
            r11.<init>(r2)
            r6.<init>(r7, r8, r9, r10, r11)
            r1.m(r12, r6)
            xx r2 = defpackage.zi7.J
            bj7 r3 = defpackage.bj7.IMAGE_CAPTURE
            if (r0 != r3) goto L16a
            xi0 r3 = defpackage.xi0.b
            goto L16c
        L16a:
            vi0 r3 = defpackage.vi0.a
        L16c:
            r1.m(r2, r3)
            xx r2 = defpackage.zi7.I
            wi0 r3 = defpackage.wi0.a
            r1.m(r2, r3)
            bj7 r2 = defpackage.bj7.PREVIEW
            r3 = r31
            al1 r3 = r3.b
            if (r0 != r2) goto L187
            android.util.Size r0 = r3.c()
            xx r2 = defpackage.n23.u
            r1.m(r2, r0)
        L187:
            xx r0 = defpackage.n23.p
            q61 r2 = defpackage.al1.g
            r2 = 1
            android.view.Display r2 = r3.b(r2)
            int r2 = r2.getRotation()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.m(r0, r2)
            go4 r0 = defpackage.go4.a(r1)
            return r0
    }
}
