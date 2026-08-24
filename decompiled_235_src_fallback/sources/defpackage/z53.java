package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z53  reason: default package */
/* loaded from: classes.dex */
public final class z53 {
    public final /* synthetic */ int a;
    public final defpackage.hy2 b;
    public final defpackage.hy2 c;
    public final defpackage.hy2 d;
    public final defpackage.hy2 e;
    public final java.io.Serializable f;

    public z53(java.lang.String r4) {
            r3 = this;
            r0 = 1
            r3.a = r0
            r3.<init>()
            r3.f = r4
            hy2 r4 = new hy2
            r1 = 0
            r4.<init>(r0, r1)
            r3.b = r4
            hy2 r4 = new hy2
            r2 = 0
            r4.<init>(r2, r1)
            r3.c = r4
            hy2 r4 = new hy2
            r4.<init>(r0, r1)
            r3.d = r4
            hy2 r4 = new hy2
            r4.<init>(r2, r1)
            r3.e = r4
            return
    }

    public z53(defpackage.z53[] r6) {
            r5 = this;
            r0 = 0
            r5.a = r0
            r5.<init>()
            r5.f = r6
            int r6 = r6.length
            hy2[] r1 = new defpackage.hy2[r6]
            r2 = r0
        Lc:
            if (r2 >= r6) goto L1d
            java.io.Serializable r3 = r5.f
            z53[] r3 = (defpackage.z53[]) r3
            r3 = r3[r2]
            hy2 r3 = r3.b()
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lc
        L1d:
            im7 r6 = new im7
            r6.<init>(r1, r0)
            hy2 r1 = new hy2
            r2 = 1
            r1.<init>(r2, r6)
            r5.b = r1
            java.io.Serializable r6 = r5.f
            z53[] r6 = (defpackage.z53[]) r6
            int r6 = r6.length
            hy2[] r1 = new defpackage.hy2[r6]
            r3 = r0
        L32:
            if (r3 >= r6) goto L43
            java.io.Serializable r4 = r5.f
            z53[] r4 = (defpackage.z53[]) r4
            r4 = r4[r3]
            hy2 r4 = r4.d()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L32
        L43:
            hy2 r6 = new hy2
            gy2 r3 = new gy2
            r3.<init>(r1, r0)
            r6.<init>(r0, r3)
            r5.c = r6
            java.io.Serializable r6 = r5.f
            z53[] r6 = (defpackage.z53[]) r6
            int r6 = r6.length
            hy2[] r1 = new defpackage.hy2[r6]
            r3 = r0
        L57:
            if (r3 >= r6) goto L68
            java.io.Serializable r4 = r5.f
            z53[] r4 = (defpackage.z53[]) r4
            r4 = r4[r3]
            hy2 r4 = r4.c()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L57
        L68:
            im7 r6 = new im7
            r6.<init>(r1, r2)
            hy2 r1 = new hy2
            r1.<init>(r2, r6)
            r5.d = r1
            java.io.Serializable r6 = r5.f
            z53[] r6 = (defpackage.z53[]) r6
            int r6 = r6.length
            hy2[] r1 = new defpackage.hy2[r6]
            r3 = r0
        L7c:
            if (r3 >= r6) goto L8d
            java.io.Serializable r4 = r5.f
            z53[] r4 = (defpackage.z53[]) r4
            r4 = r4[r3]
            hy2 r4 = r4.a()
            r1[r3] = r4
            int r3 = r3 + 1
            goto L7c
        L8d:
            hy2 r6 = new hy2
            gy2 r3 = new gy2
            r3.<init>(r1, r2)
            r6.<init>(r0, r3)
            r5.e = r6
            return
    }

    public final defpackage.hy2 a() {
            r1 = this;
            int r0 = r1.a
            hy2 r1 = r1.e
            return r1
    }

    public final defpackage.hy2 b() {
            r1 = this;
            int r0 = r1.a
            hy2 r1 = r1.b
            return r1
    }

    public final defpackage.hy2 c() {
            r1 = this;
            int r0 = r1.a
            hy2 r1 = r1.d
            return r1
    }

    public final defpackage.hy2 d() {
            r1 = this;
            int r0 = r1.a
            hy2 r1 = r1.c
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.a
            java.io.Serializable r4 = r4.f
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r0 = "RectRulers("
            r1 = 41
            java.lang.String r4 = defpackage.i61.k(r1, r0, r4)
            return r4
        L12:
            z53[] r4 = (defpackage.z53[]) r4
            r0 = 0
            r1 = 57
            java.lang.String r2 = "innermostOf("
            java.lang.String r3 = ")"
            java.lang.String r4 = defpackage.fv.M0(r4, r2, r3, r0, r1)
            return r4
    }
}
