package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rt1  reason: default package */
/* loaded from: classes.dex */
public final class rt1 implements defpackage.e43 {
    public final boolean A;

    public rt1(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.e43
    public final boolean e() {
            r0 = this;
            boolean r0 = r0.A
            return r0
    }

    @Override // defpackage.e43
    public final defpackage.gg4 f() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Empty{"
            r0.<init>(r1)
            boolean r2 = r2.A
            if (r2 == 0) goto Le
            java.lang.String r2 = "Active"
            goto L10
        Le:
            java.lang.String r2 = "New"
        L10:
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.String r2 = defpackage.lb1.q(r0, r2, r1)
            return r2
    }
}
