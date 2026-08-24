package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hg  reason: default package */
/* loaded from: classes.dex */
public final class hg extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.mj1 L;

    public /* synthetic */ hg(defpackage.mj1 r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.B
            mj1 r1 = r1.L
            switch(r0) {
                case 0: goto L17;
                default: goto L7;
            }
        L7:
            dl4 r2 = (defpackage.dl4) r2
            jj1 r2 = r1.Y
            boolean r2 = r2.a
            if (r2 == 0) goto L14
            on2 r1 = r1.X
            r1.c()
        L14:
            jg7 r1 = defpackage.jg7.a
            return r1
        L17:
            gl1 r2 = (defpackage.gl1) r2
            r1.show()
            z3 r2 = new z3
            r0 = 2
            r2.<init>(r1, r0)
            return r2
    }
}
