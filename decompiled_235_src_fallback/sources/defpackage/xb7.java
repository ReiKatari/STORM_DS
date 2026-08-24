package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xb7  reason: default package */
/* loaded from: classes.dex */
public final class xb7 implements defpackage.zc7 {
    public final defpackage.ie7 A;
    public final boolean B;
    public final java.lang.Class L;
    public final defpackage.if3 R;
    public final defpackage.be3 X;

    public xb7(java.lang.Object r2, defpackage.ie7 r3, boolean r4, java.lang.Class r5) {
            r1 = this;
            r1.<init>()
            r0 = r2
            if3 r0 = (defpackage.if3) r0
            r1.R = r0
            be3 r2 = (defpackage.be3) r2
            r1.X = r2
            r1.A = r3
            r1.B = r4
            r1.L = r5
            return
    }

    @Override // defpackage.zc7
    public final defpackage.yc7 a(defpackage.su2 r9, defpackage.ie7 r10) {
            r8 = this;
            ie7 r0 = r8.A
            if (r0 == 0) goto L19
            boolean r1 = r0.equals(r10)
            if (r1 != 0) goto L17
            boolean r1 = r8.B
            if (r1 == 0) goto L15
            java.lang.reflect.Type r0 = r0.b
            java.lang.Class r1 = r10.a
            if (r0 != r1) goto L15
            goto L17
        L15:
            r0 = 0
            goto L21
        L17:
            r0 = 1
            goto L21
        L19:
            java.lang.Class r0 = r8.L
            java.lang.Class r1 = r10.a
            boolean r0 = r0.isAssignableFrom(r1)
        L21:
            if (r0 == 0) goto L31
            yb7 r1 = new yb7
            be3 r3 = r8.X
            r7 = 1
            if3 r2 = r8.R
            r6 = r8
            r4 = r9
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L31:
            r8 = 0
            return r8
    }
}
