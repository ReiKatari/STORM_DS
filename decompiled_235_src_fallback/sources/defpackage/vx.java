package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vx  reason: default package */
/* loaded from: classes.dex */
public final class vx {
    public defpackage.o33 a;
    public defpackage.o33 b;
    public final defpackage.o33 c;
    public final android.util.Size d;
    public final int e;
    public final java.util.ArrayList f;
    public final boolean g;
    public final defpackage.jr1 h;
    public final defpackage.jr1 i;

    public vx(android.util.Size r2, int r3, java.util.ArrayList r4, boolean r5, defpackage.jr1 r6, defpackage.jr1 r7) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.c = r0
            if (r2 == 0) goto L15
            r1.d = r2
            r1.e = r3
            r1.f = r4
            r1.g = r5
            r1.h = r6
            r1.i = r7
            return
        L15:
            java.lang.String r1 = "Null size"
            defpackage.u34.x(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.vx
            r2 = 0
            if (r1 == 0) goto L3a
            vx r5 = (defpackage.vx) r5
            android.util.Size r1 = r4.d
            android.util.Size r3 = r5.d
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3a
            int r1 = r4.e
            int r3 = r5.e
            if (r1 != r3) goto L3a
            java.util.ArrayList r1 = r4.f
            java.util.ArrayList r3 = r5.f
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L3a
            boolean r1 = r4.g
            boolean r3 = r5.g
            if (r1 != r3) goto L3a
            jr1 r1 = r4.h
            jr1 r3 = r5.h
            if (r1 == r3) goto L32
            return r2
        L32:
            jr1 r4 = r4.i
            jr1 r5 = r5.i
            if (r4 == r5) goto L39
            return r2
        L39:
            return r0
        L3a:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            android.util.Size r0 = r3.d
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            int r2 = r3.e
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.ArrayList r2 = r3.f
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            boolean r2 = r3.g
            if (r2 == 0) goto L1e
            r2 = 1231(0x4cf, float:1.725E-42)
            goto L20
        L1e:
            r2 = 1237(0x4d5, float:1.733E-42)
        L20:
            r0 = r0 ^ r2
            r2 = 583896283(0x22cd8cdb, float:5.5714498E-18)
            int r0 = r0 * r2
            jr1 r2 = r3.h
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            jr1 r3 = r3.i
            int r3 = r3.hashCode()
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "In{size="
            r0.<init>(r1)
            android.util.Size r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", inputFormat="
            r0.append(r1)
            int r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", outputFormats="
            r0.append(r1)
            java.util.ArrayList r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", virtualCamera="
            r0.append(r1)
            boolean r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge="
            r0.append(r1)
            jr1 r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", errorEdge="
            r0.append(r1)
            jr1 r2 = r2.i
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
