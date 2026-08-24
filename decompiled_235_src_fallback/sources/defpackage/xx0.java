package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xx0  reason: default package */
/* loaded from: classes.dex */
public final class xx0 implements defpackage.uh7 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public xx0(android.content.Context r3, int r4) {
            r2 = this;
            r2.a = r4
            switch(r4) {
                case 1: goto L2c;
                default: goto L5;
            }
        L5:
            r2.<init>()
            xx0 r4 = new xx0
            r0 = 1
            r4.<init>(r3, r0)
            vr4 r3 = new vr4
            java.lang.String r0 = "content"
            r3.<init>(r0, r4)
            cp6 r4 = new cp6
            r4.<init>()
            vr4 r0 = new vr4
            java.lang.String r1 = "file"
            r0.<init>(r1, r4)
            vr4[] r3 = new defpackage.vr4[]{r3, r0}
            java.util.Map r3 = defpackage.c14.m0(r3)
            r2.b = r3
            return
        L2c:
            r2.<init>()
            r2.b = r3
            return
    }

    @Override // defpackage.uh7
    public final defpackage.zl1 a(android.net.Uri r3) {
            r2 = this;
            int r0 = r2.a
            java.lang.Object r2 = r2.b
            switch(r0) {
                case 0: goto L11;
                default: goto L7;
            }
        L7:
            r3.getClass()
            android.content.Context r2 = (android.content.Context) r2
            qi6 r2 = defpackage.zl1.g(r2, r3)
            return r2
        L11:
            java.util.Map r2 = (java.util.Map) r2
            r3.getClass()
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "file"
            if (r0 != 0) goto L1f
            r0 = r1
        L1f:
            java.lang.Object r0 = r2.get(r0)
            uh7 r0 = (defpackage.uh7) r0
            if (r0 == 0) goto L2d
            zl1 r0 = r0.a(r3)
            if (r0 != 0) goto L3b
        L2d:
            java.lang.Object r2 = r2.get(r1)
            uh7 r2 = (defpackage.uh7) r2
            if (r2 == 0) goto L3a
            zl1 r0 = r2.a(r3)
            goto L3b
        L3a:
            r0 = 0
        L3b:
            return r0
    }

    @Override // defpackage.uh7
    public final defpackage.zl1 b(android.net.Uri r3) {
            r2 = this;
            int r0 = r2.a
            java.lang.Object r2 = r2.b
            switch(r0) {
                case 0: goto L11;
                default: goto L7;
            }
        L7:
            r3.getClass()
            android.content.Context r2 = (android.content.Context) r2
            qi6 r2 = defpackage.zl1.h(r2, r3)
            return r2
        L11:
            java.util.Map r2 = (java.util.Map) r2
            r3.getClass()
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "file"
            if (r0 != 0) goto L1f
            r0 = r1
        L1f:
            java.lang.Object r0 = r2.get(r0)
            uh7 r0 = (defpackage.uh7) r0
            if (r0 == 0) goto L2d
            zl1 r0 = r0.b(r3)
            if (r0 != 0) goto L3b
        L2d:
            java.lang.Object r2 = r2.get(r1)
            uh7 r2 = (defpackage.uh7) r2
            if (r2 == 0) goto L3a
            zl1 r0 = r2.b(r3)
            goto L3b
        L3a:
            r0 = 0
        L3b:
            return r0
    }

    @Override // defpackage.uh7
    public final defpackage.zl1 c(android.net.Uri r4) {
            r3 = this;
            int r0 = r3.a
            r1 = 0
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            return r1
        L7:
            java.lang.Object r3 = r3.b
            java.util.Map r3 = (java.util.Map) r3
            java.lang.String r0 = r4.getScheme()
            java.lang.String r2 = "file"
            if (r0 != 0) goto L14
            r0 = r2
        L14:
            java.lang.Object r0 = r3.get(r0)
            uh7 r0 = (defpackage.uh7) r0
            if (r0 == 0) goto L25
            zl1 r0 = r0.c(r4)
            if (r0 != 0) goto L23
            goto L25
        L23:
            r1 = r0
            goto L31
        L25:
            java.lang.Object r3 = r3.get(r2)
            uh7 r3 = (defpackage.uh7) r3
            if (r3 == 0) goto L31
            zl1 r1 = r3.c(r4)
        L31:
            return r1
    }

    @Override // defpackage.uh7
    public final boolean d(android.net.Uri r3) {
            r2 = this;
            int r0 = r2.a
            java.lang.Object r2 = r2.b
            switch(r0) {
                case 0: goto L17;
                default: goto L7;
            }
        L7:
            android.content.Context r2 = (android.content.Context) r2
            qi6 r2 = defpackage.zl1.g(r2, r3)
            boolean r2 = r2.e()
            r3 = 1
            if (r2 != r3) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            return r3
        L17:
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r0 = r3.getScheme()
            java.lang.String r1 = "file"
            if (r0 != 0) goto L22
            r0 = r1
        L22:
            java.lang.Object r0 = r2.get(r0)
            uh7 r0 = (defpackage.uh7) r0
            if (r0 == 0) goto L33
            boolean r2 = r0.d(r3)
        L2e:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L41
        L33:
            java.lang.Object r2 = r2.get(r1)
            uh7 r2 = (defpackage.uh7) r2
            if (r2 == 0) goto L40
            boolean r2 = r2.d(r3)
            goto L2e
        L40:
            r2 = 0
        L41:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = defpackage.nb3.k(r2, r3)
            return r2
    }
}
