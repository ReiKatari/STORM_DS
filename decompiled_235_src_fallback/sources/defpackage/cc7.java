package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cc7  reason: default package */
/* loaded from: classes.dex */
public final class cc7 extends defpackage.bc7 {
    public final /* synthetic */ int R;

    public /* synthetic */ cc7(int r1) {
            r0 = this;
            r0.R = r1
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.R
            switch(r0) {
                case 0: goto L1d;
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            int r0 = r3.L
            int r1 = r0 + 2
            r3.L = r1
            java.lang.Object[] r3 = r3.A
            int r0 = r0 + 1
            r3 = r3[r0]
            return r3
        L12:
            int r0 = r3.L
            int r1 = r0 + 2
            r3.L = r1
            java.lang.Object[] r3 = r3.A
            r3 = r3[r0]
            return r3
        L1d:
            int r0 = r3.L
            int r1 = r0 + 2
            r3.L = r1
            t04 r1 = new t04
            java.lang.Object[] r3 = r3.A
            r2 = r3[r0]
            int r0 = r0 + 1
            r3 = r3[r0]
            r0 = 0
            r1.<init>(r0, r2, r3)
            return r1
    }
}
