package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f64  reason: default package */
/* loaded from: classes.dex */
public final class f64 implements defpackage.y54 {
    public final android.content.Context a;
    public final defpackage.id3 b;

    public f64(android.content.Context r1, defpackage.id3 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.y54
    public final int a() {
            r0 = this;
            r0 = 33
            return r0
    }

    @Override // defpackage.y54
    public final void b() {
            r7 = this;
            id3 r0 = r7.b
            java.io.File r1 = new java.io.File
            android.content.Context r7 = r7.a
            java.io.File r7 = r7.getFilesDir()
            java.lang.String r2 = "controller_config.json"
            r1.<init>(r7, r2)
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L113
            r7.<init>(r1)     // Catch: java.lang.Exception -> L113
            w41$b r2 = defpackage.w41.Companion     // Catch: java.lang.Throwable -> Lf5
            gg3 r2 = r2.serializer()     // Catch: java.lang.Throwable -> Lf5
            gg3 r2 = (defpackage.gg3) r2     // Catch: java.lang.Throwable -> Lf5
            r2.getClass()     // Catch: java.lang.Throwable -> Lf5
            s63 r3 = new s63     // Catch: java.lang.Throwable -> Lf5
            r3.<init>(r7)     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r4 = r3.B     // Catch: java.lang.Throwable -> Lf5
            pm0 r4 = (defpackage.pm0) r4     // Catch: java.lang.Throwable -> Lf5
            java.lang.Object r2 = defpackage.oi2.s(r0, r2, r3)     // Catch: java.lang.Throwable -> Lf7
            r4.getClass()     // Catch: java.lang.Throwable -> Lf5
            u90 r3 = defpackage.u90.c     // Catch: java.lang.Throwable -> Lf5
            java.nio.ByteBuffer r4 = r4.c     // Catch: java.lang.Throwable -> Lf5
            byte[] r4 = r4.array()     // Catch: java.lang.Throwable -> Lf5
            r4.getClass()     // Catch: java.lang.Throwable -> Lf5
            r3.getClass()     // Catch: java.lang.Throwable -> Lf5
            r3.a(r4)     // Catch: java.lang.Throwable -> Lf5
            w41 r2 = (defpackage.w41) r2     // Catch: java.lang.Throwable -> Lf5
            r7.close()     // Catch: java.lang.Exception -> L113
            java.util.List r7 = r2.g()     // Catch: java.lang.Exception -> L113
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L113
            r3 = 10
            int r3 = defpackage.ht0.v0(r7, r3)     // Catch: java.lang.Exception -> L113
            r2.<init>(r3)     // Catch: java.lang.Exception -> L113
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Exception -> L113
        L58:
            boolean r3 = r7.hasNext()     // Catch: java.lang.Exception -> L113
            if (r3 == 0) goto L86
            java.lang.Object r3 = r7.next()     // Catch: java.lang.Exception -> L113
            l63 r3 = (defpackage.l63) r3     // Catch: java.lang.Exception -> L113
            int r4 = r3.j()     // Catch: java.lang.Exception -> L113
            r5 = -1
            if (r4 != r5) goto L6e
            g63 r4 = defpackage.g63.a     // Catch: java.lang.Exception -> L113
            goto L78
        L6e:
            f63 r4 = new f63     // Catch: java.lang.Exception -> L113
            int r5 = r3.j()     // Catch: java.lang.Exception -> L113
            r6 = 0
            r4.<init>(r5, r6)     // Catch: java.lang.Exception -> L113
        L78:
            i63 r5 = new i63     // Catch: java.lang.Exception -> L113
            b63 r3 = r3.h()     // Catch: java.lang.Exception -> L113
            r6 = 4
            r5.<init>(r3, r4, r6)     // Catch: java.lang.Exception -> L113
            r2.add(r5)     // Catch: java.lang.Exception -> L113
            goto L58
        L86:
            u41 r7 = new u41     // Catch: java.lang.Exception -> L113
            r7.<init>(r2)     // Catch: java.lang.Exception -> L113
            v41$b r2 = defpackage.v41.Companion     // Catch: java.lang.Exception -> L113
            r2.getClass()     // Catch: java.lang.Exception -> L113
            v41 r7 = defpackage.v41.b.a(r7)     // Catch: java.lang.Exception -> L113
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L113
            r3.<init>(r1)     // Catch: java.lang.Exception -> L113
            gg3 r2 = r2.serializer()     // Catch: java.lang.Throwable -> Lee
            gg3 r2 = (defpackage.gg3) r2     // Catch: java.lang.Throwable -> Lee
            r2.getClass()     // Catch: java.lang.Throwable -> Lee
            aj r4 = new aj     // Catch: java.lang.Throwable -> Lee
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lee
            java.lang.Object r5 = r4.R     // Catch: java.lang.Throwable -> Lee
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> Lee
            defpackage.oi2.v(r0, r4, r2, r7)     // Catch: java.lang.Throwable -> Lcf
            r4.b()     // Catch: java.lang.Throwable -> Lee
            jm0 r7 = defpackage.jm0.c     // Catch: java.lang.Throwable -> Lee
            java.lang.Object r0 = r4.X     // Catch: java.lang.Throwable -> Lee
            char[] r0 = (char[]) r0     // Catch: java.lang.Throwable -> Lee
            r7.getClass()     // Catch: java.lang.Throwable -> Lee
            r0.getClass()     // Catch: java.lang.Throwable -> Lee
            r7.b(r0)     // Catch: java.lang.Throwable -> Lee
            v90 r7 = defpackage.v90.c     // Catch: java.lang.Throwable -> Lee
            r7.getClass()     // Catch: java.lang.Throwable -> Lee
            r5.getClass()     // Catch: java.lang.Throwable -> Lee
            r7.a(r5)     // Catch: java.lang.Throwable -> Lee
            r3.close()     // Catch: java.lang.Exception -> L113
            return
        Lcf:
            r7 = move-exception
            r4.b()     // Catch: java.lang.Throwable -> Lee
            jm0 r0 = defpackage.jm0.c     // Catch: java.lang.Throwable -> Lee
            java.lang.Object r2 = r4.X     // Catch: java.lang.Throwable -> Lee
            char[] r2 = (char[]) r2     // Catch: java.lang.Throwable -> Lee
            r0.getClass()     // Catch: java.lang.Throwable -> Lee
            r2.getClass()     // Catch: java.lang.Throwable -> Lee
            r0.b(r2)     // Catch: java.lang.Throwable -> Lee
            v90 r0 = defpackage.v90.c     // Catch: java.lang.Throwable -> Lee
            r0.getClass()     // Catch: java.lang.Throwable -> Lee
            r5.getClass()     // Catch: java.lang.Throwable -> Lee
            r0.a(r5)     // Catch: java.lang.Throwable -> Lee
            throw r7     // Catch: java.lang.Throwable -> Lee
        Lee:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> Lf0
        Lf0:
            r0 = move-exception
            defpackage.ge7.t(r3, r7)     // Catch: java.lang.Exception -> L113
            throw r0     // Catch: java.lang.Exception -> L113
        Lf5:
            r0 = move-exception
            goto L10d
        Lf7:
            r0 = move-exception
            r4.getClass()     // Catch: java.lang.Throwable -> Lf5
            u90 r2 = defpackage.u90.c     // Catch: java.lang.Throwable -> Lf5
            java.nio.ByteBuffer r3 = r4.c     // Catch: java.lang.Throwable -> Lf5
            byte[] r3 = r3.array()     // Catch: java.lang.Throwable -> Lf5
            r3.getClass()     // Catch: java.lang.Throwable -> Lf5
            r2.getClass()     // Catch: java.lang.Throwable -> Lf5
            r2.a(r3)     // Catch: java.lang.Throwable -> Lf5
            throw r0     // Catch: java.lang.Throwable -> Lf5
        L10d:
            throw r0     // Catch: java.lang.Throwable -> L10e
        L10e:
            r2 = move-exception
            defpackage.ge7.t(r7, r0)     // Catch: java.lang.Exception -> L113
            throw r2     // Catch: java.lang.Exception -> L113
        L113:
            r1.delete()
            return
    }

    @Override // defpackage.y54
    public final int c() {
            r0 = this;
            r0 = 34
            return r0
    }
}
