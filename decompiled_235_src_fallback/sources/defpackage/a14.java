package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a14  reason: default package */
/* loaded from: classes.dex */
public final class a14 extends defpackage.zd4 {
    public a14(long r1, defpackage.s35 r3, defpackage.o45 r4, defpackage.wb6 r5) {
            r0 = this;
            r4.getClass()
            r3.getClass()
            r5.getClass()
            r0.<init>(r1, r3, r4, r5)
            return
    }

    @Override // defpackage.zd4, defpackage.c55
    public final long u0(defpackage.wb6 r3, int r4) {
            r2 = this;
            r3.getClass()
            int r4 = r4 % 2
            long r2 = r2.d0
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
