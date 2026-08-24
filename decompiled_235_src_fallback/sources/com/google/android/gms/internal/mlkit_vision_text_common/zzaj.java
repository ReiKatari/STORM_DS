package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzaj extends com.google.android.gms.internal.mlkit_vision_text_common.zzah implements java.util.ListIterator {
    final /* synthetic */ com.google.android.gms.internal.mlkit_vision_text_common.zzak zzd;

    public zzaj(com.google.android.gms.internal.mlkit_vision_text_common.zzak r1) {
            r0 = this;
            r0.zzd = r1
            r0.<init>(r1)
            return
    }

    public zzaj(com.google.android.gms.internal.mlkit_vision_text_common.zzak r2, int r3) {
            r1 = this;
            r1.zzd = r2
            java.util.Collection r0 = r2.zzb
            java.util.List r0 = (java.util.List) r0
            java.util.ListIterator r3 = r0.listIterator(r3)
            r1.<init>(r2, r3)
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzak r0 = r2.zzd
            boolean r0 = r0.isEmpty()
            r2.zza()
            java.util.Iterator r1 = r2.zza
            java.util.ListIterator r1 = (java.util.ListIterator) r1
            r1.add(r3)
            com.google.android.gms.internal.mlkit_vision_text_common.zzak r3 = r2.zzd
            com.google.android.gms.internal.mlkit_vision_text_common.zzal r3 = r3.zzf
            int r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzd(r3)
            int r1 = r1 + 1
            com.google.android.gms.internal.mlkit_vision_text_common.zzal.zzj(r3, r1)
            if (r0 == 0) goto L24
            com.google.android.gms.internal.mlkit_vision_text_common.zzak r2 = r2.zzd
            r2.zza()
        L24:
            return
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r0 = this;
            r0.zza()
            java.util.Iterator r0 = r0.zza
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r0 = this;
            r0.zza()
            java.util.Iterator r0 = r0.zza
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            int r0 = r0.nextIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r0 = this;
            r0.zza()
            java.util.Iterator r0 = r0.zza
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            java.lang.Object r0 = r0.previous()
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r0 = this;
            r0.zza()
            java.util.Iterator r0 = r0.zza
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            int r0 = r0.previousIndex()
            return r0
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r1) {
            r0 = this;
            r0.zza()
            java.util.Iterator r0 = r0.zza
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            r0.set(r1)
            return
    }
}
