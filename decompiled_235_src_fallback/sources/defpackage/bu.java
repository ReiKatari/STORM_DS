package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bu implements java.util.function.Function {
    public final /* synthetic */ int a;

    public /* synthetic */ bu(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L18;
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Integer r1 = (java.lang.Integer) r1
            md6 r0 = new md6
            r0.<init>()
            return r0
        Ld:
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = java.lang.Boolean.parseBoolean(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L18:
            java.lang.String r1 = (java.lang.String) r1
            int r0 = java.lang.Integer.parseInt(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }
}
