package com.google.android.gms.internal.mlkit_vision_common;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzao implements mk7 {
    private boolean zza = false;
    private boolean zzb = false;
    private na2 zzc;
    private final zzak zzd;

    public zzao(zzak zzakVar) {
        this.zzd = zzakVar;
    }

    private final void zzb() {
        if (!this.zza) {
            this.zza = true;
            return;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final mk7 add(double d) {
        zzb();
        this.zzd.zza(this.zzc, d, this.zzb);
        return this;
    }

    public final void zza(na2 na2Var, boolean z) {
        this.zza = false;
        this.zzc = na2Var;
        this.zzb = z;
    }

    public final mk7 add(float f) {
        zzb();
        this.zzd.zzb(this.zzc, f, this.zzb);
        return this;
    }

    public final mk7 add(int i) {
        zzb();
        this.zzd.zzd(this.zzc, i, this.zzb);
        return this;
    }

    public final mk7 add(long j) {
        zzb();
        this.zzd.zze(this.zzc, j, this.zzb);
        return this;
    }

    @Override // defpackage.mk7
    public final mk7 add(String str) {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // defpackage.mk7
    public final mk7 add(boolean z) {
        zzb();
        this.zzd.zzd(this.zzc, z ? 1 : 0, this.zzb);
        return this;
    }

    public final mk7 add(byte[] bArr) {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }
}
