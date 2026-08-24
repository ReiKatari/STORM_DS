package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a01  reason: default package */
/* loaded from: classes.dex */
public final class a01 extends defpackage.yz3 {
    public final /* synthetic */ int h;
    public final /* synthetic */ java.lang.Object i;

    public a01(int r2, defpackage.ap3 r3) {
            r1 = this;
            r0 = 1
            r1.h = r0
            r1.i = r3
            r1.<init>(r2)
            return
    }

    public a01(defpackage.b01 r2) {
            r1 = this;
            r0 = 0
            r1.h = r0
            r1.i = r2
            r2 = 25
            r1.<init>(r2)
            return
    }

    @Override // defpackage.yz3
    public java.lang.Object c(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.h
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = super.c(r2)
            return r1
        La:
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            java.lang.Object r1 = r1.i
            b01 r1 = (defpackage.b01) r1
            e36 r1 = r1.A
            j36 r1 = r1.i0(r2)
            return r1
    }

    @Override // defpackage.yz3
    public final void d(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r0 = r1.h
            switch(r0) {
                case 0: goto L1d;
                default: goto L5;
            }
        L5:
            c44 r2 = (defpackage.c44) r2
            we5 r3 = (defpackage.we5) r3
            we5 r4 = (defpackage.we5) r4
            java.lang.Object r1 = r1.i
            ap3 r1 = (defpackage.ap3) r1
            java.lang.Object r1 = r1.B
            rs7 r1 = (defpackage.rs7) r1
            android.graphics.Bitmap r4 = r3.a
            java.util.Map r0 = r3.b
            int r3 = r3.c
            r1.g(r2, r4, r0, r3)
            return
        L1d:
            java.lang.String r2 = (java.lang.String) r2
            j36 r3 = (defpackage.j36) r3
            j36 r4 = (defpackage.j36) r4
            r2.getClass()
            r3.getClass()
            r3.close()
            return
    }

    @Override // defpackage.yz3
    public int o(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.h
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            int r1 = super.o(r2, r3)
            return r1
        La:
            c44 r2 = (defpackage.c44) r2
            we5 r3 = (defpackage.we5) r3
            int r1 = r3.c
            return r1
    }
}
