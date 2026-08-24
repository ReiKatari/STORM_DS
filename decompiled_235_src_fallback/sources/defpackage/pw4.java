package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pw4  reason: default package */
/* loaded from: classes.dex */
public final class pw4 extends java.lang.Thread {
    public final java.lang.ref.ReferenceQueue A;
    public final android.os.Handler B;

    public pw4(java.lang.ref.ReferenceQueue r1, android.os.Handler r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r1 = 1
            r0.setDaemon(r1)
            java.lang.String r1 = "Picasso-refQueue"
            r0.setName(r1)
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r4 = this;
            android.os.Handler r0 = r4.B
            r1 = 10
            android.os.Process.setThreadPriority(r1)
        L7:
            java.lang.ref.ReferenceQueue r1 = r4.A     // Catch: java.lang.Exception -> L22 java.lang.InterruptedException -> L32
            r2 = 1000(0x3e8, double:4.94E-321)
            java.lang.ref.Reference r1 = r1.remove(r2)     // Catch: java.lang.Exception -> L22 java.lang.InterruptedException -> L32
            p7 r1 = (defpackage.p7) r1     // Catch: java.lang.Exception -> L22 java.lang.InterruptedException -> L32
            android.os.Message r2 = r0.obtainMessage()     // Catch: java.lang.Exception -> L22 java.lang.InterruptedException -> L32
            if (r1 == 0) goto L24
            r3 = 3
            r2.what = r3     // Catch: java.lang.Exception -> L22 java.lang.InterruptedException -> L32
            i33 r1 = r1.a     // Catch: java.lang.Exception -> L22 java.lang.InterruptedException -> L32
            r2.obj = r1     // Catch: java.lang.Exception -> L22 java.lang.InterruptedException -> L32
            r0.sendMessage(r2)     // Catch: java.lang.Exception -> L22 java.lang.InterruptedException -> L32
            goto L7
        L22:
            r4 = move-exception
            goto L28
        L24:
            r2.recycle()     // Catch: java.lang.Exception -> L22 java.lang.InterruptedException -> L32
            goto L7
        L28:
            g15 r1 = new g15
            r2 = 18
            r1.<init>(r4, r2)
            r0.post(r1)
        L32:
            return
    }
}
