package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o33  reason: default package */
/* loaded from: classes.dex */
public final class o33 extends defpackage.ig1 {
    public final /* synthetic */ int n;
    public final java.lang.Object o;

    public o33(android.view.Surface r2, android.util.Size r3, int r4) {
            r1 = this;
            r0 = 0
            r1.n = r0
            r1.<init>(r4, r3)
            r1.o = r2
            return
    }

    public o33(defpackage.bw6 r2, android.util.Size r3) {
            r1 = this;
            r0 = 1
            r1.n = r0
            r1.o = r2
            r2 = 34
            r1.<init>(r2, r3)
            return
    }

    @Override // defpackage.ig1
    public final defpackage.gx3 f() {
            r1 = this;
            int r0 = r1.n
            java.lang.Object r1 = r1.o
            switch(r0) {
                case 0: goto Lc;
                default: goto L7;
            }
        L7:
            bw6 r1 = (defpackage.bw6) r1
            tb0 r1 = r1.e
            return r1
        Lc:
            android.view.Surface r1 = (android.view.Surface) r1
            n33 r1 = defpackage.l.z(r1)
            return r1
    }
}
