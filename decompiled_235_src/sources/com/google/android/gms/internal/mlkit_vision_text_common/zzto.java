package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzto extends zztt {
    private String zza;
    private boolean zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztt zza(boolean z) {
        this.zzb = true;
        this.zzd = (byte) (1 | this.zzd);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztt zzb(int i) {
        this.zzc = 1;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    public final zztt zzc(String str) {
        if (str != null) {
            this.zza = str;
            return this;
        }
        u34.x("Null libraryName");
        return null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztt
    public final zztu zzd() {
        String str;
        if (this.zzd == 3 && (str = this.zza) != null) {
            return new zztq(str, this.zzb, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" libraryName");
        }
        if ((this.zzd & 1) == 0) {
            sb.append(" enableFirelog");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" firelogEventType");
        }
        i.m("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
