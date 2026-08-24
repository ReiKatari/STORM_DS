package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzsk implements zzry {
    private final zzmw zza;
    private zzqt zzb = new zzqt();

    private zzsk(zzmw zzmwVar, int i) {
        this.zza = zzmwVar;
        zzsv.zza();
    }

    public static zzry zzf(zzmw zzmwVar) {
        return new zzsk(zzmwVar, 0);
    }

    public static zzry zzg() {
        return new zzsk(new zzmw(), 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zza(zzmv zzmvVar) {
        this.zza.zzf(zzmvVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zzb(zznc zzncVar) {
        this.zza.zzi(zzncVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final zzry zzc(zzqt zzqtVar) {
        this.zzb = zzqtVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final String zzd() {
        String zzk;
        zzqv zzf = this.zza.zzk().zzf();
        if (zzf != null && (zzk = zzf.zzk()) != null && !zzk.isEmpty()) {
            return (String) Preconditions.checkNotNull(zzf.zzk());
        }
        return "NA";
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzry
    public final byte[] zze(int i, boolean z) {
        boolean z2;
        int i2 = i ^ 1;
        zzqt zzqtVar = this.zzb;
        if (1 != i2) {
            z2 = false;
        } else {
            z2 = true;
        }
        zzqtVar.zzf(Boolean.valueOf(z2));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zzsv.zza();
            zzmw zzmwVar = this.zza;
            if (i == 0) {
                zzmy zzk = zzmwVar.zzk();
                xd3 xd3Var = new xd3();
                zzkr.zza.configure(xd3Var);
                xd3Var.d = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    uf3 uf3Var = new uf3(stringWriter, xd3Var.a, xd3Var.b, xd3Var.c, xd3Var.d);
                    uf3Var.a(zzk);
                    uf3Var.c();
                    uf3Var.b.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            zzmy zzk2 = zzmwVar.zzk();
            zzbg zzbgVar = new zzbg();
            zzkr.zza.configure(zzbgVar);
            return zzbgVar.zza().zza(zzk2);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
