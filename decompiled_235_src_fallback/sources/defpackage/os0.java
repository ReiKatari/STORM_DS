package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: os0  reason: default package */
/* loaded from: classes.dex */
public class os0 implements defpackage.a54, defpackage.g44, defpackage.r23, defpackage.ns, defpackage.zk4, defpackage.bi4, defpackage.yd5, defpackage.n44, defpackage.q31, defpackage.s31 {
    public static final defpackage.lr2 L = null;
    public static final defpackage.os0 R = null;
    public static final defpackage.th7 X = null;
    public final /* synthetic */ int A;
    public java.lang.Object B;

    static {
            lr2 r0 = new lr2
            r1 = 1
            r0.<init>(r1)
            defpackage.os0.L = r0
            os0 r0 = new os0
            r1 = 2
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.os0.R = r0
            th7 r0 = new th7
            r0.<init>()
            defpackage.os0.X = r0
            return
    }

    public os0(int r5) {
            r4 = this;
            r4.A = r5
            r0 = 0
            switch(r5) {
                case 4: goto L7f;
                case 11: goto L69;
                case 15: goto L5e;
                case 23: goto L4a;
                case 27: goto L35;
                default: goto L6;
            }
        L6:
            l04 r5 = new l04
            java.lang.String r1 = "com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L1b
            java.lang.String r2 = "getInstance"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.Exception -> L1b
            java.lang.Object r0 = r1.invoke(r0, r0)     // Catch: java.lang.Exception -> L1b
            h54 r0 = (defpackage.h54) r0     // Catch: java.lang.Exception -> L1b
            goto L1d
        L1b:
            lr2 r0 = defpackage.os0.L
        L1d:
            r1 = 2
            h54[] r1 = new defpackage.h54[r1]
            lr2 r2 = defpackage.lr2.b
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            r5.<init>()
            r5.a = r1
            r4.<init>()
            java.nio.charset.Charset r0 = defpackage.aa3.a
            r4.B = r5
            return
        L35:
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MINUTES
            r5.getClass()
            qz6 r5 = defpackage.qz6.l
            r5.getClass()
            ls1 r0 = new ls1
            r0.<init>(r5)
            r4.<init>()
            r4.B = r0
            return
        L4a:
            r4.<init>()
            y65 r5 = defpackage.si1.a
            java.lang.Class<androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk> r5 = androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk.class
            y65 r0 = defpackage.si1.a()
            u65 r5 = r0.b(r5)
            androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk r5 = (androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk) r5
            r4.B = r5
            return
        L5e:
            r4.<init>()
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            r5.<init>(r0)
            r4.B = r5
            return
        L69:
            java.lang.String r5 = "AndroidKeyStore"
            java.security.KeyStore r5 = java.security.KeyStore.getInstance(r5)     // Catch: java.lang.Throwable -> L78
            r5.load(r0)     // Catch: java.lang.Throwable -> L78
            r4.<init>()
            r4.B = r5
            return
        L78:
            r4 = move-exception
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r4)
            throw r5
        L7f:
            r4.<init>()
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r5 < r0) goto L90
            x2 r5 = new x2
            r5.<init>(r4)
            r4.B = r5
            goto L97
        L90:
            w2 r5 = new w2
            r5.<init>(r4)
            r4.B = r5
        L97:
            return
    }

    public /* synthetic */ os0(int r1, boolean r2) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public os0(android.content.ClipData r2, int r3) {
            r1 = this;
            r0 = 28
            r1.A = r0
            r1.<init>()
            android.view.ContentInfo$Builder r2 = defpackage.sd0.j(r2, r3)
            r1.B = r2
            return
    }

    public os0(android.view.ContentInfo r2) {
            r1 = this;
            r0 = 29
            r1.A = r0
            r1.<init>()
            r2.getClass()
            android.view.ContentInfo r2 = defpackage.sd0.l(r2)
            r1.B = r2
            return
    }

    public os0(defpackage.ap7 r2, defpackage.yo7 r3, defpackage.j71 r4) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r2.getClass()
            r3.getClass()
            r4.getClass()
            eb r0 = new eb
            r0.<init>(r2, r3, r4)
            r1.<init>()
            r1.B = r0
            return
    }

    public /* synthetic */ os0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public os0(java.lang.String r2, java.security.KeyStore r3) {
            r1 = this;
            r0 = 10
            r1.A = r0
            r1.<init>()
            r0 = 0
            java.security.Key r3 = r3.getKey(r2, r0)
            javax.crypto.SecretKey r3 = (javax.crypto.SecretKey) r3
            r1.B = r3
            if (r3 == 0) goto L13
            return
        L13:
            java.security.InvalidKeyException r1 = new java.security.InvalidKeyException
            java.lang.String r3 = "Keystore cannot load the key with ID: "
            java.lang.String r2 = r3.concat(r2)
            r1.<init>(r2)
            throw r1
    }

    public os0(defpackage.ms0 r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            java.lang.String r0 = "output"
            defpackage.aa3.a(r2, r0)
            r1.B = r2
            r2.a = r1
            return
    }

    public os0(defpackage.yy0 r2) {
            r1 = this;
            r0 = 20
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.B = r2
            return
    }

    public os0(int[] r22, float[] r23, float[][] r24) {
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = 14
            r0.A = r2
            r0.<init>()
            int r2 = r1.length
            r3 = 1
            int r2 = r2 - r3
            xt[][] r4 = new defpackage.xt[r2]
            r5 = 0
            r7 = r3
            r8 = r7
            r6 = r5
        L14:
            if (r6 >= r2) goto L6b
            r9 = r22[r6]
            r10 = 3
            r11 = 2
            if (r9 == 0) goto L2a
            if (r9 == r3) goto L33
            if (r9 == r11) goto L31
            if (r9 == r10) goto L2c
            r10 = 4
            if (r9 == r10) goto L2a
            r10 = 5
            if (r9 == r10) goto L2a
            r13 = r8
            goto L35
        L2a:
            r13 = r10
            goto L35
        L2c:
            if (r7 != r3) goto L33
            goto L31
        L2f:
            r13 = r7
            goto L35
        L31:
            r7 = r11
            goto L2f
        L33:
            r7 = r3
            goto L2f
        L35:
            r8 = r24[r6]
            int r9 = r6 + 1
            r10 = r24[r9]
            r14 = r1[r6]
            r15 = r1[r9]
            int r12 = r8.length
            int r12 = r12 / r11
            int r3 = r8.length
            int r3 = r3 % r11
            int r3 = r3 + r12
            xt[] r11 = new defpackage.xt[r3]
            r12 = r5
        L47:
            if (r12 >= r3) goto L65
            int r16 = r12 * 2
            r17 = r12
            xt r12 = new xt
            r18 = r16
            r16 = r8[r18]
            int r19 = r18 + 1
            r20 = r17
            r17 = r8[r19]
            r18 = r10[r18]
            r19 = r10[r19]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r11[r20] = r12
            int r12 = r20 + 1
            goto L47
        L65:
            r4[r6] = r11
            r6 = r9
            r8 = r13
            r3 = 1
            goto L14
        L6b:
            r0.B = r4
            return
    }

    public static void Y(java.lang.String r3) {
            os0 r0 = new os0
            r1 = 11
            r0.<init>(r1)
            boolean r0 = r0.b0(r3)
            if (r0 != 0) goto L44
            java.lang.String r3 = defpackage.kk7.b(r3)
            java.lang.String r0 = "AES"
            java.lang.String r1 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0, r1)
            android.security.keystore.KeyGenParameterSpec$Builder r1 = new android.security.keystore.KeyGenParameterSpec$Builder
            r2 = 3
            r1.<init>(r3, r2)
            r3 = 256(0x100, float:3.59E-43)
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r1.setKeySize(r3)
            java.lang.String r1 = "GCM"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setBlockModes(r1)
            java.lang.String r1 = "NoPadding"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            android.security.keystore.KeyGenParameterSpec$Builder r3 = r3.setEncryptionPaddings(r1)
            android.security.keystore.KeyGenParameterSpec r3 = r3.build()
            r0.init(r3)
            r0.generateKey()
            return
        L44:
            java.lang.String r0 = "cannot generate a new key "
            java.lang.String r1 = " because it already exists; please delete it with deleteKey() and try again"
            java.lang.String r3 = defpackage.lb1.A(r0, r3, r1)
            defpackage.i.h(r3)
            return
    }

    public void B(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.r23
    public int C() {
            r0 = this;
            java.lang.Object r0 = r0.B
            android.media.Image$Plane r0 = (android.media.Image.Plane) r0
            int r0 = r0.getPixelStride()
            return r0
    }

    @Override // defpackage.n44
    public void D(defpackage.i44 r8, defpackage.o44 r9) {
            r7 = this;
            java.lang.Object r0 = r7.B
            gl0 r0 = (defpackage.gl0) r0
            android.os.Handler r1 = r0.Y
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            java.util.ArrayList r0 = r0.d0
            int r3 = r0.size()
            r4 = 0
        L11:
            r5 = -1
            if (r4 >= r3) goto L22
            java.lang.Object r6 = r0.get(r4)
            fl0 r6 = (defpackage.fl0) r6
            i44 r6 = r6.b
            if (r8 != r6) goto L1f
            goto L23
        L1f:
            int r4 = r4 + 1
            goto L11
        L22:
            r4 = r5
        L23:
            if (r4 != r5) goto L26
            return
        L26:
            int r4 = r4 + 1
            int r3 = r0.size()
            if (r4 >= r3) goto L35
            java.lang.Object r0 = r0.get(r4)
            r2 = r0
            fl0 r2 = (defpackage.fl0) r2
        L35:
            el0 r0 = new el0
            r0.<init>(r7, r2, r9, r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 200(0xc8, double:9.9E-322)
            long r2 = r2 + r4
            r1.postAtTime(r0, r8, r2)
            return
    }

    @Override // defpackage.s31
    public int F() {
            r0 = this;
            java.lang.Object r0 = r0.B
            android.view.ContentInfo r0 = (android.view.ContentInfo) r0
            int r0 = defpackage.sd0.b(r0)
            return r0
    }

    @Override // defpackage.s31
    public android.view.ContentInfo G() {
            r0 = this;
            java.lang.Object r0 = r0.B
            android.view.ContentInfo r0 = (android.view.ContentInfo) r0
            return r0
    }

    @Override // defpackage.g44
    public void H(defpackage.i44 r1) {
            r0 = this;
            java.lang.Object r0 = r0.B
            androidx.appcompat.widget.ActionMenuView r0 = (androidx.appcompat.widget.ActionMenuView) r0
            g44 r0 = r0.u0
            if (r0 == 0) goto Lb
            r0.H(r1)
        Lb:
            return
    }

    public void I(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.ns
    public void L(int r1, float r2) {
            r0 = this;
            return
    }

    @Override // defpackage.a54
    public boolean M(defpackage.i44 r2) {
            r1 = this;
            java.lang.Object r1 = r1.B
            g8 r1 = (defpackage.g8) r1
            i44 r0 = r1.L
            if (r2 != r0) goto L9
            goto L1a
        L9:
            r0 = r2
            it6 r0 = (defpackage.it6) r0
            o44 r0 = r0.A
            r0.getClass()
            a54 r1 = r1.X
            if (r1 == 0) goto L1a
            boolean r1 = r1.M(r2)
            return r1
        L1a:
            r1 = 0
            return r1
    }

    public void N(int r1, defpackage.v2 r2, java.lang.String r3, android.os.Bundle r4) {
            r0 = this;
            return
    }

    public defpackage.ou O(defpackage.bt r19) {
            r18 = this;
            r0 = r19
            java.lang.String r1 = "TransportRuntime."
            r2 = r18
            java.lang.Object r2 = r2.B
            hl0 r2 = (defpackage.hl0) r2
            java.lang.Object r3 = r0.B
            java.net.URL r3 = (java.net.URL) r3
            java.lang.String r4 = "CctTransportBackend"
            java.lang.String r5 = "Making request to: %s"
            defpackage.nj2.l(r4, r5, r3)
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            r5 = 30000(0x7530, float:4.2039E-41)
            r3.setConnectTimeout(r5)
            int r5 = r2.g
            r3.setReadTimeout(r5)
            r5 = 1
            r3.setDoOutput(r5)
            r5 = 0
            r3.setInstanceFollowRedirects(r5)
            java.lang.String r5 = "POST"
            r3.setRequestMethod(r5)
            java.lang.String r5 = "User-Agent"
            java.lang.String r6 = "datatransport/2.3.3 android/"
            r3.setRequestProperty(r5, r6)
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.setRequestProperty(r5, r6)
            java.lang.String r7 = "application/json"
            java.lang.String r8 = "Content-Type"
            r3.setRequestProperty(r8, r7)
            java.lang.String r7 = "Accept-Encoding"
            r3.setRequestProperty(r7, r6)
            java.lang.Object r7 = r0.R
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L57
            java.lang.String r9 = "X-Goog-Api-Key"
            r3.setRequestProperty(r9, r7)
        L57:
            java.io.OutputStream r10 = r3.getOutputStream()     // Catch: java.io.IOException -> L9a defpackage.d42 -> L9d java.net.UnknownHostException -> La0 java.net.ConnectException -> La6
            java.util.zip.GZIPOutputStream r11 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L15e
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L15e
            s63 r2 = r2.a     // Catch: java.lang.Throwable -> L160
            java.lang.Object r0 = r0.L     // Catch: java.lang.Throwable -> L160
            rx r0 = (defpackage.rx) r0     // Catch: java.lang.Throwable -> L160
            java.io.BufferedWriter r13 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L160
            java.io.OutputStreamWriter r12 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L160
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L160
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L160
            uf3 r12 = new uf3     // Catch: java.lang.Throwable -> L160
            java.lang.Object r2 = r2.B     // Catch: java.lang.Throwable -> L160
            xd3 r2 = (defpackage.xd3) r2     // Catch: java.lang.Throwable -> L160
            java.util.HashMap r14 = r2.a     // Catch: java.lang.Throwable -> L160
            java.util.HashMap r7 = r2.b     // Catch: java.lang.Throwable -> L160
            ud3 r9 = r2.c     // Catch: java.lang.Throwable -> L160
            boolean r2 = r2.d     // Catch: java.lang.Throwable -> L160
            r17 = r2
            r15 = r7
            r16 = r9
            r12.<init>(r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L160
            r12.a(r0)     // Catch: java.lang.Throwable -> L160
            r12.c()     // Catch: java.lang.Throwable -> L160
            android.util.JsonWriter r0 = r12.b     // Catch: java.lang.Throwable -> L160
            r0.flush()     // Catch: java.lang.Throwable -> L160
            r11.close()     // Catch: java.lang.Throwable -> L15e
            if (r10 == 0) goto La8
            r10.close()     // Catch: java.io.IOException -> L9a defpackage.d42 -> L9d java.net.UnknownHostException -> La0 java.net.ConnectException -> La6
            goto La8
        L9a:
            r0 = move-exception
            goto L16b
        L9d:
            r0 = move-exception
            goto L16b
        La0:
            r0 = move-exception
        La1:
            r2 = 0
            r6 = 0
            goto L17f
        La6:
            r0 = move-exception
            goto La1
        La8:
            int r0 = r3.getResponseCode()
            java.lang.String r2 = "Status Code: "
            java.lang.String r2 = defpackage.lb1.g(r0, r2)
            java.lang.String r7 = r1.concat(r4)
            android.util.Log.i(r7, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "Content-Type: "
            r2.<init>(r7)
            java.lang.String r7 = r3.getHeaderField(r8)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r7 = r1.concat(r4)
            android.util.Log.i(r7, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "Content-Encoding: "
            r2.<init>(r7)
            java.lang.String r7 = r3.getHeaderField(r5)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = r1.concat(r4)
            android.util.Log.i(r1, r2)
            r1 = 302(0x12e, float:4.23E-43)
            if (r0 == r1) goto L14b
            r1 = 301(0x12d, float:4.22E-43)
            if (r0 == r1) goto L14b
            r1 = 307(0x133, float:4.3E-43)
            if (r0 != r1) goto Lf8
            goto L14b
        Lf8:
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 == r1) goto L105
            ou r1 = new ou
            r2 = 0
            r4 = 0
            r1.<init>(r0, r4, r2)
            return r1
        L105:
            java.io.InputStream r1 = r3.getInputStream()
            java.lang.String r2 = r3.getHeaderField(r5)     // Catch: java.lang.Throwable -> L136
            boolean r2 = r6.equals(r2)     // Catch: java.lang.Throwable -> L136
            if (r2 == 0) goto L119
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L136
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L136
            goto L11a
        L119:
            r2 = r1
        L11a:
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L13e
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L13e
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L13e
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L13e
            py r3 = defpackage.py.a(r3)     // Catch: java.lang.Throwable -> L13e
            long r3 = r3.a     // Catch: java.lang.Throwable -> L13e
            ou r5 = new ou     // Catch: java.lang.Throwable -> L13e
            r6 = 0
            r5.<init>(r0, r6, r3)     // Catch: java.lang.Throwable -> L13e
            if (r2 == 0) goto L138
            r2.close()     // Catch: java.lang.Throwable -> L136
            goto L138
        L136:
            r0 = move-exception
            goto L145
        L138:
            if (r1 == 0) goto L13d
            r1.close()
        L13d:
            return r5
        L13e:
            r0 = move-exception
            if (r2 == 0) goto L144
            r2.close()     // Catch: java.lang.Throwable -> L144
        L144:
            throw r0     // Catch: java.lang.Throwable -> L136
        L145:
            if (r1 == 0) goto L14a
            r1.close()     // Catch: java.lang.Throwable -> L14a
        L14a:
            throw r0
        L14b:
            java.lang.String r1 = "Location"
            java.lang.String r1 = r3.getHeaderField(r1)
            ou r2 = new ou
            java.net.URL r3 = new java.net.URL
            r3.<init>(r1)
            r4 = 0
            r2.<init>(r0, r3, r4)
            return r2
        L15e:
            r0 = move-exception
            goto L165
        L160:
            r0 = move-exception
            r11.close()     // Catch: java.lang.Throwable -> L164
        L164:
            throw r0     // Catch: java.lang.Throwable -> L15e
        L165:
            if (r10 == 0) goto L16a
            r10.close()     // Catch: java.lang.Throwable -> L16a
        L16a:
            throw r0     // Catch: java.io.IOException -> L9a defpackage.d42 -> L9d java.net.UnknownHostException -> La0 java.net.ConnectException -> La6
        L16b:
            java.lang.String r2 = "Couldn't encode request, returning with 400"
            java.lang.String r1 = r1.concat(r4)
            android.util.Log.e(r1, r2, r0)
            ou r0 = new ou
            r1 = 400(0x190, float:5.6E-43)
            r2 = 0
            r6 = 0
            r0.<init>(r1, r6, r2)
            goto L18f
        L17f:
            java.lang.String r5 = "Couldn't open connection, returning with 500"
            java.lang.String r1 = r1.concat(r4)
            android.util.Log.e(r1, r5, r0)
            ou r0 = new ou
            r1 = 500(0x1f4, float:7.0E-43)
            r0.<init>(r1, r6, r2)
        L18f:
            return r0
    }

    public long P(defpackage.qh1 r9, defpackage.oy4 r10) {
            r8 = this;
            java.lang.Object r8 = r8.B
            android.view.ViewConfiguration r8 = (android.view.ViewConfiguration) r8
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 1115684864(0x42800000, float:64.0)
            r2 = 26
            if (r0 <= r2) goto L11
            float r3 = defpackage.pt0.l(r8)
            goto L15
        L11:
            float r3 = r9.e0(r1)
        L15:
            float r3 = -r3
            if (r0 <= r2) goto L1d
            float r8 = defpackage.pt0.i(r8)
            goto L21
        L1d:
            float r8 = r9.e0(r1)
        L21:
            float r8 = -r8
            java.util.List r9 = r10.a
            jk4 r10 = new jk4
            r0 = 0
            r10.<init>(r0)
            int r0 = r9.size()
            r1 = 0
        L30:
            long r4 = r10.a
            if (r1 >= r0) goto L48
            java.lang.Object r10 = r9.get(r1)
            vy4 r10 = (defpackage.vy4) r10
            long r6 = r10.j
            long r4 = defpackage.jk4.f(r4, r6)
            jk4 r10 = new jk4
            r10.<init>(r4)
            int r1 = r1 + 1
            goto L30
        L48:
            r9 = 32
            long r0 = r4 >> r9
            int r10 = (int) r0
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r10 = r10 * r8
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r0
            int r8 = (int) r4
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = r8 * r3
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r2 = (long) r10
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r4 = (long) r8
            long r8 = r2 << r9
            long r0 = r0 & r4
            long r8 = r8 | r0
            return r8
    }

    public void Q(float r7, float r8, float r9, float r10, int r11) {
            r6 = this;
            java.lang.Object r6 = r6.B
            bt r6 = (defpackage.bt) r6
            xj0 r0 = r6.G()
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.n(r1, r2, r3, r4, r5)
            return
    }

    public defpackage.v2 R(int r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public void S() {
            r0 = this;
            java.lang.Object r0 = r0.B
            zx0 r0 = (defpackage.zx0) r0
            r0.getClass()
            return
    }

    public byte[] T(byte[] r5, byte[] r6) {
            r4 = this;
            byte[] r4 = r4.V(r5, r6)     // Catch: java.security.GeneralSecurityException -> L5 java.security.ProviderException -> L7
            return r4
        L5:
            r0 = move-exception
            goto L8
        L7:
            r0 = move-exception
        L8:
            java.lang.String r1 = "os0"
            java.lang.String r2 = "encountered a potentially transient KeyStore error, will wait and retry"
            android.util.Log.w(r1, r2, r0)
            double r0 = java.lang.Math.random()
            r2 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L1b
        L1b:
            byte[] r4 = r4.V(r5, r6)
            return r4
    }

    @Override // defpackage.zk4
    public defpackage.vu7 U(android.view.View r2, defpackage.vu7 r3) {
            r1 = this;
            java.lang.Object r1 = r1.B
            o60 r1 = (defpackage.o60) r1
            n60 r2 = r1.j0
            if (r2 == 0) goto Lf
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r1.Z
            java.util.ArrayList r0 = r0.Y
            r0.remove(r2)
        Lf:
            n60 r2 = new n60
            android.widget.FrameLayout r0 = r1.f0
            r2.<init>(r0, r3)
            r1.j0 = r2
            android.view.Window r0 = r1.getWindow()
            r2.e(r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = r1.Z
            n60 r1 = r1.j0
            java.util.ArrayList r2 = r2.Y
            boolean r0 = r2.contains(r1)
            if (r0 != 0) goto L2e
            r2.add(r1)
        L2e:
            return r3
    }

    public byte[] V(byte[] r5, byte[] r6) {
            r4 = this;
            int r0 = r5.length
            r1 = 28
            if (r0 < r1) goto L27
            javax.crypto.spec.GCMParameterSpec r0 = new javax.crypto.spec.GCMParameterSpec
            r1 = 128(0x80, float:1.8E-43)
            r2 = 0
            r3 = 12
            r0.<init>(r1, r5, r2, r3)
            java.lang.String r1 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r1)
            java.lang.Object r4 = r4.B
            javax.crypto.SecretKey r4 = (javax.crypto.SecretKey) r4
            r2 = 2
            r1.init(r2, r4, r0)
            r1.updateAAD(r6)
            int r4 = r5.length
            int r4 = r4 - r3
            byte[] r4 = r1.doFinal(r5, r3, r4)
            return r4
        L27:
            java.lang.String r4 = "ciphertext too short"
            defpackage.e41.v(r4)
            r4 = 0
            return r4
    }

    public byte[] W(byte[] r8, byte[] r9) {
            r7 = this;
            int r0 = r8.length
            r1 = 2147483619(0x7fffffe3, float:NaN)
            if (r0 > r1) goto L2f
            int r0 = r8.length
            int r0 = r0 + 28
            byte[] r5 = new byte[r0]
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)
            java.lang.Object r7 = r7.B
            javax.crypto.SecretKey r7 = (javax.crypto.SecretKey) r7
            r0 = 1
            r1.init(r0, r7)
            r1.updateAAD(r9)
            int r4 = r8.length
            r6 = 12
            r3 = 0
            r2 = r8
            r1.doFinal(r2, r3, r4, r5, r6)
            byte[] r7 = r1.getIV()
            r8 = 12
            r9 = 0
            java.lang.System.arraycopy(r7, r9, r5, r9, r8)
            return r5
        L2f:
            java.lang.String r7 = "plaintext too long"
            defpackage.e41.v(r7)
            r7 = 0
            return r7
    }

    public defpackage.v2 X(int r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public defpackage.qo7 Z(defpackage.ar0 r3) {
            r2 = this;
            java.lang.Object r2 = r2.B
            eb r2 = (defpackage.eb) r2
            java.lang.String r0 = r3.b()
            if (r0 == 0) goto L15
            java.lang.String r1 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r0 = r1.concat(r0)
            qo7 r2 = r2.G(r3, r0)
            return r2
        L15:
            java.lang.String r2 = "Local and anonymous classes can not be ViewModels"
            defpackage.i.h(r2)
            r2 = 0
            return r2
    }

    @Override // defpackage.r23
    public java.nio.ByteBuffer a() {
            r0 = this;
            java.lang.Object r0 = r0.B
            android.media.Image$Plane r0 = (android.media.Image.Plane) r0
            java.nio.ByteBuffer r0 = r0.getBuffer()
            return r0
    }

    public synchronized defpackage.os0 a0(java.lang.String r7) {
            r6 = this;
            monitor-enter(r6)
            os0 r0 = new os0     // Catch: java.lang.Throwable -> L4a
            java.lang.String r7 = defpackage.kk7.b(r7)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r1 = r6.B     // Catch: java.lang.Throwable -> L4a
            java.security.KeyStore r1 = (java.security.KeyStore) r1     // Catch: java.lang.Throwable -> L4a
            r0.<init>(r7, r1)     // Catch: java.lang.Throwable -> L4a
            r7 = 10
            byte[] r7 = defpackage.nd5.a(r7)     // Catch: java.lang.Throwable -> L4a
            r1 = 0
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L4a
            byte[] r2 = r0.W(r7, r1)     // Catch: java.security.GeneralSecurityException -> L1c java.security.ProviderException -> L1e java.lang.Throwable -> L4a
            goto L36
        L1c:
            r2 = move-exception
            goto L1f
        L1e:
            r2 = move-exception
        L1f:
            java.lang.String r3 = "os0"
            java.lang.String r4 = "encountered a potentially transient KeyStore error, will wait and retry"
            android.util.Log.w(r3, r4, r2)     // Catch: java.lang.Throwable -> L4a
            double r2 = java.lang.Math.random()     // Catch: java.lang.Throwable -> L4a
            r4 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r4
            int r2 = (int) r2
            long r2 = (long) r2
            java.lang.Thread.sleep(r2)     // Catch: java.lang.InterruptedException -> L32 java.lang.Throwable -> L4a
        L32:
            byte[] r2 = r0.W(r7, r1)     // Catch: java.lang.Throwable -> L4a
        L36:
            byte[] r1 = r0.T(r2, r1)     // Catch: java.lang.Throwable -> L4a
            boolean r7 = java.util.Arrays.equals(r7, r1)     // Catch: java.lang.Throwable -> L4a
            if (r7 == 0) goto L42
            monitor-exit(r6)
            return r0
        L42:
            java.security.KeyStoreException r7 = new java.security.KeyStoreException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = "cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L4a
            throw r7     // Catch: java.lang.Throwable -> L4a
        L4a:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L4a
            throw r7
    }

    public synchronized boolean b0(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            java.lang.String r3 = defpackage.kk7.b(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r0 = r2.B     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L11
            java.security.KeyStore r0 = (java.security.KeyStore) r0     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L11
            boolean r3 = r0.containsAlias(r3)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L11
            monitor-exit(r2)
            return r3
        Lf:
            r3 = move-exception
            goto L3c
        L11:
            java.lang.String r0 = "os0"
            java.lang.String r1 = "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again."
            android.util.Log.w(r0, r1)     // Catch: java.lang.Throwable -> Lf
            r0 = 20
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L2a java.lang.InterruptedException -> L2c
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L2a java.lang.InterruptedException -> L2c
            r2.B = r0     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L2a java.lang.InterruptedException -> L2c
            r1 = 0
            r0.load(r1)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L2a java.lang.InterruptedException -> L2c
            goto L2c
        L2a:
            r3 = move-exception
            goto L36
        L2c:
            java.lang.Object r0 = r2.B     // Catch: java.lang.Throwable -> Lf
            java.security.KeyStore r0 = (java.security.KeyStore) r0     // Catch: java.lang.Throwable -> Lf
            boolean r3 = r0.containsAlias(r3)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r3
        L36:
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lf
            throw r0     // Catch: java.lang.Throwable -> Lf
        L3c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @Override // defpackage.q31
    public defpackage.t31 build() {
            r2 = this;
            t31 r0 = new t31
            os0 r1 = new os0
            java.lang.Object r2 = r2.B
            android.view.ContentInfo$Builder r2 = (android.view.ContentInfo.Builder) r2
            android.view.ContentInfo r2 = defpackage.sd0.k(r2)
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public void c0(float r9, float r10, float r11, float r12) {
            r8 = this;
            java.lang.Object r8 = r8.B
            bt r8 = (defpackage.bt) r8
            xj0 r0 = r8.G()
            long r1 = r8.L()
            r3 = 32
            long r1 = r1 >> r3
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r11 = r11 + r9
            float r1 = r1 - r11
            long r4 = r8.L()
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r11 = (int) r4
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r12 = r12 + r10
            float r11 = r11 - r12
            int r12 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r12
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r11 = (long) r11
            long r1 = r1 << r3
            long r11 = r11 & r6
            long r11 = r11 | r1
            long r1 = r11 >> r3
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L4c
            long r3 = r11 & r6
            int r1 = (int) r3
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L4c
            goto L51
        L4c:
            java.lang.String r1 = "Width and height must be greater than or equal to zero"
            defpackage.o53.a(r1)
        L51:
            r8.Y(r11)
            r0.o(r9, r10)
            return
    }

    @Override // defpackage.a54
    public void d(defpackage.i44 r3, boolean r4) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.it6
            if (r0 == 0) goto L11
            r0 = r3
            it6 r0 = (defpackage.it6) r0
            i44 r0 = r0.z
            i44 r0 = r0.k()
            r1 = 0
            r0.c(r1)
        L11:
            java.lang.Object r2 = r2.B
            g8 r2 = (defpackage.g8) r2
            a54 r2 = r2.X
            if (r2 == 0) goto L1c
            r2.d(r3, r4)
        L1c:
            return
    }

    public boolean d0(int r1, int r2, android.os.Bundle r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    public void e0(float r5, long r6) {
            r4 = this;
            java.lang.Object r4 = r4.B
            bt r4 = (defpackage.bt) r4
            xj0 r4 = r4.G()
            r0 = 32
            long r0 = r6 >> r0
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r7 = java.lang.Float.intBitsToFloat(r6)
            r4.o(r1, r7)
            r4.c(r5)
            float r5 = java.lang.Float.intBitsToFloat(r0)
            float r5 = -r5
            float r6 = java.lang.Float.intBitsToFloat(r6)
            float r6 = -r6
            r4.o(r5, r6)
            return
    }

    public void f0(float r5, float r6, long r7) {
            r4 = this;
            java.lang.Object r4 = r4.B
            bt r4 = (defpackage.bt) r4
            xj0 r4 = r4.G()
            r0 = 32
            long r0 = r7 >> r0
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            r4.o(r1, r8)
            r4.b(r5, r6)
            float r5 = java.lang.Float.intBitsToFloat(r0)
            float r5 = -r5
            float r6 = java.lang.Float.intBitsToFloat(r7)
            float r6 = -r6
            r4.o(r5, r6)
            return
    }

    public void g0(float r1, float r2) {
            r0 = this;
            java.lang.Object r0 = r0.B
            bt r0 = (defpackage.bt) r0
            xj0 r0 = r0.G()
            r0.o(r1, r2)
            return
    }

    public void h0(int r2, boolean r3) {
            r1 = this;
            java.lang.Object r1 = r1.B
            ms0 r1 = (defpackage.ms0) r1
            r0 = 0
            r1.r(r2, r0)
            byte r2 = (byte) r3
            r1.k(r2)
            return
    }

    public void i0(int r2, defpackage.ea0 r3) {
            r1 = this;
            java.lang.Object r1 = r1.B
            ms0 r1 = (defpackage.ms0) r1
            r0 = 2
            r1.r(r2, r0)
            int r2 = r3.size()
            r1.s(r2)
            ca0 r3 = (defpackage.ca0) r3
            byte[] r2 = r3.R
            int r0 = r3.g()
            int r3 = r3.size()
            r1.l(r2, r0, r3)
            return
    }

    public void j0(int r1, double r2) {
            r0 = this;
            java.lang.Object r0 = r0.B
            ms0 r0 = (defpackage.ms0) r0
            r0.getClass()
            long r2 = java.lang.Double.doubleToRawLongBits(r2)
            r0.o(r1, r2)
            return
    }

    @Override // defpackage.s31
    public int k() {
            r0 = this;
            java.lang.Object r0 = r0.B
            android.view.ContentInfo r0 = (android.view.ContentInfo) r0
            int r0 = defpackage.sd0.A(r0)
            return r0
    }

    public void k0(int r2, int r3) {
            r1 = this;
            java.lang.Object r1 = r1.B
            ms0 r1 = (defpackage.ms0) r1
            r0 = 0
            r1.r(r2, r0)
            r1.q(r3)
            return
    }

    @Override // defpackage.s31
    public android.content.ClipData l() {
            r0 = this;
            java.lang.Object r0 = r0.B
            android.view.ContentInfo r0 = (android.view.ContentInfo) r0
            android.content.ClipData r0 = defpackage.sd0.c(r0)
            return r0
    }

    public void l0(int r1, int r2) {
            r0 = this;
            java.lang.Object r0 = r0.B
            ms0 r0 = (defpackage.ms0) r0
            r0.m(r1, r2)
            return
    }

    @Override // defpackage.r23
    public int m() {
            r0 = this;
            java.lang.Object r0 = r0.B
            android.media.Image$Plane r0 = (android.media.Image.Plane) r0
            int r0 = r0.getRowStride()
            return r0
    }

    public void m0(int r1, long r2) {
            r0 = this;
            java.lang.Object r0 = r0.B
            ms0 r0 = (defpackage.ms0) r0
            r0.o(r1, r2)
            return
    }

    @Override // defpackage.g44
    public boolean n(defpackage.i44 r4, android.view.MenuItem r5) {
            r3 = this;
            java.lang.Object r3 = r3.B
            androidx.appcompat.widget.ActionMenuView r3 = (androidx.appcompat.widget.ActionMenuView) r3
            j8 r3 = r3.z0
            r4 = 0
            if (r3 == 0) goto L41
            r9 r3 = (defpackage.r9) r3
            androidx.appcompat.widget.Toolbar r3 = r3.A
            m44 r0 = r3.F0
            java.lang.Object r0 = r0.L
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            fl2 r1 = (defpackage.fl2) r1
            androidx.fragment.app.u r1 = r1.a
            boolean r1 = r1.p(r5)
            if (r1 == 0) goto L17
            r3 = r2
            goto L3e
        L2e:
            f87 r3 = r3.H0
            if (r3 == 0) goto L3d
            h87 r3 = (defpackage.h87) r3
            i87 r3 = r3.A
            android.view.Window$Callback r3 = r3.m
            boolean r3 = r3.onMenuItemSelected(r4, r5)
            goto L3e
        L3d:
            r3 = r4
        L3e:
            if (r3 == 0) goto L41
            return r2
        L41:
            return r4
    }

    public void n0(int r1, float r2) {
            r0 = this;
            java.lang.Object r0 = r0.B
            ms0 r0 = (defpackage.ms0) r0
            r0.getClass()
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            r0.m(r1, r2)
            return
    }

    @Override // defpackage.n44
    public void o(defpackage.i44 r1, android.view.MenuItem r2) {
            r0 = this;
            java.lang.Object r0 = r0.B
            gl0 r0 = (defpackage.gl0) r0
            android.os.Handler r0 = r0.Y
            r0.removeCallbacksAndMessages(r1)
            return
    }

    public void o0(int r2, java.lang.Object r3, defpackage.j66 r4) {
            r1 = this;
            java.lang.Object r1 = r1.B
            ms0 r1 = (defpackage.ms0) r1
            c1 r3 = (defpackage.c1) r3
            r0 = 3
            r1.r(r2, r0)
            os0 r0 = r1.a
            r4.e(r3, r0)
            r3 = 4
            r1.r(r2, r3)
            return
    }

    @Override // defpackage.bi4
    public void onError(java.lang.Throwable r3) {
            r2 = this;
            r3.getClass()
            java.lang.Object r2 = r2.B
            gh0 r2 = (defpackage.gh0) r2
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.l
            boolean r0 = r0.get()
            if (r0 != 0) goto L10
            goto L1e
        L10:
            java.lang.String r0 = "CameraPresencePrvdr"
            java.lang.String r1 = "Error from source camera presence observable. Triggering refresh."
            defpackage.kj2.w(r0, r1, r3)
            bx4 r2 = r2.h
            if (r2 == 0) goto L1e
            r2.a()
        L1e:
            return
    }

    @Override // defpackage.yd5
    public defpackage.yy0 p() {
            r0 = this;
            java.lang.Object r0 = r0.B
            yy0 r0 = (defpackage.yy0) r0
            return r0
    }

    public void p0(int r2, int r3) {
            r1 = this;
            java.lang.Object r1 = r1.B
            ms0 r1 = (defpackage.ms0) r1
            r0 = 0
            r1.r(r2, r0)
            r1.q(r3)
            return
    }

    public void q0(int r1, long r2) {
            r0 = this;
            java.lang.Object r0 = r0.B
            ms0 r0 = (defpackage.ms0) r0
            r0.t(r1, r2)
            return
    }

    public void r0(int r3, java.lang.Object r4, defpackage.j66 r5) {
            r2 = this;
            java.lang.Object r2 = r2.B
            ms0 r2 = (defpackage.ms0) r2
            c1 r4 = (defpackage.c1) r4
            r0 = 2
            r2.r(r3, r0)
            r4.getClass()
            r3 = r4
            pr2 r3 = (defpackage.pr2) r3
            int r0 = r3.memoizedSerializedSize
            r1 = -1
            if (r0 != r1) goto L1b
            int r0 = r5.i(r4)
            r3.memoizedSerializedSize = r0
        L1b:
            r2.s(r0)
            os0 r2 = r2.a
            r5.e(r4, r2)
            return
    }

    @Override // defpackage.q31
    public void s(android.net.Uri r1) {
            r0 = this;
            java.lang.Object r0 = r0.B
            android.view.ContentInfo$Builder r0 = (android.view.ContentInfo.Builder) r0
            defpackage.sd0.v(r0, r1)
            return
    }

    public void s0(int r1, int r2) {
            r0 = this;
            java.lang.Object r0 = r0.B
            ms0 r0 = (defpackage.ms0) r0
            r0.m(r1, r2)
            return
    }

    @Override // defpackage.q31
    public void setExtras(android.os.Bundle r1) {
            r0 = this;
            java.lang.Object r0 = r0.B
            android.view.ContentInfo$Builder r0 = (android.view.ContentInfo.Builder) r0
            defpackage.sd0.w(r0, r1)
            return
    }

    public void t0(int r1, long r2) {
            r0 = this;
            java.lang.Object r0 = r0.B
            ms0 r0 = (defpackage.ms0) r0
            r0.o(r1, r2)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 29: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentInfoCompat{"
            r0.<init>(r1)
            java.lang.Object r2 = r2.B
            android.view.ContentInfo r2 = (android.view.ContentInfo) r2
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.bi4
    public void u(java.lang.Object r10) {
            r9 = this;
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r0 = r9.B
            gh0 r0 = (defpackage.gh0) r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.l
            boolean r0 = r0.get()
            if (r0 != 0) goto L10
            goto L29c
        L10:
            java.lang.Object r0 = r9.B
            gh0 r0 = (defpackage.gh0) r0
            if0 r1 = r0.f
            if (r1 != 0) goto L1a
            goto L29c
        L1a:
            kh0 r2 = r0.g
            if (r2 != 0) goto L20
            goto L29c
        L20:
            g60 r0 = r0.i
            if (r0 != 0) goto L26
            goto L29c
        L26:
            r3 = 10
            if (r10 == 0) goto L4b
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = defpackage.ht0.v0(r10, r3)
            r4.<init>(r5)
            java.util.Iterator r10 = r10.iterator()
        L37:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r10.next()
            yf0 r5 = (defpackage.yf0) r5
            java.lang.String r5 = r5.a()
            r4.add(r5)
            goto L37
        L4b:
            yt1 r4 = defpackage.yt1.A
        L4d:
            r10 = 0
            java.lang.Object r5 = r9.B     // Catch: java.lang.Exception -> L8d
            gh0 r5 = (defpackage.gh0) r5     // Catch: java.lang.Exception -> L8d
            java.util.List r5 = r5.k     // Catch: java.lang.Exception -> L8d
            java.lang.Object r6 = r1.k     // Catch: java.lang.Exception -> L8d
            java.util.concurrent.atomic.AtomicBoolean r6 = (java.util.concurrent.atomic.AtomicBoolean) r6     // Catch: java.lang.Exception -> L8d
            boolean r6 = r6.get()     // Catch: java.lang.Exception -> L8d
            if (r6 == 0) goto L61
            yt1 r6 = defpackage.yt1.A     // Catch: java.lang.Exception -> L8d
            goto L69
        L61:
            java.util.LinkedHashSet r6 = r1.b(r4)     // Catch: java.lang.Exception -> L8d
            java.util.List r6 = defpackage.gt0.k1(r6)     // Catch: java.lang.Exception -> L8d
        L69:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Exception -> L8d
            int r8 = defpackage.ht0.v0(r6, r3)     // Catch: java.lang.Exception -> L8d
            r7.<init>(r8)     // Catch: java.lang.Exception -> L8d
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Exception -> L8d
        L76:
            boolean r8 = r6.hasNext()     // Catch: java.lang.Exception -> L8d
            if (r8 == 0) goto L8f
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Exception -> L8d
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L8d
            r8.getClass()     // Catch: java.lang.Exception -> L8d
            yf0 r8 = defpackage.nc1.J(r8, r10, r10)     // Catch: java.lang.Exception -> L8d
            r7.add(r8)     // Catch: java.lang.Exception -> L8d
            goto L76
        L8d:
            r0 = move-exception
            goto Lb8
        L8f:
            java.util.Set r5 = defpackage.gt0.p1(r5)     // Catch: java.lang.Exception -> L8d
            java.util.Set r6 = defpackage.gt0.p1(r7)     // Catch: java.lang.Exception -> L8d
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch: java.lang.Exception -> L8d
            java.util.Set r5 = defpackage.ii2.F(r5, r6)     // Catch: java.lang.Exception -> L8d
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Exception -> L8d
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Exception -> L8d
            if (r6 != 0) goto Lbf
            java.util.LinkedHashSet r2 = r2.c()     // Catch: java.lang.Exception -> L8d
            boolean r0 = r0.c(r2, r5)     // Catch: java.lang.Exception -> L8d
            if (r0 == 0) goto Lbf
            java.lang.String r0 = "CameraPresencePrvdr"
            java.lang.String r2 = "Camera removal update invalid. Aborting."
            defpackage.kj2.f0(r0, r2)     // Catch: java.lang.Exception -> L8d
            return
        Lb8:
            java.lang.String r2 = "CameraPresencePrvdr"
            java.lang.String r5 = "Failed to interrogate camera factory. Falling back to full update."
            defpackage.kj2.g0(r2, r5, r0)
        Lbf:
            r1.h(r4)     // Catch: java.lang.Exception -> L294
            java.util.Set r0 = r1.e()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = defpackage.ht0.v0(r0, r3)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        Ld5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lec
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            yf0 r2 = defpackage.nc1.J(r2, r10, r10)
            r1.add(r2)
            goto Ld5
        Lec:
            java.lang.Object r0 = r9.B
            gh0 r0 = (defpackage.gh0) r0
            java.util.List r0 = r0.k
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lfa
            goto L29c
        Lfa:
            java.lang.Object r9 = r9.B
            gh0 r9 = (defpackage.gh0) r9
            java.util.List r0 = r9.k
            java.util.List r0 = defpackage.gt0.k1(r0)
            boolean r2 = r1.equals(r0)
            if (r2 == 0) goto L10c
            goto L29c
        L10c:
            java.lang.Object r2 = r9.d
            monitor-enter(r2)
            java.util.concurrent.ScheduledFuture r4 = r9.e     // Catch: java.lang.Throwable -> L126
            r5 = 0
            if (r4 == 0) goto L129
            java.lang.String r4 = "CameraPresencePrvdr"
            java.lang.String r6 = "Camera list updated. Cancelling any pending retries."
            defpackage.kj2.t(r4, r6)     // Catch: java.lang.Throwable -> L126
            java.util.concurrent.ScheduledFuture r4 = r9.e     // Catch: java.lang.Throwable -> L126
            r4.getClass()     // Catch: java.lang.Throwable -> L126
            r4.cancel(r5)     // Catch: java.lang.Throwable -> L126
            r9.e = r10     // Catch: java.lang.Throwable -> L126
            goto L129
        L126:
            r9 = move-exception
            goto L292
        L129:
            monitor-exit(r2)
            java.util.Set r10 = defpackage.gt0.p1(r0)
            java.util.Set r2 = defpackage.gt0.p1(r1)
            r4 = r10
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Set r4 = defpackage.ii2.F(r2, r4)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Set r10 = defpackage.ii2.F(r10, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = defpackage.ht0.v0(r1, r3)
            r6.<init>(r7)
            int r7 = r1.size()
        L151:
            if (r5 >= r7) goto L163
            java.lang.Object r8 = r1.get(r5)
            int r5 = r5 + 1
            yf0 r8 = (defpackage.yf0) r8
            java.lang.String r8 = r8.a()
            r6.add(r8)
            goto L151
        L163:
            r5 = r10
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Exception -> L17e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L17e
        L16a:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Exception -> L17e
            if (r7 == 0) goto L181
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Exception -> L17e
            yf0 r7 = (defpackage.yf0) r7     // Catch: java.lang.Exception -> L17e
            java.lang.String r7 = r7.a()     // Catch: java.lang.Exception -> L17e
            r9.c(r7)     // Catch: java.lang.Exception -> L17e
            goto L16a
        L17e:
            r1 = move-exception
            goto L1fd
        L181:
            kh0 r5 = r9.g     // Catch: java.lang.Exception -> L17e
            if (r5 == 0) goto L199
            java.lang.String r7 = "CameraPresencePrvdr"
            java.lang.String r8 = "Updating CameraRepository..."
            defpackage.kj2.t(r7, r8)     // Catch: java.lang.Exception -> L17e
            r5.a(r6)     // Catch: java.lang.Exception -> L17e
            r2.add(r5)     // Catch: java.lang.Exception -> L17e
            java.lang.String r5 = "CameraPresencePrvdr"
            java.lang.String r7 = "CameraRepository updated successfully."
            defpackage.kj2.t(r5, r7)     // Catch: java.lang.Exception -> L17e
        L199:
            java.util.concurrent.CopyOnWriteArrayList r5 = r9.m     // Catch: java.lang.Exception -> L17e
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Exception -> L17e
            if (r5 != 0) goto L1db
            java.lang.String r5 = "CameraPresencePrvdr"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L17e
            r7.<init>()     // Catch: java.lang.Exception -> L17e
            java.lang.String r8 = "Updating "
            r7.append(r8)     // Catch: java.lang.Exception -> L17e
            java.util.concurrent.CopyOnWriteArrayList r8 = r9.m     // Catch: java.lang.Exception -> L17e
            int r8 = r8.size()     // Catch: java.lang.Exception -> L17e
            r7.append(r8)     // Catch: java.lang.Exception -> L17e
            java.lang.String r8 = " dependent listeners..."
            r7.append(r8)     // Catch: java.lang.Exception -> L17e
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L17e
            defpackage.kj2.t(r5, r7)     // Catch: java.lang.Exception -> L17e
            java.util.concurrent.CopyOnWriteArrayList r5 = r9.m     // Catch: java.lang.Exception -> L17e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Exception -> L17e
        L1c8:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Exception -> L17e
            if (r7 == 0) goto L1db
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Exception -> L17e
            ia3 r7 = (defpackage.ia3) r7     // Catch: java.lang.Exception -> L17e
            r7.a(r6)     // Catch: java.lang.Exception -> L17e
            r2.add(r7)     // Catch: java.lang.Exception -> L17e
            goto L1c8
        L1db:
            r9.k = r1     // Catch: java.lang.Exception -> L17e
            r1 = r4
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Exception -> L17e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L17e
        L1e4:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Exception -> L17e
            if (r5 == 0) goto L1f8
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Exception -> L17e
            yf0 r5 = (defpackage.yf0) r5     // Catch: java.lang.Exception -> L17e
            java.lang.String r5 = r5.a()     // Catch: java.lang.Exception -> L17e
            r9.a(r5)     // Catch: java.lang.Exception -> L17e
            goto L1e4
        L1f8:
            r9.b(r4, r10)     // Catch: java.lang.Exception -> L17e
            goto L29c
        L1fd:
            java.lang.String r5 = "CameraPresencePrvdr"
            java.lang.String r6 = "A core module failed to update. Rolling back changes."
            defpackage.kj2.w(r5, r6, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = defpackage.ht0.v0(r0, r3)
            r1.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L211:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L225
            java.lang.Object r3 = r0.next()
            yf0 r3 = (defpackage.yf0) r3
            java.lang.String r3 = r3.a()
            r1.add(r3)
            goto L211
        L225:
            rp5 r0 = new rp5
            r0.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L22e:
            r2 = r0
            qp5 r2 = (defpackage.qp5) r2
            java.lang.Object r3 = r2.B
            java.util.ListIterator r3 = (java.util.ListIterator) r3
            boolean r3 = r3.hasPrevious()
            if (r3 == 0) goto L25e
            java.lang.Object r2 = r2.B
            java.util.ListIterator r2 = (java.util.ListIterator) r2
            java.lang.Object r2 = r2.previous()
            ia3 r2 = (defpackage.ia3) r2
            r2.a(r1)     // Catch: java.lang.Exception -> L249
            goto L22e
        L249:
            r3 = move-exception
            java.lang.String r5 = "CameraPresencePrvdr"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Failed to rollback listener: "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            defpackage.kj2.w(r5, r2, r3)
            goto L22e
        L25e:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L264:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L278
            java.lang.Object r0 = r10.next()
            yf0 r0 = (defpackage.yf0) r0
            java.lang.String r0 = r0.a()
            r9.a(r0)
            goto L264
        L278:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r10 = r4.iterator()
        L27e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L29c
            java.lang.Object r0 = r10.next()
            yf0 r0 = (defpackage.yf0) r0
            java.lang.String r0 = r0.a()
            r9.c(r0)
            goto L27e
        L292:
            monitor-exit(r2)
            throw r9
        L294:
            r9 = move-exception
            java.lang.String r10 = "CameraPresencePrvdr"
            java.lang.String r0 = "CameraFactory failed to update. The camera list may be stale until the next update."
            defpackage.kj2.g0(r10, r0, r9)
        L29c:
            return
    }

    public void u0(int r2, int r3) {
            r1 = this;
            java.lang.Object r1 = r1.B
            ms0 r1 = (defpackage.ms0) r1
            int r0 = r3 << 1
            int r3 = r3 >> 31
            r3 = r3 ^ r0
            r0 = 0
            r1.r(r2, r0)
            r1.s(r3)
            return
    }

    @Override // defpackage.q31
    public void v(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.B
            android.view.ContentInfo$Builder r0 = (android.view.ContentInfo.Builder) r0
            defpackage.sd0.u(r0, r1)
            return
    }

    public void v0(int r4, long r5) {
            r3 = this;
            java.lang.Object r3 = r3.B
            ms0 r3 = (defpackage.ms0) r3
            r0 = 1
            long r0 = r5 << r0
            r2 = 63
            long r5 = r5 >> r2
            long r5 = r5 ^ r0
            r3.t(r4, r5)
            return
    }

    public void w0(int r2, int r3) {
            r1 = this;
            java.lang.Object r1 = r1.B
            ms0 r1 = (defpackage.ms0) r1
            r0 = 0
            r1.r(r2, r0)
            r1.s(r3)
            return
    }

    public void x0(int r1, long r2) {
            r0 = this;
            java.lang.Object r0 = r0.B
            ms0 r0 = (defpackage.ms0) r0
            r0.t(r1, r2)
            return
    }
}
