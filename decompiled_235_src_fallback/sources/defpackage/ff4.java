package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff4  reason: default package */
/* loaded from: classes.dex */
public final class ff4 extends defpackage.xk5 {
    public final defpackage.ss2 a;
    public final defpackage.pq6 b;

    public ff4(defpackage.ss2 r1, defpackage.pq6 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.xk5
    public final boolean a(defpackage.m44 r1) {
            r0 = this;
            java.lang.Object r0 = r1.B
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r0 = r0.getScheme()
            java.lang.String r1 = "http"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1b
            java.lang.String r1 = "https"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L19
            goto L1b
        L19:
            r0 = 0
            return r0
        L1b:
            r0 = 1
            return r0
    }

    @Override // defpackage.xk5
    public final int b() {
            r0 = this;
            r0 = 2
            return r0
    }

    @Override // defpackage.xk5
    public final defpackage.aj c(defpackage.m44 r17, int r18) {
            r16 = this;
            r0 = r16
            if (r18 == 0) goto L2b
            boolean r1 = defpackage.ze4.isOfflineOnly(r18)
            if (r1 == 0) goto Ld
            ma0 r1 = defpackage.ma0.o
            goto L2c
        Ld:
            boolean r1 = defpackage.ze4.shouldReadFromDiskCache(r18)
            r3 = r1 ^ 1
            boolean r1 = defpackage.ze4.shouldWriteToDiskCache(r18)
            r4 = r1 ^ 1
            ma0 r2 = new ma0
            r14 = 0
            r15 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = -1
            r11 = -1
            r12 = 0
            r13 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r2
            goto L2c
        L2b:
            r1 = 0
        L2c:
            s9 r2 = new s9
            r3 = 13
            r2.<init>(r3)
            r3 = r17
            java.lang.Object r3 = r3.B
            android.net.Uri r3 = (android.net.Uri) r3
            java.lang.String r3 = r3.toString()
            r2.I(r3)
            if (r1 == 0) goto L45
            r2.l(r1)
        L45:
            pa r1 = new pa
            r1.<init>(r2)
            ss2 r2 = r0.a
            xk4 r2 = r2.B
            r2.getClass()
            je5 r3 = new je5
            r4 = 0
            r3.<init>(r2, r1, r4)
            wl5 r1 = r3.e()
            yl5 r2 = r1.Z
            boolean r3 = r1.m0
            if (r3 == 0) goto Lae
            wl5 r1 = r1.f0
            if (r1 != 0) goto L68
            qw4 r1 = defpackage.qw4.NETWORK
            goto L6a
        L68:
            qw4 r1 = defpackage.qw4.DISK
        L6a:
            qw4 r3 = defpackage.qw4.DISK
            r4 = 0
            if (r1 != r3) goto L84
            long r6 = r2.h()
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L79
            goto L84
        L79:
            r2.close()
            df4 r0 = new df4
            java.lang.String r1 = "Received response with 0 content-length header."
            r0.<init>(r1)
            throw r0
        L84:
            qw4 r3 = defpackage.qw4.NETWORK
            if (r1 != r3) goto La4
            long r6 = r2.h()
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto La4
            long r3 = r2.h()
            pq6 r0 = r0.b
            sk1 r0 = r0.b
            r5 = 4
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            android.os.Message r3 = r0.obtainMessage(r5, r3)
            r0.sendMessage(r3)
        La4:
            aj r0 = new aj
            z80 r2 = r2.n()
            r0.<init>(r2, r1)
            return r0
        Lae:
            r2.close()
            ef4 r0 = new ef4
            int r1 = r1.R
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.xk5
    public final boolean d(android.net.NetworkInfo r1) {
            r0 = this;
            if (r1 == 0) goto Lb
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }
}
