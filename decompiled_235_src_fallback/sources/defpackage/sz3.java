package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sz3  reason: default package */
/* loaded from: classes.dex */
public interface sz3 {
    defpackage.jk3 b(defpackage.jk3 r1);

    default long c(defpackage.jk3 r4, defpackage.jk3 r5) {
            r3 = this;
            jk3 r4 = r3.b(r4)
            jk3 r3 = r3.b(r5)
            boolean r5 = r4 instanceof defpackage.nz3
            r0 = 0
            r2 = 1
            if (r5 == 0) goto L16
            nz3 r4 = (defpackage.nz3) r4
            long r3 = r4.R(r3, r0, r2)
            return r3
        L16:
            boolean r5 = r3 instanceof defpackage.nz3
            if (r5 == 0) goto L27
            nz3 r3 = (defpackage.nz3) r3
            long r3 = r3.R(r4, r0, r2)
            r0 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r3 = r3 ^ r0
            return r3
        L27:
            long r3 = r4.R(r4, r0, r2)
            return r3
    }
}
