package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bw7  reason: default package */
/* loaded from: classes.dex */
public abstract class bw7 {
    public static final defpackage.qa4 a(defpackage.r94 r5, defpackage.px0 r6, int r7) {
            xq2 r6 = (defpackage.xq2) r6
            java.lang.Object r0 = r6.P()
            vs0 r1 = defpackage.ox0.a
            if (r0 != r1) goto L13
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vs4 r0 = defpackage.np2.Y(r0)
            r6.l0(r0)
        L13:
            qa4 r0 = (defpackage.qa4) r0
            r2 = r7 & 14
            r2 = r2 ^ 6
            r3 = 0
            r4 = 4
            if (r2 <= r4) goto L23
            boolean r2 = r6.f(r5)
            if (r2 != 0) goto L27
        L23:
            r7 = r7 & 6
            if (r7 != r4) goto L29
        L27:
            r7 = 1
            goto L2a
        L29:
            r7 = r3
        L2a:
            java.lang.Object r2 = r6.P()
            if (r7 != 0) goto L32
            if (r2 != r1) goto L3b
        L32:
            vg2 r2 = new vg2
            r7 = 0
            r2.<init>(r5, r0, r7, r3)
            r6.l0(r2)
        L3b:
            eo2 r2 = (defpackage.eo2) r2
            defpackage.mb3.i(r6, r2, r5)
            return r0
    }

    public static final void b(android.content.Context r10) {
            r10.getClass()
            java.lang.String r0 = "androidx.work.workdb"
            java.io.File r1 = r10.getDatabasePath(r0)
            r1.getClass()
            boolean r1 = r1.exists()
            if (r1 == 0) goto L106
            ga0 r1 = defpackage.ga0.f()
            java.lang.String r2 = defpackage.cw7.a
            java.lang.String r3 = "Migrating WorkDatabase to the no-backup directory"
            r1.b(r2, r3)
            java.io.File r0 = r10.getDatabasePath(r0)
            r0.getClass()
            java.io.File r10 = r10.getNoBackupFilesDir()
            r10.getClass()
            java.lang.String[] r1 = defpackage.cw7.b
            int r2 = r1.length
            int r2 = defpackage.c14.k0(r2)
            r3 = 16
            if (r2 >= r3) goto L37
            r2 = r3
        L37:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            int r2 = r1.length
            r4 = 0
        L3e:
            if (r4 >= r2) goto L78
            r5 = r1[r4]
            java.io.File r6 = new java.io.File
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r0.getPath()
            r7.append(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            java.io.File r7 = new java.io.File
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r10.getPath()
            r8.append(r9)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5)
            r3.put(r6, r7)
            int r4 = r4 + 1
            goto L3e
        L78:
            vr4 r1 = new vr4
            r1.<init>(r0, r10)
            java.util.Map r10 = defpackage.c14.p0(r3, r1)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L89:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L106
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.io.File r1 = (java.io.File) r1
            java.lang.Object r0 = r0.getValue()
            java.io.File r0 = (java.io.File) r0
            boolean r2 = r1.exists()
            if (r2 == 0) goto L89
            boolean r2 = r0.exists()
            if (r2 == 0) goto Lc4
            ga0 r2 = defpackage.ga0.f()
            java.lang.String r3 = defpackage.cw7.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Over-writing contents of "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r2.j(r3, r4)
        Lc4:
            boolean r2 = r1.renameTo(r0)
            if (r2 == 0) goto Le1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Migrated "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "to "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto Lfc
        Le1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Renaming "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " to "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = " failed"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
        Lfc:
            ga0 r1 = defpackage.ga0.f()
            java.lang.String r2 = defpackage.cw7.a
            r1.b(r2, r0)
            goto L89
        L106:
            return
    }
}
