package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaz extends defpackage.gj5 {
    private static final com.google.android.gms.common.internal.zaz zaa = null;

    static {
            com.google.android.gms.common.internal.zaz r0 = new com.google.android.gms.common.internal.zaz
            r0.<init>()
            com.google.android.gms.common.internal.zaz.zaa = r0
            return
    }

    private zaz() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.view.View zaa(android.content.Context r4, int r5, int r6) {
            com.google.android.gms.common.internal.zaz r0 = com.google.android.gms.common.internal.zaz.zaa
            com.google.android.gms.common.internal.zax r1 = new com.google.android.gms.common.internal.zax     // Catch: java.lang.Exception -> L1f
            r2 = 1
            r3 = 0
            r1.<init>(r2, r5, r6, r3)     // Catch: java.lang.Exception -> L1f
            zh4 r2 = new zh4     // Catch: java.lang.Exception -> L1f
            r2.<init>(r4)     // Catch: java.lang.Exception -> L1f
            java.lang.Object r4 = r0.getRemoteCreatorInstance(r4)     // Catch: java.lang.Exception -> L1f
            com.google.android.gms.common.internal.zam r4 = (com.google.android.gms.common.internal.zam) r4     // Catch: java.lang.Exception -> L1f
            d13 r4 = r4.zae(r2, r1)     // Catch: java.lang.Exception -> L1f
            java.lang.Object r4 = defpackage.zh4.d(r4)     // Catch: java.lang.Exception -> L1f
            android.view.View r4 = (android.view.View) r4     // Catch: java.lang.Exception -> L1f
            return r4
        L1f:
            r4 = move-exception
            fj5 r0 = new fj5
            java.lang.String r1 = "Could not get button with size "
            java.lang.String r2 = " and color "
            java.lang.String r5 = defpackage.lb1.j(r1, r5, r6, r2)
            r0.<init>(r5, r4)
            throw r0
    }

    @Override // defpackage.gj5
    public final /* synthetic */ java.lang.Object getRemoteCreator(android.os.IBinder r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r1 = "com.google.android.gms.common.internal.ISignInButtonCreator"
            android.os.IInterface r1 = r2.queryLocalInterface(r1)
            boolean r0 = r1 instanceof com.google.android.gms.common.internal.zam
            if (r0 == 0) goto L11
            com.google.android.gms.common.internal.zam r1 = (com.google.android.gms.common.internal.zam) r1
            return r1
        L11:
            com.google.android.gms.common.internal.zam r1 = new com.google.android.gms.common.internal.zam
            r1.<init>(r2)
            return r1
    }
}
