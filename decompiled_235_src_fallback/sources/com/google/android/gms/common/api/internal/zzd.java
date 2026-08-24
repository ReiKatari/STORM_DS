package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzd extends androidx.fragment.app.o implements com.google.android.gms.common.api.internal.LifecycleFragment {
    private static final java.util.WeakHashMap zza = null;
    private final java.util.Map zzb;
    private int zzc;
    private android.os.Bundle zzd;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            com.google.android.gms.common.api.internal.zzd.zza = r0
            return
    }

    public zzd() {
            r2 = this;
            r2.<init>()
            wu r0 = new wu
            r1 = 0
            r0.<init>(r1)
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.zzb = r0
            r2.zzc = r1
            return
    }

    public static /* bridge */ /* synthetic */ int zza(com.google.android.gms.common.api.internal.zzd r0) {
            int r0 = r0.zzc
            return r0
    }

    public static /* bridge */ /* synthetic */ android.os.Bundle zzb(com.google.android.gms.common.api.internal.zzd r0) {
            android.os.Bundle r0 = r0.zzd
            return r0
    }

    public static com.google.android.gms.common.api.internal.zzd zzc(androidx.fragment.app.p r6) {
            java.lang.String r0 = "SupportLifecycleFragmentImpl"
            java.util.WeakHashMap r1 = com.google.android.gms.common.api.internal.zzd.zza
            java.lang.Object r2 = r1.get(r6)
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            if (r2 == 0) goto L16
            java.lang.Object r2 = r2.get()
            com.google.android.gms.common.api.internal.zzd r2 = (com.google.android.gms.common.api.internal.zzd) r2
            if (r2 != 0) goto L15
            goto L16
        L15:
            return r2
        L16:
            ll2 r2 = r6.t()     // Catch: java.lang.ClassCastException -> L4a
            androidx.fragment.app.o r2 = r2.D(r0)     // Catch: java.lang.ClassCastException -> L4a
            com.google.android.gms.common.api.internal.zzd r2 = (com.google.android.gms.common.api.internal.zzd) r2     // Catch: java.lang.ClassCastException -> L4a
            if (r2 == 0) goto L28
            boolean r3 = r2.isRemoving()
            if (r3 == 0) goto L41
        L28:
            com.google.android.gms.common.api.internal.zzd r2 = new com.google.android.gms.common.api.internal.zzd
            r2.<init>()
            ll2 r3 = r6.t()
            r3.getClass()
            androidx.fragment.app.a r4 = new androidx.fragment.app.a
            r4.<init>(r3)
            r3 = 0
            r5 = 1
            r4.d(r3, r2, r0, r5)
            r4.i(r5, r5)
        L41:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.put(r6, r0)
            return r2
        L4a:
            r6 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            r0.<init>(r1, r6)
            throw r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(java.lang.String r3, com.google.android.gms.common.api.internal.LifecycleCallback r4) {
            r2 = this;
            java.util.Map r0 = r2.zzb
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L23
            java.util.Map r0 = r2.zzb
            r0.put(r3, r4)
            int r0 = r2.zzc
            if (r0 <= 0) goto L22
            x28 r0 = new x28
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.google.android.gms.common.api.internal.zzc r1 = new com.google.android.gms.common.api.internal.zzc
            r1.<init>(r2, r4, r3)
            r0.post(r1)
        L22:
            return
        L23:
            java.lang.String r2 = "LifecycleCallback with tag "
            java.lang.String r4 = " already added to this fragment."
            java.lang.String r2 = defpackage.lb1.A(r2, r3, r4)
            defpackage.i.h(r2)
            return
    }

    @Override // androidx.fragment.app.o
    public final void dump(java.lang.String r2, java.io.FileDescriptor r3, java.io.PrintWriter r4, java.lang.String[] r5) {
            r1 = this;
            super.dump(r2, r3, r4, r5)
            java.util.Map r1 = r1.zzb
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.dump(r2, r3, r4, r5)
            goto Ld
        L1d:
            return
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(java.lang.String r1, java.lang.Class<T> r2) {
            r0 = this;
            java.util.Map r0 = r0.zzb
            java.lang.Object r0 = r0.get(r1)
            java.lang.Object r0 = r2.cast(r0)
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final /* synthetic */ android.app.Activity getLifecycleActivity() {
            r0 = this;
            androidx.fragment.app.p r0 = r0.getActivity()
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
            r0 = this;
            int r0 = r0.zzc
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
            r1 = this;
            int r1 = r1.zzc
            r0 = 2
            if (r1 < r0) goto L7
            r1 = 1
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // androidx.fragment.app.o
    public final void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            super.onActivityResult(r2, r3, r4)
            java.util.Map r1 = r1.zzb
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r1.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.onActivityResult(r2, r3, r4)
            goto Ld
        L1d:
            return
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            r0 = 1
            r2.zzc = r0
            r2.zzd = r3
            java.util.Map r2 = r2.zzb
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L36
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = (com.google.android.gms.common.api.internal.LifecycleCallback) r1
            if (r3 == 0) goto L31
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            android.os.Bundle r0 = r3.getBundle(r0)
            goto L32
        L31:
            r0 = 0
        L32:
            r1.onCreate(r0)
            goto L12
        L36:
            return
    }

    @Override // androidx.fragment.app.o
    public final void onDestroy() {
            r1 = this;
            super.onDestroy()
            r0 = 5
            r1.zzc = r0
            java.util.Map r1 = r1.zzb
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r1.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.onDestroy()
            goto L10
        L20:
            return
    }

    @Override // androidx.fragment.app.o
    public final void onResume() {
            r1 = this;
            super.onResume()
            r0 = 3
            r1.zzc = r0
            java.util.Map r1 = r1.zzb
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r1.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.onResume()
            goto L10
        L20:
            return
    }

    @Override // androidx.fragment.app.o
    public final void onSaveInstanceState(android.os.Bundle r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L31
        L3:
            java.util.Map r3 = r3.zzb
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Ld:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.Object r2 = r0.getValue()
            com.google.android.gms.common.api.internal.LifecycleCallback r2 = (com.google.android.gms.common.api.internal.LifecycleCallback) r2
            r2.onSaveInstanceState(r1)
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r4.putBundle(r0, r1)
            goto Ld
        L31:
            return
    }

    @Override // androidx.fragment.app.o
    public final void onStart() {
            r1 = this;
            super.onStart()
            r0 = 2
            r1.zzc = r0
            java.util.Map r1 = r1.zzb
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r1.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.onStart()
            goto L10
        L20:
            return
    }

    @Override // androidx.fragment.app.o
    public final void onStop() {
            r1 = this;
            super.onStop()
            r0 = 4
            r1.zzc = r0
            java.util.Map r1 = r1.zzb
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r1.next()
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = (com.google.android.gms.common.api.internal.LifecycleCallback) r0
            r0.onStop()
            goto L10
        L20:
            return
    }
}
