package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j43  reason: default package */
/* loaded from: classes.dex */
public final class j43 extends nk6 implements aj2 {
    public final /* synthetic */ k43 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j43(k43 k43Var, j11 j11Var) {
        super(2, j11Var);
        this.X = k43Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        o27 o27Var = o27.a;
        ((j43) t((j11) obj2, (o31) obj)).v(o27Var);
        return o27Var;
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new j43(this.X, j11Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0025 A[SYNTHETIC] */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r6) {
        /*
            r5 = this;
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            defpackage.me2.a0(r6)
            java.io.File r6 = new java.io.File
            k43 r5 = r5.X
            android.content.Context r0 = r5.a
            java.io.File r0 = r0.getFilesDir()
            java.lang.String r1 = "layouts.json"
            r6.<init>(r0, r1)
            ee6 r0 = r5.f     // Catch: java.lang.Exception -> L72
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L72
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Exception -> L72
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L72
            r1.<init>()     // Catch: java.lang.Exception -> L72
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L72
        L25:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L72
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L72
            dd1 r2 = (defpackage.dd1) r2     // Catch: java.lang.Exception -> L72
            boolean r3 = r2.b     // Catch: java.lang.Exception -> L72
            if (r3 != 0) goto L48
            java.lang.Object r2 = r2.a     // Catch: java.lang.Exception -> L72
            r3 = r2
            nd3 r3 = (defpackage.nd3) r3     // Catch: java.lang.Exception -> L72
            ld3 r3 = r3.c     // Catch: java.lang.Exception -> L72
            ld3 r4 = defpackage.ld3.DEFAULT     // Catch: java.lang.Exception -> L72
            if (r3 != r4) goto L41
            goto L48
        L41:
            nd3 r2 = (defpackage.nd3) r2     // Catch: java.lang.Exception -> L72
            od3 r2 = defpackage.od3.a.a(r2)     // Catch: java.lang.Exception -> L72
            goto L49
        L48:
            r2 = 0
        L49:
            if (r2 == 0) goto L25
            r1.add(r2)     // Catch: java.lang.Exception -> L72
            goto L25
        L4f:
            qo2 r0 = r5.b     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = r0.f(r1)     // Catch: java.lang.Exception -> L72
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Exception -> L72
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L72
            r2.<init>(r6)     // Catch: java.lang.Exception -> L72
            r1.<init>(r2)     // Catch: java.lang.Exception -> L72
            r1.write(r0)     // Catch: java.lang.Throwable -> L6b
            r1.close()     // Catch: java.lang.Exception -> L72
            v16 r5 = r5.c     // Catch: java.lang.Exception -> L72
            r5.i()     // Catch: java.lang.Exception -> L72
            goto L76
        L6b:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L6d
        L6d:
            r6 = move-exception
            defpackage.dt3.W(r1, r5)     // Catch: java.lang.Exception -> L72
            throw r6     // Catch: java.lang.Exception -> L72
        L72:
            r5 = move-exception
            r5.printStackTrace()
        L76:
            o27 r5 = defpackage.o27.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j43.v(java.lang.Object):java.lang.Object");
    }
}
