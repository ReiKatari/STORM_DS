package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c64  reason: default package */
/* loaded from: classes.dex */
public final class c64 implements defpackage.y54 {
    public final /* synthetic */ int a;
    public final defpackage.yc1 b;

    public /* synthetic */ c64(int r1, defpackage.yc1 r2) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.<init>()
            return
    }

    public static defpackage.hf7 d(defpackage.ef7 r10) {
            java.lang.String r0 = r10.f()
            java.lang.String r1 = r10.g()
            java.util.List r10 = r10.h()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.ht0.v0(r10, r3)
            r2.<init>(r3)
            java.util.Iterator r10 = r10.iterator()
        L1b:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L5a
            java.lang.Object r3 = r10.next()
            i05 r3 = (defpackage.i05) r3
            k05 r4 = new k05
            pf5 r5 = new pf5
            nf5 r6 = r3.f()
            int r6 = r6.i()
            nf5 r7 = r3.f()
            int r7 = r7.j()
            nf5 r8 = r3.f()
            int r8 = r8.h()
            nf5 r9 = r3.f()
            int r9 = r9.g()
            r5.<init>(r6, r7, r8, r9)
            java.lang.String r3 = r3.e()
            r6 = 0
            r4.<init>(r5, r3, r6, r6)
            r2.add(r4)
            goto L1b
        L5a:
            hf7 r10 = new hf7
            r10.<init>(r0, r1, r2)
            return r10
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
            r0 = 36
            return r0
        L8:
            r0 = 25
            return r0
    }

    @Override // defpackage.y54
    public final void b() {
            r3 = this;
            int r0 = r3.a
            yc1 r1 = r3.b
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            v83 r3 = new v83
            r0 = 28
            r3.<init>(r0)
            java.lang.Class<mw5> r0 = defpackage.mw5.class
            java.lang.String r2 = "rom_data.json"
            r1.H(r2, r0, r3)
            return
        L16:
            v83 r0 = new v83
            r2 = 25
            r0.<init>(r3, r2)
            java.lang.Class<ek3> r3 = defpackage.ek3.class
            java.lang.String r2 = "layouts.json"
            r1.H(r2, r3, r0)
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
            r0 = 37
            return r0
        L8:
            r0 = 26
            return r0
    }
}
