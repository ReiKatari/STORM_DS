package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lq3  reason: default package */
/* loaded from: classes.dex */
public final class lq3 {
    public final java.lang.Object a;
    public final defpackage.mq3 b;
    public int c;
    public int d;
    public defpackage.lq3 e;
    public boolean f;
    public final defpackage.vs4 g;

    public lq3(java.lang.Object r1, defpackage.mq3 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r1 = -1
            r0.c = r1
            r1 = 0
            vs4 r1 = defpackage.np2.Y(r1)
            r0.g = r1
            return
    }

    public final defpackage.lq3 a() {
            r1 = this;
            boolean r0 = r1.f
            if (r0 == 0) goto L9
            java.lang.String r0 = "Pin should not be called on an already disposed item "
            defpackage.s53.c(r0)
        L9:
            int r0 = r1.d
            if (r0 != 0) goto L25
            mq3 r0 = r1.b
            mm6 r0 = r0.A
            r0.add(r1)
            vs4 r0 = r1.g
            java.lang.Object r0 = r0.getValue()
            lq3 r0 = (defpackage.lq3) r0
            if (r0 == 0) goto L22
            r0.a()
            goto L23
        L22:
            r0 = 0
        L23:
            r1.e = r0
        L25:
            int r0 = r1.d
            int r0 = r0 + 1
            r1.d = r0
            return r1
    }

    public final void b() {
            r1 = this;
            boolean r0 = r1.f
            if (r0 == 0) goto L5
            goto L28
        L5:
            int r0 = r1.d
            if (r0 <= 0) goto La
            goto Lf
        La:
            java.lang.String r0 = "Release should only be called once"
            defpackage.s53.c(r0)
        Lf:
            int r0 = r1.d
            int r0 = r0 + (-1)
            r1.d = r0
            if (r0 != 0) goto L28
            mq3 r0 = r1.b
            mm6 r0 = r0.A
            r0.remove(r1)
            lq3 r0 = r1.e
            if (r0 == 0) goto L25
            r0.b()
        L25:
            r0 = 0
            r1.e = r0
        L28:
            return
    }
}
