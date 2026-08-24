package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: so3  reason: default package */
/* loaded from: classes.dex */
public final class so3 extends defpackage.gx0 {
    public final defpackage.po3 b;
    public final defpackage.fq3 c;
    public final int d;
    public final /* synthetic */ defpackage.fq3 e;
    public final /* synthetic */ defpackage.ip3 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;

    public so3(defpackage.po3 r1, defpackage.fq3 r2, int r3, defpackage.ip3 r4, int r5, int r6, long r7) {
            r0 = this;
            r0.e = r2
            r0.f = r4
            r0.g = r5
            r0.h = r6
            r0.i = r7
            r4 = 1
            r0.<init>(r4)
            r0.b = r1
            r0.c = r2
            r0.d = r3
            return
    }

    public final defpackage.xo3 o(int r18, int r19, int r20, int r21, long r22) {
            r17 = this;
            r0 = r17
            r1 = r18
            po3 r2 = r0.b
            java.lang.Object r3 = r2.c(r1)
            oo3 r2 = r2.b
            java.lang.Object r11 = r2.H(r1)
            fq3 r2 = r0.c
            r13 = r22
            java.util.List r8 = r0.g(r2, r1, r13)
            boolean r2 = defpackage.q21.f(r13)
            if (r2 == 0) goto L23
            int r2 = defpackage.q21.j(r13)
            goto L32
        L23:
            boolean r2 = defpackage.q21.e(r13)
            if (r2 != 0) goto L2e
            java.lang.String r2 = "does not have fixed height"
            defpackage.s53.a(r2)
        L2e:
            int r2 = defpackage.q21.i(r13)
        L32:
            fq3 r4 = r0.e
            qt6 r4 = r4.B
            kk3 r5 = r4.getLayoutDirection()
            ip3 r4 = r0.f
            zp3 r12 = r4.m
            xo3 r4 = new xo3
            int r7 = r0.h
            long r9 = r0.i
            int r6 = r0.g
            r0 = r3
            r3 = r2
            r2 = r0
            r15 = r19
            r16 = r20
            r0 = r4
            r4 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r15, r16)
            return r0
    }
}
