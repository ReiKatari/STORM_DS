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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fd  reason: default package */
/* loaded from: classes.dex */
public final class fd implements dc0, m37, AutoCloseable {
    public final sc0 A;
    public final CameraExtensionSession B;
    public final ab0 L;
    public final Executor R;
    public final ew X;
    public final HashMap Y;

    /* JADX WARN: Type inference failed for: r1v2, types: [ew, java.lang.Object] */
    public fd(cd cdVar, CameraExtensionSession cameraExtensionSession, ab0 ab0Var, di diVar) {
        cdVar.getClass();
        ab0Var.getClass();
        diVar.getClass();
        this.A = cdVar;
        this.B = cameraExtensionSession;
        this.L = ab0Var;
        this.R = diVar;
        cw cwVar = zd0.a;
        cwVar.getClass();
        cw.b.incrementAndGet(cwVar);
        ?? obj = new Object();
        obj.a = 0L;
        this.X = obj;
        this.Y = new HashMap();
    }

    @Override // defpackage.dc0
    public final boolean A() {
        o27 o27Var;
        String w = this.A.w();
        try {
            this.B.stopRepeating();
            o27Var = o27.a;
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            ab0 ab0Var = this.L;
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
                ab0Var.a(w, i, true);
            } else if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                if (e instanceof IllegalStateException) {
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                } else {
                    throw e;
                }
            } else {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                ab0Var.a(w, 9, false);
            }
            o27Var = null;
        }
        if (o27Var == null) {
            return false;
        }
        return true;
    }

    @Override // defpackage.dc0
    public final boolean U() {
        return false;
    }

    @Override // defpackage.dc0
    public final Integer X(CaptureRequest captureRequest, na0 na0Var) {
        captureRequest.getClass();
        String w = this.A.w();
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.B;
            Executor executor = this.R;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.capture(captureRequest, executor, new ed(this, na0Var)) : cameraExtensionSession.capture(captureRequest, executor, new ed(this, na0Var, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            ab0 ab0Var = this.L;
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
                ab0Var.a(w, i2, true);
                return null;
            } else if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                if (e instanceof IllegalStateException) {
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                throw e;
            } else {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                ab0Var.a(w, 9, false);
                return null;
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.B.close();
    }

    @Override // defpackage.dc0
    public final sc0 g0() {
        return this.A;
    }

    @Override // defpackage.dc0
    public final Surface getInputSurface() {
        return null;
    }

    @Override // defpackage.dc0
    public final Integer k(CaptureRequest captureRequest, na0 na0Var) {
        captureRequest.getClass();
        String w = this.A.w();
        try {
            int i = Build.VERSION.SDK_INT;
            CameraExtensionSession cameraExtensionSession = this.B;
            Executor executor = this.R;
            return Integer.valueOf(i >= 33 ? cameraExtensionSession.setRepeatingRequest(captureRequest, executor, new ed(this, na0Var)) : cameraExtensionSession.setRepeatingRequest(captureRequest, executor, new ed(this, na0Var, new LinkedHashMap())));
        } catch (Exception e) {
            boolean z = e instanceof CameraAccessException;
            int i2 = 0;
            ab0 ab0Var = this.L;
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
                ab0Var.a(w, i2, true);
                return null;
            } else if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                if (e instanceof IllegalStateException) {
                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                    return null;
                }
                throw e;
            } else {
                Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                ab0Var.a(w, 9, false);
                return null;
            }
        }
    }

    @Override // defpackage.dc0
    public final Integer o(ArrayList arrayList, na0 na0Var) {
        arrayList.getClass();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            X((CaptureRequest) obj, na0Var);
        }
        return null;
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        if (qo0Var.equals(q75.a(dd.B()))) {
            return this.B;
        }
        return null;
    }

    @Override // defpackage.dc0
    public final Integer y(ArrayList arrayList, na0 na0Var) {
        arrayList.getClass();
        if (arrayList.size() == 1) {
            return k((CaptureRequest) tq0.e1(arrayList), na0Var);
        }
        i.n("CameraExtensionSession does not support setRepeatingBurst for more than oneCaptureRequest");
        return null;
    }

    @Override // defpackage.dc0
    public final boolean z(List list) {
        Log.w("CXCP", "CameraExtensionSession does not support finalizeOutputConfigurations()");
        return false;
    }
}
