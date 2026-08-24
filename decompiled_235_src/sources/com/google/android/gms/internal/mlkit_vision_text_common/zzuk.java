package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzuk implements zzts {
    private o55 zza;
    private final o55 zzb;
    private final zztu zzc;

    public zzuk(Context context, zztu zztuVar) {
        this.zzc = zztuVar;
        fa0 fa0Var = fa0.e;
        sb7.b(context);
        final m44 c = sb7.a().c(fa0Var);
        if (fa0.d.contains(new c42("json"))) {
            this.zza = new ho3(new o55() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuh
                @Override // defpackage.o55
                public final Object get() {
                    return ((m44) qb7.this).x(new c42("json"), new q97() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzuj
                        @Override // defpackage.q97
                        public final Object apply(Object obj) {
                            return (byte[]) obj;
                        }
                    });
                }
            });
        }
        this.zzb = new ho3(new o55() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzui
            @Override // defpackage.o55
            public final Object get() {
                return ((m44) qb7.this).x(new c42("proto"), new q97() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzug
                    @Override // defpackage.q97
                    public final Object apply(Object obj) {
                        return (byte[]) obj;
                    }
                });
            }
        });
    }

    public static i62 zzb(zztu zztuVar, zztr zztrVar) {
        int zza = zztuVar.zza();
        if (zztrVar.zza() != 0) {
            return new gy(zztrVar.zze(zza, false), b35.DEFAULT);
        }
        return new gy(zztrVar.zze(zza, false), b35.VERY_LOW);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzts
    public final void zza(zztr zztrVar) {
        if (this.zzc.zza() == 0) {
            o55 o55Var = this.zza;
            if (o55Var != null) {
                ((rb7) o55Var.get()).a(zzb(this.zzc, zztrVar));
                return;
            }
            return;
        }
        ((rb7) this.zzb.get()).a(zzb(this.zzc, zztrVar));
    }
}
