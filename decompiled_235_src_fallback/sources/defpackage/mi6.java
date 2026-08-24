package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi6  reason: default package */
/* loaded from: classes.dex */
public final class mi6 {
    public final defpackage.vs4 a;
    public final defpackage.vs4 b;

    public mi6() {
            r1 = this;
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vs4 r0 = defpackage.np2.Y(r0)
            r1.a = r0
            r0 = 0
            vs4 r0 = defpackage.np2.Y(r0)
            r1.b = r0
            return
    }

    public final void a(java.lang.String r9, java.util.List r10, defpackage.qn2 r11, java.lang.Object r12, defpackage.qn2 r13) {
            r8 = this;
            r10.getClass()
            vs4 r0 = r8.a
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L12
            return
        L12:
            li6 r2 = new li6
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            vs4 r8 = r8.b
            r8.setValue(r2)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r0.setValue(r8)
            return
    }
}
