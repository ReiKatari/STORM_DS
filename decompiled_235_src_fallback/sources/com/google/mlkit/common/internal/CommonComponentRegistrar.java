package com.google.mlkit.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements defpackage.tv0 {
    public static final /* synthetic */ int zza = 0;

    public CommonComponentRegistrar() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.tv0
    public final java.util.List getComponents() {
            r13 = this;
            bv0 r0 = com.google.mlkit.common.sdkinternal.SharedPrefManager.COMPONENT
            java.lang.Class<com.google.mlkit.common.sdkinternal.model.ModelFileHelper> r13 = com.google.mlkit.common.sdkinternal.model.ModelFileHelper.class
            dk0 r13 = defpackage.bv0.a(r13)
            wh1 r1 = new wh1
            r2 = 1
            r3 = 0
            java.lang.Class<com.google.mlkit.common.sdkinternal.MlKitContext> r4 = com.google.mlkit.common.sdkinternal.MlKitContext.class
            r1.<init>(r2, r3, r4)
            r13.b(r1)
            com.google.mlkit.common.internal.zza r1 = new com.google.mlkit.common.internal.zza
            r1.<init>()
            r13.B = r1
            bv0 r1 = r13.j()
            java.lang.Class<com.google.mlkit.common.sdkinternal.MlKitThreadPool> r13 = com.google.mlkit.common.sdkinternal.MlKitThreadPool.class
            dk0 r5 = defpackage.bv0.a(r13)
            com.google.mlkit.common.internal.zzb r6 = new com.google.mlkit.common.internal.zzb
            r6.<init>()
            r5.B = r6
            bv0 r5 = r5.j()
            java.lang.Class<com.google.mlkit.common.model.RemoteModelManager> r6 = com.google.mlkit.common.model.RemoteModelManager.class
            dk0 r6 = defpackage.bv0.a(r6)
            wh1 r7 = new wh1
            r8 = 2
            java.lang.Class<com.google.mlkit.common.model.RemoteModelManager$RemoteModelManagerRegistration> r9 = com.google.mlkit.common.model.RemoteModelManager.RemoteModelManagerRegistration.class
            r7.<init>(r8, r3, r9)
            r6.b(r7)
            com.google.mlkit.common.internal.zzc r7 = new com.google.mlkit.common.internal.zzc
            r7.<init>()
            r6.B = r7
            bv0 r6 = r6.j()
            java.lang.Class<com.google.mlkit.common.sdkinternal.ExecutorSelector> r7 = com.google.mlkit.common.sdkinternal.ExecutorSelector.class
            dk0 r7 = defpackage.bv0.a(r7)
            wh1 r8 = new wh1
            r8.<init>(r2, r2, r13)
            r7.b(r8)
            com.google.mlkit.common.internal.zzd r13 = new com.google.mlkit.common.internal.zzd
            r13.<init>()
            r7.B = r13
            bv0 r13 = r7.j()
            java.lang.Class<com.google.mlkit.common.sdkinternal.Cleaner> r7 = com.google.mlkit.common.sdkinternal.Cleaner.class
            dk0 r8 = defpackage.bv0.a(r7)
            com.google.mlkit.common.internal.zze r10 = new com.google.mlkit.common.internal.zze
            r10.<init>()
            r8.B = r10
            bv0 r8 = r8.j()
            java.lang.Class<com.google.mlkit.common.sdkinternal.CloseGuard$Factory> r10 = com.google.mlkit.common.sdkinternal.CloseGuard.Factory.class
            dk0 r10 = defpackage.bv0.a(r10)
            wh1 r11 = new wh1
            r11.<init>(r2, r3, r7)
            r10.b(r11)
            com.google.mlkit.common.internal.zzf r7 = new com.google.mlkit.common.internal.zzf
            r7.<init>()
            r10.B = r7
            bv0 r7 = r10.j()
            java.lang.Class<com.google.mlkit.common.internal.model.zzg> r10 = com.google.mlkit.common.internal.model.zzg.class
            dk0 r11 = defpackage.bv0.a(r10)
            wh1 r12 = new wh1
            r12.<init>(r2, r3, r4)
            r11.b(r12)
            com.google.mlkit.common.internal.zzg r3 = new com.google.mlkit.common.internal.zzg
            r3.<init>()
            r11.B = r3
            bv0 r3 = r11.j()
            dk0 r4 = defpackage.bv0.a(r9)
            r4.L = r2
            wh1 r9 = new wh1
            r9.<init>(r2, r2, r10)
            r4.b(r9)
            com.google.mlkit.common.internal.zzh r2 = new com.google.mlkit.common.internal.zzh
            r2.<init>()
            r4.B = r2
            bv0 r2 = r4.j()
            r4 = r8
            r8 = r2
            r2 = r5
            r5 = r4
            r4 = r7
            r7 = r3
            r3 = r6
            r6 = r4
            r4 = r13
            com.google.android.gms.internal.mlkit_common.zzaf r13 = com.google.android.gms.internal.mlkit_common.zzaf.zzi(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r13
    }
}
