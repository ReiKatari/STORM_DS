package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t32  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class t32 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.List B;
    public final /* synthetic */ defpackage.qn2 L;

    public /* synthetic */ t32(java.util.List r1, defpackage.qn2 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.A
            r1 = 10
            r2 = 0
            jg7 r3 = defpackage.jg7.a
            r4 = 802480018(0x2fd4df92, float:3.8721432E-10)
            qn2 r5 = r9.L
            java.util.List r9 = r9.B
            r6 = 1
            er3 r10 = (defpackage.er3) r10
            switch(r0) {
                case 0: goto L68;
                case 1: goto L4c;
                case 2: goto L31;
                default: goto L14;
            }
        L14:
            r10.getClass()
            int r0 = r9.size()
            j5 r1 = new j5
            r7 = 14
            r1.<init>(r7, r9)
            v32 r7 = new v32
            r8 = 3
            r7.<init>(r9, r5, r8)
            zv0 r9 = new zv0
            r9.<init>(r4, r6, r7)
            r10.h0(r0, r2, r1, r9)
            return r3
        L31:
            r10.getClass()
            int r0 = r9.size()
            j5 r7 = new j5
            r7.<init>(r1, r9)
            v32 r1 = new v32
            r8 = 2
            r1.<init>(r9, r5, r8)
            zv0 r9 = new zv0
            r9.<init>(r4, r6, r1)
            r10.h0(r0, r2, r7, r9)
            return r3
        L4c:
            r10.getClass()
            int r0 = r9.size()
            j5 r1 = new j5
            r7 = 9
            r1.<init>(r7, r9)
            v32 r7 = new v32
            r7.<init>(r9, r5, r6)
            zv0 r9 = new zv0
            r9.<init>(r4, r6, r7)
            r10.h0(r0, r2, r1, r9)
            return r3
        L68:
            r10.getClass()
            bz1 r0 = new bz1
            r2 = 4
            r0.<init>(r2)
            int r2 = r9.size()
            r5 r7 = new r5
            r7.<init>(r1, r0, r9)
            j5 r0 = new j5
            r1 = 8
            r0.<init>(r1, r9)
            v32 r1 = new v32
            r8 = 0
            r1.<init>(r9, r5, r8)
            zv0 r9 = new zv0
            r9.<init>(r4, r6, r1)
            r10.h0(r2, r7, r0, r9)
            return r3
    }
}
