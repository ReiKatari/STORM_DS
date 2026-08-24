package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j32  reason: default package */
/* loaded from: classes.dex */
public final class j32 implements defpackage.le2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.le2[] B;

    public /* synthetic */ j32(defpackage.le2[] r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r7, defpackage.r41 r8) {
            r6 = this;
            int r0 = r6.A
            jg7 r1 = defpackage.jg7.a
            r2 = 3
            r3 = 0
            le2[] r6 = r6.B
            switch(r0) {
                case 0: goto L21;
                default: goto Lb;
            }
        Lb:
            h32 r0 = new h32
            r4 = 2
            r0.<init>(r6, r4)
            i32 r4 = new i32
            r5 = 1
            r4.<init>(r2, r3, r5)
            java.lang.Object r6 = defpackage.nb3.o(r8, r7, r0, r4, r6)
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            if (r6 != r7) goto L20
            r1 = r6
        L20:
            return r1
        L21:
            h32 r0 = new h32
            r4 = 0
            r0.<init>(r6, r4)
            i32 r5 = new i32
            r5.<init>(r2, r3, r4)
            java.lang.Object r6 = defpackage.nb3.o(r8, r7, r0, r5, r6)
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            if (r6 != r7) goto L35
            r1 = r6
        L35:
            return r1
    }
}
