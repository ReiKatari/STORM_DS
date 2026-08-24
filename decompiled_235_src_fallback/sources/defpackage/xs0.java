package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xs0  reason: default package */
/* loaded from: classes.dex */
public final class xs0 implements defpackage.la2 {
    public final /* synthetic */ int a;
    public final defpackage.fo4 b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public xs0(defpackage.k10 r2, defpackage.n00 r3, defpackage.fo4 r4) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r4.getClass()
            r1.<init>()
            r1.c = r2
            r1.d = r3
            r1.b = r4
            return
    }

    public xs0(defpackage.kx5 r2, defpackage.fo4 r3, defpackage.pq5 r4) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r3.getClass()
            r1.<init>()
            r1.c = r2
            r1.b = r3
            r1.d = r4
            return
    }

    @Override // defpackage.la2
    public final java.lang.Object a(defpackage.r41 r13) {
            r12 = this;
            int r0 = r12.a
            r1 = 0
            fo4 r2 = r12.b
            java.lang.Object r3 = r12.d
            java.lang.Object r4 = r12.c
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L72;
                default: goto Le;
            }
        Le:
            boolean r0 = r13 instanceof defpackage.ys0
            if (r0 == 0) goto L21
            r0 = r13
            ys0 r0 = (defpackage.ys0) r0
            int r7 = r0.Y
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L21
            int r7 = r7 - r8
            r0.Y = r7
            goto L28
        L21:
            ys0 r0 = new ys0
            s41 r13 = (defpackage.s41) r13
            r0.<init>(r12, r13)
        L28:
            java.lang.Object r12 = r0.R
            x61 r13 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r0.Y
            if (r7 == 0) goto L3c
            if (r7 != r5) goto L36
            defpackage.oi2.Y(r12)
            goto L58
        L36:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            goto L71
        L3c:
            defpackage.oi2.Y(r12)
            kx5 r4 = (defpackage.kx5) r4
            pq5 r3 = (defpackage.pq5) r3
            r0.Y = r5
            xe1 r12 = defpackage.xk1.a
            de1 r12 = defpackage.de1.L
            m5 r5 = new m5
            r7 = 28
            r5.<init>(r3, r4, r6, r7)
            java.lang.Object r12 = defpackage.hv.d0(r12, r5, r0)
            if (r12 != r13) goto L58
            r6 = r13
            goto L71
        L58:
            android.graphics.Bitmap r12 = (android.graphics.Bitmap) r12
            if (r12 == 0) goto L71
            wo1 r6 = new wo1
            android.content.Context r13 = r2.a
            android.content.res.Resources r13 = r13.getResources()
            r13.getClass()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r13, r12)
            zb1 r12 = defpackage.zb1.MEMORY
            r6.<init>(r0, r1, r12)
        L71:
            return r6
        L72:
            k10 r4 = (defpackage.k10) r4
            n00 r3 = (defpackage.n00) r3
            android.net.Uri r12 = r3.c
            java.io.File r13 = r4.a(r3)
            if (r13 == 0) goto L8e
            boolean r0 = r13.isFile()
            if (r0 != r5) goto L8e
            java.lang.String r12 = r13.getAbsolutePath()
            android.graphics.Bitmap r12 = android.graphics.BitmapFactory.decodeFile(r12)
            goto L154
        L8e:
            r13 = 256(0x100, float:3.59E-43)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            android.content.Context r0 = r4.a
            android.graphics.BitmapFactory$Options r7 = new android.graphics.BitmapFactory$Options
            r7.<init>()
            r7.inJustDecodeBounds = r5
            android.content.ContentResolver r8 = r0.getContentResolver()     // Catch: java.lang.Exception -> Lae
            java.io.InputStream r8 = r8.openInputStream(r12)     // Catch: java.lang.Exception -> Lae
            if (r8 == 0) goto Lb8
            android.graphics.BitmapFactory.decodeStream(r8, r6, r7)     // Catch: java.lang.Throwable -> Lb1
            r8.close()     // Catch: java.lang.Exception -> Lae
            goto Lb8
        Lae:
            r12 = move-exception
            goto L130
        Lb1:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r13 = move-exception
            defpackage.ge7.t(r8, r12)     // Catch: java.lang.Exception -> Lae
            throw r13     // Catch: java.lang.Exception -> Lae
        Lb8:
            int r8 = r7.outWidth
            r9 = -1
            if (r8 == r9) goto L12a
            int r10 = r7.outHeight
            if (r10 != r9) goto Lc2
            goto L12a
        Lc2:
            r9 = 1132462080(0x43800000, float:256.0)
            if (r8 <= r10) goto Ld5
            float r10 = (float) r10
            float r8 = (float) r8
            float r10 = r10 / r8
            float r10 = r10 * r9
            int r8 = (int) r10
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            vr4 r9 = new vr4
            r9.<init>(r13, r8)
            goto Le3
        Ld5:
            float r8 = (float) r8
            float r10 = (float) r10
            float r8 = r8 / r10
            float r8 = r8 * r9
            int r8 = (int) r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            vr4 r9 = new vr4
            r9.<init>(r8, r13)
        Le3:
            java.lang.Object r13 = r9.A
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            java.lang.Object r8 = r9.B
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r9 = r7.outWidth
            int r10 = r7.outHeight
            if (r10 > r8) goto Lfb
            if (r9 <= r13) goto L10a
        Lfb:
            int r10 = r10 / 2
            int r9 = r9 / 2
        Lff:
            int r11 = r10 / r5
            if (r11 < r8) goto L10a
            int r11 = r9 / r5
            if (r11 < r13) goto L10a
            int r5 = r5 * 2
            goto Lff
        L10a:
            r7.inJustDecodeBounds = r1
            r7.inSampleSize = r5
            android.content.ContentResolver r13 = r0.getContentResolver()     // Catch: java.lang.Exception -> L121
            java.io.InputStream r12 = r13.openInputStream(r12)     // Catch: java.lang.Exception -> L121
            if (r12 == 0) goto L12a
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeStream(r12, r6, r7)     // Catch: java.lang.Throwable -> L123
            r12.close()     // Catch: java.lang.Exception -> L121
            r12 = r13
            goto L134
        L121:
            r12 = move-exception
            goto L12c
        L123:
            r13 = move-exception
            throw r13     // Catch: java.lang.Throwable -> L125
        L125:
            r0 = move-exception
            defpackage.ge7.t(r12, r13)     // Catch: java.lang.Exception -> L121
            throw r0     // Catch: java.lang.Exception -> L121
        L12a:
            r12 = r6
            goto L134
        L12c:
            r12.printStackTrace()
            goto L12a
        L130:
            r12.printStackTrace()
            goto L12a
        L134:
            if (r12 == 0) goto L154
            java.io.File r13 = r4.a(r3)     // Catch: java.lang.Exception -> L154
            if (r13 != 0) goto L13d
            goto L154
        L13d:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L154
            r0.<init>(r13)     // Catch: java.lang.Exception -> L154
            android.graphics.Bitmap$CompressFormat r13 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L14d
            r3 = 100
            r12.compress(r13, r3, r0)     // Catch: java.lang.Throwable -> L14d
            r0.close()     // Catch: java.lang.Exception -> L154
            goto L154
        L14d:
            r13 = move-exception
            throw r13     // Catch: java.lang.Throwable -> L14f
        L14f:
            r3 = move-exception
            defpackage.ge7.t(r0, r13)     // Catch: java.lang.Exception -> L154
            throw r3     // Catch: java.lang.Exception -> L154
        L154:
            if (r12 == 0) goto L16b
            android.content.Context r13 = r2.a
            android.content.res.Resources r13 = r13.getResources()
            r13.getClass()
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            r0.<init>(r13, r12)
            wo1 r6 = new wo1
            zb1 r12 = defpackage.zb1.DISK
            r6.<init>(r0, r1, r12)
        L16b:
            return r6
    }
}
