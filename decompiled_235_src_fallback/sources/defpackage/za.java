package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: za  reason: default package */
/* loaded from: classes.dex */
public final class za extends defpackage.ln2 {
    public final /* synthetic */ int g;

    public /* synthetic */ za(defpackage.bb r1, int r2) {
            r0 = this;
            r0.g = r2
            r0.<init>()
            return
    }

    @Override // defpackage.ln2
    public final defpackage.c1 S(defpackage.ea0 r1) {
            r0 = this;
            int r0 = r0.g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            g82 r0 = defpackage.g82.a()
            mb r0 = defpackage.mb.r(r1, r0)
            return r0
        Le:
            g82 r0 = defpackage.g82.a()
            xa r0 = defpackage.xa.o(r1, r0)
            return r0
    }

    @Override // defpackage.ln2
    public final void i0(defpackage.c1 r3) {
            r2 = this;
            int r2 = r2.g
            java.lang.String r0 = "key_size must be at least 16 bytes"
            r1 = 16
            switch(r2) {
                case 0: goto L1d;
                default: goto L9;
            }
        L9:
            mb r3 = (defpackage.mb) r3
            int r2 = r3.o()
            if (r2 < r1) goto L19
            pb r2 = r3.p()
            defpackage.bb.d(r2)
            goto L1c
        L19:
            defpackage.e41.v(r0)
        L1c:
            return
        L1d:
            xa r3 = (defpackage.xa) r3
            int r2 = r3.m()
            if (r2 < r1) goto L2d
            db r2 = r3.n()
            defpackage.bb.c(r2)
            goto L30
        L2d:
            defpackage.e41.v(r0)
        L30:
            return
    }

    @Override // defpackage.ln2
    public final java.lang.Object m(defpackage.c1 r4) {
            r3 = this;
            int r3 = r3.g
            r0 = 0
            switch(r3) {
                case 0: goto L42;
                default: goto L6;
            }
        L6:
            mb r4 = (defpackage.mb) r4
            ib r3 = defpackage.jb.s()
            int r1 = r4.o()
            byte[] r1 = defpackage.nd5.a(r1)
            int r2 = r1.length
            ca0 r0 = defpackage.ea0.c(r1, r0, r2)
            r3.c()
            pr2 r1 = r3.B
            jb r1 = (defpackage.jb) r1
            defpackage.jb.o(r1, r0)
            pb r4 = r4.p()
            r3.c()
            pr2 r0 = r3.B
            jb r0 = (defpackage.jb) r0
            defpackage.jb.n(r0, r4)
            r3.c()
            pr2 r4 = r3.B
            jb r4 = (defpackage.jb) r4
            defpackage.jb.m(r4)
            pr2 r3 = r3.a()
            jb r3 = (defpackage.jb) r3
            return r3
        L42:
            xa r4 = (defpackage.xa) r4
            ta r3 = defpackage.ua.s()
            int r1 = r4.m()
            byte[] r1 = defpackage.nd5.a(r1)
            int r2 = r1.length
            ca0 r0 = defpackage.ea0.c(r1, r0, r2)
            r3.c()
            pr2 r1 = r3.B
            ua r1 = (defpackage.ua) r1
            defpackage.ua.o(r1, r0)
            db r4 = r4.n()
            r3.c()
            pr2 r0 = r3.B
            ua r0 = (defpackage.ua) r0
            defpackage.ua.n(r0, r4)
            r3.c()
            pr2 r4 = r3.B
            ua r4 = (defpackage.ua) r4
            defpackage.ua.m(r4)
            pr2 r3 = r3.a()
            ua r3 = (defpackage.ua) r3
            return r3
    }
}
