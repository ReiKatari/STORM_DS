package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zzz extends com.google.android.gms.internal.mlkit_vision_text_common.zzcp {
    private final int zza;
    private int zzb;

    public zzz(int r2, int r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "index"
            com.google.android.gms.internal.mlkit_vision_text_common.zzx.zzb(r3, r2, r0)
            r1.zza = r2
            r1.zzb = r3
            return
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.zzb
            int r1 = r1.zza
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r0 = this;
            int r0 = r0.zzb
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L11
            int r0 = r2.zzb
            int r1 = r0 + 1
            r2.zzb = r1
            java.lang.Object r2 = r2.zza(r0)
            return r2
        L11:
            defpackage.fa6.c()
            r2 = 0
            return r2
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r0 = this;
            int r0 = r0.zzb
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L11
            int r0 = r1.zzb
            int r0 = r0 + (-1)
            r1.zzb = r0
            java.lang.Object r1 = r1.zza(r0)
            return r1
        L11:
            defpackage.fa6.c()
            r1 = 0
            return r1
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r0 = this;
            int r0 = r0.zzb
            int r0 = r0 + (-1)
            return r0
    }

    public abstract java.lang.Object zza(int r1);
}
