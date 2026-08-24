package com.google.mlkit.common.internal;

import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.mlkit.common.model.CustomRemoteModel;
import com.google.mlkit.common.model.RemoteModelManager;
import com.google.mlkit.common.sdkinternal.Cleaner;
import com.google.mlkit.common.sdkinternal.CloseGuard;
import com.google.mlkit.common.sdkinternal.ExecutorSelector;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.MlKitThreadPool;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import com.google.mlkit.common.sdkinternal.model.ModelFileHelper;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CommonComponentRegistrar implements tv0 {
    public static final /* synthetic */ int zza = 0;

    @Override // defpackage.tv0
    public final List getComponents() {
        bv0 bv0Var = SharedPrefManager.COMPONENT;
        dk0 a = bv0.a(ModelFileHelper.class);
        a.b(new wh1(1, 0, MlKitContext.class));
        a.B = new sv0() { // from class: com.google.mlkit.common.internal.zza
            @Override // defpackage.sv0
            public final Object create(ov0 ov0Var) {
                return new ModelFileHelper((MlKitContext) ov0Var.a(MlKitContext.class));
            }
        };
        bv0 j = a.j();
        dk0 a2 = bv0.a(MlKitThreadPool.class);
        a2.B = new sv0() { // from class: com.google.mlkit.common.internal.zzb
            @Override // defpackage.sv0
            public final Object create(ov0 ov0Var) {
                return new MlKitThreadPool();
            }
        };
        bv0 j2 = a2.j();
        dk0 a3 = bv0.a(RemoteModelManager.class);
        a3.b(new wh1(2, 0, RemoteModelManager.RemoteModelManagerRegistration.class));
        a3.B = new sv0() { // from class: com.google.mlkit.common.internal.zzc
            @Override // defpackage.sv0
            public final Object create(ov0 ov0Var) {
                return new RemoteModelManager(ov0Var.d(RemoteModelManager.RemoteModelManagerRegistration.class));
            }
        };
        bv0 j3 = a3.j();
        dk0 a4 = bv0.a(ExecutorSelector.class);
        a4.b(new wh1(1, 1, MlKitThreadPool.class));
        a4.B = new sv0() { // from class: com.google.mlkit.common.internal.zzd
            @Override // defpackage.sv0
            public final Object create(ov0 ov0Var) {
                return new ExecutorSelector(ov0Var.b(MlKitThreadPool.class));
            }
        };
        bv0 j4 = a4.j();
        dk0 a5 = bv0.a(Cleaner.class);
        a5.B = new sv0() { // from class: com.google.mlkit.common.internal.zze
            @Override // defpackage.sv0
            public final Object create(ov0 ov0Var) {
                return Cleaner.create();
            }
        };
        bv0 j5 = a5.j();
        dk0 a6 = bv0.a(CloseGuard.Factory.class);
        a6.b(new wh1(1, 0, Cleaner.class));
        a6.B = new sv0() { // from class: com.google.mlkit.common.internal.zzf
            @Override // defpackage.sv0
            public final Object create(ov0 ov0Var) {
                return new CloseGuard.Factory((Cleaner) ov0Var.a(Cleaner.class));
            }
        };
        bv0 j6 = a6.j();
        dk0 a7 = bv0.a(com.google.mlkit.common.internal.model.zzg.class);
        a7.b(new wh1(1, 0, MlKitContext.class));
        a7.B = new sv0() { // from class: com.google.mlkit.common.internal.zzg
            @Override // defpackage.sv0
            public final Object create(ov0 ov0Var) {
                return new com.google.mlkit.common.internal.model.zzg((MlKitContext) ov0Var.a(MlKitContext.class));
            }
        };
        bv0 j7 = a7.j();
        dk0 a8 = bv0.a(RemoteModelManager.RemoteModelManagerRegistration.class);
        a8.L = 1;
        a8.b(new wh1(1, 1, com.google.mlkit.common.internal.model.zzg.class));
        a8.B = new sv0() { // from class: com.google.mlkit.common.internal.zzh
            @Override // defpackage.sv0
            public final Object create(ov0 ov0Var) {
                return new RemoteModelManager.RemoteModelManagerRegistration(CustomRemoteModel.class, ov0Var.b(com.google.mlkit.common.internal.model.zzg.class));
            }
        };
        return zzaf.zzi(bv0Var, j, j2, j3, j4, j5, j6, j7, a8.j());
    }
}
