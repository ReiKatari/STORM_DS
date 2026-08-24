package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzmk implements zzmb {
    private final zziw zza;
    private zzky zzb = new zzky();

    private zzmk(zziw zziwVar, int i) {
        this.zza = zziwVar;
        zzmw.zza();
    }

    public static zzmb zze(zziw zziwVar) {
        return new zzmk(zziwVar, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zza(zziv zzivVar) {
        this.zza.zzc(zzivVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final zzmb zzb(zzky zzkyVar) {
        this.zzb = zzkyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final String zzc() {
        zzla zzc = this.zza.zzf().zzc();
        if (zzc != null && !zzg.zzb(zzc.zzk())) {
            return (String) Preconditions.checkNotNull(zzc.zzk());
        }
        return "NA";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmb
    public final byte[] zzd(int i, boolean z) {
        boolean z2;
        int i2 = i ^ 1;
        zzky zzkyVar = this.zzb;
        if (1 != i2) {
            z2 = false;
        } else {
            z2 = true;
        }
        zzkyVar.zzf(Boolean.valueOf(z2));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zze(this.zzb.zzm());
        try {
            zzmw.zza();
            zziw zziwVar = this.zza;
            if (i == 0) {
                zziy zzf = zziwVar.zzf();
                xd3 xd3Var = new xd3();
                zzhe.zza.configure(xd3Var);
                xd3Var.d = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    uf3 uf3Var = new uf3(stringWriter, xd3Var.a, xd3Var.b, xd3Var.c, xd3Var.d);
                    uf3Var.a(zzf);
                    uf3Var.c();
                    uf3Var.b.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            zziy zzf2 = zziwVar.zzf();
            zzam zzamVar = new zzam();
            zzhe.zza.configure(zzamVar);
            return zzamVar.zza().zza(zzf2);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
