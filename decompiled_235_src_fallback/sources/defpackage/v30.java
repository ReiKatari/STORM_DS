package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v30  reason: default package */
/* loaded from: classes.dex */
public final class v30 extends defpackage.c20 {
    public final /* synthetic */ int b;
    public final int c;

    public v30(defpackage.a21 r1, int r2) {
            r0 = this;
            r0.b = r2
            r1.getClass()
            switch(r2) {
                case 4: goto Lf;
                default: goto L8;
            }
        L8:
            r0.<init>(r1)
            r1 = 6
            r0.c = r1
            return
        Lf:
            r0.<init>(r1)
            r1 = 9
            r0.c = r1
            return
    }

    public v30(defpackage.if4 r2, int r3) {
            r1 = this;
            r1.b = r3
            r0 = 7
            r2.getClass()
            switch(r3) {
                case 3: goto Lf;
                default: goto L9;
            }
        L9:
            r1.<init>(r2)
            r1.c = r0
            return
        Lf:
            r1.<init>(r2)
            r1.c = r0
            return
    }

    public v30(defpackage.w30 r2) {
            r1 = this;
            r0 = 1
            r1.b = r0
            r2.getClass()
            r1.<init>(r2)
            r2 = 5
            r1.c = r2
            return
    }

    @Override // defpackage.k11
    public final boolean c(defpackage.yw7 r3) {
            r2 = this;
            int r2 = r2.b
            r0 = 0
            r1 = 1
            r3.getClass()
            switch(r2) {
                case 0: goto L28;
                case 1: goto L23;
                case 2: goto L19;
                case 3: goto Lf;
                default: goto La;
            }
        La:
            p21 r2 = r3.j
            boolean r2 = r2.f
            return r2
        Lf:
            p21 r2 = r3.j
            kf4 r2 = r2.a
            kf4 r3 = defpackage.kf4.UNMETERED
            if (r2 != r3) goto L18
            r0 = r1
        L18:
            return r0
        L19:
            p21 r2 = r3.j
            kf4 r2 = r2.a
            kf4 r3 = defpackage.kf4.CONNECTED
            if (r2 != r3) goto L22
            r0 = r1
        L22:
            return r0
        L23:
            p21 r2 = r3.j
            boolean r2 = r2.e
            return r2
        L28:
            p21 r2 = r3.j
            boolean r2 = r2.c
            return r2
    }

    @Override // defpackage.c20
    public final int d() {
            r1 = this;
            int r0 = r1.b
            switch(r0) {
                case 0: goto L11;
                case 1: goto Le;
                case 2: goto Lb;
                case 3: goto L8;
                default: goto L5;
            }
        L5:
            int r1 = r1.c
            return r1
        L8:
            int r1 = r1.c
            return r1
        Lb:
            int r1 = r1.c
            return r1
        Le:
            int r1 = r1.c
            return r1
        L11:
            int r1 = r1.c
            return r1
    }

    @Override // defpackage.c20
    public final boolean e(java.lang.Object r4) {
            r3 = this;
            int r3 = r3.b
            r0 = 0
            r1 = 1
            switch(r3) {
                case 0: goto L42;
                case 1: goto L3b;
                case 2: goto L22;
                case 3: goto Lf;
                default: goto L7;
            }
        L7:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
        Ld:
            r3 = r3 ^ r1
            return r3
        Lf:
            gf4 r4 = (defpackage.gf4) r4
            r4.getClass()
            boolean r3 = r4.a
            if (r3 == 0) goto L20
            boolean r3 = r4.c
            if (r3 != 0) goto L20
            boolean r3 = r4.e
            if (r3 == 0) goto L21
        L20:
            r0 = r1
        L21:
            return r0
        L22:
            gf4 r4 = (defpackage.gf4) r4
            r4.getClass()
            boolean r3 = r4.e
            if (r3 != 0) goto L39
            boolean r3 = r4.a
            if (r3 == 0) goto L39
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r3 < r2) goto L3a
            boolean r3 = r4.b
            if (r3 != 0) goto L3a
        L39:
            r0 = r1
        L3a:
            return r0
        L3b:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            goto Ld
        L42:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            goto Ld
    }
}
