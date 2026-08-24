package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ya  reason: default package */
/* loaded from: classes.dex */
public final class ya {
    public final /* synthetic */ int a;

    public /* synthetic */ ya(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public final java.lang.Object a(defpackage.c1 r8) {
            r7 = this;
            int r7 = r7.a
            switch(r7) {
                case 0: goto L3c;
                default: goto L5;
            }
        L5:
            jb r8 = (defpackage.jb) r8
            gb r7 = new gb
            ea0 r0 = r8.p()
            int r1 = r0.size()
            if (r1 != 0) goto L16
            byte[] r0 = defpackage.aa3.b
            goto L1c
        L16:
            byte[] r2 = new byte[r1]
            r0.d(r2, r1)
            r0 = r2
        L1c:
            pb r1 = r8.q()
            sw2 r1 = r1.s()
            java.lang.String r1 = defpackage.kn2.d0(r1)
            pb r2 = r8.q()
            int r2 = r2.r()
            pb r8 = r8.q()
            int r8 = r8.p()
            r7.<init>(r1, r0, r2, r8)
            return r7
        L3c:
            ua r8 = (defpackage.ua) r8
            ra r0 = new ra
            ea0 r7 = r8.p()
            int r1 = r7.size()
            if (r1 != 0) goto L4e
            byte[] r7 = defpackage.aa3.b
            r1 = r7
            goto L54
        L4e:
            byte[] r2 = new byte[r1]
            r7.d(r2, r1)
            r1 = r2
        L54:
            db r7 = r8.q()
            sw2 r7 = r7.p()
            java.lang.String r2 = defpackage.kn2.d0(r7)
            db r7 = r8.q()
            int r3 = r7.o()
            db r7 = r8.q()
            by2 r7 = r7.q()
            sw2 r7 = r7.n()
            java.lang.String r4 = defpackage.kn2.d0(r7)
            db r7 = r8.q()
            by2 r7 = r7.q()
            int r5 = r7.o()
            db r7 = r8.q()
            int r6 = r7.m()
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }
}
