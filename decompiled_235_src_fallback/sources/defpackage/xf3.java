package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xf3  reason: default package */
/* loaded from: classes.dex */
public class xf3 extends defpackage.db2 {
    @Override // defpackage.db2
    public defpackage.ai1 D(defpackage.lt4 r10) {
            r9 = this;
            r10.getClass()
            java.io.File r9 = r10.toFile()
            boolean r1 = r9.isFile()
            boolean r2 = r9.isDirectory()
            long r3 = r9.lastModified()
            long r5 = r9.length()
            if (r1 != 0) goto L2d
            if (r2 != 0) goto L2d
            r7 = 0
            int r10 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r10 != 0) goto L2d
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 != 0) goto L2d
            boolean r9 = r9.exists()
            if (r9 != 0) goto L2d
            r9 = 0
            return r9
        L2d:
            ai1 r0 = new ai1
            java.lang.Long r9 = java.lang.Long.valueOf(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r7 = 0
            r3 = 0
            r5 = 0
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // defpackage.db2
    public final defpackage.wf3 F(defpackage.lt4 r3) {
            r2 = this;
            wf3 r2 = new wf3
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.io.File r3 = r3.toFile()
            java.lang.String r1 = "r"
            r0.<init>(r3, r1)
            r2.<init>(r0)
            return r2
    }

    @Override // defpackage.db2
    public final defpackage.ui6 J(defpackage.lt4 r2) {
            r1 = this;
            r2.getClass()
            java.io.File r1 = r2.toFile()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r0 = 0
            r2.<init>(r1, r0)
            up4 r1 = new up4
            b67 r0 = new b67
            r0.<init>()
            r1.<init>(r2, r0)
            return r1
    }

    @Override // defpackage.db2
    public final defpackage.in6 N(defpackage.lt4 r2) {
            r1 = this;
            r2.getClass()
            java.io.File r1 = r2.toFile()
            a83 r2 = new a83
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            a67 r1 = defpackage.b67.d
            r2.<init>(r0, r1)
            return r2
    }

    @Override // defpackage.db2
    public final defpackage.ui6 e(defpackage.lt4 r2) {
            r1 = this;
            r2.getClass()
            java.io.File r1 = r2.toFile()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r0 = 1
            r2.<init>(r1, r0)
            up4 r1 = new up4
            b67 r0 = new b67
            r0.<init>()
            r1.<init>(r2, r0)
            return r1
    }

    @Override // defpackage.db2
    public void h(defpackage.lt4 r3, defpackage.lt4 r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.io.File r2 = r3.toFile()
            java.io.File r0 = r4.toFile()
            boolean r2 = r2.renameTo(r0)
            if (r2 == 0) goto L15
            return
        L15:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "failed to move "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " to "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // defpackage.db2
    public final void n(defpackage.lt4 r2) {
            r1 = this;
            r2.getClass()
            java.io.File r0 = r2.toFile()
            boolean r0 = r0.mkdir()
            if (r0 != 0) goto L1e
            ai1 r1 = r1.D(r2)
            if (r1 == 0) goto L19
            boolean r1 = r1.c
            r0 = 1
            if (r1 != r0) goto L19
            goto L1e
        L19:
            java.lang.String r1 = "failed to create directory: "
            defpackage.fa6.d(r2, r1)
        L1e:
            return
    }

    @Override // defpackage.db2
    public final void r(defpackage.lt4 r2) {
            r1 = this;
            r2.getClass()
            boolean r1 = java.lang.Thread.interrupted()
            if (r1 != 0) goto L20
            java.io.File r1 = r2.toFile()
            boolean r0 = r1.delete()
            if (r0 != 0) goto L1f
            boolean r1 = r1.exists()
            if (r1 != 0) goto L1a
            goto L1f
        L1a:
            java.lang.String r1 = "failed to delete "
            defpackage.fa6.d(r2, r1)
        L1f:
            return
        L20:
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException
            java.lang.String r2 = "interrupted"
            r1.<init>(r2)
            throw r1
    }

    public java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = "JvmSystemFileSystem"
            return r0
    }

    @Override // defpackage.db2
    public final java.util.List x(defpackage.lt4 r5) {
            r4 = this;
            r5.getClass()
            java.io.File r4 = r5.toFile()
            java.lang.String[] r0 = r4.list()
            if (r0 != 0) goto L20
            boolean r4 = r4.exists()
            r0 = 0
            if (r4 != 0) goto L1a
            java.lang.String r4 = "no such file: "
            defpackage.e41.u(r5, r4)
            return r0
        L1a:
            java.lang.String r4 = "failed to list "
            defpackage.fa6.d(r5, r4)
            return r0
        L20:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r1 = r0.length
            r2 = 0
        L27:
            if (r2 >= r1) goto L38
            r3 = r0[r2]
            r3.getClass()
            lt4 r3 = r5.d(r3)
            r4.add(r3)
            int r2 = r2 + 1
            goto L27
        L38:
            defpackage.jt0.w0(r4)
            return r4
    }
}
