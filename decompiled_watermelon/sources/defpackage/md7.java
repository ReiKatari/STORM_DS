package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: md7  reason: default package */
/* loaded from: classes.dex */
public final class md7 extends nk6 implements aj2 {
    public wc2 X;
    public int Y;
    public int Z;
    public int c0;
    public /* synthetic */ Object d0;
    public final /* synthetic */ wc2 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md7(wc2 wc2Var, j11 j11Var) {
        super(2, j11Var);
        this.e0 = wc2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((md7) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        md7 md7Var = new md7(this.e0, j11Var);
        md7Var.d0 = obj;
        return md7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0050 -> B:20:0x0053). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d0
            o31 r0 = (defpackage.o31) r0
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r8.c0
            r3 = 1
            if (r2 == 0) goto L1e
            if (r2 != r3) goto L17
            int r2 = r8.Z
            int r4 = r8.Y
            wc2 r5 = r8.X
            defpackage.me2.a0(r9)
            goto L53
        L17:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            r8 = 0
            return r8
        L1e:
            defpackage.me2.a0(r9)
            r9 = 0
            r2 = 12
            wc2 r4 = r8.e0
            r5 = r4
            r4 = r2
            r2 = r9
        L29:
            if (r2 >= r4) goto L55
            boolean r9 = defpackage.wc2.a(r5)     // Catch: java.lang.Throwable -> L34
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r9 = move-exception
            kc5 r6 = new kc5
            r6.<init>(r9)
            r9 = r6
        L3b:
            boolean r9 = r9 instanceof defpackage.kc5
            if (r9 != 0) goto L40
            goto L55
        L40:
            r8.d0 = r0
            r8.X = r5
            r8.Y = r4
            r8.Z = r2
            r8.c0 = r3
            r6 = 30
            java.lang.Object r9 = defpackage.dk7.q(r6, r8)
            if (r9 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L29
        L55:
            o27 r8 = defpackage.o27.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md7.v(java.lang.Object):java.lang.Object");
    }
}
