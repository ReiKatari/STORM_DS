package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x00  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class x00 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.j04 B;

    public /* synthetic */ x00(defpackage.j04 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r5 = this;
            int r0 = r5.A
            java.lang.String r1 = "*/*"
            r2 = 0
            jg7 r3 = defpackage.jg7.a
            j04 r5 = r5.B
            switch(r0) {
                case 0: goto L40;
                case 1: goto L36;
                case 2: goto L2e;
                case 3: goto L25;
                case 4: goto L1c;
                default: goto Lc;
            }
        Lc:
            java.lang.String r0 = "application/octet-stream"
            java.lang.String r1 = "application/x-compressed"
            java.lang.String r2 = "application/zip"
            java.lang.String r4 = "application/x-zip-compressed"
            java.lang.String[] r0 = new java.lang.String[]{r2, r4, r0, r1}
            r5.a(r0)
            return r3
        L1c:
            vr4 r0 = new vr4
            r0.<init>(r2, r2)
            r5.a(r0)
            return r3
        L25:
            vr4 r0 = new vr4
            r0.<init>(r2, r2)
            r5.a(r0)
            return r3
        L2e:
            java.lang.String[] r0 = new java.lang.String[]{r1}
            r5.a(r0)
            return r3
        L36:
            java.lang.String r0 = "application/json"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r5.a(r0)
            return r3
        L40:
            vr4 r0 = new vr4
            java.lang.String r1 = "image/png"
            java.lang.String r4 = "image/jpeg"
            java.lang.String[] r1 = new java.lang.String[]{r1, r4}
            r0.<init>(r2, r1)
            r5.a(r0)
            return r3
    }
}
