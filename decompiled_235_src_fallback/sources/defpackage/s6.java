package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s6 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.o75 B;
    public final /* synthetic */ defpackage.n3 L;

    public /* synthetic */ s6(defpackage.o75 r1, defpackage.n3 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.A
            r1 = 0
            r2 = 1
            r3 = 0
            n3 r4 = r7.L
            o75 r7 = r7.B
            v3 r8 = (defpackage.v3) r8
            switch(r0) {
                case 0: goto L37;
                default: goto Le;
            }
        Le:
            r8.getClass()
            boolean r0 = r8 instanceof defpackage.m3
            if (r0 == 0) goto L18
            r3 = r8
            m3 r3 = (defpackage.m3) r3
        L18:
            if (r3 == 0) goto L2b
            o75 r8 = r3.a
            if (r8 == 0) goto L2b
            long r5 = r8.a
            long r7 = r7.a
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 != 0) goto L2b
            n3 r7 = r3.b
            if (r7 != r4) goto L2b
            r1 = r2
        L2b:
            if (r1 == 0) goto L32
            bt r7 = r3.c
            r7.E()
        L32:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            return r7
        L37:
            r8.getClass()
            boolean r0 = r8 instanceof defpackage.m3
            if (r0 == 0) goto L41
            r3 = r8
            m3 r3 = (defpackage.m3) r3
        L41:
            if (r3 == 0) goto L54
            o75 r8 = r3.a
            if (r8 == 0) goto L54
            long r5 = r8.a
            long r7 = r7.a
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 != 0) goto L54
            n3 r7 = r3.b
            if (r7 != r4) goto L54
            r1 = r2
        L54:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            return r7
    }
}
