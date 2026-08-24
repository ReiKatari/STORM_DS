package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzuf implements zztr {
    private final zzow zza;
    private zzsr zzb = new zzsr();
    private final int zzc;

    private zzuf(zzow zzowVar, int i) {
        this.zza = zzowVar;
        zzuo.zza();
        this.zzc = i;
    }

    public static zztr zzf(zzow zzowVar) {
        return new zzuf(zzowVar, 0);
    }

    public static zztr zzg(zzow zzowVar, int i) {
        return new zzuf(zzowVar, 1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final zztr zzb(zzov zzovVar) {
        this.zza.zzf(zzovVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final zztr zzc(zzsr zzsrVar) {
        this.zzb = zzsrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final String zzd() {
        zzst zzf = this.zza.zzj().zzf();
        if (zzf != null && !zzy.zzb(zzf.zzk())) {
            return (String) Preconditions.checkNotNull(zzf.zzk());
        }
        return "NA";
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zztr
    public final byte[] zze(int i, boolean z) {
        boolean z2;
        int i2 = i ^ 1;
        zzsr zzsrVar = this.zzb;
        if (1 != i2) {
            z2 = false;
        } else {
            z2 = true;
        }
        zzsrVar.zzf(Boolean.valueOf(z2));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzi(this.zzb.zzm());
        try {
            zzuo.zza();
            zzow zzowVar = this.zza;
            if (i == 0) {
                zzoy zzj = zzowVar.zzj();
                xd3 xd3Var = new xd3();
                zzmq.zza.configure(xd3Var);
                xd3Var.d = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    uf3 uf3Var = new uf3(stringWriter, xd3Var.a, xd3Var.b, xd3Var.c, xd3Var.d);
                    uf3Var.a(zzj);
                    uf3Var.c();
                    uf3Var.b.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            zzoy zzj2 = zzowVar.zzj();
            zzdb zzdbVar = new zzdb();
            zzmq.zza.configure(zzdbVar);
            return zzdbVar.zza().zza(zzj2);
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
