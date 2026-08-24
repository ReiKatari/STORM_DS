package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uv4  reason: default package */
/* loaded from: classes.dex */
public final class uv4 {
    public final android.content.Context a;
    public final defpackage.of6 b;
    public final java.util.LinkedHashMap c;

    public uv4(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r3.a = r4
            r4 = 0
            r0 = 4
            r1 = 0
            r2 = 2147483647(0x7fffffff, float:NaN)
            of6 r4 = defpackage.pf6.b(r1, r2, r4, r0)
            r3.b = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r3.c = r4
            return
    }

    public final java.lang.Object a(java.lang.String r9, defpackage.s41 r10) {
            r8 = this;
            boolean r0 = r10 instanceof defpackage.tv4
            if (r0 == 0) goto L13
            r0 = r10
            tv4 r0 = (defpackage.tv4) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            tv4 r0 = new tv4
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 0
            android.content.Context r5 = r8.a
            r6 = 1
            if (r2 == 0) goto L33
            if (r2 != r6) goto L2d
            java.lang.String r9 = r0.R
            defpackage.oi2.Y(r10)
            goto L66
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r3
        L33:
            defpackage.oi2.Y(r10)
            int r10 = defpackage.ge7.s(r5, r9)
            if (r10 != 0) goto L3d
            goto L6e
        L3d:
            java.util.LinkedHashMap r10 = r8.c
            java.lang.Object r2 = r10.get(r9)
            if (r2 != 0) goto L4e
            m80 r2 = defpackage.m80.DROP_OLDEST
            of6 r2 = defpackage.pf6.a(r4, r6, r2)
            r10.put(r9, r2)
        L4e:
            na4 r2 = (defpackage.na4) r2
            bf4 r10 = new bf4
            r7 = 4
            r10.<init>(r8, r9, r3, r7)
            wt6 r8 = new wt6
            r8.<init>(r2, r10)
            r0.R = r9
            r0.Z = r6
            java.lang.Object r8 = defpackage.f04.B(r8, r0)
            if (r8 != r1) goto L66
            return r1
        L66:
            int r8 = defpackage.ge7.s(r5, r9)
            if (r8 != 0) goto L6d
            r4 = r6
        L6d:
            r6 = r4
        L6e:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            return r8
    }
}
