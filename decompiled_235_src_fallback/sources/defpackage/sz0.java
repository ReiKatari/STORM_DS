package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sz0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sz0 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ sz0(defpackage.uz0 r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            return
    }

    public /* synthetic */ sz0(boolean r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r6 = this;
            int r0 = r6.A
            r1 = 1
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r3 = r6.L
            boolean r6 = r6.B
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L33;
                case 2: goto L23;
                default: goto Lc;
            }
        Lc:
            n65 r3 = (defpackage.n65) r3
            if (r6 != 0) goto L1e
            rs4 r6 = r3.e
            float r6 = r6.h()
            r0 = 1056964608(0x3f000000, float:0.5)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 <= 0) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            return r6
        L23:
            ki r3 = (defpackage.ki) r3
            if (r6 == 0) goto L32
            na4 r6 = r3.i()
            if (r6 == 0) goto L32
            of6 r6 = (defpackage.of6) r6
            r6.k(r2)
        L32:
            return r2
        L33:
            on2 r3 = (defpackage.on2) r3
            if (r6 == 0) goto L3a
            r3.c()
        L3a:
            return r2
        L3b:
            uz0 r3 = (defpackage.uz0) r3
            if (r6 == 0) goto L42
            java.lang.String r6 = "reader"
            goto L44
        L42:
            java.lang.String r6 = "writer"
        L44:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Timed out attempting to acquire a "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r6 = " connection."
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            r0.append(r6)
            java.lang.String r6 = "\n\nWriter pool:\n"
            r0.append(r6)
            iz4 r6 = r3.B
            r6.d(r0)
            java.lang.String r6 = "Reader pool:"
            r0.append(r6)
            r6 = 10
            r0.append(r6)
            iz4 r6 = r3.A
            r6.d(r0)
            java.lang.String r6 = r0.toString()
            r0 = 5
            defpackage.ii2.T(r0, r6)     // Catch: android.database.SQLException -> L82
            r6 = 0
            throw r6     // Catch: android.database.SQLException -> L82
        L82:
            r6 = move-exception
            int r0 = r3.Z
            if (r0 == r1) goto L8f
            r1 = 2
            if (r0 == r1) goto L8b
            goto L8e
        L8b:
            r6.printStackTrace()
        L8e:
            return r2
        L8f:
            throw r6
    }
}
