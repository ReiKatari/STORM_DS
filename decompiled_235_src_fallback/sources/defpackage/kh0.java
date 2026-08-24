package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kh0  reason: default package */
/* loaded from: classes.dex */
public final class kh0 implements defpackage.ia3 {
    public final java.lang.Object a;
    public final java.util.LinkedHashMap b;
    public final java.util.HashSet c;
    public defpackage.gx3 d;
    public defpackage.qb0 e;
    public defpackage.if0 f;

    public kh0() {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.b = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.c = r0
            return
    }

    @Override // defpackage.ia3
    public final void a(java.util.List r10) {
            r9 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Object r1 = r9.a
            monitor-enter(r1)
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> Lc5
            r2.<init>(r10)     // Catch: java.lang.Throwable -> Lc5
            java.util.LinkedHashMap r3 = r9.b     // Catch: java.lang.Throwable -> Lc5
            java.util.Set r3 = r3.keySet()     // Catch: java.lang.Throwable -> Lc5
            r2.removeAll(r3)     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            java.util.Iterator r1 = r2.iterator()     // Catch: defpackage.pi0 -> Lbc
        L1b:
            boolean r2 = r1.hasNext()     // Catch: defpackage.pi0 -> Lbc
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()     // Catch: defpackage.pi0 -> Lbc
            java.lang.String r2 = (java.lang.String) r2     // Catch: defpackage.pi0 -> Lbc
            if0 r3 = r9.f     // Catch: defpackage.pi0 -> Lbc
            eg0 r3 = r3.f(r2)     // Catch: defpackage.pi0 -> Lbc
            r0.put(r2, r3)     // Catch: defpackage.pi0 -> Lbc
            goto L1b
        L31:
            java.lang.Object r1 = r9.a
            monitor-enter(r1)
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L63
            java.util.LinkedHashMap r3 = r9.b     // Catch: java.lang.Throwable -> L63
            java.util.Set r3 = r3.keySet()     // Catch: java.lang.Throwable -> L63
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L63
            r2.removeAll(r10)     // Catch: java.lang.Throwable -> L63
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L63
            r3.<init>()     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L63
        L4b:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L65
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L63
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L63
            java.util.LinkedHashMap r5 = r9.b     // Catch: java.lang.Throwable -> L63
            java.lang.Object r4 = r5.get(r4)     // Catch: java.lang.Throwable -> L63
            eg0 r4 = (defpackage.eg0) r4     // Catch: java.lang.Throwable -> L63
            r3.add(r4)     // Catch: java.lang.Throwable -> L63
            goto L4b
        L63:
            r9 = move-exception
            goto Lba
        L65:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L63
            r2.<init>()     // Catch: java.lang.Throwable -> L63
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch: java.lang.Throwable -> L63
            int r4 = r10.size()     // Catch: java.lang.Throwable -> L63
            r5 = 0
            r6 = r5
        L72:
            if (r6 >= r4) goto L9a
            java.lang.Object r7 = r10.get(r6)     // Catch: java.lang.Throwable -> L63
            int r6 = r6 + 1
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L63
            java.util.LinkedHashMap r8 = r9.b     // Catch: java.lang.Throwable -> L63
            boolean r8 = r8.containsKey(r7)     // Catch: java.lang.Throwable -> L63
            if (r8 == 0) goto L90
            java.util.LinkedHashMap r8 = r9.b     // Catch: java.lang.Throwable -> L63
            java.lang.Object r8 = r8.get(r7)     // Catch: java.lang.Throwable -> L63
            eg0 r8 = (defpackage.eg0) r8     // Catch: java.lang.Throwable -> L63
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L63
            goto L72
        L90:
            java.lang.Object r8 = r0.get(r7)     // Catch: java.lang.Throwable -> L63
            eg0 r8 = (defpackage.eg0) r8     // Catch: java.lang.Throwable -> L63
            r2.put(r7, r8)     // Catch: java.lang.Throwable -> L63
            goto L72
        L9a:
            java.util.LinkedHashMap r10 = r9.b     // Catch: java.lang.Throwable -> L63
            r10.clear()     // Catch: java.lang.Throwable -> L63
            java.util.LinkedHashMap r9 = r9.b     // Catch: java.lang.Throwable -> L63
            r9.putAll(r2)     // Catch: java.lang.Throwable -> L63
            int r9 = r3.size()     // Catch: java.lang.Throwable -> L63
        La8:
            if (r5 >= r9) goto Lb8
            java.lang.Object r10 = r3.get(r5)     // Catch: java.lang.Throwable -> L63
            int r5 = r5 + 1
            eg0 r10 = (defpackage.eg0) r10     // Catch: java.lang.Throwable -> L63
            if (r10 == 0) goto La8
            r10.n()     // Catch: java.lang.Throwable -> L63
            goto La8
        Lb8:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L63
            return
        Lba:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L63
            throw r9
        Lbc:
            r9 = move-exception
            qi0 r10 = new qi0
            java.lang.String r0 = "Failed to create CameraInternal"
            r10.<init>(r0, r9)
            throw r10
        Lc5:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc5
            throw r9
    }

    public final defpackage.eg0 b(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "Invalid camera: "
            java.lang.Object r1 = r3.a
            monitor-enter(r1)
            java.util.LinkedHashMap r3 = r3.b     // Catch: java.lang.Throwable -> L11
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L11
            eg0 r3 = (defpackage.eg0) r3     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            return r3
        L11:
            r3 = move-exception
            goto L25
        L13:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L11
            r2.append(r4)     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L11
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L11
            throw r3     // Catch: java.lang.Throwable -> L11
        L25:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    public final java.util.LinkedHashSet c() {
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L10
            java.util.LinkedHashMap r2 = r2.b     // Catch: java.lang.Throwable -> L10
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L10
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    public final void d(defpackage.if0 r7) {
            r6 = this;
            r6.f = r7
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            java.util.Set r1 = r7.e()     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            if (r2 == 0) goto L45
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            java.lang.String r3 = "CameraRepository"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            r4.<init>()     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            java.lang.String r5 = "Added camera: "
            r4.append(r5)     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            r4.append(r2)     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            defpackage.kj2.t(r3, r4)     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            java.util.LinkedHashMap r3 = r6.b     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            eg0 r4 = r7.f(r2)     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            java.lang.Object r2 = r3.put(r2, r4)     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            eg0 r2 = (defpackage.eg0) r2     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            if (r2 == 0) goto Ld
            r2.release()     // Catch: java.lang.Throwable -> L41 defpackage.pi0 -> L43
            goto Ld
        L41:
            r6 = move-exception
            goto L4d
        L43:
            r6 = move-exception
            goto L47
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return
        L47:
            i53 r7 = new i53     // Catch: java.lang.Throwable -> L41
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L41
            throw r7     // Catch: java.lang.Throwable -> L41
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r6
    }
}
