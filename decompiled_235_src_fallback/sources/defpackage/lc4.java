package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lc4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lc4 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.String B;

    public /* synthetic */ lc4(java.lang.String r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r1 = this;
            int r0 = r1.A
            java.lang.String r1 = r1.B
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            if (r1 != 0) goto Lb
            java.lang.String r1 = ""
        Lb:
            vs4 r1 = defpackage.np2.Y(r1)
            return r1
        L10:
            fc4 r0 = new fc4
            r0.<init>(r1)
            return r0
    }
}
