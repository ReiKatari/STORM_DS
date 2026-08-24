package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i9  reason: default package */
/* loaded from: classes.dex */
public final class i9 extends defpackage.d9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.j9 b;
    public final /* synthetic */ java.lang.String c;
    public final /* synthetic */ defpackage.b9 d;

    public /* synthetic */ i9(defpackage.j9 r1, java.lang.String r2, defpackage.b9 r3, int r4) {
            r0 = this;
            r0.a = r4
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.<init>()
            return
    }

    @Override // defpackage.d9
    public final void a(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.a
            java.lang.String r1 = ". You must ensure the ActivityResultLauncher is registered before calling launch()."
            java.lang.String r2 = " and input "
            java.lang.String r3 = "Attempting to launch an unregistered ActivityResultLauncher with contract "
            b9 r4 = r7.d
            java.lang.String r5 = r7.c
            j9 r7 = r7.b
            switch(r0) {
                case 0: goto L31;
                default: goto L11;
            }
        L11:
            java.util.ArrayList r0 = r7.d
            java.util.LinkedHashMap r6 = r7.b
            java.lang.Object r6 = r6.get(r5)
            if (r6 == 0) goto L2d
            java.lang.Number r6 = (java.lang.Number) r6
            int r1 = r6.intValue()
            r0.add(r5)
            r7.b(r1, r4, r8)     // Catch: java.lang.Exception -> L28
            goto L30
        L28:
            r7 = move-exception
            r0.remove(r5)
            throw r7
        L2d:
            defpackage.u34.m(r3, r4, r2, r8, r1)
        L30:
            return
        L31:
            java.util.ArrayList r0 = r7.d
            java.util.LinkedHashMap r6 = r7.b
            java.lang.Object r6 = r6.get(r5)
            if (r6 == 0) goto L4d
            java.lang.Number r6 = (java.lang.Number) r6
            int r1 = r6.intValue()
            r0.add(r5)
            r7.b(r1, r4, r8)     // Catch: java.lang.Exception -> L48
            goto L50
        L48:
            r7 = move-exception
            r0.remove(r5)
            throw r7
        L4d:
            defpackage.u34.m(r3, r4, r2, r8, r1)
        L50:
            return
    }

    public void b() {
            r1 = this;
            j9 r0 = r1.b
            java.lang.String r1 = r1.c
            r0.f(r1)
            return
    }
}
