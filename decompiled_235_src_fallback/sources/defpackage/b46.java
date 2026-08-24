package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b46  reason: default package */
/* loaded from: classes.dex */
public final class b46 {
    public final android.content.Context a;
    public final defpackage.sw4 b;

    public b46(android.content.Context r1, defpackage.sw4 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final java.io.File a(defpackage.pq5 r4, defpackage.c46 r5, boolean r6) {
            r3 = this;
            android.net.Uri r4 = r4.d
            int r4 = r4.hashCode()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            android.content.Context r3 = r3.a
            java.io.File r3 = r3.getFilesDir()
            java.lang.String r2 = "ss_screenshots"
            r1.<init>(r3, r2)
            r0.<init>(r1, r4)
            boolean r3 = r0.isDirectory()
            if (r3 != 0) goto L2c
            if (r6 == 0) goto L2c
            boolean r3 = r0.mkdirs()
            if (r3 != 0) goto L2c
            r3 = 0
            return r3
        L2c:
            java.io.File r3 = new java.io.File
            int r4 = r5.a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = ".png"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r0, r4)
            return r3
    }

    public final android.net.Uri b(defpackage.pq5 r2, defpackage.c46 r3) {
            r1 = this;
            r2.getClass()
            r0 = 0
            java.io.File r1 = r1.a(r2, r3, r0)
            if (r1 != 0) goto Lb
            goto L16
        Lb:
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L16
            android.net.Uri r1 = android.net.Uri.fromFile(r1)
            return r1
        L16:
            r1 = 0
            return r1
    }

    public final void c(java.io.File r5) {
            r4 = this;
            android.net.Uri r5 = android.net.Uri.fromFile(r5)
            if (r5 == 0) goto L4a
            sw4 r4 = r4.b
            s63 r4 = r4.d
            java.lang.String r5 = r5.toString()
            java.lang.Object r4 = r4.B
            nr1 r4 = (defpackage.nr1) r4
            java.util.Map r0 = r4.snapshot()
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r1.startsWith(r5)
            if (r2 == 0) goto L1e
            int r2 = r1.length()
            int r3 = r5.length()
            if (r2 <= r3) goto L1e
            int r2 = r5.length()
            char r2 = r1.charAt(r2)
            r3 = 10
            if (r2 != r3) goto L1e
            r4.remove(r1)
            goto L1e
        L4a:
            return
    }
}
