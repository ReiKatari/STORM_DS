package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cg4  reason: default package */
/* loaded from: classes.dex */
public final class cg4 implements AutoCloseable {
    public final fg4 A;
    public final Object B;
    public boolean L;
    public long R;
    public long X;
    public long Y;
    public long Z;
    public long c0;
    public final ArrayList d0;
    public final LinkedHashMap e0;

    public cg4(fg4 fg4Var) {
        fg4Var.getClass();
        this.A = fg4Var;
        this.B = new Object();
        this.R = 1L;
        this.X = Long.MIN_VALUE;
        this.Y = Long.MIN_VALUE;
        this.Z = Long.MIN_VALUE;
        this.c0 = Long.MIN_VALUE;
        this.d0 = new ArrayList();
        this.e0 = new LinkedHashMap();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.B) {
            if (this.L) {
                return;
            }
            this.L = true;
            ArrayList p1 = tq0.p1(this.e0.values());
            this.e0.clear();
            ArrayList p12 = tq0.p1(this.d0);
            this.d0.clear();
            int size = p1.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = p1.get(i2);
                i2++;
                Object obj2 = ((hg4) obj).a;
            }
            int size2 = p12.size();
            while (i < size2) {
                Object obj3 = p12.get(i);
                i++;
                bg4 bg4Var = (bg4) obj3;
                bg4Var.getClass();
                bg4Var.a(-1L, new jg4(11));
            }
        }
    }

    public final void d(long j) {
        boolean z;
        synchronized (this.B) {
            try {
                if (this.L) {
                    return;
                }
                this.Z = j;
                ArrayList arrayList = this.d0;
                int size = arrayList.size();
                bg4 bg4Var = null;
                boolean z2 = false;
                int i = 0;
                Object obj = null;
                while (true) {
                    if (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (((bg4) obj2).b == j) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (z2) {
                                break;
                            }
                            obj = obj2;
                            z2 = true;
                        }
                    } else if (!z2) {
                    }
                }
                obj = null;
                bg4 bg4Var2 = (bg4) obj;
                if (bg4Var2 != null) {
                    this.c0 = bg4Var2.e;
                    this.d0.remove(bg4Var2);
                    bg4Var = bg4Var2;
                }
                if (bg4Var != null) {
                    bg4Var.a(-1L, new jg4(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
        r0 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r10 >= r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
        r2 = r1.get(r10);
        r10 = r10 + 1;
        r2 = (defpackage.bg4) r2;
        r2.getClass();
        r2.a(-1, new defpackage.jg4(12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(long r16, java.lang.Object r18) {
        /*
            r15 = this;
            r6 = r16
            r8 = r18
            java.lang.Object r9 = r15.B
            monitor-enter(r9)
            boolean r1 = r15.L     // Catch: java.lang.Throwable -> L36
            r10 = 0
            r11 = 0
            if (r1 != 0) goto L8c
            fg4 r1 = r15.A     // Catch: java.lang.Throwable -> L36
            long r2 = r15.c0     // Catch: java.lang.Throwable -> L36
            boolean r1 = r1.a(r2, r6)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L19
            goto L8c
        L19:
            java.util.ArrayList r1 = r15.d0     // Catch: java.lang.Throwable -> L36
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L36
            r3 = r10
        L20:
            if (r3 >= r2) goto L39
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L36
            int r3 = r3 + 1
            r5 = r4
            bg4 r5 = (defpackage.bg4) r5     // Catch: java.lang.Throwable -> L36
            fg4 r12 = r15.A     // Catch: java.lang.Throwable -> L36
            long r13 = r5.e     // Catch: java.lang.Throwable -> L36
            boolean r5 = r12.a(r13, r6)     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L20
            goto L3a
        L36:
            r0 = move-exception
            goto Lc1
        L39:
            r4 = r11
        L3a:
            r12 = r4
            bg4 r12 = (defpackage.bg4) r12     // Catch: java.lang.Throwable -> L36
            if (r12 == 0) goto L54
            boolean r5 = r12.a     // Catch: java.lang.Throwable -> L36
            long r1 = r12.d     // Catch: java.lang.Throwable -> L36
            long r3 = r12.e     // Catch: java.lang.Throwable -> L36
            r0 = r15
            java.util.ArrayList r1 = r0.w(r1, r3, r5)     // Catch: java.lang.Throwable -> L36
            r12.a(r6, r8)     // Catch: java.lang.Throwable -> L36
            java.util.ArrayList r0 = r15.d0     // Catch: java.lang.Throwable -> L36
            r0.remove(r12)     // Catch: java.lang.Throwable -> L36
            r0 = r11
            goto L92
        L54:
            java.util.LinkedHashMap r1 = r15.e0     // Catch: java.lang.Throwable -> L36
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L36
            hg4 r3 = new hg4     // Catch: java.lang.Throwable -> L36
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L36
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L36
            java.util.LinkedHashMap r1 = r15.e0     // Catch: java.lang.Throwable -> L36
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L36
            r2 = 3
            if (r1 <= r2) goto L89
            java.util.LinkedHashMap r1 = r15.e0     // Catch: java.lang.Throwable -> L36
            java.util.Set r1 = r1.keySet()     // Catch: java.lang.Throwable -> L36
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = defpackage.tq0.J0(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L36
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L36
            java.util.LinkedHashMap r0 = r15.e0     // Catch: java.lang.Throwable -> L36
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.Object r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L36
        L87:
            r1 = r11
            goto L92
        L89:
            r0 = r11
            r1 = r0
            goto L92
        L8c:
            hg4 r0 = new hg4     // Catch: java.lang.Throwable -> L36
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L36
            goto L87
        L92:
            monitor-exit(r9)
            hg4 r0 = (defpackage.hg4) r0
            if (r0 == 0) goto La0
            java.lang.Object r0 = r0.a
            boolean r2 = r0 instanceof defpackage.jg4
            if (r2 != 0) goto La0
            if (r0 == 0) goto La0
            r11 = r0
        La0:
            if (r1 == 0) goto Lc0
            int r0 = r1.size()
        La6:
            if (r10 >= r0) goto Lc0
            java.lang.Object r2 = r1.get(r10)
            int r10 = r10 + 1
            bg4 r2 = (defpackage.bg4) r2
            r2.getClass()
            jg4 r3 = new jg4
            r4 = 12
            r3.<init>(r4)
            r4 = -1
            r2.a(r4, r3)
            goto La6
        Lc0:
            return
        Lc1:
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg4.i(long, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:23:0x008e, B:25:0x0092, B:27:0x0098, B:30:0x00a0, B:35:0x00ab, B:38:0x00b1, B:43:0x00bc, B:49:0x00c6, B:50:0x00d2, B:52:0x00d8, B:56:0x00ed, B:58:0x00f1, B:59:0x0101, B:61:0x0114, B:62:0x0120, B:64:0x0126, B:68:0x013b, B:70:0x013f), top: B:98:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:23:0x008e, B:25:0x0092, B:27:0x0098, B:30:0x00a0, B:35:0x00ab, B:38:0x00b1, B:43:0x00bc, B:49:0x00c6, B:50:0x00d2, B:52:0x00d8, B:56:0x00ed, B:58:0x00f1, B:59:0x0101, B:61:0x0114, B:62:0x0120, B:64:0x0126, B:68:0x013b, B:70:0x013f), top: B:98:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:23:0x008e, B:25:0x0092, B:27:0x0098, B:30:0x00a0, B:35:0x00ab, B:38:0x00b1, B:43:0x00bc, B:49:0x00c6, B:50:0x00d2, B:52:0x00d8, B:56:0x00ed, B:58:0x00f1, B:59:0x0101, B:61:0x0114, B:62:0x0120, B:64:0x0126, B:68:0x013b, B:70:0x013f), top: B:98:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(long r19, long r21, long r23, defpackage.ag4 r25) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cg4.p(long, long, long, ag4):void");
    }

    public final ArrayList w(long j, long j2, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d0;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            bg4 bg4Var = (bg4) obj;
            if (bg4Var.a == z && bg4Var.d < j && bg4Var.e < j2) {
                arrayList.add(obj);
            }
        }
        arrayList2.removeAll(arrayList);
        return arrayList;
    }
}
