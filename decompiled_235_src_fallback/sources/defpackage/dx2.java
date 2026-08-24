package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dx2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dx2 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ex2 B;

    public /* synthetic */ dx2(defpackage.ex2 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r3 = this;
            int r0 = r3.A
            java.lang.String r1 = "Font resolution state is not set."
            jg7 r2 = defpackage.jg7.a
            ex2 r3 = r3.B
            switch(r0) {
                case 0: goto L18;
                default: goto Lb;
            }
        Lb:
            we7 r3 = r3.r0
            if (r3 == 0) goto L13
            r3.getValue()
            return r2
        L13:
            ug r3 = defpackage.lb1.c(r1)
            throw r3
        L18:
            we7 r3 = r3.r0
            if (r3 == 0) goto L20
            r3.getValue()
            return r2
        L20:
            ug r3 = defpackage.lb1.c(r1)
            throw r3
    }
}
