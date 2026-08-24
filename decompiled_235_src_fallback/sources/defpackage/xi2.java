package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xi2  reason: default package */
/* loaded from: classes.dex */
public final class xi2 implements java.util.concurrent.Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.String b;
    public final /* synthetic */ android.content.Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ java.lang.Object e;

    public /* synthetic */ xi2(java.lang.String r1, android.content.Context r2, java.lang.Object r3, int r4, int r5) {
            r0 = this;
            r0.a = r5
            r0.b = r1
            r0.c = r2
            r0.e = r3
            r0.d = r4
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r5 = this;
            int r0 = r5.a
            int r1 = r5.d
            java.lang.Object r2 = r5.e
            android.content.Context r3 = r5.c
            java.lang.String r5 = r5.b
            switch(r0) {
                case 0: goto L1b;
                default: goto Ld;
            }
        Ld:
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L14
            yi2 r5 = defpackage.zi2.b(r5, r3, r2, r1)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L14:
            yi2 r5 = new yi2
            r0 = -3
            r5.<init>(r0)
        L1a:
            return r5
        L1b:
            ui2 r2 = (defpackage.ui2) r2
            java.lang.Object[] r0 = new java.lang.Object[]{r2}
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 1
            r2.<init>(r4)
            r4 = 0
            r0 = r0[r4]
            java.util.Objects.requireNonNull(r0)
            r2.add(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r2)
            yi2 r5 = defpackage.zi2.b(r5, r3, r0, r1)
            return r5
    }
}
