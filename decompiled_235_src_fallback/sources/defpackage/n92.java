package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n92  reason: default package */
/* loaded from: classes.dex */
public final class n92 extends defpackage.oi2 {
    public final java.lang.Object e;
    public final java.lang.String f;
    public final defpackage.vl7 g;
    public final defpackage.se0 h;

    public n92(java.lang.Object r3, java.lang.String r4, defpackage.vs0 r5, defpackage.vl7 r6) {
            r2 = this;
            r3.getClass()
            r6.getClass()
            r2.<init>()
            r2.e = r3
            r2.f = r4
            r2.g = r6
            se0 r5 = new se0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = " value: "
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r5.<init>(r3)
            java.lang.StackTraceElement[] r3 = r5.getStackTrace()
            r3.getClass()
            int r4 = r3.length
            int r4 = r4 + (-2)
            r6 = 0
            if (r4 >= 0) goto L36
            r4 = r6
        L36:
            if (r4 < 0) goto L6b
            if (r4 != 0) goto L3d
            yt1 r3 = defpackage.yt1.A
            goto L5d
        L3d:
            int r0 = r3.length
            if (r4 < r0) goto L45
            java.util.List r3 = defpackage.fv.T0(r3)
            goto L5d
        L45:
            r1 = 1
            if (r4 != r1) goto L50
            int r0 = r0 - r1
            r3 = r3[r0]
            java.util.List r3 = defpackage.hf.b0(r3)
            goto L5d
        L50:
            int r4 = r0 - r4
            java.lang.Object[] r3 = defpackage.fv.y0(r3, r4, r0)
            java.util.List r3 = java.util.Arrays.asList(r3)
            r3.getClass()
        L5d:
            java.lang.StackTraceElement[] r4 = new java.lang.StackTraceElement[r6]
            java.lang.Object[] r3 = r3.toArray(r4)
            java.lang.StackTraceElement[] r3 = (java.lang.StackTraceElement[]) r3
            r5.setStackTrace(r3)
            r2.h = r5
            return
        L6b:
            java.lang.String r2 = "Requested element count "
            java.lang.String r3 = " is less than zero."
            java.lang.String r2 = defpackage.lb1.k(r2, r4, r3)
            defpackage.i.f(r2)
            r2 = 0
            throw r2
    }

    @Override // defpackage.oi2
    public final defpackage.oi2 U(java.lang.String r1, defpackage.qn2 r2) {
            r0 = this;
            return r0
    }

    @Override // defpackage.oi2
    public final java.lang.Object o() {
            r3 = this;
            int[] r0 = defpackage.m92.a
            vl7 r1 = r3.g
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L3a
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L19
            r3 = 3
            if (r0 != r3) goto L15
            return r2
        L15:
            defpackage.i.d()
            return r2
        L19:
            java.lang.Object r0 = r3.e
            r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.f
            r1.append(r3)
            java.lang.String r3 = " value: "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r0 = "uh6"
            android.util.Log.d(r0, r3)
            return r2
        L3a:
            se0 r3 = r3.h
            throw r3
    }
}
