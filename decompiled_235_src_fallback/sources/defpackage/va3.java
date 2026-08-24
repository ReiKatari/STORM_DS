package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: va3  reason: default package */
/* loaded from: classes.dex */
public final class va3 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ defpackage.wa3 X;

    public va3(defpackage.wa3 r1, defpackage.r41 r2) {
            r0 = this;
            r0.X = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            va3 r0 = (defpackage.va3) r0
            jg7 r1 = defpackage.jg7.a
            r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r1, java.lang.Object r2) {
            r0 = this;
            va3 r2 = new va3
            wa3 r0 = r0.X
            r2.<init>(r0, r1)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r6) {
            r5 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r6)
            java.io.File r6 = new java.io.File
            wa3 r5 = r5.X
            android.content.Context r0 = r5.a
            java.io.File r0 = r0.getFilesDir()
            java.lang.String r1 = "layouts.json"
            r6.<init>(r0, r1)
            tp6 r0 = r5.f     // Catch: java.lang.Exception -> L72
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L72
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Exception -> L72
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Exception -> L72
            r1.<init>()     // Catch: java.lang.Exception -> L72
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L72
        L25:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L72
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L72
            fh1 r2 = (defpackage.fh1) r2     // Catch: java.lang.Exception -> L72
            boolean r3 = r2.b     // Catch: java.lang.Exception -> L72
            if (r3 != 0) goto L48
            java.lang.Object r2 = r2.a     // Catch: java.lang.Exception -> L72
            r3 = r2
            fk3 r3 = (defpackage.fk3) r3     // Catch: java.lang.Exception -> L72
            dk3 r3 = r3.c     // Catch: java.lang.Exception -> L72
            dk3 r4 = defpackage.dk3.DEFAULT     // Catch: java.lang.Exception -> L72
            if (r3 != r4) goto L41
            goto L48
        L41:
            fk3 r2 = (defpackage.fk3) r2     // Catch: java.lang.Exception -> L72
            gk3 r2 = defpackage.gk3.a.a(r2)     // Catch: java.lang.Exception -> L72
            goto L49
        L48:
            r2 = 0
        L49:
            if (r2 == 0) goto L25
            r1.add(r2)     // Catch: java.lang.Exception -> L72
            goto L25
        L4f:
            su2 r0 = r5.b     // Catch: java.lang.Exception -> L72
            java.lang.String r0 = r0.f(r1)     // Catch: java.lang.Exception -> L72
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Exception -> L72
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L72
            r2.<init>(r6)     // Catch: java.lang.Exception -> L72
            r1.<init>(r2)     // Catch: java.lang.Exception -> L72
            r1.write(r0)     // Catch: java.lang.Throwable -> L6b
            r1.close()     // Catch: java.lang.Exception -> L72
            jd6 r5 = r5.c     // Catch: java.lang.Exception -> L72
            r5.i()     // Catch: java.lang.Exception -> L72
            goto L76
        L6b:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L6d
        L6d:
            r6 = move-exception
            defpackage.ge7.t(r1, r5)     // Catch: java.lang.Exception -> L72
            throw r6     // Catch: java.lang.Exception -> L72
        L72:
            r5 = move-exception
            r5.printStackTrace()
        L76:
            jg7 r5 = defpackage.jg7.a
            return r5
    }
}
