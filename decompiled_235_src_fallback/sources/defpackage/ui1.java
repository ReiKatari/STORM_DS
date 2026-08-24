package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ui1  reason: default package */
/* loaded from: classes.dex */
public final class ui1 extends java.lang.RuntimeException {
    public final defpackage.fx0 A;

    public ui1(defpackage.fx0 r10) {
            r9 = this;
            r9.<init>()
            r9.A = r10
            boolean r0 = r10.b
            if (r0 != 0) goto L7f
            r0 = 9
            int[] r0 = new int[r0]
            r0 = {x0080: FILL_ARRAY_DATA  , data: [201, 202, 204, 206, 207, 125, -127, 126665345, 200} // fill-array
            java.util.List r10 = r10.a
            int r1 = r10.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r4 = r3
        L1d:
            if (r4 >= r1) goto L4f
            int r5 = r4 + 1
            java.lang.Object r6 = r10.get(r4)
            hx0 r6 = (defpackage.hx0) r6
            int r7 = r6.a
            boolean r7 = defpackage.fv.m0(r0, r7)
            if (r7 != 0) goto L4d
            int r7 = r6.a
            r8 = 100
            if (r7 != r8) goto L4a
            int r4 = r4 + 2
            if (r4 >= r1) goto L46
            java.lang.Object r4 = r10.get(r4)
            hx0 r4 = (defpackage.hx0) r4
            int r4 = r4.a
            r6 = 1000(0x3e8, float:1.401E-42)
            if (r4 != r6) goto L46
            goto L4f
        L46:
            defpackage.gt0.Z0(r2)
            goto L4d
        L4a:
            r2.add(r6)
        L4d:
            r4 = r5
            goto L1d
        L4f:
            int r10 = r2.size()
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r10]
        L55:
            if (r3 >= r10) goto L7c
            java.lang.Object r1 = r2.get(r3)
            hx0 r1 = (defpackage.hx0) r1
            java.lang.StackTraceElement r4 = new java.lang.StackTraceElement
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "m$"
            r5.<init>(r6)
            int r1 = r1.a
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r5 = "SourceFile"
            java.lang.String r6 = "$$compose"
            r7 = 1
            r4.<init>(r6, r1, r5, r7)
            r0[r3] = r4
            int r3 = r3 + 1
            goto L55
        L7c:
            r9.setStackTrace(r0)
        L7f:
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
            r6 = this;
            fx0 r6 = r6.A
            boolean r0 = r6.b
            if (r0 == 0) goto L5c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Composition stack when thrown:\n"
            r0.<init>(r1)
            kw3 r1 = defpackage.hf.I()
            java.util.List r6 = r6.a
            r6.getClass()
            l14 r2 = new l14
            r2.<init>(r6)
            int r6 = r2.a()
            r3 = 0
            r4 = r3
        L21:
            if (r4 >= r6) goto L2f
            java.lang.Object r5 = r2.get(r4)
            hx0 r5 = (defpackage.hx0) r5
            r5.getClass()
            int r4 = r4 + 1
            goto L21
        L2f:
            kw3 r6 = defpackage.hf.A(r1)
            r6.getClass()
            l14 r1 = new l14
            r1.<init>(r6)
            int r6 = r1.a()
        L3f:
            if (r3 >= r6) goto L57
            java.lang.Object r2 = r1.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = "\tat "
            r0.append(r4)
            r0.append(r2)
            r2 = 10
            r0.append(r2)
            int r3 = r3 + 1
            goto L3f
        L57:
            java.lang.String r6 = r0.toString()
            return r6
        L5c:
            java.lang.String r6 = "Composition stack when thrown:"
            return r6
    }
}
