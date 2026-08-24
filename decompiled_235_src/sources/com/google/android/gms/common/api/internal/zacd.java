package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zacd implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    public zacd(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
        this.zae = j2;
    }

    public static zacd zaa(GoogleApiManager googleApiManager, int i, ApiKey apiKey) {
        boolean z;
        long j;
        if (googleApiManager.zaD()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if (config != null) {
                if (config.getMethodInvocationTelemetryEnabled()) {
                    z = config.getMethodTimingTelemetryEnabled();
                    zabq zai = googleApiManager.zai(apiKey);
                    if (zai != null) {
                        if (zai.zaf() instanceof BaseGmsClient) {
                            BaseGmsClient baseGmsClient = (BaseGmsClient) zai.zaf();
                            if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                                ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, i);
                                if (zab != null) {
                                    zai.zaq();
                                    z = zab.getMethodTimingTelemetryEnabled();
                                } else {
                                    return null;
                                }
                            }
                        } else {
                            return null;
                        }
                    }
                } else {
                    return null;
                }
            } else {
                z = true;
            }
            long j2 = 0;
            if (z) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            if (z) {
                j2 = SystemClock.elapsedRealtime();
            }
            return new zacd(googleApiManager, i, apiKey, j, j2, null, null);
        }
        return null;
    }

    private static ConnectionTelemetryConfiguration zab(zabq zabqVar, BaseGmsClient baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zabq zai;
        boolean z;
        int i;
        int i2;
        int i3;
        int errorCode;
        long j;
        long j2;
        if (this.zaa.zaD()) {
            RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
            if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zai = this.zaa.zai(this.zac)) != null && (zai.zaf() instanceof BaseGmsClient)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) zai.zaf();
                boolean z2 = true;
                int i4 = 0;
                if (this.zad > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int gCoreServiceId = baseGmsClient.getGCoreServiceId();
                int i5 = 100;
                if (config != null) {
                    z &= config.getMethodTimingTelemetryEnabled();
                    int batchPeriodMillis = config.getBatchPeriodMillis();
                    int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                    i = config.getVersion();
                    if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                        ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, this.zab);
                        if (zab != null) {
                            if (!zab.getMethodTimingTelemetryEnabled() || this.zad <= 0) {
                                z2 = false;
                            }
                            maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                            z = z2;
                        } else {
                            return;
                        }
                    }
                    i3 = batchPeriodMillis;
                    i2 = maxMethodInvocationsInBatch;
                } else {
                    i = 0;
                    i2 = 100;
                    i3 = 5000;
                }
                GoogleApiManager googleApiManager = this.zaa;
                int i6 = -1;
                if (task.isSuccessful()) {
                    errorCode = 0;
                } else {
                    if (!task.isCanceled()) {
                        Exception exception = task.getException();
                        if (exception instanceof ApiException) {
                            Status status = ((ApiException) exception).getStatus();
                            i5 = status.getStatusCode();
                            ConnectionResult connectionResult = status.getConnectionResult();
                            if (connectionResult != null) {
                                errorCode = connectionResult.getErrorCode();
                                i4 = i5;
                            }
                        } else {
                            i4 = MlKitException.NOT_ENOUGH_SPACE;
                            errorCode = -1;
                        }
                    }
                    i4 = i5;
                    errorCode = -1;
                }
                if (z) {
                    long j3 = this.zad;
                    long j4 = this.zae;
                    long currentTimeMillis = System.currentTimeMillis();
                    i6 = (int) (SystemClock.elapsedRealtime() - j4);
                    j2 = currentTimeMillis;
                    j = j3;
                } else {
                    j = 0;
                    j2 = 0;
                }
                googleApiManager.zaw(new MethodInvocation(this.zab, i4, errorCode, j, j2, null, null, gCoreServiceId, i6), i, i3, i2);
            }
        }
    }
}
