package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fz4  reason: default package */
/* loaded from: classes.dex */
public final class fz4 implements defpackage.gg3 {
    public final defpackage.ar0 a;
    public final defpackage.go3 b;

    public fz4(defpackage.ar0 r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            r2.a = r3
            xr3 r3 = defpackage.xr3.PUBLICATION
            er2 r0 = new er2
            r1 = 14
            r0.<init>(r2, r1)
            go3 r3 = defpackage.kj2.M(r3, r0)
            r2.b = r3
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r5) {
            r4 = this;
            wb6 r0 = r4.e()
            ux0 r5 = r5.c(r0)
            r5.getClass()
            r0 = 0
            r1 = r0
        Ld:
            wb6 r2 = r4.e()
            int r2 = r5.q(r2)
            r3 = -1
            if (r2 == r3) goto L54
            if (r2 == 0) goto L4b
            r3 = 1
            if (r2 == r3) goto L3d
            fc6 r4 = new fc6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid index in polymorphic deserialization of "
            r5.<init>(r0)
            if (r1 != 0) goto L2a
            java.lang.String r1 = "unknown class"
        L2a:
            r5.append(r1)
            java.lang.String r0 = "\n Expected 0, 1 or DECODE_DONE(-1), but found "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L3d:
            if (r1 != 0) goto L47
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Cannot read polymorphic value before its type token"
            r4.<init>(r5)
            throw r4
        L47:
            defpackage.xk2.g(r4, r5, r1)
            throw r0
        L4b:
            wb6 r1 = r4.e()
            java.lang.String r1 = r5.A(r1, r2)
            goto Ld
        L54:
            java.lang.String r4 = "Polymorphic value has not been read for class "
            java.lang.String r4 = defpackage.i61.m(r4, r1)
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r1, java.lang.Object r2) {
            r0 = this;
            r2.getClass()
            defpackage.xk2.h(r0, r1, r2)
            r0 = 0
            throw r0
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            go3 r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            wb6 r0 = (defpackage.wb6) r0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "kotlinx.serialization.PolymorphicSerializer(baseClass: "
            r0.<init>(r1)
            ar0 r2 = r2.a
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
