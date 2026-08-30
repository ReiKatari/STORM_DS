package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ad  reason: default package */
/* loaded from: classes.dex */
public class ad implements dc0 {
    public final sc0 A;
    public final CameraCaptureSession B;
    public final ab0 L;
    public final Handler R;

    public ad(sc0 sc0Var, CameraCaptureSession cameraCaptureSession, ab0 ab0Var, Handler handler) {
        sc0Var.getClass();
        ab0Var.getClass();
        handler.getClass();
        this.A = sc0Var;
        this.B = cameraCaptureSession;
        this.L = ab0Var;
        this.R = handler;
        cw cwVar = zd0.a;
        cwVar.getClass();
        cw.b.incrementAndGet(cwVar);
    }

    @Override // defpackage.dc0
    public final boolean A() {
        double d;
        o27 o27Var;
        StringBuilder sb = new StringBuilder("CXCP#stopRepeating-");
        sc0 sc0Var = this.A;
        sb.append(sc0Var.w());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String w = sc0Var.w();
            ab0 ab0Var = this.L;
            try {
                this.B.stopRepeating();
                o27Var = o27.a;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
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
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (e instanceof IllegalStateException) {
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            } else {
                                throw e;
                            }
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        ab0Var.a(w, 9, false);
                    }
                    o27Var = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
            if (o27Var != null) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.dc0
    public final boolean U() {
        double d;
        o27 o27Var;
        StringBuilder sb = new StringBuilder("CXCP#abortCaptures-");
        sc0 sc0Var = this.A;
        sb.append(sc0Var.w());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String w = sc0Var.w();
            ab0 ab0Var = this.L;
            try {
                this.B.abortCaptures();
                o27Var = o27.a;
                d = 1000000.0d;
            } catch (Exception e) {
                d = 1000000.0d;
                try {
                    if (e instanceof CameraAccessException) {
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
                    } else {
                        if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                            if (e instanceof IllegalStateException) {
                                Log.d("CXCP", "Failed to execute call: Camera may be closed");
                            } else {
                                throw e;
                            }
                        }
                        Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                        ab0Var.a(w, 9, false);
                    }
                    o27Var = null;
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
                    throw th;
                }
            }
            Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
            if (o27Var != null) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.dc0
    public final Integer X(CaptureRequest captureRequest, na0 na0Var) {
        double d;
        Integer num;
        captureRequest.getClass();
        StringBuilder sb = new StringBuilder("CXCP#capture-");
        sc0 sc0Var = this.A;
        sb.append(sc0Var.w());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String w = sc0Var.w();
            ab0 ab0Var = this.L;
            try {
                d = 1000000.0d;
                try {
                    try {
                        num = Integer.valueOf(this.B.capture(captureRequest, na0Var, this.R));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                                    }
                                } else {
                                    i = 6;
                                }
                            } else {
                                i = 3;
                            }
                            ab0Var.a(w, i, true);
                        } else {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (e instanceof IllegalStateException) {
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                } else {
                                    throw e;
                                }
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            ab0Var.a(w, 9, false);
                        }
                        num = null;
                        Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
                        return num;
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
            return num;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
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
        return this.B.getInputSurface();
    }

    @Override // defpackage.dc0
    public final Integer k(CaptureRequest captureRequest, na0 na0Var) {
        double d;
        Integer num;
        captureRequest.getClass();
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingRequest-");
        sc0 sc0Var = this.A;
        sb.append(sc0Var.w());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String w = sc0Var.w();
            ab0 ab0Var = this.L;
            try {
                d = 1000000.0d;
                try {
                    try {
                        num = Integer.valueOf(this.B.setRepeatingRequest(captureRequest, na0Var, this.R));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                                    }
                                } else {
                                    i = 6;
                                }
                            } else {
                                i = 3;
                            }
                            ab0Var.a(w, i, true);
                        } else {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (e instanceof IllegalStateException) {
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                } else {
                                    throw e;
                                }
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            ab0Var.a(w, 9, false);
                        }
                        num = null;
                        Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
                        return num;
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
            return num;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.dc0
    public final Integer o(ArrayList arrayList, na0 na0Var) {
        double d;
        Integer num;
        arrayList.getClass();
        StringBuilder sb = new StringBuilder("CXCP#captureBurst-");
        sc0 sc0Var = this.A;
        sb.append(sc0Var.w());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String w = sc0Var.w();
            ab0 ab0Var = this.L;
            try {
                d = 1000000.0d;
                try {
                    try {
                        num = Integer.valueOf(this.B.captureBurst(arrayList, na0Var, this.R));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                                    }
                                } else {
                                    i = 6;
                                }
                            } else {
                                i = 3;
                            }
                            ab0Var.a(w, i, true);
                        } else {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (e instanceof IllegalStateException) {
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                } else {
                                    throw e;
                                }
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            ab0Var.a(w, 9, false);
                        }
                        num = null;
                        Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
                        return num;
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
            return num;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    @Override // defpackage.m37
    public Object p(qo0 qo0Var) {
        if (qo0Var.equals(q75.a(CameraCaptureSession.class))) {
            return this.B;
        }
        return null;
    }

    @Override // defpackage.dc0
    public final Integer y(ArrayList arrayList, na0 na0Var) {
        double d;
        Integer num;
        arrayList.getClass();
        StringBuilder sb = new StringBuilder("CXCP#setRepeatingBurst-");
        sc0 sc0Var = this.A;
        sb.append(sc0Var.w());
        String sb2 = sb.toString();
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            Trace.beginSection(sb2);
            String w = sc0Var.w();
            ab0 ab0Var = this.L;
            try {
                d = 1000000.0d;
                try {
                    try {
                        num = Integer.valueOf(this.B.setRepeatingBurst(arrayList, na0Var, this.R));
                    } catch (Exception e) {
                        e = e;
                        int i = 0;
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
                                    }
                                } else {
                                    i = 6;
                                }
                            } else {
                                i = 3;
                            }
                            ab0Var.a(w, i, true);
                        } else {
                            if (!(e instanceof IllegalArgumentException) && !(e instanceof SecurityException) && !(e instanceof UnsupportedOperationException) && !(e instanceof NullPointerException)) {
                                if (e instanceof IllegalStateException) {
                                    Log.d("CXCP", "Failed to execute call: Camera may be closed");
                                } else {
                                    throw e;
                                }
                            }
                            Log.w("CXCP", "Failed to execute call: Unexpected exception: " + e.getMessage());
                            ab0Var.a(w, 9, false);
                        }
                        num = null;
                        Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
                        return num;
                    }
                } catch (Throwable th) {
                    th = th;
                    Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                d = 1000000.0d;
            }
            Log.d("CXCP", b31.r(new Object[]{Double.valueOf(b31.d(elapsedRealtimeNanos) / d)}, 1, null, "%.3f ms", b31.t(sb2, " - ")));
            return num;
        } catch (Throwable th2) {
            th = th2;
            d = 1000000.0d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean z(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad.z(java.util.List):boolean");
    }
}
