package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td  reason: default package */
/* loaded from: classes.dex */
public final class td implements me0, hh7, AutoCloseable {
    public final bf0 A;
    public final CameraExtensionSession B;
    public final id0 L;
    public final Executor R;
    public final ww X;
    public final HashMap Y;

    /* JADX WARN: Type inference failed for: r1v2, types: [ww, java.lang.Object] */
    public td(rd rdVar, CameraExtensionSession cameraExtensionSession, id0 id0Var, pi piVar) {
        rdVar.getClass();
        id0Var.getClass();
        piVar.getClass();
        this.A = rdVar;
        this.B = cameraExtensionSession;
        this.L = id0Var;
        this.R = piVar;
        uw uwVar = ig0.a;
        uwVar.getClass();
        uw.b.incrementAndGet(uwVar);
        ?? obj = new Object();
        obj.a = 0L;
        this.X = obj;
        this.Y = new HashMap();
    }

    @Override // defpackage.me0
    public final boolean E() {
        return false;
    }

    @Override // defpackage.me0
    public final bf0 L() {
        return this.A;
    }

    @Override // defpackage.me0
    public final Integer Q(ArrayList arrayList, vc0 vc0Var) {
        arrayList.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d0((CaptureRequest) obj, vc0Var);
        }
        return null;
    }

    @Override // defpackage.me0
    public final boolean V(List list) {
        Log.w("CXCP", "CameraExtensionSession does not support finalizeOutputConfigurations()");
        return false;
    }

    @Override // defpackage.me0
    public final boolean W() {
        jg7 jg7Var;
        String h = this.A.h();
        try {
            this.B.stopRepeating();
            jg7Var = jg7.a;
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            id0 id0Var = this.L;
            if (z) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                int i = 3;
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
                }
                id0Var.a(h, i, true);
            } else if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                if (e instanceof IllegalStateException) {
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                } else {
                    throw e;
                }
            } else {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                id0Var.a(h, 9, false);
            }
            jg7Var = null;
        }
        if (jg7Var == null) {
            return false;
        }
        return true;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.B.close();
    }

    @Override // defpackage.me0
    public final Integer d0(CaptureRequest captureRequest, vc0 vc0Var) {
        captureRequest.getClass();
        String h = this.A.h();
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.B;
            Executor executor = this.R;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.capture(captureRequest, executor, new sd(this, vc0Var)) : cameraExtensionSession.capture(captureRequest, executor, new sd(this, vc0Var, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            id0 id0Var = this.L;
            if (z) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                if (reason != 1) {
                    if (reason != 2) {
                        if (reason != 3) {
                            if (reason != 4) {
                                if (reason != 5) {
                                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i2 = 11;
                                } else {
                                    i2 = 2;
                                }
                            } else {
                                i2 = 1;
                            }
                        }
                    } else {
                        i2 = 6;
                    }
                } else {
                    i2 = 3;
                }
                id0Var.a(h, i2, true);
                return null;
            } else if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                if (e instanceof IllegalStateException) {
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                throw e;
            } else {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                id0Var.a(h, 9, false);
                return null;
            }
        }
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        if (ar0Var.equals(gh5.a(ma.B()))) {
            return this.B;
        }
        return null;
    }

    @Override // defpackage.me0
    public final Surface getInputSurface() {
        return null;
    }

    @Override // defpackage.me0
    public final Integer i(CaptureRequest captureRequest, vc0 vc0Var) {
        captureRequest.getClass();
        String h = this.A.h();
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.B;
            Executor executor = this.R;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.setRepeatingRequest(captureRequest, executor, new sd(this, vc0Var)) : cameraExtensionSession.setRepeatingRequest(captureRequest, executor, new sd(this, vc0Var, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            id0 id0Var = this.L;
            if (z) {
                Log.w("CXCP", "Failed to execute call: Camera encountered an error: " + e.getMessage());
                CameraAccessException cameraAccessException = (CameraAccessException) e;
                int reason = cameraAccessException.getReason();
                if (reason != 1) {
                    if (reason != 2) {
                        if (reason != 3) {
                            if (reason != 4) {
                                if (reason != 5) {
                                    Log.w("CXCP", "Unexpected CameraAccessException: " + cameraAccessException);
                                    i2 = 11;
                                } else {
                                    i2 = 2;
                                }
                            } else {
                                i2 = 1;
                            }
                        }
                    } else {
                        i2 = 6;
                    }
                } else {
                    i2 = 3;
                }
                id0Var.a(h, i2, true);
                return null;
            } else if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                if (e instanceof IllegalStateException) {
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                throw e;
            } else {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                id0Var.a(h, 9, false);
                return null;
            }
        }
    }

    @Override // defpackage.me0
    public final Integer o(ArrayList arrayList, vc0 vc0Var) {
        arrayList.getClass();
        if (arrayList.size() == 1) {
            return i((CaptureRequest) gt0.b1(arrayList), vc0Var);
        }
        i.m("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
        return null;
    }
}
