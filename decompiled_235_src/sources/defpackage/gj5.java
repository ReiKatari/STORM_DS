package defpackage;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gj5  reason: default package */
/* loaded from: classes.dex */
public abstract class gj5 {
    private final String zza = "com.google.android.gms.common.ui.SignInButtonCreatorImpl";
    private Object zzb;

    public abstract Object getRemoteCreator(IBinder iBinder);

    public final Object getRemoteCreatorInstance(Context context) {
        if (this.zzb == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext != null) {
                try {
                    this.zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
                } catch (ClassNotFoundException e) {
                    throw new Exception("Could not load creator class.", e);
                } catch (IllegalAccessException e2) {
                    throw new Exception("Could not access creator.", e2);
                } catch (InstantiationException e3) {
                    throw new Exception("Could not instantiate creator.", e3);
                }
            } else {
                throw new Exception("Could not get remote context.");
            }
        }
        return this.zzb;
    }
}
