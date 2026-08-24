package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class NativeOnCompleteListener implements com.google.android.gms.tasks.OnCompleteListener<java.lang.Object> {
    private final long zza;

    public NativeOnCompleteListener(long r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static void createAndAddCallback(com.google.android.gms.tasks.Task<java.lang.Object> r1, long r2) {
            com.google.android.gms.tasks.NativeOnCompleteListener r0 = new com.google.android.gms.tasks.NativeOnCompleteListener
            r0.<init>(r2)
            r1.addOnCompleteListener(r0)
            return
    }

    public native void nativeOnComplete(long r1, java.lang.Object r3, boolean r4, boolean r5, java.lang.String r6);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(com.google.android.gms.tasks.Task<java.lang.Object> r10) {
            r9 = this;
            boolean r0 = r10.isSuccessful()
            r1 = 0
            if (r0 == 0) goto Le
            java.lang.Object r0 = r10.getResult()
            r5 = r0
            r8 = r1
            goto L23
        Le:
            boolean r0 = r10.isCanceled()
            if (r0 != 0) goto L21
            java.lang.Exception r0 = r10.getException()
            if (r0 == 0) goto L21
            java.lang.String r0 = r0.getMessage()
            r8 = r0
            r5 = r1
            goto L23
        L21:
            r5 = r1
            r8 = r5
        L23:
            long r3 = r9.zza
            boolean r6 = r10.isSuccessful()
            boolean r7 = r10.isCanceled()
            r2 = r9
            r2.nativeOnComplete(r3, r5, r6, r7, r8)
            return
    }
}
