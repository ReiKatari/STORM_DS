package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o4 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.pr3 B;
    public final /* synthetic */ defpackage.w61 L;
    public final /* synthetic */ float R;

    public /* synthetic */ o4(defpackage.pr3 r1, defpackage.w61 r2, float r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.A
            jg7 r1 = defpackage.jg7.a
            r2 = 0
            float r3 = r9.R
            w61 r4 = r9.L
            pr3 r9 = r9.B
            switch(r0) {
                case 0: goto L1c;
                default: goto Le;
            }
        Le:
            fh2 r10 = (defpackage.fh2) r10
            r10.getClass()
            o4 r0 = new o4
            r0.<init>(r9, r4, r3, r2)
            r10.c(r0)
            return r1
        L1c:
            mj0 r10 = (defpackage.mj0) r10
            r10.getClass()
            int r0 = r10.a
            r5 = 5
            r6 = 1
            r7 = 3
            r8 = 0
            if (r0 != r5) goto L43
            boolean r0 = r9.b()
            if (r0 == 0) goto L3a
            r10.b = r6
            o5 r10 = new o5
            r10.<init>(r9, r3, r8, r2)
            defpackage.hv.L(r4, r8, r8, r10, r7)
            goto L56
        L3a:
            int r9 = r9.h()
            if (r9 != 0) goto L56
            r10.b = r6
            goto L56
        L43:
            r2 = 6
            if (r0 != r2) goto L56
            boolean r0 = r9.c()
            if (r0 == 0) goto L56
            r10.b = r6
            o5 r10 = new o5
            r10.<init>(r9, r3, r8, r6)
            defpackage.hv.L(r4, r8, r8, r10, r7)
        L56:
            return r1
    }
}
