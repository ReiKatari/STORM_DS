package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ua0  reason: default package */
/* loaded from: classes.dex */
public final class ua0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ wa0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua0(String str, wa0 wa0Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = str;
        this.Z = wa0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((ua0) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((ua0) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        wa0 wa0Var = this.Z;
        String str = this.Y;
        switch (i) {
            case 0:
                return new ua0(str, wa0Var, j11Var, 0);
            default:
                return new ua0(str, wa0Var, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i;
        Boolean bool;
        int i2;
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        int i3;
        boolean isCameraDeviceSetupSupported;
        int i4 = this.X;
        wa0 wa0Var = this.Z;
        String str = this.Y;
        switch (i4) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                Log.d("CXCP", "Initializing CameraDeviceSetupCompat for " + ((Object) od0.b(str)));
                ab0 ab0Var = wa0Var.c;
                try {
                    rc0 rc0Var = (rc0) wa0Var.l.getValue();
                    rc0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    da0 da0Var = rc0Var.a;
                    if (da0Var != null) {
                        arrayList.add(new lb(da0Var.a, str));
                    }
                    da0 da0Var2 = rc0Var.b;
                    if (da0Var2 != null) {
                        try {
                            arrayList.add(new lb(da0Var2.a, str));
                        } catch (UnsupportedOperationException unused) {
                        }
                    }
                    return new lb(arrayList);
                } catch (Exception e) {
                    if (e instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                        CameraAccessException cameraAccessException = (CameraAccessException) e;
                        int reason = cameraAccessException.getReason();
                        if (reason != 1) {
                            if (reason != 2) {
                                if (reason != 3) {
                                    if (reason != 4) {
                                        if (reason != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                            i = 11;
                                        } else {
                                            i = 2;
                                        }
                                    } else {
                                        i = 1;
                                    }
                                } else {
                                    i = 0;
                                }
                            } else {
                                i = 6;
                            }
                        } else {
                            i = 3;
                        }
                        ab0Var.a(str, i, true);
                    } else if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        if (e instanceof IllegalStateException) {
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        } else {
                            throw e;
                        }
                    } else {
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        ab0Var.a(str, 9, false);
                    }
                    return null;
                }
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                fw4 fw4Var = wa0Var.a;
                ab0 ab0Var2 = wa0Var.c;
                try {
                    isCameraDeviceSetupSupported = ((CameraManager) fw4Var.get()).isCameraDeviceSetupSupported(str);
                    bool = Boolean.valueOf(isCameraDeviceSetupSupported);
                } catch (Exception e2) {
                    if (e2 instanceof CameraAccessException) {
                        Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e2.getMessage());
                        CameraAccessException cameraAccessException2 = (CameraAccessException) e2;
                        int reason2 = cameraAccessException2.getReason();
                        if (reason2 != 1) {
                            if (reason2 != 2) {
                                if (reason2 != 3) {
                                    if (reason2 != 4) {
                                        if (reason2 != 5) {
                                            Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException2);
                                            i2 = 11;
                                        } else {
                                            i2 = 2;
                                        }
                                    } else {
                                        i2 = 1;
                                    }
                                } else {
                                    i2 = 0;
                                }
                            } else {
                                i2 = 6;
                            }
                        } else {
                            i2 = 3;
                        }
                        ab0Var2.a(str, i2, true);
                    } else if (!(e2 instanceof IllegalArgumentException) && !(e2 instanceof SecurityException) && !(e2 instanceof UnsupportedOperationException) && !(e2 instanceof NullPointerException)) {
                        if (e2 instanceof IllegalStateException) {
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        } else {
                            throw e2;
                        }
                    } else {
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e2.getMessage());
                        ab0Var2.a(str, 9, false);
                    }
                    bool = null;
                }
                if (b53.x(bool, Boolean.TRUE)) {
                    Log.d("CXCP", "Initializing CameraDeviceSetup for " + ((Object) od0.b(str)));
                    try {
                        cameraDeviceSetup = ((CameraManager) fw4Var.get()).getCameraDeviceSetup(str);
                    } catch (Exception e3) {
                        if (e3 instanceof CameraAccessException) {
                            Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e3.getMessage());
                            CameraAccessException cameraAccessException3 = (CameraAccessException) e3;
                            int reason3 = cameraAccessException3.getReason();
                            if (reason3 != 1) {
                                if (reason3 != 2) {
                                    if (reason3 != 3) {
                                        if (reason3 != 4) {
                                            if (reason3 != 5) {
                                                Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException3);
                                                i3 = 11;
                                            } else {
                                                i3 = 2;
                                            }
                                        } else {
                                            i3 = 1;
                                        }
                                    } else {
                                        i3 = 0;
                                    }
                                } else {
                                    i3 = 6;
                                }
                            } else {
                                i3 = 3;
                            }
                            ab0Var2.a(str, i3, true);
                        } else if (!(e3 instanceof IllegalArgumentException) && !(e3 instanceof SecurityException) && !(e3 instanceof UnsupportedOperationException) && !(e3 instanceof NullPointerException)) {
                            if (e3 instanceof IllegalStateException) {
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            } else {
                                throw e3;
                            }
                        } else {
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e3.getMessage());
                            ab0Var2.a(str, 9, false);
                        }
                        cameraDeviceSetup = null;
                    }
                    if (cameraDeviceSetup != null) {
                        return new za0(cameraDeviceSetup, str, ab0Var2);
                    }
                }
                return null;
        }
    }
}
