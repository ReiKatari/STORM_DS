package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vd3 implements defpackage.lk7 {
    public static final defpackage.vd3 b = null;
    public static final defpackage.vd3 c = null;
    public final /* synthetic */ int a;

    static {
            vd3 r0 = new vd3
            r1 = 0
            r0.<init>(r1)
            defpackage.vd3.b = r0
            vd3 r0 = new vd3
            r1 = 1
            r0.<init>(r1)
            defpackage.vd3.c = r0
            return
    }

    public /* synthetic */ vd3(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.y32
    public final void encode(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            mk7 r2 = (defpackage.mk7) r2
            wd3 r0 = defpackage.xd3.e
            boolean r0 = r1.booleanValue()
            r2.add(r0)
            return
        L13:
            java.lang.String r1 = (java.lang.String) r1
            mk7 r2 = (defpackage.mk7) r2
            wd3 r0 = defpackage.xd3.e
            r2.add(r1)
            return
    }
}
