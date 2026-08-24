package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd4  reason: default package */
/* loaded from: classes.dex */
public final class vd4 implements defpackage.pw5 {
    public final android.content.Context a;
    public final defpackage.uh7 b;

    public vd4(android.content.Context r1, defpackage.uh7 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.pw5
    public final defpackage.lx5 a(defpackage.pq5 r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            android.content.Context r2 = r2.a     // Catch: java.lang.Exception -> L1a
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Exception -> L1a
            android.net.Uri r1 = r3.d     // Catch: java.lang.Exception -> L1a
            java.io.InputStream r2 = r2.openInputStream(r1)     // Catch: java.lang.Exception -> L1a
            if (r2 == 0) goto L23
            lx5 r3 = defpackage.kn2.J(r3, r2)     // Catch: java.lang.Throwable -> L1c
            r2.close()     // Catch: java.lang.Exception -> L1a
            return r3
        L1a:
            r2 = move-exception
            goto L24
        L1c:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L1e
        L1e:
            r1 = move-exception
            defpackage.ge7.t(r2, r3)     // Catch: java.lang.Exception -> L1a
            throw r1     // Catch: java.lang.Exception -> L1a
        L23:
            return r0
        L24:
            r2.printStackTrace()
            return r0
    }

    @Override // defpackage.pw5
    public final java.lang.Object b(defpackage.pq5 r1, defpackage.dh r2) {
            r0 = this;
            android.net.Uri r0 = r1.d
            return r0
    }

    @Override // defpackage.pw5
    public final android.graphics.Bitmap c(defpackage.pq5 r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            android.content.Context r2 = r2.a     // Catch: java.lang.Exception -> L1a
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Exception -> L1a
            android.net.Uri r3 = r3.d     // Catch: java.lang.Exception -> L1a
            java.io.InputStream r2 = r2.openInputStream(r3)     // Catch: java.lang.Exception -> L1a
            if (r2 == 0) goto L23
            android.graphics.Bitmap r3 = defpackage.kn2.I(r2)     // Catch: java.lang.Throwable -> L1c
            r2.close()     // Catch: java.lang.Exception -> L1a
            return r3
        L1a:
            r2 = move-exception
            goto L24
        L1c:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L1e
        L1e:
            r1 = move-exception
            defpackage.ge7.t(r2, r3)     // Catch: java.lang.Exception -> L1a
            throw r1     // Catch: java.lang.Exception -> L1a
        L23:
            return r0
        L24:
            r2.printStackTrace()
            return r0
    }

    @Override // defpackage.pw5
    public final defpackage.pq5 d(android.net.Uri r37, android.net.Uri r38) {
            r36 = this;
            r0 = r36
            r4 = r37
            java.lang.String r1 = ".nds"
            r16 = 0
            android.content.Context r2 = r0.a     // Catch: java.lang.Exception -> L40
            android.content.ContentResolver r2 = r2.getContentResolver()     // Catch: java.lang.Exception -> L40
            java.io.InputStream r2 = r2.openInputStream(r4)     // Catch: java.lang.Exception -> L40
            if (r2 == 0) goto L24
            uz5 r3 = defpackage.kn2.K(r2)     // Catch: java.lang.Throwable -> L1c
            r2.close()     // Catch: java.lang.Exception -> L40
            goto L26
        L1c:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L1f
        L1f:
            r0 = move-exception
            defpackage.ge7.t(r2, r1)     // Catch: java.lang.Exception -> L40
            throw r0     // Catch: java.lang.Exception -> L40
        L24:
            r3 = r16
        L26:
            uh7 r0 = r0.b     // Catch: java.lang.Exception -> L40
            zl1 r0 = r0.a(r4)     // Catch: java.lang.Exception -> L40
            if (r0 == 0) goto L43
            java.lang.String r2 = defpackage.hf.V(r0)     // Catch: java.lang.Exception -> L40
            if (r2 == 0) goto L43
            boolean r5 = defpackage.ln2.G(r2)     // Catch: java.lang.Exception -> L40
            if (r5 != 0) goto L3b
            goto L3d
        L3b:
            r2 = r16
        L3d:
            if (r2 != 0) goto L58
            goto L43
        L40:
            r0 = move-exception
            goto Lf4
        L43:
            java.lang.String r2 = r4.getLastPathSegment()     // Catch: java.lang.Exception -> L40
            if (r2 == 0) goto L56
            r5 = 47
            java.lang.String r2 = defpackage.qs6.O0(r5, r2, r2)     // Catch: java.lang.Exception -> L40
            r5 = 46
            java.lang.String r2 = defpackage.qs6.R0(r5, r2, r2)     // Catch: java.lang.Exception -> L40
            goto L58
        L56:
            java.lang.String r2 = "NDS Game"
        L58:
            if (r3 == 0) goto L67
            java.lang.String r5 = r3.a     // Catch: java.lang.Exception -> L40
            boolean r6 = defpackage.ln2.G(r5)     // Catch: java.lang.Exception -> L40
            if (r6 != 0) goto L63
            goto L65
        L63:
            r5 = r16
        L65:
            if (r5 != 0) goto L68
        L67:
            r5 = r2
        L68:
            if (r0 == 0) goto L70
            java.lang.String r0 = r0.i()     // Catch: java.lang.Exception -> L40
            if (r0 != 0) goto L74
        L70:
            java.lang.String r0 = r2.concat(r1)     // Catch: java.lang.Exception -> L40
        L74:
            if (r3 == 0) goto L7b
            boolean r1 = r3.c     // Catch: java.lang.Exception -> L40
        L78:
            r8 = r1
            r1 = r0
            goto L7d
        L7b:
            r1 = 0
            goto L78
        L7d:
            pq5 r0 = new pq5     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = ""
            if (r3 == 0) goto L86
            java.lang.String r6 = r3.b     // Catch: java.lang.Exception -> L40
            goto L87
        L86:
            r6 = r2
        L87:
            if (r8 == 0) goto Lb3
            jt5 r17 = new jt5     // Catch: java.lang.Exception -> L40
            u26 r18 = defpackage.u26.DSi     // Catch: java.lang.Exception -> L40
            a36 r19 = defpackage.a36.DEFAULT     // Catch: java.lang.Exception -> L40
            uw5 r21 = defpackage.uw5.o     // Catch: java.lang.Exception -> L40
            nx5 r24 = defpackage.nx5.GLOBAL     // Catch: java.lang.Exception -> L40
            r34 = 0
            r35 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch: java.lang.Exception -> L40
            goto Ld7
        Lb3:
            jt5 r17 = new jt5     // Catch: java.lang.Exception -> L40
            r31 = 0
            r32 = 262143(0x3ffff, float:3.6734E-40)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Exception -> L40
        Ld7:
            if (r3 == 0) goto Le0
            java.lang.String r3 = r3.d     // Catch: java.lang.Exception -> L40
            if (r3 != 0) goto Lde
            goto Le0
        Lde:
            r9 = r3
            goto Le1
        Le0:
            r9 = r2
        Le1:
            r14 = 0
            r15 = 7680(0x1e00, float:1.0762E-41)
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r3 = r1
            r1 = r5
            r2 = r6
            r6 = r17
            r5 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L40
            return r0
        Lf4:
            r0.printStackTrace()
            return r16
    }
}
