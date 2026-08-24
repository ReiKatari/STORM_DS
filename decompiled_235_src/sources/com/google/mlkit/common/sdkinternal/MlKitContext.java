package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MlKitContext {
    private static final Object zza = new Object();
    private static MlKitContext zzb;
    private xv0 zzc;

    private MlKitContext() {
    }

    public static MlKitContext getInstance() {
        boolean z;
        MlKitContext mlKitContext;
        synchronized (zza) {
            if (zzb != null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "MlKitContext has not been initialized");
            mlKitContext = (MlKitContext) Preconditions.checkNotNull(zzb);
        }
        return mlKitContext;
    }

    public static MlKitContext initialize(Context context, List<tv0> list) {
        boolean z;
        MlKitContext mlKitContext;
        synchronized (zza) {
            try {
                int i = 0;
                if (zzb == null) {
                    z = true;
                } else {
                    z = false;
                }
                Preconditions.checkState(z, "MlKitContext is already initialized");
                MlKitContext mlKitContext2 = new MlKitContext();
                zzb = mlKitContext2;
                Context zzc = zzc(context);
                HashMap hashMap = new HashMap();
                for (tv0 tv0Var : list) {
                    hashMap.put(tv0Var.getClass(), tv0Var);
                }
                ArrayList arrayList = new ArrayList(hashMap.values());
                Executor executor = TaskExecutors.MAIN_THREAD;
                bv0[] bv0VarArr = {bv0.b(zzc, Context.class, new Class[0]), bv0.b(mlKitContext2, MlKitContext.class, new Class[0])};
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    arrayList2.add(new rv0((tv0) obj, 1));
                }
                xv0 xv0Var = new xv0(executor, arrayList2, Arrays.asList(bv0VarArr));
                mlKitContext2.zzc = xv0Var;
                xv0Var.M0();
                mlKitContext = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mlKitContext;
    }

    public static MlKitContext initializeIfNeeded(Context context) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = zza(context);
            }
        }
        return mlKitContext;
    }

    public static MlKitContext zza(Context context) {
        MlKitContext zzb2;
        synchronized (zza) {
            zzb2 = zzb(context, TaskExecutors.MAIN_THREAD);
        }
        return zzb2;
    }

    public static MlKitContext zzb(Context context, Executor executor) {
        boolean z;
        MlKitContext mlKitContext;
        synchronized (zza) {
            if (zzb == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "MlKitContext is already initialized");
            MlKitContext mlKitContext2 = new MlKitContext();
            zzb = mlKitContext2;
            Context zzc = zzc(context);
            ArrayList a = new u2(zzc, new d90(28)).a();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.addAll(a);
            arrayList2.add(bv0.b(zzc, Context.class, new Class[0]));
            arrayList2.add(bv0.b(mlKitContext2, MlKitContext.class, new Class[0]));
            xv0 xv0Var = new xv0(executor, arrayList, arrayList2);
            mlKitContext2.zzc = xv0Var;
            xv0Var.M0();
            mlKitContext = zzb;
        }
        return mlKitContext;
    }

    private static Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }

    public <T> T get(Class<T> cls) {
        boolean z;
        if (zzb == this) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.zzc);
        return (T) this.zzc.a(cls);
    }

    public Context getApplicationContext() {
        return (Context) get(Context.class);
    }

    public static MlKitContext initializeIfNeeded(Context context, List<tv0> list) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = initialize(context, list);
            }
        }
        return mlKitContext;
    }

    public static MlKitContext initializeIfNeeded(Context context, Executor executor) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = zzb(context, executor);
            }
        }
        return mlKitContext;
    }
}
