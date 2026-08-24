package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DuplicateTaskCompletionException extends java.lang.IllegalStateException {
    private DuplicateTaskCompletionException(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static java.lang.IllegalStateException of(com.google.android.gms.tasks.Task<?> r3) {
            boolean r0 = r3.isComplete()
            if (r0 != 0) goto Le
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "DuplicateTaskCompletionException can only be created from completed Task."
            r3.<init>(r0)
            return r3
        Le:
            java.lang.Exception r0 = r3.getException()
            if (r0 == 0) goto L17
            java.lang.String r3 = "failure"
            goto L37
        L17:
            boolean r1 = r3.isSuccessful()
            if (r1 == 0) goto L2c
            java.lang.Object r3 = r3.getResult()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "result "
            java.lang.String r3 = r1.concat(r3)
            goto L37
        L2c:
            boolean r3 = r3.isCanceled()
            if (r3 == 0) goto L35
            java.lang.String r3 = "cancellation"
            goto L37
        L35:
            java.lang.String r3 = "unknown issue"
        L37:
            com.google.android.gms.tasks.DuplicateTaskCompletionException r1 = new com.google.android.gms.tasks.DuplicateTaskCompletionException
            java.lang.String r2 = "Complete with: "
            java.lang.String r3 = r2.concat(r3)
            r1.<init>(r3, r0)
            return r1
    }
}
