package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tx3  reason: default package */
/* loaded from: classes.dex */
public class tx3 extends defpackage.qo7 {
    public static final defpackage.nl2 c = null;
    public final defpackage.un6 b;

    static {
            nl2 r0 = new nl2
            r1 = 1
            r0.<init>(r1)
            defpackage.tx3.c = r0
            return
    }

    public tx3() {
            r2 = this;
            r2.<init>()
            un6 r0 = new un6
            r1 = 0
            r0.<init>(r1)
            r2.b = r0
            return
    }

    @Override // defpackage.qo7
    public final void d() {
            r5 = this;
            un6 r5 = r5.b
            int r0 = r5.f()
            r1 = 0
            if (r0 > 0) goto L1b
            int r0 = r5.R
            java.lang.Object[] r2 = r5.L
            r3 = r1
        Le:
            if (r3 >= r0) goto L16
            r4 = 0
            r2[r3] = r4
            int r3 = r3 + 1
            goto Le
        L16:
            r5.R = r1
            r5.A = r1
            return
        L1b:
            java.lang.Object r5 = r5.g(r1)
            r5.getClass()
            defpackage.u34.a()
            return
    }
}
