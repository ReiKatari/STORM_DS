package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ee3  reason: default package */
/* loaded from: classes.dex */
public abstract class ee3 {
    public int a() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public final defpackage.ze3 b() {
            r1 = this;
            boolean r0 = r1 instanceof defpackage.ze3
            if (r0 == 0) goto L7
            ze3 r1 = (defpackage.ze3) r1
            return r1
        L7:
            java.lang.String r0 = "Not a JSON Object: "
            defpackage.e41.y(r1, r0)
            r1 = 0
            return r1
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            throw r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L21
            r0.<init>()     // Catch: java.io.IOException -> L21
            vf3 r1 = new vf3     // Catch: java.io.IOException -> L21
            qy3 r2 = new qy3     // Catch: java.io.IOException -> L21
            r2.<init>(r0)     // Catch: java.io.IOException -> L21
            r1.<init>(r2)     // Catch: java.io.IOException -> L21
            ls6 r2 = defpackage.ls6.LENIENT     // Catch: java.io.IOException -> L21
            r1.J(r2)     // Catch: java.io.IOException -> L21
            ke3 r2 = defpackage.ke3.a     // Catch: java.io.IOException -> L21
            r2.getClass()     // Catch: java.io.IOException -> L21
            defpackage.ke3.g(r1, r3)     // Catch: java.io.IOException -> L21
            java.lang.String r3 = r0.toString()     // Catch: java.io.IOException -> L21
            return r3
        L21:
            r3 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r3)
            throw r0
    }
}
