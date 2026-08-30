package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hv  reason: default package */
/* loaded from: classes.dex */
public final class hv implements ae6 {
    public final List A;
    public final y07 B;
    public final mi2 L;
    public final tj4 R;
    public boolean X = true;

    public hv(List list, Object obj, y07 y07Var, os osVar, mi2 mi2Var, fh fhVar) {
        this.A = list;
        this.B = y07Var;
        this.L = mi2Var;
        this.R = me2.G(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:34:0x0097, B:21:0x0049, B:23:0x004e, B:27:0x0075, B:32:0x008d), top: B:39:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0097 -> B:35:0x00a0). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.k11 r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.gv
            if (r0 == 0) goto L13
            r0 = r14
            gv r0 = (defpackage.gv) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            gv r0 = new gv
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.c0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.e0
            o27 r3 = defpackage.o27.a
            mi2 r4 = r13.L
            tj4 r5 = r13.R
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L8a
            r8 = 0
            r9 = 2
            if (r2 == r6) goto L41
            if (r2 != r9) goto L3b
            int r1 = r0.Z
            int r2 = r0.Y
            java.util.List r8 = r0.R
            defpackage.me2.a0(r14)     // Catch: java.lang.Throwable -> L38
            goto La0
        L38:
            r14 = move-exception
            goto Lb7
        L3b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r13)
            return r8
        L41:
            int r2 = r0.Z
            int r10 = r0.Y
            tb5 r11 = r0.X
            java.util.List r12 = r0.R
            defpackage.me2.a0(r14)     // Catch: java.lang.Throwable -> L38
            if (r14 == 0) goto L75
            y07 r1 = r13.B     // Catch: java.lang.Throwable -> L38
            int r2 = r1.d     // Catch: java.lang.Throwable -> L38
            pe2 r6 = r1.b     // Catch: java.lang.Throwable -> L38
            int r1 = r1.c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r14 = defpackage.me2.Y(r2, r14, r11, r6, r1)     // Catch: java.lang.Throwable -> L38
            r5.setValue(r14)     // Catch: java.lang.Throwable -> L38
            e31 r14 = r0.B
            r14.getClass()
            boolean r14 = defpackage.ln2.G(r14)
            r13.X = r7
            a17 r13 = new a17
            java.lang.Object r0 = r5.getValue()
            r13.<init>(r14, r0)
        L71:
            r4.n(r13)
            return r3
        L75:
            r0.R = r12     // Catch: java.lang.Throwable -> L38
            r0.X = r8     // Catch: java.lang.Throwable -> L38
            r0.Y = r10     // Catch: java.lang.Throwable -> L38
            r0.Z = r2     // Catch: java.lang.Throwable -> L38
            r0.e0 = r9     // Catch: java.lang.Throwable -> L38
            java.lang.Object r14 = defpackage.pj7.b(r0)     // Catch: java.lang.Throwable -> L38
            if (r14 != r1) goto L86
            return r1
        L86:
            r1 = r2
            r2 = r10
            r8 = r12
            goto La0
        L8a:
            defpackage.me2.a0(r14)
            java.util.List r14 = r13.A     // Catch: java.lang.Throwable -> L38
            int r1 = r14.size()     // Catch: java.lang.Throwable -> L38
            r8 = r14
            r2 = r7
        L95:
            if (r2 >= r1) goto La2
            java.lang.Object r14 = r8.get(r2)     // Catch: java.lang.Throwable -> L38
            tb5 r14 = (defpackage.tb5) r14     // Catch: java.lang.Throwable -> L38
            r14.getClass()     // Catch: java.lang.Throwable -> L38
        La0:
            int r2 = r2 + r6
            goto L95
        La2:
            e31 r14 = r0.B
            r14.getClass()
            boolean r14 = defpackage.ln2.G(r14)
            r13.X = r7
            a17 r13 = new a17
            java.lang.Object r0 = r5.getValue()
            r13.<init>(r14, r0)
            goto L71
        Lb7:
            e31 r0 = r0.B
            r0.getClass()
            boolean r0 = defpackage.ln2.G(r0)
            r13.X = r7
            a17 r13 = new a17
            java.lang.Object r1 = r5.getValue()
            r13.<init>(r0, r1)
            r4.n(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv.b(k11):java.lang.Object");
    }

    @Override // defpackage.ae6
    public final Object getValue() {
        return this.R.getValue();
    }
}
