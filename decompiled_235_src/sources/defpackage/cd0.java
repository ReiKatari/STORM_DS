package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.util.Log;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd0  reason: default package */
/* loaded from: classes.dex */
public final class cd0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ ed0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cd0(String str, ed0 ed0Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = str;
        this.Z = ed0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((cd0) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((cd0) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        ed0 ed0Var = this.Z;
        String str = this.Y;
        switch (i) {
            case 0:
                return new cd0(str, ed0Var, r41Var, 0);
            default:
                return new cd0(str, ed0Var, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i;
        Boolean bool;
        int i2;
        CameraDevice.CameraDeviceSetup cameraDeviceSetup;
        int i3;
        boolean isCameraDeviceSetupSupported;
        int i4 = this.X;
        ed0 ed0Var = this.Z;
        String str = this.Y;
        switch (i4) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                Log.d("CXCP", "Initializing CameraDeviceSetupCompat for " + ((Object) xf0.b(str)));
                id0 id0Var = ed0Var.c;
                try {
                    af0 af0Var = (af0) ed0Var.l.getValue();
                    af0Var.getClass();
                    ArrayList arrayList = new ArrayList();
                    lc0 lc0Var = af0Var.a;
                    if (lc0Var != null) {
                        arrayList.add(new rb(lc0Var.a, str));
                    }
                    lc0 lc0Var2 = af0Var.b;
                    if (lc0Var2 != null) {
                        try {
                            arrayList.add(new rb(lc0Var2.a, str));
                        } catch (UnsupportedOperationException unused) {
                        }
                    }
                    return new rb(arrayList);
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
                        id0Var.a(str, i, true);
                    } else if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                        if (e instanceof IllegalStateException) {
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        } else {
                            throw e;
                        }
                    } else {
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        id0Var.a(str, 9, false);
                    }
                    return null;
                }
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                n55 n55Var = ed0Var.a;
                id0 id0Var2 = ed0Var.c;
                try {
                    isCameraDeviceSetupSupported = ((CameraManager) n55Var.get()).isCameraDeviceSetupSupported(str);
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
                        id0Var2.a(str, i2, true);
                    } else if (!(e2 instanceof IllegalArgumentException) && !(e2 instanceof SecurityException) && !(e2 instanceof UnsupportedOperationException) && !(e2 instanceof NullPointerException)) {
                        if (e2 instanceof IllegalStateException) {
                            Log.d("CXCP", "Failed to execute call: Camera may be closed");
                        } else {
                            throw e2;
                        }
                    } else {
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e2.getMessage());
                        id0Var2.a(str, 9, false);
                    }
                    bool = null;
                }
                if (nb3.k(bool, Boolean.TRUE)) {
                    Log.d("CXCP", "Initializing CameraDeviceSetup for " + ((Object) xf0.b(str)));
                    try {
                        cameraDeviceSetup = ((CameraManager) n55Var.get()).getCameraDeviceSetup(str);
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
                            id0Var2.a(str, i3, true);
                        } else if (!(e3 instanceof IllegalArgumentException) && !(e3 instanceof SecurityException) && !(e3 instanceof UnsupportedOperationException) && !(e3 instanceof NullPointerException)) {
                            if (e3 instanceof IllegalStateException) {
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            } else {
                                throw e3;
                            }
                        } else {
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e3.getMessage());
                            id0Var2.a(str, 9, false);
                        }
                        cameraDeviceSetup = null;
                    }
                    if (cameraDeviceSetup != null) {
                        return new hd0(cameraDeviceSetup, str, id0Var2);
                    }
                }
                return null;
        }
    }
}
