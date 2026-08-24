package com.google.android.gms.common;

import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* loaded from: classes.dex */
public class GmsSignatureVerifier {
    private static final zzab zza;
    private static final zzab zzb;
    private static final HashMap zzc;

    static {
        zzz zzzVar = new zzz();
        zzzVar.zzd("com.google.android.gms");
        zzzVar.zza(204200000L);
        zzl zzlVar = zzn.zzd;
        byte[] zzf = zzlVar.zzf();
        byte[] zzf2 = zzn.zzb.zzf();
        q28 q28Var = s28.B;
        Object[] objArr = {zzf, zzf2};
        kt7.b(2, objArr);
        zzzVar.zzc(s28.h(2, objArr));
        zzl zzlVar2 = zzn.zzc;
        Object[] objArr2 = {zzlVar2.zzf(), zzn.zza.zzf()};
        kt7.b(2, objArr2);
        zzzVar.zzb(s28.h(2, objArr2));
        zza = zzzVar.zze();
        zzz zzzVar2 = new zzz();
        zzzVar2.zzd("com.android.vending");
        zzzVar2.zza(82240000L);
        Object[] objArr3 = {zzlVar.zzf()};
        kt7.b(1, objArr3);
        zzzVar2.zzc(s28.h(1, objArr3));
        Object[] objArr4 = {zzlVar2.zzf()};
        kt7.b(1, objArr4);
        zzzVar2.zzb(s28.h(1, objArr4));
        zzb = zzzVar2.zze();
        zzc = new HashMap();
    }
}
