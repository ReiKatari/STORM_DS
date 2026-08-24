package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u04  reason: default package */
/* loaded from: classes.dex */
public final class u04 extends defpackage.a55 {
    public final long g0;

    public u04(defpackage.o45 r1, defpackage.e55 r2, long r3, defpackage.wb6 r5) {
            r0 = this;
            r5.getClass()
            r0.<init>(r1, r2, r5)
            r0.g0 = r3
            return
    }

    @Override // defpackage.a55
    public final long x0(defpackage.wb6 r3, int r4) {
            r2 = this;
            r3.getClass()
            int r4 = r4 % 2
            long r2 = r2.g0
            if (r4 != 0) goto L15
            q45 r2 = defpackage.mp2.I(r2)
            long r2 = r2.getSignature$kotlinx_serialization_protobuf()
            r0 = 1
        L13:
            long r2 = r2 | r0
            return r2
        L15:
            q45 r2 = defpackage.mp2.I(r2)
            long r2 = r2.getSignature$kotlinx_serialization_protobuf()
            r0 = 2
            goto L13
    }
}
