package com.google.android.gms.tasks;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class Task<TResult> {
    public Task() {
            r0 = this;
            r0.<init>()
            return
    }

    public com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(android.app.Activity r1, com.google.android.gms.tasks.OnCanceledListener r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "addOnCanceledListener is not implemented."
            r0.<init>(r1)
            throw r0
    }

    public com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(com.google.android.gms.tasks.OnCanceledListener r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "addOnCanceledListener is not implemented."
            r0.<init>(r1)
            throw r0
    }

    public com.google.android.gms.tasks.Task<TResult> addOnCanceledListener(java.util.concurrent.Executor r1, com.google.android.gms.tasks.OnCanceledListener r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "addOnCanceledListener is not implemented"
            r0.<init>(r1)
            throw r0
    }

    public com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(android.app.Activity r1, com.google.android.gms.tasks.OnCompleteListener<TResult> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "addOnCompleteListener is not implemented"
            r0.<init>(r1)
            throw r0
    }

    public com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(com.google.android.gms.tasks.OnCompleteListener<TResult> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "addOnCompleteListener is not implemented"
            r0.<init>(r1)
            throw r0
    }

    public com.google.android.gms.tasks.Task<TResult> addOnCompleteListener(java.util.concurrent.Executor r1, com.google.android.gms.tasks.OnCompleteListener<TResult> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "addOnCompleteListener is not implemented"
            r0.<init>(r1)
            throw r0
    }

    public abstract com.google.android.gms.tasks.Task<TResult> addOnFailureListener(android.app.Activity r1, com.google.android.gms.tasks.OnFailureListener r2);

    public abstract com.google.android.gms.tasks.Task<TResult> addOnFailureListener(com.google.android.gms.tasks.OnFailureListener r1);

    public abstract com.google.android.gms.tasks.Task<TResult> addOnFailureListener(java.util.concurrent.Executor r1, com.google.android.gms.tasks.OnFailureListener r2);

    public abstract com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(android.app.Activity r1, com.google.android.gms.tasks.OnSuccessListener<? super TResult> r2);

    public abstract com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(com.google.android.gms.tasks.OnSuccessListener<? super TResult> r1);

    public abstract com.google.android.gms.tasks.Task<TResult> addOnSuccessListener(java.util.concurrent.Executor r1, com.google.android.gms.tasks.OnSuccessListener<? super TResult> r2);

    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWith(com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "continueWith is not implemented"
            r0.<init>(r1)
            throw r0
    }

    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWith(java.util.concurrent.Executor r1, com.google.android.gms.tasks.Continuation<TResult, TContinuationResult> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "continueWith is not implemented"
            r0.<init>(r1)
            throw r0
    }

    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWithTask(com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "continueWithTask is not implemented"
            r0.<init>(r1)
            throw r0
    }

    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> continueWithTask(java.util.concurrent.Executor r1, com.google.android.gms.tasks.Continuation<TResult, com.google.android.gms.tasks.Task<TContinuationResult>> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "continueWithTask is not implemented"
            r0.<init>(r1)
            throw r0
    }

    public abstract java.lang.Exception getException();

    public abstract TResult getResult();

    public abstract <X extends java.lang.Throwable> TResult getResult(java.lang.Class<X> r1);

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> onSuccessTask(com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult> r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "onSuccessTask is not implemented"
            r0.<init>(r1)
            throw r0
    }

    public <TContinuationResult> com.google.android.gms.tasks.Task<TContinuationResult> onSuccessTask(java.util.concurrent.Executor r1, com.google.android.gms.tasks.SuccessContinuation<TResult, TContinuationResult> r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "onSuccessTask is not implemented"
            r0.<init>(r1)
            throw r0
    }
}
