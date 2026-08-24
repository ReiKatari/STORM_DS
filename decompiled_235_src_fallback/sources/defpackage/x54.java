package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x54  reason: default package */
/* loaded from: classes.dex */
public final class x54 implements defpackage.y54 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public /* synthetic */ x54(java.lang.Object r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.y54
    public final int a() {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            r0 = 16
            return r0
        L8:
            r0 = 14
            return r0
    }

    @Override // defpackage.y54
    public final void b() {
            r2 = this;
            int r0 = r2.a
            java.lang.Object r2 = r2.b
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            p06 r2 = (defpackage.p06) r2
            xb2 r2 = (defpackage.xb2) r2
            r2.q()
            return
        Lf:
            kx5 r2 = (defpackage.kx5) r2
            nr1 r0 = r2.c
            r0.evictAll()
            android.content.Context r2 = r2.a
            java.io.File r2 = r2.getExternalCacheDir()
            if (r2 == 0) goto L26
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "rom_icons"
            r0.<init>(r2, r1)
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 != 0) goto L2a
            goto L33
        L2a:
            boolean r2 = r0.isDirectory()
            if (r2 == 0) goto L33
            defpackage.jc2.x0(r0)
        L33:
            return
    }

    @Override // defpackage.y54
    public final int c() {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            r0 = 17
            return r0
        L8:
            r0 = 15
            return r0
    }
}
